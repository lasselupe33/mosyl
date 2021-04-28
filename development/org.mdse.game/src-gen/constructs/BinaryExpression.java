/**
 */
package constructs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link constructs.BinaryExpression#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link constructs.BinaryExpression#getExpression2 <em>Expression2</em>}</li>
 * </ul>
 *
 * @see constructs.ConstructsPackage#getBinaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression1</b></em>' containment reference list.
	 * The list contents are of type {@link constructs.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression1</em>' containment reference list.
	 * @see constructs.ConstructsPackage#getBinaryExpression_Expression1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getExpression1();

	/**
	 * Returns the value of the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression2</em>' containment reference.
	 * @see #setExpression2(Expression)
	 * @see constructs.ConstructsPackage#getBinaryExpression_Expression2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression2();

	/**
	 * Sets the value of the '{@link constructs.BinaryExpression#getExpression2 <em>Expression2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression2</em>' containment reference.
	 * @see #getExpression2()
	 * @generated
	 */
	void setExpression2(Expression value);

} // BinaryExpression
