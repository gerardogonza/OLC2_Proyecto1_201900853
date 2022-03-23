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
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_listaelseif = 3, 
		RULE_else_if = 4, RULE_tipo = 5, RULE_mut = 6, RULE_vector_st = 7, RULE_array_st = 8, 
		RULE_expression = 9, RULE_expr_arit = 10, RULE_listValues = 11, RULE_primitivo = 12, 
		RULE_listArray = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "instruccion", "listaelseif", "else_if", "tipo", 
			"mut", "vector_st", "array_st", "expression", "expr_arit", "listValues", 
			"primitivo", "listArray"
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
			setState(28);
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
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << P_IF) | (1L << P_WHILE) | (1L << P_LET) | (1L << P_LOOP) | (1L << P_FOR) | (1L << P_BREAK) | (1L << P_CONTINUE) | (1L << ID))) != 0)) {
				{
				{
				setState(31);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(36);
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
		public Vector_stContext isvector;
		public Token NUMBER;
		public ExpressionContext ex1;
		public InstruccionesContext instrucciones;
		public InstruccionesContext i1;
		public InstruccionesContext i2;
		public ListaelseifContext d2;
		public ExpressionContext f2;
		public Token P_BREAK;
		public Token P_CONTINUE;
		public TerminalNode PRINTLN() { return getToken(Chems.PRINTLN, 0); }
		public TerminalNode DIFERENTE() { return getToken(Chems.DIFERENTE, 0); }
		public TerminalNode PARIZQ() { return getToken(Chems.PARIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(Chems.PARDER, 0); }
		public List<TerminalNode> PTCOMA() { return getTokens(Chems.PTCOMA); }
		public TerminalNode PTCOMA(int i) {
			return getToken(Chems.PTCOMA, i);
		}
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
		public Vector_stContext vector_st() {
			return getRuleContext(Vector_stContext.class,0);
		}
		public TerminalNode CORIZQ() { return getToken(Chems.CORIZQ, 0); }
		public TerminalNode NUMBER() { return getToken(Chems.NUMBER, 0); }
		public TerminalNode CORDER() { return getToken(Chems.CORDER, 0); }
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
		public ListaelseifContext listaelseif() {
			return getRuleContext(ListaelseifContext.class,0);
		}
		public TerminalNode P_WHILE() { return getToken(Chems.P_WHILE, 0); }
		public TerminalNode P_LOOP() { return getToken(Chems.P_LOOP, 0); }
		public TerminalNode P_FOR() { return getToken(Chems.P_FOR, 0); }
		public TerminalNode P_IN() { return getToken(Chems.P_IN, 0); }
		public TerminalNode P_BREAK() { return getToken(Chems.P_BREAK, 0); }
		public TerminalNode P_CONTINUE() { return getToken(Chems.P_CONTINUE, 0); }
		public TerminalNode PUNTO() { return getToken(Chems.PUNTO, 0); }
		public TerminalNode P_PUSH() { return getToken(Chems.P_PUSH, 0); }
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(PRINTLN);
				setState(40);
				match(DIFERENTE);
				setState(41);
				match(PARIZQ);
				setState(42);
				((InstruccionContext)_localctx).expression = expression();
				setState(43);
				match(PARDER);
				setState(44);
				match(PTCOMA);
				_localctx.instr = instruction.NewImprimir(((InstruccionContext)_localctx).expression.p,false)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(PRINT);
				setState(48);
				match(DIFERENTE);
				setState(49);
				match(PARIZQ);
				setState(50);
				((InstruccionContext)_localctx).expression = expression();
				setState(51);
				match(PARDER);
				setState(52);
				match(PTCOMA);
				_localctx.instr = instruction.NewImprimir(((InstruccionContext)_localctx).expression.p,true)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(P_LET);
				setState(56);
				((InstruccionContext)_localctx).muteable = mut();
				setState(57);
				((InstruccionContext)_localctx).isArray = array_st();
				setState(58);
				((InstruccionContext)_localctx).id = match(ID);
				setState(59);
				match(DOSPUNTOS);
				setState(60);
				((InstruccionContext)_localctx).isTipo = tipo();
				setState(61);
				match(IGUAL);
				setState(62);
				((InstruccionContext)_localctx).expression = expression();
				setState(63);
				match(PTCOMA);
				_localctx.instr = instruction.NewDeclaration((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).isTipo.p,((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).isArray.arr,((InstruccionContext)_localctx).muteable.arr,(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetLine(),(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetColumn(),0,false)	
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(P_LET);
				setState(67);
				((InstruccionContext)_localctx).muteable = mut();
				setState(68);
				((InstruccionContext)_localctx).isArray = array_st();
				setState(69);
				((InstruccionContext)_localctx).id = match(ID);
				setState(70);
				match(IGUAL);
				setState(71);
				((InstruccionContext)_localctx).expression = expression();
				setState(72);
				match(PTCOMA);
				_localctx.instr = instruction.NewDeclaration((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),interfaces.NULL,((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).isArray.arr,((InstruccionContext)_localctx).muteable.arr,(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetLine(),(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetColumn(),0,false)	
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(P_LET);
				setState(76);
				((InstruccionContext)_localctx).muteable = mut();
				setState(77);
				((InstruccionContext)_localctx).isArray = array_st();
				setState(78);
				((InstruccionContext)_localctx).id = match(ID);
				setState(79);
				match(IGUAL);
				setState(80);
				((InstruccionContext)_localctx).isvector = vector_st();
				setState(81);
				((InstruccionContext)_localctx).expression = expression();
				setState(82);
				match(PTCOMA);
				_localctx.instr = instruction.NewDeclaration((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),interfaces.NULL,((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).isArray.arr,((InstruccionContext)_localctx).muteable.arr,(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetLine(),(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetColumn(),0,((InstruccionContext)_localctx).isvector.arr)	
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(P_LET);
				setState(86);
				((InstruccionContext)_localctx).muteable = mut();
				setState(87);
				((InstruccionContext)_localctx).id = match(ID);
				setState(88);
				match(DOSPUNTOS);
				setState(89);
				match(CORIZQ);
				setState(90);
				((InstruccionContext)_localctx).isTipo = tipo();
				setState(91);
				match(PTCOMA);
				setState(92);
				((InstruccionContext)_localctx).NUMBER = match(NUMBER);
				setState(93);
				match(CORDER);
				setState(94);
				match(IGUAL);
				setState(95);
				((InstruccionContext)_localctx).ex1 = expression();
				setState(96);
				match(PTCOMA);
					
				      num,err := strconv.Atoi((((InstruccionContext)_localctx).NUMBER!=null?((InstruccionContext)_localctx).NUMBER.getText():null))
				                if err!= nil{
				                    fmt.Println(err)
				                }
				     _localctx.instr = instruction.NewDeclaration((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).isTipo.p,((InstruccionContext)_localctx).ex1.p, true,((InstruccionContext)_localctx).muteable.arr,(((InstruccionContext)_localctx).ex1!=null?(((InstruccionContext)_localctx).ex1.start):null).GetLine(),(((InstruccionContext)_localctx).ex1!=null?(((InstruccionContext)_localctx).ex1.start):null).GetColumn(),num,false)	
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				((InstruccionContext)_localctx).id = match(ID);
				setState(100);
				match(IGUAL);
				setState(101);
				((InstruccionContext)_localctx).expression = expression();
				setState(102);
				match(PTCOMA);
				_localctx.instr = instruction.NewAssignment((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).expression.p)
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				match(P_IF);
				setState(106);
				((InstruccionContext)_localctx).expression = expression();
				setState(107);
				match(LLAVEIZQ);
				setState(108);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(109);
				match(LLAVEDER);
				_localctx.instr = instruction.NewIf(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).instrucciones.l,nil,nil)
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(112);
				match(P_IF);
				setState(113);
				((InstruccionContext)_localctx).expression = expression();
				setState(114);
				match(LLAVEIZQ);
				setState(115);
				((InstruccionContext)_localctx).i1 = instrucciones();
				setState(116);
				match(LLAVEDER);
				setState(117);
				match(P_ELSE);
				setState(118);
				match(LLAVEIZQ);
				setState(119);
				((InstruccionContext)_localctx).i2 = instrucciones();
				setState(120);
				match(LLAVEDER);
				_localctx.instr = instruction.NewIf(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).i1.l,nil,((InstruccionContext)_localctx).i2.l)
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(123);
				match(P_IF);
				setState(124);
				((InstruccionContext)_localctx).expression = expression();
				setState(125);
				match(LLAVEIZQ);
				setState(126);
				((InstruccionContext)_localctx).i1 = instrucciones();
				setState(127);
				match(LLAVEDER);
				setState(128);
				((InstruccionContext)_localctx).d2 = listaelseif();
				setState(129);
				match(P_ELSE);
				setState(130);
				match(LLAVEIZQ);
				setState(131);
				((InstruccionContext)_localctx).i2 = instrucciones();
				setState(132);
				match(LLAVEDER);
				_localctx.instr = instruction.NewIf(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).i1.l,((InstruccionContext)_localctx).d2.lista,((InstruccionContext)_localctx).i2.l)
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(135);
				match(P_WHILE);
				setState(136);
				((InstruccionContext)_localctx).expression = expression();
				setState(137);
				match(LLAVEIZQ);
				setState(138);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(139);
				match(LLAVEDER);
				_localctx.instr = instruction.NewWhile(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).instrucciones.l)
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(142);
				match(P_LOOP);
				setState(143);
				match(LLAVEIZQ);
				setState(144);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(145);
				match(LLAVEDER);
				_localctx.instr = instruction.NewLoop(((InstruccionContext)_localctx).instrucciones.l)
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(148);
				match(P_FOR);
				setState(149);
				((InstruccionContext)_localctx).id = match(ID);
				setState(150);
				match(P_IN);
				setState(151);
				((InstruccionContext)_localctx).f2 = expression();
				setState(152);
				match(LLAVEIZQ);
				setState(153);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(154);
				match(LLAVEDER);
				_localctx.instr = instruction.NewForin((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).f2.p,((InstruccionContext)_localctx).instrucciones.l)
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(157);
				((InstruccionContext)_localctx).P_BREAK = match(P_BREAK);
				setState(158);
				match(PTCOMA);
				_localctx.instr = instruction.NewBreak(interfaces.BREAK,(((InstruccionContext)_localctx).P_BREAK!=null?((InstruccionContext)_localctx).P_BREAK.getLine():0),(((InstruccionContext)_localctx).P_BREAK!=null?((InstruccionContext)_localctx).P_BREAK.getCharPositionInLine():0))
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(160);
				((InstruccionContext)_localctx).P_CONTINUE = match(P_CONTINUE);
				setState(161);
				match(PTCOMA);
				_localctx.instr = instruction.NewContinue(interfaces.CONTINUE,(((InstruccionContext)_localctx).P_CONTINUE!=null?((InstruccionContext)_localctx).P_CONTINUE.getLine():0),(((InstruccionContext)_localctx).P_CONTINUE!=null?((InstruccionContext)_localctx).P_CONTINUE.getCharPositionInLine():0))
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(163);
				((InstruccionContext)_localctx).id = match(ID);
				setState(164);
				match(PUNTO);
				setState(165);
				match(P_PUSH);
				setState(166);
				match(PARIZQ);
				setState(167);
				((InstruccionContext)_localctx).expression = expression();
				setState(168);
				match(PARDER);
				setState(169);
				match(PTCOMA);
				_localctx.instr = expresion.NewVectorNative((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),interfaces.PUSH,((InstruccionContext)_localctx).expression.p)
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

	public static class ListaelseifContext extends ParserRuleContext {
		public *arrayList.List lista;
		public Else_ifContext else_if;
		public List<Else_ifContext> list = new ArrayList<Else_ifContext>();
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public ListaelseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaelseif; }
	}

	public final ListaelseifContext listaelseif() throws RecognitionException {
		ListaelseifContext _localctx = new ListaelseifContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listaelseif);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					((ListaelseifContext)_localctx).else_if = else_if();
					((ListaelseifContext)_localctx).list.add(((ListaelseifContext)_localctx).else_if);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}

			      listInt := localctx.(*ListaelseifContext).GetList()
			                                                                            for _, e := range listInt {
			                                                                                _localctx.lista.Add(e.GetInstr())
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

	public static class Else_ifContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public ExpressionContext expression;
		public InstruccionesContext instrucciones;
		public TerminalNode P_ELSE() { return getToken(Chems.P_ELSE, 0); }
		public TerminalNode P_IF() { return getToken(Chems.P_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAVEIZQ() { return getToken(Chems.LLAVEIZQ, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(Chems.LLAVEDER, 0); }
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(P_ELSE);
			setState(183);
			match(P_IF);
			setState(184);
			((Else_ifContext)_localctx).expression = expression();
			setState(185);
			match(LLAVEIZQ);
			setState(186);
			((Else_ifContext)_localctx).instrucciones = instrucciones();
			setState(187);
			match(LLAVEDER);
			_localctx.instr = instruction.NewIf(((Else_ifContext)_localctx).expression.p, ((Else_ifContext)_localctx).instrucciones.l,nil,nil)
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
		public TerminalNode P_STRING2() { return getToken(Chems.P_STRING2, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_F64:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(P_F64);
				_localctx.p=interfaces.FLOAT
				}
				break;
			case P_I64:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(P_I64);
				_localctx.p=interfaces.INTEGER
				}
				break;
			case P_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(P_STRING);
				_localctx.p=interfaces.STRING
				}
				break;
			case P_STRING2:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(P_STRING2);
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
		enterRule(_localctx, 12, RULE_mut);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
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

	public static class Vector_stContext extends ParserRuleContext {
		public bool arr;
		public TerminalNode P_VECTOR() { return getToken(Chems.P_VECTOR, 0); }
		public TerminalNode DIFERENTE() { return getToken(Chems.DIFERENTE, 0); }
		public Vector_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_st; }
	}

	public final Vector_stContext vector_st() throws RecognitionException {
		Vector_stContext _localctx = new Vector_stContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vector_st);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_VECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(P_VECTOR);
				setState(206);
				match(DIFERENTE);
				 _localctx.arr = true 
				}
				break;
			case P_I64:
			case P_F64:
			case P_TRUE:
			case P_FALSE:
			case NUMBER:
			case DECIMAL:
			case STRING:
			case ID:
			case DIFERENTE:
			case SUB:
			case PARIZQ:
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
		enterRule(_localctx, 16, RULE_array_st);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORIZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(CORIZQ);
				setState(212);
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
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		public Expr_aritContext expr_arit;
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
		public TerminalNode PTCOMA() { return getToken(Chems.PTCOMA, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(221);
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
				setState(222);
				match(DOSPUNTOS);
				setState(223);
				match(DOSPUNTOS);
				setState(224);
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
				setState(225);
				match(PARIZQ);
				setState(226);
				((Expr_aritContext)_localctx).opIz = ((Expr_aritContext)_localctx).expr_arit = expr_arit(0);
				setState(227);
				match(COMA);
				setState(228);
				((Expr_aritContext)_localctx).opDe = ((Expr_aritContext)_localctx).expr_arit = expr_arit(0);
				setState(229);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
				}
				break;
			case 2:
				{
				setState(232);
				((Expr_aritContext)_localctx).op = match(DIFERENTE);
				setState(233);
				((Expr_aritContext)_localctx).opDe = ((Expr_aritContext)_localctx).expr_arit = expr_arit(9);
				_localctx.p = expresion.NewOperacion(nil,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opDe!=null?(((Expr_aritContext)_localctx).opDe.start):null).GetLine(),(((Expr_aritContext)_localctx).opDe!=null?(((Expr_aritContext)_localctx).opDe.start):null).GetColumn())
				}
				break;
			case 3:
				{
				setState(236);
				match(CORIZQ);
				setState(237);
				((Expr_aritContext)_localctx).listValues = listValues(0);
				setState(238);
				match(CORDER);
				 _localctx.p = expresion.NewArray(((Expr_aritContext)_localctx).listValues.l,nil) 
				}
				break;
			case 4:
				{
				setState(241);
				match(CORIZQ);
				setState(242);
				((Expr_aritContext)_localctx).listValues = listValues(0);
				setState(243);
				match(PTCOMA);
				setState(244);
				((Expr_aritContext)_localctx).expr_arit = expr_arit(0);
				setState(245);
				match(CORDER);
				 _localctx.p = expresion.NewArray(((Expr_aritContext)_localctx).listValues.l,((Expr_aritContext)_localctx).expr_arit.p) 
				}
				break;
			case 5:
				{
				setState(248);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case 6:
				{
				setState(251);
				match(PARIZQ);
				setState(252);
				((Expr_aritContext)_localctx).expression = expression();
				setState(253);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(258);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(259);
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
						setState(260);
						((Expr_aritContext)_localctx).opDe = ((Expr_aritContext)_localctx).expr_arit = expr_arit(16);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(263);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(264);
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
						setState(265);
						((Expr_aritContext)_localctx).opDe = ((Expr_aritContext)_localctx).expr_arit = expr_arit(15);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(268);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(269);
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
						setState(270);
						((Expr_aritContext)_localctx).opDe = ((Expr_aritContext)_localctx).expr_arit = expr_arit(13);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 4:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(273);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(274);
						((Expr_aritContext)_localctx).op = match(IGUALIGUA);
						setState(275);
						((Expr_aritContext)_localctx).opDe = ((Expr_aritContext)_localctx).expr_arit = expr_arit(12);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 5:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(278);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(279);
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
						setState(280);
						((Expr_aritContext)_localctx).opDe = ((Expr_aritContext)_localctx).expr_arit = expr_arit(11);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					case 6:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(283);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(284);
						match(PUNTO);
						setState(285);
						((Expr_aritContext)_localctx).op = match(P_ABS);
						setState(286);
						match(PARIZQ);
						setState(287);
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
						setState(289);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(290);
						match(PUNTO);
						setState(291);
						((Expr_aritContext)_localctx).op = match(P_SQRT);
						setState(292);
						match(PARIZQ);
						setState(293);
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
						setState(295);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(296);
						match(PUNTO);
						setState(297);
						((Expr_aritContext)_localctx).op = match(P_TOSTRING);
						setState(298);
						match(PARIZQ);
						setState(299);
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
						setState(301);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(302);
						match(PUNTO);
						setState(303);
						((Expr_aritContext)_localctx).op = match(P_CLONE);
						setState(304);
						match(PARIZQ);
						setState(305);
						match(PARDER);
						_localctx.p = expresion.NewNativas(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_listValues, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313);
			((ListValuesContext)_localctx).expression = expression();
			 
			                    _localctx.l = arrayList.New()
			                    _localctx.l.Add(((ListValuesContext)_localctx).expression.p)
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
					setState(316);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(317);
					match(COMA);
					setState(318);
					((ListValuesContext)_localctx).expression = expression();
					 
					                                                  ((ListValuesContext)_localctx).list.l.Add(((ListValuesContext)_localctx).expression.p)
					                                                  _localctx.l = ((ListValuesContext)_localctx).list.l
					                                              
					}
					} 
				}
				setState(325);
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
		enterRule(_localctx, 24, RULE_primitivo);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
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
				setState(328);
				match(SUB);
				setState(329);
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
				setState(331);
				match(SUB);
				setState(332);
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
				setState(334);
				((PrimitivoContext)_localctx).STRING = match(STRING);
				 
				              
				      str:= (((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null)[1:len((((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null))-1]
				     
				      _localctx.p = expresion.NewPrimitivo(str,interfaces.STRING)
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
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
				setState(338);
				((PrimitivoContext)_localctx).DECIMAL = match(DECIMAL);
				setState(339);
				match(P_AS);
				setState(340);
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
				setState(342);
				((PrimitivoContext)_localctx).NUMBER = match(NUMBER);
				setState(343);
				match(P_AS);
				setState(344);
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
				setState(346);
				((PrimitivoContext)_localctx).list = listArray(0);
				 _localctx.p = ((PrimitivoContext)_localctx).list.p
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(349);
				match(P_TRUE);
				      
				      _localctx.p = expresion.NewPrimitivo("true",interfaces.TRUE)
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(351);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(356);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expresion.NewCallVariable((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
					setState(359);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(360);
					match(CORIZQ);
					setState(361);
					((ListArrayContext)_localctx).expression = expression();
					setState(362);
					match(CORDER);
					 _localctx.p = expresion.NewArrayAccess(((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expression.p) 
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		case 10:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		case 11:
			return listValues_sempred((ListValuesContext)_localctx, predIndex);
		case 13:
			return listArray_sempred((ListArrayContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u0175\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00af\n"+
		"\4\3\5\7\5\u00b2\n\5\f\5\16\5\u00b5\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00c9\n\7\3\b\3\b\3\b\5"+
		"\b\u00ce\n\b\3\t\3\t\3\t\3\t\5\t\u00d4\n\t\3\n\3\n\3\n\3\n\5\n\u00da\n"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u0103\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\7\f\u0136\n\f\f\f\16\f\u0139\13\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u0144\n\r\f\r\16\r\u0147\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0164\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0170\n\17\f\17\16"+
		"\17\u0173\13\17\3\17\2\5\26\30\34\20\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\2\b\3\2\r\16\3\2\13\f\3\2\678\3\2:;\5\2\60\60\63\6699\3\2BC\2\u0196"+
		"\2\36\3\2\2\2\4$\3\2\2\2\6\u00ae\3\2\2\2\b\u00b3\3\2\2\2\n\u00b8\3\2\2"+
		"\2\f\u00c8\3\2\2\2\16\u00cd\3\2\2\2\20\u00d3\3\2\2\2\22\u00d9\3\2\2\2"+
		"\24\u00db\3\2\2\2\26\u0102\3\2\2\2\30\u013a\3\2\2\2\32\u0163\3\2\2\2\34"+
		"\u0165\3\2\2\2\36\37\5\4\3\2\37 \b\2\1\2 \3\3\2\2\2!#\5\6\4\2\"!\3\2\2"+
		"\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\b\3\1\2(\5\3"+
		"\2\2\2)*\7\3\2\2*+\7/\2\2+,\7<\2\2,-\5\24\13\2-.\7=\2\2./\7,\2\2/\60\b"+
		"\4\1\2\60\u00af\3\2\2\2\61\62\7\4\2\2\62\63\7/\2\2\63\64\7<\2\2\64\65"+
		"\5\24\13\2\65\66\7=\2\2\66\67\7,\2\2\678\b\4\1\28\u00af\3\2\2\29:\7\17"+
		"\2\2:;\5\16\b\2;<\5\22\n\2<=\7*\2\2=>\7.\2\2>?\5\f\7\2?@\7\61\2\2@A\5"+
		"\24\13\2AB\7,\2\2BC\b\4\1\2C\u00af\3\2\2\2DE\7\17\2\2EF\5\16\b\2FG\5\22"+
		"\n\2GH\7*\2\2HI\7\61\2\2IJ\5\24\13\2JK\7,\2\2KL\b\4\1\2L\u00af\3\2\2\2"+
		"MN\7\17\2\2NO\5\16\b\2OP\5\22\n\2PQ\7*\2\2QR\7\61\2\2RS\5\20\t\2ST\5\24"+
		"\13\2TU\7,\2\2UV\b\4\1\2V\u00af\3\2\2\2WX\7\17\2\2XY\5\16\b\2YZ\7*\2\2"+
		"Z[\7.\2\2[\\\7@\2\2\\]\5\f\7\2]^\7,\2\2^_\7\'\2\2_`\7A\2\2`a\7\61\2\2"+
		"ab\5\24\13\2bc\7,\2\2cd\b\4\1\2d\u00af\3\2\2\2ef\7*\2\2fg\7\61\2\2gh\5"+
		"\24\13\2hi\7,\2\2ij\b\4\1\2j\u00af\3\2\2\2kl\7\b\2\2lm\5\24\13\2mn\7>"+
		"\2\2no\5\4\3\2op\7?\2\2pq\b\4\1\2q\u00af\3\2\2\2rs\7\b\2\2st\5\24\13\2"+
		"tu\7>\2\2uv\5\4\3\2vw\7?\2\2wx\7\t\2\2xy\7>\2\2yz\5\4\3\2z{\7?\2\2{|\b"+
		"\4\1\2|\u00af\3\2\2\2}~\7\b\2\2~\177\5\24\13\2\177\u0080\7>\2\2\u0080"+
		"\u0081\5\4\3\2\u0081\u0082\7?\2\2\u0082\u0083\5\b\5\2\u0083\u0084\7\t"+
		"\2\2\u0084\u0085\7>\2\2\u0085\u0086\5\4\3\2\u0086\u0087\7?\2\2\u0087\u0088"+
		"\b\4\1\2\u0088\u00af\3\2\2\2\u0089\u008a\7\n\2\2\u008a\u008b\5\24\13\2"+
		"\u008b\u008c\7>\2\2\u008c\u008d\5\4\3\2\u008d\u008e\7?\2\2\u008e\u008f"+
		"\b\4\1\2\u008f\u00af\3\2\2\2\u0090\u0091\7\25\2\2\u0091\u0092\7>\2\2\u0092"+
		"\u0093\5\4\3\2\u0093\u0094\7?\2\2\u0094\u0095\b\4\1\2\u0095\u00af\3\2"+
		"\2\2\u0096\u0097\7\32\2\2\u0097\u0098\7*\2\2\u0098\u0099\7\33\2\2\u0099"+
		"\u009a\5\24\13\2\u009a\u009b\7>\2\2\u009b\u009c\5\4\3\2\u009c\u009d\7"+
		"?\2\2\u009d\u009e\b\4\1\2\u009e\u00af\3\2\2\2\u009f\u00a0\7\34\2\2\u00a0"+
		"\u00a1\7,\2\2\u00a1\u00af\b\4\1\2\u00a2\u00a3\7\35\2\2\u00a3\u00a4\7,"+
		"\2\2\u00a4\u00af\b\4\1\2\u00a5\u00a6\7*\2\2\u00a6\u00a7\7+\2\2\u00a7\u00a8"+
		"\7\37\2\2\u00a8\u00a9\7<\2\2\u00a9\u00aa\5\24\13\2\u00aa\u00ab\7=\2\2"+
		"\u00ab\u00ac\7,\2\2\u00ac\u00ad\b\4\1\2\u00ad\u00af\3\2\2\2\u00ae)\3\2"+
		"\2\2\u00ae\61\3\2\2\2\u00ae9\3\2\2\2\u00aeD\3\2\2\2\u00aeM\3\2\2\2\u00ae"+
		"W\3\2\2\2\u00aee\3\2\2\2\u00aek\3\2\2\2\u00aer\3\2\2\2\u00ae}\3\2\2\2"+
		"\u00ae\u0089\3\2\2\2\u00ae\u0090\3\2\2\2\u00ae\u0096\3\2\2\2\u00ae\u009f"+
		"\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00a5\3\2\2\2\u00af\7\3\2\2\2\u00b0"+
		"\u00b2\5\n\6\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00b7\b\5\1\2\u00b7\t\3\2\2\2\u00b8\u00b9\7\t\2\2\u00b9\u00ba\7\b\2\2"+
		"\u00ba\u00bb\5\24\13\2\u00bb\u00bc\7>\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00be"+
		"\7?\2\2\u00be\u00bf\b\6\1\2\u00bf\13\3\2\2\2\u00c0\u00c1\7\16\2\2\u00c1"+
		"\u00c9\b\7\1\2\u00c2\u00c3\7\r\2\2\u00c3\u00c9\b\7\1\2\u00c4\u00c5\7\6"+
		"\2\2\u00c5\u00c9\b\7\1\2\u00c6\u00c7\7\7\2\2\u00c7\u00c9\b\7\1\2\u00c8"+
		"\u00c0\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c9\r\3\2\2\2\u00ca\u00cb\7\20\2\2\u00cb\u00ce\b\b\1\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\17\3\2\2\2\u00cf"+
		"\u00d0\7\36\2\2\u00d0\u00d1\7/\2\2\u00d1\u00d4\b\t\1\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\21\3\2\2\2\u00d5\u00d6"+
		"\7@\2\2\u00d6\u00d7\7A\2\2\u00d7\u00da\b\n\1\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d5\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\23\3\2\2\2\u00db\u00dc\5\26\f"+
		"\2\u00dc\u00dd\b\13\1\2\u00dd\25\3\2\2\2\u00de\u00df\b\f\1\2\u00df\u00e0"+
		"\t\2\2\2\u00e0\u00e1\7.\2\2\u00e1\u00e2\7.\2\2\u00e2\u00e3\t\3\2\2\u00e3"+
		"\u00e4\7<\2\2\u00e4\u00e5\5\26\f\2\u00e5\u00e6\7-\2\2\u00e6\u00e7\5\26"+
		"\f\2\u00e7\u00e8\7=\2\2\u00e8\u00e9\b\f\1\2\u00e9\u0103\3\2\2\2\u00ea"+
		"\u00eb\7/\2\2\u00eb\u00ec\5\26\f\13\u00ec\u00ed\b\f\1\2\u00ed\u0103\3"+
		"\2\2\2\u00ee\u00ef\7@\2\2\u00ef\u00f0\5\30\r\2\u00f0\u00f1\7A\2\2\u00f1"+
		"\u00f2\b\f\1\2\u00f2\u0103\3\2\2\2\u00f3\u00f4\7@\2\2\u00f4\u00f5\5\30"+
		"\r\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\5\26\f\2\u00f7\u00f8\7A\2\2\u00f8"+
		"\u00f9\b\f\1\2\u00f9\u0103\3\2\2\2\u00fa\u00fb\5\32\16\2\u00fb\u00fc\b"+
		"\f\1\2\u00fc\u0103\3\2\2\2\u00fd\u00fe\7<\2\2\u00fe\u00ff\5\24\13\2\u00ff"+
		"\u0100\7=\2\2\u0100\u0101\b\f\1\2\u0101\u0103\3\2\2\2\u0102\u00de\3\2"+
		"\2\2\u0102\u00ea\3\2\2\2\u0102\u00ee\3\2\2\2\u0102\u00f3\3\2\2\2\u0102"+
		"\u00fa\3\2\2\2\u0102\u00fd\3\2\2\2\u0103\u0137\3\2\2\2\u0104\u0105\f\21"+
		"\2\2\u0105\u0106\t\4\2\2\u0106\u0107\5\26\f\22\u0107\u0108\b\f\1\2\u0108"+
		"\u0136\3\2\2\2\u0109\u010a\f\20\2\2\u010a\u010b\t\5\2\2\u010b\u010c\5"+
		"\26\f\21\u010c\u010d\b\f\1\2\u010d\u0136\3\2\2\2\u010e\u010f\f\16\2\2"+
		"\u010f\u0110\t\6\2\2\u0110\u0111\5\26\f\17\u0111\u0112\b\f\1\2\u0112\u0136"+
		"\3\2\2\2\u0113\u0114\f\r\2\2\u0114\u0115\7\62\2\2\u0115\u0116\5\26\f\16"+
		"\u0116\u0117\b\f\1\2\u0117\u0136\3\2\2\2\u0118\u0119\f\f\2\2\u0119\u011a"+
		"\t\7\2\2\u011a\u011b\5\26\f\r\u011b\u011c\b\f\1\2\u011c\u0136\3\2\2\2"+
		"\u011d\u011e\f\n\2\2\u011e\u011f\7+\2\2\u011f\u0120\7\26\2\2\u0120\u0121"+
		"\7<\2\2\u0121\u0122\7=\2\2\u0122\u0136\b\f\1\2\u0123\u0124\f\t\2\2\u0124"+
		"\u0125\7+\2\2\u0125\u0126\7\27\2\2\u0126\u0127\7<\2\2\u0127\u0128\7=\2"+
		"\2\u0128\u0136\b\f\1\2\u0129\u012a\f\b\2\2\u012a\u012b\7+\2\2\u012b\u012c"+
		"\7\30\2\2\u012c\u012d\7<\2\2\u012d\u012e\7=\2\2\u012e\u0136\b\f\1\2\u012f"+
		"\u0130\f\7\2\2\u0130\u0131\7+\2\2\u0131\u0132\7\31\2\2\u0132\u0133\7<"+
		"\2\2\u0133\u0134\7=\2\2\u0134\u0136\b\f\1\2\u0135\u0104\3\2\2\2\u0135"+
		"\u0109\3\2\2\2\u0135\u010e\3\2\2\2\u0135\u0113\3\2\2\2\u0135\u0118\3\2"+
		"\2\2\u0135\u011d\3\2\2\2\u0135\u0123\3\2\2\2\u0135\u0129\3\2\2\2\u0135"+
		"\u012f\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\27\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\b\r\1\2\u013b\u013c"+
		"\5\24\13\2\u013c\u013d\b\r\1\2\u013d\u0145\3\2\2\2\u013e\u013f\f\4\2\2"+
		"\u013f\u0140\7-\2\2\u0140\u0141\5\24\13\2\u0141\u0142\b\r\1\2\u0142\u0144"+
		"\3\2\2\2\u0143\u013e\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\31\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7\'\2"+
		"\2\u0149\u0164\b\16\1\2\u014a\u014b\7;\2\2\u014b\u014c\7\'\2\2\u014c\u0164"+
		"\b\16\1\2\u014d\u014e\7;\2\2\u014e\u014f\7(\2\2\u014f\u0164\b\16\1\2\u0150"+
		"\u0151\7)\2\2\u0151\u0164\b\16\1\2\u0152\u0153\7(\2\2\u0153\u0164\b\16"+
		"\1\2\u0154\u0155\7(\2\2\u0155\u0156\7\21\2\2\u0156\u0157\7\r\2\2\u0157"+
		"\u0164\b\16\1\2\u0158\u0159\7\'\2\2\u0159\u015a\7\21\2\2\u015a\u015b\7"+
		"\16\2\2\u015b\u0164\b\16\1\2\u015c\u015d\5\34\17\2\u015d\u015e\b\16\1"+
		"\2\u015e\u0164\3\2\2\2\u015f\u0160\7\22\2\2\u0160\u0164\b\16\1\2\u0161"+
		"\u0162\7\23\2\2\u0162\u0164\b\16\1\2\u0163\u0148\3\2\2\2\u0163\u014a\3"+
		"\2\2\2\u0163\u014d\3\2\2\2\u0163\u0150\3\2\2\2\u0163\u0152\3\2\2\2\u0163"+
		"\u0154\3\2\2\2\u0163\u0158\3\2\2\2\u0163\u015c\3\2\2\2\u0163\u015f\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0164\33\3\2\2\2\u0165\u0166\b\17\1\2\u0166\u0167"+
		"\7*\2\2\u0167\u0168\b\17\1\2\u0168\u0171\3\2\2\2\u0169\u016a\f\4\2\2\u016a"+
		"\u016b\7@\2\2\u016b\u016c\5\24\13\2\u016c\u016d\7A\2\2\u016d\u016e\b\17"+
		"\1\2\u016e\u0170\3\2\2\2\u016f\u0169\3\2\2\2\u0170\u0173\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\35\3\2\2\2\u0173\u0171\3\2\2"+
		"\2\17$\u00ae\u00b3\u00c8\u00cd\u00d3\u00d9\u0102\u0135\u0137\u0145\u0163"+
		"\u0171";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}