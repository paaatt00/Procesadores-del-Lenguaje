parser grammar gramParser;

options {
    tokenVocab = gramLexer;
    language = Java;
}

prog: ((algoritmo|funcion|comentario) TERMINAL)*;

// PALABRAS CLAVE / RESERVADAS
kw_algoritmo: KEYWORD_ALGORITMO ;
kw_finalgoritmo: KEYWORD_FINALGORITMO ;
kw_definir: KEYWORD_DEFINIR ;
kw_como: KEYWORD_COMO ;
kw_leer: KEYWORD_LEER ;
kw_escribir: KEYWORD_ESCRIBIR ;
kw_si: KEYWORD_SI ;
kw_sino: KEYWORD_SINO ;
kw_entonces: KEYWORD_ENTONCES ;
kw_finsi: KEYWORD_FINSI ;
kw_para: KEYWORD_PARA ;
kw_hasta: KEYWORD_HASTA ;
kw_hacer: KEYWORD_HACER ;
kw_finpara: KEYWORD_FINPARA ;
kw_mientras: KEYWORD_MIENTRAS ;
kw_finmientras: KEYWORD_FINMIENTRAS ;
kw_repetir: KEYWORD_REPETIR ;
kw_hastaque: KEYWORD_HASTAQUE ;
kw_segun: KEYWORD_SEGUN ;
kw_deotromodo: KEYWORD_DEOTROMODO ;
kw_finsegun: KEYWORD_FINSEGUN ;
kw_funcion: KEYWORD_FUNCION ;
kw_finfuncion: KEYWORD_FINFUNCION ;
kw_dimension: DIMENSION ;

// TIPOS DE DATOS

tipo_de_datos: CARACTER
             | ENTERO
             | REAL
             | LOGICO
             ;

numero: INT | FLOAT ;
identificador: IDENTIFICADOR ;

var: identificador
   | CADENA_CARACTERES
   ;

// OPERACIONES Y OPERADORES

op_menor: MENOR ;
op_mayor: MAYOR ;
op_igual: IGUAL ;
op_asignacion: ASIGNACION ;
op_suma: SUMA ;
op_resta: RESTA ;

comparacion:  op_menor
            | op_mayor
            | op_igual
            ;

operador: op_asignacion
        | op_suma
        | condicion_logica
        | comparacion
        ;

condicion_logica: (VERDADERO | FALSO) ;

operacion_logica: (var|numero) (comparacion|op_igual) (var|numero) ;

operacion: (var|numero) operador (var|numero) ;

// SIGNOS DE PUNTUACIÓN

fin: FIN ;
coma: COMA ;
dos_puntos: DOS_PUNTOS ;
parentesis_izq: PA ;
parentesis_der: PC ;
corchete_izq: CA ;
corchete_der: CC ;

signo_puntuacion: parentesis_izq
                | parentesis_der
                | fin
                | coma
                | dos_puntos
                | corchete_izq
                | corchete_der
                ;

// Asignación de variables, lectura, escritura, definición
asignacion: var op_asignacion (numero|var|CADENA_CARACTERES|operacion) ;
escritura: kw_escribir (CADENA_CARACTERES|llamada_funcion|var) ((SUMA|COMA) (var|CADENA_CARACTERES|llamada_funcion))* (signo_puntuacion)? ;
lectura: kw_leer var ;
definicion: kw_definir var kw_como tipo_de_datos (signo_puntuacion)?;


// TIPOS DE PARÁMETROS: declaración de funciones, llamadas a funciones, llamadas a bucles
parametros_bucle: (condicion_logica | (var comparacion var)) ;
parametros_DF: (tipo_de_datos var (coma tipo_de_datos var)*)+ ;
parametros_LF: (var (coma var)*) ;

parametros: parametros_bucle
          | parametros_DF
          | parametros_LF
          ;

// CONDICION

condicion_si: cabecera_si cuerpo_si;
cabecera_si: kw_si operacion_logica kw_entonces ;
cuerpo_si: (escritura|condicion_si) (kw_sino (escritura|condicion_si)* kw_finsi);


// BUCLES (mientras, para, repetir)

bucle: bucle_mientras
     | bucle_para
     | bucle_repetir
     ;

        // Bucle mientras

bucle_mientras: cabecera_mientras cuerpo_mientras ;
cabecera_mientras: kw_mientras operacion_logica kw_hacer ;
cuerpo_mientras: (escritura|asignacion)+ kw_finmientras ;

        // Bucle para

bucle_para: cabecera_para cuerpo_para ;
cabecera_para: kw_para asignacion kw_hasta numero kw_hacer ;
cuerpo_para: (escritura|asignacion)+ kw_finpara ;

        // Bucle repetir        

bucle_repetir: cabecera_repetir cuerpo_repetir condicion_repetir ;
cabecera_repetir: kw_repetir ;
cuerpo_repetir: (escritura|asignacion)+ ;
condicion_repetir: kw_hastaque operacion_logica  ;

// SEGUN

segun: cabecera_segun tipo_segun ;
cabecera_segun: kw_segun var kw_hacer ;
tipo_segun: ((var|CADENA_CARACTERES|numero) dos_puntos cuerpo_segun)+ (tipo_deotromodo)? ;
tipo_deotromodo: kw_deotromodo dos_puntos cuerpo_segun kw_finsegun ;
cuerpo_segun: (escritura)+ ;

// DIMENSION

dimension: kw_dimension var corchete_izq numero corchete_der ;

// ALGORITMO: cabecera, cuerpo, etc.

algoritmo: cabecera_algoritmo cuerpo_algoritmo ;
cabecera_algoritmo: kw_algoritmo nombre_algoritmo ;
nombre_algoritmo: identificador ;
cuerpo_algoritmo: (asignacion|lectura|escritura|definicion|dimension|condicion_si|bucle|segun|comentario)* TERMINAL? kw_finalgoritmo ;

// FUNCION

funcion: cabecera_funcion cuerpo_funcion ;
cabecera_funcion: kw_funcion var op_asignacion var parentesis_izq parentesis_der ;
cuerpo_funcion: var op_asignacion ((numero|CADENA_CARACTERES|var ((SUMA|COMA) (numero|CADENA_CARACTERES|var))*)+) TERMINAL? kw_finfuncion ;
llamada_funcion: var parentesis_izq parentesis_der ;

// COMENTARIOS

textos: TEXTOCOMENTARIOML
      | TEXTOCOMENTARIOUL+
      ;
comentario: COMENTARIOABRIR (textos|TERMINAL)* COMENTARIOCERRAR
        |   COMENTARIOLINEA textos* FINAL_COMENTARIO_UL
        ;