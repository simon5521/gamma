/**
 */
package hu.bme.mit.gamma.logical.logicBase.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.gamma.logical.logicBase.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mit.bme.hu/gamma/logical/logicBase/Model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.gamma.logical.logicBase.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicBase.model.impl.NamedObjectImpl <em>Named Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.NamedObjectImpl
	 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getNamedObject()
	 * @generated
	 */
	int NAMED_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OBJECT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicBase.model.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.EventImpl
	 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NAMED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DIRECTION = NAMED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extra Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EXTRA_VALUE_TYPE = NAMED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NAMED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = NAMED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicBase.model.impl.LogicInterfaceSpecificationImpl <em>Logic Interface Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.LogicInterfaceSpecificationImpl
	 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getLogicInterfaceSpecification()
	 * @generated
	 */
	int LOGIC_INTERFACE_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_INTERFACE_SPECIFICATION__NAME = NAMED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_INTERFACE_SPECIFICATION__EVENTS = NAMED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logic Interface Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_INTERFACE_SPECIFICATION_FEATURE_COUNT = NAMED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logic Interface Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_INTERFACE_SPECIFICATION_OPERATION_COUNT = NAMED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicBase.model.impl.LogicalDiagramImpl <em>Logical Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.LogicalDiagramImpl
	 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getLogicalDiagram()
	 * @generated
	 */
	int LOGICAL_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIAGRAM__NAME = NAMED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIAGRAM__INTERFACES = NAMED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIAGRAM_FEATURE_COUNT = NAMED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logical Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_DIAGRAM_OPERATION_COUNT = NAMED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicBase.model.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.PredicateImpl
	 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 3;

	/**
	 * The feature id for the '<em><b>Listens</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE__LISTENS = 0;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicBase.model.EventDirection <em>Event Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicBase.model.EventDirection
	 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getEventDirection()
	 * @generated
	 */
	int EVENT_DIRECTION = 5;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicBase.model.ValueType <em>Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicBase.model.ValueType
	 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicBase.model.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.gamma.logical.logicBase.model.Event#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.Event#getDirection()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Direction();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.gamma.logical.logicBase.model.Event#getExtraValueType <em>Extra Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Value Type</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.Event#getExtraValueType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_ExtraValueType();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicBase.model.LogicInterfaceSpecification <em>Logic Interface Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Interface Specification</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.LogicInterfaceSpecification
	 * @generated
	 */
	EClass getLogicInterfaceSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.gamma.logical.logicBase.model.LogicInterfaceSpecification#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.LogicInterfaceSpecification#getEvents()
	 * @see #getLogicInterfaceSpecification()
	 * @generated
	 */
	EReference getLogicInterfaceSpecification_Events();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicBase.model.LogicalDiagram <em>Logical Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Diagram</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.LogicalDiagram
	 * @generated
	 */
	EClass getLogicalDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.gamma.logical.logicBase.model.LogicalDiagram#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.LogicalDiagram#getInterfaces()
	 * @see #getLogicalDiagram()
	 * @generated
	 */
	EReference getLogicalDiagram_Interfaces();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicBase.model.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.gamma.logical.logicBase.model.Predicate#getListens <em>Listens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Listens</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.Predicate#getListens()
	 * @see #getPredicate()
	 * @generated
	 */
	EReference getPredicate_Listens();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicBase.model.NamedObject <em>Named Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Object</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.NamedObject
	 * @generated
	 */
	EClass getNamedObject();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.gamma.logical.logicBase.model.NamedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.NamedObject#getName()
	 * @see #getNamedObject()
	 * @generated
	 */
	EAttribute getNamedObject_Name();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.gamma.logical.logicBase.model.EventDirection <em>Event Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Direction</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.EventDirection
	 * @generated
	 */
	EEnum getEventDirection();

	/**
	 * Returns the meta object for enum '{@link hu.bme.mit.gamma.logical.logicBase.model.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Type</em>'.
	 * @see hu.bme.mit.gamma.logical.logicBase.model.ValueType
	 * @generated
	 */
	EEnum getValueType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicBase.model.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.EventImpl
		 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DIRECTION = eINSTANCE.getEvent_Direction();

		/**
		 * The meta object literal for the '<em><b>Extra Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EXTRA_VALUE_TYPE = eINSTANCE.getEvent_ExtraValueType();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicBase.model.impl.LogicInterfaceSpecificationImpl <em>Logic Interface Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.LogicInterfaceSpecificationImpl
		 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getLogicInterfaceSpecification()
		 * @generated
		 */
		EClass LOGIC_INTERFACE_SPECIFICATION = eINSTANCE.getLogicInterfaceSpecification();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_INTERFACE_SPECIFICATION__EVENTS = eINSTANCE.getLogicInterfaceSpecification_Events();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicBase.model.impl.LogicalDiagramImpl <em>Logical Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.LogicalDiagramImpl
		 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getLogicalDiagram()
		 * @generated
		 */
		EClass LOGICAL_DIAGRAM = eINSTANCE.getLogicalDiagram();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_DIAGRAM__INTERFACES = eINSTANCE.getLogicalDiagram_Interfaces();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicBase.model.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.PredicateImpl
		 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '<em><b>Listens</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE__LISTENS = eINSTANCE.getPredicate_Listens();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicBase.model.impl.NamedObjectImpl <em>Named Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.NamedObjectImpl
		 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getNamedObject()
		 * @generated
		 */
		EClass NAMED_OBJECT = eINSTANCE.getNamedObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_OBJECT__NAME = eINSTANCE.getNamedObject_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicBase.model.EventDirection <em>Event Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicBase.model.EventDirection
		 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getEventDirection()
		 * @generated
		 */
		EEnum EVENT_DIRECTION = eINSTANCE.getEventDirection();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicBase.model.ValueType <em>Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicBase.model.ValueType
		 * @see hu.bme.mit.gamma.logical.logicBase.model.impl.ModelPackageImpl#getValueType()
		 * @generated
		 */
		EEnum VALUE_TYPE = eINSTANCE.getValueType();

	}

} //ModelPackage
