package expresion

import (
	"fmt"
	"math"
	"proyecto1/instruction"
	"proyecto1/interfaces"

	"github.com/vigneshuvi/GoDateFormat"
)

type Aritmetica struct {
	Op1      interfaces.Expresion
	Operador string
	Op2      interfaces.Expresion
	Unario   bool
	Linea    int
	Columna  int
}

func NewOperacion(Op1 interfaces.Expresion, Operador string, Op2 interfaces.Expresion, unario bool, Linea int, Columna int) Aritmetica {
	exp := Aritmetica{Op1, Operador, Op2, unario, Linea, Columna}

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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No es posible sumar!\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "  No es posible sumar!!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No es posible restar!\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "  No es posible restar!!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No es posible multiplicar!\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "  No es posible multiplicar!!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No es posible Dividir!\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "  No es posible Dividir!!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No es posible Comparar <!\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "   No es posible Comparar <!!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No es posible Comparar >!\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "   No es posible Comparar >!!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No es posible Comparar <=!\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "   No es posible Comparar <=!!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No es posible Comparar >=!\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "   No es posible Comparar >=!!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No es posible Comparar ==!\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "   No es posible Comparar ==!!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No es posible Comparar != !\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "   No es posible Comparar != !!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No son del mismo tipo pow!\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  " No son del mismo tipo pow!!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
			}
		}

	case "powf":
		{
			dominante = relacional_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.FLOAT {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: math.Pow(retornoIzq.Valor.(float64), retornoDer.Valor.(float64))}

			} else {
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No son del mismo tipo powf!\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  " No son del mismo tipo powf!!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
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
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No se puede hacer mod!\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "No se puede hacer mod!!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
			}
		}
	case "!":
		{

			if retornoDer.Tipo == interfaces.FALSE {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: true}

			} else if retornoDer.Tipo == interfaces.TRUE {
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: false}
			} else {
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No se puede hacer not !\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "No se puede hacer not !!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
			}

		}
	case "&&":
		{

			if retornoIzq.Valor.(bool) && retornoDer.Valor.(bool) {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(bool) && retornoDer.Valor.(bool)}

			} else {
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No se puede hacer && !\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "No se puede hacer && !!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
			}

		}
	case "||":
		{
			if retornoIzq.Valor.(bool) || retornoDer.Valor.(bool) {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: true}

			} else if retornoIzq.Valor == false || retornoDer.Valor == false {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: false}
			} else {
				instruction.CodigoEntrada.Salida += "ERROR line" + fmt.Sprint(p.Linea) + ":" + fmt.Sprint(p.Columna) + " No se puede hacer OR !\n"
				var errortemporal instruction.Error
				v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
				errortemporal = instruction.Error{
					Error1:  "No se puede hacer OR !!",
					Linea:   p.Linea,
					Columna: p.Columna,
					Fecha:   v,
				}
				instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)

			}

		}

	}

	return interfaces.Symbol{Id: "", Tipo: interfaces.INTEGER, Valor: resultado}
}
