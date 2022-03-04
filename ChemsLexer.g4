lexer grammar ChemsLexer;


// Tokens

PRINTLN:  'println';
P_NUMBER:   'number';
P_STRING:   'string';
P_IF:       'if';
P_ELSE:       'else';
P_WHILE:      'while';
P_POW:       'pow';
P_POWF:       'powf';
P_I64:       'i64';
P_F64:       'f64';
P_LET:       'let';
P_MUT:       'mut';
P_AS:         'as';
P_TRUE:         'true';
P_FALSE:         'false';
P_MATCH:         'match';
P_LOOP:           'loop';
P_ABS:           'abs';
P_SQRT:           'sqrt';
P_TOSTRING:           'to_string';
P_CLONE:           'clone';

NUMBER: [0-9]+;
DECIMAL: [0-9]+'.'[0-9]+;
STRING: '"'~["]*'"';
ID: ([a-zA-Z_])[a-zA-Z0-9_]*;

PUNTO:          '.';
PTCOMA:         ';';
COMA:           ',';
DOSPUNTOS:      ':';
DIFERENTE:      '!';
DIFERENTEDE:    '!=';
IGUAL:          '=';
IGUALIGUA:      '==';
MAYORIGUAL:     '>=';
MENORIGUAL:     '<=';
MAYOR:          '>';
MENOR:          '<';
MUL:            '*';
DIV:            '/';
MODULO:         '%';
ADD:            '+';
SUB:            '-';
PARIZQ:         '(';
PARDER:         ')';
LLAVEIZQ:       '{';
LLAVEDER:       '}';
CORIZQ:         '[';
CORDER:         ']';
OR:             '||';
AND:            '&&';



MULTICOMENT: [/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]-> skip;
WHITESPACE: [ \\\r\n\t]+ -> skip;

fragment
ESC_SEQ
    :   '\\' ('\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')
    ;

