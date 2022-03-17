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
	Tipo      bool
}

func NewImprimir(val interfaces.Expresion, tipo bool) Imprimir {
	exp := Imprimir{val, tipo}
	return exp
}

func (p Imprimir) Ejecutar(env interface{}) interface{} {
	var result interfaces.Symbol
	result = p.Expresion.Ejecutar(env)
	if p.Tipo == false {
		CodigoEntrada.Salida += fmt.Sprintln(result.Valor)
	} else {
		CodigoEntrada.Salida += fmt.Sprint(result.Valor)
	}

	return result.Valor
}
