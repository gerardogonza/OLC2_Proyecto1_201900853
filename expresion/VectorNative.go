package expresion

import (
	"proyecto1/interfaces"
)

type VectorNative struct {
	id          string
	Expresion2  interfaces.Expresion
	instruccion interfaces.TipoExpresion
}

func NewVectorNative(condition string, instruccion interfaces.TipoExpresion, Expresion2 interfaces.Expresion) VectorNative {
	VectorNativeInstr := VectorNative{condition, Expresion2, instruccion}
	return VectorNativeInstr
}

func (p VectorNative) Ejecutar(env interface{}) interface{} {

	var result2 interfaces.Symbol
	result2 = p.Expresion2.Ejecutar(env)

	return result2.Valor
}
