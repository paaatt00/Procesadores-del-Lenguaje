parser grammar gramaticaParser;

options {
    tokenVocab = gramaticaLexer;
    language = Java;
}

prog: ((funcion|comentario) TERMINAL)*;

// PALABRAS CLAVE / RESERVADAS

pr_algoritmo: PCLAVE_ALGORITMO ;
pr_definir: PCLAVE_DEFINIR ;
pr_como: PCLAVE_COMO ;
pr_leer: PCLAVE_LEER ;
pr_escribir: PCLAVE_ESCRIBIR ;
pr_si: PCLAVE_SI ;
pr_sino: PCLAVE_SINO ;
pr_entonces: PCLAVE_ENTONCES ;
pr_finsi: PCLAVE_FINSI ;
pr_para: PCLAVE_PARA ;
pr_hasta: PCLAVE_HASTA ;
pr_paso: PCLAVE_PASO ;
pr_hacer: PCLAVE_HACER ;
pr_finpara: PCLAVE_FINPARA ;
pr_mientras: PCLAVE_MIENTRAS ;
pr_finmientras: PCLAVE_FINMIENTRAS ;
pr_repetir: PCLAVE_REPETIR ;
pr_hastaque: PCLAVE_HASTAQUE ;
pr_segun: PCLAVE_SEGUN ;
pr_deotromodo: PCLAVE_DEOTROMODO ;
pr_finsegun: PCLAVE_FINSEGUN ;
pr_finalgoritmo: PCLAVE_FINALGORITMO ;
pr_funcion: PCLAVE_FUNCION ;
pr_finfuncion: PCLAVE_FINFUNCION ;

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

op_menor: MENOR_QUE ;
op_mayor: MAYOR_QUE ;
op_igual: IGUAL_QUE ;
op_distinto: DISTINTO_QUE ;
op_mayor_igual: MAYOR_IGUAL_QUE ;
op_menor_igual: MENOR_IGUAL_QUE ;
op_or: OR ;
op_and: AND ;
op_asignacion: ASIGNACION | IGUAL_QUE ;
op_suma: SUMA ;
op_resta: RESTA ;
op_multiplicacion: MULTIPLICACION ;
op_division: DIVISION ;
op_potencia: POTENCIA ;

comparacion:  op_menor
            | op_mayor
            | op_igual
            | op_distinto
            | op_mayor_igual
            | op_menor_igual
            | op_and
            | op_or
            ;

operador_matematico: op_suma
                   | op_resta
                   | op_multiplicacion
                   | op_division
                   | op_potencia
                   ;

condicion_logica: (VERDADERO | FALSO) ;

operacion_logica: (parentesis_izq)? (var|numero|dimension|operacion) (comparacion) (operacion|var|numero|condicion_logica|dimension) (parentesis_der)? ((comparacion) (parentesis_izq)? (var|numero|condicion_logica|dimension) (parentesis_der)?)*;

operacion: (var|numero) operador_matematico (var|numero) (operador_matematico (var|numero))* ;

// SIGNOS DE PUNTUACIÓN

fin: FIN ;
coma: COMA ;
dos_puntos: DOS_PUNTOS ;
parentesis_izq: PI ;
parentesis_der: PD ;
corchete_izq: CI ;
corchete_der: CD ;

signo_puntuacion: parentesis_izq
                | parentesis_der
                | fin
                | coma
                | dos_puntos
                | corchete_izq
                | corchete_der
                ;

// Asignación de variables, lectura, escritura, definición

asignacion: (var|dimension) op_asignacion (numero|var|CADENA_CARACTERES|operacion|condicion_logica|llamada_funcion|dimension) ;
escritura: pr_escribir (CADENA_CARACTERES|llamada_funcion|var|operacion|numero) (coma (var|CADENA_CARACTERES|llamada_funcion|operacion|numero))* (signo_puntuacion)? ;
lectura: pr_leer var ;
definicion: pr_definir var (coma var)* pr_como tipo_de_datos (signo_puntuacion)? ;
dimension: (DIMENSION)? var corchete_izq (var|numero|llamada_funcion|operacion) (coma (var|numero|llamada_funcion|operacion))* corchete_der ;

// TIPOS DE PARÁMETROS: declaración de funciones, llamadas a funciones, llamadas a bucles

parametros: (condicion_logica|operacion_logica|asignacion) ;
parametros_funcion: var (coma var)* ;
dev_funcion: var op_asignacion ;

interior: (linea|dimension|operacion|condicion_si|bucle|segun|comentario) ;
linea: (asignacion|definicion|llamada_funcion|lectura|escritura) ;

// CONDICION

condicion_si: cabecera_si cuerpo_si ;
cabecera_si: pr_si parametros (pr_entonces)? ;
cuerpo_si: (interior)+ (pr_sino (interior+))? pr_finsi ;

// BUCLES (mientras, para, repetir)

bucle: bucle_mientras
     | bucle_para
     | bucle_repetir
     ;

// Bucle mientras

bucle_mientras: cabecera_mientras cuerpo_mientras ;
cabecera_mientras: pr_mientras parametros pr_hacer ;
cuerpo_mientras: (interior)+ pr_finmientras ; 

// Bucle para

bucle_para: cabecera_para cuerpo_para ;
cabecera_para: pr_para parametros pr_hasta (var|numero) (pr_paso (var|numero))? pr_hacer ;
cuerpo_para: (interior)+ pr_finpara ;

// Bucle repetir

bucle_repetir: cabecera_repetir cuerpo_repetir condicion_repetir ;
cabecera_repetir: pr_repetir ;
cuerpo_repetir: (interior)+ ;
condicion_repetir: pr_hastaque parametros ;

// Segun 

segun: cabecera_segun tipo_segun ;
cabecera_segun: pr_segun var pr_hacer ;
tipo_segun: ((var|CADENA_CARACTERES|numero) dos_puntos cuerpo_segun)+ (tipo_deotromodo)? ;
tipo_deotromodo: pr_deotromodo dos_puntos cuerpo_segun pr_finsegun ;
cuerpo_segun: (interior)+ ;

// Algoritmo: cabecera, cuerpo, etc.

//algoritmo: cabecera_algoritmo cuerpo_algoritmo ;
//cabecera_algoritmo: pr_algoritmo nombre_algoritmo ;
//nombre_algoritmo: identificador ;
//cuerpo_algoritmo: (interior)+ TERMINAL? pr_finalgoritmo ;

// Funcion: recoge algoritmo y funcion

funcion: cabecera_funcion cuerpo_funcion ;
cabecera_funcion: (pr_funcion|pr_algoritmo) (dev_funcion)? nombre_funcion (parentesis_izq (parametros_funcion)? parentesis_der)? ;
nombre_funcion: identificador ;
cuerpo_funcion: (interior)+ TERMINAL? (pr_finfuncion|pr_finalgoritmo) ;
llamada_funcion: nombre_funcion parentesis_izq ((var|numero|llamada_funcion|operacion) (coma (var|numero|llamada_funcion|operacion))*)? parentesis_der ;

// Comentarios

textos: TEXTOCOMENTARIOML 
      | TEXTOCOMENTARIOUL+ 
      ;

comentario: COMENTARIOABRIR (textos|TERMINAL)* COMENTARIOCERRAR
        |   COMENTARIOLINEA textos* FINAL_COMENTARIO_UL
        ;