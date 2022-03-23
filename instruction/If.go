package instruction

import (
	"proyecto1/environment"
	"proyecto1/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type If struct {
	Expresion    interfaces.Expresion
	Bloque       *arrayList.List
	BloqueElseIF *arrayList.List
	BloquEelse   *arrayList.List
}

func NewIf(condition interfaces.Expresion, bloque *arrayList.List, validarElse *arrayList.List, bloqueElse *arrayList.List) If {

	ifInstr := If{condition, bloque, validarElse, bloqueElse}
	return ifInstr
}

func (p If) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol

	result = p.Expresion.Ejecutar(env)

	if result.Valor == true || result.Valor == "true" {

		var tmpEnv environment.Environment
		tmpEnv = environment.NewEnvironment(env.(environment.Environment))

		for _, s := range p.Bloque.ToArray() {
			result := s.(interfaces.Instruction).Ejecutar(tmpEnv)
			// if fmt.Sprint(reflect.TypeOf(s)) == "instruction.Break" {
			// 	return "Hola"
			// }

			if result == interfaces.BREAK {
				// continue == break
				return interfaces.BREAK
			}
			if result == interfaces.CONTINUE {
				// continue == break

				return interfaces.CONTINUE
			}

		}

	} else {
		if p.BloquEelse != nil {
			var tmpEnv environment.Environment
			tmpEnv = environment.NewEnvironment(env.(environment.Environment))

			for _, s := range p.BloquEelse.ToArray() {
				s.(interfaces.Instruction).Ejecutar(tmpEnv)

			}
			return result.Valor
		}

		if p.BloqueElseIF != nil {
			var tmpEnv environment.Environment
			tmpEnv = environment.NewEnvironment(env.(environment.Environment))

			for _, s := range p.BloqueElseIF.ToArray() {
				s.(interfaces.Instruction).Ejecutar(tmpEnv)

			}

		}

	}

	return result.Valor

}
