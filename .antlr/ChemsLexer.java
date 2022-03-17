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
		PRINTLN=1, PRINT=2, P_NUMBER=3, P_STRING=4, P_IF=5, P_ELSE=6, P_WHILE=7, 
		P_POW=8, P_POWF=9, P_I64=10, P_F64=11, P_LET=12, P_MUT=13, P_AS=14, P_TRUE=15, 
		P_FALSE=16, P_MATCH=17, P_LOOP=18, P_ABS=19, P_SQRT=20, P_TOSTRING=21, 
		P_CLONE=22, P_FOR=23, P_IN=24, NUMBER=25, DECIMAL=26, STRING=27, ID=28, 
		PUNTO=29, PTCOMA=30, COMA=31, DOSPUNTOS=32, DIFERENTE=33, DIFERENTEDE=34, 
		IGUAL=35, IGUALIGUA=36, MAYORIGUAL=37, MENORIGUAL=38, MAYOR=39, MENOR=40, 
		MUL=41, DIV=42, MODULO=43, ADD=44, SUB=45, PARIZQ=46, PARDER=47, LLAVEIZQ=48, 
		LLAVEDER=49, CORIZQ=50, CORDER=51, OR=52, AND=53, MULTICOMENT=54, WHITESPACE=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINTLN", "PRINT", "P_NUMBER", "P_STRING", "P_IF", "P_ELSE", "P_WHILE", 
			"P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", "P_TRUE", 
			"P_FALSE", "P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", "P_TOSTRING", "P_CLONE", 
			"P_FOR", "P_IN", "NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA", 
			"COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA", 
			"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "MODULO", 
			"ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", 
			"OR", "AND", "MULTICOMENT", "WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'print'", "'number'", "'string'", "'if'", "'else'", 
			"'while'", "'pow'", "'powf'", "'i64'", "'f64'", "'let'", "'mut'", "'as'", 
			"'true'", "'false'", "'match'", "'loop'", "'abs'", "'sqrt'", "'to_string'", 
			"'clone'", "'for'", "'in'", null, null, null, null, "'.'", "';'", "','", 
			"':'", "'!'", "'!='", "'='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINTLN", "PRINT", "P_NUMBER", "P_STRING", "P_IF", "P_ELSE", "P_WHILE", 
			"P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", "P_TRUE", 
			"P_FALSE", "P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", "P_TOSTRING", "P_CLONE", 
			"P_FOR", "P_IN", "NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA", 
			"COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0173\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\6\32\u00f1\n\32"+
		"\r\32\16\32\u00f2\3\33\6\33\u00f6\n\33\r\33\16\33\u00f7\3\33\3\33\6\33"+
		"\u00fc\n\33\r\33\16\33\u00fd\3\34\3\34\7\34\u0102\n\34\f\34\16\34\u0105"+
		"\13\34\3\34\3\34\3\35\3\35\7\35\u010b\n\35\f\35\16\35\u010e\13\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\7\67\u014b\n\67\f\67\16\67\u014e\13\67\3\67\6\67\u0151\n"+
		"\67\r\67\16\67\u0152\3\67\3\67\7\67\u0157\n\67\f\67\16\67\u015a\13\67"+
		"\3\67\6\67\u015d\n\67\r\67\16\67\u015e\7\67\u0161\n\67\f\67\16\67\u0164"+
		"\13\67\3\67\3\67\3\67\3\67\38\68\u016b\n8\r8\168\u016c\38\38\39\39\39"+
		"\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q\2\3\2\f\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\3\2\61\61\3\2,,"+
		"\4\2,,``\5\2,,\61\61``\6\2\13\f\17\17\"\"^^\t\2\"#%%--/\60<<BB]_\2\u017c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\3s\3\2\2\2\5{\3\2\2\2\7\u0081\3\2\2\2\t\u0088\3\2\2\2\13"+
		"\u008f\3\2\2\2\r\u0092\3\2\2\2\17\u0097\3\2\2\2\21\u009d\3\2\2\2\23\u00a1"+
		"\3\2\2\2\25\u00a6\3\2\2\2\27\u00aa\3\2\2\2\31\u00ae\3\2\2\2\33\u00b2\3"+
		"\2\2\2\35\u00b6\3\2\2\2\37\u00b9\3\2\2\2!\u00be\3\2\2\2#\u00c4\3\2\2\2"+
		"%\u00ca\3\2\2\2\'\u00cf\3\2\2\2)\u00d3\3\2\2\2+\u00d8\3\2\2\2-\u00e2\3"+
		"\2\2\2/\u00e8\3\2\2\2\61\u00ec\3\2\2\2\63\u00f0\3\2\2\2\65\u00f5\3\2\2"+
		"\2\67\u00ff\3\2\2\29\u0108\3\2\2\2;\u010f\3\2\2\2=\u0111\3\2\2\2?\u0113"+
		"\3\2\2\2A\u0115\3\2\2\2C\u0117\3\2\2\2E\u0119\3\2\2\2G\u011c\3\2\2\2I"+
		"\u011e\3\2\2\2K\u0121\3\2\2\2M\u0124\3\2\2\2O\u0127\3\2\2\2Q\u0129\3\2"+
		"\2\2S\u012b\3\2\2\2U\u012d\3\2\2\2W\u012f\3\2\2\2Y\u0131\3\2\2\2[\u0133"+
		"\3\2\2\2]\u0135\3\2\2\2_\u0137\3\2\2\2a\u0139\3\2\2\2c\u013b\3\2\2\2e"+
		"\u013d\3\2\2\2g\u013f\3\2\2\2i\u0141\3\2\2\2k\u0144\3\2\2\2m\u0147\3\2"+
		"\2\2o\u016a\3\2\2\2q\u0170\3\2\2\2st\7r\2\2tu\7t\2\2uv\7k\2\2vw\7p\2\2"+
		"wx\7v\2\2xy\7n\2\2yz\7p\2\2z\4\3\2\2\2{|\7r\2\2|}\7t\2\2}~\7k\2\2~\177"+
		"\7p\2\2\177\u0080\7v\2\2\u0080\6\3\2\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7w\2\2\u0083\u0084\7o\2\2\u0084\u0085\7d\2\2\u0085\u0086\7g\2\2\u0086"+
		"\u0087\7t\2\2\u0087\b\3\2\2\2\u0088\u0089\7u\2\2\u0089\u008a\7v\2\2\u008a"+
		"\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7i\2\2"+
		"\u008e\n\3\2\2\2\u008f\u0090\7k\2\2\u0090\u0091\7h\2\2\u0091\f\3\2\2\2"+
		"\u0092\u0093\7g\2\2\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096"+
		"\7g\2\2\u0096\16\3\2\2\2\u0097\u0098\7y\2\2\u0098\u0099\7j\2\2\u0099\u009a"+
		"\7k\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c\20\3\2\2\2\u009d\u009e"+
		"\7r\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7y\2\2\u00a0\22\3\2\2\2\u00a1\u00a2"+
		"\7r\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7h\2\2\u00a5"+
		"\24\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\78\2\2\u00a8\u00a9\7\66\2\2"+
		"\u00a9\26\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\78\2\2\u00ac\u00ad\7"+
		"\66\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1"+
		"\7v\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\34\3\2\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7u\2\2\u00b8\36"+
		"\3\2\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7w\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd \3\2\2\2\u00be\u00bf\7h\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7n\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\"\3\2\2\2\u00c4"+
		"\u00c5\7o\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7e\2\2"+
		"\u00c8\u00c9\7j\2\2\u00c9$\3\2\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7q\2"+
		"\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7r\2\2\u00ce&\3\2\2\2\u00cf\u00d0\7"+
		"c\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7u\2\2\u00d2(\3\2\2\2\u00d3\u00d4"+
		"\7u\2\2\u00d4\u00d5\7s\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7v\2\2\u00d7"+
		"*\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7a\2\2\u00db"+
		"\u00dc\7u\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7k\2\2"+
		"\u00df\u00e0\7p\2\2\u00e0\u00e1\7i\2\2\u00e1,\3\2\2\2\u00e2\u00e3\7e\2"+
		"\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7"+
		"\7g\2\2\u00e7.\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb"+
		"\7t\2\2\u00eb\60\3\2\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\62"+
		"\3\2\2\2\u00ef\u00f1\t\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\64\3\2\2\2\u00f4\u00f6\t\2\2"+
		"\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\7\60\2\2\u00fa\u00fc\t\2\2\2"+
		"\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\66\3\2\2\2\u00ff\u0103\7$\2\2\u0100\u0102\n\3\2\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7$\2\2\u0107"+
		"8\3\2\2\2\u0108\u010c\t\4\2\2\u0109\u010b\t\5\2\2\u010a\u0109\3\2\2\2"+
		"\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d:\3"+
		"\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\60\2\2\u0110<\3\2\2\2\u0111\u0112"+
		"\7=\2\2\u0112>\3\2\2\2\u0113\u0114\7.\2\2\u0114@\3\2\2\2\u0115\u0116\7"+
		"<\2\2\u0116B\3\2\2\2\u0117\u0118\7#\2\2\u0118D\3\2\2\2\u0119\u011a\7#"+
		"\2\2\u011a\u011b\7?\2\2\u011bF\3\2\2\2\u011c\u011d\7?\2\2\u011dH\3\2\2"+
		"\2\u011e\u011f\7?\2\2\u011f\u0120\7?\2\2\u0120J\3\2\2\2\u0121\u0122\7"+
		"@\2\2\u0122\u0123\7?\2\2\u0123L\3\2\2\2\u0124\u0125\7>\2\2\u0125\u0126"+
		"\7?\2\2\u0126N\3\2\2\2\u0127\u0128\7@\2\2\u0128P\3\2\2\2\u0129\u012a\7"+
		">\2\2\u012aR\3\2\2\2\u012b\u012c\7,\2\2\u012cT\3\2\2\2\u012d\u012e\7\61"+
		"\2\2\u012eV\3\2\2\2\u012f\u0130\7\'\2\2\u0130X\3\2\2\2\u0131\u0132\7-"+
		"\2\2\u0132Z\3\2\2\2\u0133\u0134\7/\2\2\u0134\\\3\2\2\2\u0135\u0136\7*"+
		"\2\2\u0136^\3\2\2\2\u0137\u0138\7+\2\2\u0138`\3\2\2\2\u0139\u013a\7}\2"+
		"\2\u013ab\3\2\2\2\u013b\u013c\7\177\2\2\u013cd\3\2\2\2\u013d\u013e\7]"+
		"\2\2\u013ef\3\2\2\2\u013f\u0140\7_\2\2\u0140h\3\2\2\2\u0141\u0142\7~\2"+
		"\2\u0142\u0143\7~\2\2\u0143j\3\2\2\2\u0144\u0145\7(\2\2\u0145\u0146\7"+
		"(\2\2\u0146l\3\2\2\2\u0147\u0148\t\6\2\2\u0148\u014c\t\7\2\2\u0149\u014b"+
		"\t\b\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\t\7"+
		"\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0162\3\2\2\2\u0154\u0158\t\t\2\2\u0155\u0157\t\b"+
		"\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\t\7"+
		"\2\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u0154\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0166\t\6\2\2\u0166\u0167\3\2\2\2\u0167\u0168\b\67"+
		"\2\2\u0168n\3\2\2\2\u0169\u016b\t\n\2\2\u016a\u0169\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\b8\2\2\u016fp\3\2\2\2\u0170\u0171\7^\2\2\u0171\u0172\t\13\2\2\u0172"+
		"r\3\2\2\2\16\2\u00f2\u00f7\u00fd\u0103\u010c\u014c\u0152\u0158\u015e\u0162"+
		"\u016c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}