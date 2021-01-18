lexer grammar gramaticaLexer;

// Palabras clave/reservadas
PCLAVE_ALGORITMO: 'Algoritmo' ;
PCLAVE_DEFINIR: 'Definir'|'definir'|'DefiniR'|'DeFiNIr' ;
PCLAVE_COMO: 'Como' ;
PCLAVE_LEER: 'Leer' ;
PCLAVE_ESCRIBIR: 'Escribir' ;
PCLAVE_SI: 'Si' ;
PCLAVE_SINO: 'SiNo' ;
PCLAVE_ENTONCES: 'Entonces' ;
PCLAVE_FINSI: 'FinSi'|'Fin Si' ;
PCLAVE_PARA: 'Para' ;
PCLAVE_HASTA: 'Hasta'|'hasta' ;
PCLAVE_PASO: 'con paso' ;
PCLAVE_HACER: 'Hacer' ;
PCLAVE_FINPARA: 'FinPara' ;
PCLAVE_MIENTRAS: 'Mientras' ;
PCLAVE_FINMIENTRAS: 'FinMientras'|'Fin Mientras' ;
PCLAVE_REPETIR: 'Repetir' ;
PCLAVE_HASTAQUE: 'Hasta Que' ;
PCLAVE_SEGUN: 'Segun' ;
PCLAVE_DEOTROMODO: 'De Otro Modo' ;
PCLAVE_FINSEGUN: 'FinSegun' ;
PCLAVE_FINALGORITMO: 'FinAlgoritmo' ;
PCLAVE_FUNCION: 'Funcion' ;
PCLAVE_FINFUNCION: 'FinFuncion'|'Fin Funcion' ;
VERDADERO: 'Verdadero' ;
FALSO: 'Falso' ;

// Tipos de Datos
CARACTER: 'Caracter' ;
ENTERO: 'Entero' ;
REAL: 'Real' ;
LOGICO: 'Logico' ;
DIMENSION: 'Dimension'|'dimension'|'DiMeNsIOn' ;

// Tipos PRIMITIVOS de Datos
INT: DIGITO+ ;
FLOAT: DIGITO '.' DIGITO+ ;
IDENTIFICADOR: CHAR (CHAR|DIGITO)* ; // "Cadena de caracteres" ()
fragment CHAR: [A-Za-z0-9_-]+ ;
fragment DIGITO: [0-9]+ ;

// Signos de Puntuación
PI: '(' ;
PD: ')' ;
CI: '[' ;
CD: ']' ;
FIN: ';' ;
COMA: ',' ;
DOS_PUNTOS: ':' ;

// Operadores
ASIGNACION: '<-' ;
MENOR_QUE: '<' ;
MAYOR_QUE: '>' ;
IGUAL_QUE: '=' ;
DISTINTO_QUE: '<>' | '!=' ;
MAYOR_IGUAL_QUE: '>=' ;
MENOR_IGUAL_QUE: '<=' ;
AND: '&' | 'Y' ; 
OR: 'O' | '|' ;
SUMA: '+' ;
RESTA: '-' ;
MULTIPLICACION: '*' ;
DIVISION: '/' ;
POTENCIA: '^' ;

// Cadenas de Caracteres
CADENA_CARACTERES: (('"' (ESC|.)*? '"')|('\'' (ESC|.)*? '\'')) ; 
fragment ESC: '\\'[btnr"\\]; // \b \t \n \r \" \\;

TERMINAL: [\r\n]+ ;

// Espacios en blanco, Tabuladores...
WS: ' ' -> skip; 
SALTO: [\t\n\r]+ -> skip;

COMENTARIOABRIR: '/**' -> pushMode(COMENTARIO_MULTILINEA_MODE);
COMENTARIOLINEA: '//' -> pushMode(COMENTARIO_LINEA_MODE);

mode COMENTARIO_MULTILINEA_MODE;
COMENTARIOCERRAR: '**/' ->popMode;
TEXTOCOMENTARIOML: .+?;

mode COMENTARIO_LINEA_MODE;
FINAL_COMENTARIO_UL: '\r\n'->popMode;
TEXTOCOMENTARIOUL: .+?;