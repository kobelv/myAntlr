package com.kobe.paser;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.kobe.grammar.CalculatorListener;
import com.kobe.grammar.CalculatorParser.AddOrSubstractContext;
import com.kobe.grammar.CalculatorParser.FormulaContext;
import com.kobe.grammar.CalculatorParser.IdentifierContext;
import com.kobe.grammar.CalculatorParser.MultipleExpressionContext;
import com.kobe.grammar.CalculatorParser.MultipleOrDividedContext;

public class CalculationListener implements CalculatorListener {

	private Stack<Double>       stack  = new Stack<Double>();
	private Double ret;
	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMultipleExpression(MultipleExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMultipleExpression(MultipleExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAddOrSubstract(AddOrSubstractContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAddOrSubstract(AddOrSubstractContext ctx) {
		Double op1 = stack.pop();
        Double op2 = stack.pop();
        String op = ctx.getChild(1).getText();
        if ("-".equals(op)) {
            stack.push(op2 - op1);
        } else if ("+".equals(op)) {
            stack.push(op2 + op1);
        }
		
	}

	@Override
	public void enterIdentifier(IdentifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitIdentifier(IdentifierContext ctx) {
		stack.push(Double.valueOf(ctx.ID().getText()));
		
	}

	@Override
	public void enterFormula(FormulaContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFormula(FormulaContext ctx) {
		ret = stack.pop();		
	}
	public Double getResult()
    {
        return this.ret;
    }

	@Override
	public void enterMultipleOrDivided(MultipleOrDividedContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMultipleOrDivided(MultipleOrDividedContext ctx) {
		Double op1 = stack.pop();
        Double op2 = stack.pop();
        String op = ctx.getChild(1).getText();
        if ("/".equals(op)) {
            stack.push(op2 / op1);
        } else if ("*".equals(op)) {
            stack.push(op2 * op1);
        }
		
	}

}
