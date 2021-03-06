/**
 */
package org.nasdanika.cdo.security;

import java.util.Iterator;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protection Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Realm establishes associations between users and actions on model objects which users are allowed to perform.
 * There is no Role class/interface in the domain. A grantable actions is Role.
 * 
 * Typically the root of the application model would implement this interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.cdo.security.Realm#getRoot <em>Root</em>}</li>
 *   <li>{@link org.nasdanika.cdo.security.Realm#getGuest <em>Guest</em>}</li>
 *   <li>{@link org.nasdanika.cdo.security.Realm#getEveryone <em>Everyone</em>}</li>
 *   <li>{@link org.nasdanika.cdo.security.Realm#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.cdo.security.SecurityPackage#getRealm()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Realm<CR> extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Root has all permissions. 
	 * If root is not set or root is a group with no members, then any user is treated as a superuser. 
	 * This functionality allows to configure the system after installation and then secure it by setting/adding root(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Principal)
	 * @see org.nasdanika.cdo.security.SecurityPackage#getRealm_Root()
	 * @model
	 * @generated
	 */
	Principal getRoot();

	/**
	 * Sets the value of the '{@link org.nasdanika.cdo.security.Realm#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Principal value);

	/**
	 * Returns the value of the '<em><b>Guest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unauthenticated principal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guest</em>' containment reference.
	 * @see #setGuest(Principal)
	 * @see org.nasdanika.cdo.security.SecurityPackage#getRealm_Guest()
	 * @model containment="true"
	 * @generated
	 */
	Principal getGuest();

	/**
	 * Sets the value of the '{@link org.nasdanika.cdo.security.Realm#getGuest <em>Guest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest</em>' containment reference.
	 * @see #getGuest()
	 * @generated
	 */
	void setGuest(Principal value);

	/**
	 * Returns the value of the '<em><b>Everyone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this reference is set then all authenticated users implicitly inherit permissions from the ``everyone`` principal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Everyone</em>' containment reference.
	 * @see #setEveryone(Principal)
	 * @see org.nasdanika.cdo.security.SecurityPackage#getRealm_Everyone()
	 * @model containment="true"
	 * @generated
	 */
	Principal getEveryone();

	/**
	 * Sets the value of the '{@link org.nasdanika.cdo.security.Realm#getEveryone <em>Everyone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Everyone</em>' containment reference.
	 * @see #getEveryone()
	 * @generated
	 */
	void setEveryone(Principal value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.cdo.security.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In a security realm principals are granted permissios to perform actions on
	 * protected objects.
	 * Actions are associated with classed defined in packages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.nasdanika.cdo.security.SecurityPackage#getRealm_Packages()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.cdo.security.Package> getPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Authenticates user given provided credentials, e.g. user login and password pair.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	User<CR> authenticate(CR credentials);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Realm does not have a containment reference for principals, subclasses may
	 * have one or more principal containment references, direct or through contained objects.
	 * 
	 * This method returns all principals defined in the realm.
	 * 
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<User<CR>> getAllUsers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes permissions associated with the target object from all principals in the realm.
	 * This method shall be invoked before deleting an object.
	 * @param target Target object.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated NOT
	 */
	default void clearPermissions(EObject obj) {
		for (User<?> user: getAllUsers()) {
			Iterator<Permission> pit = user.getPermissions().iterator();
			while (pit.hasNext()) {
				Permission p = pit.next();
				if (p.getTarget().equals(obj)) {
					pit.remove();
				}
			}
		}
	}	

} // ProtectionDomain
