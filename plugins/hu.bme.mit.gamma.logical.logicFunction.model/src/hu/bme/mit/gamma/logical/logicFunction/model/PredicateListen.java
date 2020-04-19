/**
 */
package hu.bme.mit.gamma.logical.logicFunction.model;

import hu.bme.mit.gamma.logical.logicBase.model.Predicate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Listen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicFunction.model.PredicateListen#getListens <em>Listens</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getPredicateListen()
 * @model
 * @generated
 */
public interface PredicateListen extends Atomic {
	/**
	 * Returns the value of the '<em><b>Listens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listens</em>' containment reference.
	 * @see #setListens(Predicate)
	 * @see hu.bme.mit.gamma.logical.logicFunction.model.ModelPackage#getPredicateListen_Listens()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Predicate getListens();

	/**
	 * Sets the value of the '{@link hu.bme.mit.gamma.logical.logicFunction.model.PredicateListen#getListens <em>Listens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listens</em>' containment reference.
	 * @see #getListens()
	 * @generated
	 */
	void setListens(Predicate value);

} // PredicateListen
