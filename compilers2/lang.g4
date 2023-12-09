grammar lang;

program     : 'begin' stat+ 'end' ;
stat    : assign
	    | add 
	    | sub 
	    | print
	    | input
	    | multiply
	    | divide
	    | power
	    | max
	    | min
	    ;

min         : ID '= min(' (ID | NUM) ',' (ID | NUM) ')';
max         : ID '= max(' (ID | NUM) ',' (ID | NUM) ')';
power       : ID 'to the power of' (ID | NUM);
divide      : 'divide' ID 'by' (ID | NUM);
multiply    : 'multiply' ID 'by' (ID | NUM);
input       : 'input(' ID ')';
assign      : 'let' ID 'be' (ID | NUM) ;
add         : 'add' (NUM | ID) 'to' ID;
sub         : 'sub' (NUM | ID) 'from' ID;

print       : 'print' (NUM | ID);

ID  :   [a-z]+ ;
NUM :   [0-9]+ ;
WS  :   [ \r\t\n]+ -> skip;


