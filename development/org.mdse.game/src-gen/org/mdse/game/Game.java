/**
 */
package org.mdse.game;

import org.eclipse.emf.ecore.EObject;

import org.mdse.puzzle.Puzzle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.Game#getPuzzle <em>Puzzle</em>}</li>
 *   <li>{@link org.mdse.game.Game#getEntrypoint <em>Entrypoint</em>}</li>
 * </ul>
 *
 * @see org.mdse.game.GamePackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Puzzle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Puzzle</em>' containment reference.
	 * @see #setPuzzle(Puzzle)
	 * @see org.mdse.game.GamePackage#getGame_Puzzle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Puzzle getPuzzle();

	/**
	 * Sets the value of the '{@link org.mdse.game.Game#getPuzzle <em>Puzzle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puzzle</em>' containment reference.
	 * @see #getPuzzle()
	 * @generated
	 */
	void setPuzzle(Puzzle value);

	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' containment reference.
	 * @see #setEntrypoint(Entrypoint)
	 * @see org.mdse.game.GamePackage#getGame_Entrypoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Entrypoint getEntrypoint();

	/**
	 * Sets the value of the '{@link org.mdse.game.Game#getEntrypoint <em>Entrypoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrypoint</em>' containment reference.
	 * @see #getEntrypoint()
	 * @generated
	 */
	void setEntrypoint(Entrypoint value);

} // Game
