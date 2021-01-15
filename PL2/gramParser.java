// Generated from gramParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD_ALGORITMO=1, KEYWORD_DEFINIR=2, KEYWORD_COMO=3, KEYWORD_LEER=4, 
		KEYWORD_ESCRIBIR=5, KEYWORD_SI=6, KEYWORD_SINO=7, KEYWORD_ENTONCES=8, 
		KEYWORD_FINSI=9, KEYWORD_PARA=10, KEYWORD_HASTA=11, KEYWORD_HACER=12, 
		KEYWORD_FINPARA=13, KEYWORD_MIENTRAS=14, KEYWORD_FINMIENTRAS=15, KEYWORD_REPETIR=16, 
		KEYWORD_HASTAQUE=17, KEYWORD_SEGUN=18, KEYWORD_DEOTROMODO=19, KEYWORD_FINSEGUN=20, 
		KEYWORD_FINALGORITMO=21, KEYWORD_FUNCION=22, KEYWORD_FINFUNCION=23, VERDADERO=24, 
		FALSO=25, CARACTER=26, ENTERO=27, REAL=28, LOGICO=29, DIMENSION=30, INT=31, 
		FLOAT=32, IDENTIFICADOR=33, PA=34, PC=35, CA=36, CC=37, FIN=38, COMA=39, 
		DOS_PUNTOS=40, ASIGNACION=41, MENOR=42, MAYOR=43, IGUAL=44, SUMA=45, RESTA=46, 
		CADENA_CARACTERES=47, TERMINAL=48, WS=49, COMENTARIOABRIR=50, COMENTARIOLINEA=51, 
		COMENTARIOCERRAR=52, TEXTOCOMENTARIOML=53, FINAL_COMENTARIO_UL=54, TEXTOCOMENTARIOUL=55;
	public static final int
		RULE_prog = 0, RULE_kw_algoritmo = 1, RULE_kw_finalgoritmo = 2, RULE_kw_definir = 3, 
		RULE_kw_como = 4, RULE_kw_leer = 5, RULE_kw_escribir = 6, RULE_kw_si = 7, 
		RULE_kw_sino = 8, RULE_kw_entonces = 9, RULE_kw_finsi = 10, RULE_kw_para = 11, 
		RULE_kw_hasta = 12, RULE_kw_hacer = 13, RULE_kw_finpara = 14, RULE_kw_mientras = 15, 
		RULE_kw_finmientras = 16, RULE_kw_repetir = 17, RULE_kw_hastaque = 18, 
		RULE_kw_segun = 19, RULE_kw_deotromodo = 20, RULE_kw_finsegun = 21, RULE_kw_funcion = 22, 
		RULE_kw_finfuncion = 23, RULE_kw_dimension = 24, RULE_tipo_de_datos = 25, 
		RULE_numero = 26, RULE_identificador = 27, RULE_var = 28, RULE_op_menor = 29, 
		RULE_op_mayor = 30, RULE_op_igual = 31, RULE_op_asignacion = 32, RULE_op_suma = 33, 
		RULE_op_resta = 34, RULE_comparacion = 35, RULE_operador = 36, RULE_condicion_logica = 37, 
		RULE_operacion_logica = 38, RULE_operacion = 39, RULE_fin = 40, RULE_coma = 41, 
		RULE_dos_puntos = 42, RULE_parentesis_izq = 43, RULE_parentesis_der = 44, 
		RULE_corchete_izq = 45, RULE_corchete_der = 46, RULE_signo_puntuacion = 47, 
		RULE_asignacion = 48, RULE_escritura = 49, RULE_lectura = 50, RULE_definicion = 51, 
		RULE_parametros_bucle = 52, RULE_parametros_DF = 53, RULE_parametros_LF = 54, 
		RULE_parametros = 55, RULE_condicion_si = 56, RULE_cabecera_si = 57, RULE_cuerpo_si = 58, 
		RULE_bucle = 59, RULE_bucle_mientras = 60, RULE_cabecera_mientras = 61, 
		RULE_cuerpo_mientras = 62, RULE_bucle_para = 63, RULE_cabecera_para = 64, 
		RULE_cuerpo_para = 65, RULE_bucle_repetir = 66, RULE_cabecera_repetir = 67, 
		RULE_cuerpo_repetir = 68, RULE_condicion_repetir = 69, RULE_segun = 70, 
		RULE_cabecera_segun = 71, RULE_tipo_segun = 72, RULE_tipo_deotromodo = 73, 
		RULE_cuerpo_segun = 74, RULE_dimension = 75, RULE_algoritmo = 76, RULE_cabecera_algoritmo = 77, 
		RULE_nombre_algoritmo = 78, RULE_cuerpo_algoritmo = 79, RULE_funcion = 80, 
		RULE_cabecera_funcion = 81, RULE_cuerpo_funcion = 82, RULE_llamada_funcion = 83, 
		RULE_textos = 84, RULE_comentario = 85;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "kw_algoritmo", "kw_finalgoritmo", "kw_definir", "kw_como", "kw_leer", 
			"kw_escribir", "kw_si", "kw_sino", "kw_entonces", "kw_finsi", "kw_para", 
			"kw_hasta", "kw_hacer", "kw_finpara", "kw_mientras", "kw_finmientras", 
			"kw_repetir", "kw_hastaque", "kw_segun", "kw_deotromodo", "kw_finsegun", 
			"kw_funcion", "kw_finfuncion", "kw_dimension", "tipo_de_datos", "numero", 
			"identificador", "var", "op_menor", "op_mayor", "op_igual", "op_asignacion", 
			"op_suma", "op_resta", "comparacion", "operador", "condicion_logica", 
			"operacion_logica", "operacion", "fin", "coma", "dos_puntos", "parentesis_izq", 
			"parentesis_der", "corchete_izq", "corchete_der", "signo_puntuacion", 
			"asignacion", "escritura", "lectura", "definicion", "parametros_bucle", 
			"parametros_DF", "parametros_LF", "parametros", "condicion_si", "cabecera_si", 
			"cuerpo_si", "bucle", "bucle_mientras", "cabecera_mientras", "cuerpo_mientras", 
			"bucle_para", "cabecera_para", "cuerpo_para", "bucle_repetir", "cabecera_repetir", 
			"cuerpo_repetir", "condicion_repetir", "segun", "cabecera_segun", "tipo_segun", 
			"tipo_deotromodo", "cuerpo_segun", "dimension", "algoritmo", "cabecera_algoritmo", 
			"nombre_algoritmo", "cuerpo_algoritmo", "funcion", "cabecera_funcion", 
			"cuerpo_funcion", "llamada_funcion", "textos", "comentario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Algoritmo'", null, "'Como'", "'Leer'", "'Escribir'", "'Si'", 
			"'SiNo'", "'Entonces'", "'FinSi'", "'Para'", "'Hasta'", "'Hacer'", "'FinPara'", 
			"'Mientras'", "'FinMientras'", "'Repetir'", "'Hasta Que'", "'Segun'", 
			"'De Otro Modo'", "'FinSegun'", "'FinAlgoritmo'", "'Funcion'", "'FinFuncion'", 
			"'Verdadero'", "'Falso'", "'Caracter'", "'Entero'", "'Real'", "'Logico'", 
			"'Dimension'", null, null, null, "'('", "')'", "'['", "']'", "';'", "','", 
			"':'", "'<-'", "'<'", "'>'", "'='", "'+'", "'-'", null, null, null, "'/**'", 
			"'//'", "'**/'", null, "'\r\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORD_ALGORITMO", "KEYWORD_DEFINIR", "KEYWORD_COMO", "KEYWORD_LEER", 
			"KEYWORD_ESCRIBIR", "KEYWORD_SI", "KEYWORD_SINO", "KEYWORD_ENTONCES", 
			"KEYWORD_FINSI", "KEYWORD_PARA", "KEYWORD_HASTA", "KEYWORD_HACER", "KEYWORD_FINPARA", 
			"KEYWORD_MIENTRAS", "KEYWORD_FINMIENTRAS", "KEYWORD_REPETIR", "KEYWORD_HASTAQUE", 
			"KEYWORD_SEGUN", "KEYWORD_DEOTROMODO", "KEYWORD_FINSEGUN", "KEYWORD_FINALGORITMO", 
			"KEYWORD_FUNCION", "KEYWORD_FINFUNCION", "VERDADERO", "FALSO", "CARACTER", 
			"ENTERO", "REAL", "LOGICO", "DIMENSION", "INT", "FLOAT", "IDENTIFICADOR", 
			"PA", "PC", "CA", "CC", "FIN", "COMA", "DOS_PUNTOS", "ASIGNACION", "MENOR", 
			"MAYOR", "IGUAL", "SUMA", "RESTA", "CADENA_CARACTERES", "TERMINAL", "WS", 
			"COMENTARIOABRIR", "COMENTARIOLINEA", "COMENTARIOCERRAR", "TEXTOCOMENTARIOML", 
			"FINAL_COMENTARIO_UL", "TEXTOCOMENTARIOUL"
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
	public String getGrammarFileName() { return "gramParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> TERMINAL() { return getTokens(gramParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(gramParser.TERMINAL, i);
		}
		public List<AlgoritmoContext> algoritmo() {
			return getRuleContexts(AlgoritmoContext.class);
		}
		public AlgoritmoContext algoritmo(int i) {
			return getRuleContext(AlgoritmoContext.class,i);
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_ALGORITMO) | (1L << KEYWORD_FUNCION) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA))) != 0)) {
				{
				{
				setState(175);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD_ALGORITMO:
					{
					setState(172);
					algoritmo();
					}
					break;
				case KEYWORD_FUNCION:
					{
					setState(173);
					funcion();
					}
					break;
				case COMENTARIOABRIR:
				case COMENTARIOLINEA:
					{
					setState(174);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(177);
				match(TERMINAL);
				}
				}
				setState(183);
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

	public static class Kw_algoritmoContext extends ParserRuleContext {
		public TerminalNode KEYWORD_ALGORITMO() { return getToken(gramParser.KEYWORD_ALGORITMO, 0); }
		public Kw_algoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_algoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_algoritmo(this);
		}
	}

	public final Kw_algoritmoContext kw_algoritmo() throws RecognitionException {
		Kw_algoritmoContext _localctx = new Kw_algoritmoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_kw_algoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(KEYWORD_ALGORITMO);
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

	public static class Kw_finalgoritmoContext extends ParserRuleContext {
		public TerminalNode KEYWORD_FINALGORITMO() { return getToken(gramParser.KEYWORD_FINALGORITMO, 0); }
		public Kw_finalgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_finalgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_finalgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_finalgoritmo(this);
		}
	}

	public final Kw_finalgoritmoContext kw_finalgoritmo() throws RecognitionException {
		Kw_finalgoritmoContext _localctx = new Kw_finalgoritmoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_kw_finalgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(KEYWORD_FINALGORITMO);
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

	public static class Kw_definirContext extends ParserRuleContext {
		public TerminalNode KEYWORD_DEFINIR() { return getToken(gramParser.KEYWORD_DEFINIR, 0); }
		public Kw_definirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_definir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_definir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_definir(this);
		}
	}

	public final Kw_definirContext kw_definir() throws RecognitionException {
		Kw_definirContext _localctx = new Kw_definirContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_kw_definir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(KEYWORD_DEFINIR);
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

	public static class Kw_comoContext extends ParserRuleContext {
		public TerminalNode KEYWORD_COMO() { return getToken(gramParser.KEYWORD_COMO, 0); }
		public Kw_comoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_como; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_como(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_como(this);
		}
	}

	public final Kw_comoContext kw_como() throws RecognitionException {
		Kw_comoContext _localctx = new Kw_comoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_kw_como);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(KEYWORD_COMO);
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

	public static class Kw_leerContext extends ParserRuleContext {
		public TerminalNode KEYWORD_LEER() { return getToken(gramParser.KEYWORD_LEER, 0); }
		public Kw_leerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_leer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_leer(this);
		}
	}

	public final Kw_leerContext kw_leer() throws RecognitionException {
		Kw_leerContext _localctx = new Kw_leerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_kw_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(KEYWORD_LEER);
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

	public static class Kw_escribirContext extends ParserRuleContext {
		public TerminalNode KEYWORD_ESCRIBIR() { return getToken(gramParser.KEYWORD_ESCRIBIR, 0); }
		public Kw_escribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_escribir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_escribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_escribir(this);
		}
	}

	public final Kw_escribirContext kw_escribir() throws RecognitionException {
		Kw_escribirContext _localctx = new Kw_escribirContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_kw_escribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(KEYWORD_ESCRIBIR);
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

	public static class Kw_siContext extends ParserRuleContext {
		public TerminalNode KEYWORD_SI() { return getToken(gramParser.KEYWORD_SI, 0); }
		public Kw_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_si(this);
		}
	}

	public final Kw_siContext kw_si() throws RecognitionException {
		Kw_siContext _localctx = new Kw_siContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_kw_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(KEYWORD_SI);
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

	public static class Kw_sinoContext extends ParserRuleContext {
		public TerminalNode KEYWORD_SINO() { return getToken(gramParser.KEYWORD_SINO, 0); }
		public Kw_sinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_sino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_sino(this);
		}
	}

	public final Kw_sinoContext kw_sino() throws RecognitionException {
		Kw_sinoContext _localctx = new Kw_sinoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_kw_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(KEYWORD_SINO);
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

	public static class Kw_entoncesContext extends ParserRuleContext {
		public TerminalNode KEYWORD_ENTONCES() { return getToken(gramParser.KEYWORD_ENTONCES, 0); }
		public Kw_entoncesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_entonces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_entonces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_entonces(this);
		}
	}

	public final Kw_entoncesContext kw_entonces() throws RecognitionException {
		Kw_entoncesContext _localctx = new Kw_entoncesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_kw_entonces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(KEYWORD_ENTONCES);
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

	public static class Kw_finsiContext extends ParserRuleContext {
		public TerminalNode KEYWORD_FINSI() { return getToken(gramParser.KEYWORD_FINSI, 0); }
		public Kw_finsiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_finsi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_finsi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_finsi(this);
		}
	}

	public final Kw_finsiContext kw_finsi() throws RecognitionException {
		Kw_finsiContext _localctx = new Kw_finsiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_kw_finsi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(KEYWORD_FINSI);
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

	public static class Kw_paraContext extends ParserRuleContext {
		public TerminalNode KEYWORD_PARA() { return getToken(gramParser.KEYWORD_PARA, 0); }
		public Kw_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_para(this);
		}
	}

	public final Kw_paraContext kw_para() throws RecognitionException {
		Kw_paraContext _localctx = new Kw_paraContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_kw_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(KEYWORD_PARA);
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

	public static class Kw_hastaContext extends ParserRuleContext {
		public TerminalNode KEYWORD_HASTA() { return getToken(gramParser.KEYWORD_HASTA, 0); }
		public Kw_hastaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_hasta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_hasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_hasta(this);
		}
	}

	public final Kw_hastaContext kw_hasta() throws RecognitionException {
		Kw_hastaContext _localctx = new Kw_hastaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_kw_hasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(KEYWORD_HASTA);
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

	public static class Kw_hacerContext extends ParserRuleContext {
		public TerminalNode KEYWORD_HACER() { return getToken(gramParser.KEYWORD_HACER, 0); }
		public Kw_hacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_hacer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_hacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_hacer(this);
		}
	}

	public final Kw_hacerContext kw_hacer() throws RecognitionException {
		Kw_hacerContext _localctx = new Kw_hacerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_kw_hacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(KEYWORD_HACER);
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

	public static class Kw_finparaContext extends ParserRuleContext {
		public TerminalNode KEYWORD_FINPARA() { return getToken(gramParser.KEYWORD_FINPARA, 0); }
		public Kw_finparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_finpara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_finpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_finpara(this);
		}
	}

	public final Kw_finparaContext kw_finpara() throws RecognitionException {
		Kw_finparaContext _localctx = new Kw_finparaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_kw_finpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(KEYWORD_FINPARA);
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

	public static class Kw_mientrasContext extends ParserRuleContext {
		public TerminalNode KEYWORD_MIENTRAS() { return getToken(gramParser.KEYWORD_MIENTRAS, 0); }
		public Kw_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_mientras(this);
		}
	}

	public final Kw_mientrasContext kw_mientras() throws RecognitionException {
		Kw_mientrasContext _localctx = new Kw_mientrasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_kw_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(KEYWORD_MIENTRAS);
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

	public static class Kw_finmientrasContext extends ParserRuleContext {
		public TerminalNode KEYWORD_FINMIENTRAS() { return getToken(gramParser.KEYWORD_FINMIENTRAS, 0); }
		public Kw_finmientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_finmientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_finmientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_finmientras(this);
		}
	}

	public final Kw_finmientrasContext kw_finmientras() throws RecognitionException {
		Kw_finmientrasContext _localctx = new Kw_finmientrasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_kw_finmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(KEYWORD_FINMIENTRAS);
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

	public static class Kw_repetirContext extends ParserRuleContext {
		public TerminalNode KEYWORD_REPETIR() { return getToken(gramParser.KEYWORD_REPETIR, 0); }
		public Kw_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_repetir(this);
		}
	}

	public final Kw_repetirContext kw_repetir() throws RecognitionException {
		Kw_repetirContext _localctx = new Kw_repetirContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_kw_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(KEYWORD_REPETIR);
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

	public static class Kw_hastaqueContext extends ParserRuleContext {
		public TerminalNode KEYWORD_HASTAQUE() { return getToken(gramParser.KEYWORD_HASTAQUE, 0); }
		public Kw_hastaqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_hastaque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_hastaque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_hastaque(this);
		}
	}

	public final Kw_hastaqueContext kw_hastaque() throws RecognitionException {
		Kw_hastaqueContext _localctx = new Kw_hastaqueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_kw_hastaque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(KEYWORD_HASTAQUE);
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

	public static class Kw_segunContext extends ParserRuleContext {
		public TerminalNode KEYWORD_SEGUN() { return getToken(gramParser.KEYWORD_SEGUN, 0); }
		public Kw_segunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_segun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_segun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_segun(this);
		}
	}

	public final Kw_segunContext kw_segun() throws RecognitionException {
		Kw_segunContext _localctx = new Kw_segunContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_kw_segun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(KEYWORD_SEGUN);
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

	public static class Kw_deotromodoContext extends ParserRuleContext {
		public TerminalNode KEYWORD_DEOTROMODO() { return getToken(gramParser.KEYWORD_DEOTROMODO, 0); }
		public Kw_deotromodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_deotromodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_deotromodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_deotromodo(this);
		}
	}

	public final Kw_deotromodoContext kw_deotromodo() throws RecognitionException {
		Kw_deotromodoContext _localctx = new Kw_deotromodoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_kw_deotromodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(KEYWORD_DEOTROMODO);
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

	public static class Kw_finsegunContext extends ParserRuleContext {
		public TerminalNode KEYWORD_FINSEGUN() { return getToken(gramParser.KEYWORD_FINSEGUN, 0); }
		public Kw_finsegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_finsegun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_finsegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_finsegun(this);
		}
	}

	public final Kw_finsegunContext kw_finsegun() throws RecognitionException {
		Kw_finsegunContext _localctx = new Kw_finsegunContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_kw_finsegun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(KEYWORD_FINSEGUN);
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

	public static class Kw_funcionContext extends ParserRuleContext {
		public TerminalNode KEYWORD_FUNCION() { return getToken(gramParser.KEYWORD_FUNCION, 0); }
		public Kw_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_funcion(this);
		}
	}

	public final Kw_funcionContext kw_funcion() throws RecognitionException {
		Kw_funcionContext _localctx = new Kw_funcionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_kw_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(KEYWORD_FUNCION);
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

	public static class Kw_finfuncionContext extends ParserRuleContext {
		public TerminalNode KEYWORD_FINFUNCION() { return getToken(gramParser.KEYWORD_FINFUNCION, 0); }
		public Kw_finfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_finfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_finfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_finfuncion(this);
		}
	}

	public final Kw_finfuncionContext kw_finfuncion() throws RecognitionException {
		Kw_finfuncionContext _localctx = new Kw_finfuncionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_kw_finfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(KEYWORD_FINFUNCION);
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

	public static class Kw_dimensionContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(gramParser.DIMENSION, 0); }
		public Kw_dimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kw_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterKw_dimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitKw_dimension(this);
		}
	}

	public final Kw_dimensionContext kw_dimension() throws RecognitionException {
		Kw_dimensionContext _localctx = new Kw_dimensionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_kw_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(DIMENSION);
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
		public TerminalNode CARACTER() { return getToken(gramParser.CARACTER, 0); }
		public TerminalNode ENTERO() { return getToken(gramParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(gramParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(gramParser.LOGICO, 0); }
		public Tipo_de_datosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_de_datos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterTipo_de_datos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitTipo_de_datos(this);
		}
	}

	public final Tipo_de_datosContext tipo_de_datos() throws RecognitionException {
		Tipo_de_datosContext _localctx = new Tipo_de_datosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipo_de_datos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
		public TerminalNode INT() { return getToken(gramParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(gramParser.FLOAT, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		public TerminalNode IDENTIFICADOR() { return getToken(gramParser.IDENTIFICADOR, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		public TerminalNode CADENA_CARACTERES() { return getToken(gramParser.CADENA_CARACTERES, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_var);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				identificador();
				}
				break;
			case CADENA_CARACTERES:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
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
		public TerminalNode MENOR() { return getToken(gramParser.MENOR, 0); }
		public Op_menorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_menor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterOp_menor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitOp_menor(this);
		}
	}

	public final Op_menorContext op_menor() throws RecognitionException {
		Op_menorContext _localctx = new Op_menorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(MENOR);
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
		public TerminalNode MAYOR() { return getToken(gramParser.MAYOR, 0); }
		public Op_mayorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_mayor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterOp_mayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitOp_mayor(this);
		}
	}

	public final Op_mayorContext op_mayor() throws RecognitionException {
		Op_mayorContext _localctx = new Op_mayorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(MAYOR);
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
		public TerminalNode IGUAL() { return getToken(gramParser.IGUAL, 0); }
		public Op_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterOp_igual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitOp_igual(this);
		}
	}

	public final Op_igualContext op_igual() throws RecognitionException {
		Op_igualContext _localctx = new Op_igualContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_op_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(IGUAL);
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
		public TerminalNode ASIGNACION() { return getToken(gramParser.ASIGNACION, 0); }
		public Op_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterOp_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitOp_asignacion(this);
		}
	}

	public final Op_asignacionContext op_asignacion() throws RecognitionException {
		Op_asignacionContext _localctx = new Op_asignacionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ASIGNACION);
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
		public TerminalNode SUMA() { return getToken(gramParser.SUMA, 0); }
		public Op_sumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterOp_suma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitOp_suma(this);
		}
	}

	public final Op_sumaContext op_suma() throws RecognitionException {
		Op_sumaContext _localctx = new Op_sumaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		public TerminalNode RESTA() { return getToken(gramParser.RESTA, 0); }
		public Op_restaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_resta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterOp_resta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitOp_resta(this);
		}
	}

	public final Op_restaContext op_resta() throws RecognitionException {
		Op_restaContext _localctx = new Op_restaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_op_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitComparacion(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_comparacion);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				op_menor();
				}
				break;
			case MAYOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				op_mayor();
				}
				break;
			case IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				op_igual();
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

	public static class OperadorContext extends ParserRuleContext {
		public Op_asignacionContext op_asignacion() {
			return getRuleContext(Op_asignacionContext.class,0);
		}
		public Op_sumaContext op_suma() {
			return getRuleContext(Op_sumaContext.class,0);
		}
		public Condicion_logicaContext condicion_logica() {
			return getRuleContext(Condicion_logicaContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operador);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASIGNACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				op_asignacion();
				}
				break;
			case SUMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				op_suma();
				}
				break;
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				condicion_logica();
				}
				break;
			case MENOR:
			case MAYOR:
			case IGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				comparacion();
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
		public TerminalNode VERDADERO() { return getToken(gramParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(gramParser.FALSO, 0); }
		public Condicion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCondicion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCondicion_logica(this);
		}
	}

	public final Condicion_logicaContext condicion_logica() throws RecognitionException {
		Condicion_logicaContext _localctx = new Condicion_logicaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_condicion_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public Op_igualContext op_igual() {
			return getRuleContext(Op_igualContext.class,0);
		}
		public Operacion_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterOperacion_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitOperacion_logica(this);
		}
	}

	public final Operacion_logicaContext operacion_logica() throws RecognitionException {
		Operacion_logicaContext _localctx = new Operacion_logicaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_operacion_logica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
			case CADENA_CARACTERES:
				{
				setState(267);
				var();
				}
				break;
			case INT:
			case FLOAT:
				{
				setState(268);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(271);
				comparacion();
				}
				break;
			case 2:
				{
				setState(272);
				op_igual();
				}
				break;
			}
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
			case CADENA_CARACTERES:
				{
				setState(275);
				var();
				}
				break;
			case INT:
			case FLOAT:
				{
				setState(276);
				numero();
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

	public static class OperacionContext extends ParserRuleContext {
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
			case CADENA_CARACTERES:
				{
				setState(279);
				var();
				}
				break;
			case INT:
			case FLOAT:
				{
				setState(280);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(283);
			operador();
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
			case CADENA_CARACTERES:
				{
				setState(284);
				var();
				}
				break;
			case INT:
			case FLOAT:
				{
				setState(285);
				numero();
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

	public static class FinContext extends ParserRuleContext {
		public TerminalNode FIN() { return getToken(gramParser.FIN, 0); }
		public FinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterFin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitFin(this);
		}
	}

	public final FinContext fin() throws RecognitionException {
		FinContext _localctx = new FinContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
		public TerminalNode COMA() { return getToken(gramParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitComa(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
		public TerminalNode DOS_PUNTOS() { return getToken(gramParser.DOS_PUNTOS, 0); }
		public Dos_puntosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dos_puntos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterDos_puntos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitDos_puntos(this);
		}
	}

	public final Dos_puntosContext dos_puntos() throws RecognitionException {
		Dos_puntosContext _localctx = new Dos_puntosContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dos_puntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
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
		public TerminalNode PA() { return getToken(gramParser.PA, 0); }
		public Parentesis_izqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis_izq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterParentesis_izq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitParentesis_izq(this);
		}
	}

	public final Parentesis_izqContext parentesis_izq() throws RecognitionException {
		Parentesis_izqContext _localctx = new Parentesis_izqContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parentesis_izq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(PA);
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
		public TerminalNode PC() { return getToken(gramParser.PC, 0); }
		public Parentesis_derContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis_der; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterParentesis_der(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitParentesis_der(this);
		}
	}

	public final Parentesis_derContext parentesis_der() throws RecognitionException {
		Parentesis_derContext _localctx = new Parentesis_derContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parentesis_der);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(PC);
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
		public TerminalNode CA() { return getToken(gramParser.CA, 0); }
		public Corchete_izqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corchete_izq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCorchete_izq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCorchete_izq(this);
		}
	}

	public final Corchete_izqContext corchete_izq() throws RecognitionException {
		Corchete_izqContext _localctx = new Corchete_izqContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_corchete_izq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(CA);
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
		public TerminalNode CC() { return getToken(gramParser.CC, 0); }
		public Corchete_derContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corchete_der; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCorchete_der(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCorchete_der(this);
		}
	}

	public final Corchete_derContext corchete_der() throws RecognitionException {
		Corchete_derContext _localctx = new Corchete_derContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_corchete_der);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(CC);
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterSigno_puntuacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitSigno_puntuacion(this);
		}
	}

	public final Signo_puntuacionContext signo_puntuacion() throws RecognitionException {
		Signo_puntuacionContext _localctx = new Signo_puntuacionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_signo_puntuacion);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				parentesis_izq();
				}
				break;
			case PC:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				parentesis_der();
				}
				break;
			case FIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				fin();
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				coma();
				}
				break;
			case DOS_PUNTOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				dos_puntos();
				}
				break;
			case CA:
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				corchete_izq();
				}
				break;
			case CC:
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
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
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Op_asignacionContext op_asignacion() {
			return getRuleContext(Op_asignacionContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode CADENA_CARACTERES() { return getToken(gramParser.CADENA_CARACTERES, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			var();
			setState(312);
			op_asignacion();
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(313);
				numero();
				}
				break;
			case 2:
				{
				setState(314);
				var();
				}
				break;
			case 3:
				{
				setState(315);
				match(CADENA_CARACTERES);
				}
				break;
			case 4:
				{
				setState(316);
				operacion();
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
		public Kw_escribirContext kw_escribir() {
			return getRuleContext(Kw_escribirContext.class,0);
		}
		public List<TerminalNode> CADENA_CARACTERES() { return getTokens(gramParser.CADENA_CARACTERES); }
		public TerminalNode CADENA_CARACTERES(int i) {
			return getToken(gramParser.CADENA_CARACTERES, i);
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
		public Signo_puntuacionContext signo_puntuacion() {
			return getRuleContext(Signo_puntuacionContext.class,0);
		}
		public List<TerminalNode> SUMA() { return getTokens(gramParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(gramParser.SUMA, i);
		}
		public List<TerminalNode> COMA() { return getTokens(gramParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(gramParser.COMA, i);
		}
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterEscritura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitEscritura(this);
		}
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_escritura);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			kw_escribir();
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(320);
				match(CADENA_CARACTERES);
				}
				break;
			case 2:
				{
				setState(321);
				llamada_funcion();
				}
				break;
			case 3:
				{
				setState(322);
				var();
				}
				break;
			}
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(325);
					_la = _input.LA(1);
					if ( !(_la==COMA || _la==SUMA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(326);
						var();
						}
						break;
					case 2:
						{
						setState(327);
						match(CADENA_CARACTERES);
						}
						break;
					case 3:
						{
						setState(328);
						llamada_funcion();
						}
						break;
					}
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PA) | (1L << PC) | (1L << CA) | (1L << CC) | (1L << FIN) | (1L << COMA) | (1L << DOS_PUNTOS))) != 0)) {
				{
				setState(336);
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
		public Kw_leerContext kw_leer() {
			return getRuleContext(Kw_leerContext.class,0);
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterLectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitLectura(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			kw_leer();
			setState(340);
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
		public Kw_definirContext kw_definir() {
			return getRuleContext(Kw_definirContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Kw_comoContext kw_como() {
			return getRuleContext(Kw_comoContext.class,0);
		}
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterDefinicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitDefinicion(this);
		}
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_definicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			kw_definir();
			setState(343);
			var();
			setState(344);
			kw_como();
			setState(345);
			tipo_de_datos();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PA) | (1L << PC) | (1L << CA) | (1L << CC) | (1L << FIN) | (1L << COMA) | (1L << DOS_PUNTOS))) != 0)) {
				{
				setState(346);
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

	public static class Parametros_bucleContext extends ParserRuleContext {
		public Condicion_logicaContext condicion_logica() {
			return getRuleContext(Condicion_logicaContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public Parametros_bucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterParametros_bucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitParametros_bucle(this);
		}
	}

	public final Parametros_bucleContext parametros_bucle() throws RecognitionException {
		Parametros_bucleContext _localctx = new Parametros_bucleContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_parametros_bucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADERO:
			case FALSO:
				{
				setState(349);
				condicion_logica();
				}
				break;
			case IDENTIFICADOR:
			case CADENA_CARACTERES:
				{
				{
				setState(350);
				var();
				setState(351);
				comparacion();
				setState(352);
				var();
				}
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

	public static class Parametros_DFContext extends ParserRuleContext {
		public List<Tipo_de_datosContext> tipo_de_datos() {
			return getRuleContexts(Tipo_de_datosContext.class);
		}
		public Tipo_de_datosContext tipo_de_datos(int i) {
			return getRuleContext(Tipo_de_datosContext.class,i);
		}
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
		public Parametros_DFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_DF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterParametros_DF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitParametros_DF(this);
		}
	}

	public final Parametros_DFContext parametros_DF() throws RecognitionException {
		Parametros_DFContext _localctx = new Parametros_DFContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_parametros_DF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(356);
				tipo_de_datos();
				setState(357);
				var();
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(358);
					coma();
					setState(359);
					tipo_de_datos();
					setState(360);
					var();
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARACTER) | (1L << ENTERO) | (1L << REAL) | (1L << LOGICO))) != 0) );
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

	public static class Parametros_LFContext extends ParserRuleContext {
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
		public Parametros_LFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_LF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterParametros_LF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitParametros_LF(this);
		}
	}

	public final Parametros_LFContext parametros_LF() throws RecognitionException {
		Parametros_LFContext _localctx = new Parametros_LFContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_parametros_LF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(371);
			var();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(372);
				coma();
				setState(373);
				var();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParametrosContext extends ParserRuleContext {
		public Parametros_bucleContext parametros_bucle() {
			return getRuleContext(Parametros_bucleContext.class,0);
		}
		public Parametros_DFContext parametros_DF() {
			return getRuleContext(Parametros_DFContext.class,0);
		}
		public Parametros_LFContext parametros_LF() {
			return getRuleContext(Parametros_LFContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_parametros);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				parametros_bucle();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				parametros_DF();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				parametros_LF();
				}
				break;
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCondicion_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCondicion_si(this);
		}
	}

	public final Condicion_siContext condicion_si() throws RecognitionException {
		Condicion_siContext _localctx = new Condicion_siContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_condicion_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			cabecera_si();
			setState(386);
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
		public Kw_siContext kw_si() {
			return getRuleContext(Kw_siContext.class,0);
		}
		public Operacion_logicaContext operacion_logica() {
			return getRuleContext(Operacion_logicaContext.class,0);
		}
		public Kw_entoncesContext kw_entonces() {
			return getRuleContext(Kw_entoncesContext.class,0);
		}
		public Cabecera_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCabecera_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCabecera_si(this);
		}
	}

	public final Cabecera_siContext cabecera_si() throws RecognitionException {
		Cabecera_siContext _localctx = new Cabecera_siContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_cabecera_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			kw_si();
			setState(389);
			operacion_logica();
			setState(390);
			kw_entonces();
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
		public List<EscrituraContext> escritura() {
			return getRuleContexts(EscrituraContext.class);
		}
		public EscrituraContext escritura(int i) {
			return getRuleContext(EscrituraContext.class,i);
		}
		public List<Condicion_siContext> condicion_si() {
			return getRuleContexts(Condicion_siContext.class);
		}
		public Condicion_siContext condicion_si(int i) {
			return getRuleContext(Condicion_siContext.class,i);
		}
		public Kw_sinoContext kw_sino() {
			return getRuleContext(Kw_sinoContext.class,0);
		}
		public Kw_finsiContext kw_finsi() {
			return getRuleContext(Kw_finsiContext.class,0);
		}
		public Cuerpo_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCuerpo_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCuerpo_si(this);
		}
	}

	public final Cuerpo_siContext cuerpo_si() throws RecognitionException {
		Cuerpo_siContext _localctx = new Cuerpo_siContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cuerpo_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_ESCRIBIR:
				{
				setState(392);
				escritura();
				}
				break;
			case KEYWORD_SI:
				{
				setState(393);
				condicion_si();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(396);
			kw_sino();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD_ESCRIBIR || _la==KEYWORD_SI) {
				{
				setState(399);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD_ESCRIBIR:
					{
					setState(397);
					escritura();
					}
					break;
				case KEYWORD_SI:
					{
					setState(398);
					condicion_si();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			kw_finsi();
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitBucle(this);
		}
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_bucle);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD_MIENTRAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				bucle_mientras();
				}
				break;
			case KEYWORD_PARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				bucle_para();
				}
				break;
			case KEYWORD_REPETIR:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterBucle_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitBucle_mientras(this);
		}
	}

	public final Bucle_mientrasContext bucle_mientras() throws RecognitionException {
		Bucle_mientrasContext _localctx = new Bucle_mientrasContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_bucle_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			cabecera_mientras();
			setState(412);
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
		public Kw_mientrasContext kw_mientras() {
			return getRuleContext(Kw_mientrasContext.class,0);
		}
		public Operacion_logicaContext operacion_logica() {
			return getRuleContext(Operacion_logicaContext.class,0);
		}
		public Kw_hacerContext kw_hacer() {
			return getRuleContext(Kw_hacerContext.class,0);
		}
		public Cabecera_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCabecera_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCabecera_mientras(this);
		}
	}

	public final Cabecera_mientrasContext cabecera_mientras() throws RecognitionException {
		Cabecera_mientrasContext _localctx = new Cabecera_mientrasContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_cabecera_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			kw_mientras();
			setState(415);
			operacion_logica();
			setState(416);
			kw_hacer();
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
		public Kw_finmientrasContext kw_finmientras() {
			return getRuleContext(Kw_finmientrasContext.class,0);
		}
		public List<EscrituraContext> escritura() {
			return getRuleContexts(EscrituraContext.class);
		}
		public EscrituraContext escritura(int i) {
			return getRuleContext(EscrituraContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public Cuerpo_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCuerpo_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCuerpo_mientras(this);
		}
	}

	public final Cuerpo_mientrasContext cuerpo_mientras() throws RecognitionException {
		Cuerpo_mientrasContext _localctx = new Cuerpo_mientrasContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_cuerpo_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(420);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD_ESCRIBIR:
					{
					setState(418);
					escritura();
					}
					break;
				case IDENTIFICADOR:
				case CADENA_CARACTERES:
					{
					setState(419);
					asignacion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(422); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_ESCRIBIR) | (1L << IDENTIFICADOR) | (1L << CADENA_CARACTERES))) != 0) );
			setState(424);
			kw_finmientras();
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterBucle_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitBucle_para(this);
		}
	}

	public final Bucle_paraContext bucle_para() throws RecognitionException {
		Bucle_paraContext _localctx = new Bucle_paraContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_bucle_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			cabecera_para();
			setState(427);
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
		public Kw_paraContext kw_para() {
			return getRuleContext(Kw_paraContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Kw_hastaContext kw_hasta() {
			return getRuleContext(Kw_hastaContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Kw_hacerContext kw_hacer() {
			return getRuleContext(Kw_hacerContext.class,0);
		}
		public Cabecera_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCabecera_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCabecera_para(this);
		}
	}

	public final Cabecera_paraContext cabecera_para() throws RecognitionException {
		Cabecera_paraContext _localctx = new Cabecera_paraContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_cabecera_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			kw_para();
			setState(430);
			asignacion();
			setState(431);
			kw_hasta();
			setState(432);
			numero();
			setState(433);
			kw_hacer();
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
		public Kw_finparaContext kw_finpara() {
			return getRuleContext(Kw_finparaContext.class,0);
		}
		public List<EscrituraContext> escritura() {
			return getRuleContexts(EscrituraContext.class);
		}
		public EscrituraContext escritura(int i) {
			return getRuleContext(EscrituraContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public Cuerpo_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCuerpo_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCuerpo_para(this);
		}
	}

	public final Cuerpo_paraContext cuerpo_para() throws RecognitionException {
		Cuerpo_paraContext _localctx = new Cuerpo_paraContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_cuerpo_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(437);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD_ESCRIBIR:
					{
					setState(435);
					escritura();
					}
					break;
				case IDENTIFICADOR:
				case CADENA_CARACTERES:
					{
					setState(436);
					asignacion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_ESCRIBIR) | (1L << IDENTIFICADOR) | (1L << CADENA_CARACTERES))) != 0) );
			setState(441);
			kw_finpara();
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterBucle_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitBucle_repetir(this);
		}
	}

	public final Bucle_repetirContext bucle_repetir() throws RecognitionException {
		Bucle_repetirContext _localctx = new Bucle_repetirContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_bucle_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			cabecera_repetir();
			setState(444);
			cuerpo_repetir();
			setState(445);
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
		public Kw_repetirContext kw_repetir() {
			return getRuleContext(Kw_repetirContext.class,0);
		}
		public Cabecera_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCabecera_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCabecera_repetir(this);
		}
	}

	public final Cabecera_repetirContext cabecera_repetir() throws RecognitionException {
		Cabecera_repetirContext _localctx = new Cabecera_repetirContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_cabecera_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			kw_repetir();
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
		public List<EscrituraContext> escritura() {
			return getRuleContexts(EscrituraContext.class);
		}
		public EscrituraContext escritura(int i) {
			return getRuleContext(EscrituraContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public Cuerpo_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCuerpo_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCuerpo_repetir(this);
		}
	}

	public final Cuerpo_repetirContext cuerpo_repetir() throws RecognitionException {
		Cuerpo_repetirContext _localctx = new Cuerpo_repetirContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_cuerpo_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(451);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KEYWORD_ESCRIBIR:
					{
					setState(449);
					escritura();
					}
					break;
				case IDENTIFICADOR:
				case CADENA_CARACTERES:
					{
					setState(450);
					asignacion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(453); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_ESCRIBIR) | (1L << IDENTIFICADOR) | (1L << CADENA_CARACTERES))) != 0) );
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
		public Kw_hastaqueContext kw_hastaque() {
			return getRuleContext(Kw_hastaqueContext.class,0);
		}
		public Operacion_logicaContext operacion_logica() {
			return getRuleContext(Operacion_logicaContext.class,0);
		}
		public Condicion_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCondicion_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCondicion_repetir(this);
		}
	}

	public final Condicion_repetirContext condicion_repetir() throws RecognitionException {
		Condicion_repetirContext _localctx = new Condicion_repetirContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_condicion_repetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			kw_hastaque();
			setState(456);
			operacion_logica();
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterSegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitSegun(this);
		}
	}

	public final SegunContext segun() throws RecognitionException {
		SegunContext _localctx = new SegunContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_segun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			cabecera_segun();
			setState(459);
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
		public Kw_segunContext kw_segun() {
			return getRuleContext(Kw_segunContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Kw_hacerContext kw_hacer() {
			return getRuleContext(Kw_hacerContext.class,0);
		}
		public Cabecera_segunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_segun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCabecera_segun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCabecera_segun(this);
		}
	}

	public final Cabecera_segunContext cabecera_segun() throws RecognitionException {
		Cabecera_segunContext _localctx = new Cabecera_segunContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_cabecera_segun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			kw_segun();
			setState(462);
			var();
			setState(463);
			kw_hacer();
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
		public List<TerminalNode> CADENA_CARACTERES() { return getTokens(gramParser.CADENA_CARACTERES); }
		public TerminalNode CADENA_CARACTERES(int i) {
			return getToken(gramParser.CADENA_CARACTERES, i);
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterTipo_segun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitTipo_segun(this);
		}
	}

	public final Tipo_segunContext tipo_segun() throws RecognitionException {
		Tipo_segunContext _localctx = new Tipo_segunContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tipo_segun);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(468);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(465);
						var();
						}
						break;
					case 2:
						{
						setState(466);
						match(CADENA_CARACTERES);
						}
						break;
					case 3:
						{
						setState(467);
						numero();
						}
						break;
					}
					setState(470);
					dos_puntos();
					setState(471);
					cuerpo_segun();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(475); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORD_DEOTROMODO) {
				{
				setState(477);
				tipo_deotromodo();
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

	public static class Tipo_deotromodoContext extends ParserRuleContext {
		public Kw_deotromodoContext kw_deotromodo() {
			return getRuleContext(Kw_deotromodoContext.class,0);
		}
		public Dos_puntosContext dos_puntos() {
			return getRuleContext(Dos_puntosContext.class,0);
		}
		public Cuerpo_segunContext cuerpo_segun() {
			return getRuleContext(Cuerpo_segunContext.class,0);
		}
		public Kw_finsegunContext kw_finsegun() {
			return getRuleContext(Kw_finsegunContext.class,0);
		}
		public Tipo_deotromodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_deotromodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterTipo_deotromodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitTipo_deotromodo(this);
		}
	}

	public final Tipo_deotromodoContext tipo_deotromodo() throws RecognitionException {
		Tipo_deotromodoContext _localctx = new Tipo_deotromodoContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tipo_deotromodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			kw_deotromodo();
			setState(481);
			dos_puntos();
			setState(482);
			cuerpo_segun();
			setState(483);
			kw_finsegun();
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
		public List<EscrituraContext> escritura() {
			return getRuleContexts(EscrituraContext.class);
		}
		public EscrituraContext escritura(int i) {
			return getRuleContext(EscrituraContext.class,i);
		}
		public Cuerpo_segunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_segun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCuerpo_segun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCuerpo_segun(this);
		}
	}

	public final Cuerpo_segunContext cuerpo_segun() throws RecognitionException {
		Cuerpo_segunContext _localctx = new Cuerpo_segunContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_cuerpo_segun);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(486); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(485);
					escritura();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(488); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class DimensionContext extends ParserRuleContext {
		public Kw_dimensionContext kw_dimension() {
			return getRuleContext(Kw_dimensionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Corchete_izqContext corchete_izq() {
			return getRuleContext(Corchete_izqContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Corchete_derContext corchete_der() {
			return getRuleContext(Corchete_derContext.class,0);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitDimension(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			kw_dimension();
			setState(491);
			var();
			setState(492);
			corchete_izq();
			setState(493);
			numero();
			setState(494);
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

	public static class AlgoritmoContext extends ParserRuleContext {
		public Cabecera_algoritmoContext cabecera_algoritmo() {
			return getRuleContext(Cabecera_algoritmoContext.class,0);
		}
		public Cuerpo_algoritmoContext cuerpo_algoritmo() {
			return getRuleContext(Cuerpo_algoritmoContext.class,0);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitAlgoritmo(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_algoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			cabecera_algoritmo();
			setState(497);
			cuerpo_algoritmo();
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

	public static class Cabecera_algoritmoContext extends ParserRuleContext {
		public Kw_algoritmoContext kw_algoritmo() {
			return getRuleContext(Kw_algoritmoContext.class,0);
		}
		public Nombre_algoritmoContext nombre_algoritmo() {
			return getRuleContext(Nombre_algoritmoContext.class,0);
		}
		public Cabecera_algoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCabecera_algoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCabecera_algoritmo(this);
		}
	}

	public final Cabecera_algoritmoContext cabecera_algoritmo() throws RecognitionException {
		Cabecera_algoritmoContext _localctx = new Cabecera_algoritmoContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_cabecera_algoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			kw_algoritmo();
			setState(500);
			nombre_algoritmo();
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

	public static class Nombre_algoritmoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Nombre_algoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterNombre_algoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitNombre_algoritmo(this);
		}
	}

	public final Nombre_algoritmoContext nombre_algoritmo() throws RecognitionException {
		Nombre_algoritmoContext _localctx = new Nombre_algoritmoContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_nombre_algoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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

	public static class Cuerpo_algoritmoContext extends ParserRuleContext {
		public Kw_finalgoritmoContext kw_finalgoritmo() {
			return getRuleContext(Kw_finalgoritmoContext.class,0);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<LecturaContext> lectura() {
			return getRuleContexts(LecturaContext.class);
		}
		public LecturaContext lectura(int i) {
			return getRuleContext(LecturaContext.class,i);
		}
		public List<EscrituraContext> escritura() {
			return getRuleContexts(EscrituraContext.class);
		}
		public EscrituraContext escritura(int i) {
			return getRuleContext(EscrituraContext.class,i);
		}
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public List<DimensionContext> dimension() {
			return getRuleContexts(DimensionContext.class);
		}
		public DimensionContext dimension(int i) {
			return getRuleContext(DimensionContext.class,i);
		}
		public List<Condicion_siContext> condicion_si() {
			return getRuleContexts(Condicion_siContext.class);
		}
		public Condicion_siContext condicion_si(int i) {
			return getRuleContext(Condicion_siContext.class,i);
		}
		public List<BucleContext> bucle() {
			return getRuleContexts(BucleContext.class);
		}
		public BucleContext bucle(int i) {
			return getRuleContext(BucleContext.class,i);
		}
		public List<SegunContext> segun() {
			return getRuleContexts(SegunContext.class);
		}
		public SegunContext segun(int i) {
			return getRuleContext(SegunContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public TerminalNode TERMINAL() { return getToken(gramParser.TERMINAL, 0); }
		public Cuerpo_algoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCuerpo_algoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCuerpo_algoritmo(this);
		}
	}

	public final Cuerpo_algoritmoContext cuerpo_algoritmo() throws RecognitionException {
		Cuerpo_algoritmoContext _localctx = new Cuerpo_algoritmoContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_cuerpo_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORD_DEFINIR) | (1L << KEYWORD_LEER) | (1L << KEYWORD_ESCRIBIR) | (1L << KEYWORD_SI) | (1L << KEYWORD_PARA) | (1L << KEYWORD_MIENTRAS) | (1L << KEYWORD_REPETIR) | (1L << KEYWORD_SEGUN) | (1L << DIMENSION) | (1L << IDENTIFICADOR) | (1L << CADENA_CARACTERES) | (1L << COMENTARIOABRIR) | (1L << COMENTARIOLINEA))) != 0)) {
				{
				setState(513);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFICADOR:
				case CADENA_CARACTERES:
					{
					setState(504);
					asignacion();
					}
					break;
				case KEYWORD_LEER:
					{
					setState(505);
					lectura();
					}
					break;
				case KEYWORD_ESCRIBIR:
					{
					setState(506);
					escritura();
					}
					break;
				case KEYWORD_DEFINIR:
					{
					setState(507);
					definicion();
					}
					break;
				case DIMENSION:
					{
					setState(508);
					dimension();
					}
					break;
				case KEYWORD_SI:
					{
					setState(509);
					condicion_si();
					}
					break;
				case KEYWORD_PARA:
				case KEYWORD_MIENTRAS:
				case KEYWORD_REPETIR:
					{
					setState(510);
					bucle();
					}
					break;
				case KEYWORD_SEGUN:
					{
					setState(511);
					segun();
					}
					break;
				case COMENTARIOABRIR:
				case COMENTARIOLINEA:
					{
					setState(512);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TERMINAL) {
				{
				setState(518);
				match(TERMINAL);
				}
			}

			setState(521);
			kw_finalgoritmo();
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
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitFuncion(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			cabecera_funcion();
			setState(524);
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
		public Kw_funcionContext kw_funcion() {
			return getRuleContext(Kw_funcionContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Op_asignacionContext op_asignacion() {
			return getRuleContext(Op_asignacionContext.class,0);
		}
		public Parentesis_izqContext parentesis_izq() {
			return getRuleContext(Parentesis_izqContext.class,0);
		}
		public Parentesis_derContext parentesis_der() {
			return getRuleContext(Parentesis_derContext.class,0);
		}
		public Cabecera_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCabecera_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCabecera_funcion(this);
		}
	}

	public final Cabecera_funcionContext cabecera_funcion() throws RecognitionException {
		Cabecera_funcionContext _localctx = new Cabecera_funcionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_cabecera_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			kw_funcion();
			setState(527);
			var();
			setState(528);
			op_asignacion();
			setState(529);
			var();
			setState(530);
			parentesis_izq();
			setState(531);
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

	public static class Cuerpo_funcionContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Op_asignacionContext op_asignacion() {
			return getRuleContext(Op_asignacionContext.class,0);
		}
		public Kw_finfuncionContext kw_finfuncion() {
			return getRuleContext(Kw_finfuncionContext.class,0);
		}
		public TerminalNode TERMINAL() { return getToken(gramParser.TERMINAL, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<TerminalNode> CADENA_CARACTERES() { return getTokens(gramParser.CADENA_CARACTERES); }
		public TerminalNode CADENA_CARACTERES(int i) {
			return getToken(gramParser.CADENA_CARACTERES, i);
		}
		public List<TerminalNode> SUMA() { return getTokens(gramParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(gramParser.SUMA, i);
		}
		public List<TerminalNode> COMA() { return getTokens(gramParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(gramParser.COMA, i);
		}
		public Cuerpo_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterCuerpo_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitCuerpo_funcion(this);
		}
	}

	public final Cuerpo_funcionContext cuerpo_funcion() throws RecognitionException {
		Cuerpo_funcionContext _localctx = new Cuerpo_funcionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_cuerpo_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			var();
			setState(534);
			op_asignacion();
			{
			setState(549); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(535);
					numero();
					}
					break;
				case 2:
					{
					setState(536);
					match(CADENA_CARACTERES);
					}
					break;
				case 3:
					{
					setState(537);
					var();
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA || _la==SUMA) {
						{
						{
						setState(538);
						_la = _input.LA(1);
						if ( !(_la==COMA || _la==SUMA) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(542);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
						case 1:
							{
							setState(539);
							numero();
							}
							break;
						case 2:
							{
							setState(540);
							match(CADENA_CARACTERES);
							}
							break;
						case 3:
							{
							setState(541);
							var();
							}
							break;
						}
						}
						}
						setState(548);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				setState(551); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << IDENTIFICADOR) | (1L << CADENA_CARACTERES))) != 0) );
			}
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TERMINAL) {
				{
				setState(553);
				match(TERMINAL);
				}
			}

			setState(556);
			kw_finfuncion();
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Parentesis_izqContext parentesis_izq() {
			return getRuleContext(Parentesis_izqContext.class,0);
		}
		public Parentesis_derContext parentesis_der() {
			return getRuleContext(Parentesis_derContext.class,0);
		}
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitLlamada_funcion(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_llamada_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			var();
			setState(559);
			parentesis_izq();
			setState(560);
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
		public TerminalNode TEXTOCOMENTARIOML() { return getToken(gramParser.TEXTOCOMENTARIOML, 0); }
		public List<TerminalNode> TEXTOCOMENTARIOUL() { return getTokens(gramParser.TEXTOCOMENTARIOUL); }
		public TerminalNode TEXTOCOMENTARIOUL(int i) {
			return getToken(gramParser.TEXTOCOMENTARIOUL, i);
		}
		public TextosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterTextos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitTextos(this);
		}
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_textos);
		try {
			int _alt;
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTOCOMENTARIOML:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				match(TEXTOCOMENTARIOML);
				}
				break;
			case TEXTOCOMENTARIOUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(564); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(563);
						match(TEXTOCOMENTARIOUL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(566); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		public TerminalNode COMENTARIOABRIR() { return getToken(gramParser.COMENTARIOABRIR, 0); }
		public TerminalNode COMENTARIOCERRAR() { return getToken(gramParser.COMENTARIOCERRAR, 0); }
		public List<TextosContext> textos() {
			return getRuleContexts(TextosContext.class);
		}
		public TextosContext textos(int i) {
			return getRuleContext(TextosContext.class,i);
		}
		public List<TerminalNode> TERMINAL() { return getTokens(gramParser.TERMINAL); }
		public TerminalNode TERMINAL(int i) {
			return getToken(gramParser.TERMINAL, i);
		}
		public TerminalNode COMENTARIOLINEA() { return getToken(gramParser.COMENTARIOLINEA, 0); }
		public TerminalNode FINAL_COMENTARIO_UL() { return getToken(gramParser.FINAL_COMENTARIO_UL, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramParserListener ) ((gramParserListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_comentario);
		int _la;
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				match(COMENTARIOABRIR);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TERMINAL) | (1L << TEXTOCOMENTARIOML) | (1L << TEXTOCOMENTARIOUL))) != 0)) {
					{
					setState(573);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTOCOMENTARIOML:
					case TEXTOCOMENTARIOUL:
						{
						setState(571);
						textos();
						}
						break;
					case TERMINAL:
						{
						setState(572);
						match(TERMINAL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(578);
				match(COMENTARIOCERRAR);
				}
				break;
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(COMENTARIOLINEA);
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTOCOMENTARIOML || _la==TEXTOCOMENTARIOUL) {
					{
					{
					setState(580);
					textos();
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(586);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0250\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\5\2\u00b2\n\2\3\2\3\2\7\2\u00b6\n\2\f\2"+
		"\16\2\u00b9\13\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\5\36"+
		"\u00f3\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\5%\u0104"+
		"\n%\3&\3&\3&\3&\5&\u010a\n&\3\'\3\'\3(\3(\5(\u0110\n(\3(\3(\5(\u0114\n"+
		"(\3(\3(\5(\u0118\n(\3)\3)\5)\u011c\n)\3)\3)\3)\5)\u0121\n)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u0138\n\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0140\n\62\3\63\3"+
		"\63\3\63\3\63\5\63\u0146\n\63\3\63\3\63\3\63\3\63\5\63\u014c\n\63\7\63"+
		"\u014e\n\63\f\63\16\63\u0151\13\63\3\63\5\63\u0154\n\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u015e\n\65\3\66\3\66\3\66\3\66\3\66\5\66"+
		"\u0165\n\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u016d\n\67\f\67\16\67\u0170"+
		"\13\67\6\67\u0172\n\67\r\67\16\67\u0173\38\38\38\38\78\u017a\n8\f8\16"+
		"8\u017d\138\39\39\39\59\u0182\n9\3:\3:\3:\3;\3;\3;\3;\3<\3<\5<\u018d\n"+
		"<\3<\3<\3<\7<\u0192\n<\f<\16<\u0195\13<\3<\3<\3=\3=\3=\5=\u019c\n=\3>"+
		"\3>\3>\3?\3?\3?\3?\3@\3@\6@\u01a7\n@\r@\16@\u01a8\3@\3@\3A\3A\3A\3B\3"+
		"B\3B\3B\3B\3B\3C\3C\6C\u01b8\nC\rC\16C\u01b9\3C\3C\3D\3D\3D\3D\3E\3E\3"+
		"F\3F\6F\u01c6\nF\rF\16F\u01c7\3G\3G\3G\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\5"+
		"J\u01d7\nJ\3J\3J\3J\6J\u01dc\nJ\rJ\16J\u01dd\3J\5J\u01e1\nJ\3K\3K\3K\3"+
		"K\3K\3L\6L\u01e9\nL\rL\16L\u01ea\3M\3M\3M\3M\3M\3M\3N\3N\3N\3O\3O\3O\3"+
		"P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u0204\nQ\fQ\16Q\u0207\13Q\3Q\5Q\u020a"+
		"\nQ\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T"+
		"\u0221\nT\7T\u0223\nT\fT\16T\u0226\13T\6T\u0228\nT\rT\16T\u0229\3T\5T"+
		"\u022d\nT\3T\3T\3U\3U\3U\3U\3V\3V\6V\u0237\nV\rV\16V\u0238\5V\u023b\n"+
		"V\3W\3W\3W\7W\u0240\nW\fW\16W\u0243\13W\3W\3W\3W\7W\u0248\nW\fW\16W\u024b"+
		"\13W\3W\5W\u024e\nW\3W\2\2X\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\2\6\3\2\34\37\3\2!\""+
		"\3\2\32\33\4\2))//\2\u0244\2\u00b7\3\2\2\2\4\u00ba\3\2\2\2\6\u00bc\3\2"+
		"\2\2\b\u00be\3\2\2\2\n\u00c0\3\2\2\2\f\u00c2\3\2\2\2\16\u00c4\3\2\2\2"+
		"\20\u00c6\3\2\2\2\22\u00c8\3\2\2\2\24\u00ca\3\2\2\2\26\u00cc\3\2\2\2\30"+
		"\u00ce\3\2\2\2\32\u00d0\3\2\2\2\34\u00d2\3\2\2\2\36\u00d4\3\2\2\2 \u00d6"+
		"\3\2\2\2\"\u00d8\3\2\2\2$\u00da\3\2\2\2&\u00dc\3\2\2\2(\u00de\3\2\2\2"+
		"*\u00e0\3\2\2\2,\u00e2\3\2\2\2.\u00e4\3\2\2\2\60\u00e6\3\2\2\2\62\u00e8"+
		"\3\2\2\2\64\u00ea\3\2\2\2\66\u00ec\3\2\2\28\u00ee\3\2\2\2:\u00f2\3\2\2"+
		"\2<\u00f4\3\2\2\2>\u00f6\3\2\2\2@\u00f8\3\2\2\2B\u00fa\3\2\2\2D\u00fc"+
		"\3\2\2\2F\u00fe\3\2\2\2H\u0103\3\2\2\2J\u0109\3\2\2\2L\u010b\3\2\2\2N"+
		"\u010f\3\2\2\2P\u011b\3\2\2\2R\u0122\3\2\2\2T\u0124\3\2\2\2V\u0126\3\2"+
		"\2\2X\u0128\3\2\2\2Z\u012a\3\2\2\2\\\u012c\3\2\2\2^\u012e\3\2\2\2`\u0137"+
		"\3\2\2\2b\u0139\3\2\2\2d\u0141\3\2\2\2f\u0155\3\2\2\2h\u0158\3\2\2\2j"+
		"\u0164\3\2\2\2l\u0171\3\2\2\2n\u0175\3\2\2\2p\u0181\3\2\2\2r\u0183\3\2"+
		"\2\2t\u0186\3\2\2\2v\u018c\3\2\2\2x\u019b\3\2\2\2z\u019d\3\2\2\2|\u01a0"+
		"\3\2\2\2~\u01a6\3\2\2\2\u0080\u01ac\3\2\2\2\u0082\u01af\3\2\2\2\u0084"+
		"\u01b7\3\2\2\2\u0086\u01bd\3\2\2\2\u0088\u01c1\3\2\2\2\u008a\u01c5\3\2"+
		"\2\2\u008c\u01c9\3\2\2\2\u008e\u01cc\3\2\2\2\u0090\u01cf\3\2\2\2\u0092"+
		"\u01db\3\2\2\2\u0094\u01e2\3\2\2\2\u0096\u01e8\3\2\2\2\u0098\u01ec\3\2"+
		"\2\2\u009a\u01f2\3\2\2\2\u009c\u01f5\3\2\2\2\u009e\u01f8\3\2\2\2\u00a0"+
		"\u0205\3\2\2\2\u00a2\u020d\3\2\2\2\u00a4\u0210\3\2\2\2\u00a6\u0217\3\2"+
		"\2\2\u00a8\u0230\3\2\2\2\u00aa\u023a\3\2\2\2\u00ac\u024d\3\2\2\2\u00ae"+
		"\u00b2\5\u009aN\2\u00af\u00b2\5\u00a2R\2\u00b0\u00b2\5\u00acW\2\u00b1"+
		"\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b4\7\62\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\3\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\3\2\2\u00bb\5\3\2\2\2\u00bc\u00bd\7"+
		"\27\2\2\u00bd\7\3\2\2\2\u00be\u00bf\7\4\2\2\u00bf\t\3\2\2\2\u00c0\u00c1"+
		"\7\5\2\2\u00c1\13\3\2\2\2\u00c2\u00c3\7\6\2\2\u00c3\r\3\2\2\2\u00c4\u00c5"+
		"\7\7\2\2\u00c5\17\3\2\2\2\u00c6\u00c7\7\b\2\2\u00c7\21\3\2\2\2\u00c8\u00c9"+
		"\7\t\2\2\u00c9\23\3\2\2\2\u00ca\u00cb\7\n\2\2\u00cb\25\3\2\2\2\u00cc\u00cd"+
		"\7\13\2\2\u00cd\27\3\2\2\2\u00ce\u00cf\7\f\2\2\u00cf\31\3\2\2\2\u00d0"+
		"\u00d1\7\r\2\2\u00d1\33\3\2\2\2\u00d2\u00d3\7\16\2\2\u00d3\35\3\2\2\2"+
		"\u00d4\u00d5\7\17\2\2\u00d5\37\3\2\2\2\u00d6\u00d7\7\20\2\2\u00d7!\3\2"+
		"\2\2\u00d8\u00d9\7\21\2\2\u00d9#\3\2\2\2\u00da\u00db\7\22\2\2\u00db%\3"+
		"\2\2\2\u00dc\u00dd\7\23\2\2\u00dd\'\3\2\2\2\u00de\u00df\7\24\2\2\u00df"+
		")\3\2\2\2\u00e0\u00e1\7\25\2\2\u00e1+\3\2\2\2\u00e2\u00e3\7\26\2\2\u00e3"+
		"-\3\2\2\2\u00e4\u00e5\7\30\2\2\u00e5/\3\2\2\2\u00e6\u00e7\7\31\2\2\u00e7"+
		"\61\3\2\2\2\u00e8\u00e9\7 \2\2\u00e9\63\3\2\2\2\u00ea\u00eb\t\2\2\2\u00eb"+
		"\65\3\2\2\2\u00ec\u00ed\t\3\2\2\u00ed\67\3\2\2\2\u00ee\u00ef\7#\2\2\u00ef"+
		"9\3\2\2\2\u00f0\u00f3\58\35\2\u00f1\u00f3\7\61\2\2\u00f2\u00f0\3\2\2\2"+
		"\u00f2\u00f1\3\2\2\2\u00f3;\3\2\2\2\u00f4\u00f5\7,\2\2\u00f5=\3\2\2\2"+
		"\u00f6\u00f7\7-\2\2\u00f7?\3\2\2\2\u00f8\u00f9\7.\2\2\u00f9A\3\2\2\2\u00fa"+
		"\u00fb\7+\2\2\u00fbC\3\2\2\2\u00fc\u00fd\7/\2\2\u00fdE\3\2\2\2\u00fe\u00ff"+
		"\7\60\2\2\u00ffG\3\2\2\2\u0100\u0104\5<\37\2\u0101\u0104\5> \2\u0102\u0104"+
		"\5@!\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"I\3\2\2\2\u0105\u010a\5B\"\2\u0106\u010a\5D#\2\u0107\u010a\5L\'\2\u0108"+
		"\u010a\5H%\2\u0109\u0105\3\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2"+
		"\2\u0109\u0108\3\2\2\2\u010aK\3\2\2\2\u010b\u010c\t\4\2\2\u010cM\3\2\2"+
		"\2\u010d\u0110\5:\36\2\u010e\u0110\5\66\34\2\u010f\u010d\3\2\2\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u0114\5H%\2\u0112\u0114\5@!\2"+
		"\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0118"+
		"\5:\36\2\u0116\u0118\5\66\34\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2"+
		"\u0118O\3\2\2\2\u0119\u011c\5:\36\2\u011a\u011c\5\66\34\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0120\5J&\2\u011e"+
		"\u0121\5:\36\2\u011f\u0121\5\66\34\2\u0120\u011e\3\2\2\2\u0120\u011f\3"+
		"\2\2\2\u0121Q\3\2\2\2\u0122\u0123\7(\2\2\u0123S\3\2\2\2\u0124\u0125\7"+
		")\2\2\u0125U\3\2\2\2\u0126\u0127\7*\2\2\u0127W\3\2\2\2\u0128\u0129\7$"+
		"\2\2\u0129Y\3\2\2\2\u012a\u012b\7%\2\2\u012b[\3\2\2\2\u012c\u012d\7&\2"+
		"\2\u012d]\3\2\2\2\u012e\u012f\7\'\2\2\u012f_\3\2\2\2\u0130\u0138\5X-\2"+
		"\u0131\u0138\5Z.\2\u0132\u0138\5R*\2\u0133\u0138\5T+\2\u0134\u0138\5V"+
		",\2\u0135\u0138\5\\/\2\u0136\u0138\5^\60\2\u0137\u0130\3\2\2\2\u0137\u0131"+
		"\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138a\3\2\2\2\u0139\u013a\5:\36\2"+
		"\u013a\u013f\5B\"\2\u013b\u0140\5\66\34\2\u013c\u0140\5:\36\2\u013d\u0140"+
		"\7\61\2\2\u013e\u0140\5P)\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140c\3\2\2\2\u0141\u0145\5\16\b\2"+
		"\u0142\u0146\7\61\2\2\u0143\u0146\5\u00a8U\2\u0144\u0146\5:\36\2\u0145"+
		"\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u014f\3\2"+
		"\2\2\u0147\u014b\t\5\2\2\u0148\u014c\5:\36\2\u0149\u014c\7\61\2\2\u014a"+
		"\u014c\5\u00a8U\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a"+
		"\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u0147\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0152\u0154\5`\61\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"e\3\2\2\2\u0155\u0156\5\f\7\2\u0156\u0157\5:\36\2\u0157g\3\2\2\2\u0158"+
		"\u0159\5\b\5\2\u0159\u015a\5:\36\2\u015a\u015b\5\n\6\2\u015b\u015d\5\64"+
		"\33\2\u015c\u015e\5`\61\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"i\3\2\2\2\u015f\u0165\5L\'\2\u0160\u0161\5:\36\2\u0161\u0162\5H%\2\u0162"+
		"\u0163\5:\36\2\u0163\u0165\3\2\2\2\u0164\u015f\3\2\2\2\u0164\u0160\3\2"+
		"\2\2\u0165k\3\2\2\2\u0166\u0167\5\64\33\2\u0167\u016e\5:\36\2\u0168\u0169"+
		"\5T+\2\u0169\u016a\5\64\33\2\u016a\u016b\5:\36\2\u016b\u016d\3\2\2\2\u016c"+
		"\u0168\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0166\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174m\3\2\2\2"+
		"\u0175\u017b\5:\36\2\u0176\u0177\5T+\2\u0177\u0178\5:\36\2\u0178\u017a"+
		"\3\2\2\2\u0179\u0176\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017co\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0182\5j\66\2"+
		"\u017f\u0182\5l\67\2\u0180\u0182\5n8\2\u0181\u017e\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0180\3\2\2\2\u0182q\3\2\2\2\u0183\u0184\5t;\2\u0184\u0185"+
		"\5v<\2\u0185s\3\2\2\2\u0186\u0187\5\20\t\2\u0187\u0188\5N(\2\u0188\u0189"+
		"\5\24\13\2\u0189u\3\2\2\2\u018a\u018d\5d\63\2\u018b\u018d\5r:\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0193\5\22"+
		"\n\2\u018f\u0192\5d\63\2\u0190\u0192\5r:\2\u0191\u018f\3\2\2\2\u0191\u0190"+
		"\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\5\26\f\2\u0197w\3\2\2\2"+
		"\u0198\u019c\5z>\2\u0199\u019c\5\u0080A\2\u019a\u019c\5\u0086D\2\u019b"+
		"\u0198\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019cy\3\2\2\2"+
		"\u019d\u019e\5|?\2\u019e\u019f\5~@\2\u019f{\3\2\2\2\u01a0\u01a1\5 \21"+
		"\2\u01a1\u01a2\5N(\2\u01a2\u01a3\5\34\17\2\u01a3}\3\2\2\2\u01a4\u01a7"+
		"\5d\63\2\u01a5\u01a7\5b\62\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2"+
		"\2\2\u01aa\u01ab\5\"\22\2\u01ab\177\3\2\2\2\u01ac\u01ad\5\u0082B\2\u01ad"+
		"\u01ae\5\u0084C\2\u01ae\u0081\3\2\2\2\u01af\u01b0\5\30\r\2\u01b0\u01b1"+
		"\5b\62\2\u01b1\u01b2\5\32\16\2\u01b2\u01b3\5\66\34\2\u01b3\u01b4\5\34"+
		"\17\2\u01b4\u0083\3\2\2\2\u01b5\u01b8\5d\63\2\u01b6\u01b8\5b\62\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5\36\20\2\u01bc"+
		"\u0085\3\2\2\2\u01bd\u01be\5\u0088E\2\u01be\u01bf\5\u008aF\2\u01bf\u01c0"+
		"\5\u008cG\2\u01c0\u0087\3\2\2\2\u01c1\u01c2\5$\23\2\u01c2\u0089\3\2\2"+
		"\2\u01c3\u01c6\5d\63\2\u01c4\u01c6\5b\62\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u008b\3\2\2\2\u01c9\u01ca\5&\24\2\u01ca\u01cb\5N(\2\u01cb\u008d\3\2\2"+
		"\2\u01cc\u01cd\5\u0090I\2\u01cd\u01ce\5\u0092J\2\u01ce\u008f\3\2\2\2\u01cf"+
		"\u01d0\5(\25\2\u01d0\u01d1\5:\36\2\u01d1\u01d2\5\34\17\2\u01d2\u0091\3"+
		"\2\2\2\u01d3\u01d7\5:\36\2\u01d4\u01d7\7\61\2\2\u01d5\u01d7\5\66\34\2"+
		"\u01d6\u01d3\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8\u01d9\5V,\2\u01d9\u01da\5\u0096L\2\u01da\u01dc\3\2\2\2"+
		"\u01db\u01d6\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01e1\5\u0094K\2\u01e0\u01df\3\2\2"+
		"\2\u01e0\u01e1\3\2\2\2\u01e1\u0093\3\2\2\2\u01e2\u01e3\5*\26\2\u01e3\u01e4"+
		"\5V,\2\u01e4\u01e5\5\u0096L\2\u01e5\u01e6\5,\27\2\u01e6\u0095\3\2\2\2"+
		"\u01e7\u01e9\5d\63\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u0097\3\2\2\2\u01ec\u01ed\5\62\32\2"+
		"\u01ed\u01ee\5:\36\2\u01ee\u01ef\5\\/\2\u01ef\u01f0\5\66\34\2\u01f0\u01f1"+
		"\5^\60\2\u01f1\u0099\3\2\2\2\u01f2\u01f3\5\u009cO\2\u01f3\u01f4\5\u00a0"+
		"Q\2\u01f4\u009b\3\2\2\2\u01f5\u01f6\5\4\3\2\u01f6\u01f7\5\u009eP\2\u01f7"+
		"\u009d\3\2\2\2\u01f8\u01f9\58\35\2\u01f9\u009f\3\2\2\2\u01fa\u0204\5b"+
		"\62\2\u01fb\u0204\5f\64\2\u01fc\u0204\5d\63\2\u01fd\u0204\5h\65\2\u01fe"+
		"\u0204\5\u0098M\2\u01ff\u0204\5r:\2\u0200\u0204\5x=\2\u0201\u0204\5\u008e"+
		"H\2\u0202\u0204\5\u00acW\2\u0203\u01fa\3\2\2\2\u0203\u01fb\3\2\2\2\u0203"+
		"\u01fc\3\2\2\2\u0203\u01fd\3\2\2\2\u0203\u01fe\3\2\2\2\u0203\u01ff\3\2"+
		"\2\2\u0203\u0200\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0209\3\2"+
		"\2\2\u0207\u0205\3\2\2\2\u0208\u020a\7\62\2\2\u0209\u0208\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\5\6\4\2\u020c\u00a1\3\2"+
		"\2\2\u020d\u020e\5\u00a4S\2\u020e\u020f\5\u00a6T\2\u020f\u00a3\3\2\2\2"+
		"\u0210\u0211\5.\30\2\u0211\u0212\5:\36\2\u0212\u0213\5B\"\2\u0213\u0214"+
		"\5:\36\2\u0214\u0215\5X-\2\u0215\u0216\5Z.\2\u0216\u00a5\3\2\2\2\u0217"+
		"\u0218\5:\36\2\u0218\u0227\5B\"\2\u0219\u0228\5\66\34\2\u021a\u0228\7"+
		"\61\2\2\u021b\u0224\5:\36\2\u021c\u0220\t\5\2\2\u021d\u0221\5\66\34\2"+
		"\u021e\u0221\7\61\2\2\u021f\u0221\5:\36\2\u0220\u021d\3\2\2\2\u0220\u021e"+
		"\3\2\2\2\u0220\u021f\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u021c\3\2\2\2\u0223"+
		"\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0228\3\2"+
		"\2\2\u0226\u0224\3\2\2\2\u0227\u0219\3\2\2\2\u0227\u021a\3\2\2\2\u0227"+
		"\u021b\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u022c\3\2\2\2\u022b\u022d\7\62\2\2\u022c\u022b\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\5\60\31\2\u022f\u00a7\3"+
		"\2\2\2\u0230\u0231\5:\36\2\u0231\u0232\5X-\2\u0232\u0233\5Z.\2\u0233\u00a9"+
		"\3\2\2\2\u0234\u023b\7\67\2\2\u0235\u0237\79\2\2\u0236\u0235\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2"+
		"\2\2\u023a\u0234\3\2\2\2\u023a\u0236\3\2\2\2\u023b\u00ab\3\2\2\2\u023c"+
		"\u0241\7\64\2\2\u023d\u0240\5\u00aaV\2\u023e\u0240\7\62\2\2\u023f\u023d"+
		"\3\2\2\2\u023f\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u024e\7\66"+
		"\2\2\u0245\u0249\7\65\2\2\u0246\u0248\5\u00aaV\2\u0247\u0246\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2"+
		"\2\2\u024b\u0249\3\2\2\2\u024c\u024e\78\2\2\u024d\u023c\3\2\2\2\u024d"+
		"\u0245\3\2\2\2\u024e\u00ad\3\2\2\2\64\u00b1\u00b7\u00f2\u0103\u0109\u010f"+
		"\u0113\u0117\u011b\u0120\u0137\u013f\u0145\u014b\u014f\u0153\u015d\u0164"+
		"\u016e\u0173\u017b\u0181\u018c\u0191\u0193\u019b\u01a6\u01a8\u01b7\u01b9"+
		"\u01c5\u01c7\u01d6\u01dd\u01e0\u01ea\u0203\u0205\u0209\u0220\u0224\u0227"+
		"\u0229\u022c\u0238\u023a\u023f\u0241\u0249\u024d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}