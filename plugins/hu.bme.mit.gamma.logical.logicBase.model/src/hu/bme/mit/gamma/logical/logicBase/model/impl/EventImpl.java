/**
 */
package hu.bme.mit.gamma.logical.logicBase.model.impl;

import hu.bme.mit.gamma.logical.logicBase.model.Event;
import hu.bme.mit.gamma.logical.logicBase.model.EventDirection;
import hu.bme.mit.gamma.logical.logicBase.model.ModelPackage;
import hu.bme.mit.gamma.logical.logicBase.model.ValueType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicBase.model.impl.EventImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link hu.bme.mit.gamma.logical.logicBase.model.impl.EventImpl#getExtraValueType <em>Extra Value Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventImpl extends NamedObjectImpl implements Event {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final EventDirection DIRECTION_EDEFAULT = EventDirection.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected EventDirection direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraValueType() <em>Extra Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraValueType()
	 * @generated
	 * @ordered
	 */
	protected static final ValueType EXTRA_VALUE_TYPE_EDEFAULT = ValueType.INTEGER;

	/**
	 * The cached value of the '{@link #getExtraValueType() <em>Extra Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraValueType()
	 * @generated
	 * @ordered
	 */
	protected ValueType extraValueType = EXTRA_VALUE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(EventDirection newDirection) {
		EventDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType getExtraValueType() {
		return extraValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraValueType(ValueType newExtraValueType) {
		ValueType oldExtraValueType = extraValueType;
		extraValueType = newExtraValueType == null ? EXTRA_VALUE_TYPE_EDEFAULT : newExtraValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EVENT__EXTRA_VALUE_TYPE, oldExtraValueType, extraValueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EVENT__DIRECTION:
				return getDirection();
			case ModelPackage.EVENT__EXTRA_VALUE_TYPE:
				return getExtraValueType();
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
			case ModelPackage.EVENT__DIRECTION:
				setDirection((EventDirection)newValue);
				return;
			case ModelPackage.EVENT__EXTRA_VALUE_TYPE:
				setExtraValueType((ValueType)newValue);
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
			case ModelPackage.EVENT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case ModelPackage.EVENT__EXTRA_VALUE_TYPE:
				setExtraValueType(EXTRA_VALUE_TYPE_EDEFAULT);
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
			case ModelPackage.EVENT__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case ModelPackage.EVENT__EXTRA_VALUE_TYPE:
				return extraValueType != EXTRA_VALUE_TYPE_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (direction: ");
		result.append(direction);
		result.append(", extraValueType: ");
		result.append(extraValueType);
		result.append(')');
		return result.toString();
	}

} //EventImpl
