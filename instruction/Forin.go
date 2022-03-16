package instruction

import (
	"fmt"
	"proyecto1/environment"
	"proyecto1/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Forin struct {
	id         string
	Expresion2 interfaces.Expresion
	Bloque     *arrayList.List
}

func NewForin(condition string, condition2 interfaces.Expresion, bloque *arrayList.List) Forin {
	forinInstr := Forin{condition, condition2, bloque}
	return forinInstr
}

func (p Forin) Ejecutar(env interface{}) interface{} {

	var result2 interfaces.Symbol
	result2 = p.Expresion2.Ejecutar(env)

	if result2.Tipo == interfaces.STRING {

		for _, nombre := range result2.Valor.(string) {
			asciiValue := nombre
			character := string(asciiValue)

			env.(environment.Environment).AlterVariable(p.id, interfaces.Symbol{Tipo: interfaces.STRING, Muteable: false, Valor: character})
			var tmpEnv environment.Environment
			tmpEnv = environment.NewEnvironment(env.(environment.Environment))
			for _, s := range p.Bloque.ToArray() {

				s.(interfaces.Instruction).Ejecutar(tmpEnv)
			}
		}
	}
	if result2.Tipo == interfaces.ARRAY {

		var tempArray interfaces.Symbol
		tempArray = p.Expresion2.Ejecutar(env)

		if tempArray.Tipo == interfaces.ARRAY {

			var tempValue interface{}
			tempValue = tempArray.Valor

			i := 0
			for _, nombre := range tempValue.(*arrayList.List).ToArray() {
				character := tempValue.(*arrayList.List).GetValue(i).(interfaces.Symbol).Valor
				fmt.Print(nombre)
				i++
				env.(environment.Environment).AlterVariable(p.id, interfaces.Symbol{Tipo: interfaces.STRING, Muteable: false, Valor: character})
				var tmpEnv environment.Environment
				tmpEnv = environment.NewEnvironment(env.(environment.Environment))
				for _, s := range p.Bloque.ToArray() {

					s.(interfaces.Instruction).Ejecutar(tmpEnv)
				}
			}

			return tempValue.(*arrayList.List).GetValue(0).(interfaces.Symbol)
		}
	}

	return result2.Valor
}
