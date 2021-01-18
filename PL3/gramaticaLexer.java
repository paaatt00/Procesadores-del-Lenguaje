// Generated from gramaticaLexer.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaLexer extends Lexer {
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
		COMENTARIO_MULTILINEA_MODE=1, COMENTARIO_LINEA_MODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMENTARIO_MULTILINEA_MODE", "COMENTARIO_LINEA_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PCLAVE_ALGORITMO", "PCLAVE_DEFINIR", "PCLAVE_COMO", "PCLAVE_LEER", "PCLAVE_ESCRIBIR", 
			"PCLAVE_SI", "PCLAVE_SINO", "PCLAVE_ENTONCES", "PCLAVE_FINSI", "PCLAVE_PARA", 
			"PCLAVE_HASTA", "PCLAVE_PASO", "PCLAVE_HACER", "PCLAVE_FINPARA", "PCLAVE_MIENTRAS", 
			"PCLAVE_FINMIENTRAS", "PCLAVE_REPETIR", "PCLAVE_HASTAQUE", "PCLAVE_SEGUN", 
			"PCLAVE_DEOTROMODO", "PCLAVE_FINSEGUN", "PCLAVE_FINALGORITMO", "PCLAVE_FUNCION", 
			"PCLAVE_FINFUNCION", "VERDADERO", "FALSO", "CARACTER", "ENTERO", "REAL", 
			"LOGICO", "DIMENSION", "INT", "FLOAT", "IDENTIFICADOR", "CHAR", "DIGITO", 
			"PI", "PD", "CI", "CD", "FIN", "COMA", "DOS_PUNTOS", "ASIGNACION", "MENOR_QUE", 
			"MAYOR_QUE", "IGUAL_QUE", "DISTINTO_QUE", "MAYOR_IGUAL_QUE", "MENOR_IGUAL_QUE", 
			"AND", "OR", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "POTENCIA", 
			"CADENA_CARACTERES", "ESC", "TERMINAL", "WS", "SALTO", "COMENTARIOABRIR", 
			"COMENTARIOLINEA", "COMENTARIOCERRAR", "TEXTOCOMENTARIOML", "FINAL_COMENTARIO_UL", 
			"TEXTOCOMENTARIOUL"
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


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramaticaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u0269\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\u00b4\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e5"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00f6\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u012f\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0189\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \5 \u01d2\n \3!\6!\u01d5\n!\r!\16!\u01d6\3\"\3\"\3\"\6\"\u01dc\n\""+
		"\r\"\16\"\u01dd\3#\3#\3#\7#\u01e3\n#\f#\16#\u01e6\13#\3$\6$\u01e9\n$\r"+
		"$\16$\u01ea\3%\6%\u01ee\n%\r%\16%\u01ef\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\5\61"+
		"\u020d\n\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\7;\u0226\n;\f;\16;\u0229\13;\3;"+
		"\3;\3;\3;\7;\u022f\n;\f;\16;\u0232\13;\3;\5;\u0235\n;\3<\3<\3<\3=\6=\u023b"+
		"\n=\r=\16=\u023c\3>\3>\3>\3>\3?\6?\u0244\n?\r?\16?\u0245\3?\3?\3@\3@\3"+
		"@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\6C\u025c\nC\rC\16C\u025d"+
		"\3D\3D\3D\3D\3D\3E\6E\u0266\nE\rE\16E\u0267\6\u0227\u0230\u025d\u0267"+
		"\2F\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37"+
		"\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36="+
		"\37? A!C\"E#G$I\2K\2M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65o\66"+
		"q\67s8u9w:y\2{;}<\177=\u0081>\u0083?\u0085@\u0087A\u0089B\u008bC\5\2\3"+
		"\4\t\7\2//\62;C\\aac|\3\2\62;\4\2(([[\4\2QQ~~\b\2$$^^ddppttvv\4\2\f\f"+
		"\17\17\4\2\13\f\17\17\2\u027c\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\3\u0087"+
		"\3\2\2\2\4\u0089\3\2\2\2\4\u008b\3\2\2\2\5\u008d\3\2\2\2\7\u00b3\3\2\2"+
		"\2\t\u00b5\3\2\2\2\13\u00ba\3\2\2\2\r\u00bf\3\2\2\2\17\u00c8\3\2\2\2\21"+
		"\u00cb\3\2\2\2\23\u00d0\3\2\2\2\25\u00e4\3\2\2\2\27\u00e6\3\2\2\2\31\u00f5"+
		"\3\2\2\2\33\u00f7\3\2\2\2\35\u0100\3\2\2\2\37\u0106\3\2\2\2!\u010e\3\2"+
		"\2\2#\u012e\3\2\2\2%\u0130\3\2\2\2\'\u0138\3\2\2\2)\u0142\3\2\2\2+\u0148"+
		"\3\2\2\2-\u0155\3\2\2\2/\u015e\3\2\2\2\61\u016b\3\2\2\2\63\u0188\3\2\2"+
		"\2\65\u018a\3\2\2\2\67\u0194\3\2\2\29\u019a\3\2\2\2;\u01a3\3\2\2\2=\u01aa"+
		"\3\2\2\2?\u01af\3\2\2\2A\u01d1\3\2\2\2C\u01d4\3\2\2\2E\u01d8\3\2\2\2G"+
		"\u01df\3\2\2\2I\u01e8\3\2\2\2K\u01ed\3\2\2\2M\u01f1\3\2\2\2O\u01f3\3\2"+
		"\2\2Q\u01f5\3\2\2\2S\u01f7\3\2\2\2U\u01f9\3\2\2\2W\u01fb\3\2\2\2Y\u01fd"+
		"\3\2\2\2[\u01ff\3\2\2\2]\u0202\3\2\2\2_\u0204\3\2\2\2a\u0206\3\2\2\2c"+
		"\u020c\3\2\2\2e\u020e\3\2\2\2g\u0211\3\2\2\2i\u0214\3\2\2\2k\u0216\3\2"+
		"\2\2m\u0218\3\2\2\2o\u021a\3\2\2\2q\u021c\3\2\2\2s\u021e\3\2\2\2u\u0220"+
		"\3\2\2\2w\u0234\3\2\2\2y\u0236\3\2\2\2{\u023a\3\2\2\2}\u023e\3\2\2\2\177"+
		"\u0243\3\2\2\2\u0081\u0249\3\2\2\2\u0083\u024f\3\2\2\2\u0085\u0254\3\2"+
		"\2\2\u0087\u025b\3\2\2\2\u0089\u025f\3\2\2\2\u008b\u0265\3\2\2\2\u008d"+
		"\u008e\7C\2\2\u008e\u008f\7n\2\2\u008f\u0090\7i\2\2\u0090\u0091\7q\2\2"+
		"\u0091\u0092\7t\2\2\u0092\u0093\7k\2\2\u0093\u0094\7v\2\2\u0094\u0095"+
		"\7o\2\2\u0095\u0096\7q\2\2\u0096\6\3\2\2\2\u0097\u0098\7F\2\2\u0098\u0099"+
		"\7g\2\2\u0099\u009a\7h\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u00b4\7t\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7g\2\2"+
		"\u00a0\u00a1\7h\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4"+
		"\7k\2\2\u00a4\u00b4\7t\2\2\u00a5\u00a6\7F\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\u00a8\7h\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7k\2\2"+
		"\u00ab\u00b4\7T\2\2\u00ac\u00ad\7F\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af"+
		"\7H\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7P\2\2\u00b1\u00b2\7K\2\2\u00b2"+
		"\u00b4\7t\2\2\u00b3\u0097\3\2\2\2\u00b3\u009e\3\2\2\2\u00b3\u00a5\3\2"+
		"\2\2\u00b3\u00ac\3\2\2\2\u00b4\b\3\2\2\2\u00b5\u00b6\7E\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\7q\2\2\u00b9\n\3\2\2\2\u00ba\u00bb"+
		"\7N\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7t\2\2\u00be"+
		"\f\3\2\2\2\u00bf\u00c0\7G\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7e\2\2\u00c2"+
		"\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7k\2\2"+
		"\u00c6\u00c7\7t\2\2\u00c7\16\3\2\2\2\u00c8\u00c9\7U\2\2\u00c9\u00ca\7"+
		"k\2\2\u00ca\20\3\2\2\2\u00cb\u00cc\7U\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce"+
		"\7P\2\2\u00ce\u00cf\7q\2\2\u00cf\22\3\2\2\2\u00d0\u00d1\7G\2\2\u00d1\u00d2"+
		"\7p\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5"+
		"\u00d6\7e\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7u\2\2\u00d8\24\3\2\2\2\u00d9"+
		"\u00da\7H\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7U\2\2"+
		"\u00dd\u00e5\7k\2\2\u00de\u00df\7H\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1"+
		"\7p\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00e3\7U\2\2\u00e3\u00e5\7k\2\2\u00e4"+
		"\u00d9\3\2\2\2\u00e4\u00de\3\2\2\2\u00e5\26\3\2\2\2\u00e6\u00e7\7R\2\2"+
		"\u00e7\u00e8\7c\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7c\2\2\u00ea\30\3\2"+
		"\2\2\u00eb\u00ec\7J\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef"+
		"\7v\2\2\u00ef\u00f6\7c\2\2\u00f0\u00f1\7j\2\2\u00f1\u00f2\7c\2\2\u00f2"+
		"\u00f3\7u\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f6\7c\2\2\u00f5\u00eb\3\2\2"+
		"\2\u00f5\u00f0\3\2\2\2\u00f6\32\3\2\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9"+
		"\7q\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7\"\2\2\u00fb\u00fc\7r\2\2\u00fc"+
		"\u00fd\7c\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7q\2\2\u00ff\34\3\2\2\2\u0100"+
		"\u0101\7J\2\2\u0101\u0102\7c\2\2\u0102\u0103\7e\2\2\u0103\u0104\7g\2\2"+
		"\u0104\u0105\7t\2\2\u0105\36\3\2\2\2\u0106\u0107\7H\2\2\u0107\u0108\7"+
		"k\2\2\u0108\u0109\7p\2\2\u0109\u010a\7R\2\2\u010a\u010b\7c\2\2\u010b\u010c"+
		"\7t\2\2\u010c\u010d\7c\2\2\u010d \3\2\2\2\u010e\u010f\7O\2\2\u010f\u0110"+
		"\7k\2\2\u0110\u0111\7g\2\2\u0111\u0112\7p\2\2\u0112\u0113\7v\2\2\u0113"+
		"\u0114\7t\2\2\u0114\u0115\7c\2\2\u0115\u0116\7u\2\2\u0116\"\3\2\2\2\u0117"+
		"\u0118\7H\2\2\u0118\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a\u011b\7O\2\2"+
		"\u011b\u011c\7k\2\2\u011c\u011d\7g\2\2\u011d\u011e\7p\2\2\u011e\u011f"+
		"\7v\2\2\u011f\u0120\7t\2\2\u0120\u0121\7c\2\2\u0121\u012f\7u\2\2\u0122"+
		"\u0123\7H\2\2\u0123\u0124\7k\2\2\u0124\u0125\7p\2\2\u0125\u0126\7\"\2"+
		"\2\u0126\u0127\7O\2\2\u0127\u0128\7k\2\2\u0128\u0129\7g\2\2\u0129\u012a"+
		"\7p\2\2\u012a\u012b\7v\2\2\u012b\u012c\7t\2\2\u012c\u012d\7c\2\2\u012d"+
		"\u012f\7u\2\2\u012e\u0117\3\2\2\2\u012e\u0122\3\2\2\2\u012f$\3\2\2\2\u0130"+
		"\u0131\7T\2\2\u0131\u0132\7g\2\2\u0132\u0133\7r\2\2\u0133\u0134\7g\2\2"+
		"\u0134\u0135\7v\2\2\u0135\u0136\7k\2\2\u0136\u0137\7t\2\2\u0137&\3\2\2"+
		"\2\u0138\u0139\7J\2\2\u0139\u013a\7c\2\2\u013a\u013b\7u\2\2\u013b\u013c"+
		"\7v\2\2\u013c\u013d\7c\2\2\u013d\u013e\7\"\2\2\u013e\u013f\7S\2\2\u013f"+
		"\u0140\7w\2\2\u0140\u0141\7g\2\2\u0141(\3\2\2\2\u0142\u0143\7U\2\2\u0143"+
		"\u0144\7g\2\2\u0144\u0145\7i\2\2\u0145\u0146\7w\2\2\u0146\u0147\7p\2\2"+
		"\u0147*\3\2\2\2\u0148\u0149\7F\2\2\u0149\u014a\7g\2\2\u014a\u014b\7\""+
		"\2\2\u014b\u014c\7Q\2\2\u014c\u014d\7v\2\2\u014d\u014e\7t\2\2\u014e\u014f"+
		"\7q\2\2\u014f\u0150\7\"\2\2\u0150\u0151\7O\2\2\u0151\u0152\7q\2\2\u0152"+
		"\u0153\7f\2\2\u0153\u0154\7q\2\2\u0154,\3\2\2\2\u0155\u0156\7H\2\2\u0156"+
		"\u0157\7k\2\2\u0157\u0158\7p\2\2\u0158\u0159\7U\2\2\u0159\u015a\7g\2\2"+
		"\u015a\u015b\7i\2\2\u015b\u015c\7w\2\2\u015c\u015d\7p\2\2\u015d.\3\2\2"+
		"\2\u015e\u015f\7H\2\2\u015f\u0160\7k\2\2\u0160\u0161\7p\2\2\u0161\u0162"+
		"\7C\2\2\u0162\u0163\7n\2\2\u0163\u0164\7i\2\2\u0164\u0165\7q\2\2\u0165"+
		"\u0166\7t\2\2\u0166\u0167\7k\2\2\u0167\u0168\7v\2\2\u0168\u0169\7o\2\2"+
		"\u0169\u016a\7q\2\2\u016a\60\3\2\2\2\u016b\u016c\7H\2\2\u016c\u016d\7"+
		"w\2\2\u016d\u016e\7p\2\2\u016e\u016f\7e\2\2\u016f\u0170\7k\2\2\u0170\u0171"+
		"\7q\2\2\u0171\u0172\7p\2\2\u0172\62\3\2\2\2\u0173\u0174\7H\2\2\u0174\u0175"+
		"\7k\2\2\u0175\u0176\7p\2\2\u0176\u0177\7H\2\2\u0177\u0178\7w\2\2\u0178"+
		"\u0179\7p\2\2\u0179\u017a\7e\2\2\u017a\u017b\7k\2\2\u017b\u017c\7q\2\2"+
		"\u017c\u0189\7p\2\2\u017d\u017e\7H\2\2\u017e\u017f\7k\2\2\u017f\u0180"+
		"\7p\2\2\u0180\u0181\7\"\2\2\u0181\u0182\7H\2\2\u0182\u0183\7w\2\2\u0183"+
		"\u0184\7p\2\2\u0184\u0185\7e\2\2\u0185\u0186\7k\2\2\u0186\u0187\7q\2\2"+
		"\u0187\u0189\7p\2\2\u0188\u0173\3\2\2\2\u0188\u017d\3\2\2\2\u0189\64\3"+
		"\2\2\2\u018a\u018b\7X\2\2\u018b\u018c\7g\2\2\u018c\u018d\7t\2\2\u018d"+
		"\u018e\7f\2\2\u018e\u018f\7c\2\2\u018f\u0190\7f\2\2\u0190\u0191\7g\2\2"+
		"\u0191\u0192\7t\2\2\u0192\u0193\7q\2\2\u0193\66\3\2\2\2\u0194\u0195\7"+
		"H\2\2\u0195\u0196\7c\2\2\u0196\u0197\7n\2\2\u0197\u0198\7u\2\2\u0198\u0199"+
		"\7q\2\2\u01998\3\2\2\2\u019a\u019b\7E\2\2\u019b\u019c\7c\2\2\u019c\u019d"+
		"\7t\2\2\u019d\u019e\7c\2\2\u019e\u019f\7e\2\2\u019f\u01a0\7v\2\2\u01a0"+
		"\u01a1\7g\2\2\u01a1\u01a2\7t\2\2\u01a2:\3\2\2\2\u01a3\u01a4\7G\2\2\u01a4"+
		"\u01a5\7p\2\2\u01a5\u01a6\7v\2\2\u01a6\u01a7\7g\2\2\u01a7\u01a8\7t\2\2"+
		"\u01a8\u01a9\7q\2\2\u01a9<\3\2\2\2\u01aa\u01ab\7T\2\2\u01ab\u01ac\7g\2"+
		"\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7n\2\2\u01ae>\3\2\2\2\u01af\u01b0\7"+
		"N\2\2\u01b0\u01b1\7q\2\2\u01b1\u01b2\7i\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b4"+
		"\7e\2\2\u01b4\u01b5\7q\2\2\u01b5@\3\2\2\2\u01b6\u01b7\7F\2\2\u01b7\u01b8"+
		"\7k\2\2\u01b8\u01b9\7o\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7p\2\2\u01bb"+
		"\u01bc\7u\2\2\u01bc\u01bd\7k\2\2\u01bd\u01be\7q\2\2\u01be\u01d2\7p\2\2"+
		"\u01bf\u01c0\7f\2\2\u01c0\u01c1\7k\2\2\u01c1\u01c2\7o\2\2\u01c2\u01c3"+
		"\7g\2\2\u01c3\u01c4\7p\2\2\u01c4\u01c5\7u\2\2\u01c5\u01c6\7k\2\2\u01c6"+
		"\u01c7\7q\2\2\u01c7\u01d2\7p\2\2\u01c8\u01c9\7F\2\2\u01c9\u01ca\7k\2\2"+
		"\u01ca\u01cb\7O\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd\7P\2\2\u01cd\u01ce"+
		"\7u\2\2\u01ce\u01cf\7K\2\2\u01cf\u01d0\7Q\2\2\u01d0\u01d2\7p\2\2\u01d1"+
		"\u01b6\3\2\2\2\u01d1\u01bf\3\2\2\2\u01d1\u01c8\3\2\2\2\u01d2B\3\2\2\2"+
		"\u01d3\u01d5\5K%\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7D\3\2\2\2\u01d8\u01d9\5K%\2\u01d9\u01db"+
		"\7\60\2\2\u01da\u01dc\5K%\2\u01db\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01deF\3\2\2\2\u01df\u01e4\5I$\2\u01e0"+
		"\u01e3\5I$\2\u01e1\u01e3\5K%\2\u01e2\u01e0\3\2\2\2\u01e2\u01e1\3\2\2\2"+
		"\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5H\3"+
		"\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e9\t\2\2\2\u01e8\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01ebJ\3\2\2\2"+
		"\u01ec\u01ee\t\3\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01ed"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0L\3\2\2\2\u01f1\u01f2\7*\2\2\u01f2N"+
		"\3\2\2\2\u01f3\u01f4\7+\2\2\u01f4P\3\2\2\2\u01f5\u01f6\7]\2\2\u01f6R\3"+
		"\2\2\2\u01f7\u01f8\7_\2\2\u01f8T\3\2\2\2\u01f9\u01fa\7=\2\2\u01faV\3\2"+
		"\2\2\u01fb\u01fc\7.\2\2\u01fcX\3\2\2\2\u01fd\u01fe\7<\2\2\u01feZ\3\2\2"+
		"\2\u01ff\u0200\7>\2\2\u0200\u0201\7/\2\2\u0201\\\3\2\2\2\u0202\u0203\7"+
		">\2\2\u0203^\3\2\2\2\u0204\u0205\7@\2\2\u0205`\3\2\2\2\u0206\u0207\7?"+
		"\2\2\u0207b\3\2\2\2\u0208\u0209\7>\2\2\u0209\u020d\7@\2\2\u020a\u020b"+
		"\7#\2\2\u020b\u020d\7?\2\2\u020c\u0208\3\2\2\2\u020c\u020a\3\2\2\2\u020d"+
		"d\3\2\2\2\u020e\u020f\7@\2\2\u020f\u0210\7?\2\2\u0210f\3\2\2\2\u0211\u0212"+
		"\7>\2\2\u0212\u0213\7?\2\2\u0213h\3\2\2\2\u0214\u0215\t\4\2\2\u0215j\3"+
		"\2\2\2\u0216\u0217\t\5\2\2\u0217l\3\2\2\2\u0218\u0219\7-\2\2\u0219n\3"+
		"\2\2\2\u021a\u021b\7/\2\2\u021bp\3\2\2\2\u021c\u021d\7,\2\2\u021dr\3\2"+
		"\2\2\u021e\u021f\7\61\2\2\u021ft\3\2\2\2\u0220\u0221\7`\2\2\u0221v\3\2"+
		"\2\2\u0222\u0227\7$\2\2\u0223\u0226\5y<\2\u0224\u0226\13\2\2\2\u0225\u0223"+
		"\3\2\2\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0228\3\2\2\2\u0227"+
		"\u0225\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u0235\7$"+
		"\2\2\u022b\u0230\7)\2\2\u022c\u022f\5y<\2\u022d\u022f\13\2\2\2\u022e\u022c"+
		"\3\2\2\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u0231\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0235\7)"+
		"\2\2\u0234\u0222\3\2\2\2\u0234\u022b\3\2\2\2\u0235x\3\2\2\2\u0236\u0237"+
		"\7^\2\2\u0237\u0238\t\6\2\2\u0238z\3\2\2\2\u0239\u023b\t\7\2\2\u023a\u0239"+
		"\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"|\3\2\2\2\u023e\u023f\7\"\2\2\u023f\u0240\3\2\2\2\u0240\u0241\b>\2\2\u0241"+
		"~\3\2\2\2\u0242\u0244\t\b\2\2\u0243\u0242\3\2\2\2\u0244\u0245\3\2\2\2"+
		"\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248"+
		"\b?\2\2\u0248\u0080\3\2\2\2\u0249\u024a\7\61\2\2\u024a\u024b\7,\2\2\u024b"+
		"\u024c\7,\2\2\u024c\u024d\3\2\2\2\u024d\u024e\b@\3\2\u024e\u0082\3\2\2"+
		"\2\u024f\u0250\7\61\2\2\u0250\u0251\7\61\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\bA\4\2\u0253\u0084\3\2\2\2\u0254\u0255\7,\2\2\u0255\u0256\7,\2"+
		"\2\u0256\u0257\7\61\2\2\u0257\u0258\3\2\2\2\u0258\u0259\bB\5\2\u0259\u0086"+
		"\3\2\2\2\u025a\u025c\13\2\2\2\u025b\u025a\3\2\2\2\u025c\u025d\3\2\2\2"+
		"\u025d\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0088\3\2\2\2\u025f\u0260"+
		"\7\17\2\2\u0260\u0261\7\f\2\2\u0261\u0262\3\2\2\2\u0262\u0263\bD\5\2\u0263"+
		"\u008a\3\2\2\2\u0264\u0266\13\2\2\2\u0265\u0264\3\2\2\2\u0266\u0267\3"+
		"\2\2\2\u0267\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u008c\3\2\2\2\33"+
		"\2\3\4\u00b3\u00e4\u00f5\u012e\u0188\u01d1\u01d6\u01dd\u01e2\u01e4\u01ea"+
		"\u01ef\u020c\u0225\u0227\u022e\u0230\u0234\u023c\u0245\u025d\u0267\6\b"+
		"\2\2\7\3\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}