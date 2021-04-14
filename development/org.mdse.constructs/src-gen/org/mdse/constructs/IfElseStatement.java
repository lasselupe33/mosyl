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
 *   <li>{@link org.mdse.constructs.IfElseStatement#getStatement2 <em>Statement2</em>}</li>
 *   <li>{@link org.mdse.constructs.IfElseStatement#getStatement1 <em>Statement1</em>}</li>
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
	 * Returns the value of the '<em><b>Statement2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement2</em>' containment reference.
	 * @see #setStatement2(Statement)
	 * @see org.mdse.constructs.ConstructsPackage#getIfElseStatement_Statement2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getStatement2();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.IfElseStatement#getStatement2 <em>Statement2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement2</em>' containment reference.
	 * @see #getStatement2()
	 * @generated
	 */
	void setStatement2(Statement value);

	/**
	 * Returns the value of the '<em><b>Statement1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement1</em>' containment reference.
	 * @see #setStatement1(Statement)
	 * @see org.mdse.constructs.ConstructsPackage#getIfElseStatement_Statement1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getStatement1();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.IfElseStatement#getStatement1 <em>Statement1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement1</em>' containment reference.
	 * @see #getStatement1()
	 * @generated
	 */
	void setStatement1(Statement value);

} // IfElseStatement
