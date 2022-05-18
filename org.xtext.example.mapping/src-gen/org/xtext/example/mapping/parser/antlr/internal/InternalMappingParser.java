package org.xtext.example.mapping.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mapping.services.MappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MappingModel'", "'SourceMetamodels'", "'{'", "','", "'}'", "'MainSourceMetamodel'", "'TargetMetamodels'", "'MappingRules'", "';'", "'MappingRule'", "'source'", "'::'", "'target'", "'operator'", "'condition'", "'comment'", "'HelperStatement'", "'statement'", "'.'", "'assign'", "'add'"
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

        public InternalMappingParser(TokenStream input, MappingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MappingModel";
       	}

       	@Override
       	protected MappingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMappingModel"
    // InternalMapping.g:65:1: entryRuleMappingModel returns [EObject current=null] : iv_ruleMappingModel= ruleMappingModel EOF ;
    public final EObject entryRuleMappingModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingModel = null;


        try {
            // InternalMapping.g:65:53: (iv_ruleMappingModel= ruleMappingModel EOF )
            // InternalMapping.g:66:2: iv_ruleMappingModel= ruleMappingModel EOF
            {
             newCompositeNode(grammarAccess.getMappingModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingModel=ruleMappingModel();

            state._fsp--;

             current =iv_ruleMappingModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingModel"


    // $ANTLR start "ruleMappingModel"
    // InternalMapping.g:72:1: ruleMappingModel returns [EObject current=null] : (otherlv_0= 'MappingModel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'SourceMetamodels' otherlv_3= '{' ( (lv_SourceMetamodels_4_0= ruleSourceMetamodel ) ) (otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) ) )* otherlv_7= '}' (otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) ) )? otherlv_10= 'TargetMetamodels' otherlv_11= '{' ( (lv_TargetMetamodels_12_0= ruleTargetMetamodel ) ) (otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) ) )* otherlv_15= '}' (otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}' )? ) ;
    public final EObject ruleMappingModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_SourceMetamodels_4_0 = null;

        EObject lv_SourceMetamodels_6_0 = null;

        EObject lv_TargetMetamodels_12_0 = null;

        EObject lv_TargetMetamodels_14_0 = null;

        EObject lv_Rules_18_0 = null;

        EObject lv_Rules_20_0 = null;



        	enterRule();

        try {
            // InternalMapping.g:78:2: ( (otherlv_0= 'MappingModel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'SourceMetamodels' otherlv_3= '{' ( (lv_SourceMetamodels_4_0= ruleSourceMetamodel ) ) (otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) ) )* otherlv_7= '}' (otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) ) )? otherlv_10= 'TargetMetamodels' otherlv_11= '{' ( (lv_TargetMetamodels_12_0= ruleTargetMetamodel ) ) (otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) ) )* otherlv_15= '}' (otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}' )? ) )
            // InternalMapping.g:79:2: (otherlv_0= 'MappingModel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'SourceMetamodels' otherlv_3= '{' ( (lv_SourceMetamodels_4_0= ruleSourceMetamodel ) ) (otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) ) )* otherlv_7= '}' (otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) ) )? otherlv_10= 'TargetMetamodels' otherlv_11= '{' ( (lv_TargetMetamodels_12_0= ruleTargetMetamodel ) ) (otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) ) )* otherlv_15= '}' (otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}' )? )
            {
            // InternalMapping.g:79:2: (otherlv_0= 'MappingModel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'SourceMetamodels' otherlv_3= '{' ( (lv_SourceMetamodels_4_0= ruleSourceMetamodel ) ) (otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) ) )* otherlv_7= '}' (otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) ) )? otherlv_10= 'TargetMetamodels' otherlv_11= '{' ( (lv_TargetMetamodels_12_0= ruleTargetMetamodel ) ) (otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) ) )* otherlv_15= '}' (otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}' )? )
            // InternalMapping.g:80:3: otherlv_0= 'MappingModel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'SourceMetamodels' otherlv_3= '{' ( (lv_SourceMetamodels_4_0= ruleSourceMetamodel ) ) (otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) ) )* otherlv_7= '}' (otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) ) )? otherlv_10= 'TargetMetamodels' otherlv_11= '{' ( (lv_TargetMetamodels_12_0= ruleTargetMetamodel ) ) (otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) ) )* otherlv_15= '}' (otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingModelAccess().getMappingModelKeyword_0());
            		
            // InternalMapping.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMapping.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMapping.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalMapping.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMappingModelAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingModelAccess().getSourceMetamodelsKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMapping.g:110:3: ( (lv_SourceMetamodels_4_0= ruleSourceMetamodel ) )
            // InternalMapping.g:111:4: (lv_SourceMetamodels_4_0= ruleSourceMetamodel )
            {
            // InternalMapping.g:111:4: (lv_SourceMetamodels_4_0= ruleSourceMetamodel )
            // InternalMapping.g:112:5: lv_SourceMetamodels_4_0= ruleSourceMetamodel
            {

            					newCompositeNode(grammarAccess.getMappingModelAccess().getSourceMetamodelsSourceMetamodelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_SourceMetamodels_4_0=ruleSourceMetamodel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingModelRule());
            					}
            					add(
            						current,
            						"SourceMetamodels",
            						lv_SourceMetamodels_4_0,
            						"org.xtext.example.mapping.Mapping.SourceMetamodel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMapping.g:129:3: (otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMapping.g:130:4: otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMappingModelAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMapping.g:134:4: ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) )
            	    // InternalMapping.g:135:5: (lv_SourceMetamodels_6_0= ruleSourceMetamodel )
            	    {
            	    // InternalMapping.g:135:5: (lv_SourceMetamodels_6_0= ruleSourceMetamodel )
            	    // InternalMapping.g:136:6: lv_SourceMetamodels_6_0= ruleSourceMetamodel
            	    {

            	    						newCompositeNode(grammarAccess.getMappingModelAccess().getSourceMetamodelsSourceMetamodelParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_SourceMetamodels_6_0=ruleSourceMetamodel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMappingModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"SourceMetamodels",
            	    							lv_SourceMetamodels_6_0,
            	    							"org.xtext.example.mapping.Mapping.SourceMetamodel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMapping.g:158:3: (otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMapping.g:159:4: otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getMappingModelAccess().getMainSourceMetamodelKeyword_7_0());
                    			
                    // InternalMapping.g:163:4: ( ( ruleQualifiedName ) )
                    // InternalMapping.g:164:5: ( ruleQualifiedName )
                    {
                    // InternalMapping.g:164:5: ( ruleQualifiedName )
                    // InternalMapping.g:165:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMappingModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMappingModelAccess().getMainSourceMetamodelSourceMetamodelCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getMappingModelAccess().getTargetMetamodelsKeyword_8());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMapping.g:188:3: ( (lv_TargetMetamodels_12_0= ruleTargetMetamodel ) )
            // InternalMapping.g:189:4: (lv_TargetMetamodels_12_0= ruleTargetMetamodel )
            {
            // InternalMapping.g:189:4: (lv_TargetMetamodels_12_0= ruleTargetMetamodel )
            // InternalMapping.g:190:5: lv_TargetMetamodels_12_0= ruleTargetMetamodel
            {

            					newCompositeNode(grammarAccess.getMappingModelAccess().getTargetMetamodelsTargetMetamodelParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_7);
            lv_TargetMetamodels_12_0=ruleTargetMetamodel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingModelRule());
            					}
            					add(
            						current,
            						"TargetMetamodels",
            						lv_TargetMetamodels_12_0,
            						"org.xtext.example.mapping.Mapping.TargetMetamodel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMapping.g:207:3: (otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMapping.g:208:4: otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_13, grammarAccess.getMappingModelAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalMapping.g:212:4: ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) )
            	    // InternalMapping.g:213:5: (lv_TargetMetamodels_14_0= ruleTargetMetamodel )
            	    {
            	    // InternalMapping.g:213:5: (lv_TargetMetamodels_14_0= ruleTargetMetamodel )
            	    // InternalMapping.g:214:6: lv_TargetMetamodels_14_0= ruleTargetMetamodel
            	    {

            	    						newCompositeNode(grammarAccess.getMappingModelAccess().getTargetMetamodelsTargetMetamodelParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_TargetMetamodels_14_0=ruleTargetMetamodel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMappingModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"TargetMetamodels",
            	    							lv_TargetMetamodels_14_0,
            	    							"org.xtext.example.mapping.Mapping.TargetMetamodel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_15=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_12());
            		
            // InternalMapping.g:236:3: (otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMapping.g:237:4: otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getMappingModelAccess().getMappingRulesKeyword_13_0());
                    			
                    otherlv_17=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalMapping.g:245:4: ( (lv_Rules_18_0= ruleMappingRule ) )
                    // InternalMapping.g:246:5: (lv_Rules_18_0= ruleMappingRule )
                    {
                    // InternalMapping.g:246:5: (lv_Rules_18_0= ruleMappingRule )
                    // InternalMapping.g:247:6: lv_Rules_18_0= ruleMappingRule
                    {

                    						newCompositeNode(grammarAccess.getMappingModelAccess().getRulesMappingRuleParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_Rules_18_0=ruleMappingRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingModelRule());
                    						}
                    						add(
                    							current,
                    							"Rules",
                    							lv_Rules_18_0,
                    							"org.xtext.example.mapping.Mapping.MappingRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMapping.g:264:4: (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMapping.g:265:5: otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) )
                    	    {
                    	    otherlv_19=(Token)match(input,19,FOLLOW_12); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getMappingModelAccess().getSemicolonKeyword_13_3_0());
                    	    				
                    	    // InternalMapping.g:269:5: ( (lv_Rules_20_0= ruleMappingRule ) )
                    	    // InternalMapping.g:270:6: (lv_Rules_20_0= ruleMappingRule )
                    	    {
                    	    // InternalMapping.g:270:6: (lv_Rules_20_0= ruleMappingRule )
                    	    // InternalMapping.g:271:7: lv_Rules_20_0= ruleMappingRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappingModelAccess().getRulesMappingRuleParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_Rules_20_0=ruleMappingRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappingModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Rules",
                    	    								lv_Rules_20_0,
                    	    								"org.xtext.example.mapping.Mapping.MappingRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingModel"


    // $ANTLR start "entryRuleSourceMetamodel"
    // InternalMapping.g:298:1: entryRuleSourceMetamodel returns [EObject current=null] : iv_ruleSourceMetamodel= ruleSourceMetamodel EOF ;
    public final EObject entryRuleSourceMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceMetamodel = null;


        try {
            // InternalMapping.g:298:56: (iv_ruleSourceMetamodel= ruleSourceMetamodel EOF )
            // InternalMapping.g:299:2: iv_ruleSourceMetamodel= ruleSourceMetamodel EOF
            {
             newCompositeNode(grammarAccess.getSourceMetamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceMetamodel=ruleSourceMetamodel();

            state._fsp--;

             current =iv_ruleSourceMetamodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceMetamodel"


    // $ANTLR start "ruleSourceMetamodel"
    // InternalMapping.g:305:1: ruleSourceMetamodel returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) ) ;
    public final EObject ruleSourceMetamodel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMapping.g:311:2: ( ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) ) )
            // InternalMapping.g:312:2: ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) )
            {
            // InternalMapping.g:312:2: ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) )
            // InternalMapping.g:313:3: () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) )
            {
            // InternalMapping.g:313:3: ()
            // InternalMapping.g:314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceMetamodelAccess().getSourceMetamodelAction_0(),
            					current);
            			

            }

            // InternalMapping.g:320:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=RULE_STRING && LA6_1<=RULE_ID)) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalMapping.g:321:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalMapping.g:321:4: (lv_name_1_0= RULE_STRING )
                    // InternalMapping.g:322:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSourceMetamodelAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSourceMetamodelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalMapping.g:338:3: ( ( ruleEString ) )
            // InternalMapping.g:339:4: ( ruleEString )
            {
            // InternalMapping.g:339:4: ( ruleEString )
            // InternalMapping.g:340:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceMetamodelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSourceMetamodelAccess().getModelEPackageCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceMetamodel"


    // $ANTLR start "entryRuleTargetMetamodel"
    // InternalMapping.g:358:1: entryRuleTargetMetamodel returns [EObject current=null] : iv_ruleTargetMetamodel= ruleTargetMetamodel EOF ;
    public final EObject entryRuleTargetMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetMetamodel = null;


        try {
            // InternalMapping.g:358:56: (iv_ruleTargetMetamodel= ruleTargetMetamodel EOF )
            // InternalMapping.g:359:2: iv_ruleTargetMetamodel= ruleTargetMetamodel EOF
            {
             newCompositeNode(grammarAccess.getTargetMetamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetMetamodel=ruleTargetMetamodel();

            state._fsp--;

             current =iv_ruleTargetMetamodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTargetMetamodel"


    // $ANTLR start "ruleTargetMetamodel"
    // InternalMapping.g:365:1: ruleTargetMetamodel returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) ) ;
    public final EObject ruleTargetMetamodel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMapping.g:371:2: ( ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) ) )
            // InternalMapping.g:372:2: ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) )
            {
            // InternalMapping.g:372:2: ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) )
            // InternalMapping.g:373:3: () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) )
            {
            // InternalMapping.g:373:3: ()
            // InternalMapping.g:374:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetMetamodelAccess().getTargetMetamodelAction_0(),
            					current);
            			

            }

            // InternalMapping.g:380:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>=RULE_STRING && LA7_1<=RULE_ID)) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalMapping.g:381:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalMapping.g:381:4: (lv_name_1_0= RULE_STRING )
                    // InternalMapping.g:382:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getTargetMetamodelAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTargetMetamodelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalMapping.g:398:3: ( ( ruleEString ) )
            // InternalMapping.g:399:4: ( ruleEString )
            {
            // InternalMapping.g:399:4: ( ruleEString )
            // InternalMapping.g:400:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetMetamodelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTargetMetamodelAccess().getModelEPackageCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTargetMetamodel"


    // $ANTLR start "entryRuleMappingRule"
    // InternalMapping.g:418:1: entryRuleMappingRule returns [EObject current=null] : iv_ruleMappingRule= ruleMappingRule EOF ;
    public final EObject entryRuleMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRule = null;


        try {
            // InternalMapping.g:418:52: (iv_ruleMappingRule= ruleMappingRule EOF )
            // InternalMapping.g:419:2: iv_ruleMappingRule= ruleMappingRule EOF
            {
             newCompositeNode(grammarAccess.getMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingRule=ruleMappingRule();

            state._fsp--;

             current =iv_ruleMappingRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappingRule"


    // $ANTLR start "ruleMappingRule"
    // InternalMapping.g:425:1: ruleMappingRule returns [EObject current=null] : ( () (otherlv_1= 'MappingRule' )? ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'source' ( ( ruleQualifiedName ) ) (otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) )? )? (otherlv_7= 'target' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'operator' ( (lv_operator_10_0= ruleOperator ) ) )? (otherlv_11= 'condition' ( (lv_condition_12_0= RULE_STRING ) ) )? (otherlv_13= 'comment' ( (lv_comment_14_0= ruleEString ) ) )? (otherlv_15= '{' ( (lv_ChildRules_16_0= ruleMappingRule ) ) (otherlv_17= ';' ( (lv_ChildRules_18_0= ruleMappingRule ) ) )* otherlv_19= '}' )? (otherlv_20= '{' ( (lv_ChildHelpers_21_0= ruleHelperStatement ) ) (otherlv_22= ';' ( (lv_ChildHelpers_23_0= ruleHelperStatement ) ) )* otherlv_24= '}' )? ) ;
    public final EObject ruleMappingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_condition_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Enumerator lv_operator_10_0 = null;

        AntlrDatatypeRuleToken lv_comment_14_0 = null;

        EObject lv_ChildRules_16_0 = null;

        EObject lv_ChildRules_18_0 = null;

        EObject lv_ChildHelpers_21_0 = null;

        EObject lv_ChildHelpers_23_0 = null;



        	enterRule();

        try {
            // InternalMapping.g:431:2: ( ( () (otherlv_1= 'MappingRule' )? ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'source' ( ( ruleQualifiedName ) ) (otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) )? )? (otherlv_7= 'target' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'operator' ( (lv_operator_10_0= ruleOperator ) ) )? (otherlv_11= 'condition' ( (lv_condition_12_0= RULE_STRING ) ) )? (otherlv_13= 'comment' ( (lv_comment_14_0= ruleEString ) ) )? (otherlv_15= '{' ( (lv_ChildRules_16_0= ruleMappingRule ) ) (otherlv_17= ';' ( (lv_ChildRules_18_0= ruleMappingRule ) ) )* otherlv_19= '}' )? (otherlv_20= '{' ( (lv_ChildHelpers_21_0= ruleHelperStatement ) ) (otherlv_22= ';' ( (lv_ChildHelpers_23_0= ruleHelperStatement ) ) )* otherlv_24= '}' )? ) )
            // InternalMapping.g:432:2: ( () (otherlv_1= 'MappingRule' )? ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'source' ( ( ruleQualifiedName ) ) (otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) )? )? (otherlv_7= 'target' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'operator' ( (lv_operator_10_0= ruleOperator ) ) )? (otherlv_11= 'condition' ( (lv_condition_12_0= RULE_STRING ) ) )? (otherlv_13= 'comment' ( (lv_comment_14_0= ruleEString ) ) )? (otherlv_15= '{' ( (lv_ChildRules_16_0= ruleMappingRule ) ) (otherlv_17= ';' ( (lv_ChildRules_18_0= ruleMappingRule ) ) )* otherlv_19= '}' )? (otherlv_20= '{' ( (lv_ChildHelpers_21_0= ruleHelperStatement ) ) (otherlv_22= ';' ( (lv_ChildHelpers_23_0= ruleHelperStatement ) ) )* otherlv_24= '}' )? )
            {
            // InternalMapping.g:432:2: ( () (otherlv_1= 'MappingRule' )? ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'source' ( ( ruleQualifiedName ) ) (otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) )? )? (otherlv_7= 'target' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'operator' ( (lv_operator_10_0= ruleOperator ) ) )? (otherlv_11= 'condition' ( (lv_condition_12_0= RULE_STRING ) ) )? (otherlv_13= 'comment' ( (lv_comment_14_0= ruleEString ) ) )? (otherlv_15= '{' ( (lv_ChildRules_16_0= ruleMappingRule ) ) (otherlv_17= ';' ( (lv_ChildRules_18_0= ruleMappingRule ) ) )* otherlv_19= '}' )? (otherlv_20= '{' ( (lv_ChildHelpers_21_0= ruleHelperStatement ) ) (otherlv_22= ';' ( (lv_ChildHelpers_23_0= ruleHelperStatement ) ) )* otherlv_24= '}' )? )
            // InternalMapping.g:433:3: () (otherlv_1= 'MappingRule' )? ( (lv_name_2_0= RULE_STRING ) )? (otherlv_3= 'source' ( ( ruleQualifiedName ) ) (otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) )? )? (otherlv_7= 'target' ( ( ruleQualifiedName ) ) )? (otherlv_9= 'operator' ( (lv_operator_10_0= ruleOperator ) ) )? (otherlv_11= 'condition' ( (lv_condition_12_0= RULE_STRING ) ) )? (otherlv_13= 'comment' ( (lv_comment_14_0= ruleEString ) ) )? (otherlv_15= '{' ( (lv_ChildRules_16_0= ruleMappingRule ) ) (otherlv_17= ';' ( (lv_ChildRules_18_0= ruleMappingRule ) ) )* otherlv_19= '}' )? (otherlv_20= '{' ( (lv_ChildHelpers_21_0= ruleHelperStatement ) ) (otherlv_22= ';' ( (lv_ChildHelpers_23_0= ruleHelperStatement ) ) )* otherlv_24= '}' )?
            {
            // InternalMapping.g:433:3: ()
            // InternalMapping.g:434:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMappingRuleAccess().getMappingRuleAction_0(),
            					current);
            			

            }

            // InternalMapping.g:440:3: (otherlv_1= 'MappingRule' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMapping.g:441:4: otherlv_1= 'MappingRule'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getMappingRuleAccess().getMappingRuleKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMapping.g:446:3: ( (lv_name_2_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMapping.g:447:4: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalMapping.g:447:4: (lv_name_2_0= RULE_STRING )
                    // InternalMapping.g:448:5: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getMappingRuleAccess().getNameSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMappingRuleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalMapping.g:464:3: (otherlv_3= 'source' ( ( ruleQualifiedName ) ) (otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMapping.g:465:4: otherlv_3= 'source' ( ( ruleQualifiedName ) ) (otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) )?
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getMappingRuleAccess().getSourceKeyword_3_0());
                    			
                    // InternalMapping.g:469:4: ( ( ruleQualifiedName ) )
                    // InternalMapping.g:470:5: ( ruleQualifiedName )
                    {
                    // InternalMapping.g:470:5: ( ruleQualifiedName )
                    // InternalMapping.g:471:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMappingRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMappingRuleAccess().getSourceEObjectCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMapping.g:485:4: (otherlv_5= '::' ( (otherlv_6= RULE_ID ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMapping.g:486:5: otherlv_5= '::' ( (otherlv_6= RULE_ID ) )
                            {
                            otherlv_5=(Token)match(input,22,FOLLOW_9); 

                            					newLeafNode(otherlv_5, grammarAccess.getMappingRuleAccess().getColonColonKeyword_3_2_0());
                            				
                            // InternalMapping.g:490:5: ( (otherlv_6= RULE_ID ) )
                            // InternalMapping.g:491:6: (otherlv_6= RULE_ID )
                            {
                            // InternalMapping.g:491:6: (otherlv_6= RULE_ID )
                            // InternalMapping.g:492:7: otherlv_6= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMappingRuleRule());
                            							}
                            						
                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_17); 

                            							newLeafNode(otherlv_6, grammarAccess.getMappingRuleAccess().getEEnumLiteralEEnumLiteralCrossReference_3_2_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalMapping.g:505:3: (otherlv_7= 'target' ( ( ruleQualifiedName ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMapping.g:506:4: otherlv_7= 'target' ( ( ruleQualifiedName ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getMappingRuleAccess().getTargetKeyword_4_0());
                    			
                    // InternalMapping.g:510:4: ( ( ruleQualifiedName ) )
                    // InternalMapping.g:511:5: ( ruleQualifiedName )
                    {
                    // InternalMapping.g:511:5: ( ruleQualifiedName )
                    // InternalMapping.g:512:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMappingRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMappingRuleAccess().getTargetEObjectCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMapping.g:527:3: (otherlv_9= 'operator' ( (lv_operator_10_0= ruleOperator ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMapping.g:528:4: otherlv_9= 'operator' ( (lv_operator_10_0= ruleOperator ) )
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getMappingRuleAccess().getOperatorKeyword_5_0());
                    			
                    // InternalMapping.g:532:4: ( (lv_operator_10_0= ruleOperator ) )
                    // InternalMapping.g:533:5: (lv_operator_10_0= ruleOperator )
                    {
                    // InternalMapping.g:533:5: (lv_operator_10_0= ruleOperator )
                    // InternalMapping.g:534:6: lv_operator_10_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getMappingRuleAccess().getOperatorOperatorEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_operator_10_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_10_0,
                    							"org.xtext.example.mapping.Mapping.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMapping.g:552:3: (otherlv_11= 'condition' ( (lv_condition_12_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMapping.g:553:4: otherlv_11= 'condition' ( (lv_condition_12_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getMappingRuleAccess().getConditionKeyword_6_0());
                    			
                    // InternalMapping.g:557:4: ( (lv_condition_12_0= RULE_STRING ) )
                    // InternalMapping.g:558:5: (lv_condition_12_0= RULE_STRING )
                    {
                    // InternalMapping.g:558:5: (lv_condition_12_0= RULE_STRING )
                    // InternalMapping.g:559:6: lv_condition_12_0= RULE_STRING
                    {
                    lv_condition_12_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_condition_12_0, grammarAccess.getMappingRuleAccess().getConditionSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMappingRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"condition",
                    							lv_condition_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMapping.g:576:3: (otherlv_13= 'comment' ( (lv_comment_14_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMapping.g:577:4: otherlv_13= 'comment' ( (lv_comment_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getMappingRuleAccess().getCommentKeyword_7_0());
                    			
                    // InternalMapping.g:581:4: ( (lv_comment_14_0= ruleEString ) )
                    // InternalMapping.g:582:5: (lv_comment_14_0= ruleEString )
                    {
                    // InternalMapping.g:582:5: (lv_comment_14_0= ruleEString )
                    // InternalMapping.g:583:6: lv_comment_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMappingRuleAccess().getCommentEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_comment_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    						}
                    						set(
                    							current,
                    							"comment",
                    							lv_comment_14_0,
                    							"org.xtext.example.mapping.Mapping.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMapping.g:601:3: (otherlv_15= '{' ( (lv_ChildRules_16_0= ruleMappingRule ) ) (otherlv_17= ';' ( (lv_ChildRules_18_0= ruleMappingRule ) ) )* otherlv_19= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_STRING||LA17_1==13||LA17_1==15||(LA17_1>=19 && LA17_1<=21)||(LA17_1>=23 && LA17_1<=26)) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalMapping.g:602:4: otherlv_15= '{' ( (lv_ChildRules_16_0= ruleMappingRule ) ) (otherlv_17= ';' ( (lv_ChildRules_18_0= ruleMappingRule ) ) )* otherlv_19= '}'
                    {
                    otherlv_15=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getMappingRuleAccess().getLeftCurlyBracketKeyword_8_0());
                    			
                    // InternalMapping.g:606:4: ( (lv_ChildRules_16_0= ruleMappingRule ) )
                    // InternalMapping.g:607:5: (lv_ChildRules_16_0= ruleMappingRule )
                    {
                    // InternalMapping.g:607:5: (lv_ChildRules_16_0= ruleMappingRule )
                    // InternalMapping.g:608:6: lv_ChildRules_16_0= ruleMappingRule
                    {

                    						newCompositeNode(grammarAccess.getMappingRuleAccess().getChildRulesMappingRuleParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_ChildRules_16_0=ruleMappingRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    						}
                    						add(
                    							current,
                    							"ChildRules",
                    							lv_ChildRules_16_0,
                    							"org.xtext.example.mapping.Mapping.MappingRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMapping.g:625:4: (otherlv_17= ';' ( (lv_ChildRules_18_0= ruleMappingRule ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==19) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMapping.g:626:5: otherlv_17= ';' ( (lv_ChildRules_18_0= ruleMappingRule ) )
                    	    {
                    	    otherlv_17=(Token)match(input,19,FOLLOW_12); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getMappingRuleAccess().getSemicolonKeyword_8_2_0());
                    	    				
                    	    // InternalMapping.g:630:5: ( (lv_ChildRules_18_0= ruleMappingRule ) )
                    	    // InternalMapping.g:631:6: (lv_ChildRules_18_0= ruleMappingRule )
                    	    {
                    	    // InternalMapping.g:631:6: (lv_ChildRules_18_0= ruleMappingRule )
                    	    // InternalMapping.g:632:7: lv_ChildRules_18_0= ruleMappingRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappingRuleAccess().getChildRulesMappingRuleParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_ChildRules_18_0=ruleMappingRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ChildRules",
                    	    								lv_ChildRules_18_0,
                    	    								"org.xtext.example.mapping.Mapping.MappingRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_19, grammarAccess.getMappingRuleAccess().getRightCurlyBracketKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalMapping.g:655:3: (otherlv_20= '{' ( (lv_ChildHelpers_21_0= ruleHelperStatement ) ) (otherlv_22= ';' ( (lv_ChildHelpers_23_0= ruleHelperStatement ) ) )* otherlv_24= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMapping.g:656:4: otherlv_20= '{' ( (lv_ChildHelpers_21_0= ruleHelperStatement ) ) (otherlv_22= ';' ( (lv_ChildHelpers_23_0= ruleHelperStatement ) ) )* otherlv_24= '}'
                    {
                    otherlv_20=(Token)match(input,13,FOLLOW_23); 

                    				newLeafNode(otherlv_20, grammarAccess.getMappingRuleAccess().getLeftCurlyBracketKeyword_9_0());
                    			
                    // InternalMapping.g:660:4: ( (lv_ChildHelpers_21_0= ruleHelperStatement ) )
                    // InternalMapping.g:661:5: (lv_ChildHelpers_21_0= ruleHelperStatement )
                    {
                    // InternalMapping.g:661:5: (lv_ChildHelpers_21_0= ruleHelperStatement )
                    // InternalMapping.g:662:6: lv_ChildHelpers_21_0= ruleHelperStatement
                    {

                    						newCompositeNode(grammarAccess.getMappingRuleAccess().getChildHelpersHelperStatementParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_ChildHelpers_21_0=ruleHelperStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    						}
                    						add(
                    							current,
                    							"ChildHelpers",
                    							lv_ChildHelpers_21_0,
                    							"org.xtext.example.mapping.Mapping.HelperStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMapping.g:679:4: (otherlv_22= ';' ( (lv_ChildHelpers_23_0= ruleHelperStatement ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==19) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMapping.g:680:5: otherlv_22= ';' ( (lv_ChildHelpers_23_0= ruleHelperStatement ) )
                    	    {
                    	    otherlv_22=(Token)match(input,19,FOLLOW_23); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getMappingRuleAccess().getSemicolonKeyword_9_2_0());
                    	    				
                    	    // InternalMapping.g:684:5: ( (lv_ChildHelpers_23_0= ruleHelperStatement ) )
                    	    // InternalMapping.g:685:6: (lv_ChildHelpers_23_0= ruleHelperStatement )
                    	    {
                    	    // InternalMapping.g:685:6: (lv_ChildHelpers_23_0= ruleHelperStatement )
                    	    // InternalMapping.g:686:7: lv_ChildHelpers_23_0= ruleHelperStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappingRuleAccess().getChildHelpersHelperStatementParserRuleCall_9_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_ChildHelpers_23_0=ruleHelperStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ChildHelpers",
                    	    								lv_ChildHelpers_23_0,
                    	    								"org.xtext.example.mapping.Mapping.HelperStatement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getMappingRuleAccess().getRightCurlyBracketKeyword_9_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappingRule"


    // $ANTLR start "entryRuleHelperStatement"
    // InternalMapping.g:713:1: entryRuleHelperStatement returns [EObject current=null] : iv_ruleHelperStatement= ruleHelperStatement EOF ;
    public final EObject entryRuleHelperStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelperStatement = null;


        try {
            // InternalMapping.g:713:56: (iv_ruleHelperStatement= ruleHelperStatement EOF )
            // InternalMapping.g:714:2: iv_ruleHelperStatement= ruleHelperStatement EOF
            {
             newCompositeNode(grammarAccess.getHelperStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHelperStatement=ruleHelperStatement();

            state._fsp--;

             current =iv_ruleHelperStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHelperStatement"


    // $ANTLR start "ruleHelperStatement"
    // InternalMapping.g:720:1: ruleHelperStatement returns [EObject current=null] : ( () (otherlv_1= 'HelperStatement' )? (otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) ) ) (otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}' )? (otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleHelperStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_statement_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_ChildRules_5_0 = null;

        EObject lv_ChildRules_7_0 = null;

        EObject lv_ChildHelpers_10_0 = null;

        EObject lv_ChildHelpers_12_0 = null;



        	enterRule();

        try {
            // InternalMapping.g:726:2: ( ( () (otherlv_1= 'HelperStatement' )? (otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) ) ) (otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}' )? (otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}' )? ) )
            // InternalMapping.g:727:2: ( () (otherlv_1= 'HelperStatement' )? (otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) ) ) (otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}' )? (otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}' )? )
            {
            // InternalMapping.g:727:2: ( () (otherlv_1= 'HelperStatement' )? (otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) ) ) (otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}' )? (otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}' )? )
            // InternalMapping.g:728:3: () (otherlv_1= 'HelperStatement' )? (otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) ) ) (otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}' )? (otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}' )?
            {
            // InternalMapping.g:728:3: ()
            // InternalMapping.g:729:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHelperStatementAccess().getHelperStatementAction_0(),
            					current);
            			

            }

            // InternalMapping.g:735:3: (otherlv_1= 'HelperStatement' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMapping.g:736:4: otherlv_1= 'HelperStatement'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelperStatementAccess().getHelperStatementKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMapping.g:741:3: (otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) ) )
            // InternalMapping.g:742:4: otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) )
            {
            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getHelperStatementAccess().getStatementKeyword_2_0());
            			
            // InternalMapping.g:746:4: ( (lv_statement_3_0= RULE_STRING ) )
            // InternalMapping.g:747:5: (lv_statement_3_0= RULE_STRING )
            {
            // InternalMapping.g:747:5: (lv_statement_3_0= RULE_STRING )
            // InternalMapping.g:748:6: lv_statement_3_0= RULE_STRING
            {
            lv_statement_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            						newLeafNode(lv_statement_3_0, grammarAccess.getHelperStatementAccess().getStatementSTRINGTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getHelperStatementRule());
            						}
            						setWithLastConsumed(
            							current,
            							"statement",
            							lv_statement_3_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalMapping.g:765:3: (otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_STRING||(LA22_1>=13 && LA22_1<=15)||(LA22_1>=20 && LA22_1<=21)||(LA22_1>=23 && LA22_1<=26)) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalMapping.g:766:4: otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getHelperStatementAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalMapping.g:770:4: ( (lv_ChildRules_5_0= ruleMappingRule ) )
                    // InternalMapping.g:771:5: (lv_ChildRules_5_0= ruleMappingRule )
                    {
                    // InternalMapping.g:771:5: (lv_ChildRules_5_0= ruleMappingRule )
                    // InternalMapping.g:772:6: lv_ChildRules_5_0= ruleMappingRule
                    {

                    						newCompositeNode(grammarAccess.getHelperStatementAccess().getChildRulesMappingRuleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ChildRules_5_0=ruleMappingRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHelperStatementRule());
                    						}
                    						add(
                    							current,
                    							"ChildRules",
                    							lv_ChildRules_5_0,
                    							"org.xtext.example.mapping.Mapping.MappingRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMapping.g:789:4: (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMapping.g:790:5: otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHelperStatementAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMapping.g:794:5: ( (lv_ChildRules_7_0= ruleMappingRule ) )
                    	    // InternalMapping.g:795:6: (lv_ChildRules_7_0= ruleMappingRule )
                    	    {
                    	    // InternalMapping.g:795:6: (lv_ChildRules_7_0= ruleMappingRule )
                    	    // InternalMapping.g:796:7: lv_ChildRules_7_0= ruleMappingRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getHelperStatementAccess().getChildRulesMappingRuleParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ChildRules_7_0=ruleMappingRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHelperStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ChildRules",
                    	    								lv_ChildRules_7_0,
                    	    								"org.xtext.example.mapping.Mapping.MappingRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getHelperStatementAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalMapping.g:819:3: (otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMapping.g:820:4: otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getHelperStatementAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalMapping.g:824:4: ( (lv_ChildHelpers_10_0= ruleHelperStatement ) )
                    // InternalMapping.g:825:5: (lv_ChildHelpers_10_0= ruleHelperStatement )
                    {
                    // InternalMapping.g:825:5: (lv_ChildHelpers_10_0= ruleHelperStatement )
                    // InternalMapping.g:826:6: lv_ChildHelpers_10_0= ruleHelperStatement
                    {

                    						newCompositeNode(grammarAccess.getHelperStatementAccess().getChildHelpersHelperStatementParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ChildHelpers_10_0=ruleHelperStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHelperStatementRule());
                    						}
                    						add(
                    							current,
                    							"ChildHelpers",
                    							lv_ChildHelpers_10_0,
                    							"org.xtext.example.mapping.Mapping.HelperStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMapping.g:843:4: (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMapping.g:844:5: otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getHelperStatementAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMapping.g:848:5: ( (lv_ChildHelpers_12_0= ruleHelperStatement ) )
                    	    // InternalMapping.g:849:6: (lv_ChildHelpers_12_0= ruleHelperStatement )
                    	    {
                    	    // InternalMapping.g:849:6: (lv_ChildHelpers_12_0= ruleHelperStatement )
                    	    // InternalMapping.g:850:7: lv_ChildHelpers_12_0= ruleHelperStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getHelperStatementAccess().getChildHelpersHelperStatementParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ChildHelpers_12_0=ruleHelperStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHelperStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ChildHelpers",
                    	    								lv_ChildHelpers_12_0,
                    	    								"org.xtext.example.mapping.Mapping.HelperStatement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getHelperStatementAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHelperStatement"


    // $ANTLR start "entryRuleEString"
    // InternalMapping.g:877:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMapping.g:877:47: (iv_ruleEString= ruleEString EOF )
            // InternalMapping.g:878:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMapping.g:884:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMapping.g:890:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMapping.g:891:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMapping.g:891:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMapping.g:892:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMapping.g:900:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMapping.g:911:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMapping.g:911:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMapping.g:912:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMapping.g:918:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMapping.g:924:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMapping.g:925:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMapping.g:925:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMapping.g:926:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMapping.g:933:3: (kw= '.' this_ID_2= RULE_ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==29) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMapping.g:934:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleOperator"
    // InternalMapping.g:951:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'assign' ) | (enumLiteral_1= 'add' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMapping.g:957:2: ( ( (enumLiteral_0= 'assign' ) | (enumLiteral_1= 'add' ) ) )
            // InternalMapping.g:958:2: ( (enumLiteral_0= 'assign' ) | (enumLiteral_1= 'add' ) )
            {
            // InternalMapping.g:958:2: ( (enumLiteral_0= 'assign' ) | (enumLiteral_1= 'add' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            else if ( (LA27_0==31) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalMapping.g:959:3: (enumLiteral_0= 'assign' )
                    {
                    // InternalMapping.g:959:3: (enumLiteral_0= 'assign' )
                    // InternalMapping.g:960:4: enumLiteral_0= 'assign'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getAssignEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMapping.g:967:3: (enumLiteral_1= 'add' )
                    {
                    // InternalMapping.g:967:3: (enumLiteral_1= 'add' )
                    // InternalMapping.g:968:4: enumLiteral_1= 'add'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007B8A010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007A02012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007A02002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007C02002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000007802002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007002002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004002002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000007B0E010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000002L});

}