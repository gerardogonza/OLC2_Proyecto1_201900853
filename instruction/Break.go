package instruction

import (
	"fmt"
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
	fmt.Println("sda")
	return p.Expresion
}
