/**
 */
package org.nasdanika.cdo.flow;

import org.eclipse.emf.common.util.EMap;
import org.nasdanika.core.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.cdo.flow.Action#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.cdo.flow.Action#getErrorHandlers <em>Error Handlers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.cdo.flow.FlowPackage#getAction()
 * @model interface="true" abstract="true" CBounds="org.nasdanika.cdo.flow.Context"
 * @generated
 */
public interface Action<R, C extends Context> extends Invocable<R, C> {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.nasdanika.cdo.flow.Actuator<?>},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' map.
	 * @see org.nasdanika.cdo.flow.FlowPackage#getAction_Outputs()
	 * @model mapType="org.nasdanika.cdo.flow.ActionOutputEntry<org.eclipse.emf.ecore.EString, org.nasdanika.cdo.flow.Actuator<?>>"
	 * @generated
	 */
	EMap<String, Actuator<?>> getOutputs();

	/**
	 * Returns the value of the '<em><b>Error Handlers</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.nasdanika.cdo.flow.Invocable<?, ?>},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Handlers</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Handlers</em>' map.
	 * @see org.nasdanika.cdo.flow.FlowPackage#getAction_ErrorHandlers()
	 * @model mapType="org.nasdanika.cdo.flow.ErrorHandlerEntry<org.eclipse.emf.ecore.EString, org.nasdanika.cdo.flow.Invocable<?, ?>>"
	 * @generated
	 */
	EMap<String, Invocable<?, ?>> getErrorHandlers();

} // Action
