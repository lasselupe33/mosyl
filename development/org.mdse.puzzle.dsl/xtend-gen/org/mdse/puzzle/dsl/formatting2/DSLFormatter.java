/**
 * generated by X-Text 2.25.0
 */
package org.mdse.puzzle.dsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.mdse.constructs.DeclareStatement;
import org.mdse.constructs.Variable;
import org.mdse.puzzle.Puzzle;
import org.mdse.puzzle.UnitTest;

@SuppressWarnings("all")
public class DSLFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private /* DSLGrammarAccess */Object _dSLGrammarAccess;
  
  protected void _format(final Puzzle puzzle, @Extension final IFormattableDocument document) {
    EList<UnitTest> _tests = puzzle.getTests();
    for (final UnitTest unitTest : _tests) {
      document.<UnitTest>format(unitTest);
    }
  }
  
  protected void _format(final DeclareStatement declareStatement, @Extension final IFormattableDocument document) {
    document.<Variable>format(declareStatement.getVariable());
  }
  
  public void format(final Object declareStatement, final IFormattableDocument document) {
    if (declareStatement instanceof XtextResource) {
      _format((XtextResource)declareStatement, document);
      return;
    } else if (declareStatement instanceof DeclareStatement) {
      _format((DeclareStatement)declareStatement, document);
      return;
    } else if (declareStatement instanceof Puzzle) {
      _format((Puzzle)declareStatement, document);
      return;
    } else if (declareStatement instanceof EObject) {
      _format((EObject)declareStatement, document);
      return;
    } else if (declareStatement == null) {
      _format((Void)null, document);
      return;
    } else if (declareStatement != null) {
      _format(declareStatement, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(declareStatement, document).toString());
    }
  }
}