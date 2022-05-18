/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mapping.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mapping.parser.antlr.internal.InternalMappingParser;
import org.xtext.example.mapping.services.MappingGrammarAccess;

public class MappingParser extends AbstractAntlrParser {

	@Inject
	private MappingGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMappingParser createParser(XtextTokenStream stream) {
		return new InternalMappingParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MappingModel";
	}

	public MappingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MappingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
