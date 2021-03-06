/**
 */
package webdsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import webdsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebdslFactoryImpl extends EFactoryImpl implements WebdslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebdslFactory init() {
		try {
			WebdslFactory theWebdslFactory = (WebdslFactory)EPackage.Registry.INSTANCE.getEFactory(WebdslPackage.eNS_URI);
			if (theWebdslFactory != null) {
				return theWebdslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebdslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebdslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WebdslPackage.CODE: return createCode();
			case WebdslPackage.FRONT: return createFront();
			case WebdslPackage.BACK: return createBack();
			case WebdslPackage.APPLICATION: return createApplication();
			case WebdslPackage.REQUISITION: return createRequisition();
			case WebdslPackage.INTERCEPTOR: return createInterceptor();
			case WebdslPackage.LANGUAGE: return createLanguage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Front createFront() {
		FrontImpl front = new FrontImpl();
		return front;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Back createBack() {
		BackImpl back = new BackImpl();
		return back;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requisition createRequisition() {
		RequisitionImpl requisition = new RequisitionImpl();
		return requisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interceptor createInterceptor() {
		InterceptorImpl interceptor = new InterceptorImpl();
		return interceptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebdslPackage getWebdslPackage() {
		return (WebdslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebdslPackage getPackage() {
		return WebdslPackage.eINSTANCE;
	}

} //WebdslFactoryImpl
