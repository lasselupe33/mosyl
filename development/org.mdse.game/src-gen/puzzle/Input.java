/**
 */
package puzzle;

import constructs.DeclareStatement;

import org.eclipse.emf.ecore.EObject;

import org.mdse.game.UsedStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link puzzle.Input#getNextStatement <em>Next Statement</em>}</li>
 *   <li>{@link puzzle.Input#getDeclareStatement <em>Declare Statement</em>}</li>
 * </ul>
 *
 * @see puzzle.PuzzlePackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Statement</em>' reference.
	 * @see #setNextStatement(UsedStatement)
	 * @see puzzle.PuzzlePackage#getInput_NextStatement()
	 * @model required="true"
	 * @generated
	 */
	UsedStatement getNextStatement();

	/**
	 * Sets the value of the '{@link puzzle.Input#getNextStatement <em>Next Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Statement</em>' reference.
	 * @see #getNextStatement()
	 * @generated
	 */
	void setNextStatement(UsedStatement value);

	/**
	 * Returns the value of the '<em><b>Declare Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declare Statement</em>' containment reference.
	 * @see #setDeclareStatement(DeclareStatement)
	 * @see puzzle.PuzzlePackage#getInput_DeclareStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeclareStatement getDeclareStatement();

	/**
	 * Sets the value of the '{@link puzzle.Input#getDeclareStatement <em>Declare Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declare Statement</em>' containment reference.
	 * @see #getDeclareStatement()
	 * @generated
	 */
	void setDeclareStatement(DeclareStatement value);

} // Input