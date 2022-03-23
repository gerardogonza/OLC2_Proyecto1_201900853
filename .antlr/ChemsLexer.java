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
		P_CAPACITY=34, P_NEW=35, P_WITHCAPACITY=36, NUMBER=37, DECIMAL=38, STRING=39, 
		ID=40, PUNTO=41, PTCOMA=42, COMA=43, DOSPUNTOS=44, DIFERENTE=45, DIFERENTEDE=46, 
		IGUAL=47, IGUALIGUA=48, MAYORIGUAL=49, MENORIGUAL=50, MAYOR=51, MENOR=52, 
		MUL=53, DIV=54, MODULO=55, ADD=56, SUB=57, PARIZQ=58, PARDER=59, LLAVEIZQ=60, 
		LLAVEDER=61, CORIZQ=62, CORDER=63, OR=64, AND=65, MULTICOMENT=66, WHITESPACE=67;
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
			"P_WITHCAPACITY", "NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA", 
			"COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA", 
			"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "MODULO", 
			"ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", 
			"OR", "AND", "MULTICOMENT", "WHITESPACE", "ESC_SEQ"
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
			"'new'", "'with_capacity'", null, null, null, null, "'.'", "';'", "','", 
			"':'", "'!'", "'!='", "'='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'||'", "'&&'"
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
			"P_NEW", "P_WITHCAPACITY", "NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", 
			"PTCOMA", "COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA", 
			"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "MODULO", 
			"ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", 
			"OR", "AND", "MULTICOMENT", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u01de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3&\6&\u015c\n&\r&\16&\u015d\3\'\6\'\u0161\n"+
		"\'\r\'\16\'\u0162\3\'\3\'\6\'\u0167\n\'\r\'\16\'\u0168\3(\3(\7(\u016d"+
		"\n(\f(\16(\u0170\13(\3(\3(\3)\3)\7)\u0176\n)\f)\16)\u0179\13)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\7"+
		"C\u01b6\nC\fC\16C\u01b9\13C\3C\6C\u01bc\nC\rC\16C\u01bd\3C\3C\7C\u01c2"+
		"\nC\fC\16C\u01c5\13C\3C\6C\u01c8\nC\rC\16C\u01c9\7C\u01cc\nC\fC\16C\u01cf"+
		"\13C\3C\3C\3C\3C\3D\6D\u01d6\nD\rD\16D\u01d7\3D\3D\3E\3E\3E\2\2F\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089\2\3\2\f\3\2\62;\3\2"+
		"$$\5\2C\\aac|\6\2\62;C\\aac|\3\2\61\61\3\2,,\4\2,,``\5\2,,\61\61``\6\2"+
		"\13\f\17\17\"\"^^\t\2\"#%%--/\60<<BB]_\2\u01e7\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\3\u008b\3\2\2\2\5\u0093\3\2\2\2\7\u0099\3\2\2\2\t\u00a0\3\2\2\2\13"+
		"\u00a7\3\2\2\2\r\u00ac\3\2\2\2\17\u00af\3\2\2\2\21\u00b4\3\2\2\2\23\u00ba"+
		"\3\2\2\2\25\u00be\3\2\2\2\27\u00c3\3\2\2\2\31\u00c7\3\2\2\2\33\u00cb\3"+
		"\2\2\2\35\u00cf\3\2\2\2\37\u00d3\3\2\2\2!\u00d6\3\2\2\2#\u00db\3\2\2\2"+
		"%\u00e1\3\2\2\2\'\u00e7\3\2\2\2)\u00ec\3\2\2\2+\u00f0\3\2\2\2-\u00f5\3"+
		"\2\2\2/\u00ff\3\2\2\2\61\u0105\3\2\2\2\63\u0109\3\2\2\2\65\u010c\3\2\2"+
		"\2\67\u0112\3\2\2\29\u011b\3\2\2\2;\u011f\3\2\2\2=\u0124\3\2\2\2?\u012b"+
		"\3\2\2\2A\u0132\3\2\2\2C\u013b\3\2\2\2E\u013f\3\2\2\2G\u0148\3\2\2\2I"+
		"\u014c\3\2\2\2K\u015b\3\2\2\2M\u0160\3\2\2\2O\u016a\3\2\2\2Q\u0173\3\2"+
		"\2\2S\u017a\3\2\2\2U\u017c\3\2\2\2W\u017e\3\2\2\2Y\u0180\3\2\2\2[\u0182"+
		"\3\2\2\2]\u0184\3\2\2\2_\u0187\3\2\2\2a\u0189\3\2\2\2c\u018c\3\2\2\2e"+
		"\u018f\3\2\2\2g\u0192\3\2\2\2i\u0194\3\2\2\2k\u0196\3\2\2\2m\u0198\3\2"+
		"\2\2o\u019a\3\2\2\2q\u019c\3\2\2\2s\u019e\3\2\2\2u\u01a0\3\2\2\2w\u01a2"+
		"\3\2\2\2y\u01a4\3\2\2\2{\u01a6\3\2\2\2}\u01a8\3\2\2\2\177\u01aa\3\2\2"+
		"\2\u0081\u01ac\3\2\2\2\u0083\u01af\3\2\2\2\u0085\u01b2\3\2\2\2\u0087\u01d5"+
		"\3\2\2\2\u0089\u01db\3\2\2\2\u008b\u008c\7r\2\2\u008c\u008d\7t\2\2\u008d"+
		"\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\u0091\7n\2\2"+
		"\u0091\u0092\7p\2\2\u0092\4\3\2\2\2\u0093\u0094\7r\2\2\u0094\u0095\7t"+
		"\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2\u0098\6"+
		"\3\2\2\2\u0099\u009a\7p\2\2\u009a\u009b\7w\2\2\u009b\u009c\7o\2\2\u009c"+
		"\u009d\7d\2\2\u009d\u009e\7g\2\2\u009e\u009f\7t\2\2\u009f\b\3\2\2\2\u00a0"+
		"\u00a1\7u\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7k\2\2"+
		"\u00a4\u00a5\7p\2\2\u00a5\u00a6\7i\2\2\u00a6\n\3\2\2\2\u00a7\u00a8\7("+
		"\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7t\2\2\u00ab\f"+
		"\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7h\2\2\u00ae\16\3\2\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7g\2\2"+
		"\u00b3\20\3\2\2\2\u00b4\u00b5\7y\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7"+
		"k\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7g\2\2\u00b9\22\3\2\2\2\u00ba\u00bb"+
		"\7r\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7y\2\2\u00bd\24\3\2\2\2\u00be\u00bf"+
		"\7r\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2\7h\2\2\u00c2"+
		"\26\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\78\2\2\u00c5\u00c6\7\66\2\2"+
		"\u00c6\30\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\78\2\2\u00c9\u00ca\7"+
		"\66\2\2\u00ca\32\3\2\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7v\2\2\u00ce\34\3\2\2\2\u00cf\u00d0\7o\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2"+
		"\7v\2\2\u00d2\36\3\2\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7u\2\2\u00d5 "+
		"\3\2\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7w\2\2\u00d9"+
		"\u00da\7g\2\2\u00da\"\3\2\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7c\2\2\u00dd"+
		"\u00de\7n\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7g\2\2\u00e0$\3\2\2\2\u00e1"+
		"\u00e2\7o\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7e\2\2"+
		"\u00e5\u00e6\7j\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7q\2"+
		"\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7r\2\2\u00eb(\3\2\2\2\u00ec\u00ed\7"+
		"c\2\2\u00ed\u00ee\7d\2\2\u00ee\u00ef\7u\2\2\u00ef*\3\2\2\2\u00f0\u00f1"+
		"\7u\2\2\u00f1\u00f2\7s\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7v\2\2\u00f4"+
		",\3\2\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7a\2\2\u00f8"+
		"\u00f9\7u\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7k\2\2"+
		"\u00fc\u00fd\7p\2\2\u00fd\u00fe\7i\2\2\u00fe.\3\2\2\2\u00ff\u0100\7e\2"+
		"\2\u0100\u0101\7n\2\2\u0101\u0102\7q\2\2\u0102\u0103\7p\2\2\u0103\u0104"+
		"\7g\2\2\u0104\60\3\2\2\2\u0105\u0106\7h\2\2\u0106\u0107\7q\2\2\u0107\u0108"+
		"\7t\2\2\u0108\62\3\2\2\2\u0109\u010a\7k\2\2\u010a\u010b\7p\2\2\u010b\64"+
		"\3\2\2\2\u010c\u010d\7d\2\2\u010d\u010e\7t\2\2\u010e\u010f\7g\2\2\u010f"+
		"\u0110\7c\2\2\u0110\u0111\7m\2\2\u0111\66\3\2\2\2\u0112\u0113\7e\2\2\u0113"+
		"\u0114\7q\2\2\u0114\u0115\7p\2\2\u0115\u0116\7v\2\2\u0116\u0117\7k\2\2"+
		"\u0117\u0118\7p\2\2\u0118\u0119\7w\2\2\u0119\u011a\7g\2\2\u011a8\3\2\2"+
		"\2\u011b\u011c\7x\2\2\u011c\u011d\7g\2\2\u011d\u011e\7e\2\2\u011e:\3\2"+
		"\2\2\u011f\u0120\7r\2\2\u0120\u0121\7w\2\2\u0121\u0122\7u\2\2\u0122\u0123"+
		"\7j\2\2\u0123<\3\2\2\2\u0124\u0125\7k\2\2\u0125\u0126\7p\2\2\u0126\u0127"+
		"\7u\2\2\u0127\u0128\7g\2\2\u0128\u0129\7t\2\2\u0129\u012a\7v\2\2\u012a"+
		">\3\2\2\2\u012b\u012c\7t\2\2\u012c\u012d\7g\2\2\u012d\u012e\7o\2\2\u012e"+
		"\u012f\7q\2\2\u012f\u0130\7x\2\2\u0130\u0131\7g\2\2\u0131@\3\2\2\2\u0132"+
		"\u0133\7e\2\2\u0133\u0134\7q\2\2\u0134\u0135\7p\2\2\u0135\u0136\7v\2\2"+
		"\u0136\u0137\7c\2\2\u0137\u0138\7k\2\2\u0138\u0139\7p\2\2\u0139\u013a"+
		"\7u\2\2\u013aB\3\2\2\2\u013b\u013c\7n\2\2\u013c\u013d\7g\2\2\u013d\u013e"+
		"\7p\2\2\u013eD\3\2\2\2\u013f\u0140\7e\2\2\u0140\u0141\7c\2\2\u0141\u0142"+
		"\7r\2\2\u0142\u0143\7c\2\2\u0143\u0144\7e\2\2\u0144\u0145\7k\2\2\u0145"+
		"\u0146\7v\2\2\u0146\u0147\7{\2\2\u0147F\3\2\2\2\u0148\u0149\7p\2\2\u0149"+
		"\u014a\7g\2\2\u014a\u014b\7y\2\2\u014bH\3\2\2\2\u014c\u014d\7y\2\2\u014d"+
		"\u014e\7k\2\2\u014e\u014f\7v\2\2\u014f\u0150\7j\2\2\u0150\u0151\7a\2\2"+
		"\u0151\u0152\7e\2\2\u0152\u0153\7c\2\2\u0153\u0154\7r\2\2\u0154\u0155"+
		"\7c\2\2\u0155\u0156\7e\2\2\u0156\u0157\7k\2\2\u0157\u0158\7v\2\2\u0158"+
		"\u0159\7{\2\2\u0159J\3\2\2\2\u015a\u015c\t\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015eL\3\2\2\2"+
		"\u015f\u0161\t\2\2\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\7\60\2\2"+
		"\u0165\u0167\t\2\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169N\3\2\2\2\u016a\u016e\7$\2\2\u016b\u016d"+
		"\n\3\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7$"+
		"\2\2\u0172P\3\2\2\2\u0173\u0177\t\4\2\2\u0174\u0176\t\5\2\2\u0175\u0174"+
		"\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"R\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7\60\2\2\u017bT\3\2\2\2\u017c"+
		"\u017d\7=\2\2\u017dV\3\2\2\2\u017e\u017f\7.\2\2\u017fX\3\2\2\2\u0180\u0181"+
		"\7<\2\2\u0181Z\3\2\2\2\u0182\u0183\7#\2\2\u0183\\\3\2\2\2\u0184\u0185"+
		"\7#\2\2\u0185\u0186\7?\2\2\u0186^\3\2\2\2\u0187\u0188\7?\2\2\u0188`\3"+
		"\2\2\2\u0189\u018a\7?\2\2\u018a\u018b\7?\2\2\u018bb\3\2\2\2\u018c\u018d"+
		"\7@\2\2\u018d\u018e\7?\2\2\u018ed\3\2\2\2\u018f\u0190\7>\2\2\u0190\u0191"+
		"\7?\2\2\u0191f\3\2\2\2\u0192\u0193\7@\2\2\u0193h\3\2\2\2\u0194\u0195\7"+
		">\2\2\u0195j\3\2\2\2\u0196\u0197\7,\2\2\u0197l\3\2\2\2\u0198\u0199\7\61"+
		"\2\2\u0199n\3\2\2\2\u019a\u019b\7\'\2\2\u019bp\3\2\2\2\u019c\u019d\7-"+
		"\2\2\u019dr\3\2\2\2\u019e\u019f\7/\2\2\u019ft\3\2\2\2\u01a0\u01a1\7*\2"+
		"\2\u01a1v\3\2\2\2\u01a2\u01a3\7+\2\2\u01a3x\3\2\2\2\u01a4\u01a5\7}\2\2"+
		"\u01a5z\3\2\2\2\u01a6\u01a7\7\177\2\2\u01a7|\3\2\2\2\u01a8\u01a9\7]\2"+
		"\2\u01a9~\3\2\2\2\u01aa\u01ab\7_\2\2\u01ab\u0080\3\2\2\2\u01ac\u01ad\7"+
		"~\2\2\u01ad\u01ae\7~\2\2\u01ae\u0082\3\2\2\2\u01af\u01b0\7(\2\2\u01b0"+
		"\u01b1\7(\2\2\u01b1\u0084\3\2\2\2\u01b2\u01b3\t\6\2\2\u01b3\u01b7\t\7"+
		"\2\2\u01b4\u01b6\t\b\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01ba\u01bc\t\7\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01cd\3\2\2\2\u01bf\u01c3\t\t"+
		"\2\2\u01c0\u01c2\t\b\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c6\u01c8\t\7\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01bf\3\2"+
		"\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d1\t\6\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2\u01d3\bC\2\2\u01d3\u0086\3\2\2\2\u01d4\u01d6\t\n\2\2\u01d5"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\bD\2\2\u01da\u0088\3\2\2\2\u01db"+
		"\u01dc\7^\2\2\u01dc\u01dd\t\13\2\2\u01dd\u008a\3\2\2\2\16\2\u015d\u0162"+
		"\u0168\u016e\u0177\u01b7\u01bd\u01c3\u01c9\u01cd\u01d7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}