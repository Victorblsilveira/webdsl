/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.webdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Front</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.webdsl.Front#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.webdsl.WebdslPackage#getFront()
 * @model
 * @generated
 */
public interface Front extends Code
{
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
   * @see org.xtext.example.mydsl.webdsl.WebdslPackage#getFront_Language()
   * @model containment="true"
   * @generated
   */
  Language getLanguage();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.webdsl.Front#getLanguage <em>Language</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language</em>' containment reference.
   * @see #getLanguage()
   * @generated
   */
  void setLanguage(Language value);

} // Front
