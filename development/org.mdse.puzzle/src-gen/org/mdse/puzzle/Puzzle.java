/**
 */
package org.mdse.puzzle;

import constructs.Statement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puzzle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.puzzle.Puzzle#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.puzzle.Puzzle#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mdse.puzzle.Puzzle#getTests <em>Tests</em>}</li>
 *   <li>{@link org.mdse.puzzle.Puzzle#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.mdse.puzzle.Puzzle#getAllowedStatements <em>Allowed Statements</em>}</li>
 * </ul>
 *
 * @see org.mdse.puzzle.PuzzlePackage#getPuzzle()
 * @model
 * @generated
 */
public interface Puzzle extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mdse.puzzle.PuzzlePackage#getPuzzle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mdse.puzzle.Puzzle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.mdse.puzzle.PuzzlePackage#getPuzzle_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.mdse.puzzle.Puzzle#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.puzzle.UnitTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference list.
	 * @see org.mdse.puzzle.PuzzlePackage#getPuzzle_Tests()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UnitTest> getTests();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.puzzle.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.mdse.puzzle.PuzzlePackage#getPuzzle_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Allowed Statements</b></em>' containment reference list.
	 * The list contents are of type {@link constructs.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Statements</em>' containment reference list.
	 * @see org.mdse.puzzle.PuzzlePackage#getPuzzle_AllowedStatements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Statement> getAllowedStatements();

} // Puzzle
