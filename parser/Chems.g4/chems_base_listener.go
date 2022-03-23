// Code generated from Chems.g4\ by ANTLR 4.7.2. DO NOT EDIT.

package parser // Chems

import "github.com/antlr/antlr4/runtime/Go/antlr"

// BaseChemsListener is a complete listener for a parse tree produced by Chems.
type BaseChemsListener struct{}

var _ ChemsListener = &BaseChemsListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseChemsListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseChemsListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseChemsListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseChemsListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterStart is called when production start is entered.
func (s *BaseChemsListener) EnterStart(ctx *StartContext) {}

// ExitStart is called when production start is exited.
func (s *BaseChemsListener) ExitStart(ctx *StartContext) {}

// EnterInstrucciones is called when production instrucciones is entered.
func (s *BaseChemsListener) EnterInstrucciones(ctx *InstruccionesContext) {}

// ExitInstrucciones is called when production instrucciones is exited.
func (s *BaseChemsListener) ExitInstrucciones(ctx *InstruccionesContext) {}

// EnterInstruccion is called when production instruccion is entered.
func (s *BaseChemsListener) EnterInstruccion(ctx *InstruccionContext) {}

// ExitInstruccion is called when production instruccion is exited.
func (s *BaseChemsListener) ExitInstruccion(ctx *InstruccionContext) {}

// EnterListaelseif is called when production listaelseif is entered.
func (s *BaseChemsListener) EnterListaelseif(ctx *ListaelseifContext) {}

// ExitListaelseif is called when production listaelseif is exited.
func (s *BaseChemsListener) ExitListaelseif(ctx *ListaelseifContext) {}

// EnterElse_if is called when production else_if is entered.
func (s *BaseChemsListener) EnterElse_if(ctx *Else_ifContext) {}

// ExitElse_if is called when production else_if is exited.
func (s *BaseChemsListener) ExitElse_if(ctx *Else_ifContext) {}

// EnterTipo is called when production tipo is entered.
func (s *BaseChemsListener) EnterTipo(ctx *TipoContext) {}

// ExitTipo is called when production tipo is exited.
func (s *BaseChemsListener) ExitTipo(ctx *TipoContext) {}

// EnterMut is called when production mut is entered.
func (s *BaseChemsListener) EnterMut(ctx *MutContext) {}

// ExitMut is called when production mut is exited.
func (s *BaseChemsListener) ExitMut(ctx *MutContext) {}

// EnterVector_st is called when production vector_st is entered.
func (s *BaseChemsListener) EnterVector_st(ctx *Vector_stContext) {}

// ExitVector_st is called when production vector_st is exited.
func (s *BaseChemsListener) ExitVector_st(ctx *Vector_stContext) {}

// EnterArray_st is called when production array_st is entered.
func (s *BaseChemsListener) EnterArray_st(ctx *Array_stContext) {}

// ExitArray_st is called when production array_st is exited.
func (s *BaseChemsListener) ExitArray_st(ctx *Array_stContext) {}

// EnterExpression is called when production expression is entered.
func (s *BaseChemsListener) EnterExpression(ctx *ExpressionContext) {}

// ExitExpression is called when production expression is exited.
func (s *BaseChemsListener) ExitExpression(ctx *ExpressionContext) {}

// EnterExpr_arit is called when production expr_arit is entered.
func (s *BaseChemsListener) EnterExpr_arit(ctx *Expr_aritContext) {}

// ExitExpr_arit is called when production expr_arit is exited.
func (s *BaseChemsListener) ExitExpr_arit(ctx *Expr_aritContext) {}

// EnterListValues is called when production listValues is entered.
func (s *BaseChemsListener) EnterListValues(ctx *ListValuesContext) {}

// ExitListValues is called when production listValues is exited.
func (s *BaseChemsListener) ExitListValues(ctx *ListValuesContext) {}

// EnterPrimitivo is called when production primitivo is entered.
func (s *BaseChemsListener) EnterPrimitivo(ctx *PrimitivoContext) {}

// ExitPrimitivo is called when production primitivo is exited.
func (s *BaseChemsListener) ExitPrimitivo(ctx *PrimitivoContext) {}

// EnterListArray is called when production listArray is entered.
func (s *BaseChemsListener) EnterListArray(ctx *ListArrayContext) {}

// ExitListArray is called when production listArray is exited.
func (s *BaseChemsListener) ExitListArray(ctx *ListArrayContext) {}
