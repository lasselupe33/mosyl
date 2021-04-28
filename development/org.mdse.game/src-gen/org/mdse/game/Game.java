/**
 */
package org.mdse.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link org.mdse.game.Game#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link org.mdse.game.Game#getTests <em>Tests</em>}</li>
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

} // Game
