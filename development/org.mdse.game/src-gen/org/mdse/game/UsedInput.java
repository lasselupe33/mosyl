/**
 */
package org.mdse.game;

import org.eclipse.emf.ecore.EObject;

import org.mdse.puzzle.Input;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Used Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.UsedInput#getNextStatement <em>Next Statement</em>}</li>
 *   <li>{@link org.mdse.game.UsedInput#getInput <em>Input</em>}</li>
 *   <li>{@link org.mdse.game.UsedInput#getNextInput <em>Next Input</em>}</li>
 * </ul>
 *
 * @see org.mdse.game.GamePackage#getUsedInput()
 * @model
 * @generated
 */
public interface UsedInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Statement</em>' containment reference.
	 * @see #setNextStatement(UsedStatement)
	 * @see org.mdse.game.GamePackage#getUsedInput_NextStatement()
	 * @model containment="true"
	 * @generated
	 */
	UsedStatement getNextStatement();

	/**
	 * Sets the value of the '{@link org.mdse.game.UsedInput#getNextStatement <em>Next Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Statement</em>' containment reference.
	 * @see #getNextStatement()
	 * @generated
	 */
	void setNextStatement(UsedStatement value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(Input)
	 * @see org.mdse.game.GamePackage#getUsedInput_Input()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Input getInput();

	/**
	 * Sets the value of the '{@link org.mdse.game.UsedInput#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Input value);

	/**
	 * Returns the value of the '<em><b>Next Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Input</em>' containment reference.
	 * @see #setNextInput(UsedInput)
	 * @see org.mdse.game.GamePackage#getUsedInput_NextInput()
	 * @model containment="true"
	 * @generated
	 */
	UsedInput getNextInput();

	/**
	 * Sets the value of the '{@link org.mdse.game.UsedInput#getNextInput <em>Next Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Input</em>' containment reference.
	 * @see #getNextInput()
	 * @generated
	 */
	void setNextInput(UsedInput value);

} // UsedInput
