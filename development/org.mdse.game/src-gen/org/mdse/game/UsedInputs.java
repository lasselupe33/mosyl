/**
 */
package org.mdse.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Used Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.UsedInputs#getNextStatement <em>Next Statement</em>}</li>
 * </ul>
 *
 * @see org.mdse.game.GamePackage#getUsedInputs()
 * @model
 * @generated
 */
public interface UsedInputs extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Statement</em>' containment reference.
	 * @see #setNextStatement(UsedStatement)
	 * @see org.mdse.game.GamePackage#getUsedInputs_NextStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UsedStatement getNextStatement();

	/**
	 * Sets the value of the '{@link org.mdse.game.UsedInputs#getNextStatement <em>Next Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Statement</em>' containment reference.
	 * @see #getNextStatement()
	 * @generated
	 */
	void setNextStatement(UsedStatement value);

} // UsedInputs
