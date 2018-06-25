/**
 */
package webdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webdsl.Language#getType <em>Type</em>}</li>
 *   <li>{@link webdsl.Language#getRequisition <em>Requisition</em>}</li>
 *   <li>{@link webdsl.Language#getInterceptor <em>Interceptor</em>}</li>
 * </ul>
 *
 * @see webdsl.WebdslPackage#getLanguage()
 * @model
 * @generated
 */
public interface Language extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see webdsl.WebdslPackage#getLanguage_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link webdsl.Language#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Requisition</b></em>' containment reference list.
	 * The list contents are of type {@link webdsl.Requisition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requisition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requisition</em>' containment reference list.
	 * @see webdsl.WebdslPackage#getLanguage_Requisition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requisition> getRequisition();

	/**
	 * Returns the value of the '<em><b>Interceptor</b></em>' containment reference list.
	 * The list contents are of type {@link webdsl.Interceptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interceptor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interceptor</em>' containment reference list.
	 * @see webdsl.WebdslPackage#getLanguage_Interceptor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interceptor> getInterceptor();

} // Language
