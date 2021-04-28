/**
 */
package game;

import constructs.Statement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Used Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link game.UsedStatement#getNextStatements <em>Next Statements</em>}</li>
 *   <li>{@link game.UsedStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see game.GamePackage#getUsedStatement()
 * @model
 * @generated
 */
public interface UsedStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Statements</b></em>' containment reference list.
	 * The list contents are of type {@link game.UsedStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Statements</em>' containment reference list.
	 * @see game.GamePackage#getUsedStatement_NextStatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsedStatement> getNextStatements();

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(Statement)
	 * @see game.GamePackage#getUsedStatement_Statement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link game.UsedStatement#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

} // UsedStatement
