/**
 */
package org.mdse.game;

import org.eclipse.emf.ecore.EObject;

import org.mdse.constructs.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.GameStatement#getNextStatement <em>Next Statement</em>}</li>
 *   <li>{@link org.mdse.game.GameStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.mdse.game.GamePackage#getGameStatement()
 * @model
 * @generated
 */
public interface GameStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Statement</em>' containment reference.
	 * @see #setNextStatement(GameStatement)
	 * @see org.mdse.game.GamePackage#getGameStatement_NextStatement()
	 * @model containment="true"
	 * @generated
	 */
	GameStatement getNextStatement();

	/**
	 * Sets the value of the '{@link org.mdse.game.GameStatement#getNextStatement <em>Next Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Statement</em>' containment reference.
	 * @see #getNextStatement()
	 * @generated
	 */
	void setNextStatement(GameStatement value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Statement)
	 * @see org.mdse.game.GamePackage#getGameStatement_Statement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link org.mdse.game.GameStatement#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

} // GameStatement
