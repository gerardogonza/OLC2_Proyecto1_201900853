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
		P_CLONE=22, P_FOR=23, P_IN=24, P_BREAK=25, NUMBER=26, DECIMAL=27, STRING=28, 
		ID=29, PUNTO=30, PTCOMA=31, COMA=32, DOSPUNTOS=33, DIFERENTE=34, DIFERENTEDE=35, 
		IGUAL=36, IGUALIGUA=37, MAYORIGUAL=38, MENORIGUAL=39, MAYOR=40, MENOR=41, 
		MUL=42, DIV=43, MODULO=44, ADD=45, SUB=46, PARIZQ=47, PARDER=48, LLAVEIZQ=49, 
		LLAVEDER=50, CORIZQ=51, CORDER=52, OR=53, AND=54, MULTICOMENT=55, WHITESPACE=56;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_listaelseif = 3, 
		RULE_else_if = 4, RULE_tipo = 5, RULE_mut = 6, RULE_array_st = 7, RULE_expression = 8, 
		RULE_expr_arit = 9, RULE_listValues = 10, RULE_primitivo = 11, RULE_listArray = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "instruccion", "listaelseif", "else_if", "tipo", 
			"mut", "array_st", "expression", "expr_arit", "listValues", "primitivo", 
			"listArray"
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
			setState(26);
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
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << PRINT) | (1L << P_IF) | (1L << P_WHILE) | (1L << P_LET) | (1L << P_LOOP) | (1L << P_FOR) | (1L << P_BREAK) | (1L << ID))) != 0)) {
				{
				{
				setState(29);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(34);
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
		public ListaelseifContext d2;
		public ExpressionContext f2;
		public Token P_BREAK;
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
		public ListaelseifContext listaelseif() {
			return getRuleContext(ListaelseifContext.class,0);
		}
		public TerminalNode P_WHILE() { return getToken(Chems.P_WHILE, 0); }
		public TerminalNode P_LOOP() { return getToken(Chems.P_LOOP, 0); }
		public TerminalNode P_FOR() { return getToken(Chems.P_FOR, 0); }
		public TerminalNode P_IN() { return getToken(Chems.P_IN, 0); }
		public TerminalNode P_BREAK() { return getToken(Chems.P_BREAK, 0); }
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(PRINTLN);
				setState(38);
				match(DIFERENTE);
				setState(39);
				match(PARIZQ);
				setState(40);
				((InstruccionContext)_localctx).expression = expression();
				setState(41);
				match(PARDER);
				setState(42);
				match(PTCOMA);
				_localctx.instr = instruction.NewImprimir(((InstruccionContext)_localctx).expression.p,false)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(PRINT);
				setState(46);
				match(DIFERENTE);
				setState(47);
				match(PARIZQ);
				setState(48);
				((InstruccionContext)_localctx).expression = expression();
				setState(49);
				match(PARDER);
				setState(50);
				match(PTCOMA);
				_localctx.instr = instruction.NewImprimir(((InstruccionContext)_localctx).expression.p,true)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(P_LET);
				setState(54);
				((InstruccionContext)_localctx).muteable = mut();
				setState(55);
				((InstruccionContext)_localctx).isArray = array_st();
				setState(56);
				((InstruccionContext)_localctx).id = match(ID);
				setState(57);
				match(DOSPUNTOS);
				setState(58);
				((InstruccionContext)_localctx).isTipo = tipo();
				setState(59);
				match(IGUAL);
				setState(60);
				((InstruccionContext)_localctx).expression = expression();
				setState(61);
				match(PTCOMA);
				_localctx.instr = instruction.NewDeclaration((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).isTipo.p,((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).isArray.arr,((InstruccionContext)_localctx).muteable.arr,(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetLine(),(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetColumn())	
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(P_LET);
				setState(65);
				((InstruccionContext)_localctx).muteable = mut();
				setState(66);
				((InstruccionContext)_localctx).isArray = array_st();
				setState(67);
				((InstruccionContext)_localctx).id = match(ID);
				setState(68);
				match(IGUAL);
				setState(69);
				((InstruccionContext)_localctx).expression = expression();
				setState(70);
				match(PTCOMA);
				_localctx.instr = instruction.NewDeclaration((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),interfaces.NULL,((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).isArray.arr,((InstruccionContext)_localctx).muteable.arr,(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetLine(),(((InstruccionContext)_localctx).expression!=null?(((InstruccionContext)_localctx).expression.start):null).GetColumn())	
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				((InstruccionContext)_localctx).id = match(ID);
				setState(74);
				match(IGUAL);
				setState(75);
				((InstruccionContext)_localctx).expression = expression();
				setState(76);
				match(PTCOMA);
				_localctx.instr = instruction.NewAssignment((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).expression.p)
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(79);
				match(P_IF);
				setState(80);
				((InstruccionContext)_localctx).expression = expression();
				setState(81);
				match(LLAVEIZQ);
				setState(82);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(83);
				match(LLAVEDER);
				_localctx.instr = instruction.NewIf(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).instrucciones.l,nil,nil)
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				match(P_IF);
				setState(87);
				((InstruccionContext)_localctx).expression = expression();
				setState(88);
				match(LLAVEIZQ);
				setState(89);
				((InstruccionContext)_localctx).i1 = instrucciones();
				setState(90);
				match(LLAVEDER);
				setState(91);
				match(P_ELSE);
				setState(92);
				match(LLAVEIZQ);
				setState(93);
				((InstruccionContext)_localctx).i2 = instrucciones();
				setState(94);
				match(LLAVEDER);
				_localctx.instr = instruction.NewIf(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).i1.l,nil,((InstruccionContext)_localctx).i2.l)
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				match(P_IF);
				setState(98);
				((InstruccionContext)_localctx).expression = expression();
				setState(99);
				match(LLAVEIZQ);
				setState(100);
				((InstruccionContext)_localctx).i1 = instrucciones();
				setState(101);
				match(LLAVEDER);
				setState(102);
				((InstruccionContext)_localctx).d2 = listaelseif();
				setState(103);
				match(P_ELSE);
				setState(104);
				match(LLAVEIZQ);
				setState(105);
				((InstruccionContext)_localctx).i2 = instrucciones();
				setState(106);
				match(LLAVEDER);
				_localctx.instr = instruction.NewIf(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).i1.l,((InstruccionContext)_localctx).d2.lista,((InstruccionContext)_localctx).i2.l)
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				match(P_WHILE);
				setState(110);
				((InstruccionContext)_localctx).expression = expression();
				setState(111);
				match(LLAVEIZQ);
				setState(112);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(113);
				match(LLAVEDER);
				_localctx.instr = instruction.NewWhile(((InstruccionContext)_localctx).expression.p, ((InstruccionContext)_localctx).instrucciones.l)
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(116);
				match(P_LOOP);
				setState(117);
				match(LLAVEIZQ);
				setState(118);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(119);
				match(LLAVEDER);
				_localctx.instr = instruction.NewLoop(((InstruccionContext)_localctx).instrucciones.l)
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(122);
				match(P_FOR);
				setState(123);
				((InstruccionContext)_localctx).id = match(ID);
				setState(124);
				match(P_IN);
				setState(125);
				((InstruccionContext)_localctx).f2 = expression();
				setState(126);
				match(LLAVEIZQ);
				setState(127);
				((InstruccionContext)_localctx).instrucciones = instrucciones();
				setState(128);
				match(LLAVEDER);
				_localctx.instr = instruction.NewForin((((InstruccionContext)_localctx).id!=null?((InstruccionContext)_localctx).id.getText():null),((InstruccionContext)_localctx).f2.p,((InstruccionContext)_localctx).instrucciones.l)
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(131);
				((InstruccionContext)_localctx).P_BREAK = match(P_BREAK);
				setState(132);
				match(PTCOMA);
				_localctx.instr = instruction.NewBreak(interfaces.BREAK,(((InstruccionContext)_localctx).P_BREAK!=null?((InstruccionContext)_localctx).P_BREAK.getLine():0),(((InstruccionContext)_localctx).P_BREAK!=null?((InstruccionContext)_localctx).P_BREAK.getCharPositionInLine():0))
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
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					((ListaelseifContext)_localctx).else_if = else_if();
					((ListaelseifContext)_localctx).list.add(((ListaelseifContext)_localctx).else_if);
					}
					} 
				}
				setState(141);
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
			setState(144);
			match(P_ELSE);
			setState(145);
			match(P_IF);
			setState(146);
			((Else_ifContext)_localctx).expression = expression();
			setState(147);
			match(LLAVEIZQ);
			setState(148);
			((Else_ifContext)_localctx).instrucciones = instrucciones();
			setState(149);
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
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_F64:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(P_F64);
				_localctx.p=interfaces.FLOAT
				}
				break;
			case P_I64:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(P_I64);
				_localctx.p=interfaces.INTEGER
				}
				break;
			case P_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
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
		enterRule(_localctx, 12, RULE_mut);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
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
		enterRule(_localctx, 14, RULE_array_st);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CORIZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(CORIZQ);
				setState(166);
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
		enterRule(_localctx, 16, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_I64:
			case P_F64:
				{
				setState(175);
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
				setState(176);
				match(DOSPUNTOS);
				setState(177);
				match(DOSPUNTOS);
				setState(178);
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
				setState(179);
				match(PARIZQ);
				setState(180);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(181);
				match(COMA);
				setState(182);
				((Expr_aritContext)_localctx).opDe = expr_arit(0);
				setState(183);
				match(PARDER);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
				}
				break;
			case DIFERENTE:
				{
				setState(186);
				((Expr_aritContext)_localctx).op = match(DIFERENTE);
				setState(187);
				((Expr_aritContext)_localctx).opDe = expr_arit(8);
				_localctx.p = expresion.NewOperacion(nil,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false,(((Expr_aritContext)_localctx).opDe!=null?(((Expr_aritContext)_localctx).opDe.start):null).GetLine(),(((Expr_aritContext)_localctx).opDe!=null?(((Expr_aritContext)_localctx).opDe.start):null).GetColumn())
				}
				break;
			case CORIZQ:
				{
				setState(190);
				match(CORIZQ);
				setState(191);
				((Expr_aritContext)_localctx).listValues = listValues(0);
				setState(192);
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
				setState(195);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case PARIZQ:
				{
				setState(198);
				match(PARIZQ);
				setState(199);
				((Expr_aritContext)_localctx).expression = expression();
				setState(200);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(205);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(206);
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
						setState(207);
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
						setState(210);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(211);
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
						setState(212);
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
						setState(215);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(216);
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
						setState(217);
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
						setState(220);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(221);
						((Expr_aritContext)_localctx).op = match(IGUALIGUA);
						setState(222);
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
						setState(225);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(226);
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
						setState(227);
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
						setState(230);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(231);
						match(PUNTO);
						setState(232);
						((Expr_aritContext)_localctx).op = match(P_ABS);
						setState(233);
						match(PARIZQ);
						setState(234);
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
						setState(236);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(237);
						match(PUNTO);
						setState(238);
						((Expr_aritContext)_localctx).op = match(P_SQRT);
						setState(239);
						match(PARIZQ);
						setState(240);
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
						setState(242);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(243);
						match(PUNTO);
						setState(244);
						((Expr_aritContext)_localctx).op = match(P_TOSTRING);
						setState(245);
						match(PARIZQ);
						setState(246);
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
						setState(248);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(249);
						match(PUNTO);
						setState(250);
						((Expr_aritContext)_localctx).op = match(P_CLONE);
						setState(251);
						match(PARIZQ);
						setState(252);
						match(PARDER);
						_localctx.p = expresion.NewNativas(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(),(((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn())
						}
						break;
					}
					} 
				}
				setState(258);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_listValues, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(260);
			((ListValuesContext)_localctx).expression = expression();
			 
			                    _localctx.l = arrayList.New()
			                    _localctx.l.Add(((ListValuesContext)_localctx).expression.p)
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
					setState(263);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(264);
					match(COMA);
					setState(265);
					((ListValuesContext)_localctx).expression = expression();
					 
					                                                  ((ListValuesContext)_localctx).list.l.Add(((ListValuesContext)_localctx).expression.p)
					                                                  _localctx.l = ((ListValuesContext)_localctx).list.l
					                                              
					}
					} 
				}
				setState(272);
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
		enterRule(_localctx, 22, RULE_primitivo);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
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
				setState(275);
				match(SUB);
				setState(276);
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
				setState(278);
				match(SUB);
				setState(279);
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
				setState(281);
				((PrimitivoContext)_localctx).STRING = match(STRING);
				 
				              
				      str:= (((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null)[1:len((((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null))-1]
				     
				      _localctx.p = expresion.NewPrimitivo(str,interfaces.STRING)
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
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
				setState(285);
				((PrimitivoContext)_localctx).DECIMAL = match(DECIMAL);
				setState(286);
				match(P_AS);
				setState(287);
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
				setState(289);
				((PrimitivoContext)_localctx).NUMBER = match(NUMBER);
				setState(290);
				match(P_AS);
				setState(291);
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
				setState(293);
				((PrimitivoContext)_localctx).list = listArray(0);
				 _localctx.p = ((PrimitivoContext)_localctx).list.p
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(296);
				match(P_TRUE);
				      
				      _localctx.p = expresion.NewPrimitivo("true",interfaces.TRUE)
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(298);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_listArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(303);
			((ListArrayContext)_localctx).ID = match(ID);
			 _localctx.p = expresion.NewCallVariable((((ListArrayContext)_localctx).ID!=null?((ListArrayContext)_localctx).ID.getText():null))
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
					setState(306);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(307);
					match(CORIZQ);
					setState(308);
					((ListArrayContext)_localctx).expression = expression();
					setState(309);
					match(CORDER);
					 _localctx.p = expresion.NewArrayAccess(((ListArrayContext)_localctx).list.p, ((ListArrayContext)_localctx).expression.p) 
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		case 9:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		case 10:
			return listValues_sempred((ListValuesContext)_localctx, predIndex);
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\7\3!\n\3\f\3\16\3$\13\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0089\n\4\3\5\7\5\u008c"+
		"\n\5\f\5\16\5\u008f\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00a1\n\7\3\b\3\b\3\b\5\b\u00a6\n\b\3\t\3\t\3\t"+
		"\3\t\5\t\u00ac\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ce\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0101\n\13\f\13\16\13\u0104\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u010f\n\f\f\f\16\f\u0112\13\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u012f\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u013b\n\16\f\16\16\16\u013e\13\16\3\16\2\5\24\26"+
		"\32\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\b\3\2\f\r\3\2\n\13\3\2,-\3\2"+
		"/\60\5\2%%(+..\3\2\678\2\u015b\2\34\3\2\2\2\4\"\3\2\2\2\6\u0088\3\2\2"+
		"\2\b\u008d\3\2\2\2\n\u0092\3\2\2\2\f\u00a0\3\2\2\2\16\u00a5\3\2\2\2\20"+
		"\u00ab\3\2\2\2\22\u00ad\3\2\2\2\24\u00cd\3\2\2\2\26\u0105\3\2\2\2\30\u012e"+
		"\3\2\2\2\32\u0130\3\2\2\2\34\35\5\4\3\2\35\36\b\2\1\2\36\3\3\2\2\2\37"+
		"!\5\6\4\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2"+
		"\2\2%&\b\3\1\2&\5\3\2\2\2\'(\7\3\2\2()\7$\2\2)*\7\61\2\2*+\5\22\n\2+,"+
		"\7\62\2\2,-\7!\2\2-.\b\4\1\2.\u0089\3\2\2\2/\60\7\4\2\2\60\61\7$\2\2\61"+
		"\62\7\61\2\2\62\63\5\22\n\2\63\64\7\62\2\2\64\65\7!\2\2\65\66\b\4\1\2"+
		"\66\u0089\3\2\2\2\678\7\16\2\289\5\16\b\29:\5\20\t\2:;\7\37\2\2;<\7#\2"+
		"\2<=\5\f\7\2=>\7&\2\2>?\5\22\n\2?@\7!\2\2@A\b\4\1\2A\u0089\3\2\2\2BC\7"+
		"\16\2\2CD\5\16\b\2DE\5\20\t\2EF\7\37\2\2FG\7&\2\2GH\5\22\n\2HI\7!\2\2"+
		"IJ\b\4\1\2J\u0089\3\2\2\2KL\7\37\2\2LM\7&\2\2MN\5\22\n\2NO\7!\2\2OP\b"+
		"\4\1\2P\u0089\3\2\2\2QR\7\7\2\2RS\5\22\n\2ST\7\63\2\2TU\5\4\3\2UV\7\64"+
		"\2\2VW\b\4\1\2W\u0089\3\2\2\2XY\7\7\2\2YZ\5\22\n\2Z[\7\63\2\2[\\\5\4\3"+
		"\2\\]\7\64\2\2]^\7\b\2\2^_\7\63\2\2_`\5\4\3\2`a\7\64\2\2ab\b\4\1\2b\u0089"+
		"\3\2\2\2cd\7\7\2\2de\5\22\n\2ef\7\63\2\2fg\5\4\3\2gh\7\64\2\2hi\5\b\5"+
		"\2ij\7\b\2\2jk\7\63\2\2kl\5\4\3\2lm\7\64\2\2mn\b\4\1\2n\u0089\3\2\2\2"+
		"op\7\t\2\2pq\5\22\n\2qr\7\63\2\2rs\5\4\3\2st\7\64\2\2tu\b\4\1\2u\u0089"+
		"\3\2\2\2vw\7\24\2\2wx\7\63\2\2xy\5\4\3\2yz\7\64\2\2z{\b\4\1\2{\u0089\3"+
		"\2\2\2|}\7\31\2\2}~\7\37\2\2~\177\7\32\2\2\177\u0080\5\22\n\2\u0080\u0081"+
		"\7\63\2\2\u0081\u0082\5\4\3\2\u0082\u0083\7\64\2\2\u0083\u0084\b\4\1\2"+
		"\u0084\u0089\3\2\2\2\u0085\u0086\7\33\2\2\u0086\u0087\7!\2\2\u0087\u0089"+
		"\b\4\1\2\u0088\'\3\2\2\2\u0088/\3\2\2\2\u0088\67\3\2\2\2\u0088B\3\2\2"+
		"\2\u0088K\3\2\2\2\u0088Q\3\2\2\2\u0088X\3\2\2\2\u0088c\3\2\2\2\u0088o"+
		"\3\2\2\2\u0088v\3\2\2\2\u0088|\3\2\2\2\u0088\u0085\3\2\2\2\u0089\7\3\2"+
		"\2\2\u008a\u008c\5\n\6\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0091\b\5\1\2\u0091\t\3\2\2\2\u0092\u0093\7\b\2\2\u0093\u0094"+
		"\7\7\2\2\u0094\u0095\5\22\n\2\u0095\u0096\7\63\2\2\u0096\u0097\5\4\3\2"+
		"\u0097\u0098\7\64\2\2\u0098\u0099\b\6\1\2\u0099\13\3\2\2\2\u009a\u009b"+
		"\7\r\2\2\u009b\u00a1\b\7\1\2\u009c\u009d\7\f\2\2\u009d\u00a1\b\7\1\2\u009e"+
		"\u009f\7\6\2\2\u009f\u00a1\b\7\1\2\u00a0\u009a\3\2\2\2\u00a0\u009c\3\2"+
		"\2\2\u00a0\u009e\3\2\2\2\u00a1\r\3\2\2\2\u00a2\u00a3\7\17\2\2\u00a3\u00a6"+
		"\b\b\1\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\17\3\2\2\2\u00a7\u00a8\7\65\2\2\u00a8\u00a9\7\66\2\2\u00a9\u00ac\b\t"+
		"\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\21\3\2\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af\b\n\1\2\u00af\23\3\2\2\2"+
		"\u00b0\u00b1\b\13\1\2\u00b1\u00b2\t\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4"+
		"\7#\2\2\u00b4\u00b5\t\3\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b7\5\24\13\2"+
		"\u00b7\u00b8\7\"\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba\7\62\2\2\u00ba"+
		"\u00bb\b\13\1\2\u00bb\u00ce\3\2\2\2\u00bc\u00bd\7$\2\2\u00bd\u00be\5\24"+
		"\13\n\u00be\u00bf\b\13\1\2\u00bf\u00ce\3\2\2\2\u00c0\u00c1\7\65\2\2\u00c1"+
		"\u00c2\5\26\f\2\u00c2\u00c3\7\66\2\2\u00c3\u00c4\b\13\1\2\u00c4\u00ce"+
		"\3\2\2\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7\b\13\1\2\u00c7\u00ce\3\2\2\2"+
		"\u00c8\u00c9\7\61\2\2\u00c9\u00ca\5\22\n\2\u00ca\u00cb\7\62\2\2\u00cb"+
		"\u00cc\b\13\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00b0\3\2\2\2\u00cd\u00bc\3"+
		"\2\2\2\u00cd\u00c0\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce"+
		"\u0102\3\2\2\2\u00cf\u00d0\f\20\2\2\u00d0\u00d1\t\4\2\2\u00d1\u00d2\5"+
		"\24\13\21\u00d2\u00d3\b\13\1\2\u00d3\u0101\3\2\2\2\u00d4\u00d5\f\17\2"+
		"\2\u00d5\u00d6\t\5\2\2\u00d6\u00d7\5\24\13\20\u00d7\u00d8\b\13\1\2\u00d8"+
		"\u0101\3\2\2\2\u00d9\u00da\f\r\2\2\u00da\u00db\t\6\2\2\u00db\u00dc\5\24"+
		"\13\16\u00dc\u00dd\b\13\1\2\u00dd\u0101\3\2\2\2\u00de\u00df\f\f\2\2\u00df"+
		"\u00e0\7\'\2\2\u00e0\u00e1\5\24\13\r\u00e1\u00e2\b\13\1\2\u00e2\u0101"+
		"\3\2\2\2\u00e3\u00e4\f\13\2\2\u00e4\u00e5\t\7\2\2\u00e5\u00e6\5\24\13"+
		"\f\u00e6\u00e7\b\13\1\2\u00e7\u0101\3\2\2\2\u00e8\u00e9\f\t\2\2\u00e9"+
		"\u00ea\7 \2\2\u00ea\u00eb\7\25\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00ed\7"+
		"\62\2\2\u00ed\u0101\b\13\1\2\u00ee\u00ef\f\b\2\2\u00ef\u00f0\7 \2\2\u00f0"+
		"\u00f1\7\26\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\7\62\2\2\u00f3\u0101"+
		"\b\13\1\2\u00f4\u00f5\f\7\2\2\u00f5\u00f6\7 \2\2\u00f6\u00f7\7\27\2\2"+
		"\u00f7\u00f8\7\61\2\2\u00f8\u00f9\7\62\2\2\u00f9\u0101\b\13\1\2\u00fa"+
		"\u00fb\f\6\2\2\u00fb\u00fc\7 \2\2\u00fc\u00fd\7\30\2\2\u00fd\u00fe\7\61"+
		"\2\2\u00fe\u00ff\7\62\2\2\u00ff\u0101\b\13\1\2\u0100\u00cf\3\2\2\2\u0100"+
		"\u00d4\3\2\2\2\u0100\u00d9\3\2\2\2\u0100\u00de\3\2\2\2\u0100\u00e3\3\2"+
		"\2\2\u0100\u00e8\3\2\2\2\u0100\u00ee\3\2\2\2\u0100\u00f4\3\2\2\2\u0100"+
		"\u00fa\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\25\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\b\f\1\2\u0106\u0107"+
		"\5\22\n\2\u0107\u0108\b\f\1\2\u0108\u0110\3\2\2\2\u0109\u010a\f\4\2\2"+
		"\u010a\u010b\7\"\2\2\u010b\u010c\5\22\n\2\u010c\u010d\b\f\1\2\u010d\u010f"+
		"\3\2\2\2\u010e\u0109\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\27\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\34\2"+
		"\2\u0114\u012f\b\r\1\2\u0115\u0116\7\60\2\2\u0116\u0117\7\34\2\2\u0117"+
		"\u012f\b\r\1\2\u0118\u0119\7\60\2\2\u0119\u011a\7\35\2\2\u011a\u012f\b"+
		"\r\1\2\u011b\u011c\7\36\2\2\u011c\u012f\b\r\1\2\u011d\u011e\7\35\2\2\u011e"+
		"\u012f\b\r\1\2\u011f\u0120\7\35\2\2\u0120\u0121\7\20\2\2\u0121\u0122\7"+
		"\f\2\2\u0122\u012f\b\r\1\2\u0123\u0124\7\34\2\2\u0124\u0125\7\20\2\2\u0125"+
		"\u0126\7\r\2\2\u0126\u012f\b\r\1\2\u0127\u0128\5\32\16\2\u0128\u0129\b"+
		"\r\1\2\u0129\u012f\3\2\2\2\u012a\u012b\7\21\2\2\u012b\u012f\b\r\1\2\u012c"+
		"\u012d\7\22\2\2\u012d\u012f\b\r\1\2\u012e\u0113\3\2\2\2\u012e\u0115\3"+
		"\2\2\2\u012e\u0118\3\2\2\2\u012e\u011b\3\2\2\2\u012e\u011d\3\2\2\2\u012e"+
		"\u011f\3\2\2\2\u012e\u0123\3\2\2\2\u012e\u0127\3\2\2\2\u012e\u012a\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\31\3\2\2\2\u0130\u0131\b\16\1\2\u0131\u0132"+
		"\7\37\2\2\u0132\u0133\b\16\1\2\u0133\u013c\3\2\2\2\u0134\u0135\f\4\2\2"+
		"\u0135\u0136\7\65\2\2\u0136\u0137\5\22\n\2\u0137\u0138\7\66\2\2\u0138"+
		"\u0139\b\16\1\2\u0139\u013b\3\2\2\2\u013a\u0134\3\2\2\2\u013b\u013e\3"+
		"\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\33\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\16\"\u0088\u008d\u00a0\u00a5\u00ab\u00cd\u0100\u0102\u0110"+
		"\u012e\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}