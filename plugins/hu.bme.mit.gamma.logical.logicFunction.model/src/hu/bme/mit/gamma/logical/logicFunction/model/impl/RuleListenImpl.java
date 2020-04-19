/**
 */
package hu.bme.mit.gamma.logical.logicFunction.model.impl;

import hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage;
import hu.bme.mit.gamma.logical.logicFunction.model.Rule;
import hu.bme.mit.gamma.logical.logicFunction.model.RuleListen;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Listen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.RuleListenImpl#getListens <em>Listens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleListenImpl extends AtomicImpl implements RuleListen {
	/**
	 * The cached value of the '{@link #getListens() <em>Listens</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListens()
	 * @generated
	 * @ordered
	 */
	protected Rule listens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleListenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RULE_LISTEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getListens() {
		if (listens != null && listens.eIsProxy()) {
			InternalEObject oldListens = (InternalEObject)listens;
			listens = (Rule)eResolveProxy(oldListens);
			if (listens != oldListens) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RULE_LISTEN__LISTENS, oldListens, listens));
			}
		}
		return listens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetListens() {
		return listens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListens(Rule newListens) {
		Rule oldListens = listens;
		listens = newListens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RULE_LISTEN__LISTENS, oldListens, listens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RULE_LISTEN__LISTENS:
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
			case ModelPackage.RULE_LISTEN__LISTENS:
				setListens((Rule)newValue);
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
			case ModelPackage.RULE_LISTEN__LISTENS:
				setListens((Rule)null);
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
			case ModelPackage.RULE_LISTEN__LISTENS:
				return listens != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleListenImpl
