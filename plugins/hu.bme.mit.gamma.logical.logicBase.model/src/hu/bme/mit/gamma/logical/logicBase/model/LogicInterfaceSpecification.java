/**
 */
package hu.bme.mit.gamma.logical.logicBase.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Interface Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicBase.model.LogicInterfaceSpecification#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.gamma.logical.logicBase.model.ModelPackage#getLogicInterfaceSpecification()
 * @model
 * @generated
 */
public interface LogicInterfaceSpecification extends NamedObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.gamma.logical.logicBase.model.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.ModelPackage#getLogicInterfaceSpecification_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

} // LogicInterfaceSpecification
