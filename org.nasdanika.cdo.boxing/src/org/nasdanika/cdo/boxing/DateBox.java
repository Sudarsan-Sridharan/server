/**
 */
package org.nasdanika.cdo.boxing;

import java.util.Date;

import org.nasdanika.core.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.cdo.boxing.DateBox#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.cdo.boxing.BoxingPackage#getDateBox()
 * @model superTypes="org.nasdanika.cdo.boxing.Box<org.eclipse.emf.ecore.EDate, org.nasdanika.cdo.boxing.Context>"
 * @generated
 */
public interface DateBox extends Box<Date, Context> {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Date)
	 * @see org.nasdanika.cdo.boxing.BoxingPackage#getDateBox_Value()
	 * @model
	 * @generated
	 */
	Date getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.cdo.boxing.DateBox#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Date value);

} // DateBox
