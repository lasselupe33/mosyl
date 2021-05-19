/**
 */
package org.mdse.constructs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.constructs.IntegerVariable#getValue <em>Value</em>}</li>
 *   <li>{@link org.mdse.constructs.IntegerVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.mdse.constructs.ConstructsPackage#getIntegerVariable()
 * @model
 * @generated
 */
public interface IntegerVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see org.mdse.constructs.ConstructsPackage#getIntegerVariable_Value()
	 * @model default="0"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.IntegerVariable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"INTEGER"</code>.
	 * The literals are from the enumeration {@link org.mdse.constructs.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.mdse.constructs.Type
	 * @see #setType(Type)
	 * @see org.mdse.constructs.ConstructsPackage#getIntegerVariable_Type()
	 * @model default="INTEGER"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.IntegerVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.mdse.constructs.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // IntegerVariable
