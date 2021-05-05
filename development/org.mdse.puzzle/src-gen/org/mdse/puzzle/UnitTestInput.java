/**
 */
package org.mdse.puzzle;

import org.eclipse.emf.ecore.EObject;

import org.mdse.constructs.Literal;
import org.mdse.constructs.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Test Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.puzzle.UnitTestInput#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.mdse.puzzle.UnitTestInput#getOverwritingValue <em>Overwriting Value</em>}</li>
 * </ul>
 *
 * @see org.mdse.puzzle.PuzzlePackage#getUnitTestInput()
 * @model
 * @generated
 */
public interface UnitTestInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.mdse.puzzle.PuzzlePackage#getUnitTestInput_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.mdse.puzzle.UnitTestInput#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Overwriting Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overwriting Value</em>' containment reference.
	 * @see #setOverwritingValue(Literal)
	 * @see org.mdse.puzzle.PuzzlePackage#getUnitTestInput_OverwritingValue()
	 * @model containment="true"
	 * @generated
	 */
	Literal getOverwritingValue();

	/**
	 * Sets the value of the '{@link org.mdse.puzzle.UnitTestInput#getOverwritingValue <em>Overwriting Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overwriting Value</em>' containment reference.
	 * @see #getOverwritingValue()
	 * @generated
	 */
	void setOverwritingValue(Literal value);

} // UnitTestInput
