package org.mdse.minisql.query.validation;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ui.IStartup;
import org.mdse.minisql.query.AllColumnsWhatDirective;
import org.mdse.minisql.query.ArithmeticExpression;
import org.mdse.minisql.query.BinaryLogicalExpression;
import org.mdse.minisql.query.ColumnReference;
import org.mdse.minisql.query.ComparativeExpression;
import org.mdse.minisql.query.FromClause;
import org.mdse.minisql.query.LogicalExpression;
import org.mdse.minisql.query.OrderByClause;
import org.mdse.minisql.query.OrderDirective;
import org.mdse.minisql.query.QueryPackage;
import org.mdse.minisql.query.SingleColumnWhatDirective;
import org.mdse.minisql.query.UnaryLogicalExpression;
import org.mdse.minisql.query.WhatClause;
import org.mdse.minisql.query.WhatDirective;
import org.mdse.minisql.query.WhereClause;
import org.mdse.minisql.schema.Column;

public abstract class AbstractMiniSQLQueryValidator extends EObjectValidator implements IStartup {
	private DiagnosticChain diagnostics;
	
	@Override
	public void earlyStartup() {
		//Install validator
		EValidator.Registry.INSTANCE.put(QueryPackage.eINSTANCE, new MiniSQLQueryValidator());
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
		
		modelIsValid &= validateWellFormedness(eClass, eObject);
		modelIsValid &= validateTypeSystem(eClass, eObject);
		
		return modelIsValid;
	}
	
	protected boolean validateWellFormedness(EClass eClass, EObject eObject) {
		boolean modelIsValid = true;
		
		if (QueryPackage.eINSTANCE.getWhatClause().equals(eClass)) {
			WhatClause whatClause = (WhatClause) eObject;
			
			modelIsValid &= validateWhatClause(whatClause);
		}
		
		if (QueryPackage.eINSTANCE.getFromClause().equals(eClass)) {
			FromClause fromClause = (FromClause) eObject;
			
			modelIsValid &= validateFromClause(fromClause);
		}
		
		if (QueryPackage.eINSTANCE.getWhereClause().equals(eClass)) {
			WhereClause whereClause = (WhereClause) eObject;
			
			modelIsValid &= validateWhereClause(whereClause);
		}
		
		if (QueryPackage.eINSTANCE.getOrderByClause().equals(eClass)) {
			OrderByClause orderByClause = (OrderByClause) eObject;
			
			modelIsValid &= validateOrderByClause(orderByClause);
		}
		
		return modelIsValid;
	}
	
	protected boolean validateTypeSystem(EClass eClass, EObject eObject) {
		boolean modelIsValid = true;
		
		if (QueryPackage.eINSTANCE.getArithmeticExpression().equals(eClass)) {
			ArithmeticExpression arithmeticExpression = (ArithmeticExpression) eObject;
			
			modelIsValid &= validateArithmeticExpression(arithmeticExpression);
		}
		
		if (QueryPackage.eINSTANCE.getComparativeExpression().equals(eClass)) {
			ComparativeExpression comparativeExpression = (ComparativeExpression) eObject;
			
			modelIsValid &= validateComparativeExpression(comparativeExpression);
		}
				
		
		if (QueryPackage.eINSTANCE.getBinaryLogicalExpression().equals(eClass) || QueryPackage.eINSTANCE.getUnaryLogicalExpression().equals(eClass)) {
			LogicalExpression logicalExpression = (LogicalExpression) eObject;
			
			modelIsValid &= validateLogicalExpression(logicalExpression);
		}
		
		return modelIsValid;
	}
	
	protected boolean validateWhatClause(WhatClause whatClause) {
		List<WhatDirective> whatDirectives = whatClause.getWhatDirectives();
		
		boolean modelIsValid = true;
		Set<Column> alreadySelectedColumns = new HashSet<>();
		
		for (WhatDirective whatDirective : whatDirectives) {
			if (whatDirective instanceof AllColumnsWhatDirective) {
				if (whatDirectives.size() > 1) {
					modelIsValid &= constraintViolated(whatDirective, "Selector * must be used as only selector.");
				}
			}
			
			if (whatDirective instanceof SingleColumnWhatDirective) {
				SingleColumnWhatDirective singleColumnWhatDirective = (SingleColumnWhatDirective) whatDirective;
				ColumnReference columnReference = singleColumnWhatDirective.getColumnReference();
				Column column = columnReference.getColumn();
				
				if (alreadySelectedColumns.contains(column)) {
					modelIsValid &= constraintViolated(whatDirective, "Column \"" + column.getName() + "\" must be selected at most once.");
				}
				
				alreadySelectedColumns.add(column);
			}
		}
		
		return modelIsValid;
	}
	
