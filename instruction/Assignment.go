package instruction

import (
	"fmt"
	"proyecto1/environment"
	"proyecto1/interfaces"
)

type Assignment struct {
	Id        string
	Expresion interfaces.Expresion
}

func NewAssignment(id string, val interfaces.Expresion) Assignment {
	instr := Assignment{id, val}
	return instr
}

func (p Assignment) Ejecutar(env interface{}) interface{} {
	old := env.(environment.Environment).GetVariable(p.Id)
	if !old.Muteable {

		fmt.Println("no es mutable")
		return old.Valor
	}
	var result interfaces.Symbol
	result = p.Expresion.Ejecutar(env)

	env.(environment.Environment).AlterVariable(p.Id, result)

	return result.Valor
}
