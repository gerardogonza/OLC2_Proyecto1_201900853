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
		P_MATCH=16, P_LOOP=17, NUMBER=18, DECIMAL=19, STRING=20, ID=21, PUNTO=22, 
		PTCOMA=23, COMA=24, DOSPUNTOS=25, DIFERENTE=26, DIFERENTEDE=27, IGUAL=28, 
		IGUALIGUA=29, MAYORIGUAL=30, MENORIGUAL=31, MAYOR=32, MENOR=33, MUL=34, 
		DIV=35, MODULO=36, ADD=37, SUB=38, PARIZQ=39, PARDER=40, LLAVEIZQ=41, 
		LLAVEDER=42, CORIZQ=43, CORDER=44, OR=45, AND=46, MULTICOMENT=47, WHITESPACE=48;
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
			"P_MATCH", "P_LOOP", "NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA", 
			"COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA", 
			"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "MODULO", 
			"ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", 
			"OR", "AND", "MULTICOMENT", "WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'number'", "'string'", "'if'", "'else'", "'while'", 
			"'pow'", "'powf'", "'i64'", "'f64'", "'let'", "'mut'", "'as'", "'true'", 
			"'false'", "'match'", "'loop'", null, null, null, null, "'.'", "';'", 
			"','", "':'", "'!'", "'!='", "'='", "'=='", "'>='", "'<='", "'>'", "'<'", 
			"'*'", "'/'", "'%'", "'+'", "'-'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINTLN", "P_NUMBER", "P_STRING", "P_IF", "P_ELSE", "P_WHILE", 
			"P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", "P_TRUE", 
			"P_FALSE", "P_MATCH", "P_LOOP", "NUMBER", "DECIMAL", "STRING", "ID", 
			"PUNTO", "PTCOMA", "COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", 
			"IGUALIGUA", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", 
			"MODULO", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", 
			"CORDER", "OR", "AND", "MULTICOMENT", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u013f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\6\23\u00bd\n\23\r\23\16\23\u00be\3\24\6\24\u00c2\n\24"+
		"\r\24\16\24\u00c3\3\24\3\24\6\24\u00c8\n\24\r\24\16\24\u00c9\3\25\3\25"+
		"\7\25\u00ce\n\25\f\25\16\25\u00d1\13\25\3\25\3\25\3\26\3\26\7\26\u00d7"+
		"\n\26\f\26\16\26\u00da\13\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\7\60\u0117\n\60\f\60"+
		"\16\60\u011a\13\60\3\60\6\60\u011d\n\60\r\60\16\60\u011e\3\60\3\60\7\60"+
		"\u0123\n\60\f\60\16\60\u0126\13\60\3\60\6\60\u0129\n\60\r\60\16\60\u012a"+
		"\7\60\u012d\n\60\f\60\16\60\u0130\13\60\3\60\3\60\3\60\3\60\3\61\6\61"+
		"\u0137\n\61\r\61\16\61\u0138\3\61\3\61\3\62\3\62\3\62\2\2\63\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2\3\2\f\3\2\62;\3\2$$\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\3\2\61\61\3\2,,\4\2,,``\5\2,,\61\61``\6\2\13\f\17\17"+
		"\"\"^^\t\2\"#%%--/\60<<BB]_\2\u0148\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3e\3\2\2\2\5m\3\2\2\2\7t\3\2"+
		"\2\2\t{\3\2\2\2\13~\3\2\2\2\r\u0083\3\2\2\2\17\u0089\3\2\2\2\21\u008d"+
		"\3\2\2\2\23\u0092\3\2\2\2\25\u0096\3\2\2\2\27\u009a\3\2\2\2\31\u009e\3"+
		"\2\2\2\33\u00a2\3\2\2\2\35\u00a5\3\2\2\2\37\u00aa\3\2\2\2!\u00b0\3\2\2"+
		"\2#\u00b6\3\2\2\2%\u00bc\3\2\2\2\'\u00c1\3\2\2\2)\u00cb\3\2\2\2+\u00d4"+
		"\3\2\2\2-\u00db\3\2\2\2/\u00dd\3\2\2\2\61\u00df\3\2\2\2\63\u00e1\3\2\2"+
		"\2\65\u00e3\3\2\2\2\67\u00e5\3\2\2\29\u00e8\3\2\2\2;\u00ea\3\2\2\2=\u00ed"+
		"\3\2\2\2?\u00f0\3\2\2\2A\u00f3\3\2\2\2C\u00f5\3\2\2\2E\u00f7\3\2\2\2G"+
		"\u00f9\3\2\2\2I\u00fb\3\2\2\2K\u00fd\3\2\2\2M\u00ff\3\2\2\2O\u0101\3\2"+
		"\2\2Q\u0103\3\2\2\2S\u0105\3\2\2\2U\u0107\3\2\2\2W\u0109\3\2\2\2Y\u010b"+
		"\3\2\2\2[\u010d\3\2\2\2]\u0110\3\2\2\2_\u0113\3\2\2\2a\u0136\3\2\2\2c"+
		"\u013c\3\2\2\2ef\7r\2\2fg\7t\2\2gh\7k\2\2hi\7p\2\2ij\7v\2\2jk\7n\2\2k"+
		"l\7p\2\2l\4\3\2\2\2mn\7p\2\2no\7w\2\2op\7o\2\2pq\7d\2\2qr\7g\2\2rs\7t"+
		"\2\2s\6\3\2\2\2tu\7u\2\2uv\7v\2\2vw\7t\2\2wx\7k\2\2xy\7p\2\2yz\7i\2\2"+
		"z\b\3\2\2\2{|\7k\2\2|}\7h\2\2}\n\3\2\2\2~\177\7g\2\2\177\u0080\7n\2\2"+
		"\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\f\3\2\2\2\u0083\u0084\7y"+
		"\2\2\u0084\u0085\7j\2\2\u0085\u0086\7k\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7g\2\2\u0088\16\3\2\2\2\u0089\u008a\7r\2\2\u008a\u008b\7q\2\2\u008b\u008c"+
		"\7y\2\2\u008c\20\3\2\2\2\u008d\u008e\7r\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7y\2\2\u0090\u0091\7h\2\2\u0091\22\3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094"+
		"\78\2\2\u0094\u0095\7\66\2\2\u0095\24\3\2\2\2\u0096\u0097\7h\2\2\u0097"+
		"\u0098\78\2\2\u0098\u0099\7\66\2\2\u0099\26\3\2\2\2\u009a\u009b\7n\2\2"+
		"\u009b\u009c\7g\2\2\u009c\u009d\7v\2\2\u009d\30\3\2\2\2\u009e\u009f\7"+
		"o\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7v\2\2\u00a1\32\3\2\2\2\u00a2\u00a3"+
		"\7c\2\2\u00a3\u00a4\7u\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7"+
		"\7t\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7g\2\2\u00a9\36\3\2\2\2\u00aa\u00ab"+
		"\7h\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae"+
		"\u00af\7g\2\2\u00af \3\2\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\7v\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7j\2\2\u00b5\"\3\2\2\2\u00b6"+
		"\u00b7\7n\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7r\2\2"+
		"\u00ba$\3\2\2\2\u00bb\u00bd\t\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf&\3\2\2\2\u00c0\u00c2"+
		"\t\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\7\60\2\2\u00c6\u00c8\t"+
		"\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca(\3\2\2\2\u00cb\u00cf\7$\2\2\u00cc\u00ce\n\3\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7$\2\2\u00d3"+
		"*\3\2\2\2\u00d4\u00d8\t\4\2\2\u00d5\u00d7\t\5\2\2\u00d6\u00d5\3\2\2\2"+
		"\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9,\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\60\2\2\u00dc.\3\2\2\2\u00dd\u00de"+
		"\7=\2\2\u00de\60\3\2\2\2\u00df\u00e0\7.\2\2\u00e0\62\3\2\2\2\u00e1\u00e2"+
		"\7<\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7#\2\2\u00e4\66\3\2\2\2\u00e5\u00e6"+
		"\7#\2\2\u00e6\u00e7\7?\2\2\u00e78\3\2\2\2\u00e8\u00e9\7?\2\2\u00e9:\3"+
		"\2\2\2\u00ea\u00eb\7?\2\2\u00eb\u00ec\7?\2\2\u00ec<\3\2\2\2\u00ed\u00ee"+
		"\7@\2\2\u00ee\u00ef\7?\2\2\u00ef>\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1\u00f2"+
		"\7?\2\2\u00f2@\3\2\2\2\u00f3\u00f4\7@\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7"+
		">\2\2\u00f6D\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8F\3\2\2\2\u00f9\u00fa\7\61"+
		"\2\2\u00faH\3\2\2\2\u00fb\u00fc\7\'\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\7-"+
		"\2\2\u00feL\3\2\2\2\u00ff\u0100\7/\2\2\u0100N\3\2\2\2\u0101\u0102\7*\2"+
		"\2\u0102P\3\2\2\2\u0103\u0104\7+\2\2\u0104R\3\2\2\2\u0105\u0106\7}\2\2"+
		"\u0106T\3\2\2\2\u0107\u0108\7\177\2\2\u0108V\3\2\2\2\u0109\u010a\7]\2"+
		"\2\u010aX\3\2\2\2\u010b\u010c\7_\2\2\u010cZ\3\2\2\2\u010d\u010e\7~\2\2"+
		"\u010e\u010f\7~\2\2\u010f\\\3\2\2\2\u0110\u0111\7(\2\2\u0111\u0112\7("+
		"\2\2\u0112^\3\2\2\2\u0113\u0114\t\6\2\2\u0114\u0118\t\7\2\2\u0115\u0117"+
		"\t\b\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011d\t\7"+
		"\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u012e\3\2\2\2\u0120\u0124\t\t\2\2\u0121\u0123\t\b"+
		"\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0129\t\7"+
		"\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u0120\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0132\t\6\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b\60"+
		"\2\2\u0134`\3\2\2\2\u0135\u0137\t\n\2\2\u0136\u0135\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\b\61\2\2\u013bb\3\2\2\2\u013c\u013d\7^\2\2\u013d\u013e\t\13\2\2"+
		"\u013ed\3\2\2\2\16\2\u00be\u00c3\u00c9\u00cf\u00d8\u0118\u011e\u0124\u012a"+
		"\u012e\u0138\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}