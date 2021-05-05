/**
 */
package org.mdse.puzzle.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mdse.puzzle.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PuzzleFactoryImpl extends EFactoryImpl implements PuzzleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PuzzleFactory init() {
		try {
			PuzzleFactory thePuzzleFactory = (PuzzleFactory) EPackage.Registry.INSTANCE
					.getEFactory(PuzzlePackage.eNS_URI);
			if (thePuzzleFactory != null) {
				return thePuzzleFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PuzzleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PuzzlePackage.PUZZLE:
			return createPuzzle();
		case PuzzlePackage.UNIT_TEST:
			return createUnitTest();
		case PuzzlePackage.INPUTS:
			return createInputs();
		case PuzzlePackage.UNIT_TEST_INPUT:
			return createUnitTestInput();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Puzzle createPuzzle() {
		PuzzleImpl puzzle = new PuzzleImpl();
		return puzzle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTest createUnitTest() {
		UnitTestImpl unitTest = new UnitTestImpl();
		return unitTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inputs createInputs() {
		InputsImpl inputs = new InputsImpl();
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTestInput createUnitTestInput() {
		UnitTestInputImpl unitTestInput = new UnitTestInputImpl();
		return unitTestInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuzzlePackage getPuzzlePackage() {
		return (PuzzlePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PuzzlePackage getPackage() {
		return PuzzlePackage.eINSTANCE;
	}

} //PuzzleFactoryImpl
