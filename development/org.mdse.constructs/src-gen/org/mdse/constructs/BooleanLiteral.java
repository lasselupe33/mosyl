/**
 */
package org.mdse.constructs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.constructs.BooleanLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link org.mdse.constructs.BooleanLiteral#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.mdse.constructs.ConstructsPackage#getBooleanLiteral()
 * @model
 * @generated
 */
public interface BooleanLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Boolean)
	 * @see org.mdse.constructs.ConstructsPackage#getBooleanLiteral_Value()
	 * @model default="false"
	 * @generated
	 */
	Boolean getValue();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.BooleanLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"BOOLEAN"</code>.
	 * The literals are from the enumeration {@link org.mdse.constructs.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.mdse.constructs.Type
	 * @see #setType(Type)
	 * @see org.mdse.constructs.ConstructsPackage#getBooleanLiteral_Type()
	 * @model default="BOOLEAN"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.BooleanLiteral#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.mdse.constructs.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // BooleanLiteral
