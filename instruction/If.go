package instruction

import (
	"proyecto1/environment"
	"proyecto1/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type If struct {
	Expresion  interfaces.Expresion
	Bloque     *arrayList.List
	verElse    bool
	BloquEelse *arrayList.List
}

func NewIf(condition interfaces.Expresion, bloque *arrayList.List, validarElse bool, bloqueElse *arrayList.List) If {

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
			s.(interfaces.Instruction).Ejecutar(tmpEnv)

		}

	} else {
		if p.verElse == true {
			var tmpEnv environment.Environment
			tmpEnv = environment.NewEnvironment(env.(environment.Environment))

			for _, s := range p.BloquEelse.ToArray() {
				s.(interfaces.Instruction).Ejecutar(tmpEnv)

			}
		}
	}

	return result.Valor

}
