package instruction

import (
	"fmt"
	"proyecto1/interfaces"

	arrayList "github.com/colegno/arraylist"
)

type Match struct {
	Expresion interfaces.Expresion
	Bloque    *arrayList.List
}

func NewMatch(condition interfaces.Expresion, bloque *arrayList.List) Match {

	ifMatch := Match{condition, bloque}
	fmt.Println(ifMatch)
	return ifMatch
}

func (p Match) Ejecutar(env interface{}) interface{} {
	fmt.Println(p)

	return p

}
