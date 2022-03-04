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
		P_MATCH=16, P_LOOP=17, P_ABS=18, P_SQRT=19, P_TOSTRING=20, P_CLONE=21, 
		NUMBER=22, DECIMAL=23, STRING=24, ID=25, PUNTO=26, PTCOMA=27, COMA=28, 
		DOSPUNTOS=29, DIFERENTE=30, DIFERENTEDE=31, IGUAL=32, IGUALIGUA=33, MAYORIGUAL=34, 
		MENORIGUAL=35, MAYOR=36, MENOR=37, MUL=38, DIV=39, MODULO=40, ADD=41, 
		SUB=42, PARIZQ=43, PARDER=44, LLAVEIZQ=45, LLAVEDER=46, CORIZQ=47, CORDER=48, 
		OR=49, AND=50, MULTICOMENT=51, WHITESPACE=52;
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
			"P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", "P_TOSTRING", "P_CLONE", "NUMBER", 
			"DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA", "COMA", "DOSPUNTOS", "DIFERENTE", 
			"DIFERENTEDE", "IGUAL", "IGUALIGUA", "MAYORIGUAL", "MENORIGUAL", "MAYOR", 
			"MENOR", "MUL", "DIV", "MODULO", "ADD", "SUB", "PARIZQ", "PARDER", "LLAVEIZQ", 
			"LLAVEDER", "CORIZQ", "CORDER", "OR", "AND", "MULTICOMENT", "WHITESPACE", 
			"ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'println'", "'number'", "'string'", "'if'", "'else'", "'while'", 
			"'pow'", "'powf'", "'i64'", "'f64'", "'let'", "'mut'", "'as'", "'true'", 
			"'false'", "'match'", "'loop'", "'abs'", "'sqrt'", "'to_string'", "'clone'", 
			null, null, null, null, "'.'", "';'", "','", "':'", "'!'", "'!='", "'='", 
			"'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'%'", "'+'", "'-'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINTLN", "P_NUMBER", "P_STRING", "P_IF", "P_ELSE", "P_WHILE", 
			"P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", "P_TRUE", 
			"P_FALSE", "P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", "P_TOSTRING", "P_CLONE", 
			"NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", "PTCOMA", "COMA", "DOSPUNTOS", 
			"DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA", "MAYORIGUAL", "MENORIGUAL", 
			"MAYOR", "MENOR", "MUL", "DIV", "MODULO", "ADD", "SUB", "PARIZQ", "PARDER", 
			"LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "OR", "AND", "MULTICOMENT", 
			"WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0160\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\6\27\u00de\n\27\r\27\16\27\u00df"+
		"\3\30\6\30\u00e3\n\30\r\30\16\30\u00e4\3\30\3\30\6\30\u00e9\n\30\r\30"+
		"\16\30\u00ea\3\31\3\31\7\31\u00ef\n\31\f\31\16\31\u00f2\13\31\3\31\3\31"+
		"\3\32\3\32\7\32\u00f8\n\32\f\32\16\32\u00fb\13\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\7\64\u0138\n\64\f\64\16\64\u013b\13\64\3\64\6\64\u013e\n\64\r\64\16\64"+
		"\u013f\3\64\3\64\7\64\u0144\n\64\f\64\16\64\u0147\13\64\3\64\6\64\u014a"+
		"\n\64\r\64\16\64\u014b\7\64\u014e\n\64\f\64\16\64\u0151\13\64\3\64\3\64"+
		"\3\64\3\64\3\65\6\65\u0158\n\65\r\65\16\65\u0159\3\65\3\65\3\66\3\66\3"+
		"\66\2\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\2\3\2\f\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\3\2\61\61\3\2,,"+
		"\4\2,,``\5\2,,\61\61``\6\2\13\f\17\17\"\"^^\t\2\"#%%--/\60<<BB]_\2\u0169"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3m\3\2\2\2\5u\3\2\2"+
		"\2\7|\3\2\2\2\t\u0083\3\2\2\2\13\u0086\3\2\2\2\r\u008b\3\2\2\2\17\u0091"+
		"\3\2\2\2\21\u0095\3\2\2\2\23\u009a\3\2\2\2\25\u009e\3\2\2\2\27\u00a2\3"+
		"\2\2\2\31\u00a6\3\2\2\2\33\u00aa\3\2\2\2\35\u00ad\3\2\2\2\37\u00b2\3\2"+
		"\2\2!\u00b8\3\2\2\2#\u00be\3\2\2\2%\u00c3\3\2\2\2\'\u00c7\3\2\2\2)\u00cc"+
		"\3\2\2\2+\u00d6\3\2\2\2-\u00dd\3\2\2\2/\u00e2\3\2\2\2\61\u00ec\3\2\2\2"+
		"\63\u00f5\3\2\2\2\65\u00fc\3\2\2\2\67\u00fe\3\2\2\29\u0100\3\2\2\2;\u0102"+
		"\3\2\2\2=\u0104\3\2\2\2?\u0106\3\2\2\2A\u0109\3\2\2\2C\u010b\3\2\2\2E"+
		"\u010e\3\2\2\2G\u0111\3\2\2\2I\u0114\3\2\2\2K\u0116\3\2\2\2M\u0118\3\2"+
		"\2\2O\u011a\3\2\2\2Q\u011c\3\2\2\2S\u011e\3\2\2\2U\u0120\3\2\2\2W\u0122"+
		"\3\2\2\2Y\u0124\3\2\2\2[\u0126\3\2\2\2]\u0128\3\2\2\2_\u012a\3\2\2\2a"+
		"\u012c\3\2\2\2c\u012e\3\2\2\2e\u0131\3\2\2\2g\u0134\3\2\2\2i\u0157\3\2"+
		"\2\2k\u015d\3\2\2\2mn\7r\2\2no\7t\2\2op\7k\2\2pq\7p\2\2qr\7v\2\2rs\7n"+
		"\2\2st\7p\2\2t\4\3\2\2\2uv\7p\2\2vw\7w\2\2wx\7o\2\2xy\7d\2\2yz\7g\2\2"+
		"z{\7t\2\2{\6\3\2\2\2|}\7u\2\2}~\7v\2\2~\177\7t\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7p\2\2\u0081\u0082\7i\2\2\u0082\b\3\2\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7h\2\2\u0085\n\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088\7n\2\2\u0088"+
		"\u0089\7u\2\2\u0089\u008a\7g\2\2\u008a\f\3\2\2\2\u008b\u008c\7y\2\2\u008c"+
		"\u008d\7j\2\2\u008d\u008e\7k\2\2\u008e\u008f\7n\2\2\u008f\u0090\7g\2\2"+
		"\u0090\16\3\2\2\2\u0091\u0092\7r\2\2\u0092\u0093\7q\2\2\u0093\u0094\7"+
		"y\2\2\u0094\20\3\2\2\2\u0095\u0096\7r\2\2\u0096\u0097\7q\2\2\u0097\u0098"+
		"\7y\2\2\u0098\u0099\7h\2\2\u0099\22\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c"+
		"\78\2\2\u009c\u009d\7\66\2\2\u009d\24\3\2\2\2\u009e\u009f\7h\2\2\u009f"+
		"\u00a0\78\2\2\u00a0\u00a1\7\66\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7n\2\2"+
		"\u00a3\u00a4\7g\2\2\u00a4\u00a5\7v\2\2\u00a5\30\3\2\2\2\u00a6\u00a7\7"+
		"o\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7v\2\2\u00a9\32\3\2\2\2\u00aa\u00ab"+
		"\7c\2\2\u00ab\u00ac\7u\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af"+
		"\7t\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7g\2\2\u00b1\36\3\2\2\2\u00b2\u00b3"+
		"\7h\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7u\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7 \3\2\2\2\u00b8\u00b9\7o\2\2\u00b9\u00ba\7c\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7j\2\2\u00bd\"\3\2\2\2\u00be"+
		"\u00bf\7n\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7r\2\2"+
		"\u00c2$\3\2\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7u\2"+
		"\2\u00c6&\3\2\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7s\2\2\u00c9\u00ca\7"+
		"t\2\2\u00ca\u00cb\7v\2\2\u00cb(\3\2\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7a\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7i\2\2"+
		"\u00d5*\3\2\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7q\2"+
		"\2\u00d9\u00da\7p\2\2\u00da\u00db\7g\2\2\u00db,\3\2\2\2\u00dc\u00de\t"+
		"\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0.\3\2\2\2\u00e1\u00e3\t\2\2\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e8\7\60\2\2\u00e7\u00e9\t\2\2\2\u00e8\u00e7\3\2\2\2"+
		"\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\60"+
		"\3\2\2\2\u00ec\u00f0\7$\2\2\u00ed\u00ef\n\3\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7$\2\2\u00f4\62\3\2\2\2\u00f5\u00f9"+
		"\t\4\2\2\u00f6\u00f8\t\5\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\64\3\2\2\2\u00fb\u00f9\3\2\2"+
		"\2\u00fc\u00fd\7\60\2\2\u00fd\66\3\2\2\2\u00fe\u00ff\7=\2\2\u00ff8\3\2"+
		"\2\2\u0100\u0101\7.\2\2\u0101:\3\2\2\2\u0102\u0103\7<\2\2\u0103<\3\2\2"+
		"\2\u0104\u0105\7#\2\2\u0105>\3\2\2\2\u0106\u0107\7#\2\2\u0107\u0108\7"+
		"?\2\2\u0108@\3\2\2\2\u0109\u010a\7?\2\2\u010aB\3\2\2\2\u010b\u010c\7?"+
		"\2\2\u010c\u010d\7?\2\2\u010dD\3\2\2\2\u010e\u010f\7@\2\2\u010f\u0110"+
		"\7?\2\2\u0110F\3\2\2\2\u0111\u0112\7>\2\2\u0112\u0113\7?\2\2\u0113H\3"+
		"\2\2\2\u0114\u0115\7@\2\2\u0115J\3\2\2\2\u0116\u0117\7>\2\2\u0117L\3\2"+
		"\2\2\u0118\u0119\7,\2\2\u0119N\3\2\2\2\u011a\u011b\7\61\2\2\u011bP\3\2"+
		"\2\2\u011c\u011d\7\'\2\2\u011dR\3\2\2\2\u011e\u011f\7-\2\2\u011fT\3\2"+
		"\2\2\u0120\u0121\7/\2\2\u0121V\3\2\2\2\u0122\u0123\7*\2\2\u0123X\3\2\2"+
		"\2\u0124\u0125\7+\2\2\u0125Z\3\2\2\2\u0126\u0127\7}\2\2\u0127\\\3\2\2"+
		"\2\u0128\u0129\7\177\2\2\u0129^\3\2\2\2\u012a\u012b\7]\2\2\u012b`\3\2"+
		"\2\2\u012c\u012d\7_\2\2\u012db\3\2\2\2\u012e\u012f\7~\2\2\u012f\u0130"+
		"\7~\2\2\u0130d\3\2\2\2\u0131\u0132\7(\2\2\u0132\u0133\7(\2\2\u0133f\3"+
		"\2\2\2\u0134\u0135\t\6\2\2\u0135\u0139\t\7\2\2\u0136\u0138\t\b\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\t\7\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u014f\3\2\2\2\u0141\u0145\t\t\2\2\u0142\u0144\t\b\2\2\u0143"+
		"\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014a\t\7\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014e\3\2\2\2\u014d\u0141\3\2\2\2\u014e\u0151\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0152\u0153\t\6\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b\64\2\2\u0155"+
		"h\3\2\2\2\u0156\u0158\t\n\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2"+
		"\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c"+
		"\b\65\2\2\u015cj\3\2\2\2\u015d\u015e\7^\2\2\u015e\u015f\t\13\2\2\u015f"+
		"l\3\2\2\2\16\2\u00df\u00e4\u00ea\u00f0\u00f9\u0139\u013f\u0145\u014b\u014f"+
		"\u0159\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}