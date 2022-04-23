package instruction

import (
	"proyecto1/environment"
	"proyecto1/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Loop struct {
	Bloque *arrayList.List
}

func NewLoop(bloque *arrayList.List) Loop {
	loopInstr := Loop{bloque}

	return loopInstr
}

func (p Loop) Ejecutar(env interface{}) interface{} {
	var result interfaces.Symbol

	var tmpEnv environment.Environment
	tmpEnv = environment.NewEnvironment(env.(environment.Environment))

	for {
		for _, s := range p.Bloque.ToArray() {

			result := s.(interfaces.Instruction).Ejecutar(tmpEnv)
			if result == interfaces.BREAK {
				// continue == break
				return interfaces.BREAK
			}
			if result == interfaces.CONTINUE {
				// continue == break
				break
			}
		}

	}
	return result.Valor
}
