/**
 */
package org.mdse.constructs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.constructs.ComparativeExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.mdse.constructs.ComparativeExpression#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.mdse.constructs.ConstructsPackage#getComparativeExpression()
 * @model
 * @generated
 */
public interface ComparativeExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mdse.constructs.ComparativeOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.mdse.constructs.ComparativeOperator
	 * @see #setOperator(ComparativeOperator)
	 * @see org.mdse.constructs.ConstructsPackage#getComparativeExpression_Operator()
	 * @model
	 * @generated
	 */
	ComparativeOperator getOperator();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.ComparativeExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.mdse.constructs.ComparativeOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparativeOperator value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"BOOLEAN"</code>.
	 * The literals are from the enumeration {@link org.mdse.constructs.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.mdse.constructs.Type
	 * @see #setType(Type)
	 * @see org.mdse.constructs.ConstructsPackage#getComparativeExpression_Type()
	 * @model default="BOOLEAN"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.ComparativeExpression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.mdse.constructs.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // ComparativeExpression
