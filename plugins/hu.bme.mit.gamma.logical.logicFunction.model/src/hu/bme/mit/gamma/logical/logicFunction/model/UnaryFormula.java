/**
 */
package hu.bme.mit.gamma.logical.logicFunction.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicFunction.model.UnaryFormula#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getUnaryFormula()
 * @model abstract="true"
 * @generated
 */
public interface UnaryFormula extends Formula {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Expression)
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getUnaryFormula_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getArgument();

	/**
	 * Sets the value of the '{@link hu.bme.mit.gamma.logical.logicFunction.model.UnaryFormula#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Expression value);

} // UnaryFormula
