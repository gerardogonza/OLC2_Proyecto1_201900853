package instruction

import (
	"proyecto1/interfaces"
)

type Continue struct {
	Expresion interfaces.TipoExpresion
	Linea     int
	Columna   int
}

func NewContinue(condition interfaces.TipoExpresion, line int, columna int) Continue {

	ContinueInstr := Continue{condition, line, columna}

	return ContinueInstr
}

func (p Continue) Ejecutar(env interface{}) interface{} {

	return p.Expresion
}
