/**
 */
package hu.bme.mit.gamma.logical.logicBase.model.impl;

import hu.bme.mit.gamma.logical.logicBase.model.Event;
import hu.bme.mit.gamma.logical.logicBase.model.ModelPackage;
import hu.bme.mit.gamma.logical.logicBase.model.Predicate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicBase.model.impl.PredicateImpl#getListens <em>Listens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateImpl extends MinimalEObjectImpl.Container implements Predicate {
	/**
	 * The cached value of the '{@link #getListens() <em>Listens</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListens()
	 * @generated
	 * @ordered
	 */
	protected Event listens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getListens() {
		if (listens != null && listens.eIsProxy()) {
			InternalEObject oldListens = (InternalEObject)listens;
			listens = (Event)eResolveProxy(oldListens);
			if (listens != oldListens) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PREDICATE__LISTENS, oldListens, listens));
			}
		}
		return listens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetListens() {
		return listens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListens(Event newListens) {
		Event oldListens = listens;
		listens = newListens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PREDICATE__LISTENS, oldListens, listens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PREDICATE__LISTENS:
				if (resolve) return getListens();
				return basicGetListens();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PREDICATE__LISTENS:
				setListens((Event)newValue);
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
			case ModelPackage.PREDICATE__LISTENS:
				setListens((Event)null);
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
			case ModelPackage.PREDICATE__LISTENS:
				return listens != null;
		}
		return super.eIsSet(featureID);
	}

} //PredicateImpl
