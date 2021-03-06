/**
 */
package org.mdse.puzzle;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.mdse.puzzle.PuzzleFactory
 * @model kind="package"
 * @generated
 */
public interface PuzzlePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "puzzle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.mdse/puzzle";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "puzzle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PuzzlePackage eINSTANCE = org.mdse.puzzle.impl.PuzzlePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.puzzle.impl.PuzzleImpl <em>Puzzle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.puzzle.impl.PuzzleImpl
	 * @see org.mdse.puzzle.impl.PuzzlePackageImpl#getPuzzle()
	 * @generated
	 */
	int PUZZLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__TESTS = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__INPUTS = 3;

	/**
	 * The number of structural features of the '<em>Puzzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Puzzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.puzzle.impl.UnitTestImpl <em>Unit Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.puzzle.impl.UnitTestImpl
	 * @see org.mdse.puzzle.impl.PuzzlePackageImpl#getUnitTest()
	 * @generated
	 */
	int UNIT_TEST = 1;

	/**
	 * The feature id for the '<em><b>Expected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__EXPECTED = 0;

	/**
	 * The feature id for the '<em><b>Failed Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__FAILED_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST__INPUTS = 2;

	/**
	 * The number of structural features of the '<em>Unit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unit Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.puzzle.impl.InputsImpl <em>Inputs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.puzzle.impl.InputsImpl
	 * @see org.mdse.puzzle.impl.PuzzlePackageImpl#getInputs()
	 * @generated
	 */
	int INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inputs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.puzzle.impl.UnitTestInputImpl <em>Unit Test Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.puzzle.impl.UnitTestInputImpl
	 * @see org.mdse.puzzle.impl.PuzzlePackageImpl#getUnitTestInput()
	 * @generated
	 */
	int UNIT_TEST_INPUT = 3;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_INPUT__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Overwriting Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_INPUT__OVERWRITING_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Unit Test Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_INPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unit Test Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_INPUT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.mdse.puzzle.Puzzle <em>Puzzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puzzle</em>'.
	 * @see org.mdse.puzzle.Puzzle
	 * @generated
	 */
	EClass getPuzzle();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.puzzle.Puzzle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mdse.puzzle.Puzzle#getName()
	 * @see #getPuzzle()
	 * @generated
	 */
	EAttribute getPuzzle_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.puzzle.Puzzle#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mdse.puzzle.Puzzle#getDescription()
	 * @see #getPuzzle()
	 * @generated
	 */
	EAttribute getPuzzle_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.puzzle.Puzzle#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see org.mdse.puzzle.Puzzle#getTests()
	 * @see #getPuzzle()
	 * @generated
	 */
	EReference getPuzzle_Tests();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.puzzle.Puzzle#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see org.mdse.puzzle.Puzzle#getInputs()
	 * @see #getPuzzle()
	 * @generated
	 */
	EReference getPuzzle_Inputs();

	/**
	 * Returns the meta object for class '{@link org.mdse.puzzle.UnitTest <em>Unit Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Test</em>'.
	 * @see org.mdse.puzzle.UnitTest
	 * @generated
	 */
	EClass getUnitTest();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.puzzle.UnitTest#getExpected <em>Expected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected</em>'.
	 * @see org.mdse.puzzle.UnitTest#getExpected()
	 * @see #getUnitTest()
	 * @generated
	 */
	EReference getUnitTest_Expected();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.puzzle.UnitTest#getFailedMessage <em>Failed Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failed Message</em>'.
	 * @see org.mdse.puzzle.UnitTest#getFailedMessage()
	 * @see #getUnitTest()
	 * @generated
	 */
	EAttribute getUnitTest_FailedMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.puzzle.UnitTest#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see org.mdse.puzzle.UnitTest#getInputs()
	 * @see #getUnitTest()
	 * @generated
	 */
	EReference getUnitTest_Inputs();

	/**
	 * Returns the meta object for class '{@link org.mdse.puzzle.Inputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inputs</em>'.
	 * @see org.mdse.puzzle.Inputs
	 * @generated
	 */
	EClass getInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.puzzle.Inputs#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.mdse.puzzle.Inputs#getVariables()
	 * @see #getInputs()
	 * @generated
	 */
	EReference getInputs_Variables();

	/**
	 * Returns the meta object for class '{@link org.mdse.puzzle.UnitTestInput <em>Unit Test Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Test Input</em>'.
	 * @see org.mdse.puzzle.UnitTestInput
	 * @generated
	 */
	EClass getUnitTestInput();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.puzzle.UnitTestInput#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.mdse.puzzle.UnitTestInput#getVariable()
	 * @see #getUnitTestInput()
	 * @generated
	 */
	EReference getUnitTestInput_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.puzzle.UnitTestInput#getOverwritingValue <em>Overwriting Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overwriting Value</em>'.
	 * @see org.mdse.puzzle.UnitTestInput#getOverwritingValue()
	 * @see #getUnitTestInput()
	 * @generated
	 */
	EReference getUnitTestInput_OverwritingValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PuzzleFactory getPuzzleFactory();

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
		 * The meta object literal for the '{@link org.mdse.puzzle.impl.PuzzleImpl <em>Puzzle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.puzzle.impl.PuzzleImpl
		 * @see org.mdse.puzzle.impl.PuzzlePackageImpl#getPuzzle()
		 * @generated
		 */
		EClass PUZZLE = eINSTANCE.getPuzzle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE__NAME = eINSTANCE.getPuzzle_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUZZLE__DESCRIPTION = eINSTANCE.getPuzzle_Description();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE__TESTS = eINSTANCE.getPuzzle_Tests();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE__INPUTS = eINSTANCE.getPuzzle_Inputs();

		/**
		 * The meta object literal for the '{@link org.mdse.puzzle.impl.UnitTestImpl <em>Unit Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.puzzle.impl.UnitTestImpl
		 * @see org.mdse.puzzle.impl.PuzzlePackageImpl#getUnitTest()
		 * @generated
		 */
		EClass UNIT_TEST = eINSTANCE.getUnitTest();

		/**
		 * The meta object literal for the '<em><b>Expected</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TEST__EXPECTED = eINSTANCE.getUnitTest_Expected();

		/**
		 * The meta object literal for the '<em><b>Failed Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TEST__FAILED_MESSAGE = eINSTANCE.getUnitTest_FailedMessage();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TEST__INPUTS = eINSTANCE.getUnitTest_Inputs();

		/**
		 * The meta object literal for the '{@link org.mdse.puzzle.impl.InputsImpl <em>Inputs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.puzzle.impl.InputsImpl
		 * @see org.mdse.puzzle.impl.PuzzlePackageImpl#getInputs()
		 * @generated
		 */
		EClass INPUTS = eINSTANCE.getInputs();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUTS__VARIABLES = eINSTANCE.getInputs_Variables();

		/**
		 * The meta object literal for the '{@link org.mdse.puzzle.impl.UnitTestInputImpl <em>Unit Test Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.puzzle.impl.UnitTestInputImpl
		 * @see org.mdse.puzzle.impl.PuzzlePackageImpl#getUnitTestInput()
		 * @generated
		 */
		EClass UNIT_TEST_INPUT = eINSTANCE.getUnitTestInput();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TEST_INPUT__VARIABLE = eINSTANCE.getUnitTestInput_Variable();

		/**
		 * The meta object literal for the '<em><b>Overwriting Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_TEST_INPUT__OVERWRITING_VALUE = eINSTANCE.getUnitTestInput_OverwritingValue();

	}

} //PuzzlePackage
