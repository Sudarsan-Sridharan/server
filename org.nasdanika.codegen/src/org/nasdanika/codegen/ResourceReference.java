/**
 */
package org.nasdanika.codegen;

import org.eclipse.core.resources.IFolder;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ResourceReference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.CodegenPackage#getResourceReference()
 * @model superTypes="org.nasdanika.codegen.Resource<org.nasdanika.codegen.IResource>"
 * @generated
 */
public interface ResourceReference extends Resource<IFolder> {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Resource)
	 * @see org.nasdanika.codegen.CodegenPackage#getResourceReference_Target()
	 * @model type="org.nasdanika.codegen.Resource<org.nasdanika.codegen.IResource>"
	 * @generated
	 */
	Resource<IFolder> getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ResourceReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Resource<IFolder> value);

} // ResourceReference
