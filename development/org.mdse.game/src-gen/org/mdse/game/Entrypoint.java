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
 *   <li>{@link org.mdse.game.Entrypoint#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.mdse.game.Entrypoint#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.mdse.game.GamePackage#getEntrypoint()
 * @model
 * @generated
 */
public interface Entrypoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(GameInputs)
	 * @see org.mdse.game.GamePackage#getEntrypoint_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	GameInputs getInputs();

	/**
	 * Sets the value of the '{@link org.mdse.game.Entrypoint#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(GameInputs value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(GameStatement)
	 * @see org.mdse.game.GamePackage#getEntrypoint_Statement()
	 * @model containment="true"
	 * @generated
	 */
	GameStatement getStatement();

	/**
	 * Sets the value of the '{@link org.mdse.game.Entrypoint#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(GameStatement value);

} // Entrypoint
