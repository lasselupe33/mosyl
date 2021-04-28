/**
 */
package org.mdse.puzzle;

import org.eclipse.emf.ecore.EObject;

import org.mdse.constructs.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allowed Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.puzzle.AllowedStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.mdse.puzzle.PuzzlePackage#getAllowedStatement()
 * @model
 * @generated
 */
public interface AllowedStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Statement)
	 * @see org.mdse.puzzle.PuzzlePackage#getAllowedStatement_Statement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link org.mdse.puzzle.AllowedStatement#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

} // AllowedStatement
