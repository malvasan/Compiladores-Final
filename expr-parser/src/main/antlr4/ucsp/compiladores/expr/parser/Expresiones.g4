grammar Expresiones;

programa  :   (NL)* decl (decl)*;//

decl  : funcion | global;//*

nl    : NL NL*;//*

global  :  declvar nl;//*

funcion  :  'fun' id '(' params ')' (':' tipo)? nl bloque 'end' nl; //*

id : ID;//*

bloque  :  ( declvar nl )* ( comando nl )*;//*

params     :  /*vacio*/ | parametro ( ',' parametro )*;//*

parametro  : ID ':' tipo;//*

tipo      : tipobase | '[' ']' tipo;//*

tipobase   :  'int' | 'bool' | 'char' | 'string';//*

declvar    :  ID ':' tipo;//

comando    :  cmdif | cmdwhile | cmdasign | cmdreturn | llamada;//*

cmdif     :  'if' exp nl bloque ( 'else' 'if' exp nl bloque )* ( 'else' nl bloque )? 'end';//*

cmdwhile   : 'while' exp nl bloque 'loop';//*

cmdasign   : var '=' exp;//

llamada   :  ID '(' listaexp ')';//*

listaexp  : /*vacio*/ | exp ( ',' exp )*;//*

cmdreturn : 'return' exp | 'return';//*

var       : ID | var '[' exp ']';//*

exp       :  LITNUMERAL                 //

          | LITSTRING

          | TRUE

          | FALSE

          | var

          | 'new' '[' exp ']' tipo

          | '(' exp ')'

          | llamada

          | exp '+' exp

          | exp '-' exp

          | exp '*' exp

          | exp '/' exp

          | exp '>' exp

          | exp '<' exp

          | exp '>=' exp

          | exp '<=' exp

          | exp '=' exp

          | exp '<>' exp

          | exp 'and' exp

          | exp 'or' exp

          | 'not' exp

          | '-' exp;

IF: 'if'; 
ELSE : 'else' ;
END : 'end' ;
WHILE : 'while'; 
LOOP : 'loop' ;
FUN : 'fun' ;
RETURN : 'return'; 
NEW : 'new' ;
STRING : 'string' ;
INT : 'int' ;
CHAR : 'char' ;
BOOL : 'bool'  ;
AND : 'and' ;
OR : 'or' ;
NOT : 'not';

TRUE : 'true';
FALSE : 'false';

ParentesisIzquierdo : '(';
ParentesisDerecho : ')';
DosPuntos : ':';
Coma : ',';

Menor : '<';
MenorIgual : '<=';
Mayor : '>';
MayorIgual : '>=';
Asignar : '=';
NoIgual : '<>';

CorcheteIzquierdo : '[';
CorcheteDerecho: ']';

Mas : '+';
Menos : '-';
Multiplicacion : '*';
Division : '/';

ID:   IdentifierNondigit
        (   IdentifierNondigit
        |   Digit
        )*
    ;

fragment
IdentifierNondigit
    :   Nondigit
    //|   // other implementation-defined characters...
    ;
fragment
Nondigit
    :   [a-zA-Z_]
    ;
fragment
UniversalCharacterName
    :   '\\u' HexQuad
    |   '\\U' HexQuad HexQuad
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
HexadecimalDigit
    :   [0-9a-fA-F]
    ;

fragment
Digit
    :   [0-9]
    ;
fragment
HexadecimalPrefix
    :   '0' [xX]
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

LITNUMERAL
    :   IntegerConstant
    ;
fragment
IntegerConstant
    :   DecimalConstant 
    |   HexadecimalConstant 
    ;

fragment
DecimalConstant
    :   NonzeroDigit Digit*
    ;

fragment
HexadecimalConstant
    :   HexadecimalPrefix HexadecimalDigit+
    ;

fragment
HexQuad
    :   HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit
    ;

fragment
EscapeSequence
    :   SimpleEscapeSequence
    |   OctalEscapeSequence
    |   HexadecimalEscapeSequence
    |   UniversalCharacterName
    ;
fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;
fragment
OctalEscapeSequence
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' OctalDigit OctalDigit OctalDigit
    ;
fragment
HexadecimalEscapeSequence
    :   '\\x' HexadecimalDigit+
    ;
LITSTRING
    :   EncodingPrefix? '"' SCharSequence? '"'
    ;
fragment
EncodingPrefix
    :   'u8'
    |   'u'
    |   'U'
    |   'L'
    ;
fragment
SCharSequence
    :   SChar+
    ;
fragment
SChar
    :   ~["\\\t\n]
    |   EscapeSequence
    |   '\\\n'   // Added line
    |   '\\\t\n' // Added line
    ;

BlockComment:   '/*' .*? '*/'

|'//' ~[\r\n]*;

Espacio
    :   [ \t]+
        -> skip
    ;

NL
    :   (   '\r' '\n'?
        |   '\n'
        )
        
    ;


