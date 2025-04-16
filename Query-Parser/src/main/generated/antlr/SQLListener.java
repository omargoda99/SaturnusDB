// Generated from ./src/SQL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SQLParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SQLParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dml}.
	 * @param ctx the parse tree
	 */
	void enterDml(SQLParser.DmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dml}.
	 * @param ctx the parse tree
	 */
	void exitDml(SQLParser.DmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SQLParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SQLParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cte}.
	 * @param ctx the parse tree
	 */
	void enterCte(SQLParser.CteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cte}.
	 * @param ctx the parse tree
	 */
	void exitCte(SQLParser.CteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_statement1}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement1(SQLParser.Select_statement1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_statement1}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement1(SQLParser.Select_statement1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_statement2}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement2(SQLParser.Select_statement2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_statement2}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement2(SQLParser.Select_statement2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectItem(SQLParser.SelectItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectItem(SQLParser.SelectItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void enterTableExpression(SQLParser.TableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void exitTableExpression(SQLParser.TableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(SQLParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(SQLParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#intersectClause}.
	 * @param ctx the parse tree
	 */
	void enterIntersectClause(SQLParser.IntersectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#intersectClause}.
	 * @param ctx the parse tree
	 */
	void exitIntersectClause(SQLParser.IntersectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void enterUnionClause(SQLParser.UnionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void exitUnionClause(SQLParser.UnionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(SQLParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(SQLParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#joinTypeSpec}.
	 * @param ctx the parse tree
	 */
	void enterJoinTypeSpec(SQLParser.JoinTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#joinTypeSpec}.
	 * @param ctx the parse tree
	 */
	void exitJoinTypeSpec(SQLParser.JoinTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SQLParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SQLParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SQLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SQLParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SQLParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SQLParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(SQLParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(SQLParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SQLParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SQLParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SQLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SQLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnReference}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SQLParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnReference}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SQLParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SQLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SQLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(SQLParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(SQLParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rank}.
	 * @param ctx the parse tree
	 */
	void enterRank(SQLParser.RankContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rank}.
	 * @param ctx the parse tree
	 */
	void exitRank(SQLParser.RankContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupConcat}.
	 * @param ctx the parse tree
	 */
	void enterGroupConcat(SQLParser.GroupConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupConcat}.
	 * @param ctx the parse tree
	 */
	void exitGroupConcat(SQLParser.GroupConcatContext ctx);
}