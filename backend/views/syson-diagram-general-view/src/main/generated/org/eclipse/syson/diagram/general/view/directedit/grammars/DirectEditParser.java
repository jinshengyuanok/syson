// Generated from DirectEdit.g4 by ANTLR 4.10.1

/*******************************************************************************
 * Copyright (c) 2023 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.syson.diagram.general.view.directedit.grammars;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DirectEditParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, Integer=7, Real=8, String=9, 
		Ident=10, ABOUT=11, ABSTRACT=12, ALIAS=13, ALL=14, AND=15, AS=16, ASSIGN=17, 
		ASSOC=18, BEAHVIOR=19, BINDING=20, BOOL=21, BY=22, CHAINS=23, CLASS=24, 
		CLASSIFIER=25, COMMENT=26, COMPOSITE=27, CONJUGATE=28, CONJUGATES=29, 
		CONJUGATION=30, CONNECTOR=31, DATATYPE=32, DEFAULT=33, DEPENDENCY=34, 
		DERIVED=35, DIFFERENCES=36, DISJOINING=37, DISJOINT=38, DOC=39, ELSE=40, 
		END=41, EXPR=42, FALSE=43, FEATURE=44, FEATURED=45, FEATURING=46, FILTER=47, 
		FIRST=48, FLOW=49, FOR=50, FROM=51, FUNCTION=52, HASTYPE=53, IF=54, INTERSECTS=55, 
		IMPLIES=56, IMPORT=57, IN=58, INPUT=59, INTERACTION=60, INV=61, INVERSE=62, 
		INVERTING=63, ISTYPE=64, LANGUAGE=65, MEMBER=66, METACLASS=67, METADATA=68, 
		MULTIPLICITY=69, NAMESPACE=70, NONUNIQUE=71, NOT=72, NULL=73, OF=74, OR=75, 
		ORDERED=76, OUT=77, PACKAGE=78, PORTION=79, PREDICATE=80, PRIAVTE=81, 
		PROTECTED=82, PUBLIC=83, READONLY=84, REDEFINES=85, REDEFINITION=86, RFERENCES=87, 
		REP=88, RETURN=89, SPECIALIZTION=90, SPECIALIZES=91, STEP=92, STRCUT=93, 
		SUBCLASSIFIER=94, SUBSET=95, SUBSETS=96, SUBTYPE=97, SUCCESSION=98, THEN=99, 
		TO=100, TRUE=101, TYPE=102, TYPED=103, TYPING=104, UNIONS=105, XOR=106;
	public static final int
		RULE_expression = 0, RULE_featureExpressions = 1, RULE_subsettingExpression = 2, 
		RULE_redefinitionExpression = 3, RULE_typingExpression = 4, RULE_valueExpression = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "featureExpressions", "subsettingExpression", "redefinitionExpression", 
			"typingExpression", "valueExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':>'", "':>>'", "':'", "'='", "'.*'", null, null, null, null, 
			null, "'about'", "'abstract'", "'alias'", "'all'", "'and'", "'as'", "'assign'", 
			"'assoc'", "'behavior'", "'binding'", "'bool'", "'by'", "'chains'", "'class'", 
			"'classifier'", "'comment'", "'composite'", "'conjugate'", "'conjugates'", 
			"'conjugation'", "'connector'", "'datatype'", "'default'", "'dependency'", 
			"'derived'", "'differences'", "'disjoining'", "'disjoint'", "'doc'", 
			"'else'", "'end'", "'expr'", "'false'", "'feature'", "'featured'", "'featuring'", 
			"'filter'", "'first'", "'flow'", "'for'", "'from'", "'function'", "'hastype'", 
			"'if'", "'intersects'", "'implies'", "'import'", "'in'", "'inout'", "'interaction'", 
			"'inv'", "'inverse'", "'inverting'", "'istype'", "'language'", "'member'", 
			"'metaclass'", "'metadata'", "'multiplicity'", "'namespace'", "'nonunique'", 
			"'not'", "'null'", "'of'", "'or'", "'ordered'", "'out'", "'package'", 
			"'portion'", "'predicate'", "'private'", "'protected'", "'public'", "'readonly'", 
			"'redefines'", "'redefinition'", "'references'", "'rep'", "'return'", 
			"'specialization'", "'specializes'", "'step'", "'struct'", "'subclassifier'", 
			"'subset'", "'subsets'", "'subtype'", "'succession'", "'then'", "'to'", 
			"'true'", "'type'", "'typed'", "'typing'", "'unions'", "'xor'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WS", "Integer", "Real", "String", 
			"Ident", "ABOUT", "ABSTRACT", "ALIAS", "ALL", "AND", "AS", "ASSIGN", 
			"ASSOC", "BEAHVIOR", "BINDING", "BOOL", "BY", "CHAINS", "CLASS", "CLASSIFIER", 
			"COMMENT", "COMPOSITE", "CONJUGATE", "CONJUGATES", "CONJUGATION", "CONNECTOR", 
			"DATATYPE", "DEFAULT", "DEPENDENCY", "DERIVED", "DIFFERENCES", "DISJOINING", 
			"DISJOINT", "DOC", "ELSE", "END", "EXPR", "FALSE", "FEATURE", "FEATURED", 
			"FEATURING", "FILTER", "FIRST", "FLOW", "FOR", "FROM", "FUNCTION", "HASTYPE", 
			"IF", "INTERSECTS", "IMPLIES", "IMPORT", "IN", "INPUT", "INTERACTION", 
			"INV", "INVERSE", "INVERTING", "ISTYPE", "LANGUAGE", "MEMBER", "METACLASS", 
			"METADATA", "MULTIPLICITY", "NAMESPACE", "NONUNIQUE", "NOT", "NULL", 
			"OF", "OR", "ORDERED", "OUT", "PACKAGE", "PORTION", "PREDICATE", "PRIAVTE", 
			"PROTECTED", "PUBLIC", "READONLY", "REDEFINES", "REDEFINITION", "RFERENCES", 
			"REP", "RETURN", "SPECIALIZTION", "SPECIALIZES", "STEP", "STRCUT", "SUBCLASSIFIER", 
			"SUBSET", "SUBSETS", "SUBTYPE", "SUCCESSION", "THEN", "TO", "TRUE", "TYPE", 
			"TYPED", "TYPING", "UNIONS", "XOR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DirectEdit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DirectEditParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(DirectEditParser.Ident, 0); }
		public FeatureExpressionsContext featureExpressions() {
			return getRuleContext(FeatureExpressionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DirectEditParser.EOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(Ident);
			setState(13);
			featureExpressions();
			setState(14);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureExpressionsContext extends ParserRuleContext {
		public SubsettingExpressionContext subsettingExpression() {
			return getRuleContext(SubsettingExpressionContext.class,0);
		}
		public RedefinitionExpressionContext redefinitionExpression() {
			return getRuleContext(RedefinitionExpressionContext.class,0);
		}
		public TypingExpressionContext typingExpression() {
			return getRuleContext(TypingExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public FeatureExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterFeatureExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitFeatureExpressions(this);
		}
	}

	public final FeatureExpressionsContext featureExpressions() throws RecognitionException {
		FeatureExpressionsContext _localctx = new FeatureExpressionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_featureExpressions);
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(16);
					subsettingExpression();
					}
					break;
				case T__1:
					{
					setState(17);
					redefinitionExpression();
					}
					break;
				case EOF:
				case T__2:
				case T__3:
					break;
				default:
					break;
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(20);
					typingExpression();
					}
				}

				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(23);
					valueExpression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(26);
					typingExpression();
					}
				}

				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(29);
					subsettingExpression();
					}
					break;
				case T__1:
					{
					setState(30);
					redefinitionExpression();
					}
					break;
				case EOF:
				case T__3:
					break;
				default:
					break;
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(33);
					valueExpression();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubsettingExpressionContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(DirectEditParser.Ident, 0); }
		public SubsettingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsettingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterSubsettingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitSubsettingExpression(this);
		}
	}

	public final SubsettingExpressionContext subsettingExpression() throws RecognitionException {
		SubsettingExpressionContext _localctx = new SubsettingExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subsettingExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			match(Ident);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RedefinitionExpressionContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(DirectEditParser.Ident, 0); }
		public RedefinitionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redefinitionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterRedefinitionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitRedefinitionExpression(this);
		}
	}

	public final RedefinitionExpressionContext redefinitionExpression() throws RecognitionException {
		RedefinitionExpressionContext _localctx = new RedefinitionExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_redefinitionExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__1);
			setState(42);
			match(Ident);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypingExpressionContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(DirectEditParser.Ident, 0); }
		public TypingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterTypingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitTypingExpression(this);
		}
	}

	public final TypingExpressionContext typingExpression() throws RecognitionException {
		TypingExpressionContext _localctx = new TypingExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typingExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__2);
			setState(45);
			match(Ident);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DirectEditListener ) ((DirectEditListener)listener).exitValueExpression(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valueExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__3);
			setState(48);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001j3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0001\u0003\u0001\u0016\b"+
		"\u0001\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0001\u0003\u0001\u001c"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0001\u0003"+
		"\u0001#\b\u0001\u0003\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0000"+
		"\u0002\u0004\u0006\b\n\u0000\u00005\u0000\f\u0001\u0000\u0000\u0000\u0002"+
		"$\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006)\u0001"+
		"\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000\n/\u0001\u0000\u0000\u0000"+
		"\f\r\u0005\n\u0000\u0000\r\u000e\u0003\u0002\u0001\u0000\u000e\u000f\u0005"+
		"\u0000\u0000\u0001\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0013\u0003"+
		"\u0004\u0002\u0000\u0011\u0013\u0003\u0006\u0003\u0000\u0012\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0012\u0013\u0001"+
		"\u0000\u0000\u0000\u0013\u0015\u0001\u0000\u0000\u0000\u0014\u0016\u0003"+
		"\b\u0004\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000"+
		"\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0019\u0003\n\u0005"+
		"\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000"+
		"\u0000\u0019%\u0001\u0000\u0000\u0000\u001a\u001c\u0003\b\u0004\u0000"+
		"\u001b\u001a\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001f\u0001\u0000\u0000\u0000\u001d \u0003\u0004\u0002\u0000\u001e"+
		" \u0003\u0006\u0003\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000"+
		"\u0000\u0000!#\u0003\n\u0005\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#%\u0001\u0000\u0000\u0000$\u0012\u0001\u0000\u0000"+
		"\u0000$\u001b\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&"+
		"\'\u0005\u0001\u0000\u0000\'(\u0005\n\u0000\u0000(\u0005\u0001\u0000\u0000"+
		"\u0000)*\u0005\u0002\u0000\u0000*+\u0005\n\u0000\u0000+\u0007\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0003\u0000\u0000-.\u0005\n\u0000\u0000.\t\u0001"+
		"\u0000\u0000\u0000/0\u0005\u0004\u0000\u000001\u0005\u0005\u0000\u0000"+
		"1\u000b\u0001\u0000\u0000\u0000\u0007\u0012\u0015\u0018\u001b\u001f\""+
		"$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}