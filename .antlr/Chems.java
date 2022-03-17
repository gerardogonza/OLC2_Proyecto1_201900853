// Generated from d:\Archivos Varios\2022\Primer Semestre\Compi2\Laboratorio\Proyecto 1\OLC2_Proyecto1_201900853\Chems.g4 by ANTLR 4.8

    import "proyecto1/interfaces"
    import "proyecto1/expresion"
    import "proyecto1/instruction"
    import arrayList "github.com/colegno/arraylist"


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Chems extends Parser {
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
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_tipo = 3, 
		RULE_mut = 4, RULE_array_st = 5, RULE_expression = 6, RULE_expr_arit = 7, 
		RULE_listValues = 8, RULE_primitivo = 9, RULE_listArray = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "instruccion", "tipo", "mut", "array_st", "expression", 
			"expr_arit", "listValues", "primitivo", "listArray"
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

	@Override
	public String getGrammarFileName() { return "Chems.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Chems(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public *arrayList.List lista;
		public InstruccionesContext instrucciones;
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((StartContext)_localctx).instrucciones = instrucciones();
			_localctx.lista = ((StartContext)_localctx).instrucciones.l
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

	public static class InstruccionesContext extends ParserRuleContext {
		public *arrayList.List l;
		public InstruccionContext instruccion;
		public List<InstruccionContext> e = new ArrayList<InstruccionContext>();
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);

		    _localctx.l =  arrayList.New()
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << P_IF) | (1L << P_WHILE) | (1L << P_LET) | (1L << P_LOOP) | (1L << P_FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(25);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			      listInt := localctx.(*InstruccionesContext).GetE()
			      		for _, e := range listInt {
			            _localctx.l.Add(e.GetInstr())
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

	public static class InstruccionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public ExpressionContext expression;
		public MutContext muteable;
		public Array_stContext isArray;
		public Token id;
		public TipoContext isTipo;
		public InstruccionesContext instrucciones;
		public InstruccionesContext i1;
		public InstruccionesContext i2;
		public ExpressionContext f2;
		public TerminalNode PRINTLN() { return getToken(Chems.PRINTLN, 0); }
		public TerminalNode DIFERENTE() { return getToken(Chems.DIFERENTE, 0); }
		public TerminalNode PARIZQ() { return getToken(Chems.PARIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(Chems.PARDER, 0); }
		public TerminalNode PTCOMA() { return getToken(Chems.PTCOMA, 0); }
		public TerminalNode PRINT() { return getToken(Chems.PRINT, 0); }
		public TerminalNode P_LET() { return getToken(Chems.P_LET, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(Chems.DOSPUNTOS, 0); }
		public TerminalNode IGUAL() { return getToken(Chems.IGUAL, 0); }
		public MutContext mut() {
			return getRuleContext(MutContext.class,0);
		}
		public Array_stContext array_st() {
			return getRuleContext(Array_stContext.class,0);
		}
		public TerminalNode ID() { return getToken(Chems.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode P_IF() { return getToken(Chems.P_IF, 0); }
		public List<TerminalNode> LLAVEIZQ() { return getTokens(Chems.LLAVEIZQ); }
		public TerminalNode LLAVEIZQ(int i) {
			return getToken(Chems.LLAVEIZQ, i);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public List<TerminalNode> LLAVEDER() { return getTokens(Chems.LLAVEDER); }
		public TerminalNode LLAVEDER(int i) {
			return getToken(Chems.LLAVEDER, i);
		}
		public TerminalNode P_ELSE() { return getToken(Chems.P_ELSE, 0); }
		public TerminalNode P_WHILE() { return getToken(Chems.P_WHILE, 0); }
		public TerminalNode P_LOOP() { return getToken(Chems.P_LOOP, 0); }
		public TerminalNode P_FOR() { return getToken(Chems.P_FOR, 0); }
		public TerminalNode P_IN() { return getToken(Chems.P_IN, 0); }
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(PRINTLN);
				setState(34);
				match(DIFERENTE);
				setState(35);
				match(PARIZQ);
				setState(36);
				((InstruccionContext)_localctx).expression = expression();
				setState(37);
				match(PARDER);
				setState(38);
				match(PTCOMA);
				_localctx.instr = instruction.NewImprimir(((InstruccionContext)_localctx).expression.p,false)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(PRINT);
				setState(42);
				match(DIFERENTE);
				setState(43);
				match(PARIZQ);
				setState(44);
				((InstruccionContext)_localctx).expression = expression();
				setState(45);
				match(PARDER);
				setState(46);
				match(PTCOMA);
				_localctx.instr = instruction.NewImprimir(((InstruccionContext)_localctx).expression.p,true)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(P_LET);
				setState(50);
				((InstruccionContext)_localctx).muteable = mut();
				setState(51);
				((InstruccionContext)_localctx).isArray = array_st();
				setState(52);
				((InstruccionContext)_localctx).id = match(ID);
				setState(53);
				match(DOSPUNTOS);
				setState(54);
				((InstruccionContext)_localctx).isTipo = tipo();
				setState(55);
				match(IGUAL);
				setState(56);
				((InstruccionContext)_localctx).expression = expression();
				setState(57);
				match(PTCOMA);
				_localctx.instr = instruction.NewDeclaration((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).isTipo.p,((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).isArray.arr,((InstruccionContext)_localctx).muteable.arr,(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetLine(),(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetColumn())	
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				match(P_LET);
				setState(61);
				((InstruccionContext)_localctx).muteable = mut();
				setState(62);
				((InstruccionContext)_localctx).isArray = array_st();
				setState(63);
				((InstruccionContext)_localctx).id = match(ID);
				setState(64);
				match(IGUAL);
				setState(65);
				((InstruccionContext)_localctx).expression = expression();
				setState(66);
				match(PTCOMA);
				_localctx.instr = instruction.NewDeclaration((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),interfaces.NULL,((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).isArray.arr,((InstruccionContext)_localctx).muteable.arr,(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetLine(),(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetColumn())	
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				((InstruccionContext)_localctx).id = match(ID);
				setState(70);
				match(IGUAL);
				setState(71);
				((InstruccionContext)_localctx).expression = expression();
				setState(72);
				match(PTCOMA);
				_localctx.instr = instruction.NewAssignment((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).expression.p)
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				match(P_IF);
				setState(76);
				((InstruccionContext)_localctx).expression = expression();
				setState(77);
				match(LLAVEIZQ);
				setState(78);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(79);
				match(LLAVEDER);
				_localctx.instr = instruction.NewIf(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).instrucciones.l,false,nil)
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				match(P_IF);
				setState(83);
				((InstruccionContext)_localctx).expression = expression();
				setState(84);
				match(LLAVEIZQ);
				setState(85);
				((InstruccionContext)_localctx).i1 = instrucciones();
				setState(86);
				match(LLAVEDER);
				setState(87);
				match(P_ELSE);
				setState(88);
				match(LLAVEIZQ);
				setState(89);
				((InstruccionContext)_localctx).i2 = instrucciones();
				setState(90);
				match(LLAVEDER);
				_localctx.instr = instruction.NewIf(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).i1.l,true,((InstruccionContext)_localctx).i2.l)
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				match(P_WHILE);
				setState(94);
				((InstruccionContext)_localctx).expression = expression();
				setState(95);
				match(LLAVEIZQ);
				setState(96);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(97);
				match(LLAVEDER);
				_localctx.instr = instruction.NewWhile(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).instrucciones.l)
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				match(P_LOOP);
				setState(101);
				match(LLAVEIZQ);
				setState(102);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(103);
				match(LLAVEDER);
				_localctx.instr = instruction.NewLoop(((InstruccionContext)_localctx).instrucciones.l)
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				match(P_FOR);
				setState(107);
				((InstruccionContext)_localctx).id = match(ID);
				setState(108);
				match(P_IN);
				setState(109);
				((InstruccionContext)_localctx).f2 = expression();
				setState(110);
				match(LLAVEIZQ);
				setState(111);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(112);
				match(LLAVEDER);
				_localctx.instr = instruction.NewForin((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).f2.p,((InstruccionContext)_localctx).instrucciones.l)
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

	public static class TipoContext extends ParserRuleContext {
		public interfaces.TipoExpresion p;
		public TerminalNode P_F64() { return getToken(Chems.P_F64, 0); }
		public TerminalNode P_I64() { return getToken(Chems.P_I64, 0); }
		public TerminalNode P_STRING() { return getToken(Chems.P_STRING, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_F64:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(P_F64);
				_localctx.p=interfaces.FLOAT
				}
				break;
			case P_I64:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(P_I64);
				_localctx.p=interfaces.INTEGER
				}
				break;
			case P_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(P_STRING);
				_localctx.p=interfaces.STRING
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

	public static class MutContext extends ParserRuleContext {
		public bool arr;
		public TerminalNode P_MUT() { return getToken(Chems.P_MUT, 0); }
		public MutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mut; }
	}

	public final MutContext mut() throws RecognitionException {
		MutContext _localctx = new MutContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mut);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(P_MUT);
				 _localctx.arr = true 
				}
				break;
			case ID:
			case CORIZQ:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Array_stContext extends ParserRuleContext {
		public bool arr;
		public TerminalNode CORIZQ() { return getToken(Chems.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(Chems.CORDER, 0); }
		public Array_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_st; }
	}

	public final Array_stContext array_st() throws RecognitionException {
		Array_stContext _localctx = new Array_stContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_st);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORIZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(CORIZQ);
				setState(131);
				match(CORDER);
				 _localctx.arr = true 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Expr_aritContext expr_arit;
		public Expr_aritContext expr_arit() {
			return getRuleContext(Expr_aritContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((ExpressionContext)_localctx).expr_arit = expr_arit(0);
			_localctx.p = ((ExpressionContext)_localctx).expr_arit.p
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

	public static class Expr_aritContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Expr_aritContext opIz;
		public Token reservada;
		public Token op;
		public Expr_aritContext opDe;
		public ListValuesContext listValues;
		public PrimitivoContext primitivo;
		public ExpressionContext expression;
		public List<TerminalNode> DOSPUNTOS() { return getTokens(Chems.DOSPUNTOS); }
		public TerminalNode DOSPUNTOS(int i) {
			return getToken(Chems.DOSPUNTOS, i);
		}
		public TerminalNode PARIZQ() { return getToken(Chems.PARIZQ, 0); }
		public TerminalNode COMA() { return getToken(Chems.COMA, 0); }
		public TerminalNode PARDER() { return getToken(Chems.PARDER, 0); }
		public List<Expr_aritContext> expr_arit() {
			return getRuleContexts(Expr_aritContext.class);
		}
		public Expr_aritContext expr_arit(int i) {
			return getRuleContext(Expr_aritContext.class,i);
		}
		public TerminalNode P_F64() { return getToken(Chems.P_F64, 0); }
		public TerminalNode P_I64() { return getToken(Chems.P_I64, 0); }
		public TerminalNode P_POW() { return getToken(Chems.P_POW, 0); }
		public TerminalNode P_POWF() { return getToken(Chems.P_POWF, 0); }
		public TerminalNode DIFERENTE() { return getToken(Chems.DIFERENTE, 0); }
		public TerminalNode CORIZQ() { return getToken(Chems.CORIZQ, 0); }
		public ListValuesContext listValues() {
			return getRuleContext(ListValuesContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(Chems.CORDER, 0); }
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(Chems.MUL, 0); }
		public TerminalNode DIV() { return getToken(Chems.DIV, 0); }
		public TerminalNode ADD() { return getToken(Chems.ADD, 0); }
		public TerminalNode SUB() { return getToken(Chems.SUB, 0); }
		public TerminalNode MENOR() { return getToken(Chems.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(Chems.MENORIGUAL, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Chems.MAYORIGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(Chems.MAYOR, 0); }
		public TerminalNode MODULO() { return getToken(Chems.MODULO, 0); }
		public TerminalNode DIFERENTEDE() { return getToken(Chems.DIFERENTEDE, 0); }
		public TerminalNode IGUALIGUA() { return getToken(Chems.IGUALIGUA, 0); }
		public TerminalNode OR() { return getToken(Chems.OR, 0); }
		public TerminalNode AND() { return getToken(Chems.AND, 0); }
		public TerminalNode PUNTO() { return getToken(Chems.PUNTO, 0); }
		public TerminalNode P_ABS() { return getToken(Chems.P_ABS, 0); }
		public TerminalNode P_SQRT() { return getToken(Chems.P_SQRT, 0); }
		public TerminalNode P_TOSTRING() { return getToken(Chems.P_TOSTRING, 0); }
		public TerminalNode P_CLONE() { return getToken(Chems.P_CLONE, 0); }
		public Expr_aritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_arit; }
	}

	public final Expr_aritContext expr_arit() throws RecognitionException {
		return expr_arit(0);
	}

	private Expr_aritContext expr_arit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_aritContext _localctx = new Expr_aritContext(_ctx, _parentState);
		Expr_aritContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_I64:
			case P_F64:
				{
				setState(140);
				((Expr_aritContext)_localctx).reservada = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==P_I64 || _la==P_F64) ) {
					((Expr_aritContext)_localctx).reservada = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(141);
				match(DOSPUNTOS);
				setState(142);
				match(DOSPUNTOS);
				setState(143);
				((Expr_aritContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==P_POW || _la==P_POWF) ) {
					((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(144);
				match(PARIZQ);
				setState(145);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(146);
				match(COMA);
				setState(147);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(148);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
				}
				break;
			case DIFERENTE:
				{
				setState(151);
				((Expr_aritContext)_localctx).op = match(DIFERENTE);
				setState(152);
				((Expr_aritContext)_localctx).opDe = expr_arit(8);
				_localctx.p = expresion.NewOperacion(nil,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opDe!=null?(((Expr_aritContext)_localctx).opDe.start):null).GetLine(),(((Expr_aritContext)_localctx).opDe!=null?(((Expr_aritContext)_localctx).opDe.start):null).GetColumn())
				}
				break;
			case CORIZQ:
				{
				setState(155);
				match(CORIZQ);
				setState(156);
				((Expr_aritContext)_localctx).listValues = listValues(0);
				setState(157);
				match(CORDER);
				 _localctx.p = expresion.NewArray(((Expr_aritContext)_localctx).listValues.l) 
				}
				break;
			case P_TRUE:
			case P_FALSE:
			case NUMBER:
			case DECIMAL:
			case STRING:
			case ID:
			case SUB:
				{
				setState(160);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case PARIZQ:
				{
				setState(163);
				match(PARIZQ);
				setState(164);
				((Expr_aritContext)_localctx).expression = expression();
				setState(165);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(219);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(170);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(171);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						((Expr_aritContext)_localctx).opDe = expr_arit(15);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(175);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(176);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(177);
						((Expr_aritContext)_localctx).opDe = expr_arit(14);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(180);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(181);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIFERENTEDE) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << MAYOR) | (1L << MENOR) | (1L << MODULO))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						((Expr_aritContext)_localctx).opDe = expr_arit(12);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 4:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(185);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(186);
						((Expr_aritContext)_localctx).op = match(IGUALIGUA);
						setState(187);
						((Expr_aritContext)_localctx).opDe = expr_arit(11);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 5:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(190);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(191);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						((Expr_aritContext)_localctx).opDe = expr_arit(10);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 6:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(195);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(196);
						match(PUNTO);
						setState(197);
						((Expr_aritContext)_localctx).op = match(P_ABS);
						setState(198);
						match(PARIZQ);
						setState(199);
						match(PARDER);
						_localctx.p = expresion.NewNativas(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 7:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(201);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(202);
						match(PUNTO);
						setState(203);
						((Expr_aritContext)_localctx).op = match(P_SQRT);
						setState(204);
						match(PARIZQ);
						setState(205);
						match(PARDER);
						_localctx.p = expresion.NewNativas(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 8:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(207);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(208);
						match(PUNTO);
						setState(209);
						((Expr_aritContext)_localctx).op = match(P_TOSTRING);
						setState(210);
						match(PARIZQ);
						setState(211);
						match(PARDER);
						_localctx.p = expresion.NewNativas(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 9:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(213);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(214);
						match(PUNTO);
						setState(215);
						((Expr_aritContext)_localctx).op = match(P_CLONE);
						setState(216);
						match(PARIZQ);
						setState(217);
						match(PARDER);
						_localctx.p = expresion.NewNativas(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListValuesContext extends ParserRuleContext {
		public *arrayList.List l;
		public ListValuesContext list;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Chems.COMA, 0); }
		public ListValuesContext listValues() {
			return getRuleContext(ListValuesContext.class,0);
		}
		public ListValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValues; }
	}

	public final ListValuesContext listValues() throws RecognitionException {
		return listValues(0);
	}

	private ListValuesContext listValues(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListValuesContext _localctx = new ListValuesContext(_ctx, _parentState);
		ListValuesContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_listValues, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(225);
			((ListValuesContext)_localctx).expression = expression();
			 
			                    _localctx.l = arrayList.New()
			                    _localctx.l.Add(((ListValuesContext)_localctx).expression.p)
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListValuesContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listValues);
					setState(228);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(229);
					match(COMA);
					setState(230);
					((ListValuesContext)_localctx).expression = expression();
					 
					                                                  ((ListValuesContext)_localctx).list.l.Add(((ListValuesContext)_localctx).expression.p)
					                                                  _localctx.l = ((ListValuesContext)_localctx).list.l
					                                              
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimitivoContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token NUMBER;
		public Token DECIMAL;
		public Token STRING;
		public ListArrayContext list;
		public TerminalNode NUMBER() { return getToken(Chems.NUMBER, 0); }
		public TerminalNode SUB() { return getToken(Chems.SUB, 0); }
		public TerminalNode DECIMAL() { return getToken(Chems.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(Chems.STRING, 0); }
		public TerminalNode P_AS() { return getToken(Chems.P_AS, 0); }
		public TerminalNode P_I64() { return getToken(Chems.P_I64, 0); }
		public TerminalNode P_F64() { return getToken(Chems.P_F64, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public TerminalNode P_TRUE() { return getToken(Chems.P_TRUE, 0); }
		public TerminalNode P_FALSE() { return getToken(Chems.P_FALSE, 0); }
		public PrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivo; }
	}

	public final PrimitivoContext primitivo() throws RecognitionException {
		PrimitivoContext _localctx = new PrimitivoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_primitivo);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				((PrimitivoContext)_localctx).NUMBER = match(NUMBER);

				            	num,err := strconv.Atoi((((PrimitivoContext)_localctx).NUMBER!=null?((PrimitivoContext)_localctx).NUMBER.getText():null))
				                if err!= nil{
				                    fmt.Println(err)
				                }
				                
				            _localctx.p = expresion.NewPrimitivo (num,interfaces.INTEGER)
				       
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(SUB);
				setState(241);
				((PrimitivoContext)_localctx).NUMBER = match(NUMBER);

				            	num,err := strconv.Atoi((((PrimitivoContext)_localctx).NUMBER!=null?((PrimitivoContext)_localctx).NUMBER.getText():null))
				                if err!= nil{
				                    fmt.Println(err)
				                }
				                
				            _localctx.p = expresion.NewPrimitivo (-num,interfaces.INTEGER)
				       
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(SUB);
				setState(244);
				((PrimitivoContext)_localctx).DECIMAL = match(DECIMAL);

				            	num,err := strconv.ParseFloat((((PrimitivoContext)_localctx).DECIMAL!=null?((PrimitivoContext)_localctx).DECIMAL.getText():null),64)
				                if err!= nil{
				                    fmt.Println(err)
				                }
				                 a := float64(num) 
				            _localctx.p = expresion.NewPrimitivo (-a,interfaces.FLOAT)
				       
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				((PrimitivoContext)_localctx).STRING = match(STRING);
				 
				              
				      str:= (((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null)[1:len((((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null))-1]
				     
				      _localctx.p = expresion.NewPrimitivo(str,interfaces.STRING)
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				((PrimitivoContext)_localctx).DECIMAL = match(DECIMAL);

				            	num,err := strconv.ParseFloat((((PrimitivoContext)_localctx).DECIMAL!=null?((PrimitivoContext)_localctx).DECIMAL.getText():null),64)
				                if err!= nil{
				                    fmt.Println(err)
				                }
				                 a := float64(num) 
				            _localctx.p = expresion.NewPrimitivo (a,interfaces.FLOAT)
				       
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250);
				((PrimitivoContext)_localctx).DECIMAL = match(DECIMAL);
				setState(251);
				match(P_AS);
				setState(252);
				match(P_I64);

				            	num,err := strconv.ParseFloat((((PrimitivoContext)_localctx).DECIMAL!=null?((PrimitivoContext)_localctx).DECIMAL.getText():null),64)
				                if err!= nil{
				                    fmt.Println(err)
				                }
				            a := int(num)
				            _localctx.p = expresion.NewPrimitivo (a,interfaces.INTEGER)
				       
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				((PrimitivoContext)_localctx).NUMBER = match(NUMBER);
				setState(255);
				match(P_AS);
				setState(256);
				match(P_F64);

				           num,err := strconv.Atoi((((PrimitivoContext)_localctx).NUMBER!=null?((PrimitivoContext)_localctx).NUMBER.getText():null))
				                if err!= nil{
				                    fmt.Println(err)
				                }
				            a := float64(num)  
				            _localctx.p = expresion.NewPrimitivo (a,interfaces.FLOAT)
				       
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(258);
				((PrimitivoContext)_localctx).list = listArray(0);
				 _localctx.p = ((PrimitivoContext)_localctx).list.p
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(261);
				match(P_TRUE);
				      
				      _localctx.p = expresion.NewPrimitivo("true",interfaces.TRUE)
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(263);
				match(P_FALSE);
				      
				      _localctx.p = expresion.NewPrimitivo("false",interfaces.FALSE)
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

	public static class ListArrayContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public ListArrayContext list;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(Chems.ID, 0); }
		public TerminalNode CORIZQ() { return getToken(Chems.CORIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(Chems.CORDER, 0); }
		public ListArrayContext listArray() {
			return getRuleContext(ListArrayContext.class,0);
		}
		public ListArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listArray; }
	}

	public final ListArrayContext listArray() throws RecognitionException {
		return listArray(0);
	}

	private ListArrayContext listArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListArrayContext _localctx = new ListArrayContext(_ctx, _parentState);
		ListArrayContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(268);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expresion.NewCallVariable((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListArrayContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listArray);
					setState(271);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(272);
					match(CORIZQ);
					setState(273);
					((ListArrayContext)_localctx).expression = expression();
					setState(274);
					match(CORDER);
					 _localctx.p = expresion.NewArrayAccess(((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expression.p) 
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		case 8:
			return listValues_sempred((ListValuesContext)_localctx, predIndex);
		case 10:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean listValues_sempred(ListValuesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listArray_sempred(ListArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u011d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4v\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5~\n\5\3\6\3\6\3\6\5\6\u0083\n\6\3\7\3\7\3\7\3\7\5\7\u0089\n\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ab\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00de\n"+
		"\t\f\t\16\t\u00e1\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ec\n"+
		"\n\f\n\16\n\u00ef\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u010c\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u0118\n\f\f\f\16\f\u011b\13\f\3\f\2\5\20\22\26\r\2\4\6\b\n\f"+
		"\16\20\22\24\26\2\b\3\2\f\r\3\2\n\13\3\2+,\3\2./\5\2$$\'*--\3\2\66\67"+
		"\2\u0137\2\30\3\2\2\2\4\36\3\2\2\2\6u\3\2\2\2\b}\3\2\2\2\n\u0082\3\2\2"+
		"\2\f\u0088\3\2\2\2\16\u008a\3\2\2\2\20\u00aa\3\2\2\2\22\u00e2\3\2\2\2"+
		"\24\u010b\3\2\2\2\26\u010d\3\2\2\2\30\31\5\4\3\2\31\32\b\2\1\2\32\3\3"+
		"\2\2\2\33\35\5\6\4\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2"+
		"\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\b\3\1\2\"\5\3\2\2\2#$\7\3\2\2$%\7#\2\2"+
		"%&\7\60\2\2&\'\5\16\b\2\'(\7\61\2\2()\7 \2\2)*\b\4\1\2*v\3\2\2\2+,\7\4"+
		"\2\2,-\7#\2\2-.\7\60\2\2./\5\16\b\2/\60\7\61\2\2\60\61\7 \2\2\61\62\b"+
		"\4\1\2\62v\3\2\2\2\63\64\7\16\2\2\64\65\5\n\6\2\65\66\5\f\7\2\66\67\7"+
		"\36\2\2\678\7\"\2\289\5\b\5\29:\7%\2\2:;\5\16\b\2;<\7 \2\2<=\b\4\1\2="+
		"v\3\2\2\2>?\7\16\2\2?@\5\n\6\2@A\5\f\7\2AB\7\36\2\2BC\7%\2\2CD\5\16\b"+
		"\2DE\7 \2\2EF\b\4\1\2Fv\3\2\2\2GH\7\36\2\2HI\7%\2\2IJ\5\16\b\2JK\7 \2"+
		"\2KL\b\4\1\2Lv\3\2\2\2MN\7\7\2\2NO\5\16\b\2OP\7\62\2\2PQ\5\4\3\2QR\7\63"+
		"\2\2RS\b\4\1\2Sv\3\2\2\2TU\7\7\2\2UV\5\16\b\2VW\7\62\2\2WX\5\4\3\2XY\7"+
		"\63\2\2YZ\7\b\2\2Z[\7\62\2\2[\\\5\4\3\2\\]\7\63\2\2]^\b\4\1\2^v\3\2\2"+
		"\2_`\7\t\2\2`a\5\16\b\2ab\7\62\2\2bc\5\4\3\2cd\7\63\2\2de\b\4\1\2ev\3"+
		"\2\2\2fg\7\24\2\2gh\7\62\2\2hi\5\4\3\2ij\7\63\2\2jk\b\4\1\2kv\3\2\2\2"+
		"lm\7\31\2\2mn\7\36\2\2no\7\32\2\2op\5\16\b\2pq\7\62\2\2qr\5\4\3\2rs\7"+
		"\63\2\2st\b\4\1\2tv\3\2\2\2u#\3\2\2\2u+\3\2\2\2u\63\3\2\2\2u>\3\2\2\2"+
		"uG\3\2\2\2uM\3\2\2\2uT\3\2\2\2u_\3\2\2\2uf\3\2\2\2ul\3\2\2\2v\7\3\2\2"+
		"\2wx\7\r\2\2x~\b\5\1\2yz\7\f\2\2z~\b\5\1\2{|\7\6\2\2|~\b\5\1\2}w\3\2\2"+
		"\2}y\3\2\2\2}{\3\2\2\2~\t\3\2\2\2\177\u0080\7\17\2\2\u0080\u0083\b\6\1"+
		"\2\u0081\u0083\3\2\2\2\u0082\177\3\2\2\2\u0082\u0081\3\2\2\2\u0083\13"+
		"\3\2\2\2\u0084\u0085\7\64\2\2\u0085\u0086\7\65\2\2\u0086\u0089\b\7\1\2"+
		"\u0087\u0089\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0087\3\2\2\2\u0089\r\3"+
		"\2\2\2\u008a\u008b\5\20\t\2\u008b\u008c\b\b\1\2\u008c\17\3\2\2\2\u008d"+
		"\u008e\b\t\1\2\u008e\u008f\t\2\2\2\u008f\u0090\7\"\2\2\u0090\u0091\7\""+
		"\2\2\u0091\u0092\t\3\2\2\u0092\u0093\7\60\2\2\u0093\u0094\5\20\t\2\u0094"+
		"\u0095\7!\2\2\u0095\u0096\5\20\t\2\u0096\u0097\7\61\2\2\u0097\u0098\b"+
		"\t\1\2\u0098\u00ab\3\2\2\2\u0099\u009a\7#\2\2\u009a\u009b\5\20\t\n\u009b"+
		"\u009c\b\t\1\2\u009c\u00ab\3\2\2\2\u009d\u009e\7\64\2\2\u009e\u009f\5"+
		"\22\n\2\u009f\u00a0\7\65\2\2\u00a0\u00a1\b\t\1\2\u00a1\u00ab\3\2\2\2\u00a2"+
		"\u00a3\5\24\13\2\u00a3\u00a4\b\t\1\2\u00a4\u00ab\3\2\2\2\u00a5\u00a6\7"+
		"\60\2\2\u00a6\u00a7\5\16\b\2\u00a7\u00a8\7\61\2\2\u00a8\u00a9\b\t\1\2"+
		"\u00a9\u00ab\3\2\2\2\u00aa\u008d\3\2\2\2\u00aa\u0099\3\2\2\2\u00aa\u009d"+
		"\3\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a5\3\2\2\2\u00ab\u00df\3\2\2\2\u00ac"+
		"\u00ad\f\20\2\2\u00ad\u00ae\t\4\2\2\u00ae\u00af\5\20\t\21\u00af\u00b0"+
		"\b\t\1\2\u00b0\u00de\3\2\2\2\u00b1\u00b2\f\17\2\2\u00b2\u00b3\t\5\2\2"+
		"\u00b3\u00b4\5\20\t\20\u00b4\u00b5\b\t\1\2\u00b5\u00de\3\2\2\2\u00b6\u00b7"+
		"\f\r\2\2\u00b7\u00b8\t\6\2\2\u00b8\u00b9\5\20\t\16\u00b9\u00ba\b\t\1\2"+
		"\u00ba\u00de\3\2\2\2\u00bb\u00bc\f\f\2\2\u00bc\u00bd\7&\2\2\u00bd\u00be"+
		"\5\20\t\r\u00be\u00bf\b\t\1\2\u00bf\u00de\3\2\2\2\u00c0\u00c1\f\13\2\2"+
		"\u00c1\u00c2\t\7\2\2\u00c2\u00c3\5\20\t\f\u00c3\u00c4\b\t\1\2\u00c4\u00de"+
		"\3\2\2\2\u00c5\u00c6\f\t\2\2\u00c6\u00c7\7\37\2\2\u00c7\u00c8\7\25\2\2"+
		"\u00c8\u00c9\7\60\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00de\b\t\1\2\u00cb\u00cc"+
		"\f\b\2\2\u00cc\u00cd\7\37\2\2\u00cd\u00ce\7\26\2\2\u00ce\u00cf\7\60\2"+
		"\2\u00cf\u00d0\7\61\2\2\u00d0\u00de\b\t\1\2\u00d1\u00d2\f\7\2\2\u00d2"+
		"\u00d3\7\37\2\2\u00d3\u00d4\7\27\2\2\u00d4\u00d5\7\60\2\2\u00d5\u00d6"+
		"\7\61\2\2\u00d6\u00de\b\t\1\2\u00d7\u00d8\f\6\2\2\u00d8\u00d9\7\37\2\2"+
		"\u00d9\u00da\7\30\2\2\u00da\u00db\7\60\2\2\u00db\u00dc\7\61\2\2\u00dc"+
		"\u00de\b\t\1\2\u00dd\u00ac\3\2\2\2\u00dd\u00b1\3\2\2\2\u00dd\u00b6\3\2"+
		"\2\2\u00dd\u00bb\3\2\2\2\u00dd\u00c0\3\2\2\2\u00dd\u00c5\3\2\2\2\u00dd"+
		"\u00cb\3\2\2\2\u00dd\u00d1\3\2\2\2\u00dd\u00d7\3\2\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\21\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00e3\b\n\1\2\u00e3\u00e4\5\16\b\2\u00e4\u00e5\b\n\1\2"+
		"\u00e5\u00ed\3\2\2\2\u00e6\u00e7\f\4\2\2\u00e7\u00e8\7!\2\2\u00e8\u00e9"+
		"\5\16\b\2\u00e9\u00ea\b\n\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00e6\3\2\2\2"+
		"\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\23"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\33\2\2\u00f1\u010c\b\13\1\2"+
		"\u00f2\u00f3\7/\2\2\u00f3\u00f4\7\33\2\2\u00f4\u010c\b\13\1\2\u00f5\u00f6"+
		"\7/\2\2\u00f6\u00f7\7\34\2\2\u00f7\u010c\b\13\1\2\u00f8\u00f9\7\35\2\2"+
		"\u00f9\u010c\b\13\1\2\u00fa\u00fb\7\34\2\2\u00fb\u010c\b\13\1\2\u00fc"+
		"\u00fd\7\34\2\2\u00fd\u00fe\7\20\2\2\u00fe\u00ff\7\f\2\2\u00ff\u010c\b"+
		"\13\1\2\u0100\u0101\7\33\2\2\u0101\u0102\7\20\2\2\u0102\u0103\7\r\2\2"+
		"\u0103\u010c\b\13\1\2\u0104\u0105\5\26\f\2\u0105\u0106\b\13\1\2\u0106"+
		"\u010c\3\2\2\2\u0107\u0108\7\21\2\2\u0108\u010c\b\13\1\2\u0109\u010a\7"+
		"\22\2\2\u010a\u010c\b\13\1\2\u010b\u00f0\3\2\2\2\u010b\u00f2\3\2\2\2\u010b"+
		"\u00f5\3\2\2\2\u010b\u00f8\3\2\2\2\u010b\u00fa\3\2\2\2\u010b\u00fc\3\2"+
		"\2\2\u010b\u0100\3\2\2\2\u010b\u0104\3\2\2\2\u010b\u0107\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\25\3\2\2\2\u010d\u010e\b\f\1\2\u010e\u010f\7\36\2"+
		"\2\u010f\u0110\b\f\1\2\u0110\u0119\3\2\2\2\u0111\u0112\f\4\2\2\u0112\u0113"+
		"\7\64\2\2\u0113\u0114\5\16\b\2\u0114\u0115\7\65\2\2\u0115\u0116\b\f\1"+
		"\2\u0116\u0118\3\2\2\2\u0117\u0111\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\27\3\2\2\2\u011b\u0119\3\2\2\2\r\36"+
		"u}\u0082\u0088\u00aa\u00dd\u00df\u00ed\u010b\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}