// Code generated from Chems.g4\ by ANTLR 4.7.2. DO NOT EDIT.

package parser // Chems

import "github.com/antlr/antlr4/runtime/Go/antlr"

// ChemsListener is a complete listener for a parse tree produced by Chems.
type ChemsListener interface {
	antlr.ParseTreeListener

	// EnterStart is called when entering the start production.
	EnterStart(c *StartContext)

	// EnterInstrucciones is called when entering the instrucciones production.
	EnterInstrucciones(c *InstruccionesContext)

	// EnterInstruccion is called when entering the instruccion production.
	EnterInstruccion(c *InstruccionContext)

	// EnterListaelseif is called when entering the listaelseif production.
	EnterListaelseif(c *ListaelseifContext)

	// EnterElse_if is called when entering the else_if production.
	EnterElse_if(c *Else_ifContext)

	// EnterTipo is called when entering the tipo production.
	EnterTipo(c *TipoContext)

	// EnterMut is called when entering the mut production.
	EnterMut(c *MutContext)

	// EnterVector_st is called when entering the vector_st production.
	EnterVector_st(c *Vector_stContext)

	// EnterArray_st is called when entering the array_st production.
	EnterArray_st(c *Array_stContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterExpr_arit is called when entering the expr_arit production.
	EnterExpr_arit(c *Expr_aritContext)

	// EnterListValues is called when entering the listValues production.
	EnterListValues(c *ListValuesContext)

	// EnterPrimitivo is called when entering the primitivo production.
	EnterPrimitivo(c *PrimitivoContext)

	// EnterListArray is called when entering the listArray production.
	EnterListArray(c *ListArrayContext)

	// ExitStart is called when exiting the start production.
	ExitStart(c *StartContext)

	// ExitInstrucciones is called when exiting the instrucciones production.
	ExitInstrucciones(c *InstruccionesContext)

	// ExitInstruccion is called when exiting the instruccion production.
	ExitInstruccion(c *InstruccionContext)

	// ExitListaelseif is called when exiting the listaelseif production.
	ExitListaelseif(c *ListaelseifContext)

	// ExitElse_if is called when exiting the else_if production.
	ExitElse_if(c *Else_ifContext)

	// ExitTipo is called when exiting the tipo production.
	ExitTipo(c *TipoContext)

	// ExitMut is called when exiting the mut production.
	ExitMut(c *MutContext)

	// ExitVector_st is called when exiting the vector_st production.
	ExitVector_st(c *Vector_stContext)

	// ExitArray_st is called when exiting the array_st production.
	ExitArray_st(c *Array_stContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitExpr_arit is called when exiting the expr_arit production.
	ExitExpr_arit(c *Expr_aritContext)

	// ExitListValues is called when exiting the listValues production.
	ExitListValues(c *ListValuesContext)

	// ExitPrimitivo is called when exiting the primitivo production.
	ExitPrimitivo(c *PrimitivoContext)

	// ExitListArray is called when exiting the listArray production.
	ExitListArray(c *ListArrayContext)
}
