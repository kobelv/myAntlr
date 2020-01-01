grammar Calculator;

formula
	: expression
	;
	
expression
	: expression (MUL|DIV) expression	# MultipleOrDivided
	| expression (ADD|SUB) expression	# AddOrSubstract
	| '(' expression ')'	# multipleExpression
	| ID			# Identifier
	;

ADD	: '+';
SUB	: '-';
MUL	: '*';
DIV	: '/';

ID : Digit*;

fragment Digit : '0'..'9'; 

WS : [ \t\n\r]+ -> skip ;
