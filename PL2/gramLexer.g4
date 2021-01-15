lexer grammar gramLexer;

// Palabras clave/reservadas
KEYWORD_ALGORITMO: 'Algoritmo' ;
KEYWORD_DEFINIR: 'Definir'|'definir' ;
KEYWORD_COMO: 'Como' ;
KEYWORD_LEER: 'Leer' ;
KEYWORD_ESCRIBIR: 'Escribir' ;
KEYWORD_SI: 'Si' ;
KEYWORD_SINO: 'SiNo';
KEYWORD_ENTONCES: 'Entonces';
KEYWORD_FINSI: 'FinSi';
KEYWORD_PARA: 'Para' ;
KEYWORD_HASTA: 'Hasta' ;
KEYWORD_HACER: 'Hacer' ;
KEYWORD_FINPARA: 'FinPara' ;
KEYWORD_MIENTRAS: 'Mientras' ;
KEYWORD_FINMIENTRAS: 'FinMientras' ;
KEYWORD_REPETIR: 'Repetir' ;
KEYWORD_HASTAQUE: 'Hasta Que' ;
KEYWORD_SEGUN: 'Segun' ;
KEYWORD_DEOTROMODO: 'De Otro Modo' ;
KEYWORD_FINSEGUN: 'FinSegun' ;
KEYWORD_FINALGORITMO: 'FinAlgoritmo' ;
KEYWORD_FUNCION: 'Funcion' ;
KEYWORD_FINFUNCION: 'FinFuncion' ;
VERDADERO: 'Verdadero' ;
FALSO: 'Falso' ;


// Tipos de datos
CARACTER: 'Caracter' ;
ENTERO: 'Entero' ;
REAL: 'Real' ;
LOGICO: 'Logico' ;
DIMENSION: 'Dimension' ;

// Tipos primitivos de datos
INT: DIGITO+ ;
FLOAT: DIGITO '.' DIGITO+ ;
IDENTIFICADOR: CHAR (CHAR|DIGITO)* ; // "Cadena de caracteres" ()
fragment CHAR: [A-Za-z0-9_-]+ ;
fragment DIGITO: [0-9]+ ;

// Signos de puntuación
PA: '(' ; // paréntesis abierto
PC: ')' ; // paréntesis cerrado
CA: '[' ; // corchete abierto
CC: ']' ; // corchete cerrado
FIN: ';' ;
COMA: ',' ;
DOS_PUNTOS: ':' ;

// Operadores
ASIGNACION: '<-' ;
MENOR: '<' ;
MAYOR: '>' ;
IGUAL: '=' ;
SUMA: '+' ;
RESTA: '-' ;

// Cadenas de caracteres
CADENA_CARACTERES: (('"' (ESC|.)*? '"')|('\'' (ESC|.)*? '\'')); 
fragment ESC: '\\'[btnr"\\]; // \b \t \n \r \" \\;

TERMINAL: [\r\n]+ ;

// Espacios en blanco, tabuladores...
WS:[ \t\n\r]+ -> skip; //tiene que ser la ultima regla

COMENTARIOABRIR: '/**' -> pushMode(COMENTARIO_MULTILINEA_MODE);
COMENTARIOLINEA: '//' -> pushMode(COMENTARIO_LINEA_MODE);

// Comentarios
mode COMENTARIO_MULTILINEA_MODE;
COMENTARIOCERRAR: '**/' ->popMode;
TEXTOCOMENTARIOML: .+?;

mode COMENTARIO_LINEA_MODE;
FINAL_COMENTARIO_UL: '\r\n'->popMode;
TEXTOCOMENTARIOUL: .+?;