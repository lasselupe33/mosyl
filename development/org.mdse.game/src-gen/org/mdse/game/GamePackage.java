/**
 */
package org.mdse.game;

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
 * @see org.mdse.game.GameFactory
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
	GamePackage eINSTANCE = org.mdse.game.impl.GamePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.game.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.game.impl.GameImpl
	 * @see org.mdse.game.impl.GamePackageImpl#getGame()
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
	 * The feature id for the '<em><b>Entrypoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ENTRYPOINT = 1;

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
	 * The meta object id for the '{@link org.mdse.game.impl.UsedStatementImpl <em>Used Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.game.impl.UsedStatementImpl
	 * @see org.mdse.game.impl.GamePackageImpl#getUsedStatement()
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
	 * The meta object id for the '{@link org.mdse.game.impl.UsedInputImpl <em>Used Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.game.impl.UsedInputImpl
	 * @see org.mdse.game.impl.GamePackageImpl#getUsedInput()
	 * @generated
	 */
	int USED_INPUT = 2;

	/**
	 * The feature id for the '<em><b>Next Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_INPUT__NEXT_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_INPUT__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Next Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_INPUT__NEXT_INPUT = 2;

	/**
	 * The number of structural features of the '<em>Used Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_INPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Used Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.game.impl.EntrypointImpl <em>Entrypoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.game.impl.EntrypointImpl
	 * @see org.mdse.game.impl.GamePackageImpl#getEntrypoint()
	 * @generated
	 */
	int ENTRYPOINT = 3;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPOINT__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPOINT__STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Entrypoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPOINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entrypoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRYPOINT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.mdse.game.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see org.mdse.game.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.Game#getPuzzle <em>Puzzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Puzzle</em>'.
	 * @see org.mdse.game.Game#getPuzzle()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Puzzle();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.Game#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entrypoint</em>'.
	 * @see org.mdse.game.Game#getEntrypoint()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Entrypoint();

	/**
	 * Returns the meta object for class '{@link org.mdse.game.UsedStatement <em>Used Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used Statement</em>'.
	 * @see org.mdse.game.UsedStatement
	 * @generated
	 */
	EClass getUsedStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.game.UsedStatement#getNextStatements <em>Next Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next Statements</em>'.
	 * @see org.mdse.game.UsedStatement#getNextStatements()
	 * @see #getUsedStatement()
	 * @generated
	 */
	EReference getUsedStatement_NextStatements();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.UsedStatement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.mdse.game.UsedStatement#getStatement()
	 * @see #getUsedStatement()
	 * @generated
	 */
	EReference getUsedStatement_Statement();

	/**
	 * Returns the meta object for class '{@link org.mdse.game.UsedInput <em>Used Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used Input</em>'.
	 * @see org.mdse.game.UsedInput
	 * @generated
	 */
	EClass getUsedInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.UsedInput#getNextStatement <em>Next Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Statement</em>'.
	 * @see org.mdse.game.UsedInput#getNextStatement()
	 * @see #getUsedInput()
	 * @generated
	 */
	EReference getUsedInput_NextStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.UsedInput#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.mdse.game.UsedInput#getInput()
	 * @see #getUsedInput()
	 * @generated
	 */
	EReference getUsedInput_Input();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.UsedInput#getNextInput <em>Next Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Input</em>'.
	 * @see org.mdse.game.UsedInput#getNextInput()
	 * @see #getUsedInput()
	 * @generated
	 */
	EReference getUsedInput_NextInput();

	/**
	 * Returns the meta object for class '{@link org.mdse.game.Entrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrypoint</em>'.
	 * @see org.mdse.game.Entrypoint
	 * @generated
	 */
	EClass getEntrypoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.Entrypoint#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.mdse.game.Entrypoint#getInput()
	 * @see #getEntrypoint()
	 * @generated
	 */
	EReference getEntrypoint_Input();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.game.Entrypoint#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see org.mdse.game.Entrypoint#getStatement()
	 * @see #getEntrypoint()
	 * @generated
	 */
	EReference getEntrypoint_Statement();

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
		 * The meta object literal for the '{@link org.mdse.game.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.game.impl.GameImpl
		 * @see org.mdse.game.impl.GamePackageImpl#getGame()
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
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__ENTRYPOINT = eINSTANCE.getGame_Entrypoint();

		/**
		 * The meta object literal for the '{@link org.mdse.game.impl.UsedStatementImpl <em>Used Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.game.impl.UsedStatementImpl
		 * @see org.mdse.game.impl.GamePackageImpl#getUsedStatement()
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

		/**
		 * The meta object literal for the '{@link org.mdse.game.impl.UsedInputImpl <em>Used Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.game.impl.UsedInputImpl
		 * @see org.mdse.game.impl.GamePackageImpl#getUsedInput()
		 * @generated
		 */
		EClass USED_INPUT = eINSTANCE.getUsedInput();

		/**
		 * The meta object literal for the '<em><b>Next Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_INPUT__NEXT_STATEMENT = eINSTANCE.getUsedInput_NextStatement();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_INPUT__INPUT = eINSTANCE.getUsedInput_Input();

		/**
		 * The meta object literal for the '<em><b>Next Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_INPUT__NEXT_INPUT = eINSTANCE.getUsedInput_NextInput();

		/**
		 * The meta object literal for the '{@link org.mdse.game.impl.EntrypointImpl <em>Entrypoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.game.impl.EntrypointImpl
		 * @see org.mdse.game.impl.GamePackageImpl#getEntrypoint()
		 * @generated
		 */
		EClass ENTRYPOINT = eINSTANCE.getEntrypoint();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRYPOINT__INPUT = eINSTANCE.getEntrypoint_Input();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRYPOINT__STATEMENT = eINSTANCE.getEntrypoint_Statement();

	}

} //GamePackage
