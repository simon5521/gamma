/**
 */
package hu.bme.mit.gamma.logical.logicFunction.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Listen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicFunction.model.RuleListen#getListens <em>Listens</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getRuleListen()
 * @model
 * @generated
 */
public interface RuleListen extends Atomic {
	/**
	 * Returns the value of the '<em><b>Listens</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listens</em>' reference.
	 * @see #setListens(Rule)
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getRuleListen_Listens()
	 * @model
	 * @generated
	 */
	Rule getListens();

	/**
	 * Sets the value of the '{@link hu.bme.mit.gamma.logical.logicFunction.model.RuleListen#getListens <em>Listens</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listens</em>' reference.
	 * @see #getListens()
	 * @generated
	 */
	void setListens(Rule value);

} // RuleListen
