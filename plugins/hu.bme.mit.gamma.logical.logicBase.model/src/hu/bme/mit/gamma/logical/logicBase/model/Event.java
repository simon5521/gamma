/**
 */
package hu.bme.mit.gamma.logical.logicBase.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicBase.model.Event#getDirection <em>Direction</em>}</li>
 *   <li>{@link hu.bme.mit.gamma.logical.logicBase.model.Event#getExtraValueType <em>Extra Value Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.gamma.logical.logicBase.model.ModelPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends NamedObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.gamma.logical.logicBase.model.EventDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.EventDirection
	 * @see #setDirection(EventDirection)
	 * @see hu.bme.mit.gamma.logical.logicBase.model.ModelPackage#getEvent_Direction()
	 * @model required="true"
	 * @generated
	 */
	EventDirection getDirection();

	/**
	 * Sets the value of the '{@link hu.bme.mit.gamma.logical.logicBase.model.Event#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.EventDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(EventDirection value);

	/**
	 * Returns the value of the '<em><b>Extra Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.gamma.logical.logicBase.model.ValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Value Type</em>' attribute.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.ValueType
	 * @see #setExtraValueType(ValueType)
	 * @see hu.bme.mit.gamma.logical.logicBase.model.ModelPackage#getEvent_ExtraValueType()
	 * @model
	 * @generated
	 */
	ValueType getExtraValueType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.gamma.logical.logicBase.model.Event#getExtraValueType <em>Extra Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Value Type</em>' attribute.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.ValueType
	 * @see #getExtraValueType()
	 * @generated
	 */
	void setExtraValueType(ValueType value);

} // Event
