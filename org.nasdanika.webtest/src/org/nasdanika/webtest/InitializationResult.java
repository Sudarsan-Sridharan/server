package org.nasdanika.webtest;

import org.nasdanika.html.HTMLFactory.Glyphicon;

/**
 * Contains results of actor method execution.
 * @author Pavel Vlasov
 *
 */
public class InitializationResult extends OperationResult<Class<?>> {

	InitializationResult(String id, Class<?> klass, OperationResult<?> parent) {
		super(id, klass, null, parent);
	}
	
	protected String getOperationName() {
		String oName = operation.getName();
		return oName.substring(oName.lastIndexOf('.')+1)+"::init";
	}
	
	@Override
	Glyphicon getGlyphicon() {
		return Glyphicon.asterisk;
	}

}