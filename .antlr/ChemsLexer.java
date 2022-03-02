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
		PRINTLN=1, P_NUMBER=2, P_STRING=3, P_IF=4, P_ELSE=5, P_WHILE=6, P_POW=7, 
		P_POWF=8, P_I64=9, P_F64=10, P_LET=11, P_MUT=12, P_AS=13, P_TRUE=14, P_FALSE=15, 
		NUMBER=16, DECIMAL=17, STRING=18, ID=19, PUNTO=20, PTCOMA=21, COMA=22, 
		DOSPUNTOS=23, DIFERENTE=24, DIFERENTEDE=25, IGUAL=26, IGUALIGUA=27, MAYORIGUAL=28, 
		MENORIGUAL=29, MAYOR=30, MENOR=31, MUL=32, DIV=33, MODULO=34, ADD=35, 
		SUB=36, PARIZQ=37, PARDER=38, LLAVEIZQ=39, LLAVEDER=40, CORIZQ=41, CORDER=42, 
		OR=43, AND=44, MULTICOMENT=45, WHITESPACE=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINTLN", "P_NUMBER", "P_STRING", "P_IF", "P_ELSE", "P_WHILE", "P_POW", 
			"P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", "P_TRUE", "P_FALSE", 
			"NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA", "COMA", "DOSPUNTOS", 
			"DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA", "MAYORIGUAL", "MENORIGUAL", 
			"MAYOR", "MENOR", "MUL", "DIV", "MODULO", "ADD", "SUB", "PARIZQ", "PARDER", 
			"LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "OR", "AND", "MULTICOMENT", 
			"WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'number'", "'string'", "'if'", "'else'", "'while'", 
			"'pow'", "'powf'", "'i64'", "'f64'", "'let'", "'mut'", "'as'", "'true'", 
			"'false'", null, null, null, null, "'.'", "';'", "','", "':'", "'!'", 
			"'!='", "'='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'%'", 
			"'+'", "'-'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINTLN", "P_NUMBER", "P_STRING", "P_IF", "P_ELSE", "P_WHILE", 
			"P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", "P_TRUE", 
			"P_FALSE", "NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA", "COMA", 
			"DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "MODULO", "ADD", "SUB", 
			"PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "OR", 
			"AND", "MULTICOMENT", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0130\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\6\21\u00ae\n\21\r\21\16\21\u00af\3\22\6\22\u00b3\n\22\r\22"+
		"\16\22\u00b4\3\22\3\22\6\22\u00b9\n\22\r\22\16\22\u00ba\3\23\3\23\7\23"+
		"\u00bf\n\23\f\23\16\23\u00c2\13\23\3\23\3\23\3\24\3\24\7\24\u00c8\n\24"+
		"\f\24\16\24\u00cb\13\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\7.\u0108\n.\f.\16.\u010b"+
		"\13.\3.\6.\u010e\n.\r.\16.\u010f\3.\3.\7.\u0114\n.\f.\16.\u0117\13.\3"+
		".\6.\u011a\n.\r.\16.\u011b\7.\u011e\n.\f.\16.\u0121\13.\3.\3.\3.\3.\3"+
		"/\6/\u0128\n/\r/\16/\u0129\3/\3/\3\60\3\60\3\60\2\2\61\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\2\3\2\f\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\3\2\61\61\3\2,,\4\2,,``\5\2,,\61\61``\6\2\13\f\17\17\"\"^^\t\2\"#%"+
		"%--/\60<<BB]_\2\u0139\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\3a\3\2\2\2\5i\3\2\2\2\7p\3\2\2\2\tw\3\2\2\2\13z\3\2\2\2\r\177\3"+
		"\2\2\2\17\u0085\3\2\2\2\21\u0089\3\2\2\2\23\u008e\3\2\2\2\25\u0092\3\2"+
		"\2\2\27\u0096\3\2\2\2\31\u009a\3\2\2\2\33\u009e\3\2\2\2\35\u00a1\3\2\2"+
		"\2\37\u00a6\3\2\2\2!\u00ad\3\2\2\2#\u00b2\3\2\2\2%\u00bc\3\2\2\2\'\u00c5"+
		"\3\2\2\2)\u00cc\3\2\2\2+\u00ce\3\2\2\2-\u00d0\3\2\2\2/\u00d2\3\2\2\2\61"+
		"\u00d4\3\2\2\2\63\u00d6\3\2\2\2\65\u00d9\3\2\2\2\67\u00db\3\2\2\29\u00de"+
		"\3\2\2\2;\u00e1\3\2\2\2=\u00e4\3\2\2\2?\u00e6\3\2\2\2A\u00e8\3\2\2\2C"+
		"\u00ea\3\2\2\2E\u00ec\3\2\2\2G\u00ee\3\2\2\2I\u00f0\3\2\2\2K\u00f2\3\2"+
		"\2\2M\u00f4\3\2\2\2O\u00f6\3\2\2\2Q\u00f8\3\2\2\2S\u00fa\3\2\2\2U\u00fc"+
		"\3\2\2\2W\u00fe\3\2\2\2Y\u0101\3\2\2\2[\u0104\3\2\2\2]\u0127\3\2\2\2_"+
		"\u012d\3\2\2\2ab\7r\2\2bc\7t\2\2cd\7k\2\2de\7p\2\2ef\7v\2\2fg\7n\2\2g"+
		"h\7p\2\2h\4\3\2\2\2ij\7p\2\2jk\7w\2\2kl\7o\2\2lm\7d\2\2mn\7g\2\2no\7t"+
		"\2\2o\6\3\2\2\2pq\7u\2\2qr\7v\2\2rs\7t\2\2st\7k\2\2tu\7p\2\2uv\7i\2\2"+
		"v\b\3\2\2\2wx\7k\2\2xy\7h\2\2y\n\3\2\2\2z{\7g\2\2{|\7n\2\2|}\7u\2\2}~"+
		"\7g\2\2~\f\3\2\2\2\177\u0080\7y\2\2\u0080\u0081\7j\2\2\u0081\u0082\7k"+
		"\2\2\u0082\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\16\3\2\2\2\u0085\u0086"+
		"\7r\2\2\u0086\u0087\7q\2\2\u0087\u0088\7y\2\2\u0088\20\3\2\2\2\u0089\u008a"+
		"\7r\2\2\u008a\u008b\7q\2\2\u008b\u008c\7y\2\2\u008c\u008d\7h\2\2\u008d"+
		"\22\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090\78\2\2\u0090\u0091\7\66\2\2"+
		"\u0091\24\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\78\2\2\u0094\u0095\7"+
		"\66\2\2\u0095\26\3\2\2\2\u0096\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098\u0099"+
		"\7v\2\2\u0099\30\3\2\2\2\u009a\u009b\7o\2\2\u009b\u009c\7w\2\2\u009c\u009d"+
		"\7v\2\2\u009d\32\3\2\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7u\2\2\u00a0\34"+
		"\3\2\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7w\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\7c\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7g\2\2\u00ab \3\2\2\2\u00ac"+
		"\u00ae\t\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\"\3\2\2\2\u00b1\u00b3\t\2\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\7\60\2\2\u00b7\u00b9\t\2\2\2\u00b8\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"$\3\2\2\2\u00bc\u00c0\7$\2\2\u00bd\u00bf\n\3\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7$\2\2\u00c4&\3\2\2\2\u00c5\u00c9"+
		"\t\4\2\2\u00c6\u00c8\t\5\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca(\3\2\2\2\u00cb\u00c9\3\2\2\2"+
		"\u00cc\u00cd\7\60\2\2\u00cd*\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf,\3\2\2\2"+
		"\u00d0\u00d1\7.\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7<\2\2\u00d3\60\3\2\2\2"+
		"\u00d4\u00d5\7#\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7#\2\2\u00d7\u00d8\7"+
		"?\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7?\2\2\u00da\66\3\2\2\2\u00db\u00dc"+
		"\7?\2\2\u00dc\u00dd\7?\2\2\u00dd8\3\2\2\2\u00de\u00df\7@\2\2\u00df\u00e0"+
		"\7?\2\2\u00e0:\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7?\2\2\u00e3<\3"+
		"\2\2\2\u00e4\u00e5\7@\2\2\u00e5>\3\2\2\2\u00e6\u00e7\7>\2\2\u00e7@\3\2"+
		"\2\2\u00e8\u00e9\7,\2\2\u00e9B\3\2\2\2\u00ea\u00eb\7\61\2\2\u00ebD\3\2"+
		"\2\2\u00ec\u00ed\7\'\2\2\u00edF\3\2\2\2\u00ee\u00ef\7-\2\2\u00efH\3\2"+
		"\2\2\u00f0\u00f1\7/\2\2\u00f1J\3\2\2\2\u00f2\u00f3\7*\2\2\u00f3L\3\2\2"+
		"\2\u00f4\u00f5\7+\2\2\u00f5N\3\2\2\2\u00f6\u00f7\7}\2\2\u00f7P\3\2\2\2"+
		"\u00f8\u00f9\7\177\2\2\u00f9R\3\2\2\2\u00fa\u00fb\7]\2\2\u00fbT\3\2\2"+
		"\2\u00fc\u00fd\7_\2\2\u00fdV\3\2\2\2\u00fe\u00ff\7~\2\2\u00ff\u0100\7"+
		"~\2\2\u0100X\3\2\2\2\u0101\u0102\7(\2\2\u0102\u0103\7(\2\2\u0103Z\3\2"+
		"\2\2\u0104\u0105\t\6\2\2\u0105\u0109\t\7\2\2\u0106\u0108\t\b\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\t\7\2\2\u010d"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u011f\3\2\2\2\u0111\u0115\t\t\2\2\u0112\u0114\t\b\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\t\7\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011e\3\2\2\2\u011d\u0111\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0123\t\6\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b.\2\2\u0125"+
		"\\\3\2\2\2\u0126\u0128\t\n\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c"+
		"\b/\2\2\u012c^\3\2\2\2\u012d\u012e\7^\2\2\u012e\u012f\t\13\2\2\u012f`"+
		"\3\2\2\2\16\2\u00af\u00b4\u00ba\u00c0\u00c9\u0109\u010f\u0115\u011b\u011f"+
		"\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}