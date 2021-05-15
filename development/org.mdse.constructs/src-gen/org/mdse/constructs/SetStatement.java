/**
 */
package org.mdse.constructs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.constructs.SetStatement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.mdse.constructs.SetStatement#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see org.mdse.constructs.ConstructsPackage#getSetStatement()
 * @model
 * @generated
 */
public interface SetStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.mdse.constructs.ConstructsPackage#getSetStatement_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.SetStatement#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' containment reference.
	 * @see #setNewValue(Literal)
	 * @see org.mdse.constructs.ConstructsPackage#getSetStatement_NewValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Literal getNewValue();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.SetStatement#getNewValue <em>New Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' containment reference.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Literal value);

} // SetStatement
