/**
 */
package hu.bme.mit.gamma.logical.logicBase.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.gamma.logical.logicBase.model.Predicate#getListens <em>Listens</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.gamma.logical.logicBase.model.ModelPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends EObject {
	/**
	 * Returns the value of the '<em><b>Listens</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listens</em>' reference.
	 * @see #setListens(Event)
	 * @see hu.bme.mit.gamma.logical.logicBase.model.ModelPackage#getPredicate_Listens()
	 * @model required="true"
	 * @generated
	 */
	Event getListens();

	/**
	 * Sets the value of the '{@link hu.bme.mit.gamma.logical.logicBase.model.Predicate#getListens <em>Listens</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listens</em>' reference.
	 * @see #getListens()
	 * @generated
	 */
	void setListens(Event value);

} // Predicate
