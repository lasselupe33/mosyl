package org.mdse.game.validation;

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
import org.mdse.game.GamePackage;

public class GameValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		//Install validator
		EValidator.Registry.INSTANCE.put(GamePackage.eINSTANCE, new GameValidator());
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

		// if (QueryPackage.eINSTANCE.getWhatClause().equals(eClass)) {
		// 	WhatClause whatClause = (WhatClause) eObject;
		// 	modelIsValid &= validateWhatClause(whatClause);
		// }
		
		return modelIsValid;
	}
	
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
