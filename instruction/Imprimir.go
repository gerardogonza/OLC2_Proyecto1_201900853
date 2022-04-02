package instruction

import (
	"fmt"
	"proyecto1/generator"
	"proyecto1/interfaces"
)

type Imprimir struct {
	Expresion interfaces.Expresion
}

func NewImprimir(val interfaces.Expresion) Imprimir {
	exp := Imprimir{val}
	return exp
}

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

var CodigoEntrada Codigo

func (p Imprimir) Ejecutar(env interface{}, gen *generator.Generator) interface{} {

	var result interfaces.Value

	result = p.Expresion.Ejecutar(env, gen)

	if result.Type == interfaces.BOOLEAN {
		newLabel := gen.NewLabel()
		gen.AddLabel(result.TrueLabel)
		gen.PrintTrue()
		gen.AddGoto(newLabel)
		gen.AddLabel(result.FalseLabel)
		gen.PrintFalse()
		gen.AddLabel(newLabel)

	} else if result.Type == interfaces.STRING {
		newTemp := gen.NewTemp()
		gen.AddExpression(newTemp, "H", "", "")
		gen.ExpresionLiteral("H", fmt.Sprintf(result.Value), newTemp)
		newTemp1 := gen.NewTemp()
		gen.AddExpression(newTemp1, "H", "2", "-")
		gen.GetHeap(newTemp1, newTemp1)
		newLabel := gen.NewLabel()
		newLabel1 := gen.NewLabel()
		gen.AddLabel(newLabel1)
		newTemp2 := gen.NewTemp()
		gen.GetHeap(newTemp2, newTemp1)
		gen.AddIf(newTemp2, "-1", "==", newLabel)
		gen.AddPrintf("c", "(int)"+fmt.Sprintf("%v", newTemp2))
		gen.AddExpression(newTemp1, newTemp1, "1", "+")
		gen.AddGoto(newLabel1)
		gen.AddLabel(newLabel)
	} else {
		gen.AddPrintf("d", "(int)"+fmt.Sprintf("%v", result.Value))
	}

	return result.Value
}
