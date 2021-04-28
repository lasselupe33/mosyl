/**
 */
package constructs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declare Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link constructs.DeclareStatement#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see constructs.ConstructsPackage#getDeclareStatement()
 * @model
 * @generated
 */
public interface DeclareStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see constructs.ConstructsPackage#getDeclareStatement_Variable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link constructs.DeclareStatement#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // DeclareStatement
