/**
 */
package org.mdse.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.mdse.constructs.ReturnStatement;
import org.mdse.constructs.Statement;

import org.mdse.puzzle.Inputs;
import org.mdse.puzzle.UnitTest;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.game.Game#getName <em>Name</em>}</li>
 *   <li>{@link org.mdse.game.Game#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mdse.game.Game#getTests <em>Tests</em>}</li>
 *   <li>{@link org.mdse.game.Game#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.mdse.game.Game#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.mdse.game.Game#getReturnStatement <em>Return Statement</em>}</li>
 * </ul>
 *
 * @see org.mdse.game.GamePackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mdse.game.GamePackage#getGame_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mdse.game.Game#getName <em>Name</em>}' attribute.
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
	 * @see org.mdse.game.GamePackage#getGame_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.mdse.game.Game#getDescription <em>Description</em>}' attribute.
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
	 * @see org.mdse.game.GamePackage#getGame_Tests()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitTest> getTests();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(Inputs)
	 * @see org.mdse.game.GamePackage#getGame_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	Inputs getInputs();

	/**
	 * Sets the value of the '{@link org.mdse.game.Game#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(Inputs value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.constructs.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.mdse.game.GamePackage#getGame_Statements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Return Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Statement</em>' containment reference.
	 * @see #setReturnStatement(ReturnStatement)
	 * @see org.mdse.game.GamePackage#getGame_ReturnStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReturnStatement getReturnStatement();

	/**
	 * Sets the value of the '{@link org.mdse.game.Game#getReturnStatement <em>Return Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Statement</em>' containment reference.
	 * @see #getReturnStatement()
	 * @generated
	 */
	void setReturnStatement(ReturnStatement value);

} // Game
