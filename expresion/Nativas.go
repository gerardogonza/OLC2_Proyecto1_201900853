package expresion

import (
	"fmt"
	"math"
	"proyecto1/interfaces"
)

type Nativas struct {
	Op1      interfaces.Expresion
	Operador string
}

func NewNativas(Op1 interfaces.Expresion, Operador string) Nativas {
	exp := Nativas{Op1, Operador}

	return exp
}

func (p Nativas) Ejecutar(env interface{}) interfaces.Symbol {
	var retornoIzq interfaces.Symbol
	retornoIzq = p.Op1.Ejecutar(env)
	var resultado interface{}
	switch p.Operador {
	case "abs":
		{
			if retornoIzq.Tipo == interfaces.INTEGER {

				if retornoIzq.Valor.(int) <= -1 {

					return interfaces.Symbol{Id: "", Tipo: interfaces.INTEGER, Valor: (retornoIzq.Valor.(int)) * -1}
				} else {
					return interfaces.Symbol{Id: "", Tipo: interfaces.INTEGER, Valor: (retornoIzq.Valor.(int))}
				}
			} else if retornoIzq.Tipo == interfaces.FLOAT {
				if retornoIzq.Valor.(float64) <= -1.00 {

					return interfaces.Symbol{Id: "", Tipo: interfaces.FLOAT, Valor: (retornoIzq.Valor.(float64)) * -1.00}
				} else {
					return interfaces.Symbol{Id: "", Tipo: interfaces.FLOAT, Valor: (retornoIzq.Valor.(float64))}
				}
			} else {
				fmt.Println("Error no es valor admitido para valor abs debe ser INT o FLOAT")
			}
		}
	case "sqrt":
		{
			if retornoIzq.Tipo == interfaces.INTEGER {
				a := float64(retornoIzq.Valor.(int))
				res := math.Sqrt(a)
				return interfaces.Symbol{Id: "", Tipo: interfaces.FLOAT, Valor: res}

			} else if retornoIzq.Tipo == interfaces.FLOAT {

				res := math.Sqrt(retornoIzq.Valor.(float64))
				return interfaces.Symbol{Id: "", Tipo: interfaces.FLOAT, Valor: res}

			} else {
				fmt.Println("Error no es valor admitido para valor abs debe ser INT o FLOAT")
			}
		}
	case "to_string":
		{
			if retornoIzq.Tipo == interfaces.STRING {
				a := float64(retornoIzq.Valor.(int))
				res := math.Sqrt(a)
				return interfaces.Symbol{Id: "", Tipo: interfaces.FLOAT, Valor: res}

			} else {
				fmt.Println("Error no es valor admitido para valor abs debe ser INT o FLOAT")
			}
		}
	case "clone":
		{
			if retornoIzq.Tipo == interfaces.STRING {
				a := float64(retornoIzq.Valor.(int))
				res := math.Sqrt(a)
				return interfaces.Symbol{Id: "", Tipo: interfaces.FLOAT, Valor: res}

			} else {
				fmt.Println("Error no es valor admitido para valor abs debe ser INT o FLOAT")
			}
		}
	}
	return interfaces.Symbol{Id: "", Tipo: interfaces.INTEGER, Valor: resultado}
}
