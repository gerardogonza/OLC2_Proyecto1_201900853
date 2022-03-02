package instruction

import (
	"proyecto1/environment"
	"proyecto1/interfaces"
)

type Declaration struct {
	Id        string
	Tipo      interfaces.TipoExpresion
	Expresion interfaces.Expresion
	IsArray   bool
	Muteable  bool
}

func NewDeclaration(id string, tipo interfaces.TipoExpresion, val interfaces.Expresion, isArray bool, isMuteable bool) Declaration {
	instr := Declaration{id, tipo, val, isArray, isMuteable}
	return instr
}

func (p Declaration) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol

	result = p.Expresion.Ejecutar(env)

	if result.Tipo == p.Tipo {
		env.(environment.Environment).SaveVariable(p.Id, result, p.Tipo, p.Muteable)
	} else if p.IsArray {
		env.(environment.Environment).SaveVariable(p.Id, result, interfaces.ARRAY, p.Muteable)
	} else if p.Tipo == interfaces.NULL {
		if result.Tipo == interfaces.FLOAT {
			env.(environment.Environment).SaveVariable(p.Id, result, interfaces.FLOAT, p.Muteable)
		}
		if result.Tipo == interfaces.STRING {
			env.(environment.Environment).SaveVariable(p.Id, result, interfaces.STRING, p.Muteable)
		}
		if result.Tipo == interfaces.INTEGER {
			env.(environment.Environment).SaveVariable(p.Id, result, interfaces.INTEGER, p.Muteable)
		}
		if result.Tipo == interfaces.TRUE {
			env.(environment.Environment).SaveVariable(p.Id, result, interfaces.TRUE, p.Muteable)
		}
		if result.Tipo == interfaces.FALSE {
			env.(environment.Environment).SaveVariable(p.Id, result, interfaces.FALSE, p.Muteable)
		}
	} else {
		CodigoEntrada.Salida += "ERROR: El tipo de la Variable \"" + p.Id + "\" es diferente al valor Declarado! \n"

	}

	return result.Valor
}
