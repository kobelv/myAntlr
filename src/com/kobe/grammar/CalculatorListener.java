// Generated from Calculator.g4 by ANTLR 4.4
package com.kobe.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code multipleExpression}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultipleExpression(@NotNull CalculatorParser.MultipleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleExpression}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultipleExpression(@NotNull CalculatorParser.MultipleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddOrSubstract}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSubstract(@NotNull CalculatorParser.AddOrSubstractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddOrSubstract}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSubstract(@NotNull CalculatorParser.AddOrSubstractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull CalculatorParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull CalculatorParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(@NotNull CalculatorParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(@NotNull CalculatorParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultipleOrDivided}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultipleOrDivided(@NotNull CalculatorParser.MultipleOrDividedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultipleOrDivided}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultipleOrDivided(@NotNull CalculatorParser.MultipleOrDividedContext ctx);
}