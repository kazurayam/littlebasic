// Generated from /Users/kazuakiurayama/github/littlebasic/app/src/main/antlr/basic/LBExpression.g4 by ANTLR 4.13.1

package basic;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LBExpressionParser}.
 */
public interface LBExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LBExpressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LBExpressionParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LBExpressionParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LBExpressionParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LBExpressionParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LBExpressionParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LBExpressionParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LBExpressionParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LBExpressionParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LBExpressionParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(LBExpressionParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(LBExpressionParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(LBExpressionParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(LBExpressionParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(LBExpressionParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(LBExpressionParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(LBExpressionParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(LBExpressionParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(LBExpressionParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(LBExpressionParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(LBExpressionParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(LBExpressionParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(LBExpressionParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(LBExpressionParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpExpr(LBExpressionParser.ExpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpExpr(LBExpressionParser.ExpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(LBExpressionParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(LBExpressionParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(LBExpressionParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(LBExpressionParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LBExpressionParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link LBExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LBExpressionParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LBExpressionParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(LBExpressionParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LBExpressionParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(LBExpressionParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LBExpressionParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LBExpressionParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LBExpressionParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LBExpressionParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LBExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LBExpressionParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LBExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LBExpressionParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LBExpressionParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(LBExpressionParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LBExpressionParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(LBExpressionParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LBExpressionParser#lenfunc}.
	 * @param ctx the parse tree
	 */
	void enterLenfunc(LBExpressionParser.LenfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LBExpressionParser#lenfunc}.
	 * @param ctx the parse tree
	 */
	void exitLenfunc(LBExpressionParser.LenfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LBExpressionParser#valfunc}.
	 * @param ctx the parse tree
	 */
	void enterValfunc(LBExpressionParser.ValfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LBExpressionParser#valfunc}.
	 * @param ctx the parse tree
	 */
	void exitValfunc(LBExpressionParser.ValfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LBExpressionParser#isnanfunc}.
	 * @param ctx the parse tree
	 */
	void enterIsnanfunc(LBExpressionParser.IsnanfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LBExpressionParser#isnanfunc}.
	 * @param ctx the parse tree
	 */
	void exitIsnanfunc(LBExpressionParser.IsnanfuncContext ctx);
}