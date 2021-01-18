// Generated from gramaticaParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PCLAVE_ALGORITMO=1, PCLAVE_DEFINIR=2, PCLAVE_COMO=3, PCLAVE_LEER=4, PCLAVE_ESCRIBIR=5, 
		PCLAVE_SI=6, PCLAVE_SINO=7, PCLAVE_ENTONCES=8, PCLAVE_FINSI=9, PCLAVE_PARA=10, 
		PCLAVE_HASTA=11, PCLAVE_PASO=12, PCLAVE_HACER=13, PCLAVE_FINPARA=14, PCLAVE_MIENTRAS=15, 
		PCLAVE_FINMIENTRAS=16, PCLAVE_REPETIR=17, PCLAVE_HASTAQUE=18, PCLAVE_SEGUN=19, 
		PCLAVE_DEOTROMODO=20, PCLAVE_FINSEGUN=21, PCLAVE_FINALGORITMO=22, PCLAVE_FUNCION=23, 
		PCLAVE_FINFUNCION=24, VERDADERO=25, FALSO=26, CARACTER=27, ENTERO=28, 
		REAL=29, LOGICO=30, DIMENSION=31, INT=32, FLOAT=33, IDENTIFICADOR=34, 
		PI=35, PD=36, CI=37, CD=38, FIN=39, COMA=40, DOS_PUNTOS=41, ASIGNACION=42, 
		MENOR_QUE=43, MAYOR_QUE=44, IGUAL_QUE=45, DISTINTO_QUE=46, MAYOR_IGUAL_QUE=47, 
		MENOR_IGUAL_QUE=48, AND=49, OR=50, SUMA=51, RESTA=52, MULTIPLICACION=53, 
		DIVISION=54, POTENCIA=55, CADENA_CARACTERES=56, TERMINAL=57, WS=58, SALTO=59, 
		COMENTARIOABRIR=60, COMENTARIOLINEA=61, COMENTARIOCERRAR=62, TEXTOCOMENTARIOML=63, 
		FINAL_COMENTARIO_UL=64, TEXTOCOMENTARIOUL=65;
	public static final int
		RULE_prog = 0, RULE_pr_algoritmo = 1, RULE_pr_definir = 2, RULE_pr_como = 3, 
		RULE_pr_leer = 4, RULE_pr_escribir = 5, RULE_pr_si = 6, RULE_pr_sino = 7, 
		RULE_pr_entonces = 8, RULE_pr_finsi = 9, RULE_pr_para = 10, RULE_pr_hasta = 11, 
		RULE_pr_paso = 12, RULE_pr_hacer = 13, RULE_pr_finpara = 14, RULE_pr_mientras = 15, 
		RULE_pr_finmientras = 16, RULE_pr_repetir = 17, RULE_pr_hastaque = 18, 
		RULE_pr_segun = 19, RULE_pr_deotromodo = 20, RULE_pr_finsegun = 21, RULE_pr_finalgoritmo = 22, 
		RULE_pr_funcion = 23, RULE_pr_finfuncion = 24, RULE_tipo_de_datos = 25, 
		RULE_numero = 26, RULE_identificador = 27, RULE_var = 28, RULE_op_menor = 29, 
		RULE_op_mayor = 30, RULE_op_igual = 31, RULE_op_distinto = 32, RULE_op_mayor_igual = 33, 
		RULE_op_menor_igual = 34, RULE_op_or = 35, RULE_op_and = 36, RULE_op_asignacion = 37, 
		RULE_op_suma = 38, RULE_op_resta = 39, RULE_op_multiplicacion = 40, RULE_op_division = 41, 
		RULE_op_potencia = 42, RULE_comparacion = 43, RULE_operador_matematico = 44, 
		RULE_condicion_logica = 45, RULE_operacion_logica = 46, RULE_operacion = 47, 
		RULE_fin = 48, RULE_coma = 49, RULE_dos_puntos = 50, RULE_parentesis_izq = 51, 
		RULE_parentesis_der = 52, RULE_corchete_izq = 53, RULE_corchete_der = 54, 
		RULE_signo_puntuacion = 55, RULE_asignacion = 56, RULE_escritura = 57, 
		RULE_lectura = 58, RULE_definicion = 59, RULE_dimension = 60, RULE_parametros = 61, 
		RULE_parametros_funcion = 62, RULE_dev_funcion = 63, RULE_interior = 64, 
		RULE_linea = 65, RULE_condicion_si = 66, RULE_cabecera_si = 67, RULE_cuerpo_si = 68, 
		RULE_bucle = 69, RULE_bucle_mientras = 70, RULE_cabecera_mientras = 71, 
		RULE_cuerpo_mientras = 72, RULE_bucle_para = 73, RULE_cabecera_para = 74, 
		RULE_cuerpo_para = 75, RULE_bucle_repetir = 76, RULE_cabecera_repetir = 77, 
		RULE_cuerpo_repetir = 78, RULE_condicion_repetir = 79, RULE_segun = 80, 
		RULE_cabecera_segun = 81, RULE_tipo_segun = 82, RULE_tipo_deotromodo = 83, 
		RULE_cuerpo_segun = 84, RULE_funcion = 85, RULE_cabecera_funcion = 86, 
		RULE_nombre_funcion = 87, RULE_cuerpo_funcion = 88, RULE_llamada_funcion = 89, 
		RULE_textos = 90, RULE_comentario = 91;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "pr_algoritmo", "pr_definir", "pr_como", "pr_leer", "pr_escribir", 
			"pr_si", "pr_sino", "pr_entonces", "pr_finsi", "pr_para", "pr_hasta", 
			"pr_paso", "pr_hacer", "pr_finpara", "pr_mientras", "pr_finmientras", 
			"pr_repetir", "pr_hastaque", "pr_segun", "pr_deotromodo", "pr_finsegun", 
			"pr_finalgoritmo", "pr_funcion", "pr_finfuncion", "tipo_de_datos", "numero", 
			"identificador", "var", "op_menor", "op_mayor", "op_igual", "op_distinto", 
			"op_mayor_igual", "op_menor_igual", "op_or", "op_and", "op_asignacion", 
			"op_suma", "op_resta", "op_multiplicacion", "op_division", "op_potencia", 
			"comparacion", "operador_matematico", "condicion_logica", "operacion_logica", 
			"operacion", "fin", "coma", "dos_puntos", "parentesis_izq", "parentesis_der", 
			"corchete_izq", "corchete_der", "signo_puntuacion", "asignacion", "escritura", 
			"lectura", "definicion", "dimension", "parametros", "parametros_funcion", 
			"dev_funcion", "interior", "linea", "condicion_si", "cabecera_si", "cuerpo_si", 
			"bucle", "bucle_mientras", "cabecera_mientras", "cuerpo_mientras", "bucle_para", 
			"cabecera_para", "cuerpo_para", "bucle_repetir", "cabecera_repetir", 
			"cuerpo_repetir", "condicion_repetir", "segun", "cabecera_segun", "tipo_segun", 
			"tipo_deotromodo", "cuerpo_segun", "funcion", "cabecera_funcion", "nombre_funcion", 
			"cuerpo_funcion", "llamada_funcion", "textos", "comentario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Algoritmo'", null, "'Como'", "'Leer'", "'Escribir'", "'Si'", 
			"'SiNo'", "'Entonces'", null, "'Para'", null, "'con paso'", "'Hacer'", 
			"'FinPara'", "'Mientras'", null, "'Repetir'", "'Hasta Que'", "'Segun'", 
			"'De Otro Modo'", "'FinSegun'", "'FinAlgoritmo'", "'Funcion'", null, 
			"'Verdadero'", "'Falso'", "'Caracter'", "'Entero'", "'Real'", "'Logico'", 
			null, null, null, null, "'('", "')'", "'['", "']'", "';'", "','", "':'", 
			"'<-'", "'<'", "'>'", "'='", null, "'>='", "'<='", null, null, "'+'", 
			"'-'", "'*'", "'/'", "'^'", null, null, "' '", null, "'/**'", "'//'", 
			"'**/'", null, "'\r\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PCLAVE_ALGORITMO", "PCLAVE_DEFINIR", "PCLAVE_COMO", "PCLAVE_LEER", 
			"PCLAVE_ESCRIBIR", "PCLAVE_SI", "PCLAVE_SINO", "PCLAVE_ENTONCES", "PCLAVE_FINSI", 
			"PCLAVE_PARA", "PCLAVE_HASTA", "PCLAVE_PASO", "PCLAVE_HACER", "PCLAVE_FINPARA", 
			"PCLAVE_MIENTRAS", "PCLAVE_FINMIENTRAS", "PCLAVE_REPETIR", "PCLAVE_HASTAQUE", 
			"PCLAVE_SEGUN", "PCLAVE_DEOTROMODO", "PCLAVE_FINSEGUN", "PCLAVE_FINALGORITMO", 
			"PCLAVE_FUNCION", "PCLAVE_FINFUNCION", "VERDADERO", "FALSO", "CARACTER", 
			"ENTERO", "REAL", "LOGICO", "DIMENSION", "INT", "FLOAT", "IDENTIFICADOR", 
			"PI", "PD", "CI", "CD", "FIN", "COMA", "DOS_PUNTOS", "ASIGNACION", "MENOR_QUE", 
			"MAYOR_QUE", "IGUAL_QUE", "DISTINTO_QUE", "MAYOR_IGUAL_QUE", "MENOR_IGUAL_QUE", 
			"AND", "OR", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "POTENCIA", 
			"CADENA_CARACTERES", "TERMINAL", "WS", "SALTO", "COMENTARIOABRIR", "COMENTARIOLINEA", 
			"COMENTARIOCERRAR", "TEXTOCOMENTARIOML", "FINAL_COMENTARIO_UL", "TEXTOCOMENTARIOUL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gramaticaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> TERMINAL() { return getTokens(gramaticaParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(gramaticaParser.TERMINAL, i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PCLAVE_ALGORITMO) | (1L << PCLAVE_FUNCION) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA))) != 0)) {
				{
				{
				setState(186);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PCLAVE_ALGORITMO:
				case PCLAVE_FUNCION:
					{
					setState(184);
					funcion();
					}
					break;
				case COMENTARIOABRIR:
				case COMENTARIOLINEA:
					{
					setState(185);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188);
				match(TERMINAL);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_algoritmoContext extends ParserRuleContext {
		public TerminalNode PCLAVE_ALGORITMO() { return getToken(gramaticaParser.PCLAVE_ALGORITMO, 0); }
		public Pr_algoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_algoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_algoritmo(this);
		}
	}

	public final Pr_algoritmoContext pr_algoritmo() throws RecognitionException {
		Pr_algoritmoContext _localctx = new Pr_algoritmoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pr_algoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(PCLAVE_ALGORITMO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_definirContext extends ParserRuleContext {
		public TerminalNode PCLAVE_DEFINIR() { return getToken(gramaticaParser.PCLAVE_DEFINIR, 0); }
		public Pr_definirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_definir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_definir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_definir(this);
		}
	}

	public final Pr_definirContext pr_definir() throws RecognitionException {
		Pr_definirContext _localctx = new Pr_definirContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pr_definir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(PCLAVE_DEFINIR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_comoContext extends ParserRuleContext {
		public TerminalNode PCLAVE_COMO() { return getToken(gramaticaParser.PCLAVE_COMO, 0); }
		public Pr_comoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_como; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_como(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_como(this);
		}
	}

	public final Pr_comoContext pr_como() throws RecognitionException {
		Pr_comoContext _localctx = new Pr_comoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pr_como);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(PCLAVE_COMO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_leerContext extends ParserRuleContext {
		public TerminalNode PCLAVE_LEER() { return getToken(gramaticaParser.PCLAVE_LEER, 0); }
		public Pr_leerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_leer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_leer(this);
		}
	}

	public final Pr_leerContext pr_leer() throws RecognitionException {
		Pr_leerContext _localctx = new Pr_leerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pr_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(PCLAVE_LEER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_escribirContext extends ParserRuleContext {
		public TerminalNode PCLAVE_ESCRIBIR() { return getToken(gramaticaParser.PCLAVE_ESCRIBIR, 0); }
		public Pr_escribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_escribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_escribir(this);
		}
	}

	public final Pr_escribirContext pr_escribir() throws RecognitionException {
		Pr_escribirContext _localctx = new Pr_escribirContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pr_escribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(PCLAVE_ESCRIBIR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_siContext extends ParserRuleContext {
		public TerminalNode PCLAVE_SI() { return getToken(gramaticaParser.PCLAVE_SI, 0); }
		public Pr_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_si(this);
		}
	}

	public final Pr_siContext pr_si() throws RecognitionException {
		Pr_siContext _localctx = new Pr_siContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pr_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(PCLAVE_SI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_sinoContext extends ParserRuleContext {
		public TerminalNode PCLAVE_SINO() { return getToken(gramaticaParser.PCLAVE_SINO, 0); }
		public Pr_sinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_sino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_sino(this);
		}
	}

	public final Pr_sinoContext pr_sino() throws RecognitionException {
		Pr_sinoContext _localctx = new Pr_sinoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pr_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(PCLAVE_SINO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_entoncesContext extends ParserRuleContext {
		public TerminalNode PCLAVE_ENTONCES() { return getToken(gramaticaParser.PCLAVE_ENTONCES, 0); }
		public Pr_entoncesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_entonces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_entonces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_entonces(this);
		}
	}

	public final Pr_entoncesContext pr_entonces() throws RecognitionException {
		Pr_entoncesContext _localctx = new Pr_entoncesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pr_entonces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(PCLAVE_ENTONCES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_finsiContext extends ParserRuleContext {
		public TerminalNode PCLAVE_FINSI() { return getToken(gramaticaParser.PCLAVE_FINSI, 0); }
		public Pr_finsiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_finsi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_finsi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_finsi(this);
		}
	}

	public final Pr_finsiContext pr_finsi() throws RecognitionException {
		Pr_finsiContext _localctx = new Pr_finsiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pr_finsi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(PCLAVE_FINSI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_paraContext extends ParserRuleContext {
		public TerminalNode PCLAVE_PARA() { return getToken(gramaticaParser.PCLAVE_PARA, 0); }
		public Pr_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_para(this);
		}
	}

	public final Pr_paraContext pr_para() throws RecognitionException {
		Pr_paraContext _localctx = new Pr_paraContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pr_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(PCLAVE_PARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_hastaContext extends ParserRuleContext {
		public TerminalNode PCLAVE_HASTA() { return getToken(gramaticaParser.PCLAVE_HASTA, 0); }
		public Pr_hastaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_hasta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_hasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_hasta(this);
		}
	}

	public final Pr_hastaContext pr_hasta() throws RecognitionException {
		Pr_hastaContext _localctx = new Pr_hastaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pr_hasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(PCLAVE_HASTA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_pasoContext extends ParserRuleContext {
		public TerminalNode PCLAVE_PASO() { return getToken(gramaticaParser.PCLAVE_PASO, 0); }
		public Pr_pasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_paso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_paso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_paso(this);
		}
	}

	public final Pr_pasoContext pr_paso() throws RecognitionException {
		Pr_pasoContext _localctx = new Pr_pasoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pr_paso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(PCLAVE_PASO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_hacerContext extends ParserRuleContext {
		public TerminalNode PCLAVE_HACER() { return getToken(gramaticaParser.PCLAVE_HACER, 0); }
		public Pr_hacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_hacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_hacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_hacer(this);
		}
	}

	public final Pr_hacerContext pr_hacer() throws RecognitionException {
		Pr_hacerContext _localctx = new Pr_hacerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pr_hacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(PCLAVE_HACER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_finparaContext extends ParserRuleContext {
		public TerminalNode PCLAVE_FINPARA() { return getToken(gramaticaParser.PCLAVE_FINPARA, 0); }
		public Pr_finparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_finpara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_finpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_finpara(this);
		}
	}

	public final Pr_finparaContext pr_finpara() throws RecognitionException {
		Pr_finparaContext _localctx = new Pr_finparaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pr_finpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(PCLAVE_FINPARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_mientrasContext extends ParserRuleContext {
		public TerminalNode PCLAVE_MIENTRAS() { return getToken(gramaticaParser.PCLAVE_MIENTRAS, 0); }
		public Pr_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_mientras(this);
		}
	}

	public final Pr_mientrasContext pr_mientras() throws RecognitionException {
		Pr_mientrasContext _localctx = new Pr_mientrasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pr_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(PCLAVE_MIENTRAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_finmientrasContext extends ParserRuleContext {
		public TerminalNode PCLAVE_FINMIENTRAS() { return getToken(gramaticaParser.PCLAVE_FINMIENTRAS, 0); }
		public Pr_finmientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_finmientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_finmientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_finmientras(this);
		}
	}

	public final Pr_finmientrasContext pr_finmientras() throws RecognitionException {
		Pr_finmientrasContext _localctx = new Pr_finmientrasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pr_finmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(PCLAVE_FINMIENTRAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_repetirContext extends ParserRuleContext {
		public TerminalNode PCLAVE_REPETIR() { return getToken(gramaticaParser.PCLAVE_REPETIR, 0); }
		public Pr_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_repetir(this);
		}
	}

	public final Pr_repetirContext pr_repetir() throws RecognitionException {
		Pr_repetirContext _localctx = new Pr_repetirContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pr_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(PCLAVE_REPETIR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_hastaqueContext extends ParserRuleContext {
		public TerminalNode PCLAVE_HASTAQUE() { return getToken(gramaticaParser.PCLAVE_HASTAQUE, 0); }
		public Pr_hastaqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_hastaque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_hastaque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_hastaque(this);
		}
	}

	public final Pr_hastaqueContext pr_hastaque() throws RecognitionException {
		Pr_hastaqueContext _localctx = new Pr_hastaqueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pr_hastaque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(PCLAVE_HASTAQUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_segunContext extends ParserRuleContext {
		public TerminalNode PCLAVE_SEGUN() { return getToken(gramaticaParser.PCLAVE_SEGUN, 0); }
		public Pr_segunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_segun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_segun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_segun(this);
		}
	}

	public final Pr_segunContext pr_segun() throws RecognitionException {
		Pr_segunContext _localctx = new Pr_segunContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pr_segun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(PCLAVE_SEGUN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_deotromodoContext extends ParserRuleContext {
		public TerminalNode PCLAVE_DEOTROMODO() { return getToken(gramaticaParser.PCLAVE_DEOTROMODO, 0); }
		public Pr_deotromodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_deotromodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_deotromodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_deotromodo(this);
		}
	}

	public final Pr_deotromodoContext pr_deotromodo() throws RecognitionException {
		Pr_deotromodoContext _localctx = new Pr_deotromodoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pr_deotromodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(PCLAVE_DEOTROMODO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_finsegunContext extends ParserRuleContext {
		public TerminalNode PCLAVE_FINSEGUN() { return getToken(gramaticaParser.PCLAVE_FINSEGUN, 0); }
		public Pr_finsegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_finsegun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_finsegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_finsegun(this);
		}
	}

	public final Pr_finsegunContext pr_finsegun() throws RecognitionException {
		Pr_finsegunContext _localctx = new Pr_finsegunContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pr_finsegun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(PCLAVE_FINSEGUN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_finalgoritmoContext extends ParserRuleContext {
		public TerminalNode PCLAVE_FINALGORITMO() { return getToken(gramaticaParser.PCLAVE_FINALGORITMO, 0); }
		public Pr_finalgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_finalgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_finalgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_finalgoritmo(this);
		}
	}

	public final Pr_finalgoritmoContext pr_finalgoritmo() throws RecognitionException {
		Pr_finalgoritmoContext _localctx = new Pr_finalgoritmoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pr_finalgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(PCLAVE_FINALGORITMO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_funcionContext extends ParserRuleContext {
		public TerminalNode PCLAVE_FUNCION() { return getToken(gramaticaParser.PCLAVE_FUNCION, 0); }
		public Pr_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_funcion(this);
		}
	}

	public final Pr_funcionContext pr_funcion() throws RecognitionException {
		Pr_funcionContext _localctx = new Pr_funcionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pr_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(PCLAVE_FUNCION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pr_finfuncionContext extends ParserRuleContext {
		public TerminalNode PCLAVE_FINFUNCION() { return getToken(gramaticaParser.PCLAVE_FINFUNCION, 0); }
		public Pr_finfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr_finfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterPr_finfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitPr_finfuncion(this);
		}
	}

	public final Pr_finfuncionContext pr_finfuncion() throws RecognitionException {
		Pr_finfuncionContext _localctx = new Pr_finfuncionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pr_finfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(PCLAVE_FINFUNCION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_de_datosContext extends ParserRuleContext {
		public TerminalNode CARACTER() { return getToken(gramaticaParser.CARACTER, 0); }
		public TerminalNode ENTERO() { return getToken(gramaticaParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(gramaticaParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(gramaticaParser.LOGICO, 0); }
		public Tipo_de_datosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_de_datos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterTipo_de_datos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitTipo_de_datos(this);
		}
	}

	public final Tipo_de_datosContext tipo_de_datos() throws RecognitionException {
		Tipo_de_datosContext _localctx = new Tipo_de_datosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipo_de_datos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARACTER) | (1L << ENTERO) | (1L << REAL) | (1L << LOGICO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gramaticaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(gramaticaParser.FLOAT, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(IDENTIFICADOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADENA_CARACTERES() { return getToken(gramaticaParser.CADENA_CARACTERES, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_var);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				identificador();
				}
				break;
			case CADENA_CARACTERES:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(CADENA_CARACTERES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_menorContext extends ParserRuleContext {
		public TerminalNode MENOR_QUE() { return getToken(gramaticaParser.MENOR_QUE, 0); }
		public Op_menorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_menor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_menor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_menor(this);
		}
	}

	public final Op_menorContext op_menor() throws RecognitionException {
		Op_menorContext _localctx = new Op_menorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(MENOR_QUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_mayorContext extends ParserRuleContext {
		public TerminalNode MAYOR_QUE() { return getToken(gramaticaParser.MAYOR_QUE, 0); }
		public Op_mayorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mayor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_mayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_mayor(this);
		}
	}

	public final Op_mayorContext op_mayor() throws RecognitionException {
		Op_mayorContext _localctx = new Op_mayorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(MAYOR_QUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_igualContext extends ParserRuleContext {
		public TerminalNode IGUAL_QUE() { return getToken(gramaticaParser.IGUAL_QUE, 0); }
		public Op_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_igual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_igual(this);
		}
	}

	public final Op_igualContext op_igual() throws RecognitionException {
		Op_igualContext _localctx = new Op_igualContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_op_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(IGUAL_QUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_distintoContext extends ParserRuleContext {
		public TerminalNode DISTINTO_QUE() { return getToken(gramaticaParser.DISTINTO_QUE, 0); }
		public Op_distintoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_distinto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_distinto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_distinto(this);
		}
	}

	public final Op_distintoContext op_distinto() throws RecognitionException {
		Op_distintoContext _localctx = new Op_distintoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_distinto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(DISTINTO_QUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_mayor_igualContext extends ParserRuleContext {
		public TerminalNode MAYOR_IGUAL_QUE() { return getToken(gramaticaParser.MAYOR_IGUAL_QUE, 0); }
		public Op_mayor_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mayor_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_mayor_igual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_mayor_igual(this);
		}
	}

	public final Op_mayor_igualContext op_mayor_igual() throws RecognitionException {
		Op_mayor_igualContext _localctx = new Op_mayor_igualContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_mayor_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(MAYOR_IGUAL_QUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_menor_igualContext extends ParserRuleContext {
		public TerminalNode MENOR_IGUAL_QUE() { return getToken(gramaticaParser.MENOR_IGUAL_QUE, 0); }
		public Op_menor_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_menor_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_menor_igual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_menor_igual(this);
		}
	}

	public final Op_menor_igualContext op_menor_igual() throws RecognitionException {
		Op_menor_igualContext _localctx = new Op_menor_igualContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_op_menor_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(MENOR_IGUAL_QUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_orContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(gramaticaParser.OR, 0); }
		public Op_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_or(this);
		}
	}

	public final Op_orContext op_or() throws RecognitionException {
		Op_orContext _localctx = new Op_orContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_op_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_andContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(gramaticaParser.AND, 0); }
		public Op_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_and(this);
		}
	}

	public final Op_andContext op_and() throws RecognitionException {
		Op_andContext _localctx = new Op_andContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_op_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_asignacionContext extends ParserRuleContext {
		public TerminalNode ASIGNACION() { return getToken(gramaticaParser.ASIGNACION, 0); }
		public TerminalNode IGUAL_QUE() { return getToken(gramaticaParser.IGUAL_QUE, 0); }
		public Op_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_asignacion(this);
		}
	}

	public final Op_asignacionContext op_asignacion() throws RecognitionException {
		Op_asignacionContext _localctx = new Op_asignacionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==ASIGNACION || _la==IGUAL_QUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_sumaContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(gramaticaParser.SUMA, 0); }
		public Op_sumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_suma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_suma(this);
		}
	}

	public final Op_sumaContext op_suma() throws RecognitionException {
		Op_sumaContext _localctx = new Op_sumaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_op_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(SUMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_restaContext extends ParserRuleContext {
		public TerminalNode RESTA() { return getToken(gramaticaParser.RESTA, 0); }
		public Op_restaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_resta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_resta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_resta(this);
		}
	}

	public final Op_restaContext op_resta() throws RecognitionException {
		Op_restaContext _localctx = new Op_restaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_op_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(RESTA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_multiplicacionContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACION() { return getToken(gramaticaParser.MULTIPLICACION, 0); }
		public Op_multiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_multiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_multiplicacion(this);
		}
	}

	public final Op_multiplicacionContext op_multiplicacion() throws RecognitionException {
		Op_multiplicacionContext _localctx = new Op_multiplicacionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(MULTIPLICACION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_divisionContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(gramaticaParser.DIVISION, 0); }
		public Op_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_division(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_division(this);
		}
	}

	public final Op_divisionContext op_division() throws RecognitionException {
		Op_divisionContext _localctx = new Op_divisionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_op_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(DIVISION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_potenciaContext extends ParserRuleContext {
		public TerminalNode POTENCIA() { return getToken(gramaticaParser.POTENCIA, 0); }
		public Op_potenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_potencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOp_potencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOp_potencia(this);
		}
	}

	public final Op_potenciaContext op_potencia() throws RecognitionException {
		Op_potenciaContext _localctx = new Op_potenciaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_op_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(POTENCIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparacionContext extends ParserRuleContext {
		public Op_menorContext op_menor() {
			return getRuleContext(Op_menorContext.class,0);
		}
		public Op_mayorContext op_mayor() {
			return getRuleContext(Op_mayorContext.class,0);
		}
		public Op_igualContext op_igual() {
			return getRuleContext(Op_igualContext.class,0);
		}
		public Op_distintoContext op_distinto() {
			return getRuleContext(Op_distintoContext.class,0);
		}
		public Op_mayor_igualContext op_mayor_igual() {
			return getRuleContext(Op_mayor_igualContext.class,0);
		}
		public Op_menor_igualContext op_menor_igual() {
			return getRuleContext(Op_menor_igualContext.class,0);
		}
		public Op_andContext op_and() {
			return getRuleContext(Op_andContext.class,0);
		}
		public Op_orContext op_or() {
			return getRuleContext(Op_orContext.class,0);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitComparacion(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_comparacion);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOR_QUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				op_menor();
				}
				break;
			case MAYOR_QUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				op_mayor();
				}
				break;
			case IGUAL_QUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				op_igual();
				}
				break;
			case DISTINTO_QUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				op_distinto();
				}
				break;
			case MAYOR_IGUAL_QUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				op_mayor_igual();
				}
				break;
			case MENOR_IGUAL_QUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				op_menor_igual();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				op_and();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
				op_or();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_matematicoContext extends ParserRuleContext {
		public Op_sumaContext op_suma() {
			return getRuleContext(Op_sumaContext.class,0);
		}
		public Op_restaContext op_resta() {
			return getRuleContext(Op_restaContext.class,0);
		}
		public Op_multiplicacionContext op_multiplicacion() {
			return getRuleContext(Op_multiplicacionContext.class,0);
		}
		public Op_divisionContext op_division() {
			return getRuleContext(Op_divisionContext.class,0);
		}
		public Op_potenciaContext op_potencia() {
			return getRuleContext(Op_potenciaContext.class,0);
		}
		public Operador_matematicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_matematico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOperador_matematico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOperador_matematico(this);
		}
	}

	public final Operador_matematicoContext operador_matematico() throws RecognitionException {
		Operador_matematicoContext _localctx = new Operador_matematicoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_operador_matematico);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				op_suma();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				op_resta();
				}
				break;
			case MULTIPLICACION:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				op_multiplicacion();
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				op_division();
				}
				break;
			case POTENCIA:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				op_potencia();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condicion_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADERO() { return getToken(gramaticaParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(gramaticaParser.FALSO, 0); }
		public Condicion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCondicion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCondicion_logica(this);
		}
	}

	public final Condicion_logicaContext condicion_logica() throws RecognitionException {
		Condicion_logicaContext _localctx = new Condicion_logicaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_condicion_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !(_la==VERDADERO || _la==FALSO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operacion_logicaContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<ComparacionContext> comparacion() {
			return getRuleContexts(ComparacionContext.class);
		}
		public ComparacionContext comparacion(int i) {
			return getRuleContext(ComparacionContext.class,i);
		}
		public List<Condicion_logicaContext> condicion_logica() {
			return getRuleContexts(Condicion_logicaContext.class);
		}
		public Condicion_logicaContext condicion_logica(int i) {
			return getRuleContext(Condicion_logicaContext.class,i);
		}
		public List<Parentesis_izqContext> parentesis_izq() {
			return getRuleContexts(Parentesis_izqContext.class);
		}
		public Parentesis_izqContext parentesis_izq(int i) {
			return getRuleContext(Parentesis_izqContext.class,i);
		}
		public List<Parentesis_derContext> parentesis_der() {
			return getRuleContexts(Parentesis_derContext.class);
		}
		public Parentesis_derContext parentesis_der(int i) {
			return getRuleContext(Parentesis_derContext.class,i);
		}
		public Operacion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOperacion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOperacion_logica(this);
		}
	}

	public final Operacion_logicaContext operacion_logica() throws RecognitionException {
		Operacion_logicaContext _localctx = new Operacion_logicaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_operacion_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PI) {
				{
				setState(300);
				parentesis_izq();
				}
			}

			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(303);
				var();
				}
				break;
			case 2:
				{
				setState(304);
				numero();
				}
				break;
			case 3:
				{
				setState(305);
				dimension();
				}
				break;
			case 4:
				{
				setState(306);
				operacion();
				}
				break;
			}
			{
			setState(309);
			comparacion();
			}
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(310);
				operacion();
				}
				break;
			case 2:
				{
				setState(311);
				var();
				}
				break;
			case 3:
				{
				setState(312);
				numero();
				}
				break;
			case 4:
				{
				setState(313);
				condicion_logica();
				}
				break;
			case 5:
				{
				setState(314);
				dimension();
				}
				break;
			}
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PD) {
				{
				setState(317);
				parentesis_der();
				}
			}

			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOR_QUE) | (1L << MAYOR_QUE) | (1L << IGUAL_QUE) | (1L << DISTINTO_QUE) | (1L << MAYOR_IGUAL_QUE) | (1L << MENOR_IGUAL_QUE) | (1L << AND) | (1L << OR))) != 0)) {
				{
				{
				{
				setState(320);
				comparacion();
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PI) {
					{
					setState(321);
					parentesis_izq();
					}
				}

				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(324);
					var();
					}
					break;
				case 2:
					{
					setState(325);
					numero();
					}
					break;
				case 3:
					{
					setState(326);
					condicion_logica();
					}
					break;
				case 4:
					{
					setState(327);
					dimension();
					}
					break;
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PD) {
					{
					setState(330);
					parentesis_der();
					}
				}

				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionContext extends ParserRuleContext {
		public List<Operador_matematicoContext> operador_matematico() {
			return getRuleContexts(Operador_matematicoContext.class);
		}
		public Operador_matematicoContext operador_matematico(int i) {
			return getRuleContext(Operador_matematicoContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_operacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
			case CADENA_CARACTERES:
				{
				setState(338);
				var();
				}
				break;
			case INT:
			case FLOAT:
				{
				setState(339);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(342);
			operador_matematico();
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
			case CADENA_CARACTERES:
				{
				setState(343);
				var();
				}
				break;
			case INT:
			case FLOAT:
				{
				setState(344);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << MULTIPLICACION) | (1L << DIVISION) | (1L << POTENCIA))) != 0)) {
				{
				{
				setState(347);
				operador_matematico();
				setState(350);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFICADOR:
				case CADENA_CARACTERES:
					{
					setState(348);
					var();
					}
					break;
				case INT:
				case FLOAT:
					{
					setState(349);
					numero();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinContext extends ParserRuleContext {
		public TerminalNode FIN() { return getToken(gramaticaParser.FIN, 0); }
		public FinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterFin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitFin(this);
		}
	}

	public final FinContext fin() throws RecognitionException {
		FinContext _localctx = new FinContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(gramaticaParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitComa(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dos_puntosContext extends ParserRuleContext {
		public TerminalNode DOS_PUNTOS() { return getToken(gramaticaParser.DOS_PUNTOS, 0); }
		public Dos_puntosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dos_puntos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterDos_puntos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitDos_puntos(this);
		}
	}

	public final Dos_puntosContext dos_puntos() throws RecognitionException {
		Dos_puntosContext _localctx = new Dos_puntosContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_dos_puntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(DOS_PUNTOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parentesis_izqContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(gramaticaParser.PI, 0); }
		public Parentesis_izqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis_izq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterParentesis_izq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitParentesis_izq(this);
		}
	}

	public final Parentesis_izqContext parentesis_izq() throws RecognitionException {
		Parentesis_izqContext _localctx = new Parentesis_izqContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parentesis_izq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(PI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parentesis_derContext extends ParserRuleContext {
		public TerminalNode PD() { return getToken(gramaticaParser.PD, 0); }
		public Parentesis_derContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis_der; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterParentesis_der(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitParentesis_der(this);
		}
	}

	public final Parentesis_derContext parentesis_der() throws RecognitionException {
		Parentesis_derContext _localctx = new Parentesis_derContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_parentesis_der);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(PD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Corchete_izqContext extends ParserRuleContext {
		public TerminalNode CI() { return getToken(gramaticaParser.CI, 0); }
		public Corchete_izqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corchete_izq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCorchete_izq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCorchete_izq(this);
		}
	}

	public final Corchete_izqContext corchete_izq() throws RecognitionException {
		Corchete_izqContext _localctx = new Corchete_izqContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_corchete_izq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(CI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Corchete_derContext extends ParserRuleContext {
		public TerminalNode CD() { return getToken(gramaticaParser.CD, 0); }
		public Corchete_derContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corchete_der; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCorchete_der(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCorchete_der(this);
		}
	}

	public final Corchete_derContext corchete_der() throws RecognitionException {
		Corchete_derContext _localctx = new Corchete_derContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_corchete_der);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(CD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signo_puntuacionContext extends ParserRuleContext {
		public Parentesis_izqContext parentesis_izq() {
			return getRuleContext(Parentesis_izqContext.class,0);
		}
		public Parentesis_derContext parentesis_der() {
			return getRuleContext(Parentesis_derContext.class,0);
		}
		public FinContext fin() {
			return getRuleContext(FinContext.class,0);
		}
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public Dos_puntosContext dos_puntos() {
			return getRuleContext(Dos_puntosContext.class,0);
		}
		public Corchete_izqContext corchete_izq() {
			return getRuleContext(Corchete_izqContext.class,0);
		}
		public Corchete_derContext corchete_der() {
			return getRuleContext(Corchete_derContext.class,0);
		}
		public Signo_puntuacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signo_puntuacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterSigno_puntuacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitSigno_puntuacion(this);
		}
	}

	public final Signo_puntuacionContext signo_puntuacion() throws RecognitionException {
		Signo_puntuacionContext _localctx = new Signo_puntuacionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_signo_puntuacion);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PI:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				parentesis_izq();
				}
				break;
			case PD:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				parentesis_der();
				}
				break;
			case FIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				fin();
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				coma();
				}
				break;
			case DOS_PUNTOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(375);
				dos_puntos();
				}
				break;
			case CI:
				enterOuterAlt(_localctx, 6);
				{
				setState(376);
				corchete_izq();
				}
				break;
			case CD:
				enterOuterAlt(_localctx, 7);
				{
				setState(377);
				corchete_der();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public Op_asignacionContext op_asignacion() {
			return getRuleContext(Op_asignacionContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode CADENA_CARACTERES() { return getToken(gramaticaParser.CADENA_CARACTERES, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public Condicion_logicaContext condicion_logica() {
			return getRuleContext(Condicion_logicaContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(380);
				var();
				}
				break;
			case 2:
				{
				setState(381);
				dimension();
				}
				break;
			}
			setState(384);
			op_asignacion();
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(385);
				numero();
				}
				break;
			case 2:
				{
				setState(386);
				var();
				}
				break;
			case 3:
				{
				setState(387);
				match(CADENA_CARACTERES);
				}
				break;
			case 4:
				{
				setState(388);
				operacion();
				}
				break;
			case 5:
				{
				setState(389);
				condicion_logica();
				}
				break;
			case 6:
				{
				setState(390);
				llamada_funcion();
				}
				break;
			case 7:
				{
				setState(391);
				dimension();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscrituraContext extends ParserRuleContext {
		public Pr_escribirContext pr_escribir() {
			return getRuleContext(Pr_escribirContext.class,0);
		}
		public List<TerminalNode> CADENA_CARACTERES() { return getTokens(gramaticaParser.CADENA_CARACTERES); }
		public TerminalNode CADENA_CARACTERES(int i) {
			return getToken(gramaticaParser.CADENA_CARACTERES, i);
		}
		public List<Llamada_funcionContext> llamada_funcion() {
			return getRuleContexts(Llamada_funcionContext.class);
		}
		public Llamada_funcionContext llamada_funcion(int i) {
			return getRuleContext(Llamada_funcionContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public Signo_puntuacionContext signo_puntuacion() {
			return getRuleContext(Signo_puntuacionContext.class,0);
		}
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterEscritura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitEscritura(this);
		}
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_escritura);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			pr_escribir();
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(395);
				match(CADENA_CARACTERES);
				}
				break;
			case 2:
				{
				setState(396);
				llamada_funcion();
				}
				break;
			case 3:
				{
				setState(397);
				var();
				}
				break;
			case 4:
				{
				setState(398);
				operacion();
				}
				break;
			case 5:
				{
				setState(399);
				numero();
				}
				break;
			}
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(402);
					coma();
					setState(408);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(403);
						var();
						}
						break;
					case 2:
						{
						setState(404);
						match(CADENA_CARACTERES);
						}
						break;
					case 3:
						{
						setState(405);
						llamada_funcion();
						}
						break;
					case 4:
						{
						setState(406);
						operacion();
						}
						break;
					case 5:
						{
						setState(407);
						numero();
						}
						break;
					}
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << PD) | (1L << CI) | (1L << CD) | (1L << FIN) | (1L << COMA) | (1L << DOS_PUNTOS))) != 0)) {
				{
				setState(415);
				signo_puntuacion();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LecturaContext extends ParserRuleContext {
		public Pr_leerContext pr_leer() {
			return getRuleContext(Pr_leerContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterLectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitLectura(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			pr_leer();
			setState(419);
			var();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicionContext extends ParserRuleContext {
		public Pr_definirContext pr_definir() {
			return getRuleContext(Pr_definirContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Pr_comoContext pr_como() {
			return getRuleContext(Pr_comoContext.class,0);
		}
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public Signo_puntuacionContext signo_puntuacion() {
			return getRuleContext(Signo_puntuacionContext.class,0);
		}
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterDefinicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitDefinicion(this);
		}
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_definicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			pr_definir();
			setState(422);
			var();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(423);
				coma();
				setState(424);
				var();
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			pr_como();
			setState(432);
			tipo_de_datos();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PI) | (1L << PD) | (1L << CI) | (1L << CD) | (1L << FIN) | (1L << COMA) | (1L << DOS_PUNTOS))) != 0)) {
				{
				setState(433);
				signo_puntuacion();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Corchete_izqContext corchete_izq() {
			return getRuleContext(Corchete_izqContext.class,0);
		}
		public Corchete_derContext corchete_der() {
			return getRuleContext(Corchete_derContext.class,0);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<Llamada_funcionContext> llamada_funcion() {
			return getRuleContexts(Llamada_funcionContext.class);
		}
		public Llamada_funcionContext llamada_funcion(int i) {
			return getRuleContext(Llamada_funcionContext.class,i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public TerminalNode DIMENSION() { return getToken(gramaticaParser.DIMENSION, 0); }
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitDimension(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIMENSION) {
				{
				setState(436);
				match(DIMENSION);
				}
			}

			setState(439);
			var();
			setState(440);
			corchete_izq();
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(441);
				var();
				}
				break;
			case 2:
				{
				setState(442);
				numero();
				}
				break;
			case 3:
				{
				setState(443);
				llamada_funcion();
				}
				break;
			case 4:
				{
				setState(444);
				operacion();
				}
				break;
			}
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(447);
				coma();
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(448);
					var();
					}
					break;
				case 2:
					{
					setState(449);
					numero();
					}
					break;
				case 3:
					{
					setState(450);
					llamada_funcion();
					}
					break;
				case 4:
					{
					setState(451);
					operacion();
					}
					break;
				}
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459);
			corchete_der();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public Condicion_logicaContext condicion_logica() {
			return getRuleContext(Condicion_logicaContext.class,0);
		}
		public Operacion_logicaContext operacion_logica() {
			return getRuleContext(Operacion_logicaContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(461);
				condicion_logica();
				}
				break;
			case 2:
				{
				setState(462);
				operacion_logica();
				}
				break;
			case 3:
				{
				setState(463);
				asignacion();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametros_funcionContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public Parametros_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterParametros_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitParametros_funcion(this);
		}
	}

	public final Parametros_funcionContext parametros_funcion() throws RecognitionException {
		Parametros_funcionContext _localctx = new Parametros_funcionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_parametros_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			var();
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(467);
				coma();
				setState(468);
				var();
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dev_funcionContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Op_asignacionContext op_asignacion() {
			return getRuleContext(Op_asignacionContext.class,0);
		}
		public Dev_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dev_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterDev_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitDev_funcion(this);
		}
	}

	public final Dev_funcionContext dev_funcion() throws RecognitionException {
		Dev_funcionContext _localctx = new Dev_funcionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_dev_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			var();
			setState(476);
			op_asignacion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InteriorContext extends ParserRuleContext {
		public LineaContext linea() {
			return getRuleContext(LineaContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public Condicion_siContext condicion_si() {
			return getRuleContext(Condicion_siContext.class,0);
		}
		public BucleContext bucle() {
			return getRuleContext(BucleContext.class,0);
		}
		public SegunContext segun() {
			return getRuleContext(SegunContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public InteriorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterInterior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitInterior(this);
		}
	}

	public final InteriorContext interior() throws RecognitionException {
		InteriorContext _localctx = new InteriorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_interior);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(478);
				linea();
				}
				break;
			case 2:
				{
				setState(479);
				dimension();
				}
				break;
			case 3:
				{
				setState(480);
				operacion();
				}
				break;
			case 4:
				{
				setState(481);
				condicion_si();
				}
				break;
			case 5:
				{
				setState(482);
				bucle();
				}
				break;
			case 6:
				{
				setState(483);
				segun();
				}
				break;
			case 7:
				{
				setState(484);
				comentario();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineaContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public EscrituraContext escritura() {
			return getRuleContext(EscrituraContext.class,0);
		}
		public LineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterLinea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitLinea(this);
		}
	}

	public final LineaContext linea() throws RecognitionException {
		LineaContext _localctx = new LineaContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_linea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(487);
				asignacion();
				}
				break;
			case 2:
				{
				setState(488);
				definicion();
				}
				break;
			case 3:
				{
				setState(489);
				llamada_funcion();
				}
				break;
			case 4:
				{
				setState(490);
				lectura();
				}
				break;
			case 5:
				{
				setState(491);
				escritura();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condicion_siContext extends ParserRuleContext {
		public Cabecera_siContext cabecera_si() {
			return getRuleContext(Cabecera_siContext.class,0);
		}
		public Cuerpo_siContext cuerpo_si() {
			return getRuleContext(Cuerpo_siContext.class,0);
		}
		public Condicion_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCondicion_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCondicion_si(this);
		}
	}

	public final Condicion_siContext condicion_si() throws RecognitionException {
		Condicion_siContext _localctx = new Condicion_siContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_condicion_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			cabecera_si();
			setState(495);
			cuerpo_si();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cabecera_siContext extends ParserRuleContext {
		public Pr_siContext pr_si() {
			return getRuleContext(Pr_siContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Pr_entoncesContext pr_entonces() {
			return getRuleContext(Pr_entoncesContext.class,0);
		}
		public Cabecera_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCabecera_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCabecera_si(this);
		}
	}

	public final Cabecera_siContext cabecera_si() throws RecognitionException {
		Cabecera_siContext _localctx = new Cabecera_siContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_cabecera_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			pr_si();
			setState(498);
			parametros();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PCLAVE_ENTONCES) {
				{
				setState(499);
				pr_entonces();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_siContext extends ParserRuleContext {
		public Pr_finsiContext pr_finsi() {
			return getRuleContext(Pr_finsiContext.class,0);
		}
		public List<InteriorContext> interior() {
			return getRuleContexts(InteriorContext.class);
		}
		public InteriorContext interior(int i) {
			return getRuleContext(InteriorContext.class,i);
		}
		public Pr_sinoContext pr_sino() {
			return getRuleContext(Pr_sinoContext.class,0);
		}
		public Cuerpo_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCuerpo_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCuerpo_si(this);
		}
	}

	public final Cuerpo_siContext cuerpo_si() throws RecognitionException {
		Cuerpo_siContext _localctx = new Cuerpo_siContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_cuerpo_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(502);
				interior();
				}
				}
				setState(505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PCLAVE_DEFINIR) | (1L << PCLAVE_LEER) | (1L << PCLAVE_ESCRIBIR) | (1L << PCLAVE_SI) | (1L << PCLAVE_PARA) | (1L << PCLAVE_MIENTRAS) | (1L << PCLAVE_REPETIR) | (1L << PCLAVE_SEGUN) | (1L << DIMENSION) | (1L << INT) | (1L << FLOAT) | (1L << IDENTIFICADOR) | (1L << CADENA_CARACTERES) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA))) != 0) );
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PCLAVE_SINO) {
				{
				setState(507);
				pr_sino();
				{
				setState(509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(508);
					interior();
					}
					}
					setState(511); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PCLAVE_DEFINIR) | (1L << PCLAVE_LEER) | (1L << PCLAVE_ESCRIBIR) | (1L << PCLAVE_SI) | (1L << PCLAVE_PARA) | (1L << PCLAVE_MIENTRAS) | (1L << PCLAVE_REPETIR) | (1L << PCLAVE_SEGUN) | (1L << DIMENSION) | (1L << INT) | (1L << FLOAT) | (1L << IDENTIFICADOR) | (1L << CADENA_CARACTERES) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA))) != 0) );
				}
				}
			}

			setState(515);
			pr_finsi();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucleContext extends ParserRuleContext {
		public Bucle_mientrasContext bucle_mientras() {
			return getRuleContext(Bucle_mientrasContext.class,0);
		}
		public Bucle_paraContext bucle_para() {
			return getRuleContext(Bucle_paraContext.class,0);
		}
		public Bucle_repetirContext bucle_repetir() {
			return getRuleContext(Bucle_repetirContext.class,0);
		}
		public BucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitBucle(this);
		}
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_bucle);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PCLAVE_MIENTRAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				bucle_mientras();
				}
				break;
			case PCLAVE_PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				bucle_para();
				}
				break;
			case PCLAVE_REPETIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				bucle_repetir();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bucle_mientrasContext extends ParserRuleContext {
		public Cabecera_mientrasContext cabecera_mientras() {
			return getRuleContext(Cabecera_mientrasContext.class,0);
		}
		public Cuerpo_mientrasContext cuerpo_mientras() {
			return getRuleContext(Cuerpo_mientrasContext.class,0);
		}
		public Bucle_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterBucle_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitBucle_mientras(this);
		}
	}

	public final Bucle_mientrasContext bucle_mientras() throws RecognitionException {
		Bucle_mientrasContext _localctx = new Bucle_mientrasContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_bucle_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			cabecera_mientras();
			setState(523);
			cuerpo_mientras();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cabecera_mientrasContext extends ParserRuleContext {
		public Pr_mientrasContext pr_mientras() {
			return getRuleContext(Pr_mientrasContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Pr_hacerContext pr_hacer() {
			return getRuleContext(Pr_hacerContext.class,0);
		}
		public Cabecera_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCabecera_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCabecera_mientras(this);
		}
	}

	public final Cabecera_mientrasContext cabecera_mientras() throws RecognitionException {
		Cabecera_mientrasContext _localctx = new Cabecera_mientrasContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_cabecera_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			pr_mientras();
			setState(526);
			parametros();
			setState(527);
			pr_hacer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_mientrasContext extends ParserRuleContext {
		public Pr_finmientrasContext pr_finmientras() {
			return getRuleContext(Pr_finmientrasContext.class,0);
		}
		public List<InteriorContext> interior() {
			return getRuleContexts(InteriorContext.class);
		}
		public InteriorContext interior(int i) {
			return getRuleContext(InteriorContext.class,i);
		}
		public Cuerpo_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCuerpo_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCuerpo_mientras(this);
		}
	}

	public final Cuerpo_mientrasContext cuerpo_mientras() throws RecognitionException {
		Cuerpo_mientrasContext _localctx = new Cuerpo_mientrasContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_cuerpo_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(529);
				interior();
				}
				}
				setState(532); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PCLAVE_DEFINIR) | (1L << PCLAVE_LEER) | (1L << PCLAVE_ESCRIBIR) | (1L << PCLAVE_SI) | (1L << PCLAVE_PARA) | (1L << PCLAVE_MIENTRAS) | (1L << PCLAVE_REPETIR) | (1L << PCLAVE_SEGUN) | (1L << DIMENSION) | (1L << INT) | (1L << FLOAT) | (1L << IDENTIFICADOR) | (1L << CADENA_CARACTERES) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA))) != 0) );
			setState(534);
			pr_finmientras();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bucle_paraContext extends ParserRuleContext {
		public Cabecera_paraContext cabecera_para() {
			return getRuleContext(Cabecera_paraContext.class,0);
		}
		public Cuerpo_paraContext cuerpo_para() {
			return getRuleContext(Cuerpo_paraContext.class,0);
		}
		public Bucle_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterBucle_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitBucle_para(this);
		}
	}

	public final Bucle_paraContext bucle_para() throws RecognitionException {
		Bucle_paraContext _localctx = new Bucle_paraContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_bucle_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			cabecera_para();
			setState(537);
			cuerpo_para();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cabecera_paraContext extends ParserRuleContext {
		public Pr_paraContext pr_para() {
			return getRuleContext(Pr_paraContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Pr_hastaContext pr_hasta() {
			return getRuleContext(Pr_hastaContext.class,0);
		}
		public Pr_hacerContext pr_hacer() {
			return getRuleContext(Pr_hacerContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public Pr_pasoContext pr_paso() {
			return getRuleContext(Pr_pasoContext.class,0);
		}
		public Cabecera_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCabecera_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCabecera_para(this);
		}
	}

	public final Cabecera_paraContext cabecera_para() throws RecognitionException {
		Cabecera_paraContext _localctx = new Cabecera_paraContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_cabecera_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			pr_para();
			setState(540);
			parametros();
			setState(541);
			pr_hasta();
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
			case CADENA_CARACTERES:
				{
				setState(542);
				var();
				}
				break;
			case INT:
			case FLOAT:
				{
				setState(543);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PCLAVE_PASO) {
				{
				setState(546);
				pr_paso();
				setState(549);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFICADOR:
				case CADENA_CARACTERES:
					{
					setState(547);
					var();
					}
					break;
				case INT:
				case FLOAT:
					{
					setState(548);
					numero();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(553);
			pr_hacer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_paraContext extends ParserRuleContext {
		public Pr_finparaContext pr_finpara() {
			return getRuleContext(Pr_finparaContext.class,0);
		}
		public List<InteriorContext> interior() {
			return getRuleContexts(InteriorContext.class);
		}
		public InteriorContext interior(int i) {
			return getRuleContext(InteriorContext.class,i);
		}
		public Cuerpo_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCuerpo_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCuerpo_para(this);
		}
	}

	public final Cuerpo_paraContext cuerpo_para() throws RecognitionException {
		Cuerpo_paraContext _localctx = new Cuerpo_paraContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_cuerpo_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(555);
				interior();
				}
				}
				setState(558); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PCLAVE_DEFINIR) | (1L << PCLAVE_LEER) | (1L << PCLAVE_ESCRIBIR) | (1L << PCLAVE_SI) | (1L << PCLAVE_PARA) | (1L << PCLAVE_MIENTRAS) | (1L << PCLAVE_REPETIR) | (1L << PCLAVE_SEGUN) | (1L << DIMENSION) | (1L << INT) | (1L << FLOAT) | (1L << IDENTIFICADOR) | (1L << CADENA_CARACTERES) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA))) != 0) );
			setState(560);
			pr_finpara();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bucle_repetirContext extends ParserRuleContext {
		public Cabecera_repetirContext cabecera_repetir() {
			return getRuleContext(Cabecera_repetirContext.class,0);
		}
		public Cuerpo_repetirContext cuerpo_repetir() {
			return getRuleContext(Cuerpo_repetirContext.class,0);
		}
		public Condicion_repetirContext condicion_repetir() {
			return getRuleContext(Condicion_repetirContext.class,0);
		}
		public Bucle_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterBucle_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitBucle_repetir(this);
		}
	}

	public final Bucle_repetirContext bucle_repetir() throws RecognitionException {
		Bucle_repetirContext _localctx = new Bucle_repetirContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_bucle_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			cabecera_repetir();
			setState(563);
			cuerpo_repetir();
			setState(564);
			condicion_repetir();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cabecera_repetirContext extends ParserRuleContext {
		public Pr_repetirContext pr_repetir() {
			return getRuleContext(Pr_repetirContext.class,0);
		}
		public Cabecera_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCabecera_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCabecera_repetir(this);
		}
	}

	public final Cabecera_repetirContext cabecera_repetir() throws RecognitionException {
		Cabecera_repetirContext _localctx = new Cabecera_repetirContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_cabecera_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			pr_repetir();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_repetirContext extends ParserRuleContext {
		public List<InteriorContext> interior() {
			return getRuleContexts(InteriorContext.class);
		}
		public InteriorContext interior(int i) {
			return getRuleContext(InteriorContext.class,i);
		}
		public Cuerpo_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCuerpo_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCuerpo_repetir(this);
		}
	}

	public final Cuerpo_repetirContext cuerpo_repetir() throws RecognitionException {
		Cuerpo_repetirContext _localctx = new Cuerpo_repetirContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_cuerpo_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(568);
				interior();
				}
				}
				setState(571); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PCLAVE_DEFINIR) | (1L << PCLAVE_LEER) | (1L << PCLAVE_ESCRIBIR) | (1L << PCLAVE_SI) | (1L << PCLAVE_PARA) | (1L << PCLAVE_MIENTRAS) | (1L << PCLAVE_REPETIR) | (1L << PCLAVE_SEGUN) | (1L << DIMENSION) | (1L << INT) | (1L << FLOAT) | (1L << IDENTIFICADOR) | (1L << CADENA_CARACTERES) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condicion_repetirContext extends ParserRuleContext {
		public Pr_hastaqueContext pr_hastaque() {
			return getRuleContext(Pr_hastaqueContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public Condicion_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCondicion_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCondicion_repetir(this);
		}
	}

	public final Condicion_repetirContext condicion_repetir() throws RecognitionException {
		Condicion_repetirContext _localctx = new Condicion_repetirContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_condicion_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			pr_hastaque();
			setState(574);
			parametros();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegunContext extends ParserRuleContext {
		public Cabecera_segunContext cabecera_segun() {
			return getRuleContext(Cabecera_segunContext.class,0);
		}
		public Tipo_segunContext tipo_segun() {
			return getRuleContext(Tipo_segunContext.class,0);
		}
		public SegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterSegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitSegun(this);
		}
	}

	public final SegunContext segun() throws RecognitionException {
		SegunContext _localctx = new SegunContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_segun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			cabecera_segun();
			setState(577);
			tipo_segun();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cabecera_segunContext extends ParserRuleContext {
		public Pr_segunContext pr_segun() {
			return getRuleContext(Pr_segunContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Pr_hacerContext pr_hacer() {
			return getRuleContext(Pr_hacerContext.class,0);
		}
		public Cabecera_segunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_segun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCabecera_segun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCabecera_segun(this);
		}
	}

	public final Cabecera_segunContext cabecera_segun() throws RecognitionException {
		Cabecera_segunContext _localctx = new Cabecera_segunContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_cabecera_segun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			pr_segun();
			setState(580);
			var();
			setState(581);
			pr_hacer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_segunContext extends ParserRuleContext {
		public List<Dos_puntosContext> dos_puntos() {
			return getRuleContexts(Dos_puntosContext.class);
		}
		public Dos_puntosContext dos_puntos(int i) {
			return getRuleContext(Dos_puntosContext.class,i);
		}
		public List<Cuerpo_segunContext> cuerpo_segun() {
			return getRuleContexts(Cuerpo_segunContext.class);
		}
		public Cuerpo_segunContext cuerpo_segun(int i) {
			return getRuleContext(Cuerpo_segunContext.class,i);
		}
		public Tipo_deotromodoContext tipo_deotromodo() {
			return getRuleContext(Tipo_deotromodoContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> CADENA_CARACTERES() { return getTokens(gramaticaParser.CADENA_CARACTERES); }
		public TerminalNode CADENA_CARACTERES(int i) {
			return getToken(gramaticaParser.CADENA_CARACTERES, i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public Tipo_segunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_segun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterTipo_segun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitTipo_segun(this);
		}
	}

	public final Tipo_segunContext tipo_segun() throws RecognitionException {
		Tipo_segunContext _localctx = new Tipo_segunContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_tipo_segun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(586);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(583);
						var();
						}
						break;
					case 2:
						{
						setState(584);
						match(CADENA_CARACTERES);
						}
						break;
					case 3:
						{
						setState(585);
						numero();
						}
						break;
					}
					setState(588);
					dos_puntos();
					setState(589);
					cuerpo_segun();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(593); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(595);
				tipo_deotromodo();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_deotromodoContext extends ParserRuleContext {
		public Pr_deotromodoContext pr_deotromodo() {
			return getRuleContext(Pr_deotromodoContext.class,0);
		}
		public Dos_puntosContext dos_puntos() {
			return getRuleContext(Dos_puntosContext.class,0);
		}
		public Cuerpo_segunContext cuerpo_segun() {
			return getRuleContext(Cuerpo_segunContext.class,0);
		}
		public Pr_finsegunContext pr_finsegun() {
			return getRuleContext(Pr_finsegunContext.class,0);
		}
		public Tipo_deotromodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_deotromodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterTipo_deotromodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitTipo_deotromodo(this);
		}
	}

	public final Tipo_deotromodoContext tipo_deotromodo() throws RecognitionException {
		Tipo_deotromodoContext _localctx = new Tipo_deotromodoContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_tipo_deotromodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			pr_deotromodo();
			setState(599);
			dos_puntos();
			setState(600);
			cuerpo_segun();
			setState(601);
			pr_finsegun();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_segunContext extends ParserRuleContext {
		public List<InteriorContext> interior() {
			return getRuleContexts(InteriorContext.class);
		}
		public InteriorContext interior(int i) {
			return getRuleContext(InteriorContext.class,i);
		}
		public Cuerpo_segunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_segun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCuerpo_segun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCuerpo_segun(this);
		}
	}

	public final Cuerpo_segunContext cuerpo_segun() throws RecognitionException {
		Cuerpo_segunContext _localctx = new Cuerpo_segunContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_cuerpo_segun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(603);
					interior();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(606); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public Cabecera_funcionContext cabecera_funcion() {
			return getRuleContext(Cabecera_funcionContext.class,0);
		}
		public Cuerpo_funcionContext cuerpo_funcion() {
			return getRuleContext(Cuerpo_funcionContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitFuncion(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			cabecera_funcion();
			setState(609);
			cuerpo_funcion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cabecera_funcionContext extends ParserRuleContext {
		public Nombre_funcionContext nombre_funcion() {
			return getRuleContext(Nombre_funcionContext.class,0);
		}
		public Pr_funcionContext pr_funcion() {
			return getRuleContext(Pr_funcionContext.class,0);
		}
		public Pr_algoritmoContext pr_algoritmo() {
			return getRuleContext(Pr_algoritmoContext.class,0);
		}
		public Dev_funcionContext dev_funcion() {
			return getRuleContext(Dev_funcionContext.class,0);
		}
		public Parentesis_izqContext parentesis_izq() {
			return getRuleContext(Parentesis_izqContext.class,0);
		}
		public Parentesis_derContext parentesis_der() {
			return getRuleContext(Parentesis_derContext.class,0);
		}
		public Parametros_funcionContext parametros_funcion() {
			return getRuleContext(Parametros_funcionContext.class,0);
		}
		public Cabecera_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCabecera_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCabecera_funcion(this);
		}
	}

	public final Cabecera_funcionContext cabecera_funcion() throws RecognitionException {
		Cabecera_funcionContext _localctx = new Cabecera_funcionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_cabecera_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PCLAVE_FUNCION:
				{
				setState(611);
				pr_funcion();
				}
				break;
			case PCLAVE_ALGORITMO:
				{
				setState(612);
				pr_algoritmo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(615);
				dev_funcion();
				}
				break;
			}
			setState(618);
			nombre_funcion();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PI) {
				{
				setState(619);
				parentesis_izq();
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFICADOR || _la==CADENA_CARACTERES) {
					{
					setState(620);
					parametros_funcion();
					}
				}

				setState(623);
				parentesis_der();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nombre_funcionContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Nombre_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterNombre_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitNombre_funcion(this);
		}
	}

	public final Nombre_funcionContext nombre_funcion() throws RecognitionException {
		Nombre_funcionContext _localctx = new Nombre_funcionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_nombre_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			identificador();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cuerpo_funcionContext extends ParserRuleContext {
		public Pr_finfuncionContext pr_finfuncion() {
			return getRuleContext(Pr_finfuncionContext.class,0);
		}
		public Pr_finalgoritmoContext pr_finalgoritmo() {
			return getRuleContext(Pr_finalgoritmoContext.class,0);
		}
		public List<InteriorContext> interior() {
			return getRuleContexts(InteriorContext.class);
		}
		public InteriorContext interior(int i) {
			return getRuleContext(InteriorContext.class,i);
		}
		public TerminalNode TERMINAL() { return getToken(gramaticaParser.TERMINAL, 0); }
		public Cuerpo_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterCuerpo_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitCuerpo_funcion(this);
		}
	}

	public final Cuerpo_funcionContext cuerpo_funcion() throws RecognitionException {
		Cuerpo_funcionContext _localctx = new Cuerpo_funcionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_cuerpo_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(629);
				interior();
				}
				}
				setState(632); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PCLAVE_DEFINIR) | (1L << PCLAVE_LEER) | (1L << PCLAVE_ESCRIBIR) | (1L << PCLAVE_SI) | (1L << PCLAVE_PARA) | (1L << PCLAVE_MIENTRAS) | (1L << PCLAVE_REPETIR) | (1L << PCLAVE_SEGUN) | (1L << DIMENSION) | (1L << INT) | (1L << FLOAT) | (1L << IDENTIFICADOR) | (1L << CADENA_CARACTERES) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA))) != 0) );
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TERMINAL) {
				{
				setState(634);
				match(TERMINAL);
				}
			}

			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PCLAVE_FINFUNCION:
				{
				setState(637);
				pr_finfuncion();
				}
				break;
			case PCLAVE_FINALGORITMO:
				{
				setState(638);
				pr_finalgoritmo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Llamada_funcionContext extends ParserRuleContext {
		public Nombre_funcionContext nombre_funcion() {
			return getRuleContext(Nombre_funcionContext.class,0);
		}
		public Parentesis_izqContext parentesis_izq() {
			return getRuleContext(Parentesis_izqContext.class,0);
		}
		public Parentesis_derContext parentesis_der() {
			return getRuleContext(Parentesis_derContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<Llamada_funcionContext> llamada_funcion() {
			return getRuleContexts(Llamada_funcionContext.class);
		}
		public Llamada_funcionContext llamada_funcion(int i) {
			return getRuleContext(Llamada_funcionContext.class,i);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitLlamada_funcion(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			nombre_funcion();
			setState(642);
			parentesis_izq();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << IDENTIFICADOR) | (1L << CADENA_CARACTERES))) != 0)) {
				{
				setState(647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(643);
					var();
					}
					break;
				case 2:
					{
					setState(644);
					numero();
					}
					break;
				case 3:
					{
					setState(645);
					llamada_funcion();
					}
					break;
				case 4:
					{
					setState(646);
					operacion();
					}
					break;
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(649);
					coma();
					setState(654);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						setState(650);
						var();
						}
						break;
					case 2:
						{
						setState(651);
						numero();
						}
						break;
					case 3:
						{
						setState(652);
						llamada_funcion();
						}
						break;
					case 4:
						{
						setState(653);
						operacion();
						}
						break;
					}
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(663);
			parentesis_der();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextosContext extends ParserRuleContext {
		public TerminalNode TEXTOCOMENTARIOML() { return getToken(gramaticaParser.TEXTOCOMENTARIOML, 0); }
		public List<TerminalNode> TEXTOCOMENTARIOUL() { return getTokens(gramaticaParser.TEXTOCOMENTARIOUL); }
		public TerminalNode TEXTOCOMENTARIOUL(int i) {
			return getToken(gramaticaParser.TEXTOCOMENTARIOUL, i);
		}
		public TextosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterTextos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitTextos(this);
		}
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_textos);
		try {
			int _alt;
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTOCOMENTARIOML:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(TEXTOCOMENTARIOML);
				}
				break;
			case TEXTOCOMENTARIOUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(667); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(666);
						match(TEXTOCOMENTARIOUL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(669); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIOABRIR() { return getToken(gramaticaParser.COMENTARIOABRIR, 0); }
		public TerminalNode COMENTARIOCERRAR() { return getToken(gramaticaParser.COMENTARIOCERRAR, 0); }
		public List<TextosContext> textos() {
			return getRuleContexts(TextosContext.class);
		}
		public TextosContext textos(int i) {
			return getRuleContext(TextosContext.class,i);
		}
		public List<TerminalNode> TERMINAL() { return getTokens(gramaticaParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(gramaticaParser.TERMINAL, i);
		}
		public TerminalNode COMENTARIOLINEA() { return getToken(gramaticaParser.COMENTARIOLINEA, 0); }
		public TerminalNode FINAL_COMENTARIO_UL() { return getToken(gramaticaParser.FINAL_COMENTARIO_UL, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaParserListener ) ((gramaticaParserListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_comentario);
		int _la;
		try {
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				match(COMENTARIOABRIR);
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (TERMINAL - 57)) | (1L << (TEXTOCOMENTARIOML - 57)) | (1L << (TEXTOCOMENTARIOUL - 57)))) != 0)) {
					{
					setState(676);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTOCOMENTARIOML:
					case TEXTOCOMENTARIOUL:
						{
						setState(674);
						textos();
						}
						break;
					case TERMINAL:
						{
						setState(675);
						match(TERMINAL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(681);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(COMENTARIOLINEA);
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTOCOMENTARIOML || _la==TEXTOCOMENTARIOUL) {
					{
					{
					setState(683);
					textos();
					}
					}
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(689);
				match(FINAL_COMENTARIO_UL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u02b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\3\2\3\2\5\2\u00bd"+
		"\n\2\3\2\3\2\7\2\u00c1\n\2\f\2\16\2\u00c4\13\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\5\36\u00fe\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\5-\u0124\n-\3.\3.\3.\3.\3.\5.\u012b\n.\3/\3/\3\60"+
		"\5\60\u0130\n\60\3\60\3\60\3\60\3\60\5\60\u0136\n\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\5\60\u013e\n\60\3\60\5\60\u0141\n\60\3\60\3\60\5\60\u0145"+
		"\n\60\3\60\3\60\3\60\3\60\5\60\u014b\n\60\3\60\5\60\u014e\n\60\7\60\u0150"+
		"\n\60\f\60\16\60\u0153\13\60\3\61\3\61\5\61\u0157\n\61\3\61\3\61\3\61"+
		"\5\61\u015c\n\61\3\61\3\61\3\61\5\61\u0161\n\61\7\61\u0163\n\61\f\61\16"+
		"\61\u0166\13\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\39\39\39\39\39\59\u017d\n9\3:\3:\5:\u0181\n:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\5:\u018b\n:\3;\3;\3;\3;\3;\3;\5;\u0193\n;\3;\3;\3;\3"+
		";\3;\3;\5;\u019b\n;\7;\u019d\n;\f;\16;\u01a0\13;\3;\5;\u01a3\n;\3<\3<"+
		"\3<\3=\3=\3=\3=\3=\7=\u01ad\n=\f=\16=\u01b0\13=\3=\3=\3=\5=\u01b5\n=\3"+
		">\5>\u01b8\n>\3>\3>\3>\3>\3>\3>\5>\u01c0\n>\3>\3>\3>\3>\3>\5>\u01c7\n"+
		">\7>\u01c9\n>\f>\16>\u01cc\13>\3>\3>\3?\3?\3?\5?\u01d3\n?\3@\3@\3@\3@"+
		"\7@\u01d9\n@\f@\16@\u01dc\13@\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\5B\u01e8\n"+
		"B\3C\3C\3C\3C\3C\5C\u01ef\nC\3D\3D\3D\3E\3E\3E\5E\u01f7\nE\3F\6F\u01fa"+
		"\nF\rF\16F\u01fb\3F\3F\6F\u0200\nF\rF\16F\u0201\5F\u0204\nF\3F\3F\3G\3"+
		"G\3G\5G\u020b\nG\3H\3H\3H\3I\3I\3I\3I\3J\6J\u0215\nJ\rJ\16J\u0216\3J\3"+
		"J\3K\3K\3K\3L\3L\3L\3L\3L\5L\u0223\nL\3L\3L\3L\5L\u0228\nL\5L\u022a\n"+
		"L\3L\3L\3M\6M\u022f\nM\rM\16M\u0230\3M\3M\3N\3N\3N\3N\3O\3O\3P\6P\u023c"+
		"\nP\rP\16P\u023d\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3T\3T\3T\5T\u024d\nT\3"+
		"T\3T\3T\6T\u0252\nT\rT\16T\u0253\3T\5T\u0257\nT\3U\3U\3U\3U\3U\3V\6V\u025f"+
		"\nV\rV\16V\u0260\3W\3W\3W\3X\3X\5X\u0268\nX\3X\5X\u026b\nX\3X\3X\3X\5"+
		"X\u0270\nX\3X\3X\5X\u0274\nX\3Y\3Y\3Z\6Z\u0279\nZ\rZ\16Z\u027a\3Z\5Z\u027e"+
		"\nZ\3Z\3Z\5Z\u0282\nZ\3[\3[\3[\3[\3[\3[\5[\u028a\n[\3[\3[\3[\3[\3[\5["+
		"\u0291\n[\7[\u0293\n[\f[\16[\u0296\13[\5[\u0298\n[\3[\3[\3\\\3\\\6\\\u029e"+
		"\n\\\r\\\16\\\u029f\5\\\u02a2\n\\\3]\3]\3]\7]\u02a7\n]\f]\16]\u02aa\13"+
		"]\3]\3]\3]\7]\u02af\n]\f]\16]\u02b2\13]\3]\5]\u02b5\n]\3]\2\2^\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\2\6\3\2\35 \3\2\"#\4"+
		"\2,,//\3\2\33\34\2\u02cf\2\u00c2\3\2\2\2\4\u00c5\3\2\2\2\6\u00c7\3\2\2"+
		"\2\b\u00c9\3\2\2\2\n\u00cb\3\2\2\2\f\u00cd\3\2\2\2\16\u00cf\3\2\2\2\20"+
		"\u00d1\3\2\2\2\22\u00d3\3\2\2\2\24\u00d5\3\2\2\2\26\u00d7\3\2\2\2\30\u00d9"+
		"\3\2\2\2\32\u00db\3\2\2\2\34\u00dd\3\2\2\2\36\u00df\3\2\2\2 \u00e1\3\2"+
		"\2\2\"\u00e3\3\2\2\2$\u00e5\3\2\2\2&\u00e7\3\2\2\2(\u00e9\3\2\2\2*\u00eb"+
		"\3\2\2\2,\u00ed\3\2\2\2.\u00ef\3\2\2\2\60\u00f1\3\2\2\2\62\u00f3\3\2\2"+
		"\2\64\u00f5\3\2\2\2\66\u00f7\3\2\2\28\u00f9\3\2\2\2:\u00fd\3\2\2\2<\u00ff"+
		"\3\2\2\2>\u0101\3\2\2\2@\u0103\3\2\2\2B\u0105\3\2\2\2D\u0107\3\2\2\2F"+
		"\u0109\3\2\2\2H\u010b\3\2\2\2J\u010d\3\2\2\2L\u010f\3\2\2\2N\u0111\3\2"+
		"\2\2P\u0113\3\2\2\2R\u0115\3\2\2\2T\u0117\3\2\2\2V\u0119\3\2\2\2X\u0123"+
		"\3\2\2\2Z\u012a\3\2\2\2\\\u012c\3\2\2\2^\u012f\3\2\2\2`\u0156\3\2\2\2"+
		"b\u0167\3\2\2\2d\u0169\3\2\2\2f\u016b\3\2\2\2h\u016d\3\2\2\2j\u016f\3"+
		"\2\2\2l\u0171\3\2\2\2n\u0173\3\2\2\2p\u017c\3\2\2\2r\u0180\3\2\2\2t\u018c"+
		"\3\2\2\2v\u01a4\3\2\2\2x\u01a7\3\2\2\2z\u01b7\3\2\2\2|\u01d2\3\2\2\2~"+
		"\u01d4\3\2\2\2\u0080\u01dd\3\2\2\2\u0082\u01e7\3\2\2\2\u0084\u01ee\3\2"+
		"\2\2\u0086\u01f0\3\2\2\2\u0088\u01f3\3\2\2\2\u008a\u01f9\3\2\2\2\u008c"+
		"\u020a\3\2\2\2\u008e\u020c\3\2\2\2\u0090\u020f\3\2\2\2\u0092\u0214\3\2"+
		"\2\2\u0094\u021a\3\2\2\2\u0096\u021d\3\2\2\2\u0098\u022e\3\2\2\2\u009a"+
		"\u0234\3\2\2\2\u009c\u0238\3\2\2\2\u009e\u023b\3\2\2\2\u00a0\u023f\3\2"+
		"\2\2\u00a2\u0242\3\2\2\2\u00a4\u0245\3\2\2\2\u00a6\u0251\3\2\2\2\u00a8"+
		"\u0258\3\2\2\2\u00aa\u025e\3\2\2\2\u00ac\u0262\3\2\2\2\u00ae\u0267\3\2"+
		"\2\2\u00b0\u0275\3\2\2\2\u00b2\u0278\3\2\2\2\u00b4\u0283\3\2\2\2\u00b6"+
		"\u02a1\3\2\2\2\u00b8\u02b4\3\2\2\2\u00ba\u00bd\5\u00acW\2\u00bb\u00bd"+
		"\5\u00b8]\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2"+
		"\2\u00be\u00bf\7;\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\3\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7\3\2\2\u00c6\5\3\2\2\2\u00c7\u00c8\7\4\2\2"+
		"\u00c8\7\3\2\2\2\u00c9\u00ca\7\5\2\2\u00ca\t\3\2\2\2\u00cb\u00cc\7\6\2"+
		"\2\u00cc\13\3\2\2\2\u00cd\u00ce\7\7\2\2\u00ce\r\3\2\2\2\u00cf\u00d0\7"+
		"\b\2\2\u00d0\17\3\2\2\2\u00d1\u00d2\7\t\2\2\u00d2\21\3\2\2\2\u00d3\u00d4"+
		"\7\n\2\2\u00d4\23\3\2\2\2\u00d5\u00d6\7\13\2\2\u00d6\25\3\2\2\2\u00d7"+
		"\u00d8\7\f\2\2\u00d8\27\3\2\2\2\u00d9\u00da\7\r\2\2\u00da\31\3\2\2\2\u00db"+
		"\u00dc\7\16\2\2\u00dc\33\3\2\2\2\u00dd\u00de\7\17\2\2\u00de\35\3\2\2\2"+
		"\u00df\u00e0\7\20\2\2\u00e0\37\3\2\2\2\u00e1\u00e2\7\21\2\2\u00e2!\3\2"+
		"\2\2\u00e3\u00e4\7\22\2\2\u00e4#\3\2\2\2\u00e5\u00e6\7\23\2\2\u00e6%\3"+
		"\2\2\2\u00e7\u00e8\7\24\2\2\u00e8\'\3\2\2\2\u00e9\u00ea\7\25\2\2\u00ea"+
		")\3\2\2\2\u00eb\u00ec\7\26\2\2\u00ec+\3\2\2\2\u00ed\u00ee\7\27\2\2\u00ee"+
		"-\3\2\2\2\u00ef\u00f0\7\30\2\2\u00f0/\3\2\2\2\u00f1\u00f2\7\31\2\2\u00f2"+
		"\61\3\2\2\2\u00f3\u00f4\7\32\2\2\u00f4\63\3\2\2\2\u00f5\u00f6\t\2\2\2"+
		"\u00f6\65\3\2\2\2\u00f7\u00f8\t\3\2\2\u00f8\67\3\2\2\2\u00f9\u00fa\7$"+
		"\2\2\u00fa9\3\2\2\2\u00fb\u00fe\58\35\2\u00fc\u00fe\7:\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe;\3\2\2\2\u00ff\u0100\7-\2\2\u0100="+
		"\3\2\2\2\u0101\u0102\7.\2\2\u0102?\3\2\2\2\u0103\u0104\7/\2\2\u0104A\3"+
		"\2\2\2\u0105\u0106\7\60\2\2\u0106C\3\2\2\2\u0107\u0108\7\61\2\2\u0108"+
		"E\3\2\2\2\u0109\u010a\7\62\2\2\u010aG\3\2\2\2\u010b\u010c\7\64\2\2\u010c"+
		"I\3\2\2\2\u010d\u010e\7\63\2\2\u010eK\3\2\2\2\u010f\u0110\t\4\2\2\u0110"+
		"M\3\2\2\2\u0111\u0112\7\65\2\2\u0112O\3\2\2\2\u0113\u0114\7\66\2\2\u0114"+
		"Q\3\2\2\2\u0115\u0116\7\67\2\2\u0116S\3\2\2\2\u0117\u0118\78\2\2\u0118"+
		"U\3\2\2\2\u0119\u011a\79\2\2\u011aW\3\2\2\2\u011b\u0124\5<\37\2\u011c"+
		"\u0124\5> \2\u011d\u0124\5@!\2\u011e\u0124\5B\"\2\u011f\u0124\5D#\2\u0120"+
		"\u0124\5F$\2\u0121\u0124\5J&\2\u0122\u0124\5H%\2\u0123\u011b\3\2\2\2\u0123"+
		"\u011c\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u011e\3\2\2\2\u0123\u011f\3\2"+
		"\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"Y\3\2\2\2\u0125\u012b\5N(\2\u0126\u012b\5P)\2\u0127\u012b\5R*\2\u0128"+
		"\u012b\5T+\2\u0129\u012b\5V,\2\u012a\u0125\3\2\2\2\u012a\u0126\3\2\2\2"+
		"\u012a\u0127\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b[\3"+
		"\2\2\2\u012c\u012d\t\5\2\2\u012d]\3\2\2\2\u012e\u0130\5h\65\2\u012f\u012e"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0135\3\2\2\2\u0131\u0136\5:\36\2\u0132"+
		"\u0136\5\66\34\2\u0133\u0136\5z>\2\u0134\u0136\5`\61\2\u0135\u0131\3\2"+
		"\2\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u013d\5X-\2\u0138\u013e\5`\61\2\u0139\u013e\5:\36"+
		"\2\u013a\u013e\5\66\34\2\u013b\u013e\5\\/\2\u013c\u013e\5z>\2\u013d\u0138"+
		"\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0141\5j\66\2\u0140\u013f\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0151\3\2\2\2\u0142\u0144\5X-\2\u0143\u0145"+
		"\5h\65\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u014a\3\2\2\2\u0146"+
		"\u014b\5:\36\2\u0147\u014b\5\66\34\2\u0148\u014b\5\\/\2\u0149\u014b\5"+
		"z>\2\u014a\u0146\3\2\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e\5j\66\2\u014d\u014c\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0142\3\2\2\2\u0150"+
		"\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152_\3\2\2\2"+
		"\u0153\u0151\3\2\2\2\u0154\u0157\5:\36\2\u0155\u0157\5\66\34\2\u0156\u0154"+
		"\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\5Z.\2\u0159"+
		"\u015c\5:\36\2\u015a\u015c\5\66\34\2\u015b\u0159\3\2\2\2\u015b\u015a\3"+
		"\2\2\2\u015c\u0164\3\2\2\2\u015d\u0160\5Z.\2\u015e\u0161\5:\36\2\u015f"+
		"\u0161\5\66\34\2\u0160\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\u0163\3"+
		"\2\2\2\u0162\u015d\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165a\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7)\2\2\u0168"+
		"c\3\2\2\2\u0169\u016a\7*\2\2\u016ae\3\2\2\2\u016b\u016c\7+\2\2\u016cg"+
		"\3\2\2\2\u016d\u016e\7%\2\2\u016ei\3\2\2\2\u016f\u0170\7&\2\2\u0170k\3"+
		"\2\2\2\u0171\u0172\7\'\2\2\u0172m\3\2\2\2\u0173\u0174\7(\2\2\u0174o\3"+
		"\2\2\2\u0175\u017d\5h\65\2\u0176\u017d\5j\66\2\u0177\u017d\5b\62\2\u0178"+
		"\u017d\5d\63\2\u0179\u017d\5f\64\2\u017a\u017d\5l\67\2\u017b\u017d\5n"+
		"8\2\u017c\u0175\3\2\2\2\u017c\u0176\3\2\2\2\u017c\u0177\3\2\2\2\u017c"+
		"\u0178\3\2\2\2\u017c\u0179\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2"+
		"\2\2\u017dq\3\2\2\2\u017e\u0181\5:\36\2\u017f\u0181\5z>\2\u0180\u017e"+
		"\3\2\2\2\u0180\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u018a\5L\'\2\u0183"+
		"\u018b\5\66\34\2\u0184\u018b\5:\36\2\u0185\u018b\7:\2\2\u0186\u018b\5"+
		"`\61\2\u0187\u018b\5\\/\2\u0188\u018b\5\u00b4[\2\u0189\u018b\5z>\2\u018a"+
		"\u0183\3\2\2\2\u018a\u0184\3\2\2\2\u018a\u0185\3\2\2\2\u018a\u0186\3\2"+
		"\2\2\u018a\u0187\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b"+
		"s\3\2\2\2\u018c\u0192\5\f\7\2\u018d\u0193\7:\2\2\u018e\u0193\5\u00b4["+
		"\2\u018f\u0193\5:\36\2\u0190\u0193\5`\61\2\u0191\u0193\5\66\34\2\u0192"+
		"\u018d\3\2\2\2\u0192\u018e\3\2\2\2\u0192\u018f\3\2\2\2\u0192\u0190\3\2"+
		"\2\2\u0192\u0191\3\2\2\2\u0193\u019e\3\2\2\2\u0194\u019a\5d\63\2\u0195"+
		"\u019b\5:\36\2\u0196\u019b\7:\2\2\u0197\u019b\5\u00b4[\2\u0198\u019b\5"+
		"`\61\2\u0199\u019b\5\66\34\2\u019a\u0195\3\2\2\2\u019a\u0196\3\2\2\2\u019a"+
		"\u0197\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b\u019d\3\2"+
		"\2\2\u019c\u0194\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a3\5p"+
		"9\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3u\3\2\2\2\u01a4\u01a5"+
		"\5\n\6\2\u01a5\u01a6\5:\36\2\u01a6w\3\2\2\2\u01a7\u01a8\5\6\4\2\u01a8"+
		"\u01ae\5:\36\2\u01a9\u01aa\5d\63\2\u01aa\u01ab\5:\36\2\u01ab\u01ad\3\2"+
		"\2\2\u01ac\u01a9\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\5\b"+
		"\5\2\u01b2\u01b4\5\64\33\2\u01b3\u01b5\5p9\2\u01b4\u01b3\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5y\3\2\2\2\u01b6\u01b8\7!\2\2\u01b7\u01b6\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\5:\36\2\u01ba\u01bf\5l"+
		"\67\2\u01bb\u01c0\5:\36\2\u01bc\u01c0\5\66\34\2\u01bd\u01c0\5\u00b4[\2"+
		"\u01be\u01c0\5`\61\2\u01bf\u01bb\3\2\2\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0\u01ca\3\2\2\2\u01c1\u01c6\5d\63\2\u01c2"+
		"\u01c7\5:\36\2\u01c3\u01c7\5\66\34\2\u01c4\u01c7\5\u00b4[\2\u01c5\u01c7"+
		"\5`\61\2\u01c6\u01c2\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c5\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c1\3\2\2\2\u01c9\u01cc\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01ce\5n8\2\u01ce{\3\2\2\2\u01cf\u01d3\5\\/\2\u01d0"+
		"\u01d3\5^\60\2\u01d1\u01d3\5r:\2\u01d2\u01cf\3\2\2\2\u01d2\u01d0\3\2\2"+
		"\2\u01d2\u01d1\3\2\2\2\u01d3}\3\2\2\2\u01d4\u01da\5:\36\2\u01d5\u01d6"+
		"\5d\63\2\u01d6\u01d7\5:\36\2\u01d7\u01d9\3\2\2\2\u01d8\u01d5\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\177\3\2\2"+
		"\2\u01dc\u01da\3\2\2\2\u01dd\u01de\5:\36\2\u01de\u01df\5L\'\2\u01df\u0081"+
		"\3\2\2\2\u01e0\u01e8\5\u0084C\2\u01e1\u01e8\5z>\2\u01e2\u01e8\5`\61\2"+
		"\u01e3\u01e8\5\u0086D\2\u01e4\u01e8\5\u008cG\2\u01e5\u01e8\5\u00a2R\2"+
		"\u01e6\u01e8\5\u00b8]\2\u01e7\u01e0\3\2\2\2\u01e7\u01e1\3\2\2\2\u01e7"+
		"\u01e2\3\2\2\2\u01e7\u01e3\3\2\2\2\u01e7\u01e4\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e7\u01e6\3\2\2\2\u01e8\u0083\3\2\2\2\u01e9\u01ef\5r:\2\u01ea\u01ef"+
		"\5x=\2\u01eb\u01ef\5\u00b4[\2\u01ec\u01ef\5v<\2\u01ed\u01ef\5t;\2\u01ee"+
		"\u01e9\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ee\u01eb\3\2\2\2\u01ee\u01ec\3\2"+
		"\2\2\u01ee\u01ed\3\2\2\2\u01ef\u0085\3\2\2\2\u01f0\u01f1\5\u0088E\2\u01f1"+
		"\u01f2\5\u008aF\2\u01f2\u0087\3\2\2\2\u01f3\u01f4\5\16\b\2\u01f4\u01f6"+
		"\5|?\2\u01f5\u01f7\5\22\n\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u0089\3\2\2\2\u01f8\u01fa\5\u0082B\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb"+
		"\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0203\3\2\2\2\u01fd"+
		"\u01ff\5\20\t\2\u01fe\u0200\5\u0082B\2\u01ff\u01fe\3\2\2\2\u0200\u0201"+
		"\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203"+
		"\u01fd\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\5\24"+
		"\13\2\u0206\u008b\3\2\2\2\u0207\u020b\5\u008eH\2\u0208\u020b\5\u0094K"+
		"\2\u0209\u020b\5\u009aN\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020a"+
		"\u0209\3\2\2\2\u020b\u008d\3\2\2\2\u020c\u020d\5\u0090I\2\u020d\u020e"+
		"\5\u0092J\2\u020e\u008f\3\2\2\2\u020f\u0210\5 \21\2\u0210\u0211\5|?\2"+
		"\u0211\u0212\5\34\17\2\u0212\u0091\3\2\2\2\u0213\u0215\5\u0082B\2\u0214"+
		"\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u0219\5\"\22\2\u0219\u0093\3\2\2\2\u021a"+
		"\u021b\5\u0096L\2\u021b\u021c\5\u0098M\2\u021c\u0095\3\2\2\2\u021d\u021e"+
		"\5\26\f\2\u021e\u021f\5|?\2\u021f\u0222\5\30\r\2\u0220\u0223\5:\36\2\u0221"+
		"\u0223\5\66\34\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2\2\2\u0223\u0229\3"+
		"\2\2\2\u0224\u0227\5\32\16\2\u0225\u0228\5:\36\2\u0226\u0228\5\66\34\2"+
		"\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0224"+
		"\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\5\34\17\2"+
		"\u022c\u0097\3\2\2\2\u022d\u022f\5\u0082B\2\u022e\u022d\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232\u0233\5\36\20\2\u0233\u0099\3\2\2\2\u0234\u0235\5\u009cO\2"+
		"\u0235\u0236\5\u009eP\2\u0236\u0237\5\u00a0Q\2\u0237\u009b\3\2\2\2\u0238"+
		"\u0239\5$\23\2\u0239\u009d\3\2\2\2\u023a\u023c\5\u0082B\2\u023b\u023a"+
		"\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u009f\3\2\2\2\u023f\u0240\5&\24\2\u0240\u0241\5|?\2\u0241\u00a1\3\2\2"+
		"\2\u0242\u0243\5\u00a4S\2\u0243\u0244\5\u00a6T\2\u0244\u00a3\3\2\2\2\u0245"+
		"\u0246\5(\25\2\u0246\u0247\5:\36\2\u0247\u0248\5\34\17\2\u0248\u00a5\3"+
		"\2\2\2\u0249\u024d\5:\36\2\u024a\u024d\7:\2\2\u024b\u024d\5\66\34\2\u024c"+
		"\u0249\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024d\u024e\3\2"+
		"\2\2\u024e\u024f\5f\64\2\u024f\u0250\5\u00aaV\2\u0250\u0252\3\2\2\2\u0251"+
		"\u024c\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2"+
		"\2\2\u0254\u0256\3\2\2\2\u0255\u0257\5\u00a8U\2\u0256\u0255\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u00a7\3\2\2\2\u0258\u0259\5*\26\2\u0259\u025a\5f"+
		"\64\2\u025a\u025b\5\u00aaV\2\u025b\u025c\5,\27\2\u025c\u00a9\3\2\2\2\u025d"+
		"\u025f\5\u0082B\2\u025e\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u025e"+
		"\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u00ab\3\2\2\2\u0262\u0263\5\u00aeX"+
		"\2\u0263\u0264\5\u00b2Z\2\u0264\u00ad\3\2\2\2\u0265\u0268\5\60\31\2\u0266"+
		"\u0268\5\4\3\2\u0267\u0265\3\2\2\2\u0267\u0266\3\2\2\2\u0268\u026a\3\2"+
		"\2\2\u0269\u026b\5\u0080A\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u0273\5\u00b0Y\2\u026d\u026f\5h\65\2\u026e\u0270"+
		"\5~@\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0272\5j\66\2\u0272\u0274\3\2\2\2\u0273\u026d\3\2\2\2\u0273\u0274\3\2"+
		"\2\2\u0274\u00af\3\2\2\2\u0275\u0276\58\35\2\u0276\u00b1\3\2\2\2\u0277"+
		"\u0279\5\u0082B\2\u0278\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0278"+
		"\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\3\2\2\2\u027c\u027e\7;\2\2\u027d"+
		"\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u0282\5\62"+
		"\32\2\u0280\u0282\5.\30\2\u0281\u027f\3\2\2\2\u0281\u0280\3\2\2\2\u0282"+
		"\u00b3\3\2\2\2\u0283\u0284\5\u00b0Y\2\u0284\u0297\5h\65\2\u0285\u028a"+
		"\5:\36\2\u0286\u028a\5\66\34\2\u0287\u028a\5\u00b4[\2\u0288\u028a\5`\61"+
		"\2\u0289\u0285\3\2\2\2\u0289\u0286\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u0288"+
		"\3\2\2\2\u028a\u0294\3\2\2\2\u028b\u0290\5d\63\2\u028c\u0291\5:\36\2\u028d"+
		"\u0291\5\66\34\2\u028e\u0291\5\u00b4[\2\u028f\u0291\5`\61\2\u0290\u028c"+
		"\3\2\2\2\u0290\u028d\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u028f\3\2\2\2\u0291"+
		"\u0293\3\2\2\2\u0292\u028b\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2"+
		"\2\2\u0294\u0295\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0297"+
		"\u0289\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\5j"+
		"\66\2\u029a\u00b5\3\2\2\2\u029b\u02a2\7A\2\2\u029c\u029e\7C\2\2\u029d"+
		"\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2"+
		"\2\2\u02a0\u02a2\3\2\2\2\u02a1\u029b\3\2\2\2\u02a1\u029d\3\2\2\2\u02a2"+
		"\u00b7\3\2\2\2\u02a3\u02a8\7>\2\2\u02a4\u02a7\5\u00b6\\\2\u02a5\u02a7"+
		"\7;\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8"+
		"\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a8\3\2"+
		"\2\2\u02ab\u02b5\7@\2\2\u02ac\u02b0\7?\2\2\u02ad\u02af\5\u00b6\\\2\u02ae"+
		"\u02ad\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2"+
		"\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b5\7B\2\2\u02b4"+
		"\u02a3\3\2\2\2\u02b4\u02ac\3\2\2\2\u02b5\u00b9\3\2\2\2D\u00bc\u00c2\u00fd"+
		"\u0123\u012a\u012f\u0135\u013d\u0140\u0144\u014a\u014d\u0151\u0156\u015b"+
		"\u0160\u0164\u017c\u0180\u018a\u0192\u019a\u019e\u01a2\u01ae\u01b4\u01b7"+
		"\u01bf\u01c6\u01ca\u01d2\u01da\u01e7\u01ee\u01f6\u01fb\u0201\u0203\u020a"+
		"\u0216\u0222\u0227\u0229\u0230\u023d\u024c\u0253\u0256\u0260\u0267\u026a"+
		"\u026f\u0273\u027a\u027d\u0281\u0289\u0290\u0294\u0297\u029f\u02a1\u02a6"+
		"\u02a8\u02b0\u02b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}