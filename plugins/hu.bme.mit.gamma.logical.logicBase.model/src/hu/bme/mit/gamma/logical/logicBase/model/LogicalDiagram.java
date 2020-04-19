/**
 */
package hu.bme.mit.gamma.logical.logicBase.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicBase.model.LogicalDiagram#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.gamma.logical.logicBase.model.ModelPackage#getLogicalDiagram()
 * @model
 * @generated
 */
public interface LogicalDiagram extends NamedObject {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.gamma.logical.logicBase.model.LogicInterfaceSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.ModelPackage#getLogicalDiagram_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicInterfaceSpecification> getInterfaces();

} // LogicalDiagram
