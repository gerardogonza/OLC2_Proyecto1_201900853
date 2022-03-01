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
		PRINTLN=1, P_NUMBER=2, P_STRING=3, P_IF=4, P_WHILE=5, P_POW=6, P_POWF=7, 
		P_I64=8, P_F64=9, P_LET=10, P_MUT=11, P_AS=12, NUMBER=13, DECIMAL=14, 
		STRING=15, ID=16, PUNTO=17, PTCOMA=18, COMA=19, DOSPUNTOS=20, DIFERENTE=21, 
		DIFERENTEDE=22, IGUAL=23, IGUALIGUA=24, MAYORIGUAL=25, MENORIGUAL=26, 
		MAYOR=27, MENOR=28, MUL=29, DIV=30, MODULO=31, ADD=32, SUB=33, PARIZQ=34, 
		PARDER=35, LLAVEIZQ=36, LLAVEDER=37, CORIZQ=38, CORDER=39, OR=40, AND=41, 
		MULTICOMENT=42, WHITESPACE=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINTLN", "P_NUMBER", "P_STRING", "P_IF", "P_WHILE", "P_POW", "P_POWF", 
			"P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", "NUMBER", "DECIMAL", "STRING", 
			"ID", "PUNTO", "PTCOMA", "COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", 
			"IGUAL", "IGUALIGUA", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", 
			"DIV", "MODULO", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", 
			"CORIZQ", "CORDER", "OR", "AND", "MULTICOMENT", "WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'number'", "'string'", "'if'", "'while'", "'pow'", 
			"'powf'", "'i64'", "'f64'", "'let'", "'mut'", "'as'", null, null, null, 
			null, "'.'", "';'", "','", "':'", "'!'", "'!='", "'='", "'=='", "'>='", 
			"'<='", "'>'", "'<'", "'*'", "'/'", "'%'", "'+'", "'-'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINTLN", "P_NUMBER", "P_STRING", "P_IF", "P_WHILE", "P_POW", 
			"P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", "NUMBER", "DECIMAL", 
			"STRING", "ID", "PUNTO", "PTCOMA", "COMA", "DOSPUNTOS", "DIFERENTE", 
			"DIFERENTEDE", "IGUAL", "IGUALIGUA", "MAYORIGUAL", "MENORIGUAL", "MAYOR", 
			"MENOR", "MUL", "DIV", "MODULO", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", 
			"LLAVEDER", "CORIZQ", "CORDER", "OR", "AND", "MULTICOMENT", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u011a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\6\16\u0098\n\16\r\16\16"+
		"\16\u0099\3\17\6\17\u009d\n\17\r\17\16\17\u009e\3\17\3\17\6\17\u00a3\n"+
		"\17\r\17\16\17\u00a4\3\20\3\20\7\20\u00a9\n\20\f\20\16\20\u00ac\13\20"+
		"\3\20\3\20\3\21\3\21\7\21\u00b2\n\21\f\21\16\21\u00b5\13\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3)\3*\3*\3*\3+\3+\3+\7+\u00f2\n+\f+\16+\u00f5\13+\3+\6+\u00f8\n+"+
		"\r+\16+\u00f9\3+\3+\7+\u00fe\n+\f+\16+\u0101\13+\3+\6+\u0104\n+\r+\16"+
		"+\u0105\7+\u0108\n+\f+\16+\u010b\13+\3+\3+\3+\3+\3,\6,\u0112\n,\r,\16"+
		",\u0113\3,\3,\3-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2\3\2\f\3\2"+
		"\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\3\2\61\61\3\2,,\4\2,,``\5\2,,\61"+
		"\61``\6\2\13\f\17\17\"\"^^\t\2\"#%%--/\60<<BB]_\2\u0123\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\3[\3\2\2\2\5c\3\2\2\2\7j\3\2\2\2\tq\3\2\2\2\13t\3\2\2\2\rz\3\2"+
		"\2\2\17~\3\2\2\2\21\u0083\3\2\2\2\23\u0087\3\2\2\2\25\u008b\3\2\2\2\27"+
		"\u008f\3\2\2\2\31\u0093\3\2\2\2\33\u0097\3\2\2\2\35\u009c\3\2\2\2\37\u00a6"+
		"\3\2\2\2!\u00af\3\2\2\2#\u00b6\3\2\2\2%\u00b8\3\2\2\2\'\u00ba\3\2\2\2"+
		")\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00c0\3\2\2\2/\u00c3\3\2\2\2\61\u00c5"+
		"\3\2\2\2\63\u00c8\3\2\2\2\65\u00cb\3\2\2\2\67\u00ce\3\2\2\29\u00d0\3\2"+
		"\2\2;\u00d2\3\2\2\2=\u00d4\3\2\2\2?\u00d6\3\2\2\2A\u00d8\3\2\2\2C\u00da"+
		"\3\2\2\2E\u00dc\3\2\2\2G\u00de\3\2\2\2I\u00e0\3\2\2\2K\u00e2\3\2\2\2M"+
		"\u00e4\3\2\2\2O\u00e6\3\2\2\2Q\u00e8\3\2\2\2S\u00eb\3\2\2\2U\u00ee\3\2"+
		"\2\2W\u0111\3\2\2\2Y\u0117\3\2\2\2[\\\7r\2\2\\]\7t\2\2]^\7k\2\2^_\7p\2"+
		"\2_`\7v\2\2`a\7n\2\2ab\7p\2\2b\4\3\2\2\2cd\7p\2\2de\7w\2\2ef\7o\2\2fg"+
		"\7d\2\2gh\7g\2\2hi\7t\2\2i\6\3\2\2\2jk\7u\2\2kl\7v\2\2lm\7t\2\2mn\7k\2"+
		"\2no\7p\2\2op\7i\2\2p\b\3\2\2\2qr\7k\2\2rs\7h\2\2s\n\3\2\2\2tu\7y\2\2"+
		"uv\7j\2\2vw\7k\2\2wx\7n\2\2xy\7g\2\2y\f\3\2\2\2z{\7r\2\2{|\7q\2\2|}\7"+
		"y\2\2}\16\3\2\2\2~\177\7r\2\2\177\u0080\7q\2\2\u0080\u0081\7y\2\2\u0081"+
		"\u0082\7h\2\2\u0082\20\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\78\2\2\u0085"+
		"\u0086\7\66\2\2\u0086\22\3\2\2\2\u0087\u0088\7h\2\2\u0088\u0089\78\2\2"+
		"\u0089\u008a\7\66\2\2\u008a\24\3\2\2\2\u008b\u008c\7n\2\2\u008c\u008d"+
		"\7g\2\2\u008d\u008e\7v\2\2\u008e\26\3\2\2\2\u008f\u0090\7o\2\2\u0090\u0091"+
		"\7w\2\2\u0091\u0092\7v\2\2\u0092\30\3\2\2\2\u0093\u0094\7c\2\2\u0094\u0095"+
		"\7u\2\2\u0095\32\3\2\2\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\34\3\2\2"+
		"\2\u009b\u009d\t\2\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7\60\2\2"+
		"\u00a1\u00a3\t\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\36\3\2\2\2\u00a6\u00aa\7$\2\2\u00a7"+
		"\u00a9\n\3\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\7$\2\2\u00ae \3\2\2\2\u00af\u00b3\t\4\2\2\u00b0\u00b2\t\5\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\60\2\2\u00b7$\3"+
		"\2\2\2\u00b8\u00b9\7=\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb(\3\2"+
		"\2\2\u00bc\u00bd\7<\2\2\u00bd*\3\2\2\2\u00be\u00bf\7#\2\2\u00bf,\3\2\2"+
		"\2\u00c0\u00c1\7#\2\2\u00c1\u00c2\7?\2\2\u00c2.\3\2\2\2\u00c3\u00c4\7"+
		"?\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6\u00c7\7?\2\2\u00c7\62"+
		"\3\2\2\2\u00c8\u00c9\7@\2\2\u00c9\u00ca\7?\2\2\u00ca\64\3\2\2\2\u00cb"+
		"\u00cc\7>\2\2\u00cc\u00cd\7?\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7@\2\2\u00cf"+
		"8\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3<"+
		"\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5>\3\2\2\2\u00d6\u00d7\7\'\2\2\u00d7"+
		"@\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9B\3\2\2\2\u00da\u00db\7/\2\2\u00dbD"+
		"\3\2\2\2\u00dc\u00dd\7*\2\2\u00ddF\3\2\2\2\u00de\u00df\7+\2\2\u00dfH\3"+
		"\2\2\2\u00e0\u00e1\7}\2\2\u00e1J\3\2\2\2\u00e2\u00e3\7\177\2\2\u00e3L"+
		"\3\2\2\2\u00e4\u00e5\7]\2\2\u00e5N\3\2\2\2\u00e6\u00e7\7_\2\2\u00e7P\3"+
		"\2\2\2\u00e8\u00e9\7~\2\2\u00e9\u00ea\7~\2\2\u00eaR\3\2\2\2\u00eb\u00ec"+
		"\7(\2\2\u00ec\u00ed\7(\2\2\u00edT\3\2\2\2\u00ee\u00ef\t\6\2\2\u00ef\u00f3"+
		"\t\7\2\2\u00f0\u00f2\t\b\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f8\t\7\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0109\3\2\2\2\u00fb\u00ff\t\t"+
		"\2\2\u00fc\u00fe\t\b\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u0104\t\7\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u00fb\3\2"+
		"\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\t\6\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u010f\b+\2\2\u010fV\3\2\2\2\u0110\u0112\t\n\2\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u0116\b,\2\2\u0116X\3\2\2\2\u0117\u0118\7^\2\2\u0118"+
		"\u0119\t\13\2\2\u0119Z\3\2\2\2\16\2\u0099\u009e\u00a4\u00aa\u00b3\u00f3"+
		"\u00f9\u00ff\u0105\u0109\u0113\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}