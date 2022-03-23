package instruction

import (
	"proyecto1/interfaces"
)

type Break struct {
	Expresion interfaces.TipoExpresion
	Linea     int
	Columna   int
}

func NewBreak(condition interfaces.TipoExpresion, line int, columna int) Break {

	breakInstr := Break{condition, line, columna}
	return breakInstr
}

func (p Break) Ejecutar(env interface{}) interface{} {

	return p.Expresion
}
