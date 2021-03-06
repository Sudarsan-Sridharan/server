package org.nasdanika.cdo.web.html;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EOperation;
import org.nasdanika.core.Context;
import org.nasdanika.html.FontAwesome.Spinner;
import org.nasdanika.html.Form;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Tag;
import org.nasdanika.html.UIElement;
import org.nasdanika.html.UIElementFilter;

public class KnockoutJsOverlaidFormGenerator {
	
	private String onSubmitted;
	private String cancelHandler;
	private HTMLFactory htmlFactory;
	private String objectPath;
	private ENamedElement source;
	private Object[] customDeclarations;
	 
	public KnockoutJsOverlaidFormGenerator(
		EOperation eOperation, 
		HTMLFactory htmlFactory,
		String objectPath,
		String onSubmitted, 
		String cancelHandler,
		Object... customDeclarations
		) {
		this.source = eOperation;
		this.htmlFactory = htmlFactory;
		this.objectPath = objectPath;
		this.onSubmitted = onSubmitted;
		this.cancelHandler = cancelHandler;
		this.customDeclarations = customDeclarations;
	}

	protected KnockoutJsEOperationFormGenerator createFormGenerator(EOperation eOperation, String model, String submitHandler, String cancelHandler) {
		return new KnockoutJsEOperationFormGenerator(eOperation, model, submitHandler, cancelHandler);
	}
		 
	public KnockoutJsOverlaidFormGenerator(
		EClass eClass, 
		HTMLFactory htmlFactory,
		String objectPath,
		String onSubmitted, 
		String cancelHandler,
		Object... customDeclarations) {
		this.source = eClass;
		this.htmlFactory = htmlFactory;
		this.objectPath = objectPath;
		this.onSubmitted = onSubmitted;
		this.cancelHandler = cancelHandler;
		this.customDeclarations = customDeclarations;
	}
	
	protected KnockoutJsEClassFormGenerator createFormGenerator(EClass eClass, String model, String submitHandler, String cancelHandler) {
		return new KnockoutJsEClassFormGenerator(eClass, model, submitHandler, cancelHandler);
	}	
	
	public interface OverlaidFormContainer extends UIElement<Tag> {
		
		Form getForm();
		
	}
	
	private class OverlaidFormContainerImpl extends UIElementFilter<Tag> implements OverlaidFormContainer {

		private Form form;
		private HTMLFactory htmlFactory;

		OverlaidFormContainerImpl(Tag target, HTMLFactory htmlFactory, Form form) {
			super(target);
			this.htmlFactory = htmlFactory;
			this.form = form;
		}

		@Override
		public Form getForm() {
			return form;
		}
		
		@Override
		public String toString() {
			if (getId()==null) {
				id("overlaidFormContainer_"+htmlFactory.nextId());
			}
			return super.toString();
		}
		
	}
	
	public OverlaidFormContainer generateOverlaidFormContainer(Object... overlayContent) throws Exception {
		final KnockoutJsFormGeneratorBase<?, ?> formGenerator = createFormGenerator();
		Form form = formGenerator.generateForm(htmlFactory);
		final Tag containerDiv = htmlFactory.div(htmlFactory.overlay(overlayContent).style("display", "none"), form);
		containerDiv.content(new Object() {

			@Override
			public String toString() {
				KnockoutJsOverlaidFormModuleGenerator<Context, Object> generator = new KnockoutJsOverlaidFormModuleGenerator<>();
				String script;
				try {
					script = generator.execute(
							null, 
							objectPath, 
							formGenerator.generateModel(customDeclarations),
							containerDiv.getId(),
							onSubmitted,
							cancelHandler);
					return htmlFactory.tag(Tag.TagName.script, script).toString();
				} catch (Exception e) {
					e.printStackTrace();
					return e.toString();
				}
			}
			
		});
		
		return new OverlaidFormContainerImpl(containerDiv, htmlFactory, form);
	}

	protected KnockoutJsFormGeneratorBase<?, ?> createFormGenerator() {
		if (source instanceof EOperation) {
			return createFormGenerator((EOperation) source, "model", "submitHandler", cancelHandler==null ? null : "cancelHandler");
		}
		
		return createFormGenerator((EClass) source, "model", "submitHandler", cancelHandler==null ? null : "cancelHandler");
	}
	
	public OverlaidFormContainer generateSpinnerOverlaidFormContainer(Spinner spinner) throws Exception {
		final KnockoutJsFormGeneratorBase<?, ?> formGenerator = createFormGenerator();
		Form form = formGenerator.generateForm(htmlFactory);
		final Tag containerDiv = htmlFactory.div(htmlFactory.spinnerOverlay(Spinner.spinner).style("display", "none"), form);
		containerDiv.content(new Object() {
			
			@Override
			public String toString() {
				KnockoutJsOverlaidFormModuleGenerator<Context, Object> generator = new KnockoutJsOverlaidFormModuleGenerator<>();
				String script;
				try {
					script = generator.execute(
							null, 
							objectPath, 
							formGenerator.generateModel(),
							containerDiv.getId(),
							onSubmitted,
							cancelHandler);
					return htmlFactory.tag(Tag.TagName.script, script).toString();
				} catch (Exception e) {
					e.printStackTrace();
					return e.toString();
				}
			}
			
		});
		
		return new OverlaidFormContainerImpl(containerDiv, htmlFactory, form);
	}

}
