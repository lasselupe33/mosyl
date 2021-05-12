/**
 */
package org.mdse.constructs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.constructs.IntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.mdse.constructs.ConstructsPackage#getIntegerLiteral()
 * @model
 * @generated
 */
public interface IntegerLiteral extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see org.mdse.constructs.ConstructsPackage#getIntegerLiteral_Value()
	 * @model default="0"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.IntegerLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // IntegerLiteral
