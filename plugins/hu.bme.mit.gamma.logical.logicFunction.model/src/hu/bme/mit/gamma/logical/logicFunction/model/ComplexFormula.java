/**
 */
package hu.bme.mit.gamma.logical.logicFunction.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicFunction.model.ComplexFormula#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getComplexFormula()
 * @model abstract="true"
 * @generated
 */
public interface ComplexFormula extends Formula {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.gamma.logical.logicFunction.model.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getComplexFormula_Arguments()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getArguments();

} // ComplexFormula
