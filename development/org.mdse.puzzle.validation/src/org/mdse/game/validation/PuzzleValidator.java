package org.mdse.puzzle.validation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;

public class PuzzleValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		//Install validator
		EValidator.Registry.INSTANCE.put(PuzzlePackage.eINSTANCE, new PuzzleValidator());
	}
	
	@Override
	public boolean validate(EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		//Delegate to validate method with EClass
		return validate(eObject.eClass(), eObject, diagnostics, context);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean modelIsValid = super.validate(eClass, eObject, diagnostics, context);

		this.diagnostics = diagnostics;
		
		
		if (PuzzleGamePackage.eINSTANCE.getEntrypoint().equals(eClass)) {
			Entrypoint entrypoint = (Entrypoint) eObject;
			modelIsValid &= validateWellformedEntrypoint(entrypoint);
			modelIsValid &= validateAtLeastOneReturnStatement(entrypoint);
		}

		// if (QueryPackage.eINSTANCE.getWhatClause().equals(eClass)) {
		// 	WhatClause whatClause = (WhatClause) eObject;
		// 	modelIsValid &= validateWhatClause(whatClause);
		// }
		
		return modelIsValid;
	}
	
	// protected boolean validateWellformedEntrypoint(Entrypoint entrypoint) {
	// 	boolean modelIsValid = true;
		
	// 	if (entrypoint.getStatement() == null && entrypoint.getInputs() == null) {
	// 		modelIsValid &= constraintViolated(entrypoint, "Entrypoint must specify either a statement or inputs");
	// 	}
		
	// 	return modelIsValid;
	// }
	
	// protected boolean validateAtLeastOneReturnStatement(Entrypoint entrypoint) {
	// 	boolean modelIsValid = true;
	// 	int count = 0;
	// 	PuzzleStatement statement = entrypoint.getStatement();
		
	// 	if (statement == null) {
	// 		PuzzleInputs inputs = entrypoint.getInputs();
			
	// 		// This error will be handled by another validation function
	// 		if (inputs == null) {
	// 			return true;
	// 		}
			
	// 		statement = inputs.getNextStatement();
			
	// 		// This error will be handled by another validation function
	// 		if (statement == null) {
	// 			return true;
	// 		}
	// 	}
		
	// 	while (statement != null) {
	// 		if (statement.getStatement() instanceof IfElseStatement) {
	// 			IfElseStatement ifElseStmt = (IfElseStatement) statement.getStatement();
				
	// 			if (ifElseStmt.getIfStatement() instanceof ReturnStatement) {
	// 				count++;
	// 			}
				
	// 			if (ifElseStmt.getElseStatement() instanceof ReturnStatement) {
	// 				count++;
	// 			}
	// 		}
			
	// 		if (statement.getStatement() instanceof ReturnStatement) {
	// 			count++;
	// 		}
			
	// 		statement = statement.getNextStatement();
	// 	}
		
	// 	if (count == 0) {
	// 		modelIsValid &= constraintViolated(entrypoint, "At least one return statement must be specified.");
	// 	}
		
	// 	return modelIsValid;
	// }
		
	// protected boolean validateWhatClause(WhatClause whatClause) {
	// 	List<WhatDirective> whatDirectives = whatClause.getWhatDirectives();
		
	// 	boolean modelIsValid = true;
		
	// 	for (WhatDirective whatDirective : whatDirectives) {
	// 		if (whatDirective instanceof AllColumnsWhatDirective) {
	// 			//TODO: Write Java constraint
	// 			boolean constraintViolated = false;
				
	// 			if (constraintViolated) {
	// 				modelIsValid &= constraintViolated(whatDirective, "Selector * must be used as only selector.");
	// 			}
	// 		}
			
	// 		if (whatDirective instanceof SingleColumnWhatDirective) {
	// 			//TODO: Write Java constraint
	// 			boolean constraintViolated = false;
				
	// 			if (constraintViolated) {
	// 				modelIsValid &= constraintViolated(whatDirective, "Column \"" + column.getName() + "\" must be selected at most once.");
	// 			}
				
	// 		}
	// 	}
		
	// 	return modelIsValid;
	// }
		
	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}
}
