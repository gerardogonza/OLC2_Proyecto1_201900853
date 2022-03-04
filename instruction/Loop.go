package instruction

import (
	"fmt"
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
		fmt.Println(p.Bloque.ToArray())
		for _, s := range p.Bloque.ToArray() {

			s.(interfaces.Instruction).Ejecutar(tmpEnv)
		}
		fmt.Println(result.Valor)
		if result.Valor == true {
			break
		}

	}
	return result.Valor
}
