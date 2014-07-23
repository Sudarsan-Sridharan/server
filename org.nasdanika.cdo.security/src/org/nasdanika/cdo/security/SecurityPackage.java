/**
 */
package org.nasdanika.cdo.security;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.cdo.security.SecurityFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.cdo.security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.cdo.security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPackage eINSTANCE = org.nasdanika.cdo.security.impl.SecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.cdo.security.ProtectionDomain <em>Protection Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cdo.security.ProtectionDomain
	 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getProtectionDomain()
	 * @generated
	 */
	int PROTECTION_DOMAIN = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.cdo.security.impl.LoginPasswordProtectionDomainImpl <em>Login Password Protection Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cdo.security.impl.LoginPasswordProtectionDomainImpl
	 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getLoginPasswordProtectionDomain()
	 * @generated
	 */
	int LOGIN_PASSWORD_PROTECTION_DOMAIN = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.cdo.security.Principal <em>Principal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cdo.security.Principal
	 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getPrincipal()
	 * @generated
	 */
	int PRINCIPAL = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.cdo.security.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cdo.security.impl.GroupImpl
	 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.cdo.security.User <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cdo.security.User
	 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getUser()
	 * @generated
	 */
	int USER = 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.cdo.security.LoginPasswordHashUser <em>Login Password Hash User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cdo.security.LoginPasswordHashUser
	 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getLoginPasswordHashUser()
	 * @generated
	 */
	int LOGIN_PASSWORD_HASH_USER = 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.cdo.security.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cdo.security.impl.ActionImpl
	 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The meta object id for the '{@link org.nasdanika.cdo.security.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cdo.security.impl.PropertyImpl
	 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.cdo.security.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cdo.security.impl.PermissionImpl
	 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 9;

	/**
	 * The meta object id for the '{@link org.nasdanika.cdo.security.LoginPasswordCredentials <em>Login Password Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.cdo.security.LoginPasswordCredentials
	 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getLoginPasswordCredentials()
	 * @generated
	 */
	int LOGIN_PASSWORD_CREDENTIALS = 0;

	/**
	 * The number of structural features of the '<em>Login Password Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_CREDENTIALS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Login Password Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_CREDENTIALS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Super Users Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__SUPER_USERS_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Unauthenticated Principal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__UNAUTHENTICATED_PRINCIPAL = 3;

	/**
	 * The feature id for the '<em><b>Everyone Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN__EVERYONE_GROUP = 4;

	/**
	 * The number of structural features of the '<em>Protection Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Authenticate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN___AUTHENTICATE__OBJECT = 0;

	/**
	 * The operation id for the '<em>Clear Permissions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN___CLEAR_PERMISSIONS__EOBJECT = 1;

	/**
	 * The operation id for the '<em>Get All Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN___GET_ALL_USERS = 2;

	/**
	 * The number of operations of the '<em>Protection Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_DOMAIN_OPERATION_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_PROTECTION_DOMAIN__ACTIONS = PROTECTION_DOMAIN__ACTIONS;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_PROTECTION_DOMAIN__GROUPS = PROTECTION_DOMAIN__GROUPS;

	/**
	 * The feature id for the '<em><b>Super Users Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_PROTECTION_DOMAIN__SUPER_USERS_GROUP = PROTECTION_DOMAIN__SUPER_USERS_GROUP;

	/**
	 * The feature id for the '<em><b>Unauthenticated Principal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_PROTECTION_DOMAIN__UNAUTHENTICATED_PRINCIPAL = PROTECTION_DOMAIN__UNAUTHENTICATED_PRINCIPAL;

	/**
	 * The feature id for the '<em><b>Everyone Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_PROTECTION_DOMAIN__EVERYONE_GROUP = PROTECTION_DOMAIN__EVERYONE_GROUP;

	/**
	 * The number of structural features of the '<em>Login Password Protection Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT = PROTECTION_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Authenticate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_PROTECTION_DOMAIN___AUTHENTICATE__OBJECT = PROTECTION_DOMAIN___AUTHENTICATE__OBJECT;

	/**
	 * The operation id for the '<em>Clear Permissions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_PROTECTION_DOMAIN___CLEAR_PERMISSIONS__EOBJECT = PROTECTION_DOMAIN___CLEAR_PERMISSIONS__EOBJECT;

	/**
	 * The operation id for the '<em>Get All Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_PROTECTION_DOMAIN___GET_ALL_USERS = PROTECTION_DOMAIN___GET_ALL_USERS;

	/**
	 * The operation id for the '<em>Set Password Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_PROTECTION_DOMAIN___SET_PASSWORD_HASH__LOGINPASSWORDHASHUSER_STRING = PROTECTION_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Login Password Protection Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_PROTECTION_DOMAIN_OPERATION_COUNT = PROTECTION_DOMAIN_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__MEMBER_OF = 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__PERMISSIONS = 1;

	/**
	 * The number of structural features of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP = 0;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT = 1;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_MAP = 2;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_STRING = 3;

	/**
	 * The number of operations of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_OPERATION_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Member Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MEMBER_OF = PRINCIPAL__MEMBER_OF;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PERMISSIONS = PRINCIPAL__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MEMBERS = PRINCIPAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = PRINCIPAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = PRINCIPAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = PRINCIPAL_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP = PRINCIPAL___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT = PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___SEND_MESSAGE__PRINCIPAL_STRING_MAP = PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_MAP;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___SEND_MESSAGE__PRINCIPAL_STRING_STRING = PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_STRING;

	/**
	 * The operation id for the '<em>Is Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___IS_MEMBER__PRINCIPAL = PRINCIPAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = PRINCIPAL_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MEMBER_OF = PRINCIPAL__MEMBER_OF;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PERMISSIONS = PRINCIPAL__PERMISSIONS;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = PRINCIPAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP = PRINCIPAL___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT = PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___SEND_MESSAGE__PRINCIPAL_STRING_MAP = PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_MAP;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING = PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_STRING;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = PRINCIPAL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_HASH_USER__MEMBER_OF = USER__MEMBER_OF;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_HASH_USER__PERMISSIONS = USER__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_HASH_USER__LOGIN = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Login Password Hash User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_HASH_USER___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP = USER___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_HASH_USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT = USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_HASH_USER___SEND_MESSAGE__PRINCIPAL_STRING_MAP = USER___SEND_MESSAGE__PRINCIPAL_STRING_MAP;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_HASH_USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING = USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING;

	/**
	 * The number of operations of the '<em>Login Password Hash User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_PASSWORD_HASH_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Target Namespace URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TARGET_NAMESPACE_URI = 2;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TARGET_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Grantable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__GRANTABLE = 4;

	/**
	 * The feature id for the '<em><b>Implies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IMPLIES = 5;

	/**
	 * The feature id for the '<em><b>Implied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__IMPLIED_BY = 6;

	/**
	 * The feature id for the '<em><b>Path Patterns</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PATH_PATTERNS = 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PROPERTIES = 9;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Match</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___MATCH__CONTEXT_STRING_STRING_MAP = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMMENT = 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Allow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ALLOW = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__TARGET = 2;

	/**
	 * The feature id for the '<em><b>With Grant Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__WITH_GRANT_OPTION = 3;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__START_DATE = 4;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__END_DATE = 5;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__COMMENT = 6;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP = 0;

	/**
	 * The number of operations of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '<em>Access Decision</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.core.AuthorizationProvider.AccessDecision
	 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getAccessDecision()
	 * @generated
	 */
	int ACCESS_DECISION = 11;


	/**
	 * The meta object id for the '<em>Context</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.core.Context
	 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 10;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.cdo.security.ProtectionDomain <em>Protection Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection Domain</em>'.
	 * @see org.nasdanika.cdo.security.ProtectionDomain
	 * @generated
	 */
	EClass getProtectionDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cdo.security.ProtectionDomain#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.nasdanika.cdo.security.ProtectionDomain#getActions()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EReference getProtectionDomain_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cdo.security.ProtectionDomain#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.nasdanika.cdo.security.ProtectionDomain#getGroups()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EReference getProtectionDomain_Groups();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.cdo.security.ProtectionDomain#getSuperUsersGroup <em>Super Users Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Users Group</em>'.
	 * @see org.nasdanika.cdo.security.ProtectionDomain#getSuperUsersGroup()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EReference getProtectionDomain_SuperUsersGroup();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.cdo.security.ProtectionDomain#getUnauthenticatedPrincipal <em>Unauthenticated Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unauthenticated Principal</em>'.
	 * @see org.nasdanika.cdo.security.ProtectionDomain#getUnauthenticatedPrincipal()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EReference getProtectionDomain_UnauthenticatedPrincipal();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.cdo.security.ProtectionDomain#getEveryoneGroup <em>Everyone Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Everyone Group</em>'.
	 * @see org.nasdanika.cdo.security.ProtectionDomain#getEveryoneGroup()
	 * @see #getProtectionDomain()
	 * @generated
	 */
	EReference getProtectionDomain_EveryoneGroup();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.cdo.security.ProtectionDomain#authenticate(java.lang.Object) <em>Authenticate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authenticate</em>' operation.
	 * @see org.nasdanika.cdo.security.ProtectionDomain#authenticate(java.lang.Object)
	 * @generated
	 */
	EOperation getProtectionDomain__Authenticate__Object();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.cdo.security.ProtectionDomain#clearPermissions(org.eclipse.emf.ecore.EObject) <em>Clear Permissions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Permissions</em>' operation.
	 * @see org.nasdanika.cdo.security.ProtectionDomain#clearPermissions(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getProtectionDomain__ClearPermissions__EObject();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.cdo.security.ProtectionDomain#getAllUsers() <em>Get All Users</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Users</em>' operation.
	 * @see org.nasdanika.cdo.security.ProtectionDomain#getAllUsers()
	 * @generated
	 */
	EOperation getProtectionDomain__GetAllUsers();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cdo.security.LoginPasswordProtectionDomain <em>Login Password Protection Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Password Protection Domain</em>'.
	 * @see org.nasdanika.cdo.security.LoginPasswordProtectionDomain
	 * @generated
	 */
	EClass getLoginPasswordProtectionDomain();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.cdo.security.LoginPasswordProtectionDomain#setPasswordHash(org.nasdanika.cdo.security.LoginPasswordHashUser, java.lang.String) <em>Set Password Hash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Password Hash</em>' operation.
	 * @see org.nasdanika.cdo.security.LoginPasswordProtectionDomain#setPasswordHash(org.nasdanika.cdo.security.LoginPasswordHashUser, java.lang.String)
	 * @generated
	 */
	EOperation getLoginPasswordProtectionDomain__SetPasswordHash__LoginPasswordHashUser_String();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cdo.security.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Principal</em>'.
	 * @see org.nasdanika.cdo.security.Principal
	 * @generated
	 */
	EClass getPrincipal();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.cdo.security.Principal#getMemberOf <em>Member Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member Of</em>'.
	 * @see org.nasdanika.cdo.security.Principal#getMemberOf()
	 * @see #getPrincipal()
	 * @generated
	 */
	EReference getPrincipal_MemberOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cdo.security.Principal#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see org.nasdanika.cdo.security.Principal#getPermissions()
	 * @see #getPrincipal()
	 * @generated
	 */
	EReference getPrincipal_Permissions();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.cdo.security.Principal#authorize(org.nasdanika.core.Context, org.eclipse.emf.ecore.EObject, java.lang.String, java.lang.String, java.util.Map) <em>Authorize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authorize</em>' operation.
	 * @see org.nasdanika.cdo.security.Principal#authorize(org.nasdanika.core.Context, org.eclipse.emf.ecore.EObject, java.lang.String, java.lang.String, java.util.Map)
	 * @generated
	 */
	EOperation getPrincipal__Authorize__Context_EObject_String_String_Map();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.cdo.security.Principal#sendMessage(org.nasdanika.cdo.security.Principal, java.lang.String, java.lang.String, java.lang.Object) <em>Send Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Message</em>' operation.
	 * @see org.nasdanika.cdo.security.Principal#sendMessage(org.nasdanika.cdo.security.Principal, java.lang.String, java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getPrincipal__SendMessage__Principal_String_String_Object();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.cdo.security.Principal#sendMessage(org.nasdanika.cdo.security.Principal, java.lang.String, java.util.Map) <em>Send Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Message</em>' operation.
	 * @see org.nasdanika.cdo.security.Principal#sendMessage(org.nasdanika.cdo.security.Principal, java.lang.String, java.util.Map)
	 * @generated
	 */
	EOperation getPrincipal__SendMessage__Principal_String_Map();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.cdo.security.Principal#sendMessage(org.nasdanika.cdo.security.Principal, java.lang.String, java.lang.String) <em>Send Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Message</em>' operation.
	 * @see org.nasdanika.cdo.security.Principal#sendMessage(org.nasdanika.cdo.security.Principal, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getPrincipal__SendMessage__Principal_String_String();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cdo.security.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.nasdanika.cdo.security.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.cdo.security.Group#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see org.nasdanika.cdo.security.Group#getMembers()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Members();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.cdo.security.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Group#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.cdo.security.Group#getDescription()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Description();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.cdo.security.Group#isMember(org.nasdanika.cdo.security.Principal) <em>Is Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Member</em>' operation.
	 * @see org.nasdanika.cdo.security.Group#isMember(org.nasdanika.cdo.security.Principal)
	 * @generated
	 */
	EOperation getGroup__IsMember__Principal();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cdo.security.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.nasdanika.cdo.security.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cdo.security.LoginPasswordHashUser <em>Login Password Hash User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Password Hash User</em>'.
	 * @see org.nasdanika.cdo.security.LoginPasswordHashUser
	 * @generated
	 */
	EClass getLoginPasswordHashUser();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.LoginPasswordHashUser#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see org.nasdanika.cdo.security.LoginPasswordHashUser#getLogin()
	 * @see #getLoginPasswordHashUser()
	 * @generated
	 */
	EAttribute getLoginPasswordHashUser_Login();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.LoginPasswordHashUser#getPasswordHash <em>Password Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Hash</em>'.
	 * @see org.nasdanika.cdo.security.LoginPasswordHashUser#getPasswordHash()
	 * @see #getLoginPasswordHashUser()
	 * @generated
	 */
	EAttribute getLoginPasswordHashUser_PasswordHash();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cdo.security.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.nasdanika.cdo.security.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.cdo.security.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Action#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.cdo.security.Action#getDescription()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Action#getTargetNamespaceURI <em>Target Namespace URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace URI</em>'.
	 * @see org.nasdanika.cdo.security.Action#getTargetNamespaceURI()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_TargetNamespaceURI();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Action#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class</em>'.
	 * @see org.nasdanika.cdo.security.Action#getTargetClass()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_TargetClass();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Action#isGrantable <em>Grantable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grantable</em>'.
	 * @see org.nasdanika.cdo.security.Action#isGrantable()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Grantable();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.cdo.security.Action#getImplies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implies</em>'.
	 * @see org.nasdanika.cdo.security.Action#getImplies()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Implies();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.cdo.security.Action#getImpliedBy <em>Implied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implied By</em>'.
	 * @see org.nasdanika.cdo.security.Action#getImpliedBy()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ImpliedBy();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.cdo.security.Action#getPathPatterns <em>Path Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Path Patterns</em>'.
	 * @see org.nasdanika.cdo.security.Action#getPathPatterns()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_PathPatterns();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Action#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.nasdanika.cdo.security.Action#getCondition()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.cdo.security.Action#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.nasdanika.cdo.security.Action#getProperties()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Properties();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.cdo.security.Action#match(org.nasdanika.core.Context, java.lang.String, java.lang.String, java.util.Map) <em>Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Match</em>' operation.
	 * @see org.nasdanika.cdo.security.Action#match(org.nasdanika.core.Context, java.lang.String, java.lang.String, java.util.Map)
	 * @generated
	 */
	EOperation getAction__Match__Context_String_String_Map();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cdo.security.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.nasdanika.cdo.security.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.cdo.security.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.cdo.security.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.cdo.security.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Property#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.cdo.security.Property#getComment()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Comment();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cdo.security.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see org.nasdanika.cdo.security.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Permission#isAllow <em>Allow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow</em>'.
	 * @see org.nasdanika.cdo.security.Permission#isAllow()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Allow();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.cdo.security.Permission#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see org.nasdanika.cdo.security.Permission#getAction()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Action();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.cdo.security.Permission#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.cdo.security.Permission#getTarget()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Permission#isWithGrantOption <em>With Grant Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Grant Option</em>'.
	 * @see org.nasdanika.cdo.security.Permission#isWithGrantOption()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_WithGrantOption();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Permission#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.nasdanika.cdo.security.Permission#getStartDate()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Permission#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.nasdanika.cdo.security.Permission#getEndDate()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.cdo.security.Permission#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.cdo.security.Permission#getComment()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Comment();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.cdo.security.Permission#authorize(org.nasdanika.core.Context, org.eclipse.emf.ecore.EObject, java.lang.String, java.lang.String, java.util.Map) <em>Authorize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authorize</em>' operation.
	 * @see org.nasdanika.cdo.security.Permission#authorize(org.nasdanika.core.Context, org.eclipse.emf.ecore.EObject, java.lang.String, java.lang.String, java.util.Map)
	 * @generated
	 */
	EOperation getPermission__Authorize__Context_EObject_String_String_Map();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.cdo.security.LoginPasswordCredentials <em>Login Password Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Password Credentials</em>'.
	 * @see org.nasdanika.cdo.security.LoginPasswordCredentials
	 * @model instanceClass="org.nasdanika.cdo.security.LoginPasswordCredentials"
	 * @generated
	 */
	EClass getLoginPasswordCredentials();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.core.AuthorizationProvider.AccessDecision <em>Access Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Decision</em>'.
	 * @see org.nasdanika.core.AuthorizationProvider.AccessDecision
	 * @model instanceClass="org.nasdanika.core.AuthorizationProvider.AccessDecision"
	 * @generated
	 */
	EDataType getAccessDecision();

	/**
	 * Returns the meta object for data type '{@link org.nasdanika.core.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Context</em>'.
	 * @see org.nasdanika.core.Context
	 * @model instanceClass="org.nasdanika.core.Context"
	 * @generated
	 */
	EDataType getContext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityFactory getSecurityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.cdo.security.ProtectionDomain <em>Protection Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cdo.security.ProtectionDomain
		 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getProtectionDomain()
		 * @generated
		 */
		EClass PROTECTION_DOMAIN = eINSTANCE.getProtectionDomain();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_DOMAIN__ACTIONS = eINSTANCE.getProtectionDomain_Actions();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_DOMAIN__GROUPS = eINSTANCE.getProtectionDomain_Groups();

		/**
		 * The meta object literal for the '<em><b>Super Users Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_DOMAIN__SUPER_USERS_GROUP = eINSTANCE.getProtectionDomain_SuperUsersGroup();

		/**
		 * The meta object literal for the '<em><b>Unauthenticated Principal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_DOMAIN__UNAUTHENTICATED_PRINCIPAL = eINSTANCE.getProtectionDomain_UnauthenticatedPrincipal();

		/**
		 * The meta object literal for the '<em><b>Everyone Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_DOMAIN__EVERYONE_GROUP = eINSTANCE.getProtectionDomain_EveryoneGroup();

		/**
		 * The meta object literal for the '<em><b>Authenticate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROTECTION_DOMAIN___AUTHENTICATE__OBJECT = eINSTANCE.getProtectionDomain__Authenticate__Object();

		/**
		 * The meta object literal for the '<em><b>Clear Permissions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROTECTION_DOMAIN___CLEAR_PERMISSIONS__EOBJECT = eINSTANCE.getProtectionDomain__ClearPermissions__EObject();

		/**
		 * The meta object literal for the '<em><b>Get All Users</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROTECTION_DOMAIN___GET_ALL_USERS = eINSTANCE.getProtectionDomain__GetAllUsers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.cdo.security.impl.LoginPasswordProtectionDomainImpl <em>Login Password Protection Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cdo.security.impl.LoginPasswordProtectionDomainImpl
		 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getLoginPasswordProtectionDomain()
		 * @generated
		 */
		EClass LOGIN_PASSWORD_PROTECTION_DOMAIN = eINSTANCE.getLoginPasswordProtectionDomain();

		/**
		 * The meta object literal for the '<em><b>Set Password Hash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGIN_PASSWORD_PROTECTION_DOMAIN___SET_PASSWORD_HASH__LOGINPASSWORDHASHUSER_STRING = eINSTANCE.getLoginPasswordProtectionDomain__SetPasswordHash__LoginPasswordHashUser_String();

		/**
		 * The meta object literal for the '{@link org.nasdanika.cdo.security.Principal <em>Principal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cdo.security.Principal
		 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getPrincipal()
		 * @generated
		 */
		EClass PRINCIPAL = eINSTANCE.getPrincipal();

		/**
		 * The meta object literal for the '<em><b>Member Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINCIPAL__MEMBER_OF = eINSTANCE.getPrincipal_MemberOf();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINCIPAL__PERMISSIONS = eINSTANCE.getPrincipal_Permissions();

		/**
		 * The meta object literal for the '<em><b>Authorize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINCIPAL___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP = eINSTANCE.getPrincipal__Authorize__Context_EObject_String_String_Map();

		/**
		 * The meta object literal for the '<em><b>Send Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT = eINSTANCE.getPrincipal__SendMessage__Principal_String_String_Object();

		/**
		 * The meta object literal for the '<em><b>Send Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_MAP = eINSTANCE.getPrincipal__SendMessage__Principal_String_Map();

		/**
		 * The meta object literal for the '<em><b>Send Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_STRING = eINSTANCE.getPrincipal__SendMessage__Principal_String_String();

		/**
		 * The meta object literal for the '{@link org.nasdanika.cdo.security.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cdo.security.impl.GroupImpl
		 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__MEMBERS = eINSTANCE.getGroup_Members();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__DESCRIPTION = eINSTANCE.getGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Is Member</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GROUP___IS_MEMBER__PRINCIPAL = eINSTANCE.getGroup__IsMember__Principal();

		/**
		 * The meta object literal for the '{@link org.nasdanika.cdo.security.User <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cdo.security.User
		 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link org.nasdanika.cdo.security.LoginPasswordHashUser <em>Login Password Hash User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cdo.security.LoginPasswordHashUser
		 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getLoginPasswordHashUser()
		 * @generated
		 */
		EClass LOGIN_PASSWORD_HASH_USER = eINSTANCE.getLoginPasswordHashUser();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_PASSWORD_HASH_USER__LOGIN = eINSTANCE.getLoginPasswordHashUser_Login();

		/**
		 * The meta object literal for the '<em><b>Password Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH = eINSTANCE.getLoginPasswordHashUser_PasswordHash();

		/**
		 * The meta object literal for the '{@link org.nasdanika.cdo.security.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cdo.security.impl.ActionImpl
		 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DESCRIPTION = eINSTANCE.getAction_Description();

		/**
		 * The meta object literal for the '<em><b>Target Namespace URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TARGET_NAMESPACE_URI = eINSTANCE.getAction_TargetNamespaceURI();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TARGET_CLASS = eINSTANCE.getAction_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Grantable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__GRANTABLE = eINSTANCE.getAction_Grantable();

		/**
		 * The meta object literal for the '<em><b>Implies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__IMPLIES = eINSTANCE.getAction_Implies();

		/**
		 * The meta object literal for the '<em><b>Implied By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__IMPLIED_BY = eINSTANCE.getAction_ImpliedBy();

		/**
		 * The meta object literal for the '<em><b>Path Patterns</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__PATH_PATTERNS = eINSTANCE.getAction_PathPatterns();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__CONDITION = eINSTANCE.getAction_Condition();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PROPERTIES = eINSTANCE.getAction_Properties();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___MATCH__CONTEXT_STRING_STRING_MAP = eINSTANCE.getAction__Match__Context_String_String_Map();

		/**
		 * The meta object literal for the '{@link org.nasdanika.cdo.security.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cdo.security.impl.PropertyImpl
		 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__COMMENT = eINSTANCE.getProperty_Comment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.cdo.security.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cdo.security.impl.PermissionImpl
		 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Allow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__ALLOW = eINSTANCE.getPermission_Allow();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__ACTION = eINSTANCE.getPermission_Action();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__TARGET = eINSTANCE.getPermission_Target();

		/**
		 * The meta object literal for the '<em><b>With Grant Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__WITH_GRANT_OPTION = eINSTANCE.getPermission_WithGrantOption();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__START_DATE = eINSTANCE.getPermission_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__END_DATE = eINSTANCE.getPermission_EndDate();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__COMMENT = eINSTANCE.getPermission_Comment();

		/**
		 * The meta object literal for the '<em><b>Authorize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERMISSION___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP = eINSTANCE.getPermission__Authorize__Context_EObject_String_String_Map();

		/**
		 * The meta object literal for the '{@link org.nasdanika.cdo.security.LoginPasswordCredentials <em>Login Password Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.cdo.security.LoginPasswordCredentials
		 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getLoginPasswordCredentials()
		 * @generated
		 */
		EClass LOGIN_PASSWORD_CREDENTIALS = eINSTANCE.getLoginPasswordCredentials();

		/**
		 * The meta object literal for the '<em>Access Decision</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.core.AuthorizationProvider.AccessDecision
		 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getAccessDecision()
		 * @generated
		 */
		EDataType ACCESS_DECISION = eINSTANCE.getAccessDecision();

		/**
		 * The meta object literal for the '<em>Context</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.core.Context
		 * @see org.nasdanika.cdo.security.impl.SecurityPackageImpl#getContext()
		 * @generated
		 */
		EDataType CONTEXT = eINSTANCE.getContext();

	}

} //SecurityPackage
