package expresion

import (
	"proyecto1/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Array struct {
	ListExp *arrayList.List
	Size    interfaces.Expresion
}

func NewArray(list *arrayList.List, tam interfaces.Expresion) Array {
	exp := Array{list, tam}
	return exp
}

func (p Array) Ejecutar(env interface{}) interfaces.Symbol {

	var tempExp *arrayList.List
	tempExp = arrayList.New()
	if p.Size == nil {
		for _, s := range p.ListExp.ToArray() {
			tempExp.Add(s.(interfaces.Expresion).Ejecutar(env))
		}
	} else {
		var retornoDer interfaces.Symbol
		retornoDer = p.Size.Ejecutar(env)
		for _, s := range p.ListExp.ToArray() {
			for i := 0; i < retornoDer.Valor.(int); i++ {
				tempExp.Add(s.(interfaces.Expresion).Ejecutar(env))
			}
			break
		}
	}

	return interfaces.Symbol{
		Id:    "",
		Tipo:  interfaces.ARRAY,
		Valor: tempExp,
	}
}
