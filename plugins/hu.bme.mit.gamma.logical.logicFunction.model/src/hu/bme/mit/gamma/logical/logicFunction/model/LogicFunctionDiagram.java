/**
 */
package hu.bme.mit.gamma.logical.logicFunction.model;

import hu.bme.mit.gamma.logical.logicBase.model.LogicalDiagram;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Function Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicFunction.model.LogicFunctionDiagram#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getLogicFunctionDiagram()
 * @model
 * @generated
 */
public interface LogicFunctionDiagram extends LogicalDiagram {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.gamma.logical.logicFunction.model.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getLogicFunctionDiagram_Rule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRule();

} // LogicFunctionDiagram
