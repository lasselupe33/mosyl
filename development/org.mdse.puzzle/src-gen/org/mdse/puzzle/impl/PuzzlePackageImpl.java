/**
 */
package org.mdse.puzzle.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mdse.constructs.ConstructsPackage;

import org.mdse.puzzle.Inputs;
import org.mdse.puzzle.Puzzle;
import org.mdse.puzzle.PuzzleFactory;
import org.mdse.puzzle.PuzzlePackage;
import org.mdse.puzzle.UnitTest;
import org.mdse.puzzle.UnitTestInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PuzzlePackageImpl extends EPackageImpl implements PuzzlePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puzzleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTestInputEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mdse.puzzle.PuzzlePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PuzzlePackageImpl() {
		super(eNS_URI, PuzzleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PuzzlePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PuzzlePackage init() {
		if (isInited)
			return (PuzzlePackage) EPackage.Registry.INSTANCE.getEPackage(PuzzlePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPuzzlePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PuzzlePackageImpl thePuzzlePackage = registeredPuzzlePackage instanceof PuzzlePackageImpl
				? (PuzzlePackageImpl) registeredPuzzlePackage
				: new PuzzlePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ConstructsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePuzzlePackage.createPackageContents();

		// Initialize created meta-data
		thePuzzlePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePuzzlePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PuzzlePackage.eNS_URI, thePuzzlePackage);
		return thePuzzlePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPuzzle() {
		return puzzleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuzzle_Name() {
		return (EAttribute) puzzleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuzzle_Description() {
		return (EAttribute) puzzleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPuzzle_Tests() {
		return (EReference) puzzleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPuzzle_Inputs() {
		return (EReference) puzzleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitTest() {
		return unitTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitTest_Expected() {
		return (EReference) unitTestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitTest_FailedMessage() {
		return (EAttribute) unitTestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitTest_Inputs() {
		return (EReference) unitTestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputs() {
		return inputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputs_Variables() {
		return (EReference) inputsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitTestInput() {
		return unitTestInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitTestInput_Variable() {
		return (EReference) unitTestInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitTestInput_OverwritingValue() {
		return (EReference) unitTestInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzleFactory getPuzzleFactory() {
		return (PuzzleFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		puzzleEClass = createEClass(PUZZLE);
		createEAttribute(puzzleEClass, PUZZLE__NAME);
		createEAttribute(puzzleEClass, PUZZLE__DESCRIPTION);
		createEReference(puzzleEClass, PUZZLE__TESTS);
		createEReference(puzzleEClass, PUZZLE__INPUTS);

		unitTestEClass = createEClass(UNIT_TEST);
		createEReference(unitTestEClass, UNIT_TEST__EXPECTED);
		createEAttribute(unitTestEClass, UNIT_TEST__FAILED_MESSAGE);
		createEReference(unitTestEClass, UNIT_TEST__INPUTS);

		inputsEClass = createEClass(INPUTS);
		createEReference(inputsEClass, INPUTS__VARIABLES);

		unitTestInputEClass = createEClass(UNIT_TEST_INPUT);
		createEReference(unitTestInputEClass, UNIT_TEST_INPUT__VARIABLE);
		createEReference(unitTestInputEClass, UNIT_TEST_INPUT__OVERWRITING_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConstructsPackage theConstructsPackage = (ConstructsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ConstructsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(puzzleEClass, Puzzle.class, "Puzzle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPuzzle_Name(), ecorePackage.getEString(), "name", null, 0, 1, Puzzle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuzzle_Description(), ecorePackage.getEString(), "description", null, 0, 1, Puzzle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuzzle_Tests(), this.getUnitTest(), null, "tests", null, 1, -1, Puzzle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPuzzle_Inputs(), this.getInputs(), null, "inputs", null, 0, 1, Puzzle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(unitTestEClass, UnitTest.class, "UnitTest", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitTest_Expected(), theConstructsPackage.getLiteral(), null, "expected", null, 1, 1,
				UnitTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitTest_FailedMessage(), ecorePackage.getEString(), "failedMessage", null, 0, 1,
				UnitTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUnitTest_Inputs(), this.getUnitTestInput(), null, "inputs", null, 0, -1, UnitTest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputsEClass, Inputs.class, "Inputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputs_Variables(), theConstructsPackage.getVariable(), null, "variables", null, 1, -1,
				Inputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitTestInputEClass, UnitTestInput.class, "UnitTestInput", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitTestInput_Variable(), theConstructsPackage.getVariable(), null, "variable", null, 1, 1,
				UnitTestInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitTestInput_OverwritingValue(), theConstructsPackage.getLiteral(), null, "overwritingValue",
				null, 0, 1, UnitTestInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PuzzlePackageImpl
