// Generated from ./src/SQL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		SELECT=18, FROM=19, WHERE=20, GROUP=21, BY=22, HAVING=23, ORDER=24, LIMIT=25, 
		JOIN=26, ON=27, RIGHT=28, LEFT=29, INNER=30, FULL=31, OUTER=32, CROSS=33, 
		DESC=34, ASC=35, AS=36, RANK=37, DISTINCT=38, WITH=39, COUNT=40, SUM=41, 
		AVG=42, MIN=43, MAX=44, GROUP_CONCAT=45, AND=46, OR=47, NOT=48, LIKE=49, 
		IN=50, IS=51, NULL=52, TRUE=53, FALSE=54, BETWEEN=55, LOGIN=56, EXISTS=57, 
		OVER=58, PARTITION=59, RECURSIVE=60, INTERSECT=61, ALL=62, UNION=63, SEPARATOR=64, 
		EXPLAIN=65, ID=66, STRING=67, INT=68, DOUBLE=69, WS=70, LINE_COMMENT=71, 
		MULTILINE_COMMENT=72, OFFSET=73;
	public static final int
		RULE_start = 0, RULE_dml = 1, RULE_select = 2, RULE_cte = 3, RULE_select_statement1 = 4, 
		RULE_select_statement2 = 5, RULE_selectItem = 6, RULE_tableExpression = 7, 
		RULE_tableReference = 8, RULE_intersectClause = 9, RULE_unionClause = 10, 
		RULE_join = 11, RULE_joinTypeSpec = 12, RULE_whereClause = 13, RULE_groupByClause = 14, 
		RULE_havingClause = 15, RULE_orderByClause = 16, RULE_orderByItem = 17, 
		RULE_limitClause = 18, RULE_expression = 19, RULE_functionCall = 20, RULE_columnReference = 21, 
		RULE_literal = 22, RULE_aggregationFunction = 23, RULE_rank = 24, RULE_groupConcat = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "dml", "select", "cte", "select_statement1", "select_statement2", 
			"selectItem", "tableExpression", "tableReference", "intersectClause", 
			"unionClause", "join", "joinTypeSpec", "whereClause", "groupByClause", 
			"havingClause", "orderByClause", "orderByItem", "limitClause", "expression", 
			"functionCall", "columnReference", "literal", "aggregationFunction", 
			"rank", "groupConcat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "';'", "'*'", "'/'", "'%'", "'+'", "'-'", 
			"'='", "'<'", "'>'", "'!='", "'<='", "'>='", "'<>'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "SELECT", "FROM", "WHERE", "GROUP", 
			"BY", "HAVING", "ORDER", "LIMIT", "JOIN", "ON", "RIGHT", "LEFT", "INNER", 
			"FULL", "OUTER", "CROSS", "DESC", "ASC", "AS", "RANK", "DISTINCT", "WITH", 
			"COUNT", "SUM", "AVG", "MIN", "MAX", "GROUP_CONCAT", "AND", "OR", "NOT", 
			"LIKE", "IN", "IS", "NULL", "TRUE", "FALSE", "BETWEEN", "LOGIN", "EXISTS", 
			"OVER", "PARTITION", "RECURSIVE", "INTERSECT", "ALL", "UNION", "SEPARATOR", 
			"EXPLAIN", "ID", "STRING", "INT", "DOUBLE", "WS", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"OFFSET"
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
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public DmlContext dml() {
			return getRuleContext(DmlContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			dml();
			setState(53);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DmlContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public DmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDml(this);
		}
	}

	public final DmlContext dml() throws RecognitionException {
		DmlContext _localctx = new DmlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			select();
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
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SQLParser.WITH, 0); }
		public List<CteContext> cte() {
			return getRuleContexts(CteContext.class);
		}
		public CteContext cte(int i) {
			return getRuleContext(CteContext.class,i);
		}
		public Select_statement2Context select_statement2() {
			return getRuleContext(Select_statement2Context.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(SQLParser.RECURSIVE, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(WITH);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECURSIVE) {
					{
					setState(58);
					match(RECURSIVE);
					}
				}

				setState(61);
				cte();
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(62);
					match(T__0);
					setState(63);
					cte();
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				select_statement2();
				}
				break;
			case SELECT:
			case EXPLAIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				select_statement2();
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
	public static class CteContext extends ParserRuleContext {
		public Token id;
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public List<Select_statement1Context> select_statement1() {
			return getRuleContexts(Select_statement1Context.class);
		}
		public Select_statement1Context select_statement1(int i) {
			return getRuleContext(Select_statement1Context.class,i);
		}
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCte(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			((CteContext)_localctx).id = match(ID);
			setState(75);
			match(AS);
			setState(76);
			match(T__1);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT || _la==EXPLAIN) {
				{
				{
				setState(77);
				select_statement1();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(T__2);
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
	public static class Select_statement1Context extends ParserRuleContext {
		public Token distinct;
		public SelectItemContext columns;
		public TableExpressionContext from;
		public JoinContext join;
		public List<JoinContext> joins = new ArrayList<JoinContext>();
		public WhereClauseContext where;
		public UnionClauseContext union;
		public IntersectClauseContext intersect;
		public GroupByClauseContext groupBy;
		public HavingClauseContext having;
		public OrderByClauseContext orderBy;
		public LimitClauseContext limit;
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public TableExpressionContext tableExpression() {
			return getRuleContext(TableExpressionContext.class,0);
		}
		public TerminalNode EXPLAIN() { return getToken(SQLParser.EXPLAIN, 0); }
		public TerminalNode DISTINCT() { return getToken(SQLParser.DISTINCT, 0); }
		public List<JoinContext> join() {
			return getRuleContexts(JoinContext.class);
		}
		public JoinContext join(int i) {
			return getRuleContext(JoinContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UnionClauseContext unionClause() {
			return getRuleContext(UnionClauseContext.class,0);
		}
		public IntersectClauseContext intersectClause() {
			return getRuleContext(IntersectClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public Select_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_statement1(this);
		}
	}

	public final Select_statement1Context select_statement1() throws RecognitionException {
		Select_statement1Context _localctx = new Select_statement1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_select_statement1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPLAIN) {
				{
				setState(85);
				match(EXPLAIN);
				}
			}

			setState(88);
			match(SELECT);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(89);
				((Select_statement1Context)_localctx).distinct = match(DISTINCT);
				}
			}

			setState(92);
			((Select_statement1Context)_localctx).columns = selectItem();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(93);
				match(T__0);
				setState(94);
				selectItem();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(FROM);
			setState(101);
			((Select_statement1Context)_localctx).from = tableExpression();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					((Select_statement1Context)_localctx).join = join();
					((Select_statement1Context)_localctx).joins.add(((Select_statement1Context)_localctx).join);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(108);
				((Select_statement1Context)_localctx).where = whereClause();
				}
				break;
			}
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(111);
				((Select_statement1Context)_localctx).union = unionClause();
				}
				break;
			}
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(114);
				((Select_statement1Context)_localctx).intersect = intersectClause();
				}
				break;
			}
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(117);
				((Select_statement1Context)_localctx).groupBy = groupByClause();
				}
				break;
			}
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(120);
				((Select_statement1Context)_localctx).having = havingClause();
				}
				break;
			}
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(123);
				((Select_statement1Context)_localctx).orderBy = orderByClause();
				}
				break;
			}
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(126);
				((Select_statement1Context)_localctx).limit = limitClause();
				}
				break;
			}
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
	public static class Select_statement2Context extends ParserRuleContext {
		public Token distinct;
		public SelectItemContext columns;
		public TableExpressionContext from;
		public JoinContext join;
		public List<JoinContext> joins = new ArrayList<JoinContext>();
		public WhereClauseContext where;
		public GroupByClauseContext groupBy;
		public HavingClauseContext having;
		public OrderByClauseContext orderBy;
		public UnionClauseContext union;
		public IntersectClauseContext intersect;
		public LimitClauseContext limit;
		public Select_statement1Context select1;
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public TableExpressionContext tableExpression() {
			return getRuleContext(TableExpressionContext.class,0);
		}
		public TerminalNode EXPLAIN() { return getToken(SQLParser.EXPLAIN, 0); }
		public TerminalNode DISTINCT() { return getToken(SQLParser.DISTINCT, 0); }
		public List<JoinContext> join() {
			return getRuleContexts(JoinContext.class);
		}
		public JoinContext join(int i) {
			return getRuleContext(JoinContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public UnionClauseContext unionClause() {
			return getRuleContext(UnionClauseContext.class,0);
		}
		public IntersectClauseContext intersectClause() {
			return getRuleContext(IntersectClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public List<Select_statement1Context> select_statement1() {
			return getRuleContexts(Select_statement1Context.class);
		}
		public Select_statement1Context select_statement1(int i) {
			return getRuleContext(Select_statement1Context.class,i);
		}
		public Select_statement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_statement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_statement2(this);
		}
	}

	public final Select_statement2Context select_statement2() throws RecognitionException {
		Select_statement2Context _localctx = new Select_statement2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_select_statement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPLAIN) {
				{
				setState(129);
				match(EXPLAIN);
				}
			}

			setState(132);
			match(SELECT);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(133);
				((Select_statement2Context)_localctx).distinct = match(DISTINCT);
				}
			}

			setState(136);
			((Select_statement2Context)_localctx).columns = selectItem();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(137);
				match(T__0);
				setState(138);
				selectItem();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(FROM);
			setState(145);
			((Select_statement2Context)_localctx).from = tableExpression();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12683575296L) != 0)) {
				{
				{
				setState(146);
				((Select_statement2Context)_localctx).join = join();
				((Select_statement2Context)_localctx).joins.add(((Select_statement2Context)_localctx).join);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(152);
				((Select_statement2Context)_localctx).where = whereClause();
				}
			}

			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(155);
				((Select_statement2Context)_localctx).groupBy = groupByClause();
				}
			}

			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(158);
				((Select_statement2Context)_localctx).having = havingClause();
				}
			}

			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(161);
				((Select_statement2Context)_localctx).orderBy = orderByClause();
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNION) {
				{
				setState(164);
				((Select_statement2Context)_localctx).union = unionClause();
				}
			}

			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERSECT) {
				{
				setState(167);
				((Select_statement2Context)_localctx).intersect = intersectClause();
				}
			}

			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(170);
				((Select_statement2Context)_localctx).limit = limitClause();
				}
			}

			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELECT || _la==EXPLAIN) {
				{
				{
				setState(173);
				((Select_statement2Context)_localctx).select1 = select_statement1();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(T__3);
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
	public static class SelectItemContext extends ParserRuleContext {
		public Token alias;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelectItem(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			expression(0);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(182);
					match(AS);
					}
				}

				setState(185);
				((SelectItemContext)_localctx).alias = match(ID);
				}
			}

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
	public static class TableExpressionContext extends ParserRuleContext {
		public Token alias;
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public TableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTableExpression(this);
		}
	}

	public final TableExpressionContext tableExpression() throws RecognitionException {
		TableExpressionContext _localctx = new TableExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			tableReference();
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(189);
					match(AS);
					}
				}

				setState(192);
				((TableExpressionContext)_localctx).alias = match(ID);
				}
				break;
			}
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
	public static class TableReferenceContext extends ParserRuleContext {
		public Token alias;
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public Select_statement2Context select_statement2() {
			return getRuleContext(Select_statement2Context.class,0);
		}
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTableReference(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableReference);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(STRING);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(T__1);
				setState(198);
				select_statement2();
				setState(199);
				match(T__2);
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(200);
						match(AS);
						}
					}

					setState(203);
					((TableReferenceContext)_localctx).alias = match(ID);
					}
					break;
				}
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
	public static class IntersectClauseContext extends ParserRuleContext {
		public TerminalNode INTERSECT() { return getToken(SQLParser.INTERSECT, 0); }
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public IntersectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIntersectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIntersectClause(this);
		}
	}

	public final IntersectClauseContext intersectClause() throws RecognitionException {
		IntersectClauseContext _localctx = new IntersectClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_intersectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(INTERSECT);
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(209);
				match(ALL);
				}
				break;
			}
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
	public static class UnionClauseContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(SQLParser.UNION, 0); }
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public UnionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnionClause(this);
		}
	}

	public final UnionClauseContext unionClause() throws RecognitionException {
		UnionClauseContext _localctx = new UnionClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(UNION);
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(213);
				match(ALL);
				}
				break;
			}
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
	public static class JoinContext extends ParserRuleContext {
		public JoinTypeSpecContext joinType;
		public TableExpressionContext right;
		public ExpressionContext condition;
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public TableExpressionContext tableExpression() {
			return getRuleContext(TableExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JoinTypeSpecContext joinTypeSpec() {
			return getRuleContext(JoinTypeSpecContext.class,0);
		}
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12616466432L) != 0)) {
				{
				setState(216);
				((JoinContext)_localctx).joinType = joinTypeSpec();
				}
			}

			setState(219);
			match(JOIN);
			setState(220);
			((JoinContext)_localctx).right = tableExpression();
			setState(221);
			match(ON);
			setState(222);
			((JoinContext)_localctx).condition = expression(0);
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
	public static class JoinTypeSpecContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(SQLParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(SQLParser.LEFT, 0); }
		public TerminalNode INNER() { return getToken(SQLParser.INNER, 0); }
		public TerminalNode FULL() { return getToken(SQLParser.FULL, 0); }
		public TerminalNode OUTER() { return getToken(SQLParser.OUTER, 0); }
		public TerminalNode CROSS() { return getToken(SQLParser.CROSS, 0); }
		public JoinTypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinTypeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoinTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoinTypeSpec(this);
		}
	}

	public final JoinTypeSpecContext joinTypeSpec() throws RecognitionException {
		JoinTypeSpecContext _localctx = new JoinTypeSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_joinTypeSpec);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(RIGHT);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(LEFT);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(INNER);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(FULL);
				setState(228);
				match(OUTER);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(CROSS);
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
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public List<Select_statement1Context> select_statement1() {
			return getRuleContexts(Select_statement1Context.class);
		}
		public Select_statement1Context select_statement1(int i) {
			return getRuleContext(Select_statement1Context.class,i);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(WHERE);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXISTS) {
				{
				setState(233);
				match(EXISTS);
				}
			}

			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(236);
				expression(0);
				}
				break;
			case 2:
				{
				setState(237);
				match(ID);
				setState(238);
				match(IN);
				setState(239);
				match(T__1);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SELECT || _la==EXPLAIN) {
					{
					{
					setState(240);
					select_statement1();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246);
				match(T__2);
				}
				break;
			case 3:
				{
				setState(247);
				match(T__1);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SELECT || _la==EXPLAIN) {
					{
					{
					setState(248);
					select_statement1();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				match(T__2);
				}
				break;
			}
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
	public static class GroupByClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> expressions = new ArrayList<ExpressionContext>();
		public TerminalNode GROUP() { return getToken(SQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitGroupByClause(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_groupByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(GROUP);
			setState(258);
			match(BY);
			setState(259);
			((GroupByClauseContext)_localctx).expression = expression(0);
			((GroupByClauseContext)_localctx).expressions.add(((GroupByClauseContext)_localctx).expression);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(260);
					match(T__0);
					setState(261);
					((GroupByClauseContext)_localctx).expression = expression(0);
					((GroupByClauseContext)_localctx).expressions.add(((GroupByClauseContext)_localctx).expression);
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
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
	public static class HavingClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public TerminalNode HAVING() { return getToken(SQLParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitHavingClause(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(HAVING);
			setState(268);
			((HavingClauseContext)_localctx).condition = expression(0);
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
	public static class OrderByClauseContext extends ParserRuleContext {
		public OrderByItemContext orderByItem;
		public List<OrderByItemContext> orderItems = new ArrayList<OrderByItemContext>();
		public TerminalNode ORDER() { return getToken(SQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrderByClause(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orderByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ORDER);
			setState(271);
			match(BY);
			setState(272);
			((OrderByClauseContext)_localctx).orderByItem = orderByItem();
			((OrderByClauseContext)_localctx).orderItems.add(((OrderByClauseContext)_localctx).orderByItem);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					match(T__0);
					setState(274);
					((OrderByClauseContext)_localctx).orderByItem = orderByItem();
					((OrderByClauseContext)_localctx).orderItems.add(((OrderByClauseContext)_localctx).orderByItem);
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
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
	public static class OrderByItemContext extends ParserRuleContext {
		public Token direction;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrderByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrderByItem(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			expression(0);
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(281);
				((OrderByItemContext)_localctx).direction = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==ASC) ) {
					((OrderByItemContext)_localctx).direction = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
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
	public static class LimitClauseContext extends ParserRuleContext {
		public Token count;
		public Token offset;
		public TerminalNode LIMIT() { return getToken(SQLParser.LIMIT, 0); }
		public List<TerminalNode> INT() { return getTokens(SQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(SQLParser.INT, i);
		}
		public TerminalNode OFFSET() { return getToken(SQLParser.OFFSET, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLimitClause(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(LIMIT);
			setState(285);
			((LimitClauseContext)_localctx).count = match(INT);
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(286);
				match(OFFSET);
				setState(287);
				((LimitClauseContext)_localctx).offset = match(INT);
				}
				break;
			}
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
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public ExpressionContext lower;
		public ExpressionContext upper;
		public Token inExpr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ColumnReferenceContext columnReference() {
			return getRuleContext(ColumnReferenceContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<Select_statement1Context> select_statement1() {
			return getRuleContexts(Select_statement1Context.class);
		}
		public Select_statement1Context select_statement1(int i) {
			return getRuleContext(Select_statement1Context.class,i);
		}
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(SQLParser.OR, 0); }
		public TerminalNode LIKE() { return getToken(SQLParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SQLParser.IS, 0); }
		public TerminalNode BETWEEN() { return getToken(SQLParser.BETWEEN, 0); }
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpression(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(291);
				match(T__1);
				setState(292);
				expression(0);
				setState(293);
				match(T__2);
				}
				break;
			case 2:
				{
				setState(295);
				match(NOT);
				setState(296);
				expression(13);
				}
				break;
			case 3:
				{
				setState(297);
				functionCall();
				}
				break;
			case 4:
				{
				setState(298);
				columnReference();
				}
				break;
			case 5:
				{
				setState(299);
				literal();
				}
				break;
			case 6:
				{
				setState(300);
				match(T__1);
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(301);
					select_statement1();
					}
					}
					setState(304); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==EXPLAIN );
				setState(306);
				match(T__2);
				}
				break;
			case 7:
				{
				setState(309); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(308);
						select_statement1();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(311); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(352);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(316);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(317);
						((ExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(319);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						((ExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(322);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 130048L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						((ExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(324);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(325);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(326);
						((ExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(327);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(328);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LIKE || _la==IS) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(329);
						((ExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(330);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(331);
						((ExpressionContext)_localctx).op = match(BETWEEN);
						setState(332);
						((ExpressionContext)_localctx).lower = expression(0);
						setState(333);
						match(AND);
						setState(334);
						((ExpressionContext)_localctx).upper = expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(336);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(338);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(337);
							((ExpressionContext)_localctx).op = match(NOT);
							}
						}

						setState(340);
						match(IN);
						setState(341);
						((ExpressionContext)_localctx).inExpr = match(T__1);
						setState(342);
						expression(0);
						setState(347);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__0) {
							{
							{
							setState(343);
							match(T__0);
							setState(344);
							expression(0);
							}
							}
							setState(349);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(350);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public Token name;
		public ExpressionContext expression;
		public List<ExpressionContext> args = new ArrayList<ExpressionContext>();
		public ExpressionContext arg;
		public TerminalNode ID() { return getToken(SQLParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DISTINCT() { return getToken(SQLParser.DISTINCT, 0); }
		public RankContext rank() {
			return getRuleContext(RankContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SQLParser.OVER, 0); }
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(SQLParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public GroupConcatContext groupConcat() {
			return getRuleContext(GroupConcatContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(SQLParser.SEPARATOR, 0); }
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionCall);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				((FunctionCallContext)_localctx).name = match(ID);
				setState(358);
				match(T__1);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(359);
					match(DISTINCT);
					}
				}

				setState(362);
				((FunctionCallContext)_localctx).expression = expression(0);
				((FunctionCallContext)_localctx).args.add(((FunctionCallContext)_localctx).expression);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(363);
					match(T__0);
					setState(364);
					((FunctionCallContext)_localctx).expression = expression(0);
					((FunctionCallContext)_localctx).args.add(((FunctionCallContext)_localctx).expression);
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
				match(T__2);
				}
				break;
			case RANK:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				rank();
				setState(373);
				match(T__1);
				setState(374);
				match(T__2);
				setState(375);
				match(OVER);
				setState(376);
				match(T__1);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(377);
					match(PARTITION);
					setState(378);
					match(BY);
					setState(379);
					match(ID);
					}
				}

				setState(382);
				orderByClause();
				setState(383);
				match(T__2);
				}
				break;
			case GROUP_CONCAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				groupConcat();
				setState(386);
				match(T__1);
				setState(387);
				expression(0);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(388);
					match(T__0);
					setState(389);
					expression(0);
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(395);
					orderByClause();
					}
				}

				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATOR) {
					{
					setState(398);
					match(SEPARATOR);
					setState(399);
					match(STRING);
					}
				}

				setState(402);
				match(T__2);
				}
				break;
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				aggregationFunction();
				setState(405);
				match(T__1);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT) {
					{
					setState(406);
					match(DISTINCT);
					}
				}

				setState(409);
				((FunctionCallContext)_localctx).arg = expression(0);
				setState(410);
				match(T__2);
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
	public static class ColumnReferenceContext extends ParserRuleContext {
		public Token table;
		public Token column;
		public List<TerminalNode> ID() { return getTokens(SQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLParser.ID, i);
		}
		public ColumnReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumnReference(this);
		}
	}

	public final ColumnReferenceContext columnReference() throws RecognitionException {
		ColumnReferenceContext _localctx = new ColumnReferenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_columnReference);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(414);
					((ColumnReferenceContext)_localctx).table = match(ID);
					setState(415);
					match(T__16);
					}
					break;
				}
				setState(418);
				((ColumnReferenceContext)_localctx).column = match(ID);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(T__4);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SQLParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(SQLParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 229383L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class AggregationFunctionContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(SQLParser.COUNT, 0); }
		public TerminalNode SUM() { return getToken(SQLParser.SUM, 0); }
		public TerminalNode AVG() { return getToken(SQLParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(SQLParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(SQLParser.MAX, 0); }
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAggregationFunction(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34084860461056L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
	public static class RankContext extends ParserRuleContext {
		public TerminalNode RANK() { return getToken(SQLParser.RANK, 0); }
		public RankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRank(this);
		}
	}

	public final RankContext rank() throws RecognitionException {
		RankContext _localctx = new RankContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rank);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(RANK);
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
	public static class GroupConcatContext extends ParserRuleContext {
		public TerminalNode GROUP_CONCAT() { return getToken(SQLParser.GROUP_CONCAT, 0); }
		public GroupConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupConcat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterGroupConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitGroupConcat(this);
		}
	}

	public final GroupConcatContext groupConcat() throws RecognitionException {
		GroupConcatContext _localctx = new GroupConcatContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_groupConcat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(GROUP_CONCAT);
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
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001I\u01af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003O\b\u0003\n\u0003\f\u0003"+
		"R\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004W\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004`\b\u0004\n\u0004\f\u0004c\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004h\b\u0004\n\u0004\f\u0004k\t\u0004\u0001"+
		"\u0004\u0003\u0004n\b\u0004\u0001\u0004\u0003\u0004q\b\u0004\u0001\u0004"+
		"\u0003\u0004t\b\u0004\u0001\u0004\u0003\u0004w\b\u0004\u0001\u0004\u0003"+
		"\u0004z\b\u0004\u0001\u0004\u0003\u0004}\b\u0004\u0001\u0004\u0003\u0004"+
		"\u0080\b\u0004\u0001\u0005\u0003\u0005\u0083\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u0087\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u008c\b\u0005\n\u0005\f\u0005\u008f\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0094\b\u0005\n\u0005\f\u0005\u0097\t\u0005\u0001"+
		"\u0005\u0003\u0005\u009a\b\u0005\u0001\u0005\u0003\u0005\u009d\b\u0005"+
		"\u0001\u0005\u0003\u0005\u00a0\b\u0005\u0001\u0005\u0003\u0005\u00a3\b"+
		"\u0005\u0001\u0005\u0003\u0005\u00a6\b\u0005\u0001\u0005\u0003\u0005\u00a9"+
		"\b\u0005\u0001\u0005\u0003\u0005\u00ac\b\u0005\u0001\u0005\u0005\u0005"+
		"\u00af\b\u0005\n\u0005\f\u0005\u00b2\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00b8\b\u0006\u0001\u0006\u0003\u0006\u00bb"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00bf\b\u0007\u0001\u0007"+
		"\u0003\u0007\u00c2\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u00ca\b\b\u0001\b\u0003\b\u00cd\b\b\u0003\b\u00cf\b\b\u0001"+
		"\t\u0001\t\u0003\t\u00d3\b\t\u0001\n\u0001\n\u0003\n\u00d7\b\n\u0001\u000b"+
		"\u0003\u000b\u00da\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e7"+
		"\b\f\u0001\r\u0001\r\u0003\r\u00eb\b\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0005\r\u00f2\b\r\n\r\f\r\u00f5\t\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00fa\b\r\n\r\f\r\u00fd\t\r\u0001\r\u0003\r\u0100\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0107\b\u000e\n"+
		"\u000e\f\u000e\u010a\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0114"+
		"\b\u0010\n\u0010\f\u0010\u0117\t\u0010\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u011b\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0121\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0004\u0013\u012f\b\u0013\u000b\u0013\f\u0013\u0130\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u0136\b\u0013\u000b\u0013\f"+
		"\u0013\u0137\u0003\u0013\u013a\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0153\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u015a\b\u0013\n\u0013"+
		"\f\u0013\u015d\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0161\b\u0013"+
		"\n\u0013\f\u0013\u0164\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0169\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u016e"+
		"\b\u0014\n\u0014\f\u0014\u0171\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u017d\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0187\b\u0014\n\u0014\f\u0014\u018a\t\u0014\u0001\u0014\u0003\u0014\u018d"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0191\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0198\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u019d\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01a1\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01a5\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0001&\u001a\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02\u0000\b\u0001\u0000\"#\u0001\u0000\u0005\u0007\u0001"+
		"\u0000\b\t\u0001\u0000\n\u0010\u0001\u0000./\u0002\u00001133\u0002\u0000"+
		"46CE\u0001\u0000(,\u01e4\u00004\u0001\u0000\u0000\u0000\u00027\u0001\u0000"+
		"\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000"+
		"\bV\u0001\u0000\u0000\u0000\n\u0082\u0001\u0000\u0000\u0000\f\u00b5\u0001"+
		"\u0000\u0000\u0000\u000e\u00bc\u0001\u0000\u0000\u0000\u0010\u00ce\u0001"+
		"\u0000\u0000\u0000\u0012\u00d0\u0001\u0000\u0000\u0000\u0014\u00d4\u0001"+
		"\u0000\u0000\u0000\u0016\u00d9\u0001\u0000\u0000\u0000\u0018\u00e6\u0001"+
		"\u0000\u0000\u0000\u001a\u00e8\u0001\u0000\u0000\u0000\u001c\u0101\u0001"+
		"\u0000\u0000\u0000\u001e\u010b\u0001\u0000\u0000\u0000 \u010e\u0001\u0000"+
		"\u0000\u0000\"\u0118\u0001\u0000\u0000\u0000$\u011c\u0001\u0000\u0000"+
		"\u0000&\u0139\u0001\u0000\u0000\u0000(\u019c\u0001\u0000\u0000\u0000*"+
		"\u01a4\u0001\u0000\u0000\u0000,\u01a6\u0001\u0000\u0000\u0000.\u01a8\u0001"+
		"\u0000\u0000\u00000\u01aa\u0001\u0000\u0000\u00002\u01ac\u0001\u0000\u0000"+
		"\u000045\u0003\u0002\u0001\u000056\u0005\u0000\u0000\u00016\u0001\u0001"+
		"\u0000\u0000\u000078\u0003\u0004\u0002\u00008\u0003\u0001\u0000\u0000"+
		"\u00009;\u0005\'\u0000\u0000:<\u0005<\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=B\u0003\u0006"+
		"\u0003\u0000>?\u0005\u0001\u0000\u0000?A\u0003\u0006\u0003\u0000@>\u0001"+
		"\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000EF\u0003\n\u0005\u0000FI\u0001\u0000\u0000\u0000GI\u0003\n\u0005"+
		"\u0000H9\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\u0005\u0001"+
		"\u0000\u0000\u0000JK\u0005B\u0000\u0000KL\u0005$\u0000\u0000LP\u0005\u0002"+
		"\u0000\u0000MO\u0003\b\u0004\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\u0003\u0000\u0000"+
		"T\u0007\u0001\u0000\u0000\u0000UW\u0005A\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0005\u0012"+
		"\u0000\u0000Y[\u0005&\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\a\u0003\f\u0006\u0000]^\u0005"+
		"\u0001\u0000\u0000^`\u0003\f\u0006\u0000_]\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\u0013\u0000"+
		"\u0000ei\u0003\u000e\u0007\u0000fh\u0003\u0016\u000b\u0000gf\u0001\u0000"+
		"\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"ln\u0003\u001a\r\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"np\u0001\u0000\u0000\u0000oq\u0003\u0014\n\u0000po\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rt\u0003\u0012\t\u0000"+
		"sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000"+
		"\u0000uw\u0003\u001c\u000e\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wy\u0001\u0000\u0000\u0000xz\u0003\u001e\u000f\u0000yx\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000"+
		"{}\u0003 \u0010\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~\u0080\u0003$\u0012\u0000\u007f~\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\t\u0001\u0000"+
		"\u0000\u0000\u0081\u0083\u0005A\u0000\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0005\u0012\u0000\u0000\u0085\u0087\u0005&\u0000\u0000"+
		"\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008d\u0003\f\u0006\u0000\u0089"+
		"\u008a\u0005\u0001\u0000\u0000\u008a\u008c\u0003\f\u0006\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u0013\u0000\u0000\u0091\u0095\u0003\u000e\u0007\u0000\u0092\u0094"+
		"\u0003\u0016\u000b\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0098\u009a\u0003\u001a\r\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001"+
		"\u0000\u0000\u0000\u009b\u009d\u0003\u001c\u000e\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0003\u001e\u000f\u0000\u009f\u009e\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\u0003 \u0010\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a6\u0003\u0014\n\u0000\u00a5\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a9\u0003\u0012\t\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ac\u0003$\u0012\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u00b0\u0001\u0000\u0000\u0000\u00ad"+
		"\u00af\u0003\b\u0004\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0004\u0000\u0000\u00b4\u000b"+
		"\u0001\u0000\u0000\u0000\u00b5\u00ba\u0003&\u0013\u0000\u00b6\u00b8\u0005"+
		"$\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005B\u0000"+
		"\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\r\u0001\u0000\u0000\u0000\u00bc\u00c1\u0003\u0010\b\u0000"+
		"\u00bd\u00bf\u0005$\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c2\u0005B\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u000f\u0001\u0000\u0000\u0000\u00c3\u00cf"+
		"\u0005B\u0000\u0000\u00c4\u00cf\u0005C\u0000\u0000\u00c5\u00c6\u0005\u0002"+
		"\u0000\u0000\u00c6\u00c7\u0003\n\u0005\u0000\u00c7\u00cc\u0005\u0003\u0000"+
		"\u0000\u00c8\u00ca\u0005$\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0005B\u0000\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce"+
		"\u00c3\u0001\u0000\u0000\u0000\u00ce\u00c4\u0001\u0000\u0000\u0000\u00ce"+
		"\u00c5\u0001\u0000\u0000\u0000\u00cf\u0011\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d2\u0005=\u0000\u0000\u00d1\u00d3\u0005>\u0000\u0000\u00d2\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u0013\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d6\u0005?\u0000\u0000\u00d5\u00d7\u0005>\u0000"+
		"\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u0015\u0001\u0000\u0000\u0000\u00d8\u00da\u0003\u0018\f\u0000"+
		"\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u001a\u0000\u0000"+
		"\u00dc\u00dd\u0003\u000e\u0007\u0000\u00dd\u00de\u0005\u001b\u0000\u0000"+
		"\u00de\u00df\u0003&\u0013\u0000\u00df\u0017\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e7\u0005\u001c\u0000\u0000\u00e1\u00e7\u0005\u001d\u0000\u0000\u00e2"+
		"\u00e7\u0005\u001e\u0000\u0000\u00e3\u00e4\u0005\u001f\u0000\u0000\u00e4"+
		"\u00e7\u0005 \u0000\u0000\u00e5\u00e7\u0005!\u0000\u0000\u00e6\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e1\u0001\u0000\u0000\u0000\u00e6\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u0019\u0001\u0000\u0000\u0000\u00e8\u00ea\u0005"+
		"\u0014\u0000\u0000\u00e9\u00eb\u00059\u0000\u0000\u00ea\u00e9\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ec\u0100\u0003&\u0013\u0000\u00ed\u00ee\u0005B\u0000\u0000"+
		"\u00ee\u00ef\u00052\u0000\u0000\u00ef\u00f3\u0005\u0002\u0000\u0000\u00f0"+
		"\u00f2\u0003\b\u0004\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f6\u0100\u0005\u0003\u0000\u0000\u00f7\u00fb"+
		"\u0005\u0002\u0000\u0000\u00f8\u00fa\u0003\b\u0004\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0100\u0005"+
		"\u0003\u0000\u0000\u00ff\u00ec\u0001\u0000\u0000\u0000\u00ff\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ff\u00f7\u0001\u0000\u0000\u0000\u0100\u001b\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005\u0015\u0000\u0000\u0102\u0103\u0005"+
		"\u0016\u0000\u0000\u0103\u0108\u0003&\u0013\u0000\u0104\u0105\u0005\u0001"+
		"\u0000\u0000\u0105\u0107\u0003&\u0013\u0000\u0106\u0104\u0001\u0000\u0000"+
		"\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u001d\u0001\u0000\u0000"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0017\u0000"+
		"\u0000\u010c\u010d\u0003&\u0013\u0000\u010d\u001f\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0005\u0018\u0000\u0000\u010f\u0110\u0005\u0016\u0000\u0000"+
		"\u0110\u0115\u0003\"\u0011\u0000\u0111\u0112\u0005\u0001\u0000\u0000\u0112"+
		"\u0114\u0003\"\u0011\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0117"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116!\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0118\u011a\u0003&\u0013\u0000\u0119\u011b\u0007\u0000"+
		"\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000"+
		"\u0000\u0000\u011b#\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0019\u0000"+
		"\u0000\u011d\u0120\u0005D\u0000\u0000\u011e\u011f\u0005I\u0000\u0000\u011f"+
		"\u0121\u0005D\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121%\u0001\u0000\u0000\u0000\u0122\u0123\u0006"+
		"\u0013\uffff\uffff\u0000\u0123\u0124\u0005\u0002\u0000\u0000\u0124\u0125"+
		"\u0003&\u0013\u0000\u0125\u0126\u0005\u0003\u0000\u0000\u0126\u013a\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u00050\u0000\u0000\u0128\u013a\u0003&\u0013"+
		"\r\u0129\u013a\u0003(\u0014\u0000\u012a\u013a\u0003*\u0015\u0000\u012b"+
		"\u013a\u0003,\u0016\u0000\u012c\u012e\u0005\u0002\u0000\u0000\u012d\u012f"+
		"\u0003\b\u0004\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001"+
		"\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0005"+
		"\u0003\u0000\u0000\u0133\u013a\u0001\u0000\u0000\u0000\u0134\u0136\u0003"+
		"\b\u0004\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0122\u0001\u0000"+
		"\u0000\u0000\u0139\u0127\u0001\u0000\u0000\u0000\u0139\u0129\u0001\u0000"+
		"\u0000\u0000\u0139\u012a\u0001\u0000\u0000\u0000\u0139\u012b\u0001\u0000"+
		"\u0000\u0000\u0139\u012c\u0001\u0000\u0000\u0000\u0139\u0135\u0001\u0000"+
		"\u0000\u0000\u013a\u0162\u0001\u0000\u0000\u0000\u013b\u013c\n\f\u0000"+
		"\u0000\u013c\u013d\u0007\u0001\u0000\u0000\u013d\u0161\u0003&\u0013\r"+
		"\u013e\u013f\n\u000b\u0000\u0000\u013f\u0140\u0007\u0002\u0000\u0000\u0140"+
		"\u0161\u0003&\u0013\f\u0141\u0142\n\n\u0000\u0000\u0142\u0143\u0007\u0003"+
		"\u0000\u0000\u0143\u0161\u0003&\u0013\u000b\u0144\u0145\n\t\u0000\u0000"+
		"\u0145\u0146\u0007\u0004\u0000\u0000\u0146\u0161\u0003&\u0013\n\u0147"+
		"\u0148\n\b\u0000\u0000\u0148\u0149\u0007\u0005\u0000\u0000\u0149\u0161"+
		"\u0003&\u0013\t\u014a\u014b\n\u0006\u0000\u0000\u014b\u014c\u00057\u0000"+
		"\u0000\u014c\u014d\u0003&\u0013\u0000\u014d\u014e\u0005.\u0000\u0000\u014e"+
		"\u014f\u0003&\u0013\u0007\u014f\u0161\u0001\u0000\u0000\u0000\u0150\u0152"+
		"\n\u0007\u0000\u0000\u0151\u0153\u00050\u0000\u0000\u0152\u0151\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u00052\u0000\u0000\u0155\u0156\u0005\u0002"+
		"\u0000\u0000\u0156\u015b\u0003&\u0013\u0000\u0157\u0158\u0005\u0001\u0000"+
		"\u0000\u0158\u015a\u0003&\u0013\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000"+
		"\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0003\u0000\u0000"+
		"\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u013b\u0001\u0000\u0000\u0000"+
		"\u0160\u013e\u0001\u0000\u0000\u0000\u0160\u0141\u0001\u0000\u0000\u0000"+
		"\u0160\u0144\u0001\u0000\u0000\u0000\u0160\u0147\u0001\u0000\u0000\u0000"+
		"\u0160\u014a\u0001\u0000\u0000\u0000\u0160\u0150\u0001\u0000\u0000\u0000"+
		"\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0001\u0000\u0000\u0000\u0163\'\u0001\u0000\u0000\u0000\u0164"+
		"\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0005B\u0000\u0000\u0166\u0168"+
		"\u0005\u0002\u0000\u0000\u0167\u0169\u0005&\u0000\u0000\u0168\u0167\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u016f\u0003&\u0013\u0000\u016b\u016c\u0005\u0001"+
		"\u0000\u0000\u016c\u016e\u0003&\u0013\u0000\u016d\u016b\u0001\u0000\u0000"+
		"\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0172\u0001\u0000\u0000"+
		"\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0003\u0000"+
		"\u0000\u0173\u019d\u0001\u0000\u0000\u0000\u0174\u0175\u00030\u0018\u0000"+
		"\u0175\u0176\u0005\u0002\u0000\u0000\u0176\u0177\u0005\u0003\u0000\u0000"+
		"\u0177\u0178\u0005:\u0000\u0000\u0178\u017c\u0005\u0002\u0000\u0000\u0179"+
		"\u017a\u0005;\u0000\u0000\u017a\u017b\u0005\u0016\u0000\u0000\u017b\u017d"+
		"\u0005B\u0000\u0000\u017c\u0179\u0001\u0000\u0000\u0000\u017c\u017d\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0003"+
		" \u0010\u0000\u017f\u0180\u0005\u0003\u0000\u0000\u0180\u019d\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u00032\u0019\u0000\u0182\u0183\u0005\u0002\u0000"+
		"\u0000\u0183\u0188\u0003&\u0013\u0000\u0184\u0185\u0005\u0001\u0000\u0000"+
		"\u0185\u0187\u0003&\u0013\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187"+
		"\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0001\u0000\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a"+
		"\u0188\u0001\u0000\u0000\u0000\u018b\u018d\u0003 \u0010\u0000\u018c\u018b"+
		"\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0190"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0005@\u0000\u0000\u018f\u0191\u0005"+
		"C\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0005\u0003"+
		"\u0000\u0000\u0193\u019d\u0001\u0000\u0000\u0000\u0194\u0195\u0003.\u0017"+
		"\u0000\u0195\u0197\u0005\u0002\u0000\u0000\u0196\u0198\u0005&\u0000\u0000"+
		"\u0197\u0196\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0003&\u0013\u0000\u019a"+
		"\u019b\u0005\u0003\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c"+
		"\u0165\u0001\u0000\u0000\u0000\u019c\u0174\u0001\u0000\u0000\u0000\u019c"+
		"\u0181\u0001\u0000\u0000\u0000\u019c\u0194\u0001\u0000\u0000\u0000\u019d"+
		")\u0001\u0000\u0000\u0000\u019e\u019f\u0005B\u0000\u0000\u019f\u01a1\u0005"+
		"\u0011\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a5\u0005"+
		"B\u0000\u0000\u01a3\u01a5\u0005\u0005\u0000\u0000\u01a4\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5+\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0007\u0006\u0000\u0000\u01a7-\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0007\u0007\u0000\u0000\u01a9/\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u0005%\u0000\u0000\u01ab1\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005"+
		"-\u0000\u0000\u01ad3\u0001\u0000\u0000\u0000?;BHPVZaimpsvy|\u007f\u0082"+
		"\u0086\u008d\u0095\u0099\u009c\u009f\u00a2\u00a5\u00a8\u00ab\u00b0\u00b7"+
		"\u00ba\u00be\u00c1\u00c9\u00cc\u00ce\u00d2\u00d6\u00d9\u00e6\u00ea\u00f3"+
		"\u00fb\u00ff\u0108\u0115\u011a\u0120\u0130\u0137\u0139\u0152\u015b\u0160"+
		"\u0162\u0168\u016f\u017c\u0188\u018c\u0190\u0197\u019c\u01a0\u01a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}