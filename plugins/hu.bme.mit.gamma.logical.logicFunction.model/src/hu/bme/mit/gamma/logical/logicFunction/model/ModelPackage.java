/**
 */
package hu.bme.mit.gamma.logical.logicFunction.model;

import org.eclipse.emf.ecore.EClass;
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
 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelFactory
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
	String eNS_URI = "http://www.mit.bme.hu/gamma/logical/logicFunction/Model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hu.bme.mit.gamma.logical.logicFunction.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ExpressionImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.FormulaImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 1;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.ComplexFormulaImpl <em>Complex Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ComplexFormulaImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getComplexFormula()
	 * @generated
	 */
	int COMPLEX_FORMULA = 11;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FORMULA__ARGUMENTS = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FORMULA_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_FORMULA_OPERATION_COUNT = FORMULA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.ANDImpl <em>AND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ANDImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getAND()
	 * @generated
	 */
	int AND = 2;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ARGUMENTS = COMPLEX_FORMULA__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = COMPLEX_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = COMPLEX_FORMULA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.ORImpl <em>OR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ORImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getOR()
	 * @generated
	 */
	int OR = 3;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ARGUMENTS = COMPLEX_FORMULA__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = COMPLEX_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = COMPLEX_FORMULA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.AtomicImpl <em>Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.AtomicImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getAtomic()
	 * @generated
	 */
	int ATOMIC = 6;

	/**
	 * The number of structural features of the '<em>Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.PredicateListenImpl <em>Predicate Listen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.PredicateListenImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getPredicateListen()
	 * @generated
	 */
	int PREDICATE_LISTEN = 4;

	/**
	 * The feature id for the '<em><b>Listens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LISTEN__LISTENS = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predicate Listen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LISTEN_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predicate Listen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_LISTEN_OPERATION_COUNT = ATOMIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.RuleImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = hu.bme.mit.gamma.logical.logicBase.model.ModelPackage.NAMED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EXPRESSION = hu.bme.mit.gamma.logical.logicBase.model.ModelPackage.NAMED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Raises</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RAISES = hu.bme.mit.gamma.logical.logicBase.model.ModelPackage.NAMED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = hu.bme.mit.gamma.logical.logicBase.model.ModelPackage.NAMED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = hu.bme.mit.gamma.logical.logicBase.model.ModelPackage.NAMED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.RuleListenImpl <em>Rule Listen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.RuleListenImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getRuleListen()
	 * @generated
	 */
	int RULE_LISTEN = 7;

	/**
	 * The feature id for the '<em><b>Listens</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_LISTEN__LISTENS = ATOMIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Listen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_LISTEN_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rule Listen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_LISTEN_OPERATION_COUNT = ATOMIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.LogicFunctionDiagramImpl <em>Logic Function Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.LogicFunctionDiagramImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getLogicFunctionDiagram()
	 * @generated
	 */
	int LOGIC_FUNCTION_DIAGRAM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FUNCTION_DIAGRAM__NAME = hu.bme.mit.gamma.logical.logicBase.model.ModelPackage.LOGICAL_DIAGRAM__NAME;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FUNCTION_DIAGRAM__INTERFACES = hu.bme.mit.gamma.logical.logicBase.model.ModelPackage.LOGICAL_DIAGRAM__INTERFACES;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FUNCTION_DIAGRAM__RULE = hu.bme.mit.gamma.logical.logicBase.model.ModelPackage.LOGICAL_DIAGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logic Function Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FUNCTION_DIAGRAM_FEATURE_COUNT = hu.bme.mit.gamma.logical.logicBase.model.ModelPackage.LOGICAL_DIAGRAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Logic Function Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FUNCTION_DIAGRAM_OPERATION_COUNT = hu.bme.mit.gamma.logical.logicBase.model.ModelPackage.LOGICAL_DIAGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.UnaryFormulaImpl <em>Unary Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.UnaryFormulaImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getUnaryFormula()
	 * @generated
	 */
	int UNARY_FORMULA = 12;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FORMULA__ARGUMENT = FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FORMULA_FEATURE_COUNT = FORMULA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FORMULA_OPERATION_COUNT = FORMULA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.NOTImpl <em>NOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.NOTImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getNOT()
	 * @generated
	 */
	int NOT = 9;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__ARGUMENT = UNARY_FORMULA__ARGUMENT;

	/**
	 * The number of structural features of the '<em>NOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = UNARY_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = UNARY_FORMULA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.XORImpl <em>XOR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.XORImpl
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getXOR()
	 * @generated
	 */
	int XOR = 10;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__ARGUMENTS = COMPLEX_FORMULA__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = COMPLEX_FORMULA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XOR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = COMPLEX_FORMULA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.AND
	 * @generated
	 */
	EClass getAND();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.OR
	 * @generated
	 */
	EClass getOR();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.PredicateListen <em>Predicate Listen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate Listen</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.PredicateListen
	 * @generated
	 */
	EClass getPredicateListen();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.gamma.logical.logicFunction.model.PredicateListen#getListens <em>Listens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listens</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.PredicateListen#getListens()
	 * @see #getPredicateListen()
	 * @generated
	 */
	EReference getPredicateListen_Listens();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.gamma.logical.logicFunction.model.Rule#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.Rule#getExpression()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Expression();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.gamma.logical.logicFunction.model.Rule#getRaises <em>Raises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Raises</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.Rule#getRaises()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Raises();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.Atomic <em>Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.Atomic
	 * @generated
	 */
	EClass getAtomic();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.RuleListen <em>Rule Listen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Listen</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.RuleListen
	 * @generated
	 */
	EClass getRuleListen();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.gamma.logical.logicFunction.model.RuleListen#getListens <em>Listens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Listens</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.RuleListen#getListens()
	 * @see #getRuleListen()
	 * @generated
	 */
	EReference getRuleListen_Listens();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.LogicFunctionDiagram <em>Logic Function Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Function Diagram</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.LogicFunctionDiagram
	 * @generated
	 */
	EClass getLogicFunctionDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.gamma.logical.logicFunction.model.LogicFunctionDiagram#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.LogicFunctionDiagram#getRule()
	 * @see #getLogicFunctionDiagram()
	 * @generated
	 */
	EReference getLogicFunctionDiagram_Rule();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.NOT <em>NOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOT</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.NOT
	 * @generated
	 */
	EClass getNOT();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XOR</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.XOR
	 * @generated
	 */
	EClass getXOR();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.ComplexFormula <em>Complex Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Formula</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.ComplexFormula
	 * @generated
	 */
	EClass getComplexFormula();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.gamma.logical.logicFunction.model.ComplexFormula#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.ComplexFormula#getArguments()
	 * @see #getComplexFormula()
	 * @generated
	 */
	EReference getComplexFormula_Arguments();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.gamma.logical.logicFunction.model.UnaryFormula <em>Unary Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Formula</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.UnaryFormula
	 * @generated
	 */
	EClass getUnaryFormula();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.gamma.logical.logicFunction.model.UnaryFormula#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.UnaryFormula#getArgument()
	 * @see #getUnaryFormula()
	 * @generated
	 */
	EReference getUnaryFormula_Argument();

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
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ExpressionImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.FormulaImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.ANDImpl <em>AND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ANDImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getAND()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAND();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.ORImpl <em>OR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ORImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getOR()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOR();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.PredicateListenImpl <em>Predicate Listen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.PredicateListenImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getPredicateListen()
		 * @generated
		 */
		EClass PREDICATE_LISTEN = eINSTANCE.getPredicateListen();

		/**
		 * The meta object literal for the '<em><b>Listens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICATE_LISTEN__LISTENS = eINSTANCE.getPredicateListen_Listens();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.RuleImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__EXPRESSION = eINSTANCE.getRule_Expression();

		/**
		 * The meta object literal for the '<em><b>Raises</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RAISES = eINSTANCE.getRule_Raises();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.AtomicImpl <em>Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.AtomicImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getAtomic()
		 * @generated
		 */
		EClass ATOMIC = eINSTANCE.getAtomic();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.RuleListenImpl <em>Rule Listen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.RuleListenImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getRuleListen()
		 * @generated
		 */
		EClass RULE_LISTEN = eINSTANCE.getRuleListen();

		/**
		 * The meta object literal for the '<em><b>Listens</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_LISTEN__LISTENS = eINSTANCE.getRuleListen_Listens();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.LogicFunctionDiagramImpl <em>Logic Function Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.LogicFunctionDiagramImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getLogicFunctionDiagram()
		 * @generated
		 */
		EClass LOGIC_FUNCTION_DIAGRAM = eINSTANCE.getLogicFunctionDiagram();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC_FUNCTION_DIAGRAM__RULE = eINSTANCE.getLogicFunctionDiagram_Rule();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.NOTImpl <em>NOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.NOTImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getNOT()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNOT();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.XORImpl <em>XOR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.XORImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getXOR()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXOR();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.ComplexFormulaImpl <em>Complex Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ComplexFormulaImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getComplexFormula()
		 * @generated
		 */
		EClass COMPLEX_FORMULA = eINSTANCE.getComplexFormula();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_FORMULA__ARGUMENTS = eINSTANCE.getComplexFormula_Arguments();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.gamma.logical.logicFunction.model.impl.UnaryFormulaImpl <em>Unary Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.UnaryFormulaImpl
		 * @see hu.bme.mit.gamma.logical.logicFunction.model.impl.ModelPackageImpl#getUnaryFormula()
		 * @generated
		 */
		EClass UNARY_FORMULA = eINSTANCE.getUnaryFormula();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_FORMULA__ARGUMENT = eINSTANCE.getUnaryFormula_Argument();

	}

} //ModelPackage
