package instruction

import (
	"fmt"
	"proyecto1/environment"
	"proyecto1/interfaces"

	"github.com/vigneshuvi/GoDateFormat"
)

type Declaration struct {
	Id        string
	Tipo      interfaces.TipoExpresion
	Expresion interfaces.Expresion
	IsArray   bool
	Muteable  bool
	Linea     int
	Columna   int
}

func NewDeclaration(id string, tipo interfaces.TipoExpresion, val interfaces.Expresion, isArray bool, isMuteable bool, Linea int, Columna int) Declaration {
	instr := Declaration{id, tipo, val, isArray, isMuteable, Linea, Columna}
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
		CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + "\" " + p.Id + "\" es diferente al valor Declarado! \n"
		var errortemporal Error
		v := GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
		errortemporal = Error{
			Error1:  " El tipo de la Variable \"" + p.Id + "\" es diferente al valor Declarado!",
			Linea:   p.Linea,
			Columna: p.Columna,
			Fecha:   v,
		}
		CodigoEntrada.Errores = append(CodigoEntrada.Errores, errortemporal)
	}

	return result.Valor
}
