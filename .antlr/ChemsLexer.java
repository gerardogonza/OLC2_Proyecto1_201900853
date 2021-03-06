// Generated from d:\Archivos Varios\2022\Primer Semestre\Compi2\Laboratorio\Proyecto 1\OLC2_Proyecto1_201900853\ChemsLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChemsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINTLN=1, PRINT=2, P_NUMBER=3, P_STRING=4, P_STRING2=5, P_IF=6, P_ELSE=7, 
		P_WHILE=8, P_POW=9, P_POWF=10, P_I64=11, P_F64=12, P_LET=13, P_MUT=14, 
		P_AS=15, P_TRUE=16, P_FALSE=17, P_MATCH=18, P_LOOP=19, P_ABS=20, P_SQRT=21, 
		P_TOSTRING=22, P_CLONE=23, P_FOR=24, P_IN=25, P_BREAK=26, P_CONTINUE=27, 
		P_VECTOR=28, P_PUSH=29, P_INSERT=30, P_REMOVE=31, P_CONTAINS=32, P_LEN=33, 
		P_CAPACITY=34, P_NEW=35, P_WITHCAPACITY=36, P_MAIN=37, P_fn=38, NUMBER=39, 
		DECIMAL=40, STRING=41, ID=42, PUNTO=43, PTCOMA=44, COMA=45, DOSPUNTOS=46, 
		DIFERENTE=47, DIFERENTEDE=48, IGUAL=49, IGUALIGUA=50, MAYORIGUAL=51, MENORIGUAL=52, 
		MAYOR=53, MENOR=54, MUL=55, DIV=56, MODULO=57, ADD=58, SUB=59, PARIZQ=60, 
		PARDER=61, LLAVEIZQ=62, LLAVEDER=63, CORIZQ=64, CORDER=65, OR=66, AND=67, 
		MULTICOMENT=68, WHITESPACE=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINTLN", "PRINT", "P_NUMBER", "P_STRING", "P_STRING2", "P_IF", "P_ELSE", 
			"P_WHILE", "P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", 
			"P_TRUE", "P_FALSE", "P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", "P_TOSTRING", 
			"P_CLONE", "P_FOR", "P_IN", "P_BREAK", "P_CONTINUE", "P_VECTOR", "P_PUSH", 
			"P_INSERT", "P_REMOVE", "P_CONTAINS", "P_LEN", "P_CAPACITY", "P_NEW", 
			"P_WITHCAPACITY", "P_MAIN", "P_fn", "NUMBER", "DECIMAL", "STRING", "ID", 
			"PUNTO", "PTCOMA", "COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", 
			"IGUALIGUA", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", 
			"MODULO", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", 
			"CORDER", "OR", "AND", "MULTICOMENT", "WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'print'", "'number'", "'string'", "'&str'", "'if'", 
			"'else'", "'while'", "'pow'", "'powf'", "'i64'", "'f64'", "'let'", "'mut'", 
			"'as'", "'true'", "'false'", "'match'", "'loop'", "'abs'", "'sqrt'", 
			"'to_string'", "'clone'", "'for'", "'in'", "'break'", "'continue'", "'vec'", 
			"'push'", "'insert'", "'remove'", "'contains'", "'len'", "'capacity'", 
			"'new'", "'with_capacity'", "'main'", "'fn'", null, null, null, null, 
			"'.'", "';'", "','", "':'", "'!'", "'!='", "'='", "'=='", "'>='", "'<='", 
			"'>'", "'<'", "'*'", "'/'", "'%'", "'+'", "'-'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINTLN", "PRINT", "P_NUMBER", "P_STRING", "P_STRING2", "P_IF", 
			"P_ELSE", "P_WHILE", "P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", 
			"P_AS", "P_TRUE", "P_FALSE", "P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", 
			"P_TOSTRING", "P_CLONE", "P_FOR", "P_IN", "P_BREAK", "P_CONTINUE", "P_VECTOR", 
			"P_PUSH", "P_INSERT", "P_REMOVE", "P_CONTAINS", "P_LEN", "P_CAPACITY", 
			"P_NEW", "P_WITHCAPACITY", "P_MAIN", "P_fn", "NUMBER", "DECIMAL", "STRING", 
			"ID", "PUNTO", "PTCOMA", "COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", 
			"IGUAL", "IGUALIGUA", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", 
			"DIV", "MODULO", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", 
			"CORIZQ", "CORDER", "OR", "AND", "MULTICOMENT", "WHITESPACE"
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


	public ChemsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ChemsLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u01ea\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"(\6(\u0168\n(\r(\16(\u0169\3)\6)\u016d\n)\r)\16)\u016e\3)\3)\6)\u0173"+
		"\n)\r)\16)\u0174\3*\3*\7*\u0179\n*\f*\16*\u017c\13*\3*\3*\3+\3+\7+\u0182"+
		"\n+\f+\16+\u0185\13+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3"+
		"B\3C\3C\3C\3D\3D\3D\3E\3E\3E\7E\u01c2\nE\fE\16E\u01c5\13E\3E\6E\u01c8"+
		"\nE\rE\16E\u01c9\3E\3E\7E\u01ce\nE\fE\16E\u01d1\13E\3E\6E\u01d4\nE\rE"+
		"\16E\u01d5\7E\u01d8\nE\fE\16E\u01db\13E\3E\3E\3E\3E\3F\6F\u01e2\nF\rF"+
		"\16F\u01e3\3F\3F\3G\3G\3G\2\2H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008d\2\3\2\f\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|"+
		"\3\2\61\61\3\2,,\4\2,,``\5\2,,\61\61``\6\2\13\f\17\17\"\"^^\t\2\"#%%-"+
		"-/\60<<BB]_\2\u01f3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\3\u008f\3\2\2\2\5\u0097\3\2\2\2\7\u009d\3\2\2\2\t\u00a4\3\2\2"+
		"\2\13\u00ab\3\2\2\2\r\u00b0\3\2\2\2\17\u00b3\3\2\2\2\21\u00b8\3\2\2\2"+
		"\23\u00be\3\2\2\2\25\u00c2\3\2\2\2\27\u00c7\3\2\2\2\31\u00cb\3\2\2\2\33"+
		"\u00cf\3\2\2\2\35\u00d3\3\2\2\2\37\u00d7\3\2\2\2!\u00da\3\2\2\2#\u00df"+
		"\3\2\2\2%\u00e5\3\2\2\2\'\u00eb\3\2\2\2)\u00f0\3\2\2\2+\u00f4\3\2\2\2"+
		"-\u00f9\3\2\2\2/\u0103\3\2\2\2\61\u0109\3\2\2\2\63\u010d\3\2\2\2\65\u0110"+
		"\3\2\2\2\67\u0116\3\2\2\29\u011f\3\2\2\2;\u0123\3\2\2\2=\u0128\3\2\2\2"+
		"?\u012f\3\2\2\2A\u0136\3\2\2\2C\u013f\3\2\2\2E\u0143\3\2\2\2G\u014c\3"+
		"\2\2\2I\u0150\3\2\2\2K\u015e\3\2\2\2M\u0163\3\2\2\2O\u0167\3\2\2\2Q\u016c"+
		"\3\2\2\2S\u0176\3\2\2\2U\u017f\3\2\2\2W\u0186\3\2\2\2Y\u0188\3\2\2\2["+
		"\u018a\3\2\2\2]\u018c\3\2\2\2_\u018e\3\2\2\2a\u0190\3\2\2\2c\u0193\3\2"+
		"\2\2e\u0195\3\2\2\2g\u0198\3\2\2\2i\u019b\3\2\2\2k\u019e\3\2\2\2m\u01a0"+
		"\3\2\2\2o\u01a2\3\2\2\2q\u01a4\3\2\2\2s\u01a6\3\2\2\2u\u01a8\3\2\2\2w"+
		"\u01aa\3\2\2\2y\u01ac\3\2\2\2{\u01ae\3\2\2\2}\u01b0\3\2\2\2\177\u01b2"+
		"\3\2\2\2\u0081\u01b4\3\2\2\2\u0083\u01b6\3\2\2\2\u0085\u01b8\3\2\2\2\u0087"+
		"\u01bb\3\2\2\2\u0089\u01be\3\2\2\2\u008b\u01e1\3\2\2\2\u008d\u01e7\3\2"+
		"\2\2\u008f\u0090\7r\2\2\u0090\u0091\7t\2\2\u0091\u0092\7k\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7v\2\2\u0094\u0095\7n\2\2\u0095\u0096\7p\2\2\u0096"+
		"\4\3\2\2\2\u0097\u0098\7r\2\2\u0098\u0099\7t\2\2\u0099\u009a\7k\2\2\u009a"+
		"\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\6\3\2\2\2\u009d\u009e\7p\2\2\u009e"+
		"\u009f\7w\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7g\2\2"+
		"\u00a2\u00a3\7t\2\2\u00a3\b\3\2\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7v"+
		"\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa"+
		"\7i\2\2\u00aa\n\3\2\2\2\u00ab\u00ac\7(\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae"+
		"\7v\2\2\u00ae\u00af\7t\2\2\u00af\f\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2"+
		"\7h\2\2\u00b2\16\3\2\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6"+
		"\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\20\3\2\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba"+
		"\7j\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\22\3\2\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7y\2\2\u00c1"+
		"\24\3\2\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7y\2\2\u00c5"+
		"\u00c6\7h\2\2\u00c6\26\3\2\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\78\2\2\u00c9"+
		"\u00ca\7\66\2\2\u00ca\30\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\78\2\2"+
		"\u00cd\u00ce\7\66\2\2\u00ce\32\3\2\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\u00d2\7v\2\2\u00d2\34\3\2\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5"+
		"\7w\2\2\u00d5\u00d6\7v\2\2\u00d6\36\3\2\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9"+
		"\7u\2\2\u00d9 \3\2\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd"+
		"\7w\2\2\u00dd\u00de\7g\2\2\u00de\"\3\2\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1"+
		"\7c\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"$\3\2\2\2\u00e5\u00e6\7o\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7v\2\2\u00e8"+
		"\u00e9\7e\2\2\u00e9\u00ea\7j\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7n\2\2\u00ec"+
		"\u00ed\7q\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7r\2\2\u00ef(\3\2\2\2\u00f0"+
		"\u00f1\7c\2\2\u00f1\u00f2\7d\2\2\u00f2\u00f3\7u\2\2\u00f3*\3\2\2\2\u00f4"+
		"\u00f5\7u\2\2\u00f5\u00f6\7s\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7v\2\2"+
		"\u00f8,\3\2\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7a\2"+
		"\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100"+
		"\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102\7i\2\2\u0102.\3\2\2\2\u0103\u0104"+
		"\7e\2\2\u0104\u0105\7n\2\2\u0105\u0106\7q\2\2\u0106\u0107\7p\2\2\u0107"+
		"\u0108\7g\2\2\u0108\60\3\2\2\2\u0109\u010a\7h\2\2\u010a\u010b\7q\2\2\u010b"+
		"\u010c\7t\2\2\u010c\62\3\2\2\2\u010d\u010e\7k\2\2\u010e\u010f\7p\2\2\u010f"+
		"\64\3\2\2\2\u0110\u0111\7d\2\2\u0111\u0112\7t\2\2\u0112\u0113\7g\2\2\u0113"+
		"\u0114\7c\2\2\u0114\u0115\7m\2\2\u0115\66\3\2\2\2\u0116\u0117\7e\2\2\u0117"+
		"\u0118\7q\2\2\u0118\u0119\7p\2\2\u0119\u011a\7v\2\2\u011a\u011b\7k\2\2"+
		"\u011b\u011c\7p\2\2\u011c\u011d\7w\2\2\u011d\u011e\7g\2\2\u011e8\3\2\2"+
		"\2\u011f\u0120\7x\2\2\u0120\u0121\7g\2\2\u0121\u0122\7e\2\2\u0122:\3\2"+
		"\2\2\u0123\u0124\7r\2\2\u0124\u0125\7w\2\2\u0125\u0126\7u\2\2\u0126\u0127"+
		"\7j\2\2\u0127<\3\2\2\2\u0128\u0129\7k\2\2\u0129\u012a\7p\2\2\u012a\u012b"+
		"\7u\2\2\u012b\u012c\7g\2\2\u012c\u012d\7t\2\2\u012d\u012e\7v\2\2\u012e"+
		">\3\2\2\2\u012f\u0130\7t\2\2\u0130\u0131\7g\2\2\u0131\u0132\7o\2\2\u0132"+
		"\u0133\7q\2\2\u0133\u0134\7x\2\2\u0134\u0135\7g\2\2\u0135@\3\2\2\2\u0136"+
		"\u0137\7e\2\2\u0137\u0138\7q\2\2\u0138\u0139\7p\2\2\u0139\u013a\7v\2\2"+
		"\u013a\u013b\7c\2\2\u013b\u013c\7k\2\2\u013c\u013d\7p\2\2\u013d\u013e"+
		"\7u\2\2\u013eB\3\2\2\2\u013f\u0140\7n\2\2\u0140\u0141\7g\2\2\u0141\u0142"+
		"\7p\2\2\u0142D\3\2\2\2\u0143\u0144\7e\2\2\u0144\u0145\7c\2\2\u0145\u0146"+
		"\7r\2\2\u0146\u0147\7c\2\2\u0147\u0148\7e\2\2\u0148\u0149\7k\2\2\u0149"+
		"\u014a\7v\2\2\u014a\u014b\7{\2\2\u014bF\3\2\2\2\u014c\u014d\7p\2\2\u014d"+
		"\u014e\7g\2\2\u014e\u014f\7y\2\2\u014fH\3\2\2\2\u0150\u0151\7y\2\2\u0151"+
		"\u0152\7k\2\2\u0152\u0153\7v\2\2\u0153\u0154\7j\2\2\u0154\u0155\7a\2\2"+
		"\u0155\u0156\7e\2\2\u0156\u0157\7c\2\2\u0157\u0158\7r\2\2\u0158\u0159"+
		"\7c\2\2\u0159\u015a\7e\2\2\u015a\u015b\7k\2\2\u015b\u015c\7v\2\2\u015c"+
		"\u015d\7{\2\2\u015dJ\3\2\2\2\u015e\u015f\7o\2\2\u015f\u0160\7c\2\2\u0160"+
		"\u0161\7k\2\2\u0161\u0162\7p\2\2\u0162L\3\2\2\2\u0163\u0164\7h\2\2\u0164"+
		"\u0165\7p\2\2\u0165N\3\2\2\2\u0166\u0168\t\2\2\2\u0167\u0166\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016aP\3\2\2\2"+
		"\u016b\u016d\t\2\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\7\60\2\2"+
		"\u0171\u0173\t\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0174\u0175\3\2\2\2\u0175R\3\2\2\2\u0176\u017a\7$\2\2\u0177\u0179"+
		"\n\3\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7$"+
		"\2\2\u017eT\3\2\2\2\u017f\u0183\t\4\2\2\u0180\u0182\t\5\2\2\u0181\u0180"+
		"\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"V\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7\60\2\2\u0187X\3\2\2\2\u0188"+
		"\u0189\7=\2\2\u0189Z\3\2\2\2\u018a\u018b\7.\2\2\u018b\\\3\2\2\2\u018c"+
		"\u018d\7<\2\2\u018d^\3\2\2\2\u018e\u018f\7#\2\2\u018f`\3\2\2\2\u0190\u0191"+
		"\7#\2\2\u0191\u0192\7?\2\2\u0192b\3\2\2\2\u0193\u0194\7?\2\2\u0194d\3"+
		"\2\2\2\u0195\u0196\7?\2\2\u0196\u0197\7?\2\2\u0197f\3\2\2\2\u0198\u0199"+
		"\7@\2\2\u0199\u019a\7?\2\2\u019ah\3\2\2\2\u019b\u019c\7>\2\2\u019c\u019d"+
		"\7?\2\2\u019dj\3\2\2\2\u019e\u019f\7@\2\2\u019fl\3\2\2\2\u01a0\u01a1\7"+
		">\2\2\u01a1n\3\2\2\2\u01a2\u01a3\7,\2\2\u01a3p\3\2\2\2\u01a4\u01a5\7\61"+
		"\2\2\u01a5r\3\2\2\2\u01a6\u01a7\7\'\2\2\u01a7t\3\2\2\2\u01a8\u01a9\7-"+
		"\2\2\u01a9v\3\2\2\2\u01aa\u01ab\7/\2\2\u01abx\3\2\2\2\u01ac\u01ad\7*\2"+
		"\2\u01adz\3\2\2\2\u01ae\u01af\7+\2\2\u01af|\3\2\2\2\u01b0\u01b1\7}\2\2"+
		"\u01b1~\3\2\2\2\u01b2\u01b3\7\177\2\2\u01b3\u0080\3\2\2\2\u01b4\u01b5"+
		"\7]\2\2\u01b5\u0082\3\2\2\2\u01b6\u01b7\7_\2\2\u01b7\u0084\3\2\2\2\u01b8"+
		"\u01b9\7~\2\2\u01b9\u01ba\7~\2\2\u01ba\u0086\3\2\2\2\u01bb\u01bc\7(\2"+
		"\2\u01bc\u01bd\7(\2\2\u01bd\u0088\3\2\2\2\u01be\u01bf\t\6\2\2\u01bf\u01c3"+
		"\t\7\2\2\u01c0\u01c2\t\b\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c6\u01c8\t\7\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01d9\3\2\2\2\u01cb\u01cf\t\t"+
		"\2\2\u01cc\u01ce\t\b\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d2\u01d4\t\7\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01cb\3\2"+
		"\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd\t\6\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u01df\bE\2\2\u01df\u008a\3\2\2\2\u01e0\u01e2\t\n\2\2\u01e1"+
		"\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\bF\2\2\u01e6\u008c\3\2\2\2\u01e7"+
		"\u01e8\7^\2\2\u01e8\u01e9\t\13\2\2\u01e9\u008e\3\2\2\2\16\2\u0169\u016e"+
		"\u0174\u017a\u0183\u01c3\u01c9\u01cf\u01d5\u01d9\u01e3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}