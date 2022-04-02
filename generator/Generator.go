package generator

import (
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Generator struct {
	temporal int
	label    int
	code     *arrayList.List
	tempList *arrayList.List
}

func NewGenerator() *Generator {

	generator := Generator{temporal: 0, label: 0, code: arrayList.New(), tempList: arrayList.New()}
	return &generator
}

func (g Generator) GetCode() *arrayList.List {

	return g.code
}

func (g Generator) GetTemps() *arrayList.List {

	return g.tempList
}

//Generar un nuevo temporal
func (g *Generator) NewTemp() string {
	temp := "t" + fmt.Sprintf("%v", g.temporal)
	g.temporal = g.temporal + 1
	//Lo guardamos para declararlo
	g.tempList.Add(temp)
	return temp
}

//Generador de label
func (g *Generator) NewLabel() string {
	temp := g.label
	g.label = g.label + 1
	return "L" + fmt.Sprintf("%v", temp)
}

//Añade label al codigo
func (g *Generator) AddLabel(label string) {
	g.code.Add(label + ":")
}

func (g *Generator) AddIf(left string, right string, operator string, label string) {
	g.code.Add("if(" + left + " " + operator + " " + right + ") goto " + label + ";")
}

func (g *Generator) AddGoto(label string) {
	g.code.Add("goto " + label + ";")
}

func (g *Generator) AddExpression(target string, left string, right string, operator string) {
	g.code.Add(target + " = " + left + " " + operator + " " + right + ";")
}

//Añade un printf
func (g *Generator) AddPrintf(typePrint string, value string) {
	g.code.Add("printf(\"%" + typePrint + "\"," + value + ");")
}

//HEAP
func (g *Generator) ExpresionLiteral(posicion string, value string, target string) {
	g.code.Add("/*----Empieza la separacion de string en caracteres----*/ ")
	for _, variable := range value {
		g.SetHeap(posicion, fmt.Sprint(variable))
		g.NextHeap()
	}
	g.SetHeap("H", "-1")
	g.NextHeap()
	g.SetHeap("H", target)
	g.NextHeap()
	g.SetHeap("H", "-1")
	g.NextHeap()
	g.code.Add("/*----Fin de la separacion de string en caracteres----*/ ")
}
func (g *Generator) NextHeap() {
	g.code.Add("H=H+1;")
}
func (g *Generator) SetHeap(posicion string, value string) {
	g.code.Add("HEAP[(int)" + posicion + "]=" + fmt.Sprint(value) + ";")
}
func (g *Generator) GetHeap(targetA string, targetB string) {
	g.code.Add(targetA + "=HEAP[(int)" + targetB + "];")

}

//Imprimir True
func (g *Generator) PrintTrue() {
	g.AddPrintf("c", "(int)"+fmt.Sprintf("%v", 116))
	g.AddPrintf("c", "(int)"+fmt.Sprintf("%v", 114))
	g.AddPrintf("c", "(int)"+fmt.Sprintf("%v", 117))
	g.AddPrintf("c", "(int)"+fmt.Sprintf("%v", 101))
}

//Imprimir False
func (g *Generator) PrintFalse() {
	g.AddPrintf("c", "(int)"+fmt.Sprintf("%v", 102))
	g.AddPrintf("c", "(int)"+fmt.Sprintf("%v", 97))
	g.AddPrintf("c", "(int)"+fmt.Sprintf("%v", 108))
	g.AddPrintf("c", "(int)"+fmt.Sprintf("%v", 115))
	g.AddPrintf("c", "(int)"+fmt.Sprintf("%v", 101))

}
