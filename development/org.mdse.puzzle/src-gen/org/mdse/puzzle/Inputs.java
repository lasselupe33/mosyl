/**
 */
package org.mdse.puzzle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.mdse.constructs.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.puzzle.Inputs#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see org.mdse.puzzle.PuzzlePackage#getInputs()
 * @model
 * @generated
 */
public interface Inputs extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.constructs.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.mdse.puzzle.PuzzlePackage#getInputs_Variables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // Inputs
