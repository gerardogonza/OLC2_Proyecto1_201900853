package expresion

import (
	"fmt"
	"math"
	"proyecto1/interfaces"
)

type Aritmetica struct {
	Op1      interfaces.Expresion
	Operador string
	Op2      interfaces.Expresion
	Unario   bool
}

func NewOperacion(Op1 interfaces.Expresion, Operador string, Op2 interfaces.Expresion, unario bool) Aritmetica {
	exp := Aritmetica{Op1, Operador, Op2, unario}

	return exp
}

func (p Aritmetica) Ejecutar(env interface{}) interfaces.Symbol {

	suma_resta_dominante := [5][5]interfaces.TipoExpresion{
		//INTEGER			//FLOAT			   //STRING			  //BOOLEAN		   //NULL
		//INTEGER
		{interfaces.INTEGER, interfaces.FLOAT, interfaces.STRING, interfaces.NULL, interfaces.NULL},
		//FLOAT
		{interfaces.FLOAT, interfaces.FLOAT, interfaces.STRING, interfaces.NULL, interfaces.NULL},
		//STRING
		{interfaces.STRING, interfaces.STRING, interfaces.STRING, interfaces.STRING, interfaces.NULL},
		//BOOLEAN
		{interfaces.NULL, interfaces.NULL, interfaces.STRING, interfaces.NULL, interfaces.NULL},
		//NULL
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	}

	multi_division_dominante := [5][5]interfaces.TipoExpresion{
		{interfaces.INTEGER, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.FLOAT, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	}

	relacional_dominante := [5][5]interfaces.TipoExpresion{
		{interfaces.INTEGER, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.FLOAT, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
		{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	}

	var retornoIzq interfaces.Symbol
	var retornoDer interfaces.Symbol
	if p.Op1 != nil {

		if p.Unario == true {
			retornoIzq = p.Op1.Ejecutar(env)
		} else {
			retornoIzq = p.Op1.Ejecutar(env)
			retornoDer = p.Op2.Ejecutar(env)

		}
	} else {

		retornoDer = p.Op2.Ejecutar(env)
	}

	var resultado interface{}

	var dominante interfaces.TipoExpresion

	switch p.Operador {
	case "+":
		{

			dominante = suma_resta_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) + retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(float64) + retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: r1 + r2}
			} else {
				fmt.Print("ERROR: No es posible sumar")
			}

		}

	case "-":
		{
			dominante = suma_resta_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) - retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(float64) - retornoDer.Valor.(float64)}

			} else {
				fmt.Print("ERROR: No es posible restar")
			}
		}

	case "*":
		{
			dominante = multi_division_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) * retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(float64) * retornoDer.Valor.(float64)}

			} else {
				fmt.Print("ERROR: No es posible Multiplicar")
			}

		}

	case "/":
		{
			dominante = multi_division_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) / retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(float64) / retornoDer.Valor.(float64)}

			} else {
				fmt.Print("ERROR: No es posible Dividir")
			}

		}

	case "<":
		{
			dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) < retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) < retornoDer.Valor.(float64)}

			} else {
				fmt.Print("ERROR: No es posible comparar <")
			}
		}

	case ">":
		{
			dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) > retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) > retornoDer.Valor.(float64)}

			} else {
				fmt.Print("ERROR: No es posible comparar <")
			}
		}

	case "<=":
		{
			dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) <= retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) <= retornoDer.Valor.(float64)}

			} else {
				fmt.Print("ERROR: No es posible comparar <")
			}
		}

	case ">=":
		{
			dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) >= retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) >= retornoDer.Valor.(float64)}

			} else {
				fmt.Print("ERROR: No es posible comparar <")
			}
		}
	case "==":
		{

			dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) == retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) == retornoDer.Valor.(float64)}

			} else if retornoIzq.Tipo == interfaces.STRING && retornoDer.Tipo == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 == r2}

			} else {
				fmt.Print("ERROR: No es posible comparar ==")
			}

		}
	case "!=":
		{
			dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) != retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) != retornoDer.Valor.(float64)}

			} else if retornoIzq.Tipo == interfaces.STRING && retornoDer.Tipo == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 != r2}

			} else {
				fmt.Print("ERROR: No es posible comparar !=")
			}
		}
	case "pow":
		{
			dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				b := float64(retornoIzq.Valor.(int))
				c := float64(retornoDer.Valor.(int))

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: math.Pow(b, c)}

			} else {
				fmt.Print("ERROR: No es posible hacer potencia valores no son del mismo tipo ")
			}
		}

	case "powf":
		{
			dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.FLOAT {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: math.Pow(retornoIzq.Valor.(float64), retornoDer.Valor.(float64))}

			} else {
				fmt.Print("ERROR: No es posible hacer potencia valores no son del mismo tipo ")
			}
		}
	case "%":
		{
			dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.INTEGER, Valor: retornoIzq.Valor.(int) % retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				return interfaces.Symbol{Id: "", Tipo: interfaces.FLOAT, Valor: math.Mod(retornoIzq.Valor.(float64), retornoDer.Valor.(float64))}

			} else {
				fmt.Print("ERROR: No es posible hacer mod")
			}
		}
	case "!":
		{

			if retornoDer.Tipo == interfaces.FALSE {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: true}

			} else if retornoDer.Tipo == interfaces.TRUE {
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: false}
			} else {
				fmt.Print("ERROR: No es posible hacer: not ")
			}

		}
	case "&&":
		{

			if retornoIzq.Valor.(bool) && retornoDer.Valor.(bool) {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(bool) && retornoDer.Valor.(bool)}

			} else {
				fmt.Println("ERROR: No es posible hacer &&")
			}

		}
	case "||":
		{
			if retornoIzq.Valor.(bool) || retornoDer.Valor.(bool) {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: true}

			} else if retornoIzq.Valor == false || retornoDer.Valor == false {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: false}
			} else {
				fmt.Println("ERROR: No es posible hacer ||")

			}

		}

	}

	return interfaces.Symbol{Id: "", Tipo: interfaces.INTEGER, Valor: resultado}
}
