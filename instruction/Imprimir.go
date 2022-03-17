package instruction

import (
	"fmt"
	"proyecto1/interfaces"
	"time"
)

type Codigo struct {
	Entrada string
	Salida  string
	Errores []Error
}
type Error struct {
	Error1  string
	Linea   int
	Columna int
	Fecha   string
}

func GetToday(format string) (todayString string) {
	today := time.Now()
	todayString = today.Format(format)
	return
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
