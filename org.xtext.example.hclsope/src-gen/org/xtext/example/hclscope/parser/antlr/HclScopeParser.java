/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.hclscope.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.hclscope.parser.antlr.internal.InternalHclScopeParser;
import org.xtext.example.hclscope.services.HclScopeGrammarAccess;

public class HclScopeParser extends AbstractAntlrParser {

	@Inject
	private HclScopeGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalHclScopeParser createParser(XtextTokenStream stream) {
		return new InternalHclScopeParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "StateMachine";
	}

	public HclScopeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HclScopeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
