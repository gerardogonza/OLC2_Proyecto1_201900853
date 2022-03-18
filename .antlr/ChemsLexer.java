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
		P_CLONE=22, P_FOR=23, P_IN=24, P_BREAK=25, NUMBER=26, DECIMAL=27, STRING=28, 
		ID=29, PUNTO=30, PTCOMA=31, COMA=32, DOSPUNTOS=33, DIFERENTE=34, DIFERENTEDE=35, 
		IGUAL=36, IGUALIGUA=37, MAYORIGUAL=38, MENORIGUAL=39, MAYOR=40, MENOR=41, 
		MUL=42, DIV=43, MODULO=44, ADD=45, SUB=46, PARIZQ=47, PARDER=48, LLAVEIZQ=49, 
		LLAVEDER=50, CORIZQ=51, CORDER=52, OR=53, AND=54, MULTICOMENT=55, WHITESPACE=56;
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
			"P_FOR", "P_IN", "P_BREAK", "NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", 
			"PTCOMA", "COMA", "DOSPUNTOS", "DIFERENTE", "DIFERENTEDE", "IGUAL", "IGUALIGUA", 
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
			"'clone'", "'for'", "'in'", "'break'", null, null, null, null, "'.'", 
			"';'", "','", "':'", "'!'", "'!='", "'='", "'=='", "'>='", "'<='", "'>'", 
			"'<'", "'*'", "'/'", "'%'", "'+'", "'-'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINTLN", "PRINT", "P_NUMBER", "P_STRING", "P_IF", "P_ELSE", "P_WHILE", 
			"P_POW", "P_POWF", "P_I64", "P_F64", "P_LET", "P_MUT", "P_AS", "P_TRUE", 
			"P_FALSE", "P_MATCH", "P_LOOP", "P_ABS", "P_SQRT", "P_TOSTRING", "P_CLONE", 
			"P_FOR", "P_IN", "P_BREAK", "NUMBER", "DECIMAL", "STRING", "ID", "PUNTO", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u017b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\6\33\u00f9\n\33\r\33\16\33\u00fa\3\34\6\34\u00fe\n"+
		"\34\r\34\16\34\u00ff\3\34\3\34\6\34\u0104\n\34\r\34\16\34\u0105\3\35\3"+
		"\35\7\35\u010a\n\35\f\35\16\35\u010d\13\35\3\35\3\35\3\36\3\36\7\36\u0113"+
		"\n\36\f\36\16\36\u0116\13\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\78\u0153\n8\f8\168\u0156\13"+
		"8\38\68\u0159\n8\r8\168\u015a\38\38\78\u015f\n8\f8\168\u0162\138\38\6"+
		"8\u0165\n8\r8\168\u0166\78\u0169\n8\f8\168\u016c\138\38\38\38\38\39\6"+
		"9\u0173\n9\r9\169\u0174\39\39\3:\3:\3:\2\2;\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s\2\3\2\f\3\2\62;\3\2$$"+
		"\5\2C\\aac|\6\2\62;C\\aac|\3\2\61\61\3\2,,\4\2,,``\5\2,,\61\61``\6\2\13"+
		"\f\17\17\"\"^^\t\2\"#%%--/\60<<BB]_\2\u0184\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3"+
		"u\3\2\2\2\5}\3\2\2\2\7\u0083\3\2\2\2\t\u008a\3\2\2\2\13\u0091\3\2\2\2"+
		"\r\u0094\3\2\2\2\17\u0099\3\2\2\2\21\u009f\3\2\2\2\23\u00a3\3\2\2\2\25"+
		"\u00a8\3\2\2\2\27\u00ac\3\2\2\2\31\u00b0\3\2\2\2\33\u00b4\3\2\2\2\35\u00b8"+
		"\3\2\2\2\37\u00bb\3\2\2\2!\u00c0\3\2\2\2#\u00c6\3\2\2\2%\u00cc\3\2\2\2"+
		"\'\u00d1\3\2\2\2)\u00d5\3\2\2\2+\u00da\3\2\2\2-\u00e4\3\2\2\2/\u00ea\3"+
		"\2\2\2\61\u00ee\3\2\2\2\63\u00f1\3\2\2\2\65\u00f8\3\2\2\2\67\u00fd\3\2"+
		"\2\29\u0107\3\2\2\2;\u0110\3\2\2\2=\u0117\3\2\2\2?\u0119\3\2\2\2A\u011b"+
		"\3\2\2\2C\u011d\3\2\2\2E\u011f\3\2\2\2G\u0121\3\2\2\2I\u0124\3\2\2\2K"+
		"\u0126\3\2\2\2M\u0129\3\2\2\2O\u012c\3\2\2\2Q\u012f\3\2\2\2S\u0131\3\2"+
		"\2\2U\u0133\3\2\2\2W\u0135\3\2\2\2Y\u0137\3\2\2\2[\u0139\3\2\2\2]\u013b"+
		"\3\2\2\2_\u013d\3\2\2\2a\u013f\3\2\2\2c\u0141\3\2\2\2e\u0143\3\2\2\2g"+
		"\u0145\3\2\2\2i\u0147\3\2\2\2k\u0149\3\2\2\2m\u014c\3\2\2\2o\u014f\3\2"+
		"\2\2q\u0172\3\2\2\2s\u0178\3\2\2\2uv\7r\2\2vw\7t\2\2wx\7k\2\2xy\7p\2\2"+
		"yz\7v\2\2z{\7n\2\2{|\7p\2\2|\4\3\2\2\2}~\7r\2\2~\177\7t\2\2\177\u0080"+
		"\7k\2\2\u0080\u0081\7p\2\2\u0081\u0082\7v\2\2\u0082\6\3\2\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7w\2\2\u0085\u0086\7o\2\2\u0086\u0087\7d\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u0089\7t\2\2\u0089\b\3\2\2\2\u008a\u008b\7u\2\2\u008b"+
		"\u008c\7v\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2"+
		"\u008f\u0090\7i\2\2\u0090\n\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7h"+
		"\2\2\u0093\f\3\2\2\2\u0094\u0095\7g\2\2\u0095\u0096\7n\2\2\u0096\u0097"+
		"\7u\2\2\u0097\u0098\7g\2\2\u0098\16\3\2\2\2\u0099\u009a\7y\2\2\u009a\u009b"+
		"\7j\2\2\u009b\u009c\7k\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e"+
		"\20\3\2\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7y\2\2\u00a2"+
		"\22\3\2\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7y\2\2\u00a6"+
		"\u00a7\7h\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\78\2\2\u00aa"+
		"\u00ab\7\66\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\78\2\2"+
		"\u00ae\u00af\7\66\2\2\u00af\30\3\2\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2"+
		"\7g\2\2\u00b2\u00b3\7v\2\2\u00b3\32\3\2\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6"+
		"\7w\2\2\u00b6\u00b7\7v\2\2\u00b7\34\3\2\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba"+
		"\7u\2\2\u00ba\36\3\2\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be"+
		"\7w\2\2\u00be\u00bf\7g\2\2\u00bf \3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\"\3\2\2\2\u00c6\u00c7\7o\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\u00ca\7e\2\2\u00ca\u00cb\7j\2\2\u00cb$\3\2\2\2\u00cc\u00cd\7n\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7r\2\2\u00d0&\3\2\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7u\2\2\u00d4(\3\2\2\2\u00d5"+
		"\u00d6\7u\2\2\u00d6\u00d7\7s\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7v\2\2"+
		"\u00d9*\3\2\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7a\2"+
		"\2\u00dd\u00de\7u\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
		"\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7i\2\2\u00e3,\3\2\2\2\u00e4\u00e5"+
		"\7e\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7p\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9.\3\2\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7q\2\2\u00ec"+
		"\u00ed\7t\2\2\u00ed\60\3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2\2\u00f0"+
		"\62\3\2\2\2\u00f1\u00f2\7d\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"\u00f5\7c\2\2\u00f5\u00f6\7m\2\2\u00f6\64\3\2\2\2\u00f7\u00f9\t\2\2\2"+
		"\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\66\3\2\2\2\u00fc\u00fe\t\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\7\60\2\2\u0102\u0104\t\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u01068\3\2\2\2"+
		"\u0107\u010b\7$\2\2\u0108\u010a\n\3\2\2\u0109\u0108\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\7$\2\2\u010f:\3\2\2\2\u0110\u0114\t\4\2\2\u0111"+
		"\u0113\t\5\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115<\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118"+
		"\7\60\2\2\u0118>\3\2\2\2\u0119\u011a\7=\2\2\u011a@\3\2\2\2\u011b\u011c"+
		"\7.\2\2\u011cB\3\2\2\2\u011d\u011e\7<\2\2\u011eD\3\2\2\2\u011f\u0120\7"+
		"#\2\2\u0120F\3\2\2\2\u0121\u0122\7#\2\2\u0122\u0123\7?\2\2\u0123H\3\2"+
		"\2\2\u0124\u0125\7?\2\2\u0125J\3\2\2\2\u0126\u0127\7?\2\2\u0127\u0128"+
		"\7?\2\2\u0128L\3\2\2\2\u0129\u012a\7@\2\2\u012a\u012b\7?\2\2\u012bN\3"+
		"\2\2\2\u012c\u012d\7>\2\2\u012d\u012e\7?\2\2\u012eP\3\2\2\2\u012f\u0130"+
		"\7@\2\2\u0130R\3\2\2\2\u0131\u0132\7>\2\2\u0132T\3\2\2\2\u0133\u0134\7"+
		",\2\2\u0134V\3\2\2\2\u0135\u0136\7\61\2\2\u0136X\3\2\2\2\u0137\u0138\7"+
		"\'\2\2\u0138Z\3\2\2\2\u0139\u013a\7-\2\2\u013a\\\3\2\2\2\u013b\u013c\7"+
		"/\2\2\u013c^\3\2\2\2\u013d\u013e\7*\2\2\u013e`\3\2\2\2\u013f\u0140\7+"+
		"\2\2\u0140b\3\2\2\2\u0141\u0142\7}\2\2\u0142d\3\2\2\2\u0143\u0144\7\177"+
		"\2\2\u0144f\3\2\2\2\u0145\u0146\7]\2\2\u0146h\3\2\2\2\u0147\u0148\7_\2"+
		"\2\u0148j\3\2\2\2\u0149\u014a\7~\2\2\u014a\u014b\7~\2\2\u014bl\3\2\2\2"+
		"\u014c\u014d\7(\2\2\u014d\u014e\7(\2\2\u014en\3\2\2\2\u014f\u0150\t\6"+
		"\2\2\u0150\u0154\t\7\2\2\u0151\u0153\t\b\2\2\u0152\u0151\3\2\2\2\u0153"+
		"\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2"+
		"\2\2\u0156\u0154\3\2\2\2\u0157\u0159\t\7\2\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u016a\3\2"+
		"\2\2\u015c\u0160\t\t\2\2\u015d\u015f\t\b\2\2\u015e\u015d\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0163\u0165\t\7\2\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2"+
		"\2\2\u0168\u015c\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\t\6"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b8\2\2\u0170p\3\2\2\2\u0171\u0173"+
		"\t\n\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\b9\2\2\u0177r\3\2\2\2\u0178"+
		"\u0179\7^\2\2\u0179\u017a\t\13\2\2\u017at\3\2\2\2\16\2\u00fa\u00ff\u0105"+
		"\u010b\u0114\u0154\u015a\u0160\u0166\u016a\u0174\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}