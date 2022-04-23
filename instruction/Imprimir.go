package instruction

import (
	"fmt"
	"proyecto1/interfaces"
	"time"

	arrayList "github.com/colegno/arraylist"
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
	if result.Tipo == interfaces.ARRAY {
		var tempValue interface{}
		tempValue = result.Valor
		i := 0
		CodigoEntrada.Salida += "["
		for _, nombre := range tempValue.(*arrayList.List).ToArray() {
			fmt.Print(nombre)
			character := tempValue.(*arrayList.List).GetValue(i).(interfaces.Symbol).Valor
			size := tempValue.(*arrayList.List).Len()
			if p.Tipo == false {
				if i+1 == size {
					CodigoEntrada.Salida += fmt.Sprintln(character)
				} else {

					CodigoEntrada.Salida += fmt.Sprintln(character) + ","
				}

			} else {
				if i+1 == size {
					CodigoEntrada.Salida += fmt.Sprint(character)
				} else {

					CodigoEntrada.Salida += fmt.Sprint(character) + ","
				}

			}
			i++
		}
		CodigoEntrada.Salida += "]"
	} else {
		if p.Tipo == false {
			CodigoEntrada.Salida += fmt.Sprintln(result.Valor)
		} else {
			CodigoEntrada.Salida += fmt.Sprint(result.Valor)
		}

	}

	return result.Valor
}
