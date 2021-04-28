/**
 */
package org.mdse.constructs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Else Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.constructs.IfElseStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.mdse.constructs.IfElseStatement#getElseStatement <em>Else Statement</em>}</li>
 *   <li>{@link org.mdse.constructs.IfElseStatement#getIfStatement <em>If Statement</em>}</li>
 * </ul>
 *
 * @see org.mdse.constructs.ConstructsPackage#getIfElseStatement()
 * @model
 * @generated
 */
public interface IfElseStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.mdse.constructs.ConstructsPackage#getIfElseStatement_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.IfElseStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Else Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Statement</em>' containment reference.
	 * @see #setElseStatement(Statement)
	 * @see org.mdse.constructs.ConstructsPackage#getIfElseStatement_ElseStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getElseStatement();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.IfElseStatement#getElseStatement <em>Else Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Statement</em>' containment reference.
	 * @see #getElseStatement()
	 * @generated
	 */
	void setElseStatement(Statement value);

	/**
	 * Returns the value of the '<em><b>If Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Statement</em>' containment reference.
	 * @see #setIfStatement(Statement)
	 * @see org.mdse.constructs.ConstructsPackage#getIfElseStatement_IfStatement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getIfStatement();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.IfElseStatement#getIfStatement <em>If Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Statement</em>' containment reference.
	 * @see #getIfStatement()
	 * @generated
	 */
	void setIfStatement(Statement value);

} // IfElseStatement
