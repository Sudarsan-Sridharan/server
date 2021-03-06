package org.nasdanika.cdo;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.security.Realm;
import org.nasdanika.core.AuthorizationProvider.AccessDecision;
import org.nasdanika.core.ClassLoadingContext;
import org.nasdanika.core.Context;
import org.nasdanika.core.ContextImpl;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public abstract class CDOViewContextImpl<V extends CDOView, CR> extends ContextImpl implements CDOViewContext<V,CR>, ClassLoadingContext {
	
	/**
	 * @param bundle
	 * @param securityPolicyManager
	 * @param deny If true then default authorization action is DENY (high security).
	 * @throws Exception
	 */
	public CDOViewContextImpl(
			Bundle bundle, 
			AccessDecision defaultAccessDecision,
			CDOViewContextSubject<V, CR> subject,
			Context... chain) throws Exception {
		super(bundle.getBundleContext(), chain);
		this.subject = subject;
		this.bundle = bundle;
		view = openView();
		setDefaultAccessDecision(defaultAccessDecision);
	}
	
	private CDOViewContextSubject<V,CR> subject;
	private Principal authenticatedPrincipal;
	
	@Override
	public CDOViewContextSubject<V, CR> getSubject() throws Exception {
		if (subject == null) {
			Principal principal = getPrincipal();
			if (principal != null) {
				subject = new CDOIDSubject<V,CR>(principal);
			}
		}
		return subject;
	}

	@Override
	public final Principal getPrincipal() throws Exception {
		if (subject!=null) {
			authenticatedPrincipal = subject.getPrincipal(this);
		}

		if (authenticatedPrincipal != null) {
			return authenticatedPrincipal;
		}
		
		Realm<CR> pd = getSecurityRealm();
		return pd == null ? null : pd.getGuest();
	}

	@Override
	public final Principal authenticate(CR credentials) throws Exception {
		Realm<CR> pd = getSecurityRealm();
		if (pd == null) {
			return null;
		}
		authenticatedPrincipal = pd.authenticate(credentials);
		if (subject!=null) {
			subject.setPrincipal(this, authenticatedPrincipal);
		}
		return authenticatedPrincipal;
	}

	@Override
	public final boolean authorize(Object target, String action, String qualifier, Map<String, Object> environment) throws Exception {
		Principal principal = getPrincipal();
		if (principal!=null && target instanceof EObject) {
			AccessDecision accessDecision = principal.authorize(this, (EObject) target, action, qualifier, environment);
			if (!AccessDecision.ABSTAIN.equals(accessDecision)) {
				return AccessDecision.ALLOW.equals(accessDecision);
			}
		}
		return super.authorize(target, action, qualifier, environment);
	}
	
	private V view;
	
	private Bundle bundle;

	protected abstract V openView();

	@Override
	public void close() throws Exception {
		view.close();
		super.close();
	}

	@Override
	public V getView() {
		return view;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T adapt(Class<T> targetType) throws Exception {
		if (targetType.isInstance(bundle)) {
			return (T) bundle;
		}
		BundleContext bc = bundle.getBundleContext();
		if (targetType.isInstance(bc)) {
			return (T) bc;
		}
		
		return super.adapt(targetType);
	}
	
	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		return bundle.loadClass(name);
	}
	
	@Override
	public Iterable<URL> getResources(String name) throws IOException {
		return Collections.<URL>list(bundle.getResources(name));
	}
	
	@Override
	public URL getResource(String name) {
		return bundle.getResource(name);
	}
}
