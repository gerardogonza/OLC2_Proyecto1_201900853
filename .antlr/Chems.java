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
		PRINTLN=1, P_NUMBER=2, P_STRING=3, P_IF=4, P_ELSE=5, P_WHILE=6, P_POW=7, 
		P_POWF=8, P_I64=9, P_F64=10, P_LET=11, P_MUT=12, P_AS=13, P_TRUE=14, P_FALSE=15, 
		P_MATCH=16, P_LOOP=17, P_ABS=18, P_SQRT=19, P_TOSTRING=20, P_CLONE=21, 
		P_FOR=22, P_IN=23, NUMBER=24, DECIMAL=25, STRING=26, ID=27, PUNTO=28, 
		PTCOMA=29, COMA=30, DOSPUNTOS=31, DIFERENTE=32, DIFERENTEDE=33, IGUAL=34, 
		IGUALIGUA=35, MAYORIGUAL=36, MENORIGUAL=37, MAYOR=38, MENOR=39, MUL=40, 
		DIV=41, MODULO=42, ADD=43, SUB=44, PARIZQ=45, PARDER=46, LLAVEIZQ=47, 
		LLAVEDER=48, CORIZQ=49, CORDER=50, OR=51, AND=52, MULTICOMENT=53, WHITESPACE=54;
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
			null, "'println'", "'number'", "'string'", "'if'", "'else'", "'while'", 
			"'pow'", "'powf'", "'i64'", "'f64'", "'let'", "'mut'", "'as'", "'true'", 
			"'false'", "'match'", "'loop'", "'abs'", "'sqrt'", "'to_string'", "'clone'", 
			"'for'", "'in'", null, null, null, null, "'.'", "';'", "','", "':'", 
			"'!'", "'!='", "'='", "'=='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", 
			"'%'", "'+'", "'-'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'||'", 
			"'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINTLN", "P_NUMBER", "P_STRING", "P_IF", "P_ELSE", "P_WHILE", 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << P_IF) | (1L << P_WHILE) | (1L << P_LET) | (1L << P_LOOP) | (1L << P_FOR) | (1L << ID))) != 0)) {
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
			setState(107);
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
				_localctx.instr = instruction.NewImprimir(((InstruccionContext)_localctx).expression.p)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(P_LET);
				setState(42);
				((InstruccionContext)_localctx).muteable = mut();
				setState(43);
				((InstruccionContext)_localctx).isArray = array_st();
				setState(44);
				((InstruccionContext)_localctx).id = match(ID);
				setState(45);
				match(DOSPUNTOS);
				setState(46);
				((InstruccionContext)_localctx).isTipo = tipo();
				setState(47);
				match(IGUAL);
				setState(48);
				((InstruccionContext)_localctx).expression = expression();
				setState(49);
				match(PTCOMA);
				_localctx.instr = instruction.NewDeclaration((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).isTipo.p,((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).isArray.arr,((InstruccionContext)_localctx).muteable.arr)	
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(P_LET);
				setState(53);
				((InstruccionContext)_localctx).muteable = mut();
				setState(54);
				((InstruccionContext)_localctx).isArray = array_st();
				setState(55);
				((InstruccionContext)_localctx).id = match(ID);
				setState(56);
				match(IGUAL);
				setState(57);
				((InstruccionContext)_localctx).expression = expression();
				setState(58);
				match(PTCOMA);
				_localctx.instr = instruction.NewDeclaration((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),interfaces.NULL,((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).isArray.arr,((InstruccionContext)_localctx).muteable.arr)	
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				((InstruccionContext)_localctx).id = match(ID);
				setState(62);
				match(IGUAL);
				setState(63);
				((InstruccionContext)_localctx).expression = expression();
				setState(64);
				match(PTCOMA);
				_localctx.instr = instruction.NewAssignment((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).expression.p)
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				match(P_IF);
				setState(68);
				((InstruccionContext)_localctx).expression = expression();
				setState(69);
				match(LLAVEIZQ);
				setState(70);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(71);
				match(LLAVEDER);
				_localctx.instr = instruction.NewIf(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).instrucciones.l,false,nil)
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				match(P_IF);
				setState(75);
				((InstruccionContext)_localctx).expression = expression();
				setState(76);
				match(LLAVEIZQ);
				setState(77);
				((InstruccionContext)_localctx).i1 = instrucciones();
				setState(78);
				match(LLAVEDER);
				setState(79);
				match(P_ELSE);
				setState(80);
				match(LLAVEIZQ);
				setState(81);
				((InstruccionContext)_localctx).i2 = instrucciones();
				setState(82);
				match(LLAVEDER);
				_localctx.instr = instruction.NewIf(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).i1.l,true,((InstruccionContext)_localctx).i2.l)
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				match(P_WHILE);
				setState(86);
				((InstruccionContext)_localctx).expression = expression();
				setState(87);
				match(LLAVEIZQ);
				setState(88);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(89);
				match(LLAVEDER);
				_localctx.instr = instruction.NewWhile(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).instrucciones.l)
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				match(P_LOOP);
				setState(93);
				match(LLAVEIZQ);
				setState(94);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(95);
				match(LLAVEDER);
				_localctx.instr = instruction.NewLoop(((InstruccionContext)_localctx).instrucciones.l)
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				match(P_FOR);
				setState(99);
				((InstruccionContext)_localctx).id = match(ID);
				setState(100);
				match(P_IN);
				setState(101);
				((InstruccionContext)_localctx).f2 = expression();
				setState(102);
				match(LLAVEIZQ);
				setState(103);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(104);
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
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_F64:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(P_F64);
				_localctx.p=interfaces.FLOAT
				}
				break;
			case P_I64:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(P_I64);
				_localctx.p=interfaces.INTEGER
				}
				break;
			case P_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
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
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORIZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(CORIZQ);
				setState(123);
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
			setState(128);
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_I64:
			case P_F64:
				{
				setState(132);
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
				setState(133);
				match(DOSPUNTOS);
				setState(134);
				match(DOSPUNTOS);
				setState(135);
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
				setState(136);
				match(PARIZQ);
				setState(137);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(138);
				match(COMA);
				setState(139);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(140);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false)
				}
				break;
			case DIFERENTE:
				{
				setState(143);
				((Expr_aritContext)_localctx).op = match(DIFERENTE);
				setState(144);
				((Expr_aritContext)_localctx).opDe = expr_arit(8);
				_localctx.p = expresion.NewOperacion(nil,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false)
				}
				break;
			case CORIZQ:
				{
				setState(147);
				match(CORIZQ);
				setState(148);
				((Expr_aritContext)_localctx).listValues = listValues(0);
				setState(149);
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
				setState(152);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case PARIZQ:
				{
				setState(155);
				match(PARIZQ);
				setState(156);
				((Expr_aritContext)_localctx).expression = expression();
				setState(157);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(162);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(163);
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
						setState(164);
						((Expr_aritContext)_localctx).opDe = expr_arit(15);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false)
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(167);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(168);
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
						setState(169);
						((Expr_aritContext)_localctx).opDe = expr_arit(14);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false)
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(172);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(173);
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
						setState(174);
						((Expr_aritContext)_localctx).opDe = expr_arit(12);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false)
						}
						break;
					case 4:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(177);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(178);
						((Expr_aritContext)_localctx).op = match(IGUALIGUA);
						setState(179);
						((Expr_aritContext)_localctx).opDe = expr_arit(11);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false)
						}
						break;
					case 5:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(182);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(183);
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
						setState(184);
						((Expr_aritContext)_localctx).opDe = expr_arit(10);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false)
						}
						break;
					case 6:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(187);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(188);
						match(PUNTO);
						setState(189);
						((Expr_aritContext)_localctx).op = match(P_ABS);
						setState(190);
						match(PARIZQ);
						setState(191);
						match(PARDER);
						_localctx.p = expresion.NewNativas(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null))
						}
						break;
					case 7:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(193);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(194);
						match(PUNTO);
						setState(195);
						((Expr_aritContext)_localctx).op = match(P_SQRT);
						setState(196);
						match(PARIZQ);
						setState(197);
						match(PARDER);
						_localctx.p = expresion.NewNativas(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null))
						}
						break;
					case 8:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(199);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(200);
						match(PUNTO);
						setState(201);
						((Expr_aritContext)_localctx).op = match(P_TOSTRING);
						setState(202);
						match(PARIZQ);
						setState(203);
						match(PARDER);
						_localctx.p = expresion.NewNativas(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null))
						}
						break;
					case 9:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(205);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(206);
						match(PUNTO);
						setState(207);
						((Expr_aritContext)_localctx).op = match(P_CLONE);
						setState(208);
						match(PARIZQ);
						setState(209);
						match(PARDER);
						_localctx.p = expresion.NewNativas(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null))
						}
						break;
					}
					} 
				}
				setState(215);
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
			setState(217);
			((ListValuesContext)_localctx).expression = expression();
			 
			                    _localctx.l = arrayList.New()
			                    _localctx.l.Add(((ListValuesContext)_localctx).expression.p)
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
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
					setState(220);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(221);
					match(COMA);
					setState(222);
					((ListValuesContext)_localctx).expression = expression();
					 
					                                                  ((ListValuesContext)_localctx).list.l.Add(((ListValuesContext)_localctx).expression.p)
					                                                  _localctx.l = ((ListValuesContext)_localctx).list.l
					                                              
					}
					} 
				}
				setState(229);
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
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
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
				setState(232);
				match(SUB);
				setState(233);
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
				setState(235);
				match(SUB);
				setState(236);
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
				setState(238);
				((PrimitivoContext)_localctx).STRING = match(STRING);
				 
				              
				      str:= (((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null)[1:len((((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null))-1]
				     
				      _localctx.p = expresion.NewPrimitivo(str,interfaces.STRING)
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
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
				setState(242);
				((PrimitivoContext)_localctx).DECIMAL = match(DECIMAL);
				setState(243);
				match(P_AS);
				setState(244);
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
				setState(246);
				((PrimitivoContext)_localctx).NUMBER = match(NUMBER);
				setState(247);
				match(P_AS);
				setState(248);
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
				setState(250);
				((PrimitivoContext)_localctx).list = listArray(0);
				 _localctx.p = ((PrimitivoContext)_localctx).list.p
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(253);
				match(P_TRUE);
				      
				      _localctx.p = expresion.NewPrimitivo("true",interfaces.TRUE)
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(255);
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
			setState(260);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expresion.NewCallVariable((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
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
					setState(263);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(264);
					match(CORIZQ);
					setState(265);
					((ListArrayContext)_localctx).expression = expression();
					setState(266);
					match(CORDER);
					 _localctx.p = expresion.NewArrayAccess(((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expression.p) 
					}
					} 
				}
				setState(273);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5v\n\5\3\6\3\6\3\6\5\6{\n"+
		"\6\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00a3\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u00d6\n\t\f\t\16\t\u00d9\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u00e4\n\n\f\n\16\n\u00e7\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0104\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0110\n\f\f\f\16\f\u0113\13\f"+
		"\3\f\2\5\20\22\26\r\2\4\6\b\n\f\16\20\22\24\26\2\b\3\2\13\f\3\2\t\n\3"+
		"\2*+\3\2-.\5\2##&),,\3\2\65\66\2\u012e\2\30\3\2\2\2\4\36\3\2\2\2\6m\3"+
		"\2\2\2\bu\3\2\2\2\nz\3\2\2\2\f\u0080\3\2\2\2\16\u0082\3\2\2\2\20\u00a2"+
		"\3\2\2\2\22\u00da\3\2\2\2\24\u0103\3\2\2\2\26\u0105\3\2\2\2\30\31\5\4"+
		"\3\2\31\32\b\2\1\2\32\3\3\2\2\2\33\35\5\6\4\2\34\33\3\2\2\2\35 \3\2\2"+
		"\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\b\3\1\2\"\5"+
		"\3\2\2\2#$\7\3\2\2$%\7\"\2\2%&\7/\2\2&\'\5\16\b\2\'(\7\60\2\2()\7\37\2"+
		"\2)*\b\4\1\2*n\3\2\2\2+,\7\r\2\2,-\5\n\6\2-.\5\f\7\2./\7\35\2\2/\60\7"+
		"!\2\2\60\61\5\b\5\2\61\62\7$\2\2\62\63\5\16\b\2\63\64\7\37\2\2\64\65\b"+
		"\4\1\2\65n\3\2\2\2\66\67\7\r\2\2\678\5\n\6\289\5\f\7\29:\7\35\2\2:;\7"+
		"$\2\2;<\5\16\b\2<=\7\37\2\2=>\b\4\1\2>n\3\2\2\2?@\7\35\2\2@A\7$\2\2AB"+
		"\5\16\b\2BC\7\37\2\2CD\b\4\1\2Dn\3\2\2\2EF\7\6\2\2FG\5\16\b\2GH\7\61\2"+
		"\2HI\5\4\3\2IJ\7\62\2\2JK\b\4\1\2Kn\3\2\2\2LM\7\6\2\2MN\5\16\b\2NO\7\61"+
		"\2\2OP\5\4\3\2PQ\7\62\2\2QR\7\7\2\2RS\7\61\2\2ST\5\4\3\2TU\7\62\2\2UV"+
		"\b\4\1\2Vn\3\2\2\2WX\7\b\2\2XY\5\16\b\2YZ\7\61\2\2Z[\5\4\3\2[\\\7\62\2"+
		"\2\\]\b\4\1\2]n\3\2\2\2^_\7\23\2\2_`\7\61\2\2`a\5\4\3\2ab\7\62\2\2bc\b"+
		"\4\1\2cn\3\2\2\2de\7\30\2\2ef\7\35\2\2fg\7\31\2\2gh\5\16\b\2hi\7\61\2"+
		"\2ij\5\4\3\2jk\7\62\2\2kl\b\4\1\2ln\3\2\2\2m#\3\2\2\2m+\3\2\2\2m\66\3"+
		"\2\2\2m?\3\2\2\2mE\3\2\2\2mL\3\2\2\2mW\3\2\2\2m^\3\2\2\2md\3\2\2\2n\7"+
		"\3\2\2\2op\7\f\2\2pv\b\5\1\2qr\7\13\2\2rv\b\5\1\2st\7\5\2\2tv\b\5\1\2"+
		"uo\3\2\2\2uq\3\2\2\2us\3\2\2\2v\t\3\2\2\2wx\7\16\2\2x{\b\6\1\2y{\3\2\2"+
		"\2zw\3\2\2\2zy\3\2\2\2{\13\3\2\2\2|}\7\63\2\2}~\7\64\2\2~\u0081\b\7\1"+
		"\2\177\u0081\3\2\2\2\u0080|\3\2\2\2\u0080\177\3\2\2\2\u0081\r\3\2\2\2"+
		"\u0082\u0083\5\20\t\2\u0083\u0084\b\b\1\2\u0084\17\3\2\2\2\u0085\u0086"+
		"\b\t\1\2\u0086\u0087\t\2\2\2\u0087\u0088\7!\2\2\u0088\u0089\7!\2\2\u0089"+
		"\u008a\t\3\2\2\u008a\u008b\7/\2\2\u008b\u008c\5\20\t\2\u008c\u008d\7 "+
		"\2\2\u008d\u008e\5\20\t\2\u008e\u008f\7\60\2\2\u008f\u0090\b\t\1\2\u0090"+
		"\u00a3\3\2\2\2\u0091\u0092\7\"\2\2\u0092\u0093\5\20\t\n\u0093\u0094\b"+
		"\t\1\2\u0094\u00a3\3\2\2\2\u0095\u0096\7\63\2\2\u0096\u0097\5\22\n\2\u0097"+
		"\u0098\7\64\2\2\u0098\u0099\b\t\1\2\u0099\u00a3\3\2\2\2\u009a\u009b\5"+
		"\24\13\2\u009b\u009c\b\t\1\2\u009c\u00a3\3\2\2\2\u009d\u009e\7/\2\2\u009e"+
		"\u009f\5\16\b\2\u009f\u00a0\7\60\2\2\u00a0\u00a1\b\t\1\2\u00a1\u00a3\3"+
		"\2\2\2\u00a2\u0085\3\2\2\2\u00a2\u0091\3\2\2\2\u00a2\u0095\3\2\2\2\u00a2"+
		"\u009a\3\2\2\2\u00a2\u009d\3\2\2\2\u00a3\u00d7\3\2\2\2\u00a4\u00a5\f\20"+
		"\2\2\u00a5\u00a6\t\4\2\2\u00a6\u00a7\5\20\t\21\u00a7\u00a8\b\t\1\2\u00a8"+
		"\u00d6\3\2\2\2\u00a9\u00aa\f\17\2\2\u00aa\u00ab\t\5\2\2\u00ab\u00ac\5"+
		"\20\t\20\u00ac\u00ad\b\t\1\2\u00ad\u00d6\3\2\2\2\u00ae\u00af\f\r\2\2\u00af"+
		"\u00b0\t\6\2\2\u00b0\u00b1\5\20\t\16\u00b1\u00b2\b\t\1\2\u00b2\u00d6\3"+
		"\2\2\2\u00b3\u00b4\f\f\2\2\u00b4\u00b5\7%\2\2\u00b5\u00b6\5\20\t\r\u00b6"+
		"\u00b7\b\t\1\2\u00b7\u00d6\3\2\2\2\u00b8\u00b9\f\13\2\2\u00b9\u00ba\t"+
		"\7\2\2\u00ba\u00bb\5\20\t\f\u00bb\u00bc\b\t\1\2\u00bc\u00d6\3\2\2\2\u00bd"+
		"\u00be\f\t\2\2\u00be\u00bf\7\36\2\2\u00bf\u00c0\7\24\2\2\u00c0\u00c1\7"+
		"/\2\2\u00c1\u00c2\7\60\2\2\u00c2\u00d6\b\t\1\2\u00c3\u00c4\f\b\2\2\u00c4"+
		"\u00c5\7\36\2\2\u00c5\u00c6\7\25\2\2\u00c6\u00c7\7/\2\2\u00c7\u00c8\7"+
		"\60\2\2\u00c8\u00d6\b\t\1\2\u00c9\u00ca\f\7\2\2\u00ca\u00cb\7\36\2\2\u00cb"+
		"\u00cc\7\26\2\2\u00cc\u00cd\7/\2\2\u00cd\u00ce\7\60\2\2\u00ce\u00d6\b"+
		"\t\1\2\u00cf\u00d0\f\6\2\2\u00d0\u00d1\7\36\2\2\u00d1\u00d2\7\27\2\2\u00d2"+
		"\u00d3\7/\2\2\u00d3\u00d4\7\60\2\2\u00d4\u00d6\b\t\1\2\u00d5\u00a4\3\2"+
		"\2\2\u00d5\u00a9\3\2\2\2\u00d5\u00ae\3\2\2\2\u00d5\u00b3\3\2\2\2\u00d5"+
		"\u00b8\3\2\2\2\u00d5\u00bd\3\2\2\2\u00d5\u00c3\3\2\2\2\u00d5\u00c9\3\2"+
		"\2\2\u00d5\u00cf\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\21\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\b\n\1"+
		"\2\u00db\u00dc\5\16\b\2\u00dc\u00dd\b\n\1\2\u00dd\u00e5\3\2\2\2\u00de"+
		"\u00df\f\4\2\2\u00df\u00e0\7 \2\2\u00e0\u00e1\5\16\b\2\u00e1\u00e2\b\n"+
		"\1\2\u00e2\u00e4\3\2\2\2\u00e3\u00de\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\23\3\2\2\2\u00e7\u00e5\3\2\2"+
		"\2\u00e8\u00e9\7\32\2\2\u00e9\u0104\b\13\1\2\u00ea\u00eb\7.\2\2\u00eb"+
		"\u00ec\7\32\2\2\u00ec\u0104\b\13\1\2\u00ed\u00ee\7.\2\2\u00ee\u00ef\7"+
		"\33\2\2\u00ef\u0104\b\13\1\2\u00f0\u00f1\7\34\2\2\u00f1\u0104\b\13\1\2"+
		"\u00f2\u00f3\7\33\2\2\u00f3\u0104\b\13\1\2\u00f4\u00f5\7\33\2\2\u00f5"+
		"\u00f6\7\17\2\2\u00f6\u00f7\7\13\2\2\u00f7\u0104\b\13\1\2\u00f8\u00f9"+
		"\7\32\2\2\u00f9\u00fa\7\17\2\2\u00fa\u00fb\7\f\2\2\u00fb\u0104\b\13\1"+
		"\2\u00fc\u00fd\5\26\f\2\u00fd\u00fe\b\13\1\2\u00fe\u0104\3\2\2\2\u00ff"+
		"\u0100\7\20\2\2\u0100\u0104\b\13\1\2\u0101\u0102\7\21\2\2\u0102\u0104"+
		"\b\13\1\2\u0103\u00e8\3\2\2\2\u0103\u00ea\3\2\2\2\u0103\u00ed\3\2\2\2"+
		"\u0103\u00f0\3\2\2\2\u0103\u00f2\3\2\2\2\u0103\u00f4\3\2\2\2\u0103\u00f8"+
		"\3\2\2\2\u0103\u00fc\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\25\3\2\2\2\u0105\u0106\b\f\1\2\u0106\u0107\7\35\2\2\u0107\u0108\b\f\1"+
		"\2\u0108\u0111\3\2\2\2\u0109\u010a\f\4\2\2\u010a\u010b\7\63\2\2\u010b"+
		"\u010c\5\16\b\2\u010c\u010d\7\64\2\2\u010d\u010e\b\f\1\2\u010e\u0110\3"+
		"\2\2\2\u010f\u0109\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\27\3\2\2\2\u0113\u0111\3\2\2\2\r\36muz\u0080\u00a2"+
		"\u00d5\u00d7\u00e5\u0103\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}