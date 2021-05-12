/**
 */
package org.mdse.constructs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.constructs.BinaryExpression#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link org.mdse.constructs.BinaryExpression#getExpression2 <em>Expression2</em>}</li>
 * </ul>
 *
 * @see org.mdse.constructs.ConstructsPackage#getBinaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression1</em>' containment reference.
	 * @see #setExpression1(Expression)
	 * @see org.mdse.constructs.ConstructsPackage#getBinaryExpression_Expression1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression1();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.BinaryExpression#getExpression1 <em>Expression1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression1</em>' containment reference.
	 * @see #getExpression1()
	 * @generated
	 */
	void setExpression1(Expression value);

	/**
	 * Returns the value of the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression2</em>' containment reference.
	 * @see #setExpression2(Expression)
	 * @see org.mdse.constructs.ConstructsPackage#getBinaryExpression_Expression2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression2();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.BinaryExpression#getExpression2 <em>Expression2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression2</em>' containment reference.
	 * @see #getExpression2()
	 * @generated
	 */
	void setExpression2(Expression value);

} // BinaryExpression
