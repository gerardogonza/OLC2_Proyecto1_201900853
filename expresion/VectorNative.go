package expresion

import (
	"fmt"
	"proyecto1/instruction"
	"proyecto1/interfaces"
	"strconv"

	arrayList "github.com/colegno/arraylist"
	"github.com/vigneshuvi/GoDateFormat"
)

type VectorNative struct {
	id          interfaces.Expresion
	Expresion   interfaces.Expresion
	instruccion interfaces.TipoExpresion
	posicion    interfaces.Expresion
}

func NewVectorNative(condition interfaces.Expresion, instruccion interfaces.TipoExpresion, Expresion interfaces.Expresion, pos interfaces.Expresion) VectorNative {
	VectorNativeInstr := VectorNative{condition, Expresion, instruccion, pos}
	return VectorNativeInstr
}

func (p VectorNative) Ejecutar(env interface{}) interface{} {

	var result interfaces.Symbol
	if p.id != nil {
		result = p.id.Ejecutar(env)
	}
	var result2 interfaces.Symbol
	if p.Expresion != nil {
		result2 = p.Expresion.Ejecutar(env)
	}

	var tempValue interface{}
	if p.id != nil {
		tempValue = result.Valor
	}
	if p.instruccion == interfaces.PUSH {
		if tempValue.(*arrayList.List).GetValue(0).(interfaces.Symbol).Tipo == result2.Tipo {
			tempValue.(*arrayList.List).Add(interfaces.Symbol{Tipo: interfaces.STRING, Muteable: true, Valor: result2.Valor})
		} else {
			instruction.CodigoEntrada.Salida += "ERROR line  Los valores no son del mismo tipo! \n"
			var errortemporal instruction.Error
			v := instruction.GetToday(GoDateFormat.ConvertFormat("yyyy-MMM-dd' HH:MM:SS tt"))
			errortemporal = instruction.Error{
				Error1:  " El tipo de la Variable  Los valores no son del mismo tipo",
				Linea:   0,
				Columna: 0,
				Fecha:   v,
			}
			instruction.CodigoEntrada.Errores = append(instruction.CodigoEntrada.Errores, errortemporal)
		}
	} else if p.instruccion == interfaces.INSERT {
		var posi interfaces.Symbol
		posi = p.posicion.Ejecutar(env)
		i := 0
		var tempExp *arrayList.List
		tempExp = arrayList.New()

		var tempValue interface{}
		tempValue = result.Valor
		for _, s := range tempValue.(*arrayList.List).ToArray() {

			if posi.Valor == i {

				tempExp.Add(interfaces.Symbol{Tipo: interfaces.STRING, Muteable: true, Valor: result2.Valor})
			}
			i++
			tempExp.Add(s)
		}

		tempValue.(*arrayList.List).Clear()
		j := 0
		for _, s := range tempExp.ToArray() {
			tempValue.(*arrayList.List).Add(s)
			j++
		}

	} else if p.instruccion == interfaces.REMOVE {
		var posi interfaces.Symbol
		posi = p.posicion.Ejecutar(env)

		fmt.Println(posi)

		var tempValue interface{}
		tempValue = result.Valor
		index := fmt.Sprint(posi.Valor)
		intVar, err := strconv.Atoi(index)
		if err != nil {
			fmt.Println(err)
		}
		tempValue.(*arrayList.List).RemoveAtIndex(intVar)

	} else if p.instruccion == interfaces.LEN {
		var tempValue interface{}
		tempValue = result.Valor
		instruction.CodigoEntrada.Salida += fmt.Sprint(tempValue.(*arrayList.List).Len())
		return tempValue.(*arrayList.List).Len()
	}

	return result.Valor

}
