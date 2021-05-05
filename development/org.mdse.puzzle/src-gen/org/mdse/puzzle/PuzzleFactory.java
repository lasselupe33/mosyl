/**
 */
package org.mdse.puzzle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mdse.puzzle.PuzzlePackage
 * @generated
 */
public interface PuzzleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PuzzleFactory eINSTANCE = org.mdse.puzzle.impl.PuzzleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Puzzle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Puzzle</em>'.
	 * @generated
	 */
	Puzzle createPuzzle();

	/**
	 * Returns a new object of class '<em>Unit Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Test</em>'.
	 * @generated
	 */
	UnitTest createUnitTest();

	/**
	 * Returns a new object of class '<em>Inputs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inputs</em>'.
	 * @generated
	 */
	Inputs createInputs();

	/**
	 * Returns a new object of class '<em>Unit Test Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Test Input</em>'.
	 * @generated
	 */
	UnitTestInput createUnitTestInput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PuzzlePackage getPuzzlePackage();

} //PuzzleFactory