	protected boolean validateFromClause(FromClause fromClause) {
		return true;
	}
	
	protected boolean validateWhereClause(WhereClause whereClause) {
		boolean modelIsValid = true;
		
		modelIsValid &= validateWhereClauseTypeCompatibility(whereClause);
		
		return modelIsValid;
	}
	
	protected abstract boolean validateWhereClauseTypeCompatibility(WhereClause whereClause);
	
	protected boolean validateOrderByClause(OrderByClause orderByClause) {
		List<OrderDirective> orderDirectives = orderByClause.getOrderDirectives();
		
		boolean modelIsValid = true;
		Set<Column> alreadyOrderedColumns = new HashSet<>();
		
		for (OrderDirective orderDirective : orderDirectives) {
			ColumnReference columnReference = orderDirective.getColumnReference();
			Column column = columnReference.getColumn();
			
			if (alreadyOrderedColumns.contains(column)) {
				modelIsValid &= constraintViolated(orderDirective, "Column \"" + column.getName() + "\" must be used only at most once.");
			}
			
			alreadyOrderedColumns.add(column);
		}
		
		return modelIsValid;
	}
	
	
	protected boolean validateArithmeticExpression(ArithmeticExpression arithmeticExpression) {
		boolean modelIsValid = true;
		
		modelIsValid &= validateArithmeticExpressionTypeCompatibility(arithmeticExpression);
		
		return modelIsValid;
	}
	
	protected abstract boolean validateArithmeticExpressionTypeCompatibility(ArithmeticExpression arithmeticExpression);
	
	
	protected boolean validateComparativeExpression(ComparativeExpression comparativeExpression) {
		boolean modelIsValid = true;
		
		modelIsValid &= validateComparativeExpressionTypeCompatibility(comparativeExpression);
		modelIsValid &= validateComparativeExpressionBooleanOperators(comparativeExpression);
		modelIsValid &= validateComparativeExpressionStringOperators(comparativeExpression);
		
		return modelIsValid;
	}
	
	protected abstract boolean validateComparativeExpressionTypeCompatibility(ComparativeExpression comparativeExpression);
	
	protected abstract boolean validateComparativeExpressionBooleanOperators(ComparativeExpression comparativeExpression);
	
	protected abstract boolean validateComparativeExpressionStringOperators(ComparativeExpression comparativeExpression);
	
	
	protected boolean validateLogicalExpression(LogicalExpression logicalExpression) {
		boolean modelIsValid = true;
				
		if (logicalExpression instanceof UnaryLogicalExpression) {
			UnaryLogicalExpression unaryLogicalExpression = (UnaryLogicalExpression) logicalExpression;
			modelIsValid &= validateUnaryLogicalExpressionTypeCompatibility(unaryLogicalExpression);
		}
		
		if (logicalExpression instanceof BinaryLogicalExpression) {
			BinaryLogicalExpression binaryLogicalExpression = (BinaryLogicalExpression) logicalExpression;
			modelIsValid &= validateBinaryLogicalExpressionTypeCompatibility(binaryLogicalExpression);
		}
		
		return modelIsValid;
	}
	
	protected abstract boolean validateUnaryLogicalExpressionTypeCompatibility(UnaryLogicalExpression unaryLogicalExpression);
	
	protected abstract boolean validateBinaryLogicalExpressionTypeCompatibility(BinaryLogicalExpression binaryLogicalExpression);
	
	
	//Utility method
	protected boolean constraintViolated(EObject object, String message) {
		Diagnostic diagnostic = new BasicDiagnostic(Diagnostic.ERROR, object.toString(), 0, message, new Object[] { object });
		diagnostics.add(diagnostic);
		return false;
	}
}
