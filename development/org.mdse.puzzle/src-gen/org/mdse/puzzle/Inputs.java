/**
 */
package org.mdse.puzzle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.mdse.constructs.DeclareStatement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.puzzle.Inputs#getDeclareStatement <em>Declare Statement</em>}</li>
 * </ul>
 *
 * @see org.mdse.puzzle.PuzzlePackage#getInputs()
 * @model
 * @generated
 */
public interface Inputs extends EObject {
	/**
	 * Returns the value of the '<em><b>Declare Statement</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.constructs.DeclareStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declare Statement</em>' containment reference list.
	 * @see org.mdse.puzzle.PuzzlePackage#getInputs_DeclareStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DeclareStatement> getDeclareStatement();

} // Inputs
