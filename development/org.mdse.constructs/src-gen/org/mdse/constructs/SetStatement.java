/**
 */
package org.mdse.constructs;

import org.eclipse.emf.ecore.EObject;

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
public interface SetStatement extends EObject {
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
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(Object)
	 * @see org.mdse.constructs.ConstructsPackage#getSetStatement_NewValue()
	 * @model
	 * @generated
	 */
	Object getNewValue();

	/**
	 * Sets the value of the '{@link org.mdse.constructs.SetStatement#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Object value);

} // SetStatement
