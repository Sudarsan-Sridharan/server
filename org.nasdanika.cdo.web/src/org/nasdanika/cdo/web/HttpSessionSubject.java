package org.nasdanika.cdo.web;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpSession;

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.transaction.CDOCommitContext;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.transaction.CDOTransactionHandler2;
import org.eclipse.emf.cdo.view.CDOView;
import org.nasdanika.cdo.CDOViewContext;
import org.nasdanika.cdo.CDOViewContextSubject;
import org.nasdanika.cdo.security.LoginPasswordHashUser;
import org.nasdanika.cdo.security.LoginUser;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.security.User;

public class HttpSessionSubject<V extends CDOView, CR> implements CDOViewContextSubject<V, CR> {
	
	// A better approach? A service???
	private static Map<String, Object> ID_MAP = new ConcurrentHashMap<>();

//	static void invalidate(String sessionID) {
//		ID_MAP.remove(sessionID);
//	}
		
	private HttpSession session;
	private String principalName;

	public HttpSessionSubject(HttpSession session, String principalName) {		
		this.session = session;
		this.principalName = principalName;
	}

	protected void setPrincipalID(CDOID cdoID) {
		if (cdoID==null) {
			ID_MAP.remove(session.getId());		
		} else {
			ID_MAP.put(session.getId(), cdoID);
		}
	}

	protected Object getPrincipalID() {
		return ID_MAP.get(session.getId());
	}
	
	@Override
	public Principal getPrincipal(CDOViewContext<V, CR> context) {
		Object idAttr = getPrincipalID();
		if (idAttr instanceof CDOID) {
			return (Principal) context.getView().getObject((CDOID) idAttr);
		}
		
		if (principalName != null) {
			for (User pdu : context.getProtectionDomain().getAllUsers()) { 
				// TODO - find(login) to optimize search in large user populations
				if (pdu instanceof LoginUser && ((LoginUser) pdu).getLogin().equalsIgnoreCase(principalName)) {
					if (((LoginUser) pdu).isDisabled() || (pdu instanceof LoginPasswordHashUser && ((LoginPasswordHashUser) pdu).getPasswordHash() != null)) {
						break;
					} else {
						setPrincipalID(pdu.cdoID());
						return pdu;
					}
				}
			}
		}
		
		User unauthenticatedPrincipal = context.getProtectionDomain().getUnauthenticatedPrincipal();
		if (unauthenticatedPrincipal!=null) {
			setPrincipalID(unauthenticatedPrincipal.cdoID());
		}
		return unauthenticatedPrincipal;
	}						

	@Override
	public void setPrincipal(CDOViewContext<V, CR> context, final Principal principal) {
		if (principal == null) {
			setPrincipalID(null);
		} else {
			V view = context.getView();
			if (view instanceof CDOTransaction && principal.cdoID().isTemporary()) {
				((CDOTransaction) view).addTransactionHandler(new CDOTransactionHandler2() {

					@Override
					public void committedTransaction(CDOTransaction transaction, CDOCommitContext commitContext) {
						setPrincipalID(principal.cdoID());
					}

					@Override
					public void committingTransaction(CDOTransaction transaction, CDOCommitContext commitContext) {
						// NOP
						
					}

					@Override
					public void rolledBackTransaction(CDOTransaction transaction) {
						// NOP
						
					}
					
				});
			} else {					
				setPrincipalID(principal.cdoID());
			}
		}
	}
	
}
