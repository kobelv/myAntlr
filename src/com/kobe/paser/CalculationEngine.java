package com.kobe.paser;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.kobe.grammar.CalculatorLexer;
import com.kobe.grammar.CalculatorParser;

public class CalculationEngine {
	
	private CalculatorLexer lexer;
	private CalculatorParser parser;
	
	public String parse(String formular){
		String pasredFormular = null;	
		lexer = new CalculatorLexer(new ANTLRInputStream(formular));
				
		parser = new CalculatorParser(new CommonTokenStream(lexer));
		CalculationListener listener = new CalculationListener();
		parser.removeParseListeners();
		parser.addParseListener(listener);		
		pasredFormular = parser.formula().getText();
		System.out.println(listener.getResult());
		return pasredFormular;
	}
	
	public static void main(String[] args){
		System.out.println(new CalculationEngine().parse("100/10-(1+5)*7-9"));
	}
	
}
