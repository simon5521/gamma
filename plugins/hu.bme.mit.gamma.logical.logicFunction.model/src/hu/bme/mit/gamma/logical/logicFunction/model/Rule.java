/**
 */
package hu.bme.mit.gamma.logical.logicFunction.model;

import hu.bme.mit.gamma.logical.logicBase.model.Event;

import hu.bme.mit.gamma.logical.logicBase.model.NamedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicFunction.model.Rule#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.bme.mit.gamma.logical.logicFunction.model.Rule#getRaises <em>Raises</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends NamedObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getRule_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link hu.bme.mit.gamma.logical.logicFunction.model.Rule#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Raises</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raises</em>' reference.
	 * @see #setRaises(Event)
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getRule_Raises()
	 * @model
	 * @generated
	 */
	Event getRaises();

	/**
	 * Sets the value of the '{@link hu.bme.mit.gamma.logical.logicFunction.model.Rule#getRaises <em>Raises</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raises</em>' reference.
	 * @see #getRaises()
	 * @generated
	 */
	void setRaises(Event value);

} // Rule
