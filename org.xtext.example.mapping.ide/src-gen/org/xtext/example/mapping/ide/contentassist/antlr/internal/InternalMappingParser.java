package org.xtext.example.mapping.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mapping.services.MappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'assign'", "'add'", "'MappingModel'", "'SourceMetamodels'", "'{'", "'}'", "'TargetMetamodels'", "','", "'MainSourceMetamodel'", "'MappingRules'", "';'", "'MappingRule'", "'source'", "'::'", "'target'", "'operator'", "'condition'", "'comment'", "'HelperStatement'", "'statement'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMappingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMappingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMappingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMapping.g"; }


    	private MappingGrammarAccess grammarAccess;

    	public void setGrammarAccess(MappingGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMappingModel"
    // InternalMapping.g:53:1: entryRuleMappingModel : ruleMappingModel EOF ;
    public final void entryRuleMappingModel() throws RecognitionException {
        try {
            // InternalMapping.g:54:1: ( ruleMappingModel EOF )
            // InternalMapping.g:55:1: ruleMappingModel EOF
            {
             before(grammarAccess.getMappingModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMappingModel();

            state._fsp--;

             after(grammarAccess.getMappingModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMappingModel"


    // $ANTLR start "ruleMappingModel"
    // InternalMapping.g:62:1: ruleMappingModel : ( ( rule__MappingModel__Group__0 ) ) ;
    public final void ruleMappingModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:66:2: ( ( ( rule__MappingModel__Group__0 ) ) )
            // InternalMapping.g:67:2: ( ( rule__MappingModel__Group__0 ) )
            {
            // InternalMapping.g:67:2: ( ( rule__MappingModel__Group__0 ) )
            // InternalMapping.g:68:3: ( rule__MappingModel__Group__0 )
            {
             before(grammarAccess.getMappingModelAccess().getGroup()); 
            // InternalMapping.g:69:3: ( rule__MappingModel__Group__0 )
            // InternalMapping.g:69:4: rule__MappingModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappingModel"


    // $ANTLR start "entryRuleSourceMetamodel"
    // InternalMapping.g:78:1: entryRuleSourceMetamodel : ruleSourceMetamodel EOF ;
    public final void entryRuleSourceMetamodel() throws RecognitionException {
        try {
            // InternalMapping.g:79:1: ( ruleSourceMetamodel EOF )
            // InternalMapping.g:80:1: ruleSourceMetamodel EOF
            {
             before(grammarAccess.getSourceMetamodelRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceMetamodel();

            state._fsp--;

             after(grammarAccess.getSourceMetamodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSourceMetamodel"


    // $ANTLR start "ruleSourceMetamodel"
    // InternalMapping.g:87:1: ruleSourceMetamodel : ( ( rule__SourceMetamodel__Group__0 ) ) ;
    public final void ruleSourceMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:91:2: ( ( ( rule__SourceMetamodel__Group__0 ) ) )
            // InternalMapping.g:92:2: ( ( rule__SourceMetamodel__Group__0 ) )
            {
            // InternalMapping.g:92:2: ( ( rule__SourceMetamodel__Group__0 ) )
            // InternalMapping.g:93:3: ( rule__SourceMetamodel__Group__0 )
            {
             before(grammarAccess.getSourceMetamodelAccess().getGroup()); 
            // InternalMapping.g:94:3: ( rule__SourceMetamodel__Group__0 )
            // InternalMapping.g:94:4: rule__SourceMetamodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceMetamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceMetamodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceMetamodel"


    // $ANTLR start "entryRuleTargetMetamodel"
    // InternalMapping.g:103:1: entryRuleTargetMetamodel : ruleTargetMetamodel EOF ;
    public final void entryRuleTargetMetamodel() throws RecognitionException {
        try {
            // InternalMapping.g:104:1: ( ruleTargetMetamodel EOF )
            // InternalMapping.g:105:1: ruleTargetMetamodel EOF
            {
             before(grammarAccess.getTargetMetamodelRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetMetamodel();

            state._fsp--;

             after(grammarAccess.getTargetMetamodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTargetMetamodel"


    // $ANTLR start "ruleTargetMetamodel"
    // InternalMapping.g:112:1: ruleTargetMetamodel : ( ( rule__TargetMetamodel__Group__0 ) ) ;
    public final void ruleTargetMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:116:2: ( ( ( rule__TargetMetamodel__Group__0 ) ) )
            // InternalMapping.g:117:2: ( ( rule__TargetMetamodel__Group__0 ) )
            {
            // InternalMapping.g:117:2: ( ( rule__TargetMetamodel__Group__0 ) )
            // InternalMapping.g:118:3: ( rule__TargetMetamodel__Group__0 )
            {
             before(grammarAccess.getTargetMetamodelAccess().getGroup()); 
            // InternalMapping.g:119:3: ( rule__TargetMetamodel__Group__0 )
            // InternalMapping.g:119:4: rule__TargetMetamodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetMetamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetMetamodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetMetamodel"


    // $ANTLR start "entryRuleMappingRule"
    // InternalMapping.g:128:1: entryRuleMappingRule : ruleMappingRule EOF ;
    public final void entryRuleMappingRule() throws RecognitionException {
        try {
            // InternalMapping.g:129:1: ( ruleMappingRule EOF )
            // InternalMapping.g:130:1: ruleMappingRule EOF
            {
             before(grammarAccess.getMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getMappingRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMappingRule"


    // $ANTLR start "ruleMappingRule"
    // InternalMapping.g:137:1: ruleMappingRule : ( ( rule__MappingRule__Group__0 ) ) ;
    public final void ruleMappingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:141:2: ( ( ( rule__MappingRule__Group__0 ) ) )
            // InternalMapping.g:142:2: ( ( rule__MappingRule__Group__0 ) )
            {
            // InternalMapping.g:142:2: ( ( rule__MappingRule__Group__0 ) )
            // InternalMapping.g:143:3: ( rule__MappingRule__Group__0 )
            {
             before(grammarAccess.getMappingRuleAccess().getGroup()); 
            // InternalMapping.g:144:3: ( rule__MappingRule__Group__0 )
            // InternalMapping.g:144:4: rule__MappingRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappingRule"


    // $ANTLR start "entryRuleHelperStatement"
    // InternalMapping.g:153:1: entryRuleHelperStatement : ruleHelperStatement EOF ;
    public final void entryRuleHelperStatement() throws RecognitionException {
        try {
            // InternalMapping.g:154:1: ( ruleHelperStatement EOF )
            // InternalMapping.g:155:1: ruleHelperStatement EOF
            {
             before(grammarAccess.getHelperStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleHelperStatement();

            state._fsp--;

             after(grammarAccess.getHelperStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHelperStatement"


    // $ANTLR start "ruleHelperStatement"
    // InternalMapping.g:162:1: ruleHelperStatement : ( ( rule__HelperStatement__Group__0 ) ) ;
    public final void ruleHelperStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:166:2: ( ( ( rule__HelperStatement__Group__0 ) ) )
            // InternalMapping.g:167:2: ( ( rule__HelperStatement__Group__0 ) )
            {
            // InternalMapping.g:167:2: ( ( rule__HelperStatement__Group__0 ) )
            // InternalMapping.g:168:3: ( rule__HelperStatement__Group__0 )
            {
             before(grammarAccess.getHelperStatementAccess().getGroup()); 
            // InternalMapping.g:169:3: ( rule__HelperStatement__Group__0 )
            // InternalMapping.g:169:4: rule__HelperStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHelperStatement"


    // $ANTLR start "entryRuleEString"
    // InternalMapping.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMapping.g:179:1: ( ruleEString EOF )
            // InternalMapping.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMapping.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMapping.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMapping.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalMapping.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMapping.g:194:3: ( rule__EString__Alternatives )
            // InternalMapping.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMapping.g:203:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMapping.g:204:1: ( ruleQualifiedName EOF )
            // InternalMapping.g:205:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMapping.g:212:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:216:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMapping.g:217:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMapping.g:217:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMapping.g:218:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMapping.g:219:3: ( rule__QualifiedName__Group__0 )
            // InternalMapping.g:219:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleOperator"
    // InternalMapping.g:228:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:232:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMapping.g:233:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMapping.g:233:2: ( ( rule__Operator__Alternatives ) )
            // InternalMapping.g:234:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMapping.g:235:3: ( rule__Operator__Alternatives )
            // InternalMapping.g:235:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMapping.g:243:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:247:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMapping.g:248:2: ( RULE_STRING )
                    {
                    // InternalMapping.g:248:2: ( RULE_STRING )
                    // InternalMapping.g:249:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMapping.g:254:2: ( RULE_ID )
                    {
                    // InternalMapping.g:254:2: ( RULE_ID )
                    // InternalMapping.g:255:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMapping.g:264:1: rule__Operator__Alternatives : ( ( ( 'assign' ) ) | ( ( 'add' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:268:1: ( ( ( 'assign' ) ) | ( ( 'add' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMapping.g:269:2: ( ( 'assign' ) )
                    {
                    // InternalMapping.g:269:2: ( ( 'assign' ) )
                    // InternalMapping.g:270:3: ( 'assign' )
                    {
                     before(grammarAccess.getOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                    // InternalMapping.g:271:3: ( 'assign' )
                    // InternalMapping.g:271:4: 'assign'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getAssignEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMapping.g:275:2: ( ( 'add' ) )
                    {
                    // InternalMapping.g:275:2: ( ( 'add' ) )
                    // InternalMapping.g:276:3: ( 'add' )
                    {
                     before(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_1()); 
                    // InternalMapping.g:277:3: ( 'add' )
                    // InternalMapping.g:277:4: 'add'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__MappingModel__Group__0"
    // InternalMapping.g:285:1: rule__MappingModel__Group__0 : rule__MappingModel__Group__0__Impl rule__MappingModel__Group__1 ;
    public final void rule__MappingModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:289:1: ( rule__MappingModel__Group__0__Impl rule__MappingModel__Group__1 )
            // InternalMapping.g:290:2: rule__MappingModel__Group__0__Impl rule__MappingModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MappingModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__0"


    // $ANTLR start "rule__MappingModel__Group__0__Impl"
    // InternalMapping.g:297:1: rule__MappingModel__Group__0__Impl : ( 'MappingModel' ) ;
    public final void rule__MappingModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:301:1: ( ( 'MappingModel' ) )
            // InternalMapping.g:302:1: ( 'MappingModel' )
            {
            // InternalMapping.g:302:1: ( 'MappingModel' )
            // InternalMapping.g:303:2: 'MappingModel'
            {
             before(grammarAccess.getMappingModelAccess().getMappingModelKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getMappingModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__0__Impl"


    // $ANTLR start "rule__MappingModel__Group__1"
    // InternalMapping.g:312:1: rule__MappingModel__Group__1 : rule__MappingModel__Group__1__Impl rule__MappingModel__Group__2 ;
    public final void rule__MappingModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:316:1: ( rule__MappingModel__Group__1__Impl rule__MappingModel__Group__2 )
            // InternalMapping.g:317:2: rule__MappingModel__Group__1__Impl rule__MappingModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MappingModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__1"


    // $ANTLR start "rule__MappingModel__Group__1__Impl"
    // InternalMapping.g:324:1: rule__MappingModel__Group__1__Impl : ( ( rule__MappingModel__NameAssignment_1 ) ) ;
    public final void rule__MappingModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:328:1: ( ( ( rule__MappingModel__NameAssignment_1 ) ) )
            // InternalMapping.g:329:1: ( ( rule__MappingModel__NameAssignment_1 ) )
            {
            // InternalMapping.g:329:1: ( ( rule__MappingModel__NameAssignment_1 ) )
            // InternalMapping.g:330:2: ( rule__MappingModel__NameAssignment_1 )
            {
             before(grammarAccess.getMappingModelAccess().getNameAssignment_1()); 
            // InternalMapping.g:331:2: ( rule__MappingModel__NameAssignment_1 )
            // InternalMapping.g:331:3: rule__MappingModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__1__Impl"


    // $ANTLR start "rule__MappingModel__Group__2"
    // InternalMapping.g:339:1: rule__MappingModel__Group__2 : rule__MappingModel__Group__2__Impl rule__MappingModel__Group__3 ;
    public final void rule__MappingModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:343:1: ( rule__MappingModel__Group__2__Impl rule__MappingModel__Group__3 )
            // InternalMapping.g:344:2: rule__MappingModel__Group__2__Impl rule__MappingModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MappingModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__2"


    // $ANTLR start "rule__MappingModel__Group__2__Impl"
    // InternalMapping.g:351:1: rule__MappingModel__Group__2__Impl : ( 'SourceMetamodels' ) ;
    public final void rule__MappingModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:355:1: ( ( 'SourceMetamodels' ) )
            // InternalMapping.g:356:1: ( 'SourceMetamodels' )
            {
            // InternalMapping.g:356:1: ( 'SourceMetamodels' )
            // InternalMapping.g:357:2: 'SourceMetamodels'
            {
             before(grammarAccess.getMappingModelAccess().getSourceMetamodelsKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getSourceMetamodelsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__2__Impl"


    // $ANTLR start "rule__MappingModel__Group__3"
    // InternalMapping.g:366:1: rule__MappingModel__Group__3 : rule__MappingModel__Group__3__Impl rule__MappingModel__Group__4 ;
    public final void rule__MappingModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:370:1: ( rule__MappingModel__Group__3__Impl rule__MappingModel__Group__4 )
            // InternalMapping.g:371:2: rule__MappingModel__Group__3__Impl rule__MappingModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MappingModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__3"


    // $ANTLR start "rule__MappingModel__Group__3__Impl"
    // InternalMapping.g:378:1: rule__MappingModel__Group__3__Impl : ( '{' ) ;
    public final void rule__MappingModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:382:1: ( ( '{' ) )
            // InternalMapping.g:383:1: ( '{' )
            {
            // InternalMapping.g:383:1: ( '{' )
            // InternalMapping.g:384:2: '{'
            {
             before(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__3__Impl"


    // $ANTLR start "rule__MappingModel__Group__4"
    // InternalMapping.g:393:1: rule__MappingModel__Group__4 : rule__MappingModel__Group__4__Impl rule__MappingModel__Group__5 ;
    public final void rule__MappingModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:397:1: ( rule__MappingModel__Group__4__Impl rule__MappingModel__Group__5 )
            // InternalMapping.g:398:2: rule__MappingModel__Group__4__Impl rule__MappingModel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MappingModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__4"


    // $ANTLR start "rule__MappingModel__Group__4__Impl"
    // InternalMapping.g:405:1: rule__MappingModel__Group__4__Impl : ( ( rule__MappingModel__SourceMetamodelsAssignment_4 ) ) ;
    public final void rule__MappingModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:409:1: ( ( ( rule__MappingModel__SourceMetamodelsAssignment_4 ) ) )
            // InternalMapping.g:410:1: ( ( rule__MappingModel__SourceMetamodelsAssignment_4 ) )
            {
            // InternalMapping.g:410:1: ( ( rule__MappingModel__SourceMetamodelsAssignment_4 ) )
            // InternalMapping.g:411:2: ( rule__MappingModel__SourceMetamodelsAssignment_4 )
            {
             before(grammarAccess.getMappingModelAccess().getSourceMetamodelsAssignment_4()); 
            // InternalMapping.g:412:2: ( rule__MappingModel__SourceMetamodelsAssignment_4 )
            // InternalMapping.g:412:3: rule__MappingModel__SourceMetamodelsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__SourceMetamodelsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getSourceMetamodelsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__4__Impl"


    // $ANTLR start "rule__MappingModel__Group__5"
    // InternalMapping.g:420:1: rule__MappingModel__Group__5 : rule__MappingModel__Group__5__Impl rule__MappingModel__Group__6 ;
    public final void rule__MappingModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:424:1: ( rule__MappingModel__Group__5__Impl rule__MappingModel__Group__6 )
            // InternalMapping.g:425:2: rule__MappingModel__Group__5__Impl rule__MappingModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__MappingModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__5"


    // $ANTLR start "rule__MappingModel__Group__5__Impl"
    // InternalMapping.g:432:1: rule__MappingModel__Group__5__Impl : ( ( rule__MappingModel__Group_5__0 )* ) ;
    public final void rule__MappingModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:436:1: ( ( ( rule__MappingModel__Group_5__0 )* ) )
            // InternalMapping.g:437:1: ( ( rule__MappingModel__Group_5__0 )* )
            {
            // InternalMapping.g:437:1: ( ( rule__MappingModel__Group_5__0 )* )
            // InternalMapping.g:438:2: ( rule__MappingModel__Group_5__0 )*
            {
             before(grammarAccess.getMappingModelAccess().getGroup_5()); 
            // InternalMapping.g:439:2: ( rule__MappingModel__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMapping.g:439:3: rule__MappingModel__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MappingModel__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMappingModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__5__Impl"


    // $ANTLR start "rule__MappingModel__Group__6"
    // InternalMapping.g:447:1: rule__MappingModel__Group__6 : rule__MappingModel__Group__6__Impl rule__MappingModel__Group__7 ;
    public final void rule__MappingModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:451:1: ( rule__MappingModel__Group__6__Impl rule__MappingModel__Group__7 )
            // InternalMapping.g:452:2: rule__MappingModel__Group__6__Impl rule__MappingModel__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__MappingModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__6"


    // $ANTLR start "rule__MappingModel__Group__6__Impl"
    // InternalMapping.g:459:1: rule__MappingModel__Group__6__Impl : ( '}' ) ;
    public final void rule__MappingModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:463:1: ( ( '}' ) )
            // InternalMapping.g:464:1: ( '}' )
            {
            // InternalMapping.g:464:1: ( '}' )
            // InternalMapping.g:465:2: '}'
            {
             before(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__6__Impl"


    // $ANTLR start "rule__MappingModel__Group__7"
    // InternalMapping.g:474:1: rule__MappingModel__Group__7 : rule__MappingModel__Group__7__Impl rule__MappingModel__Group__8 ;
    public final void rule__MappingModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:478:1: ( rule__MappingModel__Group__7__Impl rule__MappingModel__Group__8 )
            // InternalMapping.g:479:2: rule__MappingModel__Group__7__Impl rule__MappingModel__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__MappingModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__7"


    // $ANTLR start "rule__MappingModel__Group__7__Impl"
    // InternalMapping.g:486:1: rule__MappingModel__Group__7__Impl : ( ( rule__MappingModel__Group_7__0 )? ) ;
    public final void rule__MappingModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:490:1: ( ( ( rule__MappingModel__Group_7__0 )? ) )
            // InternalMapping.g:491:1: ( ( rule__MappingModel__Group_7__0 )? )
            {
            // InternalMapping.g:491:1: ( ( rule__MappingModel__Group_7__0 )? )
            // InternalMapping.g:492:2: ( rule__MappingModel__Group_7__0 )?
            {
             before(grammarAccess.getMappingModelAccess().getGroup_7()); 
            // InternalMapping.g:493:2: ( rule__MappingModel__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMapping.g:493:3: rule__MappingModel__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingModel__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingModelAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__7__Impl"


    // $ANTLR start "rule__MappingModel__Group__8"
    // InternalMapping.g:501:1: rule__MappingModel__Group__8 : rule__MappingModel__Group__8__Impl rule__MappingModel__Group__9 ;
    public final void rule__MappingModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:505:1: ( rule__MappingModel__Group__8__Impl rule__MappingModel__Group__9 )
            // InternalMapping.g:506:2: rule__MappingModel__Group__8__Impl rule__MappingModel__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__MappingModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__8"


    // $ANTLR start "rule__MappingModel__Group__8__Impl"
    // InternalMapping.g:513:1: rule__MappingModel__Group__8__Impl : ( 'TargetMetamodels' ) ;
    public final void rule__MappingModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:517:1: ( ( 'TargetMetamodels' ) )
            // InternalMapping.g:518:1: ( 'TargetMetamodels' )
            {
            // InternalMapping.g:518:1: ( 'TargetMetamodels' )
            // InternalMapping.g:519:2: 'TargetMetamodels'
            {
             before(grammarAccess.getMappingModelAccess().getTargetMetamodelsKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getTargetMetamodelsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__8__Impl"


    // $ANTLR start "rule__MappingModel__Group__9"
    // InternalMapping.g:528:1: rule__MappingModel__Group__9 : rule__MappingModel__Group__9__Impl rule__MappingModel__Group__10 ;
    public final void rule__MappingModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:532:1: ( rule__MappingModel__Group__9__Impl rule__MappingModel__Group__10 )
            // InternalMapping.g:533:2: rule__MappingModel__Group__9__Impl rule__MappingModel__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__MappingModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__9"


    // $ANTLR start "rule__MappingModel__Group__9__Impl"
    // InternalMapping.g:540:1: rule__MappingModel__Group__9__Impl : ( '{' ) ;
    public final void rule__MappingModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:544:1: ( ( '{' ) )
            // InternalMapping.g:545:1: ( '{' )
            {
            // InternalMapping.g:545:1: ( '{' )
            // InternalMapping.g:546:2: '{'
            {
             before(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__9__Impl"


    // $ANTLR start "rule__MappingModel__Group__10"
    // InternalMapping.g:555:1: rule__MappingModel__Group__10 : rule__MappingModel__Group__10__Impl rule__MappingModel__Group__11 ;
    public final void rule__MappingModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:559:1: ( rule__MappingModel__Group__10__Impl rule__MappingModel__Group__11 )
            // InternalMapping.g:560:2: rule__MappingModel__Group__10__Impl rule__MappingModel__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__MappingModel__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__10"


    // $ANTLR start "rule__MappingModel__Group__10__Impl"
    // InternalMapping.g:567:1: rule__MappingModel__Group__10__Impl : ( ( rule__MappingModel__TargetMetamodelsAssignment_10 ) ) ;
    public final void rule__MappingModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:571:1: ( ( ( rule__MappingModel__TargetMetamodelsAssignment_10 ) ) )
            // InternalMapping.g:572:1: ( ( rule__MappingModel__TargetMetamodelsAssignment_10 ) )
            {
            // InternalMapping.g:572:1: ( ( rule__MappingModel__TargetMetamodelsAssignment_10 ) )
            // InternalMapping.g:573:2: ( rule__MappingModel__TargetMetamodelsAssignment_10 )
            {
             before(grammarAccess.getMappingModelAccess().getTargetMetamodelsAssignment_10()); 
            // InternalMapping.g:574:2: ( rule__MappingModel__TargetMetamodelsAssignment_10 )
            // InternalMapping.g:574:3: rule__MappingModel__TargetMetamodelsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__TargetMetamodelsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getTargetMetamodelsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__10__Impl"


    // $ANTLR start "rule__MappingModel__Group__11"
    // InternalMapping.g:582:1: rule__MappingModel__Group__11 : rule__MappingModel__Group__11__Impl rule__MappingModel__Group__12 ;
    public final void rule__MappingModel__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:586:1: ( rule__MappingModel__Group__11__Impl rule__MappingModel__Group__12 )
            // InternalMapping.g:587:2: rule__MappingModel__Group__11__Impl rule__MappingModel__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__MappingModel__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__11"


    // $ANTLR start "rule__MappingModel__Group__11__Impl"
    // InternalMapping.g:594:1: rule__MappingModel__Group__11__Impl : ( ( rule__MappingModel__Group_11__0 )* ) ;
    public final void rule__MappingModel__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:598:1: ( ( ( rule__MappingModel__Group_11__0 )* ) )
            // InternalMapping.g:599:1: ( ( rule__MappingModel__Group_11__0 )* )
            {
            // InternalMapping.g:599:1: ( ( rule__MappingModel__Group_11__0 )* )
            // InternalMapping.g:600:2: ( rule__MappingModel__Group_11__0 )*
            {
             before(grammarAccess.getMappingModelAccess().getGroup_11()); 
            // InternalMapping.g:601:2: ( rule__MappingModel__Group_11__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMapping.g:601:3: rule__MappingModel__Group_11__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MappingModel__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMappingModelAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__11__Impl"


    // $ANTLR start "rule__MappingModel__Group__12"
    // InternalMapping.g:609:1: rule__MappingModel__Group__12 : rule__MappingModel__Group__12__Impl rule__MappingModel__Group__13 ;
    public final void rule__MappingModel__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:613:1: ( rule__MappingModel__Group__12__Impl rule__MappingModel__Group__13 )
            // InternalMapping.g:614:2: rule__MappingModel__Group__12__Impl rule__MappingModel__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__MappingModel__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__12"


    // $ANTLR start "rule__MappingModel__Group__12__Impl"
    // InternalMapping.g:621:1: rule__MappingModel__Group__12__Impl : ( '}' ) ;
    public final void rule__MappingModel__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:625:1: ( ( '}' ) )
            // InternalMapping.g:626:1: ( '}' )
            {
            // InternalMapping.g:626:1: ( '}' )
            // InternalMapping.g:627:2: '}'
            {
             before(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_12()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__12__Impl"


    // $ANTLR start "rule__MappingModel__Group__13"
    // InternalMapping.g:636:1: rule__MappingModel__Group__13 : rule__MappingModel__Group__13__Impl ;
    public final void rule__MappingModel__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:640:1: ( rule__MappingModel__Group__13__Impl )
            // InternalMapping.g:641:2: rule__MappingModel__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__13"


    // $ANTLR start "rule__MappingModel__Group__13__Impl"
    // InternalMapping.g:647:1: rule__MappingModel__Group__13__Impl : ( ( rule__MappingModel__Group_13__0 )? ) ;
    public final void rule__MappingModel__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:651:1: ( ( ( rule__MappingModel__Group_13__0 )? ) )
            // InternalMapping.g:652:1: ( ( rule__MappingModel__Group_13__0 )? )
            {
            // InternalMapping.g:652:1: ( ( rule__MappingModel__Group_13__0 )? )
            // InternalMapping.g:653:2: ( rule__MappingModel__Group_13__0 )?
            {
             before(grammarAccess.getMappingModelAccess().getGroup_13()); 
            // InternalMapping.g:654:2: ( rule__MappingModel__Group_13__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMapping.g:654:3: rule__MappingModel__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingModel__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingModelAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__13__Impl"


    // $ANTLR start "rule__MappingModel__Group_5__0"
    // InternalMapping.g:663:1: rule__MappingModel__Group_5__0 : rule__MappingModel__Group_5__0__Impl rule__MappingModel__Group_5__1 ;
    public final void rule__MappingModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:667:1: ( rule__MappingModel__Group_5__0__Impl rule__MappingModel__Group_5__1 )
            // InternalMapping.g:668:2: rule__MappingModel__Group_5__0__Impl rule__MappingModel__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__MappingModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_5__0"


    // $ANTLR start "rule__MappingModel__Group_5__0__Impl"
    // InternalMapping.g:675:1: rule__MappingModel__Group_5__0__Impl : ( ',' ) ;
    public final void rule__MappingModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:679:1: ( ( ',' ) )
            // InternalMapping.g:680:1: ( ',' )
            {
            // InternalMapping.g:680:1: ( ',' )
            // InternalMapping.g:681:2: ','
            {
             before(grammarAccess.getMappingModelAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_5__0__Impl"


    // $ANTLR start "rule__MappingModel__Group_5__1"
    // InternalMapping.g:690:1: rule__MappingModel__Group_5__1 : rule__MappingModel__Group_5__1__Impl ;
    public final void rule__MappingModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:694:1: ( rule__MappingModel__Group_5__1__Impl )
            // InternalMapping.g:695:2: rule__MappingModel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_5__1"


    // $ANTLR start "rule__MappingModel__Group_5__1__Impl"
    // InternalMapping.g:701:1: rule__MappingModel__Group_5__1__Impl : ( ( rule__MappingModel__SourceMetamodelsAssignment_5_1 ) ) ;
    public final void rule__MappingModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:705:1: ( ( ( rule__MappingModel__SourceMetamodelsAssignment_5_1 ) ) )
            // InternalMapping.g:706:1: ( ( rule__MappingModel__SourceMetamodelsAssignment_5_1 ) )
            {
            // InternalMapping.g:706:1: ( ( rule__MappingModel__SourceMetamodelsAssignment_5_1 ) )
            // InternalMapping.g:707:2: ( rule__MappingModel__SourceMetamodelsAssignment_5_1 )
            {
             before(grammarAccess.getMappingModelAccess().getSourceMetamodelsAssignment_5_1()); 
            // InternalMapping.g:708:2: ( rule__MappingModel__SourceMetamodelsAssignment_5_1 )
            // InternalMapping.g:708:3: rule__MappingModel__SourceMetamodelsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__SourceMetamodelsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getSourceMetamodelsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_5__1__Impl"


    // $ANTLR start "rule__MappingModel__Group_7__0"
    // InternalMapping.g:717:1: rule__MappingModel__Group_7__0 : rule__MappingModel__Group_7__0__Impl rule__MappingModel__Group_7__1 ;
    public final void rule__MappingModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:721:1: ( rule__MappingModel__Group_7__0__Impl rule__MappingModel__Group_7__1 )
            // InternalMapping.g:722:2: rule__MappingModel__Group_7__0__Impl rule__MappingModel__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__MappingModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_7__0"


    // $ANTLR start "rule__MappingModel__Group_7__0__Impl"
    // InternalMapping.g:729:1: rule__MappingModel__Group_7__0__Impl : ( 'MainSourceMetamodel' ) ;
    public final void rule__MappingModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:733:1: ( ( 'MainSourceMetamodel' ) )
            // InternalMapping.g:734:1: ( 'MainSourceMetamodel' )
            {
            // InternalMapping.g:734:1: ( 'MainSourceMetamodel' )
            // InternalMapping.g:735:2: 'MainSourceMetamodel'
            {
             before(grammarAccess.getMappingModelAccess().getMainSourceMetamodelKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getMainSourceMetamodelKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_7__0__Impl"


    // $ANTLR start "rule__MappingModel__Group_7__1"
    // InternalMapping.g:744:1: rule__MappingModel__Group_7__1 : rule__MappingModel__Group_7__1__Impl ;
    public final void rule__MappingModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:748:1: ( rule__MappingModel__Group_7__1__Impl )
            // InternalMapping.g:749:2: rule__MappingModel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_7__1"


    // $ANTLR start "rule__MappingModel__Group_7__1__Impl"
    // InternalMapping.g:755:1: rule__MappingModel__Group_7__1__Impl : ( ( rule__MappingModel__MainSourceMetamodelAssignment_7_1 ) ) ;
    public final void rule__MappingModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:759:1: ( ( ( rule__MappingModel__MainSourceMetamodelAssignment_7_1 ) ) )
            // InternalMapping.g:760:1: ( ( rule__MappingModel__MainSourceMetamodelAssignment_7_1 ) )
            {
            // InternalMapping.g:760:1: ( ( rule__MappingModel__MainSourceMetamodelAssignment_7_1 ) )
            // InternalMapping.g:761:2: ( rule__MappingModel__MainSourceMetamodelAssignment_7_1 )
            {
             before(grammarAccess.getMappingModelAccess().getMainSourceMetamodelAssignment_7_1()); 
            // InternalMapping.g:762:2: ( rule__MappingModel__MainSourceMetamodelAssignment_7_1 )
            // InternalMapping.g:762:3: rule__MappingModel__MainSourceMetamodelAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__MainSourceMetamodelAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getMainSourceMetamodelAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_7__1__Impl"


    // $ANTLR start "rule__MappingModel__Group_11__0"
    // InternalMapping.g:771:1: rule__MappingModel__Group_11__0 : rule__MappingModel__Group_11__0__Impl rule__MappingModel__Group_11__1 ;
    public final void rule__MappingModel__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:775:1: ( rule__MappingModel__Group_11__0__Impl rule__MappingModel__Group_11__1 )
            // InternalMapping.g:776:2: rule__MappingModel__Group_11__0__Impl rule__MappingModel__Group_11__1
            {
            pushFollow(FOLLOW_6);
            rule__MappingModel__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_11__0"


    // $ANTLR start "rule__MappingModel__Group_11__0__Impl"
    // InternalMapping.g:783:1: rule__MappingModel__Group_11__0__Impl : ( ',' ) ;
    public final void rule__MappingModel__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:787:1: ( ( ',' ) )
            // InternalMapping.g:788:1: ( ',' )
            {
            // InternalMapping.g:788:1: ( ',' )
            // InternalMapping.g:789:2: ','
            {
             before(grammarAccess.getMappingModelAccess().getCommaKeyword_11_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_11__0__Impl"


    // $ANTLR start "rule__MappingModel__Group_11__1"
    // InternalMapping.g:798:1: rule__MappingModel__Group_11__1 : rule__MappingModel__Group_11__1__Impl ;
    public final void rule__MappingModel__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:802:1: ( rule__MappingModel__Group_11__1__Impl )
            // InternalMapping.g:803:2: rule__MappingModel__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_11__1"


    // $ANTLR start "rule__MappingModel__Group_11__1__Impl"
    // InternalMapping.g:809:1: rule__MappingModel__Group_11__1__Impl : ( ( rule__MappingModel__TargetMetamodelsAssignment_11_1 ) ) ;
    public final void rule__MappingModel__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:813:1: ( ( ( rule__MappingModel__TargetMetamodelsAssignment_11_1 ) ) )
            // InternalMapping.g:814:1: ( ( rule__MappingModel__TargetMetamodelsAssignment_11_1 ) )
            {
            // InternalMapping.g:814:1: ( ( rule__MappingModel__TargetMetamodelsAssignment_11_1 ) )
            // InternalMapping.g:815:2: ( rule__MappingModel__TargetMetamodelsAssignment_11_1 )
            {
             before(grammarAccess.getMappingModelAccess().getTargetMetamodelsAssignment_11_1()); 
            // InternalMapping.g:816:2: ( rule__MappingModel__TargetMetamodelsAssignment_11_1 )
            // InternalMapping.g:816:3: rule__MappingModel__TargetMetamodelsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__TargetMetamodelsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getTargetMetamodelsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_11__1__Impl"


    // $ANTLR start "rule__MappingModel__Group_13__0"
    // InternalMapping.g:825:1: rule__MappingModel__Group_13__0 : rule__MappingModel__Group_13__0__Impl rule__MappingModel__Group_13__1 ;
    public final void rule__MappingModel__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:829:1: ( rule__MappingModel__Group_13__0__Impl rule__MappingModel__Group_13__1 )
            // InternalMapping.g:830:2: rule__MappingModel__Group_13__0__Impl rule__MappingModel__Group_13__1
            {
            pushFollow(FOLLOW_5);
            rule__MappingModel__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__0"


    // $ANTLR start "rule__MappingModel__Group_13__0__Impl"
    // InternalMapping.g:837:1: rule__MappingModel__Group_13__0__Impl : ( 'MappingRules' ) ;
    public final void rule__MappingModel__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:841:1: ( ( 'MappingRules' ) )
            // InternalMapping.g:842:1: ( 'MappingRules' )
            {
            // InternalMapping.g:842:1: ( 'MappingRules' )
            // InternalMapping.g:843:2: 'MappingRules'
            {
             before(grammarAccess.getMappingModelAccess().getMappingRulesKeyword_13_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getMappingRulesKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__0__Impl"


    // $ANTLR start "rule__MappingModel__Group_13__1"
    // InternalMapping.g:852:1: rule__MappingModel__Group_13__1 : rule__MappingModel__Group_13__1__Impl rule__MappingModel__Group_13__2 ;
    public final void rule__MappingModel__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:856:1: ( rule__MappingModel__Group_13__1__Impl rule__MappingModel__Group_13__2 )
            // InternalMapping.g:857:2: rule__MappingModel__Group_13__1__Impl rule__MappingModel__Group_13__2
            {
            pushFollow(FOLLOW_12);
            rule__MappingModel__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__1"


    // $ANTLR start "rule__MappingModel__Group_13__1__Impl"
    // InternalMapping.g:864:1: rule__MappingModel__Group_13__1__Impl : ( '{' ) ;
    public final void rule__MappingModel__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:868:1: ( ( '{' ) )
            // InternalMapping.g:869:1: ( '{' )
            {
            // InternalMapping.g:869:1: ( '{' )
            // InternalMapping.g:870:2: '{'
            {
             before(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__1__Impl"


    // $ANTLR start "rule__MappingModel__Group_13__2"
    // InternalMapping.g:879:1: rule__MappingModel__Group_13__2 : rule__MappingModel__Group_13__2__Impl rule__MappingModel__Group_13__3 ;
    public final void rule__MappingModel__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:883:1: ( rule__MappingModel__Group_13__2__Impl rule__MappingModel__Group_13__3 )
            // InternalMapping.g:884:2: rule__MappingModel__Group_13__2__Impl rule__MappingModel__Group_13__3
            {
            pushFollow(FOLLOW_13);
            rule__MappingModel__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__2"


    // $ANTLR start "rule__MappingModel__Group_13__2__Impl"
    // InternalMapping.g:891:1: rule__MappingModel__Group_13__2__Impl : ( ( rule__MappingModel__RulesAssignment_13_2 ) ) ;
    public final void rule__MappingModel__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:895:1: ( ( ( rule__MappingModel__RulesAssignment_13_2 ) ) )
            // InternalMapping.g:896:1: ( ( rule__MappingModel__RulesAssignment_13_2 ) )
            {
            // InternalMapping.g:896:1: ( ( rule__MappingModel__RulesAssignment_13_2 ) )
            // InternalMapping.g:897:2: ( rule__MappingModel__RulesAssignment_13_2 )
            {
             before(grammarAccess.getMappingModelAccess().getRulesAssignment_13_2()); 
            // InternalMapping.g:898:2: ( rule__MappingModel__RulesAssignment_13_2 )
            // InternalMapping.g:898:3: rule__MappingModel__RulesAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__RulesAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getRulesAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__2__Impl"


    // $ANTLR start "rule__MappingModel__Group_13__3"
    // InternalMapping.g:906:1: rule__MappingModel__Group_13__3 : rule__MappingModel__Group_13__3__Impl rule__MappingModel__Group_13__4 ;
    public final void rule__MappingModel__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:910:1: ( rule__MappingModel__Group_13__3__Impl rule__MappingModel__Group_13__4 )
            // InternalMapping.g:911:2: rule__MappingModel__Group_13__3__Impl rule__MappingModel__Group_13__4
            {
            pushFollow(FOLLOW_13);
            rule__MappingModel__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__3"


    // $ANTLR start "rule__MappingModel__Group_13__3__Impl"
    // InternalMapping.g:918:1: rule__MappingModel__Group_13__3__Impl : ( ( rule__MappingModel__Group_13_3__0 )* ) ;
    public final void rule__MappingModel__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:922:1: ( ( ( rule__MappingModel__Group_13_3__0 )* ) )
            // InternalMapping.g:923:1: ( ( rule__MappingModel__Group_13_3__0 )* )
            {
            // InternalMapping.g:923:1: ( ( rule__MappingModel__Group_13_3__0 )* )
            // InternalMapping.g:924:2: ( rule__MappingModel__Group_13_3__0 )*
            {
             before(grammarAccess.getMappingModelAccess().getGroup_13_3()); 
            // InternalMapping.g:925:2: ( rule__MappingModel__Group_13_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMapping.g:925:3: rule__MappingModel__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__MappingModel__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMappingModelAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__3__Impl"


    // $ANTLR start "rule__MappingModel__Group_13__4"
    // InternalMapping.g:933:1: rule__MappingModel__Group_13__4 : rule__MappingModel__Group_13__4__Impl ;
    public final void rule__MappingModel__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:937:1: ( rule__MappingModel__Group_13__4__Impl )
            // InternalMapping.g:938:2: rule__MappingModel__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__4"


    // $ANTLR start "rule__MappingModel__Group_13__4__Impl"
    // InternalMapping.g:944:1: rule__MappingModel__Group_13__4__Impl : ( '}' ) ;
    public final void rule__MappingModel__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:948:1: ( ( '}' ) )
            // InternalMapping.g:949:1: ( '}' )
            {
            // InternalMapping.g:949:1: ( '}' )
            // InternalMapping.g:950:2: '}'
            {
             before(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__4__Impl"


    // $ANTLR start "rule__MappingModel__Group_13_3__0"
    // InternalMapping.g:960:1: rule__MappingModel__Group_13_3__0 : rule__MappingModel__Group_13_3__0__Impl rule__MappingModel__Group_13_3__1 ;
    public final void rule__MappingModel__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:964:1: ( rule__MappingModel__Group_13_3__0__Impl rule__MappingModel__Group_13_3__1 )
            // InternalMapping.g:965:2: rule__MappingModel__Group_13_3__0__Impl rule__MappingModel__Group_13_3__1
            {
            pushFollow(FOLLOW_12);
            rule__MappingModel__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13_3__0"


    // $ANTLR start "rule__MappingModel__Group_13_3__0__Impl"
    // InternalMapping.g:972:1: rule__MappingModel__Group_13_3__0__Impl : ( ';' ) ;
    public final void rule__MappingModel__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:976:1: ( ( ';' ) )
            // InternalMapping.g:977:1: ( ';' )
            {
            // InternalMapping.g:977:1: ( ';' )
            // InternalMapping.g:978:2: ';'
            {
             before(grammarAccess.getMappingModelAccess().getSemicolonKeyword_13_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getSemicolonKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13_3__0__Impl"


    // $ANTLR start "rule__MappingModel__Group_13_3__1"
    // InternalMapping.g:987:1: rule__MappingModel__Group_13_3__1 : rule__MappingModel__Group_13_3__1__Impl ;
    public final void rule__MappingModel__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:991:1: ( rule__MappingModel__Group_13_3__1__Impl )
            // InternalMapping.g:992:2: rule__MappingModel__Group_13_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13_3__1"


    // $ANTLR start "rule__MappingModel__Group_13_3__1__Impl"
    // InternalMapping.g:998:1: rule__MappingModel__Group_13_3__1__Impl : ( ( rule__MappingModel__RulesAssignment_13_3_1 ) ) ;
    public final void rule__MappingModel__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1002:1: ( ( ( rule__MappingModel__RulesAssignment_13_3_1 ) ) )
            // InternalMapping.g:1003:1: ( ( rule__MappingModel__RulesAssignment_13_3_1 ) )
            {
            // InternalMapping.g:1003:1: ( ( rule__MappingModel__RulesAssignment_13_3_1 ) )
            // InternalMapping.g:1004:2: ( rule__MappingModel__RulesAssignment_13_3_1 )
            {
             before(grammarAccess.getMappingModelAccess().getRulesAssignment_13_3_1()); 
            // InternalMapping.g:1005:2: ( rule__MappingModel__RulesAssignment_13_3_1 )
            // InternalMapping.g:1005:3: rule__MappingModel__RulesAssignment_13_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__RulesAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getRulesAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13_3__1__Impl"


    // $ANTLR start "rule__SourceMetamodel__Group__0"
    // InternalMapping.g:1014:1: rule__SourceMetamodel__Group__0 : rule__SourceMetamodel__Group__0__Impl rule__SourceMetamodel__Group__1 ;
    public final void rule__SourceMetamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1018:1: ( rule__SourceMetamodel__Group__0__Impl rule__SourceMetamodel__Group__1 )
            // InternalMapping.g:1019:2: rule__SourceMetamodel__Group__0__Impl rule__SourceMetamodel__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SourceMetamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceMetamodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__Group__0"


    // $ANTLR start "rule__SourceMetamodel__Group__0__Impl"
    // InternalMapping.g:1026:1: rule__SourceMetamodel__Group__0__Impl : ( () ) ;
    public final void rule__SourceMetamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1030:1: ( ( () ) )
            // InternalMapping.g:1031:1: ( () )
            {
            // InternalMapping.g:1031:1: ( () )
            // InternalMapping.g:1032:2: ()
            {
             before(grammarAccess.getSourceMetamodelAccess().getSourceMetamodelAction_0()); 
            // InternalMapping.g:1033:2: ()
            // InternalMapping.g:1033:3: 
            {
            }

             after(grammarAccess.getSourceMetamodelAccess().getSourceMetamodelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__Group__0__Impl"


    // $ANTLR start "rule__SourceMetamodel__Group__1"
    // InternalMapping.g:1041:1: rule__SourceMetamodel__Group__1 : rule__SourceMetamodel__Group__1__Impl rule__SourceMetamodel__Group__2 ;
    public final void rule__SourceMetamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1045:1: ( rule__SourceMetamodel__Group__1__Impl rule__SourceMetamodel__Group__2 )
            // InternalMapping.g:1046:2: rule__SourceMetamodel__Group__1__Impl rule__SourceMetamodel__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SourceMetamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceMetamodel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__Group__1"


    // $ANTLR start "rule__SourceMetamodel__Group__1__Impl"
    // InternalMapping.g:1053:1: rule__SourceMetamodel__Group__1__Impl : ( ( rule__SourceMetamodel__NameAssignment_1 )? ) ;
    public final void rule__SourceMetamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1057:1: ( ( ( rule__SourceMetamodel__NameAssignment_1 )? ) )
            // InternalMapping.g:1058:1: ( ( rule__SourceMetamodel__NameAssignment_1 )? )
            {
            // InternalMapping.g:1058:1: ( ( rule__SourceMetamodel__NameAssignment_1 )? )
            // InternalMapping.g:1059:2: ( rule__SourceMetamodel__NameAssignment_1 )?
            {
             before(grammarAccess.getSourceMetamodelAccess().getNameAssignment_1()); 
            // InternalMapping.g:1060:2: ( rule__SourceMetamodel__NameAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=RULE_STRING && LA8_1<=RULE_ID)) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalMapping.g:1060:3: rule__SourceMetamodel__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SourceMetamodel__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceMetamodelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__Group__1__Impl"


    // $ANTLR start "rule__SourceMetamodel__Group__2"
    // InternalMapping.g:1068:1: rule__SourceMetamodel__Group__2 : rule__SourceMetamodel__Group__2__Impl ;
    public final void rule__SourceMetamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1072:1: ( rule__SourceMetamodel__Group__2__Impl )
            // InternalMapping.g:1073:2: rule__SourceMetamodel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceMetamodel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__Group__2"


    // $ANTLR start "rule__SourceMetamodel__Group__2__Impl"
    // InternalMapping.g:1079:1: rule__SourceMetamodel__Group__2__Impl : ( ( rule__SourceMetamodel__ModelAssignment_2 ) ) ;
    public final void rule__SourceMetamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1083:1: ( ( ( rule__SourceMetamodel__ModelAssignment_2 ) ) )
            // InternalMapping.g:1084:1: ( ( rule__SourceMetamodel__ModelAssignment_2 ) )
            {
            // InternalMapping.g:1084:1: ( ( rule__SourceMetamodel__ModelAssignment_2 ) )
            // InternalMapping.g:1085:2: ( rule__SourceMetamodel__ModelAssignment_2 )
            {
             before(grammarAccess.getSourceMetamodelAccess().getModelAssignment_2()); 
            // InternalMapping.g:1086:2: ( rule__SourceMetamodel__ModelAssignment_2 )
            // InternalMapping.g:1086:3: rule__SourceMetamodel__ModelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SourceMetamodel__ModelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSourceMetamodelAccess().getModelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__Group__2__Impl"


    // $ANTLR start "rule__TargetMetamodel__Group__0"
    // InternalMapping.g:1095:1: rule__TargetMetamodel__Group__0 : rule__TargetMetamodel__Group__0__Impl rule__TargetMetamodel__Group__1 ;
    public final void rule__TargetMetamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1099:1: ( rule__TargetMetamodel__Group__0__Impl rule__TargetMetamodel__Group__1 )
            // InternalMapping.g:1100:2: rule__TargetMetamodel__Group__0__Impl rule__TargetMetamodel__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TargetMetamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetMetamodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__Group__0"


    // $ANTLR start "rule__TargetMetamodel__Group__0__Impl"
    // InternalMapping.g:1107:1: rule__TargetMetamodel__Group__0__Impl : ( () ) ;
    public final void rule__TargetMetamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1111:1: ( ( () ) )
            // InternalMapping.g:1112:1: ( () )
            {
            // InternalMapping.g:1112:1: ( () )
            // InternalMapping.g:1113:2: ()
            {
             before(grammarAccess.getTargetMetamodelAccess().getTargetMetamodelAction_0()); 
            // InternalMapping.g:1114:2: ()
            // InternalMapping.g:1114:3: 
            {
            }

             after(grammarAccess.getTargetMetamodelAccess().getTargetMetamodelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__Group__0__Impl"


    // $ANTLR start "rule__TargetMetamodel__Group__1"
    // InternalMapping.g:1122:1: rule__TargetMetamodel__Group__1 : rule__TargetMetamodel__Group__1__Impl rule__TargetMetamodel__Group__2 ;
    public final void rule__TargetMetamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1126:1: ( rule__TargetMetamodel__Group__1__Impl rule__TargetMetamodel__Group__2 )
            // InternalMapping.g:1127:2: rule__TargetMetamodel__Group__1__Impl rule__TargetMetamodel__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__TargetMetamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetMetamodel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__Group__1"


    // $ANTLR start "rule__TargetMetamodel__Group__1__Impl"
    // InternalMapping.g:1134:1: rule__TargetMetamodel__Group__1__Impl : ( ( rule__TargetMetamodel__NameAssignment_1 )? ) ;
    public final void rule__TargetMetamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1138:1: ( ( ( rule__TargetMetamodel__NameAssignment_1 )? ) )
            // InternalMapping.g:1139:1: ( ( rule__TargetMetamodel__NameAssignment_1 )? )
            {
            // InternalMapping.g:1139:1: ( ( rule__TargetMetamodel__NameAssignment_1 )? )
            // InternalMapping.g:1140:2: ( rule__TargetMetamodel__NameAssignment_1 )?
            {
             before(grammarAccess.getTargetMetamodelAccess().getNameAssignment_1()); 
            // InternalMapping.g:1141:2: ( rule__TargetMetamodel__NameAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=RULE_STRING && LA9_1<=RULE_ID)) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalMapping.g:1141:3: rule__TargetMetamodel__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TargetMetamodel__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetMetamodelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__Group__1__Impl"


    // $ANTLR start "rule__TargetMetamodel__Group__2"
    // InternalMapping.g:1149:1: rule__TargetMetamodel__Group__2 : rule__TargetMetamodel__Group__2__Impl ;
    public final void rule__TargetMetamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1153:1: ( rule__TargetMetamodel__Group__2__Impl )
            // InternalMapping.g:1154:2: rule__TargetMetamodel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetMetamodel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__Group__2"


    // $ANTLR start "rule__TargetMetamodel__Group__2__Impl"
    // InternalMapping.g:1160:1: rule__TargetMetamodel__Group__2__Impl : ( ( rule__TargetMetamodel__ModelAssignment_2 ) ) ;
    public final void rule__TargetMetamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1164:1: ( ( ( rule__TargetMetamodel__ModelAssignment_2 ) ) )
            // InternalMapping.g:1165:1: ( ( rule__TargetMetamodel__ModelAssignment_2 ) )
            {
            // InternalMapping.g:1165:1: ( ( rule__TargetMetamodel__ModelAssignment_2 ) )
            // InternalMapping.g:1166:2: ( rule__TargetMetamodel__ModelAssignment_2 )
            {
             before(grammarAccess.getTargetMetamodelAccess().getModelAssignment_2()); 
            // InternalMapping.g:1167:2: ( rule__TargetMetamodel__ModelAssignment_2 )
            // InternalMapping.g:1167:3: rule__TargetMetamodel__ModelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TargetMetamodel__ModelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetMetamodelAccess().getModelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__Group__2__Impl"


    // $ANTLR start "rule__MappingRule__Group__0"
    // InternalMapping.g:1176:1: rule__MappingRule__Group__0 : rule__MappingRule__Group__0__Impl rule__MappingRule__Group__1 ;
    public final void rule__MappingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1180:1: ( rule__MappingRule__Group__0__Impl rule__MappingRule__Group__1 )
            // InternalMapping.g:1181:2: rule__MappingRule__Group__0__Impl rule__MappingRule__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__0"


    // $ANTLR start "rule__MappingRule__Group__0__Impl"
    // InternalMapping.g:1188:1: rule__MappingRule__Group__0__Impl : ( () ) ;
    public final void rule__MappingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1192:1: ( ( () ) )
            // InternalMapping.g:1193:1: ( () )
            {
            // InternalMapping.g:1193:1: ( () )
            // InternalMapping.g:1194:2: ()
            {
             before(grammarAccess.getMappingRuleAccess().getMappingRuleAction_0()); 
            // InternalMapping.g:1195:2: ()
            // InternalMapping.g:1195:3: 
            {
            }

             after(grammarAccess.getMappingRuleAccess().getMappingRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__0__Impl"


    // $ANTLR start "rule__MappingRule__Group__1"
    // InternalMapping.g:1203:1: rule__MappingRule__Group__1 : rule__MappingRule__Group__1__Impl rule__MappingRule__Group__2 ;
    public final void rule__MappingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1207:1: ( rule__MappingRule__Group__1__Impl rule__MappingRule__Group__2 )
            // InternalMapping.g:1208:2: rule__MappingRule__Group__1__Impl rule__MappingRule__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__1"


    // $ANTLR start "rule__MappingRule__Group__1__Impl"
    // InternalMapping.g:1215:1: rule__MappingRule__Group__1__Impl : ( ( 'MappingRule' )? ) ;
    public final void rule__MappingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1219:1: ( ( ( 'MappingRule' )? ) )
            // InternalMapping.g:1220:1: ( ( 'MappingRule' )? )
            {
            // InternalMapping.g:1220:1: ( ( 'MappingRule' )? )
            // InternalMapping.g:1221:2: ( 'MappingRule' )?
            {
             before(grammarAccess.getMappingRuleAccess().getMappingRuleKeyword_1()); 
            // InternalMapping.g:1222:2: ( 'MappingRule' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMapping.g:1222:3: 'MappingRule'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getMappingRuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__1__Impl"


    // $ANTLR start "rule__MappingRule__Group__2"
    // InternalMapping.g:1230:1: rule__MappingRule__Group__2 : rule__MappingRule__Group__2__Impl rule__MappingRule__Group__3 ;
    public final void rule__MappingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1234:1: ( rule__MappingRule__Group__2__Impl rule__MappingRule__Group__3 )
            // InternalMapping.g:1235:2: rule__MappingRule__Group__2__Impl rule__MappingRule__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__2"


    // $ANTLR start "rule__MappingRule__Group__2__Impl"
    // InternalMapping.g:1242:1: rule__MappingRule__Group__2__Impl : ( ( rule__MappingRule__NameAssignment_2 )? ) ;
    public final void rule__MappingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1246:1: ( ( ( rule__MappingRule__NameAssignment_2 )? ) )
            // InternalMapping.g:1247:1: ( ( rule__MappingRule__NameAssignment_2 )? )
            {
            // InternalMapping.g:1247:1: ( ( rule__MappingRule__NameAssignment_2 )? )
            // InternalMapping.g:1248:2: ( rule__MappingRule__NameAssignment_2 )?
            {
             before(grammarAccess.getMappingRuleAccess().getNameAssignment_2()); 
            // InternalMapping.g:1249:2: ( rule__MappingRule__NameAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMapping.g:1249:3: rule__MappingRule__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__2__Impl"


    // $ANTLR start "rule__MappingRule__Group__3"
    // InternalMapping.g:1257:1: rule__MappingRule__Group__3 : rule__MappingRule__Group__3__Impl rule__MappingRule__Group__4 ;
    public final void rule__MappingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1261:1: ( rule__MappingRule__Group__3__Impl rule__MappingRule__Group__4 )
            // InternalMapping.g:1262:2: rule__MappingRule__Group__3__Impl rule__MappingRule__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__3"


    // $ANTLR start "rule__MappingRule__Group__3__Impl"
    // InternalMapping.g:1269:1: rule__MappingRule__Group__3__Impl : ( ( rule__MappingRule__Group_3__0 )? ) ;
    public final void rule__MappingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1273:1: ( ( ( rule__MappingRule__Group_3__0 )? ) )
            // InternalMapping.g:1274:1: ( ( rule__MappingRule__Group_3__0 )? )
            {
            // InternalMapping.g:1274:1: ( ( rule__MappingRule__Group_3__0 )? )
            // InternalMapping.g:1275:2: ( rule__MappingRule__Group_3__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_3()); 
            // InternalMapping.g:1276:2: ( rule__MappingRule__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMapping.g:1276:3: rule__MappingRule__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__3__Impl"


    // $ANTLR start "rule__MappingRule__Group__4"
    // InternalMapping.g:1284:1: rule__MappingRule__Group__4 : rule__MappingRule__Group__4__Impl rule__MappingRule__Group__5 ;
    public final void rule__MappingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1288:1: ( rule__MappingRule__Group__4__Impl rule__MappingRule__Group__5 )
            // InternalMapping.g:1289:2: rule__MappingRule__Group__4__Impl rule__MappingRule__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__4"


    // $ANTLR start "rule__MappingRule__Group__4__Impl"
    // InternalMapping.g:1296:1: rule__MappingRule__Group__4__Impl : ( ( rule__MappingRule__Group_4__0 )? ) ;
    public final void rule__MappingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1300:1: ( ( ( rule__MappingRule__Group_4__0 )? ) )
            // InternalMapping.g:1301:1: ( ( rule__MappingRule__Group_4__0 )? )
            {
            // InternalMapping.g:1301:1: ( ( rule__MappingRule__Group_4__0 )? )
            // InternalMapping.g:1302:2: ( rule__MappingRule__Group_4__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_4()); 
            // InternalMapping.g:1303:2: ( rule__MappingRule__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMapping.g:1303:3: rule__MappingRule__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__4__Impl"


    // $ANTLR start "rule__MappingRule__Group__5"
    // InternalMapping.g:1311:1: rule__MappingRule__Group__5 : rule__MappingRule__Group__5__Impl rule__MappingRule__Group__6 ;
    public final void rule__MappingRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1315:1: ( rule__MappingRule__Group__5__Impl rule__MappingRule__Group__6 )
            // InternalMapping.g:1316:2: rule__MappingRule__Group__5__Impl rule__MappingRule__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__5"


    // $ANTLR start "rule__MappingRule__Group__5__Impl"
    // InternalMapping.g:1323:1: rule__MappingRule__Group__5__Impl : ( ( rule__MappingRule__Group_5__0 )? ) ;
    public final void rule__MappingRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1327:1: ( ( ( rule__MappingRule__Group_5__0 )? ) )
            // InternalMapping.g:1328:1: ( ( rule__MappingRule__Group_5__0 )? )
            {
            // InternalMapping.g:1328:1: ( ( rule__MappingRule__Group_5__0 )? )
            // InternalMapping.g:1329:2: ( rule__MappingRule__Group_5__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_5()); 
            // InternalMapping.g:1330:2: ( rule__MappingRule__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMapping.g:1330:3: rule__MappingRule__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__5__Impl"


    // $ANTLR start "rule__MappingRule__Group__6"
    // InternalMapping.g:1338:1: rule__MappingRule__Group__6 : rule__MappingRule__Group__6__Impl rule__MappingRule__Group__7 ;
    public final void rule__MappingRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1342:1: ( rule__MappingRule__Group__6__Impl rule__MappingRule__Group__7 )
            // InternalMapping.g:1343:2: rule__MappingRule__Group__6__Impl rule__MappingRule__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__6"


    // $ANTLR start "rule__MappingRule__Group__6__Impl"
    // InternalMapping.g:1350:1: rule__MappingRule__Group__6__Impl : ( ( rule__MappingRule__Group_6__0 )? ) ;
    public final void rule__MappingRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1354:1: ( ( ( rule__MappingRule__Group_6__0 )? ) )
            // InternalMapping.g:1355:1: ( ( rule__MappingRule__Group_6__0 )? )
            {
            // InternalMapping.g:1355:1: ( ( rule__MappingRule__Group_6__0 )? )
            // InternalMapping.g:1356:2: ( rule__MappingRule__Group_6__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_6()); 
            // InternalMapping.g:1357:2: ( rule__MappingRule__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMapping.g:1357:3: rule__MappingRule__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__6__Impl"


    // $ANTLR start "rule__MappingRule__Group__7"
    // InternalMapping.g:1365:1: rule__MappingRule__Group__7 : rule__MappingRule__Group__7__Impl rule__MappingRule__Group__8 ;
    public final void rule__MappingRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1369:1: ( rule__MappingRule__Group__7__Impl rule__MappingRule__Group__8 )
            // InternalMapping.g:1370:2: rule__MappingRule__Group__7__Impl rule__MappingRule__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__7"


    // $ANTLR start "rule__MappingRule__Group__7__Impl"
    // InternalMapping.g:1377:1: rule__MappingRule__Group__7__Impl : ( ( rule__MappingRule__Group_7__0 )? ) ;
    public final void rule__MappingRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1381:1: ( ( ( rule__MappingRule__Group_7__0 )? ) )
            // InternalMapping.g:1382:1: ( ( rule__MappingRule__Group_7__0 )? )
            {
            // InternalMapping.g:1382:1: ( ( rule__MappingRule__Group_7__0 )? )
            // InternalMapping.g:1383:2: ( rule__MappingRule__Group_7__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_7()); 
            // InternalMapping.g:1384:2: ( rule__MappingRule__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMapping.g:1384:3: rule__MappingRule__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__7__Impl"


    // $ANTLR start "rule__MappingRule__Group__8"
    // InternalMapping.g:1392:1: rule__MappingRule__Group__8 : rule__MappingRule__Group__8__Impl rule__MappingRule__Group__9 ;
    public final void rule__MappingRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1396:1: ( rule__MappingRule__Group__8__Impl rule__MappingRule__Group__9 )
            // InternalMapping.g:1397:2: rule__MappingRule__Group__8__Impl rule__MappingRule__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__8"


    // $ANTLR start "rule__MappingRule__Group__8__Impl"
    // InternalMapping.g:1404:1: rule__MappingRule__Group__8__Impl : ( ( rule__MappingRule__Group_8__0 )? ) ;
    public final void rule__MappingRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1408:1: ( ( ( rule__MappingRule__Group_8__0 )? ) )
            // InternalMapping.g:1409:1: ( ( rule__MappingRule__Group_8__0 )? )
            {
            // InternalMapping.g:1409:1: ( ( rule__MappingRule__Group_8__0 )? )
            // InternalMapping.g:1410:2: ( rule__MappingRule__Group_8__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_8()); 
            // InternalMapping.g:1411:2: ( rule__MappingRule__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_STRING||(LA17_1>=15 && LA17_1<=16)||(LA17_1>=21 && LA17_1<=23)||(LA17_1>=25 && LA17_1<=28)) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalMapping.g:1411:3: rule__MappingRule__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__8__Impl"


    // $ANTLR start "rule__MappingRule__Group__9"
    // InternalMapping.g:1419:1: rule__MappingRule__Group__9 : rule__MappingRule__Group__9__Impl ;
    public final void rule__MappingRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1423:1: ( rule__MappingRule__Group__9__Impl )
            // InternalMapping.g:1424:2: rule__MappingRule__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__9"


    // $ANTLR start "rule__MappingRule__Group__9__Impl"
    // InternalMapping.g:1430:1: rule__MappingRule__Group__9__Impl : ( ( rule__MappingRule__Group_9__0 )? ) ;
    public final void rule__MappingRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1434:1: ( ( ( rule__MappingRule__Group_9__0 )? ) )
            // InternalMapping.g:1435:1: ( ( rule__MappingRule__Group_9__0 )? )
            {
            // InternalMapping.g:1435:1: ( ( rule__MappingRule__Group_9__0 )? )
            // InternalMapping.g:1436:2: ( rule__MappingRule__Group_9__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_9()); 
            // InternalMapping.g:1437:2: ( rule__MappingRule__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMapping.g:1437:3: rule__MappingRule__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__9__Impl"


    // $ANTLR start "rule__MappingRule__Group_3__0"
    // InternalMapping.g:1446:1: rule__MappingRule__Group_3__0 : rule__MappingRule__Group_3__0__Impl rule__MappingRule__Group_3__1 ;
    public final void rule__MappingRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1450:1: ( rule__MappingRule__Group_3__0__Impl rule__MappingRule__Group_3__1 )
            // InternalMapping.g:1451:2: rule__MappingRule__Group_3__0__Impl rule__MappingRule__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__MappingRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_3__0"


    // $ANTLR start "rule__MappingRule__Group_3__0__Impl"
    // InternalMapping.g:1458:1: rule__MappingRule__Group_3__0__Impl : ( 'source' ) ;
    public final void rule__MappingRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1462:1: ( ( 'source' ) )
            // InternalMapping.g:1463:1: ( 'source' )
            {
            // InternalMapping.g:1463:1: ( 'source' )
            // InternalMapping.g:1464:2: 'source'
            {
             before(grammarAccess.getMappingRuleAccess().getSourceKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getSourceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_3__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_3__1"
    // InternalMapping.g:1473:1: rule__MappingRule__Group_3__1 : rule__MappingRule__Group_3__1__Impl rule__MappingRule__Group_3__2 ;
    public final void rule__MappingRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1477:1: ( rule__MappingRule__Group_3__1__Impl rule__MappingRule__Group_3__2 )
            // InternalMapping.g:1478:2: rule__MappingRule__Group_3__1__Impl rule__MappingRule__Group_3__2
            {
            pushFollow(FOLLOW_15);
            rule__MappingRule__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_3__1"


    // $ANTLR start "rule__MappingRule__Group_3__1__Impl"
    // InternalMapping.g:1485:1: rule__MappingRule__Group_3__1__Impl : ( ( rule__MappingRule__SourceAssignment_3_1 ) ) ;
    public final void rule__MappingRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1489:1: ( ( ( rule__MappingRule__SourceAssignment_3_1 ) ) )
            // InternalMapping.g:1490:1: ( ( rule__MappingRule__SourceAssignment_3_1 ) )
            {
            // InternalMapping.g:1490:1: ( ( rule__MappingRule__SourceAssignment_3_1 ) )
            // InternalMapping.g:1491:2: ( rule__MappingRule__SourceAssignment_3_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getSourceAssignment_3_1()); 
            // InternalMapping.g:1492:2: ( rule__MappingRule__SourceAssignment_3_1 )
            // InternalMapping.g:1492:3: rule__MappingRule__SourceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__SourceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getSourceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_3__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_3__2"
    // InternalMapping.g:1500:1: rule__MappingRule__Group_3__2 : rule__MappingRule__Group_3__2__Impl ;
    public final void rule__MappingRule__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1504:1: ( rule__MappingRule__Group_3__2__Impl )
            // InternalMapping.g:1505:2: rule__MappingRule__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_3__2"


    // $ANTLR start "rule__MappingRule__Group_3__2__Impl"
    // InternalMapping.g:1511:1: rule__MappingRule__Group_3__2__Impl : ( ( rule__MappingRule__Group_3_2__0 )? ) ;
    public final void rule__MappingRule__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1515:1: ( ( ( rule__MappingRule__Group_3_2__0 )? ) )
            // InternalMapping.g:1516:1: ( ( rule__MappingRule__Group_3_2__0 )? )
            {
            // InternalMapping.g:1516:1: ( ( rule__MappingRule__Group_3_2__0 )? )
            // InternalMapping.g:1517:2: ( rule__MappingRule__Group_3_2__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_3_2()); 
            // InternalMapping.g:1518:2: ( rule__MappingRule__Group_3_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMapping.g:1518:3: rule__MappingRule__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_3__2__Impl"


    // $ANTLR start "rule__MappingRule__Group_3_2__0"
    // InternalMapping.g:1527:1: rule__MappingRule__Group_3_2__0 : rule__MappingRule__Group_3_2__0__Impl rule__MappingRule__Group_3_2__1 ;
    public final void rule__MappingRule__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1531:1: ( rule__MappingRule__Group_3_2__0__Impl rule__MappingRule__Group_3_2__1 )
            // InternalMapping.g:1532:2: rule__MappingRule__Group_3_2__0__Impl rule__MappingRule__Group_3_2__1
            {
            pushFollow(FOLLOW_11);
            rule__MappingRule__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_3_2__0"


    // $ANTLR start "rule__MappingRule__Group_3_2__0__Impl"
    // InternalMapping.g:1539:1: rule__MappingRule__Group_3_2__0__Impl : ( '::' ) ;
    public final void rule__MappingRule__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1543:1: ( ( '::' ) )
            // InternalMapping.g:1544:1: ( '::' )
            {
            // InternalMapping.g:1544:1: ( '::' )
            // InternalMapping.g:1545:2: '::'
            {
             before(grammarAccess.getMappingRuleAccess().getColonColonKeyword_3_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getColonColonKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_3_2__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_3_2__1"
    // InternalMapping.g:1554:1: rule__MappingRule__Group_3_2__1 : rule__MappingRule__Group_3_2__1__Impl ;
    public final void rule__MappingRule__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1558:1: ( rule__MappingRule__Group_3_2__1__Impl )
            // InternalMapping.g:1559:2: rule__MappingRule__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_3_2__1"


    // $ANTLR start "rule__MappingRule__Group_3_2__1__Impl"
    // InternalMapping.g:1565:1: rule__MappingRule__Group_3_2__1__Impl : ( ( rule__MappingRule__EEnumLiteralAssignment_3_2_1 ) ) ;
    public final void rule__MappingRule__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1569:1: ( ( ( rule__MappingRule__EEnumLiteralAssignment_3_2_1 ) ) )
            // InternalMapping.g:1570:1: ( ( rule__MappingRule__EEnumLiteralAssignment_3_2_1 ) )
            {
            // InternalMapping.g:1570:1: ( ( rule__MappingRule__EEnumLiteralAssignment_3_2_1 ) )
            // InternalMapping.g:1571:2: ( rule__MappingRule__EEnumLiteralAssignment_3_2_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getEEnumLiteralAssignment_3_2_1()); 
            // InternalMapping.g:1572:2: ( rule__MappingRule__EEnumLiteralAssignment_3_2_1 )
            // InternalMapping.g:1572:3: rule__MappingRule__EEnumLiteralAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__EEnumLiteralAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getEEnumLiteralAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_3_2__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_4__0"
    // InternalMapping.g:1581:1: rule__MappingRule__Group_4__0 : rule__MappingRule__Group_4__0__Impl rule__MappingRule__Group_4__1 ;
    public final void rule__MappingRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1585:1: ( rule__MappingRule__Group_4__0__Impl rule__MappingRule__Group_4__1 )
            // InternalMapping.g:1586:2: rule__MappingRule__Group_4__0__Impl rule__MappingRule__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__MappingRule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_4__0"


    // $ANTLR start "rule__MappingRule__Group_4__0__Impl"
    // InternalMapping.g:1593:1: rule__MappingRule__Group_4__0__Impl : ( 'target' ) ;
    public final void rule__MappingRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1597:1: ( ( 'target' ) )
            // InternalMapping.g:1598:1: ( 'target' )
            {
            // InternalMapping.g:1598:1: ( 'target' )
            // InternalMapping.g:1599:2: 'target'
            {
             before(grammarAccess.getMappingRuleAccess().getTargetKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getTargetKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_4__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_4__1"
    // InternalMapping.g:1608:1: rule__MappingRule__Group_4__1 : rule__MappingRule__Group_4__1__Impl ;
    public final void rule__MappingRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1612:1: ( rule__MappingRule__Group_4__1__Impl )
            // InternalMapping.g:1613:2: rule__MappingRule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_4__1"


    // $ANTLR start "rule__MappingRule__Group_4__1__Impl"
    // InternalMapping.g:1619:1: rule__MappingRule__Group_4__1__Impl : ( ( rule__MappingRule__TargetAssignment_4_1 ) ) ;
    public final void rule__MappingRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1623:1: ( ( ( rule__MappingRule__TargetAssignment_4_1 ) ) )
            // InternalMapping.g:1624:1: ( ( rule__MappingRule__TargetAssignment_4_1 ) )
            {
            // InternalMapping.g:1624:1: ( ( rule__MappingRule__TargetAssignment_4_1 ) )
            // InternalMapping.g:1625:2: ( rule__MappingRule__TargetAssignment_4_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getTargetAssignment_4_1()); 
            // InternalMapping.g:1626:2: ( rule__MappingRule__TargetAssignment_4_1 )
            // InternalMapping.g:1626:3: rule__MappingRule__TargetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__TargetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getTargetAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_4__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_5__0"
    // InternalMapping.g:1635:1: rule__MappingRule__Group_5__0 : rule__MappingRule__Group_5__0__Impl rule__MappingRule__Group_5__1 ;
    public final void rule__MappingRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1639:1: ( rule__MappingRule__Group_5__0__Impl rule__MappingRule__Group_5__1 )
            // InternalMapping.g:1640:2: rule__MappingRule__Group_5__0__Impl rule__MappingRule__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__MappingRule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5__0"


    // $ANTLR start "rule__MappingRule__Group_5__0__Impl"
    // InternalMapping.g:1647:1: rule__MappingRule__Group_5__0__Impl : ( 'operator' ) ;
    public final void rule__MappingRule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1651:1: ( ( 'operator' ) )
            // InternalMapping.g:1652:1: ( 'operator' )
            {
            // InternalMapping.g:1652:1: ( 'operator' )
            // InternalMapping.g:1653:2: 'operator'
            {
             before(grammarAccess.getMappingRuleAccess().getOperatorKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getOperatorKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_5__1"
    // InternalMapping.g:1662:1: rule__MappingRule__Group_5__1 : rule__MappingRule__Group_5__1__Impl ;
    public final void rule__MappingRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1666:1: ( rule__MappingRule__Group_5__1__Impl )
            // InternalMapping.g:1667:2: rule__MappingRule__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5__1"


    // $ANTLR start "rule__MappingRule__Group_5__1__Impl"
    // InternalMapping.g:1673:1: rule__MappingRule__Group_5__1__Impl : ( ( rule__MappingRule__OperatorAssignment_5_1 ) ) ;
    public final void rule__MappingRule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1677:1: ( ( ( rule__MappingRule__OperatorAssignment_5_1 ) ) )
            // InternalMapping.g:1678:1: ( ( rule__MappingRule__OperatorAssignment_5_1 ) )
            {
            // InternalMapping.g:1678:1: ( ( rule__MappingRule__OperatorAssignment_5_1 ) )
            // InternalMapping.g:1679:2: ( rule__MappingRule__OperatorAssignment_5_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getOperatorAssignment_5_1()); 
            // InternalMapping.g:1680:2: ( rule__MappingRule__OperatorAssignment_5_1 )
            // InternalMapping.g:1680:3: rule__MappingRule__OperatorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__OperatorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getOperatorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_6__0"
    // InternalMapping.g:1689:1: rule__MappingRule__Group_6__0 : rule__MappingRule__Group_6__0__Impl rule__MappingRule__Group_6__1 ;
    public final void rule__MappingRule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1693:1: ( rule__MappingRule__Group_6__0__Impl rule__MappingRule__Group_6__1 )
            // InternalMapping.g:1694:2: rule__MappingRule__Group_6__0__Impl rule__MappingRule__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__MappingRule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_6__0"


    // $ANTLR start "rule__MappingRule__Group_6__0__Impl"
    // InternalMapping.g:1701:1: rule__MappingRule__Group_6__0__Impl : ( 'condition' ) ;
    public final void rule__MappingRule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1705:1: ( ( 'condition' ) )
            // InternalMapping.g:1706:1: ( 'condition' )
            {
            // InternalMapping.g:1706:1: ( 'condition' )
            // InternalMapping.g:1707:2: 'condition'
            {
             before(grammarAccess.getMappingRuleAccess().getConditionKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getConditionKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_6__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_6__1"
    // InternalMapping.g:1716:1: rule__MappingRule__Group_6__1 : rule__MappingRule__Group_6__1__Impl ;
    public final void rule__MappingRule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1720:1: ( rule__MappingRule__Group_6__1__Impl )
            // InternalMapping.g:1721:2: rule__MappingRule__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_6__1"


    // $ANTLR start "rule__MappingRule__Group_6__1__Impl"
    // InternalMapping.g:1727:1: rule__MappingRule__Group_6__1__Impl : ( ( rule__MappingRule__ConditionAssignment_6_1 ) ) ;
    public final void rule__MappingRule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1731:1: ( ( ( rule__MappingRule__ConditionAssignment_6_1 ) ) )
            // InternalMapping.g:1732:1: ( ( rule__MappingRule__ConditionAssignment_6_1 ) )
            {
            // InternalMapping.g:1732:1: ( ( rule__MappingRule__ConditionAssignment_6_1 ) )
            // InternalMapping.g:1733:2: ( rule__MappingRule__ConditionAssignment_6_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getConditionAssignment_6_1()); 
            // InternalMapping.g:1734:2: ( rule__MappingRule__ConditionAssignment_6_1 )
            // InternalMapping.g:1734:3: rule__MappingRule__ConditionAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__ConditionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getConditionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_6__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_7__0"
    // InternalMapping.g:1743:1: rule__MappingRule__Group_7__0 : rule__MappingRule__Group_7__0__Impl rule__MappingRule__Group_7__1 ;
    public final void rule__MappingRule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1747:1: ( rule__MappingRule__Group_7__0__Impl rule__MappingRule__Group_7__1 )
            // InternalMapping.g:1748:2: rule__MappingRule__Group_7__0__Impl rule__MappingRule__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__MappingRule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_7__0"


    // $ANTLR start "rule__MappingRule__Group_7__0__Impl"
    // InternalMapping.g:1755:1: rule__MappingRule__Group_7__0__Impl : ( 'comment' ) ;
    public final void rule__MappingRule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1759:1: ( ( 'comment' ) )
            // InternalMapping.g:1760:1: ( 'comment' )
            {
            // InternalMapping.g:1760:1: ( 'comment' )
            // InternalMapping.g:1761:2: 'comment'
            {
             before(grammarAccess.getMappingRuleAccess().getCommentKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getCommentKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_7__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_7__1"
    // InternalMapping.g:1770:1: rule__MappingRule__Group_7__1 : rule__MappingRule__Group_7__1__Impl ;
    public final void rule__MappingRule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1774:1: ( rule__MappingRule__Group_7__1__Impl )
            // InternalMapping.g:1775:2: rule__MappingRule__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_7__1"


    // $ANTLR start "rule__MappingRule__Group_7__1__Impl"
    // InternalMapping.g:1781:1: rule__MappingRule__Group_7__1__Impl : ( ( rule__MappingRule__CommentAssignment_7_1 ) ) ;
    public final void rule__MappingRule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1785:1: ( ( ( rule__MappingRule__CommentAssignment_7_1 ) ) )
            // InternalMapping.g:1786:1: ( ( rule__MappingRule__CommentAssignment_7_1 ) )
            {
            // InternalMapping.g:1786:1: ( ( rule__MappingRule__CommentAssignment_7_1 ) )
            // InternalMapping.g:1787:2: ( rule__MappingRule__CommentAssignment_7_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getCommentAssignment_7_1()); 
            // InternalMapping.g:1788:2: ( rule__MappingRule__CommentAssignment_7_1 )
            // InternalMapping.g:1788:3: rule__MappingRule__CommentAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__CommentAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getCommentAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_7__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_8__0"
    // InternalMapping.g:1797:1: rule__MappingRule__Group_8__0 : rule__MappingRule__Group_8__0__Impl rule__MappingRule__Group_8__1 ;
    public final void rule__MappingRule__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1801:1: ( rule__MappingRule__Group_8__0__Impl rule__MappingRule__Group_8__1 )
            // InternalMapping.g:1802:2: rule__MappingRule__Group_8__0__Impl rule__MappingRule__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8__0"


    // $ANTLR start "rule__MappingRule__Group_8__0__Impl"
    // InternalMapping.g:1809:1: rule__MappingRule__Group_8__0__Impl : ( '{' ) ;
    public final void rule__MappingRule__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1813:1: ( ( '{' ) )
            // InternalMapping.g:1814:1: ( '{' )
            {
            // InternalMapping.g:1814:1: ( '{' )
            // InternalMapping.g:1815:2: '{'
            {
             before(grammarAccess.getMappingRuleAccess().getLeftCurlyBracketKeyword_8_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getLeftCurlyBracketKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_8__1"
    // InternalMapping.g:1824:1: rule__MappingRule__Group_8__1 : rule__MappingRule__Group_8__1__Impl rule__MappingRule__Group_8__2 ;
    public final void rule__MappingRule__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1828:1: ( rule__MappingRule__Group_8__1__Impl rule__MappingRule__Group_8__2 )
            // InternalMapping.g:1829:2: rule__MappingRule__Group_8__1__Impl rule__MappingRule__Group_8__2
            {
            pushFollow(FOLLOW_13);
            rule__MappingRule__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8__1"


    // $ANTLR start "rule__MappingRule__Group_8__1__Impl"
    // InternalMapping.g:1836:1: rule__MappingRule__Group_8__1__Impl : ( ( rule__MappingRule__ChildRulesAssignment_8_1 ) ) ;
    public final void rule__MappingRule__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1840:1: ( ( ( rule__MappingRule__ChildRulesAssignment_8_1 ) ) )
            // InternalMapping.g:1841:1: ( ( rule__MappingRule__ChildRulesAssignment_8_1 ) )
            {
            // InternalMapping.g:1841:1: ( ( rule__MappingRule__ChildRulesAssignment_8_1 ) )
            // InternalMapping.g:1842:2: ( rule__MappingRule__ChildRulesAssignment_8_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getChildRulesAssignment_8_1()); 
            // InternalMapping.g:1843:2: ( rule__MappingRule__ChildRulesAssignment_8_1 )
            // InternalMapping.g:1843:3: rule__MappingRule__ChildRulesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__ChildRulesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getChildRulesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_8__2"
    // InternalMapping.g:1851:1: rule__MappingRule__Group_8__2 : rule__MappingRule__Group_8__2__Impl rule__MappingRule__Group_8__3 ;
    public final void rule__MappingRule__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1855:1: ( rule__MappingRule__Group_8__2__Impl rule__MappingRule__Group_8__3 )
            // InternalMapping.g:1856:2: rule__MappingRule__Group_8__2__Impl rule__MappingRule__Group_8__3
            {
            pushFollow(FOLLOW_13);
            rule__MappingRule__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8__2"


    // $ANTLR start "rule__MappingRule__Group_8__2__Impl"
    // InternalMapping.g:1863:1: rule__MappingRule__Group_8__2__Impl : ( ( rule__MappingRule__Group_8_2__0 )* ) ;
    public final void rule__MappingRule__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1867:1: ( ( ( rule__MappingRule__Group_8_2__0 )* ) )
            // InternalMapping.g:1868:1: ( ( rule__MappingRule__Group_8_2__0 )* )
            {
            // InternalMapping.g:1868:1: ( ( rule__MappingRule__Group_8_2__0 )* )
            // InternalMapping.g:1869:2: ( rule__MappingRule__Group_8_2__0 )*
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_8_2()); 
            // InternalMapping.g:1870:2: ( rule__MappingRule__Group_8_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMapping.g:1870:3: rule__MappingRule__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__MappingRule__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMappingRuleAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8__2__Impl"


    // $ANTLR start "rule__MappingRule__Group_8__3"
    // InternalMapping.g:1878:1: rule__MappingRule__Group_8__3 : rule__MappingRule__Group_8__3__Impl ;
    public final void rule__MappingRule__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1882:1: ( rule__MappingRule__Group_8__3__Impl )
            // InternalMapping.g:1883:2: rule__MappingRule__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8__3"


    // $ANTLR start "rule__MappingRule__Group_8__3__Impl"
    // InternalMapping.g:1889:1: rule__MappingRule__Group_8__3__Impl : ( '}' ) ;
    public final void rule__MappingRule__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1893:1: ( ( '}' ) )
            // InternalMapping.g:1894:1: ( '}' )
            {
            // InternalMapping.g:1894:1: ( '}' )
            // InternalMapping.g:1895:2: '}'
            {
             before(grammarAccess.getMappingRuleAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getRightCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8__3__Impl"


    // $ANTLR start "rule__MappingRule__Group_8_2__0"
    // InternalMapping.g:1905:1: rule__MappingRule__Group_8_2__0 : rule__MappingRule__Group_8_2__0__Impl rule__MappingRule__Group_8_2__1 ;
    public final void rule__MappingRule__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1909:1: ( rule__MappingRule__Group_8_2__0__Impl rule__MappingRule__Group_8_2__1 )
            // InternalMapping.g:1910:2: rule__MappingRule__Group_8_2__0__Impl rule__MappingRule__Group_8_2__1
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8_2__0"


    // $ANTLR start "rule__MappingRule__Group_8_2__0__Impl"
    // InternalMapping.g:1917:1: rule__MappingRule__Group_8_2__0__Impl : ( ';' ) ;
    public final void rule__MappingRule__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1921:1: ( ( ';' ) )
            // InternalMapping.g:1922:1: ( ';' )
            {
            // InternalMapping.g:1922:1: ( ';' )
            // InternalMapping.g:1923:2: ';'
            {
             before(grammarAccess.getMappingRuleAccess().getSemicolonKeyword_8_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getSemicolonKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8_2__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_8_2__1"
    // InternalMapping.g:1932:1: rule__MappingRule__Group_8_2__1 : rule__MappingRule__Group_8_2__1__Impl ;
    public final void rule__MappingRule__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1936:1: ( rule__MappingRule__Group_8_2__1__Impl )
            // InternalMapping.g:1937:2: rule__MappingRule__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8_2__1"


    // $ANTLR start "rule__MappingRule__Group_8_2__1__Impl"
    // InternalMapping.g:1943:1: rule__MappingRule__Group_8_2__1__Impl : ( ( rule__MappingRule__ChildRulesAssignment_8_2_1 ) ) ;
    public final void rule__MappingRule__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1947:1: ( ( ( rule__MappingRule__ChildRulesAssignment_8_2_1 ) ) )
            // InternalMapping.g:1948:1: ( ( rule__MappingRule__ChildRulesAssignment_8_2_1 ) )
            {
            // InternalMapping.g:1948:1: ( ( rule__MappingRule__ChildRulesAssignment_8_2_1 ) )
            // InternalMapping.g:1949:2: ( rule__MappingRule__ChildRulesAssignment_8_2_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getChildRulesAssignment_8_2_1()); 
            // InternalMapping.g:1950:2: ( rule__MappingRule__ChildRulesAssignment_8_2_1 )
            // InternalMapping.g:1950:3: rule__MappingRule__ChildRulesAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__ChildRulesAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getChildRulesAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8_2__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_9__0"
    // InternalMapping.g:1959:1: rule__MappingRule__Group_9__0 : rule__MappingRule__Group_9__0__Impl rule__MappingRule__Group_9__1 ;
    public final void rule__MappingRule__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1963:1: ( rule__MappingRule__Group_9__0__Impl rule__MappingRule__Group_9__1 )
            // InternalMapping.g:1964:2: rule__MappingRule__Group_9__0__Impl rule__MappingRule__Group_9__1
            {
            pushFollow(FOLLOW_17);
            rule__MappingRule__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9__0"


    // $ANTLR start "rule__MappingRule__Group_9__0__Impl"
    // InternalMapping.g:1971:1: rule__MappingRule__Group_9__0__Impl : ( '{' ) ;
    public final void rule__MappingRule__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1975:1: ( ( '{' ) )
            // InternalMapping.g:1976:1: ( '{' )
            {
            // InternalMapping.g:1976:1: ( '{' )
            // InternalMapping.g:1977:2: '{'
            {
             before(grammarAccess.getMappingRuleAccess().getLeftCurlyBracketKeyword_9_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getLeftCurlyBracketKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_9__1"
    // InternalMapping.g:1986:1: rule__MappingRule__Group_9__1 : rule__MappingRule__Group_9__1__Impl rule__MappingRule__Group_9__2 ;
    public final void rule__MappingRule__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1990:1: ( rule__MappingRule__Group_9__1__Impl rule__MappingRule__Group_9__2 )
            // InternalMapping.g:1991:2: rule__MappingRule__Group_9__1__Impl rule__MappingRule__Group_9__2
            {
            pushFollow(FOLLOW_13);
            rule__MappingRule__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9__1"


    // $ANTLR start "rule__MappingRule__Group_9__1__Impl"
    // InternalMapping.g:1998:1: rule__MappingRule__Group_9__1__Impl : ( ( rule__MappingRule__ChildHelpersAssignment_9_1 ) ) ;
    public final void rule__MappingRule__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2002:1: ( ( ( rule__MappingRule__ChildHelpersAssignment_9_1 ) ) )
            // InternalMapping.g:2003:1: ( ( rule__MappingRule__ChildHelpersAssignment_9_1 ) )
            {
            // InternalMapping.g:2003:1: ( ( rule__MappingRule__ChildHelpersAssignment_9_1 ) )
            // InternalMapping.g:2004:2: ( rule__MappingRule__ChildHelpersAssignment_9_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getChildHelpersAssignment_9_1()); 
            // InternalMapping.g:2005:2: ( rule__MappingRule__ChildHelpersAssignment_9_1 )
            // InternalMapping.g:2005:3: rule__MappingRule__ChildHelpersAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__ChildHelpersAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getChildHelpersAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_9__2"
    // InternalMapping.g:2013:1: rule__MappingRule__Group_9__2 : rule__MappingRule__Group_9__2__Impl rule__MappingRule__Group_9__3 ;
    public final void rule__MappingRule__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2017:1: ( rule__MappingRule__Group_9__2__Impl rule__MappingRule__Group_9__3 )
            // InternalMapping.g:2018:2: rule__MappingRule__Group_9__2__Impl rule__MappingRule__Group_9__3
            {
            pushFollow(FOLLOW_13);
            rule__MappingRule__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9__2"


    // $ANTLR start "rule__MappingRule__Group_9__2__Impl"
    // InternalMapping.g:2025:1: rule__MappingRule__Group_9__2__Impl : ( ( rule__MappingRule__Group_9_2__0 )* ) ;
    public final void rule__MappingRule__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2029:1: ( ( ( rule__MappingRule__Group_9_2__0 )* ) )
            // InternalMapping.g:2030:1: ( ( rule__MappingRule__Group_9_2__0 )* )
            {
            // InternalMapping.g:2030:1: ( ( rule__MappingRule__Group_9_2__0 )* )
            // InternalMapping.g:2031:2: ( rule__MappingRule__Group_9_2__0 )*
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_9_2()); 
            // InternalMapping.g:2032:2: ( rule__MappingRule__Group_9_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMapping.g:2032:3: rule__MappingRule__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__MappingRule__Group_9_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getMappingRuleAccess().getGroup_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9__2__Impl"


    // $ANTLR start "rule__MappingRule__Group_9__3"
    // InternalMapping.g:2040:1: rule__MappingRule__Group_9__3 : rule__MappingRule__Group_9__3__Impl ;
    public final void rule__MappingRule__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2044:1: ( rule__MappingRule__Group_9__3__Impl )
            // InternalMapping.g:2045:2: rule__MappingRule__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9__3"


    // $ANTLR start "rule__MappingRule__Group_9__3__Impl"
    // InternalMapping.g:2051:1: rule__MappingRule__Group_9__3__Impl : ( '}' ) ;
    public final void rule__MappingRule__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2055:1: ( ( '}' ) )
            // InternalMapping.g:2056:1: ( '}' )
            {
            // InternalMapping.g:2056:1: ( '}' )
            // InternalMapping.g:2057:2: '}'
            {
             before(grammarAccess.getMappingRuleAccess().getRightCurlyBracketKeyword_9_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getRightCurlyBracketKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9__3__Impl"


    // $ANTLR start "rule__MappingRule__Group_9_2__0"
    // InternalMapping.g:2067:1: rule__MappingRule__Group_9_2__0 : rule__MappingRule__Group_9_2__0__Impl rule__MappingRule__Group_9_2__1 ;
    public final void rule__MappingRule__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2071:1: ( rule__MappingRule__Group_9_2__0__Impl rule__MappingRule__Group_9_2__1 )
            // InternalMapping.g:2072:2: rule__MappingRule__Group_9_2__0__Impl rule__MappingRule__Group_9_2__1
            {
            pushFollow(FOLLOW_17);
            rule__MappingRule__Group_9_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_9_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9_2__0"


    // $ANTLR start "rule__MappingRule__Group_9_2__0__Impl"
    // InternalMapping.g:2079:1: rule__MappingRule__Group_9_2__0__Impl : ( ';' ) ;
    public final void rule__MappingRule__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2083:1: ( ( ';' ) )
            // InternalMapping.g:2084:1: ( ';' )
            {
            // InternalMapping.g:2084:1: ( ';' )
            // InternalMapping.g:2085:2: ';'
            {
             before(grammarAccess.getMappingRuleAccess().getSemicolonKeyword_9_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getSemicolonKeyword_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9_2__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_9_2__1"
    // InternalMapping.g:2094:1: rule__MappingRule__Group_9_2__1 : rule__MappingRule__Group_9_2__1__Impl ;
    public final void rule__MappingRule__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2098:1: ( rule__MappingRule__Group_9_2__1__Impl )
            // InternalMapping.g:2099:2: rule__MappingRule__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_9_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9_2__1"


    // $ANTLR start "rule__MappingRule__Group_9_2__1__Impl"
    // InternalMapping.g:2105:1: rule__MappingRule__Group_9_2__1__Impl : ( ( rule__MappingRule__ChildHelpersAssignment_9_2_1 ) ) ;
    public final void rule__MappingRule__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2109:1: ( ( ( rule__MappingRule__ChildHelpersAssignment_9_2_1 ) ) )
            // InternalMapping.g:2110:1: ( ( rule__MappingRule__ChildHelpersAssignment_9_2_1 ) )
            {
            // InternalMapping.g:2110:1: ( ( rule__MappingRule__ChildHelpersAssignment_9_2_1 ) )
            // InternalMapping.g:2111:2: ( rule__MappingRule__ChildHelpersAssignment_9_2_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getChildHelpersAssignment_9_2_1()); 
            // InternalMapping.g:2112:2: ( rule__MappingRule__ChildHelpersAssignment_9_2_1 )
            // InternalMapping.g:2112:3: rule__MappingRule__ChildHelpersAssignment_9_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__ChildHelpersAssignment_9_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getChildHelpersAssignment_9_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9_2__1__Impl"


    // $ANTLR start "rule__HelperStatement__Group__0"
    // InternalMapping.g:2121:1: rule__HelperStatement__Group__0 : rule__HelperStatement__Group__0__Impl rule__HelperStatement__Group__1 ;
    public final void rule__HelperStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2125:1: ( rule__HelperStatement__Group__0__Impl rule__HelperStatement__Group__1 )
            // InternalMapping.g:2126:2: rule__HelperStatement__Group__0__Impl rule__HelperStatement__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__HelperStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__0"


    // $ANTLR start "rule__HelperStatement__Group__0__Impl"
    // InternalMapping.g:2133:1: rule__HelperStatement__Group__0__Impl : ( () ) ;
    public final void rule__HelperStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2137:1: ( ( () ) )
            // InternalMapping.g:2138:1: ( () )
            {
            // InternalMapping.g:2138:1: ( () )
            // InternalMapping.g:2139:2: ()
            {
             before(grammarAccess.getHelperStatementAccess().getHelperStatementAction_0()); 
            // InternalMapping.g:2140:2: ()
            // InternalMapping.g:2140:3: 
            {
            }

             after(grammarAccess.getHelperStatementAccess().getHelperStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__0__Impl"


    // $ANTLR start "rule__HelperStatement__Group__1"
    // InternalMapping.g:2148:1: rule__HelperStatement__Group__1 : rule__HelperStatement__Group__1__Impl rule__HelperStatement__Group__2 ;
    public final void rule__HelperStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2152:1: ( rule__HelperStatement__Group__1__Impl rule__HelperStatement__Group__2 )
            // InternalMapping.g:2153:2: rule__HelperStatement__Group__1__Impl rule__HelperStatement__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__HelperStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__1"


    // $ANTLR start "rule__HelperStatement__Group__1__Impl"
    // InternalMapping.g:2160:1: rule__HelperStatement__Group__1__Impl : ( ( 'HelperStatement' )? ) ;
    public final void rule__HelperStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2164:1: ( ( ( 'HelperStatement' )? ) )
            // InternalMapping.g:2165:1: ( ( 'HelperStatement' )? )
            {
            // InternalMapping.g:2165:1: ( ( 'HelperStatement' )? )
            // InternalMapping.g:2166:2: ( 'HelperStatement' )?
            {
             before(grammarAccess.getHelperStatementAccess().getHelperStatementKeyword_1()); 
            // InternalMapping.g:2167:2: ( 'HelperStatement' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMapping.g:2167:3: 'HelperStatement'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHelperStatementAccess().getHelperStatementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__1__Impl"


    // $ANTLR start "rule__HelperStatement__Group__2"
    // InternalMapping.g:2175:1: rule__HelperStatement__Group__2 : rule__HelperStatement__Group__2__Impl rule__HelperStatement__Group__3 ;
    public final void rule__HelperStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2179:1: ( rule__HelperStatement__Group__2__Impl rule__HelperStatement__Group__3 )
            // InternalMapping.g:2180:2: rule__HelperStatement__Group__2__Impl rule__HelperStatement__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__HelperStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__2"


    // $ANTLR start "rule__HelperStatement__Group__2__Impl"
    // InternalMapping.g:2187:1: rule__HelperStatement__Group__2__Impl : ( ( rule__HelperStatement__Group_2__0 ) ) ;
    public final void rule__HelperStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2191:1: ( ( ( rule__HelperStatement__Group_2__0 ) ) )
            // InternalMapping.g:2192:1: ( ( rule__HelperStatement__Group_2__0 ) )
            {
            // InternalMapping.g:2192:1: ( ( rule__HelperStatement__Group_2__0 ) )
            // InternalMapping.g:2193:2: ( rule__HelperStatement__Group_2__0 )
            {
             before(grammarAccess.getHelperStatementAccess().getGroup_2()); 
            // InternalMapping.g:2194:2: ( rule__HelperStatement__Group_2__0 )
            // InternalMapping.g:2194:3: rule__HelperStatement__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__2__Impl"


    // $ANTLR start "rule__HelperStatement__Group__3"
    // InternalMapping.g:2202:1: rule__HelperStatement__Group__3 : rule__HelperStatement__Group__3__Impl rule__HelperStatement__Group__4 ;
    public final void rule__HelperStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2206:1: ( rule__HelperStatement__Group__3__Impl rule__HelperStatement__Group__4 )
            // InternalMapping.g:2207:2: rule__HelperStatement__Group__3__Impl rule__HelperStatement__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__HelperStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__3"


    // $ANTLR start "rule__HelperStatement__Group__3__Impl"
    // InternalMapping.g:2214:1: rule__HelperStatement__Group__3__Impl : ( ( rule__HelperStatement__Group_3__0 )? ) ;
    public final void rule__HelperStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2218:1: ( ( ( rule__HelperStatement__Group_3__0 )? ) )
            // InternalMapping.g:2219:1: ( ( rule__HelperStatement__Group_3__0 )? )
            {
            // InternalMapping.g:2219:1: ( ( rule__HelperStatement__Group_3__0 )? )
            // InternalMapping.g:2220:2: ( rule__HelperStatement__Group_3__0 )?
            {
             before(grammarAccess.getHelperStatementAccess().getGroup_3()); 
            // InternalMapping.g:2221:2: ( rule__HelperStatement__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_STRING||(LA23_1>=15 && LA23_1<=16)||LA23_1==18||(LA23_1>=22 && LA23_1<=23)||(LA23_1>=25 && LA23_1<=28)) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalMapping.g:2221:3: rule__HelperStatement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HelperStatement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHelperStatementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__3__Impl"


    // $ANTLR start "rule__HelperStatement__Group__4"
    // InternalMapping.g:2229:1: rule__HelperStatement__Group__4 : rule__HelperStatement__Group__4__Impl ;
    public final void rule__HelperStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2233:1: ( rule__HelperStatement__Group__4__Impl )
            // InternalMapping.g:2234:2: rule__HelperStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__4"


    // $ANTLR start "rule__HelperStatement__Group__4__Impl"
    // InternalMapping.g:2240:1: rule__HelperStatement__Group__4__Impl : ( ( rule__HelperStatement__Group_4__0 )? ) ;
    public final void rule__HelperStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2244:1: ( ( ( rule__HelperStatement__Group_4__0 )? ) )
            // InternalMapping.g:2245:1: ( ( rule__HelperStatement__Group_4__0 )? )
            {
            // InternalMapping.g:2245:1: ( ( rule__HelperStatement__Group_4__0 )? )
            // InternalMapping.g:2246:2: ( rule__HelperStatement__Group_4__0 )?
            {
             before(grammarAccess.getHelperStatementAccess().getGroup_4()); 
            // InternalMapping.g:2247:2: ( rule__HelperStatement__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMapping.g:2247:3: rule__HelperStatement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HelperStatement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHelperStatementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__4__Impl"


    // $ANTLR start "rule__HelperStatement__Group_2__0"
    // InternalMapping.g:2256:1: rule__HelperStatement__Group_2__0 : rule__HelperStatement__Group_2__0__Impl rule__HelperStatement__Group_2__1 ;
    public final void rule__HelperStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2260:1: ( rule__HelperStatement__Group_2__0__Impl rule__HelperStatement__Group_2__1 )
            // InternalMapping.g:2261:2: rule__HelperStatement__Group_2__0__Impl rule__HelperStatement__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__HelperStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_2__0"


    // $ANTLR start "rule__HelperStatement__Group_2__0__Impl"
    // InternalMapping.g:2268:1: rule__HelperStatement__Group_2__0__Impl : ( 'statement' ) ;
    public final void rule__HelperStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2272:1: ( ( 'statement' ) )
            // InternalMapping.g:2273:1: ( 'statement' )
            {
            // InternalMapping.g:2273:1: ( 'statement' )
            // InternalMapping.g:2274:2: 'statement'
            {
             before(grammarAccess.getHelperStatementAccess().getStatementKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getStatementKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_2__0__Impl"


    // $ANTLR start "rule__HelperStatement__Group_2__1"
    // InternalMapping.g:2283:1: rule__HelperStatement__Group_2__1 : rule__HelperStatement__Group_2__1__Impl ;
    public final void rule__HelperStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2287:1: ( rule__HelperStatement__Group_2__1__Impl )
            // InternalMapping.g:2288:2: rule__HelperStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_2__1"


    // $ANTLR start "rule__HelperStatement__Group_2__1__Impl"
    // InternalMapping.g:2294:1: rule__HelperStatement__Group_2__1__Impl : ( ( rule__HelperStatement__StatementAssignment_2_1 ) ) ;
    public final void rule__HelperStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2298:1: ( ( ( rule__HelperStatement__StatementAssignment_2_1 ) ) )
            // InternalMapping.g:2299:1: ( ( rule__HelperStatement__StatementAssignment_2_1 ) )
            {
            // InternalMapping.g:2299:1: ( ( rule__HelperStatement__StatementAssignment_2_1 ) )
            // InternalMapping.g:2300:2: ( rule__HelperStatement__StatementAssignment_2_1 )
            {
             before(grammarAccess.getHelperStatementAccess().getStatementAssignment_2_1()); 
            // InternalMapping.g:2301:2: ( rule__HelperStatement__StatementAssignment_2_1 )
            // InternalMapping.g:2301:3: rule__HelperStatement__StatementAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__StatementAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getStatementAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_2__1__Impl"


    // $ANTLR start "rule__HelperStatement__Group_3__0"
    // InternalMapping.g:2310:1: rule__HelperStatement__Group_3__0 : rule__HelperStatement__Group_3__0__Impl rule__HelperStatement__Group_3__1 ;
    public final void rule__HelperStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2314:1: ( rule__HelperStatement__Group_3__0__Impl rule__HelperStatement__Group_3__1 )
            // InternalMapping.g:2315:2: rule__HelperStatement__Group_3__0__Impl rule__HelperStatement__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__HelperStatement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__0"


    // $ANTLR start "rule__HelperStatement__Group_3__0__Impl"
    // InternalMapping.g:2322:1: rule__HelperStatement__Group_3__0__Impl : ( '{' ) ;
    public final void rule__HelperStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2326:1: ( ( '{' ) )
            // InternalMapping.g:2327:1: ( '{' )
            {
            // InternalMapping.g:2327:1: ( '{' )
            // InternalMapping.g:2328:2: '{'
            {
             before(grammarAccess.getHelperStatementAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__0__Impl"


    // $ANTLR start "rule__HelperStatement__Group_3__1"
    // InternalMapping.g:2337:1: rule__HelperStatement__Group_3__1 : rule__HelperStatement__Group_3__1__Impl rule__HelperStatement__Group_3__2 ;
    public final void rule__HelperStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2341:1: ( rule__HelperStatement__Group_3__1__Impl rule__HelperStatement__Group_3__2 )
            // InternalMapping.g:2342:2: rule__HelperStatement__Group_3__1__Impl rule__HelperStatement__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__HelperStatement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__1"


    // $ANTLR start "rule__HelperStatement__Group_3__1__Impl"
    // InternalMapping.g:2349:1: rule__HelperStatement__Group_3__1__Impl : ( ( rule__HelperStatement__ChildRulesAssignment_3_1 ) ) ;
    public final void rule__HelperStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2353:1: ( ( ( rule__HelperStatement__ChildRulesAssignment_3_1 ) ) )
            // InternalMapping.g:2354:1: ( ( rule__HelperStatement__ChildRulesAssignment_3_1 ) )
            {
            // InternalMapping.g:2354:1: ( ( rule__HelperStatement__ChildRulesAssignment_3_1 ) )
            // InternalMapping.g:2355:2: ( rule__HelperStatement__ChildRulesAssignment_3_1 )
            {
             before(grammarAccess.getHelperStatementAccess().getChildRulesAssignment_3_1()); 
            // InternalMapping.g:2356:2: ( rule__HelperStatement__ChildRulesAssignment_3_1 )
            // InternalMapping.g:2356:3: rule__HelperStatement__ChildRulesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__ChildRulesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getChildRulesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__1__Impl"


    // $ANTLR start "rule__HelperStatement__Group_3__2"
    // InternalMapping.g:2364:1: rule__HelperStatement__Group_3__2 : rule__HelperStatement__Group_3__2__Impl rule__HelperStatement__Group_3__3 ;
    public final void rule__HelperStatement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2368:1: ( rule__HelperStatement__Group_3__2__Impl rule__HelperStatement__Group_3__3 )
            // InternalMapping.g:2369:2: rule__HelperStatement__Group_3__2__Impl rule__HelperStatement__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__HelperStatement__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__2"


    // $ANTLR start "rule__HelperStatement__Group_3__2__Impl"
    // InternalMapping.g:2376:1: rule__HelperStatement__Group_3__2__Impl : ( ( rule__HelperStatement__Group_3_2__0 )* ) ;
    public final void rule__HelperStatement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2380:1: ( ( ( rule__HelperStatement__Group_3_2__0 )* ) )
            // InternalMapping.g:2381:1: ( ( rule__HelperStatement__Group_3_2__0 )* )
            {
            // InternalMapping.g:2381:1: ( ( rule__HelperStatement__Group_3_2__0 )* )
            // InternalMapping.g:2382:2: ( rule__HelperStatement__Group_3_2__0 )*
            {
             before(grammarAccess.getHelperStatementAccess().getGroup_3_2()); 
            // InternalMapping.g:2383:2: ( rule__HelperStatement__Group_3_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMapping.g:2383:3: rule__HelperStatement__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__HelperStatement__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getHelperStatementAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__2__Impl"


    // $ANTLR start "rule__HelperStatement__Group_3__3"
    // InternalMapping.g:2391:1: rule__HelperStatement__Group_3__3 : rule__HelperStatement__Group_3__3__Impl ;
    public final void rule__HelperStatement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2395:1: ( rule__HelperStatement__Group_3__3__Impl )
            // InternalMapping.g:2396:2: rule__HelperStatement__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__3"


    // $ANTLR start "rule__HelperStatement__Group_3__3__Impl"
    // InternalMapping.g:2402:1: rule__HelperStatement__Group_3__3__Impl : ( '}' ) ;
    public final void rule__HelperStatement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2406:1: ( ( '}' ) )
            // InternalMapping.g:2407:1: ( '}' )
            {
            // InternalMapping.g:2407:1: ( '}' )
            // InternalMapping.g:2408:2: '}'
            {
             before(grammarAccess.getHelperStatementAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__3__Impl"


    // $ANTLR start "rule__HelperStatement__Group_3_2__0"
    // InternalMapping.g:2418:1: rule__HelperStatement__Group_3_2__0 : rule__HelperStatement__Group_3_2__0__Impl rule__HelperStatement__Group_3_2__1 ;
    public final void rule__HelperStatement__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2422:1: ( rule__HelperStatement__Group_3_2__0__Impl rule__HelperStatement__Group_3_2__1 )
            // InternalMapping.g:2423:2: rule__HelperStatement__Group_3_2__0__Impl rule__HelperStatement__Group_3_2__1
            {
            pushFollow(FOLLOW_12);
            rule__HelperStatement__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3_2__0"


    // $ANTLR start "rule__HelperStatement__Group_3_2__0__Impl"
    // InternalMapping.g:2430:1: rule__HelperStatement__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__HelperStatement__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2434:1: ( ( ',' ) )
            // InternalMapping.g:2435:1: ( ',' )
            {
            // InternalMapping.g:2435:1: ( ',' )
            // InternalMapping.g:2436:2: ','
            {
             before(grammarAccess.getHelperStatementAccess().getCommaKeyword_3_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3_2__0__Impl"


    // $ANTLR start "rule__HelperStatement__Group_3_2__1"
    // InternalMapping.g:2445:1: rule__HelperStatement__Group_3_2__1 : rule__HelperStatement__Group_3_2__1__Impl ;
    public final void rule__HelperStatement__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2449:1: ( rule__HelperStatement__Group_3_2__1__Impl )
            // InternalMapping.g:2450:2: rule__HelperStatement__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3_2__1"


    // $ANTLR start "rule__HelperStatement__Group_3_2__1__Impl"
    // InternalMapping.g:2456:1: rule__HelperStatement__Group_3_2__1__Impl : ( ( rule__HelperStatement__ChildRulesAssignment_3_2_1 ) ) ;
    public final void rule__HelperStatement__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2460:1: ( ( ( rule__HelperStatement__ChildRulesAssignment_3_2_1 ) ) )
            // InternalMapping.g:2461:1: ( ( rule__HelperStatement__ChildRulesAssignment_3_2_1 ) )
            {
            // InternalMapping.g:2461:1: ( ( rule__HelperStatement__ChildRulesAssignment_3_2_1 ) )
            // InternalMapping.g:2462:2: ( rule__HelperStatement__ChildRulesAssignment_3_2_1 )
            {
             before(grammarAccess.getHelperStatementAccess().getChildRulesAssignment_3_2_1()); 
            // InternalMapping.g:2463:2: ( rule__HelperStatement__ChildRulesAssignment_3_2_1 )
            // InternalMapping.g:2463:3: rule__HelperStatement__ChildRulesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__ChildRulesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getChildRulesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3_2__1__Impl"


    // $ANTLR start "rule__HelperStatement__Group_4__0"
    // InternalMapping.g:2472:1: rule__HelperStatement__Group_4__0 : rule__HelperStatement__Group_4__0__Impl rule__HelperStatement__Group_4__1 ;
    public final void rule__HelperStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2476:1: ( rule__HelperStatement__Group_4__0__Impl rule__HelperStatement__Group_4__1 )
            // InternalMapping.g:2477:2: rule__HelperStatement__Group_4__0__Impl rule__HelperStatement__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__HelperStatement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__0"


    // $ANTLR start "rule__HelperStatement__Group_4__0__Impl"
    // InternalMapping.g:2484:1: rule__HelperStatement__Group_4__0__Impl : ( '{' ) ;
    public final void rule__HelperStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2488:1: ( ( '{' ) )
            // InternalMapping.g:2489:1: ( '{' )
            {
            // InternalMapping.g:2489:1: ( '{' )
            // InternalMapping.g:2490:2: '{'
            {
             before(grammarAccess.getHelperStatementAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__0__Impl"


    // $ANTLR start "rule__HelperStatement__Group_4__1"
    // InternalMapping.g:2499:1: rule__HelperStatement__Group_4__1 : rule__HelperStatement__Group_4__1__Impl rule__HelperStatement__Group_4__2 ;
    public final void rule__HelperStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2503:1: ( rule__HelperStatement__Group_4__1__Impl rule__HelperStatement__Group_4__2 )
            // InternalMapping.g:2504:2: rule__HelperStatement__Group_4__1__Impl rule__HelperStatement__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__HelperStatement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__1"


    // $ANTLR start "rule__HelperStatement__Group_4__1__Impl"
    // InternalMapping.g:2511:1: rule__HelperStatement__Group_4__1__Impl : ( ( rule__HelperStatement__ChildHelpersAssignment_4_1 ) ) ;
    public final void rule__HelperStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2515:1: ( ( ( rule__HelperStatement__ChildHelpersAssignment_4_1 ) ) )
            // InternalMapping.g:2516:1: ( ( rule__HelperStatement__ChildHelpersAssignment_4_1 ) )
            {
            // InternalMapping.g:2516:1: ( ( rule__HelperStatement__ChildHelpersAssignment_4_1 ) )
            // InternalMapping.g:2517:2: ( rule__HelperStatement__ChildHelpersAssignment_4_1 )
            {
             before(grammarAccess.getHelperStatementAccess().getChildHelpersAssignment_4_1()); 
            // InternalMapping.g:2518:2: ( rule__HelperStatement__ChildHelpersAssignment_4_1 )
            // InternalMapping.g:2518:3: rule__HelperStatement__ChildHelpersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__ChildHelpersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getChildHelpersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__1__Impl"


    // $ANTLR start "rule__HelperStatement__Group_4__2"
    // InternalMapping.g:2526:1: rule__HelperStatement__Group_4__2 : rule__HelperStatement__Group_4__2__Impl rule__HelperStatement__Group_4__3 ;
    public final void rule__HelperStatement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2530:1: ( rule__HelperStatement__Group_4__2__Impl rule__HelperStatement__Group_4__3 )
            // InternalMapping.g:2531:2: rule__HelperStatement__Group_4__2__Impl rule__HelperStatement__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__HelperStatement__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__2"


    // $ANTLR start "rule__HelperStatement__Group_4__2__Impl"
    // InternalMapping.g:2538:1: rule__HelperStatement__Group_4__2__Impl : ( ( rule__HelperStatement__Group_4_2__0 )* ) ;
    public final void rule__HelperStatement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2542:1: ( ( ( rule__HelperStatement__Group_4_2__0 )* ) )
            // InternalMapping.g:2543:1: ( ( rule__HelperStatement__Group_4_2__0 )* )
            {
            // InternalMapping.g:2543:1: ( ( rule__HelperStatement__Group_4_2__0 )* )
            // InternalMapping.g:2544:2: ( rule__HelperStatement__Group_4_2__0 )*
            {
             before(grammarAccess.getHelperStatementAccess().getGroup_4_2()); 
            // InternalMapping.g:2545:2: ( rule__HelperStatement__Group_4_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMapping.g:2545:3: rule__HelperStatement__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__HelperStatement__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getHelperStatementAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__2__Impl"


    // $ANTLR start "rule__HelperStatement__Group_4__3"
    // InternalMapping.g:2553:1: rule__HelperStatement__Group_4__3 : rule__HelperStatement__Group_4__3__Impl ;
    public final void rule__HelperStatement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2557:1: ( rule__HelperStatement__Group_4__3__Impl )
            // InternalMapping.g:2558:2: rule__HelperStatement__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__3"


    // $ANTLR start "rule__HelperStatement__Group_4__3__Impl"
    // InternalMapping.g:2564:1: rule__HelperStatement__Group_4__3__Impl : ( '}' ) ;
    public final void rule__HelperStatement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2568:1: ( ( '}' ) )
            // InternalMapping.g:2569:1: ( '}' )
            {
            // InternalMapping.g:2569:1: ( '}' )
            // InternalMapping.g:2570:2: '}'
            {
             before(grammarAccess.getHelperStatementAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__3__Impl"


    // $ANTLR start "rule__HelperStatement__Group_4_2__0"
    // InternalMapping.g:2580:1: rule__HelperStatement__Group_4_2__0 : rule__HelperStatement__Group_4_2__0__Impl rule__HelperStatement__Group_4_2__1 ;
    public final void rule__HelperStatement__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2584:1: ( rule__HelperStatement__Group_4_2__0__Impl rule__HelperStatement__Group_4_2__1 )
            // InternalMapping.g:2585:2: rule__HelperStatement__Group_4_2__0__Impl rule__HelperStatement__Group_4_2__1
            {
            pushFollow(FOLLOW_17);
            rule__HelperStatement__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4_2__0"


    // $ANTLR start "rule__HelperStatement__Group_4_2__0__Impl"
    // InternalMapping.g:2592:1: rule__HelperStatement__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__HelperStatement__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2596:1: ( ( ',' ) )
            // InternalMapping.g:2597:1: ( ',' )
            {
            // InternalMapping.g:2597:1: ( ',' )
            // InternalMapping.g:2598:2: ','
            {
             before(grammarAccess.getHelperStatementAccess().getCommaKeyword_4_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4_2__0__Impl"


    // $ANTLR start "rule__HelperStatement__Group_4_2__1"
    // InternalMapping.g:2607:1: rule__HelperStatement__Group_4_2__1 : rule__HelperStatement__Group_4_2__1__Impl ;
    public final void rule__HelperStatement__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2611:1: ( rule__HelperStatement__Group_4_2__1__Impl )
            // InternalMapping.g:2612:2: rule__HelperStatement__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4_2__1"


    // $ANTLR start "rule__HelperStatement__Group_4_2__1__Impl"
    // InternalMapping.g:2618:1: rule__HelperStatement__Group_4_2__1__Impl : ( ( rule__HelperStatement__ChildHelpersAssignment_4_2_1 ) ) ;
    public final void rule__HelperStatement__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2622:1: ( ( ( rule__HelperStatement__ChildHelpersAssignment_4_2_1 ) ) )
            // InternalMapping.g:2623:1: ( ( rule__HelperStatement__ChildHelpersAssignment_4_2_1 ) )
            {
            // InternalMapping.g:2623:1: ( ( rule__HelperStatement__ChildHelpersAssignment_4_2_1 ) )
            // InternalMapping.g:2624:2: ( rule__HelperStatement__ChildHelpersAssignment_4_2_1 )
            {
             before(grammarAccess.getHelperStatementAccess().getChildHelpersAssignment_4_2_1()); 
            // InternalMapping.g:2625:2: ( rule__HelperStatement__ChildHelpersAssignment_4_2_1 )
            // InternalMapping.g:2625:3: rule__HelperStatement__ChildHelpersAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__ChildHelpersAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getChildHelpersAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMapping.g:2634:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2638:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMapping.g:2639:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMapping.g:2646:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2650:1: ( ( RULE_ID ) )
            // InternalMapping.g:2651:1: ( RULE_ID )
            {
            // InternalMapping.g:2651:1: ( RULE_ID )
            // InternalMapping.g:2652:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMapping.g:2661:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2665:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMapping.g:2666:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMapping.g:2672:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2676:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMapping.g:2677:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMapping.g:2677:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMapping.g:2678:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMapping.g:2679:2: ( rule__QualifiedName__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==31) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMapping.g:2679:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMapping.g:2688:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2692:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMapping.g:2693:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMapping.g:2700:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2704:1: ( ( '.' ) )
            // InternalMapping.g:2705:1: ( '.' )
            {
            // InternalMapping.g:2705:1: ( '.' )
            // InternalMapping.g:2706:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMapping.g:2715:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2719:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMapping.g:2720:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMapping.g:2726:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2730:1: ( ( RULE_ID ) )
            // InternalMapping.g:2731:1: ( RULE_ID )
            {
            // InternalMapping.g:2731:1: ( RULE_ID )
            // InternalMapping.g:2732:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__MappingModel__NameAssignment_1"
    // InternalMapping.g:2742:1: rule__MappingModel__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MappingModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2746:1: ( ( RULE_STRING ) )
            // InternalMapping.g:2747:2: ( RULE_STRING )
            {
            // InternalMapping.g:2747:2: ( RULE_STRING )
            // InternalMapping.g:2748:3: RULE_STRING
            {
             before(grammarAccess.getMappingModelAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__NameAssignment_1"


    // $ANTLR start "rule__MappingModel__SourceMetamodelsAssignment_4"
    // InternalMapping.g:2757:1: rule__MappingModel__SourceMetamodelsAssignment_4 : ( ruleSourceMetamodel ) ;
    public final void rule__MappingModel__SourceMetamodelsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2761:1: ( ( ruleSourceMetamodel ) )
            // InternalMapping.g:2762:2: ( ruleSourceMetamodel )
            {
            // InternalMapping.g:2762:2: ( ruleSourceMetamodel )
            // InternalMapping.g:2763:3: ruleSourceMetamodel
            {
             before(grammarAccess.getMappingModelAccess().getSourceMetamodelsSourceMetamodelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceMetamodel();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getSourceMetamodelsSourceMetamodelParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__SourceMetamodelsAssignment_4"


    // $ANTLR start "rule__MappingModel__SourceMetamodelsAssignment_5_1"
    // InternalMapping.g:2772:1: rule__MappingModel__SourceMetamodelsAssignment_5_1 : ( ruleSourceMetamodel ) ;
    public final void rule__MappingModel__SourceMetamodelsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2776:1: ( ( ruleSourceMetamodel ) )
            // InternalMapping.g:2777:2: ( ruleSourceMetamodel )
            {
            // InternalMapping.g:2777:2: ( ruleSourceMetamodel )
            // InternalMapping.g:2778:3: ruleSourceMetamodel
            {
             before(grammarAccess.getMappingModelAccess().getSourceMetamodelsSourceMetamodelParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceMetamodel();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getSourceMetamodelsSourceMetamodelParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__SourceMetamodelsAssignment_5_1"


    // $ANTLR start "rule__MappingModel__MainSourceMetamodelAssignment_7_1"
    // InternalMapping.g:2787:1: rule__MappingModel__MainSourceMetamodelAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MappingModel__MainSourceMetamodelAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2791:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMapping.g:2792:2: ( ( ruleQualifiedName ) )
            {
            // InternalMapping.g:2792:2: ( ( ruleQualifiedName ) )
            // InternalMapping.g:2793:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingModelAccess().getMainSourceMetamodelSourceMetamodelCrossReference_7_1_0()); 
            // InternalMapping.g:2794:3: ( ruleQualifiedName )
            // InternalMapping.g:2795:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingModelAccess().getMainSourceMetamodelSourceMetamodelQualifiedNameParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getMainSourceMetamodelSourceMetamodelQualifiedNameParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getMappingModelAccess().getMainSourceMetamodelSourceMetamodelCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__MainSourceMetamodelAssignment_7_1"


    // $ANTLR start "rule__MappingModel__TargetMetamodelsAssignment_10"
    // InternalMapping.g:2806:1: rule__MappingModel__TargetMetamodelsAssignment_10 : ( ruleTargetMetamodel ) ;
    public final void rule__MappingModel__TargetMetamodelsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2810:1: ( ( ruleTargetMetamodel ) )
            // InternalMapping.g:2811:2: ( ruleTargetMetamodel )
            {
            // InternalMapping.g:2811:2: ( ruleTargetMetamodel )
            // InternalMapping.g:2812:3: ruleTargetMetamodel
            {
             before(grammarAccess.getMappingModelAccess().getTargetMetamodelsTargetMetamodelParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetMetamodel();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getTargetMetamodelsTargetMetamodelParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__TargetMetamodelsAssignment_10"


    // $ANTLR start "rule__MappingModel__TargetMetamodelsAssignment_11_1"
    // InternalMapping.g:2821:1: rule__MappingModel__TargetMetamodelsAssignment_11_1 : ( ruleTargetMetamodel ) ;
    public final void rule__MappingModel__TargetMetamodelsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2825:1: ( ( ruleTargetMetamodel ) )
            // InternalMapping.g:2826:2: ( ruleTargetMetamodel )
            {
            // InternalMapping.g:2826:2: ( ruleTargetMetamodel )
            // InternalMapping.g:2827:3: ruleTargetMetamodel
            {
             before(grammarAccess.getMappingModelAccess().getTargetMetamodelsTargetMetamodelParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetMetamodel();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getTargetMetamodelsTargetMetamodelParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__TargetMetamodelsAssignment_11_1"


    // $ANTLR start "rule__MappingModel__RulesAssignment_13_2"
    // InternalMapping.g:2836:1: rule__MappingModel__RulesAssignment_13_2 : ( ruleMappingRule ) ;
    public final void rule__MappingModel__RulesAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2840:1: ( ( ruleMappingRule ) )
            // InternalMapping.g:2841:2: ( ruleMappingRule )
            {
            // InternalMapping.g:2841:2: ( ruleMappingRule )
            // InternalMapping.g:2842:3: ruleMappingRule
            {
             before(grammarAccess.getMappingModelAccess().getRulesMappingRuleParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getRulesMappingRuleParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__RulesAssignment_13_2"


    // $ANTLR start "rule__MappingModel__RulesAssignment_13_3_1"
    // InternalMapping.g:2851:1: rule__MappingModel__RulesAssignment_13_3_1 : ( ruleMappingRule ) ;
    public final void rule__MappingModel__RulesAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2855:1: ( ( ruleMappingRule ) )
            // InternalMapping.g:2856:2: ( ruleMappingRule )
            {
            // InternalMapping.g:2856:2: ( ruleMappingRule )
            // InternalMapping.g:2857:3: ruleMappingRule
            {
             before(grammarAccess.getMappingModelAccess().getRulesMappingRuleParserRuleCall_13_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getRulesMappingRuleParserRuleCall_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__RulesAssignment_13_3_1"


    // $ANTLR start "rule__SourceMetamodel__NameAssignment_1"
    // InternalMapping.g:2866:1: rule__SourceMetamodel__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SourceMetamodel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2870:1: ( ( RULE_STRING ) )
            // InternalMapping.g:2871:2: ( RULE_STRING )
            {
            // InternalMapping.g:2871:2: ( RULE_STRING )
            // InternalMapping.g:2872:3: RULE_STRING
            {
             before(grammarAccess.getSourceMetamodelAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceMetamodelAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__NameAssignment_1"


    // $ANTLR start "rule__SourceMetamodel__ModelAssignment_2"
    // InternalMapping.g:2881:1: rule__SourceMetamodel__ModelAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__SourceMetamodel__ModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2885:1: ( ( ( ruleEString ) ) )
            // InternalMapping.g:2886:2: ( ( ruleEString ) )
            {
            // InternalMapping.g:2886:2: ( ( ruleEString ) )
            // InternalMapping.g:2887:3: ( ruleEString )
            {
             before(grammarAccess.getSourceMetamodelAccess().getModelEPackageCrossReference_2_0()); 
            // InternalMapping.g:2888:3: ( ruleEString )
            // InternalMapping.g:2889:4: ruleEString
            {
             before(grammarAccess.getSourceMetamodelAccess().getModelEPackageEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSourceMetamodelAccess().getModelEPackageEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSourceMetamodelAccess().getModelEPackageCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__ModelAssignment_2"


    // $ANTLR start "rule__TargetMetamodel__NameAssignment_1"
    // InternalMapping.g:2900:1: rule__TargetMetamodel__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TargetMetamodel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2904:1: ( ( RULE_STRING ) )
            // InternalMapping.g:2905:2: ( RULE_STRING )
            {
            // InternalMapping.g:2905:2: ( RULE_STRING )
            // InternalMapping.g:2906:3: RULE_STRING
            {
             before(grammarAccess.getTargetMetamodelAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTargetMetamodelAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__NameAssignment_1"


    // $ANTLR start "rule__TargetMetamodel__ModelAssignment_2"
    // InternalMapping.g:2915:1: rule__TargetMetamodel__ModelAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__TargetMetamodel__ModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2919:1: ( ( ( ruleEString ) ) )
            // InternalMapping.g:2920:2: ( ( ruleEString ) )
            {
            // InternalMapping.g:2920:2: ( ( ruleEString ) )
            // InternalMapping.g:2921:3: ( ruleEString )
            {
             before(grammarAccess.getTargetMetamodelAccess().getModelEPackageCrossReference_2_0()); 
            // InternalMapping.g:2922:3: ( ruleEString )
            // InternalMapping.g:2923:4: ruleEString
            {
             before(grammarAccess.getTargetMetamodelAccess().getModelEPackageEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTargetMetamodelAccess().getModelEPackageEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTargetMetamodelAccess().getModelEPackageCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__ModelAssignment_2"


    // $ANTLR start "rule__MappingRule__NameAssignment_2"
    // InternalMapping.g:2934:1: rule__MappingRule__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MappingRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2938:1: ( ( RULE_STRING ) )
            // InternalMapping.g:2939:2: ( RULE_STRING )
            {
            // InternalMapping.g:2939:2: ( RULE_STRING )
            // InternalMapping.g:2940:3: RULE_STRING
            {
             before(grammarAccess.getMappingRuleAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__NameAssignment_2"


    // $ANTLR start "rule__MappingRule__SourceAssignment_3_1"
    // InternalMapping.g:2949:1: rule__MappingRule__SourceAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MappingRule__SourceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2953:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMapping.g:2954:2: ( ( ruleQualifiedName ) )
            {
            // InternalMapping.g:2954:2: ( ( ruleQualifiedName ) )
            // InternalMapping.g:2955:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingRuleAccess().getSourceEObjectCrossReference_3_1_0()); 
            // InternalMapping.g:2956:3: ( ruleQualifiedName )
            // InternalMapping.g:2957:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingRuleAccess().getSourceEObjectQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getSourceEObjectQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getMappingRuleAccess().getSourceEObjectCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__SourceAssignment_3_1"


    // $ANTLR start "rule__MappingRule__EEnumLiteralAssignment_3_2_1"
    // InternalMapping.g:2968:1: rule__MappingRule__EEnumLiteralAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MappingRule__EEnumLiteralAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2972:1: ( ( ( RULE_ID ) ) )
            // InternalMapping.g:2973:2: ( ( RULE_ID ) )
            {
            // InternalMapping.g:2973:2: ( ( RULE_ID ) )
            // InternalMapping.g:2974:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingRuleAccess().getEEnumLiteralEEnumLiteralCrossReference_3_2_1_0()); 
            // InternalMapping.g:2975:3: ( RULE_ID )
            // InternalMapping.g:2976:4: RULE_ID
            {
             before(grammarAccess.getMappingRuleAccess().getEEnumLiteralEEnumLiteralIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getEEnumLiteralEEnumLiteralIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getMappingRuleAccess().getEEnumLiteralEEnumLiteralCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__EEnumLiteralAssignment_3_2_1"


    // $ANTLR start "rule__MappingRule__TargetAssignment_4_1"
    // InternalMapping.g:2987:1: rule__MappingRule__TargetAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MappingRule__TargetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2991:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMapping.g:2992:2: ( ( ruleQualifiedName ) )
            {
            // InternalMapping.g:2992:2: ( ( ruleQualifiedName ) )
            // InternalMapping.g:2993:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingRuleAccess().getTargetEObjectCrossReference_4_1_0()); 
            // InternalMapping.g:2994:3: ( ruleQualifiedName )
            // InternalMapping.g:2995:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingRuleAccess().getTargetEObjectQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getTargetEObjectQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMappingRuleAccess().getTargetEObjectCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__TargetAssignment_4_1"


    // $ANTLR start "rule__MappingRule__OperatorAssignment_5_1"
    // InternalMapping.g:3006:1: rule__MappingRule__OperatorAssignment_5_1 : ( ruleOperator ) ;
    public final void rule__MappingRule__OperatorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3010:1: ( ( ruleOperator ) )
            // InternalMapping.g:3011:2: ( ruleOperator )
            {
            // InternalMapping.g:3011:2: ( ruleOperator )
            // InternalMapping.g:3012:3: ruleOperator
            {
             before(grammarAccess.getMappingRuleAccess().getOperatorOperatorEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getOperatorOperatorEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__OperatorAssignment_5_1"


    // $ANTLR start "rule__MappingRule__ConditionAssignment_6_1"
    // InternalMapping.g:3021:1: rule__MappingRule__ConditionAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__MappingRule__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3025:1: ( ( RULE_STRING ) )
            // InternalMapping.g:3026:2: ( RULE_STRING )
            {
            // InternalMapping.g:3026:2: ( RULE_STRING )
            // InternalMapping.g:3027:3: RULE_STRING
            {
             before(grammarAccess.getMappingRuleAccess().getConditionSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getConditionSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__ConditionAssignment_6_1"


    // $ANTLR start "rule__MappingRule__CommentAssignment_7_1"
    // InternalMapping.g:3036:1: rule__MappingRule__CommentAssignment_7_1 : ( ruleEString ) ;
    public final void rule__MappingRule__CommentAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3040:1: ( ( ruleEString ) )
            // InternalMapping.g:3041:2: ( ruleEString )
            {
            // InternalMapping.g:3041:2: ( ruleEString )
            // InternalMapping.g:3042:3: ruleEString
            {
             before(grammarAccess.getMappingRuleAccess().getCommentEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getCommentEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__CommentAssignment_7_1"


    // $ANTLR start "rule__MappingRule__ChildRulesAssignment_8_1"
    // InternalMapping.g:3051:1: rule__MappingRule__ChildRulesAssignment_8_1 : ( ruleMappingRule ) ;
    public final void rule__MappingRule__ChildRulesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3055:1: ( ( ruleMappingRule ) )
            // InternalMapping.g:3056:2: ( ruleMappingRule )
            {
            // InternalMapping.g:3056:2: ( ruleMappingRule )
            // InternalMapping.g:3057:3: ruleMappingRule
            {
             before(grammarAccess.getMappingRuleAccess().getChildRulesMappingRuleParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getChildRulesMappingRuleParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__ChildRulesAssignment_8_1"


    // $ANTLR start "rule__MappingRule__ChildRulesAssignment_8_2_1"
    // InternalMapping.g:3066:1: rule__MappingRule__ChildRulesAssignment_8_2_1 : ( ruleMappingRule ) ;
    public final void rule__MappingRule__ChildRulesAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3070:1: ( ( ruleMappingRule ) )
            // InternalMapping.g:3071:2: ( ruleMappingRule )
            {
            // InternalMapping.g:3071:2: ( ruleMappingRule )
            // InternalMapping.g:3072:3: ruleMappingRule
            {
             before(grammarAccess.getMappingRuleAccess().getChildRulesMappingRuleParserRuleCall_8_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getChildRulesMappingRuleParserRuleCall_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__ChildRulesAssignment_8_2_1"


    // $ANTLR start "rule__MappingRule__ChildHelpersAssignment_9_1"
    // InternalMapping.g:3081:1: rule__MappingRule__ChildHelpersAssignment_9_1 : ( ruleHelperStatement ) ;
    public final void rule__MappingRule__ChildHelpersAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3085:1: ( ( ruleHelperStatement ) )
            // InternalMapping.g:3086:2: ( ruleHelperStatement )
            {
            // InternalMapping.g:3086:2: ( ruleHelperStatement )
            // InternalMapping.g:3087:3: ruleHelperStatement
            {
             before(grammarAccess.getMappingRuleAccess().getChildHelpersHelperStatementParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHelperStatement();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getChildHelpersHelperStatementParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__ChildHelpersAssignment_9_1"


    // $ANTLR start "rule__MappingRule__ChildHelpersAssignment_9_2_1"
    // InternalMapping.g:3096:1: rule__MappingRule__ChildHelpersAssignment_9_2_1 : ( ruleHelperStatement ) ;
    public final void rule__MappingRule__ChildHelpersAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3100:1: ( ( ruleHelperStatement ) )
            // InternalMapping.g:3101:2: ( ruleHelperStatement )
            {
            // InternalMapping.g:3101:2: ( ruleHelperStatement )
            // InternalMapping.g:3102:3: ruleHelperStatement
            {
             before(grammarAccess.getMappingRuleAccess().getChildHelpersHelperStatementParserRuleCall_9_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHelperStatement();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getChildHelpersHelperStatementParserRuleCall_9_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__ChildHelpersAssignment_9_2_1"


    // $ANTLR start "rule__HelperStatement__StatementAssignment_2_1"
    // InternalMapping.g:3111:1: rule__HelperStatement__StatementAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__HelperStatement__StatementAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3115:1: ( ( RULE_STRING ) )
            // InternalMapping.g:3116:2: ( RULE_STRING )
            {
            // InternalMapping.g:3116:2: ( RULE_STRING )
            // InternalMapping.g:3117:3: RULE_STRING
            {
             before(grammarAccess.getHelperStatementAccess().getStatementSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getStatementSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__StatementAssignment_2_1"


    // $ANTLR start "rule__HelperStatement__ChildRulesAssignment_3_1"
    // InternalMapping.g:3126:1: rule__HelperStatement__ChildRulesAssignment_3_1 : ( ruleMappingRule ) ;
    public final void rule__HelperStatement__ChildRulesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3130:1: ( ( ruleMappingRule ) )
            // InternalMapping.g:3131:2: ( ruleMappingRule )
            {
            // InternalMapping.g:3131:2: ( ruleMappingRule )
            // InternalMapping.g:3132:3: ruleMappingRule
            {
             before(grammarAccess.getHelperStatementAccess().getChildRulesMappingRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getHelperStatementAccess().getChildRulesMappingRuleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__ChildRulesAssignment_3_1"


    // $ANTLR start "rule__HelperStatement__ChildRulesAssignment_3_2_1"
    // InternalMapping.g:3141:1: rule__HelperStatement__ChildRulesAssignment_3_2_1 : ( ruleMappingRule ) ;
    public final void rule__HelperStatement__ChildRulesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3145:1: ( ( ruleMappingRule ) )
            // InternalMapping.g:3146:2: ( ruleMappingRule )
            {
            // InternalMapping.g:3146:2: ( ruleMappingRule )
            // InternalMapping.g:3147:3: ruleMappingRule
            {
             before(grammarAccess.getHelperStatementAccess().getChildRulesMappingRuleParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getHelperStatementAccess().getChildRulesMappingRuleParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__ChildRulesAssignment_3_2_1"


    // $ANTLR start "rule__HelperStatement__ChildHelpersAssignment_4_1"
    // InternalMapping.g:3156:1: rule__HelperStatement__ChildHelpersAssignment_4_1 : ( ruleHelperStatement ) ;
    public final void rule__HelperStatement__ChildHelpersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3160:1: ( ( ruleHelperStatement ) )
            // InternalMapping.g:3161:2: ( ruleHelperStatement )
            {
            // InternalMapping.g:3161:2: ( ruleHelperStatement )
            // InternalMapping.g:3162:3: ruleHelperStatement
            {
             before(grammarAccess.getHelperStatementAccess().getChildHelpersHelperStatementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHelperStatement();

            state._fsp--;

             after(grammarAccess.getHelperStatementAccess().getChildHelpersHelperStatementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__ChildHelpersAssignment_4_1"


    // $ANTLR start "rule__HelperStatement__ChildHelpersAssignment_4_2_1"
    // InternalMapping.g:3171:1: rule__HelperStatement__ChildHelpersAssignment_4_2_1 : ( ruleHelperStatement ) ;
    public final void rule__HelperStatement__ChildHelpersAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3175:1: ( ( ruleHelperStatement ) )
            // InternalMapping.g:3176:2: ( ruleHelperStatement )
            {
            // InternalMapping.g:3176:2: ( ruleHelperStatement )
            // InternalMapping.g:3177:3: ruleHelperStatement
            {
             before(grammarAccess.getHelperStatementAccess().getChildHelpersHelperStatementParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHelperStatement();

            state._fsp--;

             after(grammarAccess.getHelperStatementAccess().getChildHelpersHelperStatementParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__ChildHelpersAssignment_4_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000001EC08010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000002L});

}