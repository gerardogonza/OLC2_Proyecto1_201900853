package expresion

import (
	"fmt"
	"proyecto1/generator"
	"proyecto1/interfaces"
)

type Primitivo struct {
	Valor interface{}
	Tipo  interfaces.TipoExpresion
}

func (p Primitivo) Ejecutar(env interface{}, gen *generator.Generator) interfaces.Value {

	return interfaces.Value{
		Value:      fmt.Sprintf("%v", p.Valor),
		IsTemp:     false,
		Type:       p.Tipo,
		TrueLabel:  "",
		FalseLabel: "",
	}
}

func NewPrimitivo(val interface{}, tipo interfaces.TipoExpresion) Primitivo {
	exp := Primitivo{val, tipo}
	return exp
}
