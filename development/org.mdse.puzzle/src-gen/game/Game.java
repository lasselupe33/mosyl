/**
 */
package game;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link game.Game#getPuzzle <em>Puzzle</em>}</li>
 *   <li>{@link game.Game#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getGame()
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
	 * @see game.GamePackage#getGame_Puzzle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Puzzle getPuzzle();

	/**
	 * Sets the value of the '{@link game.Game#getPuzzle <em>Puzzle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Puzzle</em>' containment reference.
	 * @see #getPuzzle()
	 * @generated
	 */
	void setPuzzle(Puzzle value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link game.UsedStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see game.GamePackage#getGame_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UsedStatement> getStatements();

} // Game
