// Generated from Calculator.g4 by ANTLR 4.4
package com.kobe.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code multipleExpression}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleExpression(@NotNull CalculatorParser.MultipleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddOrSubstract}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOrSubstract(@NotNull CalculatorParser.AddOrSubstractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull CalculatorParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(@NotNull CalculatorParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultipleOrDivided}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleOrDivided(@NotNull CalculatorParser.MultipleOrDividedContext ctx);
}