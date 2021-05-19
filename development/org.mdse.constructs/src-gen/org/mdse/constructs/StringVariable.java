/**
 */
package org.mdse.constructs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.constructs.StringVariable#getValue <em>Value</em>}</li>
 *   <li>{@link org.mdse.constructs.StringVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.mdse.constructs.ConstructsPackage#getStringVariable()
 * @model
 * @generated
 */
public interface StringVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.mdse.constructs.ConstructsPackage#getStringVariable_Value()
	 * @model default=""
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.StringVariable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"STRING"</code>.
	 * The literals are from the enumeration {@link org.mdse.constructs.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.mdse.constructs.Type
	 * @see #setType(Type)
	 * @see org.mdse.constructs.ConstructsPackage#getStringVariable_Type()
	 * @model default="STRING"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.StringVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.mdse.constructs.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // StringVariable
