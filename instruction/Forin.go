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

type temporal struct {
	Tipo    interfaces.Expresion
	Mutable bool
}

func (p Forin) Ejecutar(env interface{}) interface{} {

	var result2 interfaces.Symbol
	result2 = p.Expresion2.Ejecutar(env)

	if result2.Tipo == interfaces.STRING {
		env.(environment.Environment).SaveVariable(p.id, interfaces.Symbol{Tipo: interfaces.STRING, Muteable: true, Valor: ""}, interfaces.STRING, true)
		for _, nombre := range result2.Valor.(string) {
			asciiValue := nombre
			character := string(asciiValue)

			env.(environment.Environment).AlterVariable(p.id, interfaces.Symbol{Tipo: interfaces.STRING, Muteable: true, Valor: character})
			var tmpEnv environment.Environment
			tmpEnv = environment.NewEnvironment(env.(environment.Environment))
			for _, s := range p.Bloque.ToArray() {

				result := s.(interfaces.Instruction).Ejecutar(tmpEnv)
				if result == interfaces.BREAK {
					// continue == break
					return interfaces.BREAK
				}
			}
		}
	}
	if result2.Tipo == interfaces.ARRAY {

		var tempArray interfaces.Symbol
		tempArray = p.Expresion2.Ejecutar(env)
		env.(environment.Environment).SaveVariable(p.id, interfaces.Symbol{Tipo: interfaces.STRING, Muteable: true, Valor: ""}, interfaces.STRING, true)
		if tempArray.Tipo == interfaces.ARRAY {

			var tempValue interface{}
			tempValue = tempArray.Valor

			i := 0
			for _, nombre := range tempValue.(*arrayList.List).ToArray() {
				character := tempValue.(*arrayList.List).GetValue(i).(interfaces.Symbol).Valor
				fmt.Print(nombre) //si lo quito peta
				i++
				env.(environment.Environment).AlterVariable(p.id, interfaces.Symbol{Tipo: interfaces.STRING, Muteable: true, Valor: character})
				var tmpEnv environment.Environment
				tmpEnv = environment.NewEnvironment(env.(environment.Environment))
				for _, s := range p.Bloque.ToArray() {

					result := s.(interfaces.Instruction).Ejecutar(tmpEnv)
					if result == interfaces.BREAK {
						// continue == break
						return interfaces.BREAK
					}
				}

			}

			return tempValue.(*arrayList.List).GetValue(0).(interfaces.Symbol)
		}
	}

	return result2.Valor
}
