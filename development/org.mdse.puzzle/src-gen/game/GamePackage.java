/**
 */
package game;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see game.GameFactory
 * @model kind="package"
 * @generated
 */
public interface GamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "game";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.mdse/game";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "game";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamePackage eINSTANCE = game.impl.GamePackageImpl.init();

	/**
	 * The meta object id for the '{@link game.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.GameImpl
	 * @see game.impl.GamePackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Puzzle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PUZZLE = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__STATEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link game.impl.UsedStatementImpl <em>Used Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see game.impl.UsedStatementImpl
	 * @see game.impl.GamePackageImpl#getUsedStatement()
	 * @generated
	 */
	int USED_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_STATEMENT__NEXT_STATEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_STATEMENT__STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Used Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Used Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link game.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see game.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference '{@link game.Game#getPuzzle <em>Puzzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Puzzle</em>'.
	 * @see game.Game#getPuzzle()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Puzzle();

	/**
	 * Returns the meta object for the containment reference list '{@link game.Game#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see game.Game#getStatements()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Statements();

	/**
	 * Returns the meta object for class '{@link game.UsedStatement <em>Used Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used Statement</em>'.
	 * @see game.UsedStatement
	 * @generated
	 */
	EClass getUsedStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link game.UsedStatement#getNextStatements <em>Next Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Statements</em>'.
	 * @see game.UsedStatement#getNextStatements()
	 * @see #getUsedStatement()
	 * @generated
	 */
	EReference getUsedStatement_NextStatements();

	/**
	 * Returns the meta object for the containment reference '{@link game.UsedStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see game.UsedStatement#getStatement()
	 * @see #getUsedStatement()
	 * @generated
	 */
	EReference getUsedStatement_Statement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GameFactory getGameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link game.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.GameImpl
		 * @see game.impl.GamePackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Puzzle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PUZZLE = eINSTANCE.getGame_Puzzle();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__STATEMENTS = eINSTANCE.getGame_Statements();

		/**
		 * The meta object literal for the '{@link game.impl.UsedStatementImpl <em>Used Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see game.impl.UsedStatementImpl
		 * @see game.impl.GamePackageImpl#getUsedStatement()
		 * @generated
		 */
		EClass USED_STATEMENT = eINSTANCE.getUsedStatement();

		/**
		 * The meta object literal for the '<em><b>Next Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_STATEMENT__NEXT_STATEMENTS = eINSTANCE.getUsedStatement_NextStatements();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_STATEMENT__STATEMENT = eINSTANCE.getUsedStatement_Statement();

	}

} //GamePackage
