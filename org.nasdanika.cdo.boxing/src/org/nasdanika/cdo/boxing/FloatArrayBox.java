/**
 */
package org.nasdanika.cdo.boxing;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.core.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Array Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.cdo.boxing.FloatArrayBox#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.cdo.boxing.BoxingPackage#getFloatArrayBox()
 * @model superTypes="org.nasdanika.cdo.boxing.Box<org.eclipse.emf.ecore.EJavaObject, org.nasdanika.cdo.boxing.Context>"
 * @generated
 */
public interface FloatArrayBox extends Box<Object, Context> {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see org.nasdanika.cdo.boxing.BoxingPackage#getFloatArrayBox_Value()
	 * @model
	 * @generated
	 */
	EList<Float> getValue();

} // FloatArrayBox
