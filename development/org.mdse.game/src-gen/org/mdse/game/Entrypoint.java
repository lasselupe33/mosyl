/**
 */
package org.mdse.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entrypoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.Entrypoint#getInput <em>Input</em>}</li>
 *   <li>{@link org.mdse.game.Entrypoint#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.mdse.game.GamePackage#getEntrypoint()
 * @model
 * @generated
 */
public interface Entrypoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(UsedInput)
	 * @see org.mdse.game.GamePackage#getEntrypoint_Input()
	 * @model containment="true"
	 * @generated
	 */
	UsedInput getInput();

	/**
	 * Sets the value of the '{@link org.mdse.game.Entrypoint#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(UsedInput value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(UsedStatement)
	 * @see org.mdse.game.GamePackage#getEntrypoint_Statement()
	 * @model containment="true"
	 * @generated
	 */
	UsedStatement getStatement();

	/**
	 * Sets the value of the '{@link org.mdse.game.Entrypoint#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(UsedStatement value);

} // Entrypoint
