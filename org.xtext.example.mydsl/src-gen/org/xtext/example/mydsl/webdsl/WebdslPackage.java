/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.webdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.webdsl.WebdslFactory
 * @model kind="package"
 * @generated
 */
public interface WebdslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "webdsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://eclipse.com/obeoum/projects/webdsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "webdsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WebdslPackage eINSTANCE = org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.webdsl.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.webdsl.impl.ApplicationImpl
   * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__CODE = 1;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.webdsl.impl.CodeImpl <em>Code</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.webdsl.impl.CodeImpl
   * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getCode()
   * @generated
   */
  int CODE = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE__ID = 0;

  /**
   * The number of structural features of the '<em>Code</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.webdsl.impl.FrontImpl <em>Front</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.webdsl.impl.FrontImpl
   * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getFront()
   * @generated
   */
  int FRONT = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRONT__ID = CODE__ID;

  /**
   * The feature id for the '<em><b>Language</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRONT__LANGUAGE = CODE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Front</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRONT_FEATURE_COUNT = CODE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.webdsl.impl.BackImpl <em>Back</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.webdsl.impl.BackImpl
   * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getBack()
   * @generated
   */
  int BACK = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACK__ID = CODE__ID;

  /**
   * The number of structural features of the '<em>Back</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BACK_FEATURE_COUNT = CODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.webdsl.impl.LanguageImpl <em>Language</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.webdsl.impl.LanguageImpl
   * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getLanguage()
   * @generated
   */
  int LANGUAGE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Requisition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE__REQUISITION = 1;

  /**
   * The feature id for the '<em><b>Interceptor</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE__INTERCEPTOR = 2;

  /**
   * The number of structural features of the '<em>Language</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.webdsl.impl.RequisitionImpl <em>Requisition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.webdsl.impl.RequisitionImpl
   * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getRequisition()
   * @generated
   */
  int REQUISITION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUISITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUISITION__METHOD = 1;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUISITION__URL = 2;

  /**
   * The number of structural features of the '<em>Requisition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUISITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.webdsl.impl.InterceptorImpl <em>Interceptor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.webdsl.impl.InterceptorImpl
   * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getInterceptor()
   * @generated
   */
  int INTERCEPTOR = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERCEPTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERCEPTOR__METHOD = 1;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERCEPTOR__URL = 2;

  /**
   * The number of structural features of the '<em>Interceptor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERCEPTOR_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.webdsl.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see org.xtext.example.mydsl.webdsl.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.webdsl.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.webdsl.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.webdsl.Application#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Code</em>'.
   * @see org.xtext.example.mydsl.webdsl.Application#getCode()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Code();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.webdsl.Code <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Code</em>'.
   * @see org.xtext.example.mydsl.webdsl.Code
   * @generated
   */
  EClass getCode();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.webdsl.Code#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.webdsl.Code#getId()
   * @see #getCode()
   * @generated
   */
  EAttribute getCode_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.webdsl.Front <em>Front</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Front</em>'.
   * @see org.xtext.example.mydsl.webdsl.Front
   * @generated
   */
  EClass getFront();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.webdsl.Front#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Language</em>'.
   * @see org.xtext.example.mydsl.webdsl.Front#getLanguage()
   * @see #getFront()
   * @generated
   */
  EReference getFront_Language();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.webdsl.Back <em>Back</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Back</em>'.
   * @see org.xtext.example.mydsl.webdsl.Back
   * @generated
   */
  EClass getBack();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.webdsl.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language</em>'.
   * @see org.xtext.example.mydsl.webdsl.Language
   * @generated
   */
  EClass getLanguage();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.webdsl.Language#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.webdsl.Language#getType()
   * @see #getLanguage()
   * @generated
   */
  EAttribute getLanguage_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.webdsl.Language#getRequisition <em>Requisition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requisition</em>'.
   * @see org.xtext.example.mydsl.webdsl.Language#getRequisition()
   * @see #getLanguage()
   * @generated
   */
  EReference getLanguage_Requisition();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.webdsl.Language#getInterceptor <em>Interceptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interceptor</em>'.
   * @see org.xtext.example.mydsl.webdsl.Language#getInterceptor()
   * @see #getLanguage()
   * @generated
   */
  EReference getLanguage_Interceptor();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.webdsl.Requisition <em>Requisition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requisition</em>'.
   * @see org.xtext.example.mydsl.webdsl.Requisition
   * @generated
   */
  EClass getRequisition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.webdsl.Requisition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.webdsl.Requisition#getName()
   * @see #getRequisition()
   * @generated
   */
  EAttribute getRequisition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.webdsl.Requisition#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see org.xtext.example.mydsl.webdsl.Requisition#getMethod()
   * @see #getRequisition()
   * @generated
   */
  EAttribute getRequisition_Method();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.webdsl.Requisition#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.xtext.example.mydsl.webdsl.Requisition#getUrl()
   * @see #getRequisition()
   * @generated
   */
  EAttribute getRequisition_Url();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.webdsl.Interceptor <em>Interceptor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interceptor</em>'.
   * @see org.xtext.example.mydsl.webdsl.Interceptor
   * @generated
   */
  EClass getInterceptor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.webdsl.Interceptor#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.webdsl.Interceptor#getName()
   * @see #getInterceptor()
   * @generated
   */
  EAttribute getInterceptor_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.webdsl.Interceptor#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see org.xtext.example.mydsl.webdsl.Interceptor#getMethod()
   * @see #getInterceptor()
   * @generated
   */
  EAttribute getInterceptor_Method();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.webdsl.Interceptor#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.xtext.example.mydsl.webdsl.Interceptor#getUrl()
   * @see #getInterceptor()
   * @generated
   */
  EAttribute getInterceptor_Url();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WebdslFactory getWebdslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.webdsl.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.webdsl.impl.ApplicationImpl
     * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__CODE = eINSTANCE.getApplication_Code();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.webdsl.impl.CodeImpl <em>Code</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.webdsl.impl.CodeImpl
     * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getCode()
     * @generated
     */
    EClass CODE = eINSTANCE.getCode();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODE__ID = eINSTANCE.getCode_Id();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.webdsl.impl.FrontImpl <em>Front</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.webdsl.impl.FrontImpl
     * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getFront()
     * @generated
     */
    EClass FRONT = eINSTANCE.getFront();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRONT__LANGUAGE = eINSTANCE.getFront_Language();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.webdsl.impl.BackImpl <em>Back</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.webdsl.impl.BackImpl
     * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getBack()
     * @generated
     */
    EClass BACK = eINSTANCE.getBack();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.webdsl.impl.LanguageImpl <em>Language</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.webdsl.impl.LanguageImpl
     * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getLanguage()
     * @generated
     */
    EClass LANGUAGE = eINSTANCE.getLanguage();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE__TYPE = eINSTANCE.getLanguage_Type();

    /**
     * The meta object literal for the '<em><b>Requisition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANGUAGE__REQUISITION = eINSTANCE.getLanguage_Requisition();

    /**
     * The meta object literal for the '<em><b>Interceptor</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANGUAGE__INTERCEPTOR = eINSTANCE.getLanguage_Interceptor();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.webdsl.impl.RequisitionImpl <em>Requisition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.webdsl.impl.RequisitionImpl
     * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getRequisition()
     * @generated
     */
    EClass REQUISITION = eINSTANCE.getRequisition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUISITION__NAME = eINSTANCE.getRequisition_Name();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUISITION__METHOD = eINSTANCE.getRequisition_Method();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUISITION__URL = eINSTANCE.getRequisition_Url();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.webdsl.impl.InterceptorImpl <em>Interceptor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.webdsl.impl.InterceptorImpl
     * @see org.xtext.example.mydsl.webdsl.impl.WebdslPackageImpl#getInterceptor()
     * @generated
     */
    EClass INTERCEPTOR = eINSTANCE.getInterceptor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERCEPTOR__NAME = eINSTANCE.getInterceptor_Name();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERCEPTOR__METHOD = eINSTANCE.getInterceptor_Method();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERCEPTOR__URL = eINSTANCE.getInterceptor_Url();

  }

} //WebdslPackage
