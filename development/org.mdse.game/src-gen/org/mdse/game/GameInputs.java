/**
 */
package org.mdse.game;

import org.eclipse.emf.ecore.EObject;

import org.mdse.puzzle.Inputs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.GameInputs#getNextStatement <em>Next Statement</em>}</li>
 *   <li>{@link org.mdse.game.GameInputs#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see org.mdse.game.GamePackage#getGameInputs()
 * @model
 * @generated
 */
public interface GameInputs extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Statement</em>' containment reference.
	 * @see #setNextStatement(GameStatement)
	 * @see org.mdse.game.GamePackage#getGameInputs_NextStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GameStatement getNextStatement();

	/**
	 * Sets the value of the '{@link org.mdse.game.GameInputs#getNextStatement <em>Next Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Statement</em>' containment reference.
	 * @see #getNextStatement()
	 * @generated
	 */
	void setNextStatement(GameStatement value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(Inputs)
	 * @see org.mdse.game.GamePackage#getGameInputs_Inputs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Inputs getInputs();

	/**
	 * Sets the value of the '{@link org.mdse.game.GameInputs#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(Inputs value);

} // GameInputs
