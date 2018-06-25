/**
 */
package webdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webdsl.Interceptor;
import webdsl.Language;
import webdsl.Requisition;
import webdsl.WebdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link webdsl.impl.LanguageImpl#getType <em>Type</em>}</li>
 *   <li>{@link webdsl.impl.LanguageImpl#getRequisition <em>Requisition</em>}</li>
 *   <li>{@link webdsl.impl.LanguageImpl#getInterceptor <em>Interceptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LanguageImpl extends MinimalEObjectImpl.Container implements Language {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequisition() <em>Requisition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequisition()
	 * @generated
	 * @ordered
	 */
	protected EList<Requisition> requisition;

	/**
	 * The cached value of the '{@link #getInterceptor() <em>Interceptor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterceptor()
	 * @generated
	 * @ordered
	 */
	protected EList<Interceptor> interceptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebdslPackage.Literals.LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebdslPackage.LANGUAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requisition> getRequisition() {
		if (requisition == null) {
			requisition = new EObjectContainmentEList<Requisition>(Requisition.class, this, WebdslPackage.LANGUAGE__REQUISITION);
		}
		return requisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interceptor> getInterceptor() {
		if (interceptor == null) {
			interceptor = new EObjectContainmentEList<Interceptor>(Interceptor.class, this, WebdslPackage.LANGUAGE__INTERCEPTOR);
		}
		return interceptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebdslPackage.LANGUAGE__REQUISITION:
				return ((InternalEList<?>)getRequisition()).basicRemove(otherEnd, msgs);
			case WebdslPackage.LANGUAGE__INTERCEPTOR:
				return ((InternalEList<?>)getInterceptor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebdslPackage.LANGUAGE__TYPE:
				return getType();
			case WebdslPackage.LANGUAGE__REQUISITION:
				return getRequisition();
			case WebdslPackage.LANGUAGE__INTERCEPTOR:
				return getInterceptor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebdslPackage.LANGUAGE__TYPE:
				setType((String)newValue);
				return;
			case WebdslPackage.LANGUAGE__REQUISITION:
				getRequisition().clear();
				getRequisition().addAll((Collection<? extends Requisition>)newValue);
				return;
			case WebdslPackage.LANGUAGE__INTERCEPTOR:
				getInterceptor().clear();
				getInterceptor().addAll((Collection<? extends Interceptor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebdslPackage.LANGUAGE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WebdslPackage.LANGUAGE__REQUISITION:
				getRequisition().clear();
				return;
			case WebdslPackage.LANGUAGE__INTERCEPTOR:
				getInterceptor().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebdslPackage.LANGUAGE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case WebdslPackage.LANGUAGE__REQUISITION:
				return requisition != null && !requisition.isEmpty();
			case WebdslPackage.LANGUAGE__INTERCEPTOR:
				return interceptor != null && !interceptor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LanguageImpl
