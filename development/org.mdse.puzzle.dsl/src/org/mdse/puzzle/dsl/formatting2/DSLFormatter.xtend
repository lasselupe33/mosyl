/*
 * generated by X-Text 2.25.0
 */
package org.mdse.puzzle.dsl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.mdse.constructs.DeclareStatement
import org.mdse.puzzle.Puzzle
import org.mdse.puzzle.dsl.services.DSLGrammarAccess

class DSLFormatter extends AbstractFormatter2 {
	
	@Inject extension DSLGrammarAccess

	def dispatch void format(Puzzle puzzle, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (unitTest : puzzle.tests) {
			unitTest.format
		}
	}

	def dispatch void format(DeclareStatement declareStatement, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		declareStatement.variable.format
	}
	
}
