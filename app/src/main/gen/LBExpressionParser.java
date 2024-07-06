// Generated from /Users/kazuakiurayama/github/littlebasic/app/src/main/antlr/basic/LBExpression.g4 by ANTLR 4.13.1

package basic;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LBExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, EXP=5, MOD=6, NEQ=7, GTE=8, LTE=9, GT=10, 
		LT=11, EQ=12, AND=13, OR=14, NOT=15, COMMA=16, LPAREN=17, RPAREN=18, LEN=19, 
		VAL=20, ISNAN=21, PRINT=22, INPUT=23, LET=24, REM=25, IF=26, THEN=27, 
		ELSE=28, END=29, FOR=30, WHILE=31, REPEAT=32, UNTIL=33, STEP=34, NEXT=35, 
		TO=36, CONTINUE=37, EXIT=38, COMMENT=39, ID=40, NUMBER=41, STRINGLITERAL=42, 
		DOLLAR=43, NEWLINE=44, WS=45;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expression = 2, RULE_func = 3, RULE_string = 4, 
		RULE_number = 5, RULE_id = 6, RULE_lenfunc = 7, RULE_valfunc = 8, RULE_isnanfunc = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expression", "func", "string", "number", "id", "lenfunc", 
			"valfunc", "isnanfunc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'^'", "'MOD'", "'<>'", "'>='", "'<='", 
			"'>'", "'<'", "'='", null, null, null, "','", "'('", "')'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MUL", "DIV", "ADD", "SUB", "EXP", "MOD", "NEQ", "GTE", "LTE", 
			"GT", "LT", "EQ", "AND", "OR", "NOT", "COMMA", "LPAREN", "RPAREN", "LEN", 
			"VAL", "ISNAN", "PRINT", "INPUT", "LET", "REM", "IF", "THEN", "ELSE", 
			"END", "FOR", "WHILE", "REPEAT", "UNTIL", "STEP", "NEXT", "TO", "CONTINUE", 
			"EXIT", "COMMENT", "ID", "NUMBER", "STRINGLITERAL", "DOLLAR", "NEWLINE", 
			"WS"
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
	public String getGrammarFileName() { return "LBExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LBExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				stat();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 25288771272704L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LBExpressionParser.NEWLINE, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case LPAREN:
			case LEN:
			case VAL:
			case ISNAN:
			case ID:
			case NUMBER:
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				expression(0);
				setState(26);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(LBExpressionParser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LBExpressionParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LBExpressionParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LBExpressionParser.MOD, 0); }
		public MulDivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExpressionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExprContext extends ExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTE() { return getToken(LBExpressionParser.GTE, 0); }
		public TerminalNode GT() { return getToken(LBExpressionParser.GT, 0); }
		public TerminalNode LTE() { return getToken(LBExpressionParser.LTE, 0); }
		public TerminalNode LT() { return getToken(LBExpressionParser.LT, 0); }
		public TerminalNode EQ() { return getToken(LBExpressionParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LBExpressionParser.NEQ, 0); }
		public RelExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterRelExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitRelExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitRelExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(LBExpressionParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(LBExpressionParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LBExpressionParser.RPAREN, 0); }
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXP() { return getToken(LBExpressionParser.EXP, 0); }
		public ExpExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterExpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitExpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitExpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncExprContext extends ExpressionContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public FuncExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LBExpressionParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LBExpressionParser.SUB, 0); }
		public AddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(LBExpressionParser.OR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGLITERAL:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(32);
				string();
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				number();
				}
				break;
			case LEN:
			case VAL:
			case ISNAN:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				func();
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				id();
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(36);
				match(LPAREN);
				setState(37);
				expression(0);
				setState(38);
				match(RPAREN);
				}
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(NOT);
				setState(41);
				expression(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(44);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(45);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 70L) != 0)) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(46);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(47);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(48);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(49);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new RelExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(50);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(51);
						((RelExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8064L) != 0)) ) {
							((RelExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(52);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(54);
						match(AND);
						setState(55);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(57);
						match(OR);
						setState(58);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new ExpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(59);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(60);
						match(EXP);
						setState(61);
						expression(1);
						}
						break;
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContext extends ParserRuleContext {
		public LenfuncContext lenfunc() {
			return getRuleContext(LenfuncContext.class,0);
		}
		public ValfuncContext valfunc() {
			return getRuleContext(ValfuncContext.class,0);
		}
		public IsnanfuncContext isnanfunc() {
			return getRuleContext(IsnanfuncContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				lenfunc();
				}
				break;
			case VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				valfunc();
				}
				break;
			case ISNAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				isnanfunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(LBExpressionParser.STRINGLITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(STRINGLITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(LBExpressionParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LBExpressionParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LenfuncContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(LBExpressionParser.LEN, 0); }
		public TerminalNode LPAREN() { return getToken(LBExpressionParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LBExpressionParser.RPAREN, 0); }
		public LenfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lenfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterLenfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitLenfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitLenfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenfuncContext lenfunc() throws RecognitionException {
		LenfuncContext _localctx = new LenfuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lenfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LEN);
			setState(79);
			match(LPAREN);
			setState(80);
			expression(0);
			setState(81);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValfuncContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(LBExpressionParser.VAL, 0); }
		public TerminalNode LPAREN() { return getToken(LBExpressionParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LBExpressionParser.RPAREN, 0); }
		public ValfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterValfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitValfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitValfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValfuncContext valfunc() throws RecognitionException {
		ValfuncContext _localctx = new ValfuncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(VAL);
			setState(84);
			match(LPAREN);
			setState(85);
			expression(0);
			setState(86);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IsnanfuncContext extends ParserRuleContext {
		public TerminalNode ISNAN() { return getToken(LBExpressionParser.ISNAN, 0); }
		public TerminalNode LPAREN() { return getToken(LBExpressionParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LBExpressionParser.RPAREN, 0); }
		public IsnanfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isnanfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).enterIsnanfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LBExpressionListener ) ((LBExpressionListener)listener).exitIsnanfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LBExpressionVisitor ) return ((LBExpressionVisitor<? extends T>)visitor).visitIsnanfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsnanfuncContext isnanfunc() throws RecognitionException {
		IsnanfuncContext _localctx = new IsnanfuncContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_isnanfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ISNAN);
			setState(89);
			match(LPAREN);
			setState(90);
			expression(0);
			setState(91);
			match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001-^\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b\u0000\f"+
		"\u0000\u0017\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002+\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003G\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0000"+
		"\u0001\u0004\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0003"+
		"\u0002\u0000\u0001\u0002\u0006\u0006\u0001\u0000\u0003\u0004\u0001\u0000"+
		"\u0007\fb\u0000\u0015\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000"+
		"\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000"+
		"\bH\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fL\u0001\u0000"+
		"\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010S\u0001\u0000\u0000\u0000"+
		"\u0012X\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015"+
		"\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017"+
		"\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018"+
		"\u0001\u0001\u0000\u0000\u0000\u0019\u001a\u0003\u0004\u0002\u0000\u001a"+
		"\u001b\u0005,\u0000\u0000\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001e"+
		"\u0005,\u0000\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f \u0006\u0002"+
		"\uffff\uffff\u0000 +\u0003\b\u0004\u0000!+\u0003\n\u0005\u0000\"+\u0003"+
		"\u0006\u0003\u0000#+\u0003\f\u0006\u0000$%\u0005\u0011\u0000\u0000%&\u0003"+
		"\u0004\u0002\u0000&\'\u0005\u0012\u0000\u0000\'+\u0001\u0000\u0000\u0000"+
		"()\u0005\u000f\u0000\u0000)+\u0003\u0004\u0002\u0004*\u001f\u0001\u0000"+
		"\u0000\u0000*!\u0001\u0000\u0000\u0000*\"\u0001\u0000\u0000\u0000*#\u0001"+
		"\u0000\u0000\u0000*$\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"+@\u0001\u0000\u0000\u0000,-\n\u0007\u0000\u0000-.\u0007\u0000\u0000\u0000"+
		".?\u0003\u0004\u0002\b/0\n\u0006\u0000\u000001\u0007\u0001\u0000\u0000"+
		"1?\u0003\u0004\u0002\u000723\n\u0005\u0000\u000034\u0007\u0002\u0000\u0000"+
		"4?\u0003\u0004\u0002\u000656\n\u0003\u0000\u000067\u0005\r\u0000\u0000"+
		"7?\u0003\u0004\u0002\u000489\n\u0002\u0000\u00009:\u0005\u000e\u0000\u0000"+
		":?\u0003\u0004\u0002\u0003;<\n\u0001\u0000\u0000<=\u0005\u0005\u0000\u0000"+
		"=?\u0003\u0004\u0002\u0001>,\u0001\u0000\u0000\u0000>/\u0001\u0000\u0000"+
		"\u0000>2\u0001\u0000\u0000\u0000>5\u0001\u0000\u0000\u0000>8\u0001\u0000"+
		"\u0000\u0000>;\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\u0005\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CG\u0003\u000e\u0007\u0000DG\u0003\u0010"+
		"\b\u0000EG\u0003\u0012\t\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FE\u0001\u0000\u0000\u0000G\u0007\u0001\u0000\u0000\u0000"+
		"HI\u0005*\u0000\u0000I\t\u0001\u0000\u0000\u0000JK\u0005)\u0000\u0000"+
		"K\u000b\u0001\u0000\u0000\u0000LM\u0005(\u0000\u0000M\r\u0001\u0000\u0000"+
		"\u0000NO\u0005\u0013\u0000\u0000OP\u0005\u0011\u0000\u0000PQ\u0003\u0004"+
		"\u0002\u0000QR\u0005\u0012\u0000\u0000R\u000f\u0001\u0000\u0000\u0000"+
		"ST\u0005\u0014\u0000\u0000TU\u0005\u0011\u0000\u0000UV\u0003\u0004\u0002"+
		"\u0000VW\u0005\u0012\u0000\u0000W\u0011\u0001\u0000\u0000\u0000XY\u0005"+
		"\u0015\u0000\u0000YZ\u0005\u0011\u0000\u0000Z[\u0003\u0004\u0002\u0000"+
		"[\\\u0005\u0012\u0000\u0000\\\u0013\u0001\u0000\u0000\u0000\u0006\u0017"+
		"\u001d*>@F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}