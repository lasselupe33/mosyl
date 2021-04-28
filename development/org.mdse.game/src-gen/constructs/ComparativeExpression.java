/**
 */
package constructs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link constructs.ComparativeExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see constructs.ConstructsPackage#getComparativeExpression()
 * @model
 * @generated
 */
public interface ComparativeExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link constructs.ComparativeOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see constructs.ComparativeOperator
	 * @see #setOperator(ComparativeOperator)
	 * @see constructs.ConstructsPackage#getComparativeExpression_Operator()
	 * @model
	 * @generated
	 */
	ComparativeOperator getOperator();

	/**
	 * Sets the value of the '{@link constructs.ComparativeExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see constructs.ComparativeOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ComparativeOperator value);

} // ComparativeExpression
