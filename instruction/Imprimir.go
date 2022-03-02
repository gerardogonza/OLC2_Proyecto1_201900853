package instruction

import (
	"fmt"
	"proyecto1/interfaces"
)

type Codigo struct {
	Entrada string
	Salida  string
}

var CodigoEntrada Codigo

type Imprimir struct {
	Expresion interfaces.Expresion
}

func NewImprimir(val interfaces.Expresion) Imprimir {
	exp := Imprimir{val}
	return exp
}

func (p Imprimir) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol

	result = p.Expresion.Ejecutar(env)
	CodigoEntrada.Salida += fmt.Sprintln(result.Valor)

	return result.Valor
}
