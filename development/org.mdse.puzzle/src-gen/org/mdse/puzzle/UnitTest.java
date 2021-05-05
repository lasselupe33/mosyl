/**
 */
package org.mdse.puzzle;

import org.eclipse.emf.ecore.EObject;

import org.mdse.constructs.Literal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.puzzle.UnitTest#getExpected <em>Expected</em>}</li>
 *   <li>{@link org.mdse.puzzle.UnitTest#getFailedMessage <em>Failed Message</em>}</li>
 *   <li>{@link org.mdse.puzzle.UnitTest#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see org.mdse.puzzle.PuzzlePackage#getUnitTest()
 * @model
 * @generated
 */
public interface UnitTest extends EObject {
	/**
	 * Returns the value of the '<em><b>Expected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected</em>' containment reference.
	 * @see #setExpected(Literal)
	 * @see org.mdse.puzzle.PuzzlePackage#getUnitTest_Expected()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getExpected();

	/**
	 * Sets the value of the '{@link org.mdse.puzzle.UnitTest#getExpected <em>Expected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected</em>' containment reference.
	 * @see #getExpected()
	 * @generated
	 */
	void setExpected(Literal value);

	/**
	 * Returns the value of the '<em><b>Failed Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed Message</em>' attribute.
	 * @see #setFailedMessage(String)
	 * @see org.mdse.puzzle.PuzzlePackage#getUnitTest_FailedMessage()
	 * @model
	 * @generated
	 */
	String getFailedMessage();

	/**
	 * Sets the value of the '{@link org.mdse.puzzle.UnitTest#getFailedMessage <em>Failed Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed Message</em>' attribute.
	 * @see #getFailedMessage()
	 * @generated
	 */
	void setFailedMessage(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(Inputs)
	 * @see org.mdse.puzzle.PuzzlePackage#getUnitTest_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	Inputs getInputs();

	/**
	 * Sets the value of the '{@link org.mdse.puzzle.UnitTest#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(Inputs value);

} // UnitTest
