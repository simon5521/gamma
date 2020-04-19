/**
 */
package hu.bme.mit.gamma.logical.logicFunction.model.impl;

import hu.bme.mit.gamma.logical.logicBase.model.Predicate;

import hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage;
import hu.bme.mit.gamma.logical.logicFunction.model.PredicateListen;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate Listen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.PredicateListenImpl#getListens <em>Listens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateListenImpl extends AtomicImpl implements PredicateListen {
	/**
	 * The cached value of the '{@link #getListens() <em>Listens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListens()
	 * @generated
	 * @ordered
	 */
	protected Predicate listens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateListenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PREDICATE_LISTEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getListens() {
		return listens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListens(Predicate newListens, NotificationChain msgs) {
		Predicate oldListens = listens;
		listens = newListens;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PREDICATE_LISTEN__LISTENS, oldListens, newListens);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListens(Predicate newListens) {
		if (newListens != listens) {
			NotificationChain msgs = null;
			if (listens != null)
				msgs = ((InternalEObject)listens).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PREDICATE_LISTEN__LISTENS, null, msgs);
			if (newListens != null)
				msgs = ((InternalEObject)newListens).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PREDICATE_LISTEN__LISTENS, null, msgs);
			msgs = basicSetListens(newListens, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PREDICATE_LISTEN__LISTENS, newListens, newListens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PREDICATE_LISTEN__LISTENS:
				return basicSetListens(null, msgs);
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
			case ModelPackage.PREDICATE_LISTEN__LISTENS:
				return getListens();
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
			case ModelPackage.PREDICATE_LISTEN__LISTENS:
				setListens((Predicate)newValue);
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
			case ModelPackage.PREDICATE_LISTEN__LISTENS:
				setListens((Predicate)null);
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
			case ModelPackage.PREDICATE_LISTEN__LISTENS:
				return listens != null;
		}
		return super.eIsSet(featureID);
	}

} //PredicateListenImpl
