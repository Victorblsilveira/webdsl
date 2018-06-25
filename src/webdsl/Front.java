/**
 */
package webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Front</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link webdsl.Front#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see webdsl.WebdslPackage#getFront()
 * @model
 * @generated
 */
public interface Front extends Code {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Language)
	 * @see webdsl.WebdslPackage#getFront_Language()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link webdsl.Front#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

} // Front
