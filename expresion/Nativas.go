package expresion

import (
	"fmt"
	"math"
	"proyecto1/instruction"
	"proyecto1/interfaces"

	"github.com/vigneshuvi/GoDateFormat"
)

type Nativas struct {
	Op1      interfaces.Expresion
	Operador string
	Linea    int
	Columna  int
}

func NewNativas(Op1 interfaces.Expresion, Operador string, Linea int, Columna int) Nativas {
	exp := Nativas{Op1, Operador, Linea, Columna}

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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " no es valor admitido para valor abs debe ser INT o FLOAT !\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "no es valor admitido para valor \"abs\" debe ser INT o FLOAT",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " no es valor admitido para valor \"sqrt\" debe ser INT o FLOAT !\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "no es valor admitido para valor \"sqrt\" debe ser INT o FLOAT !!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
			}
		}
	case "to_string":
		{

			return interfaces.Symbol{Id: "", Tipo: interfaces.FLOAT, Valor: fmt.Sprintln(retornoIzq.Valor)}

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
