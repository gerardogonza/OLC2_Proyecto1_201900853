package main

import (
	"fmt"
	"html/template"
	"net/http"
	"proyecto1/environment"
	"proyecto1/generator"
	"proyecto1/instruction"
	"proyecto1/interfaces"
	"proyecto1/parser"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

type TreeShapeListener struct {
	*parser.BaseChemsListener
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitStart(ctx *parser.StartContext) {
	result := ctx.GetLista()

	var globalEnv environment.Environment
	globalEnv = environment.NewEnvironment(nil)

	var gen *generator.Generator
	gen = generator.NewGenerator()

	for _, s := range result.ToArray() {
		s.(interfaces.Instruction).Ejecutar(globalEnv, gen)
	}

	instruction.CodigoEntrada.Salida += "#include <stdio.h>\n"
	instruction.CodigoEntrada.Salida += "#include <math.h>\n"
	instruction.CodigoEntrada.Salida += "double HEAP[82000];\n"
	instruction.CodigoEntrada.Salida += "double STACK[82000];\n"
	instruction.CodigoEntrada.Salida += "double P;\n"
	instruction.CodigoEntrada.Salida += "double H;\n"
	instruction.CodigoEntrada.Salida += "double "

	instruction.CodigoEntrada.Salida += fmt.Sprintf("%v", gen.GetTemps().GetValue(0))
	gen.GetTemps().RemoveAtIndex(0)

	for _, s := range gen.GetTemps().ToArray() {
		instruction.CodigoEntrada.Salida += ", "
		instruction.CodigoEntrada.Salida += fmt.Sprintf("%v", s)
	}

	instruction.CodigoEntrada.Salida += ";\n\n"
	instruction.CodigoEntrada.Salida += "\nvoid main(){\n"

	for _, s := range gen.GetCode().ToArray() {
		instruction.CodigoEntrada.Salida += fmt.Sprintf("%v", s)
		instruction.CodigoEntrada.Salida += "\n"
	}

	instruction.CodigoEntrada.Salida += "\nreturn;\n}\n"

}

func main() {

	http.HandleFunc("/", Home)
	http.HandleFunc("/reportes", Reportes)
	http.HandleFunc("/ejecutar", Ejecutar)
	fmt.Println("Servidor Funcionando en el Puerto: 4200")
	http.ListenAndServe(":4200", nil)
}

func Home(w http.ResponseWriter, r *http.Request) {
	libro := instruction.Codigo{Entrada: " Go"}
	t, err := template.ParseFiles("frontend/index.html")
	if err != nil {

		fmt.Println("Hay un error en HTML")
		fmt.Println(err)
	}
	t.Execute(w, libro)
}
func Reportes(w http.ResponseWriter, r *http.Request) {

	t, err := template.ParseFiles("frontend/reportes.html")
	if err != nil {

		fmt.Println("Hay un error en HTML")
		fmt.Println(err)
	}
	t.Execute(w, instruction.CodigoEntrada)

}

func Ejecutar(w http.ResponseWriter, r *http.Request) {
	if err := r.ParseForm(); err != nil {
		fmt.Fprintf(w, "ParseForm() err: %v", err)
		return
	}
	instruction.CodigoEntrada.Entrada = r.FormValue("name")
	t, err := template.ParseFiles("frontend/index.html")

	instruction.CodigoEntrada.Salida = ""
	EjecutarGramatica(instruction.CodigoEntrada.Entrada)

	// fmt.Print(CodigoEntrada.Entrada)
	t.Execute(w, instruction.CodigoEntrada)
	if err != nil {

		fmt.Println("Hay un error en HTML")
		fmt.Println(err)
	}
}

func EjecutarGramatica(entrada string) {
	is := antlr.NewInputStream(entrada)
	// Create the Lexer
	lexer := parser.NewChemsLexer(is)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	// Create the Parser
	p := parser.NewChems(stream)
	p.BuildParseTrees = true
	tree := p.Start()
	antlr.ParseTreeWalkerDefault.Walk(NewTreeShapeListener(), tree)

}
