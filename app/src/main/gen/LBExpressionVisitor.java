// Generated from /Users/kazuakiurayama/github/littlebasic/app/src/main/antlr/basic/LBExpression.g4 by ANTLR 4.13.1

package basic;


    package basic;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LBExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LBExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LBExpressionParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LBExpressionParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LBExpressionParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LBExpressionParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(LBExpressionParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(LBExpressionParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(LBExpressionParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(LBExpressionParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(LBExpressionParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(LBExpressionParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(LBExpressionParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(LBExpressionParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpExpr(LBExpressionParser.ExpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(LBExpressionParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(LBExpressionParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(LBExpressionParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LBExpressionParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(LBExpressionParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LBExpressionParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LBExpressionParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LBExpressionParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LBExpressionParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LBExpressionParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LBExpressionParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LBExpressionParser#lenfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLenfunc(LBExpressionParser.LenfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LBExpressionParser#valfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValfunc(LBExpressionParser.ValfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LBExpressionParser#isnanfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsnanfunc(LBExpressionParser.IsnanfuncContext ctx);
}