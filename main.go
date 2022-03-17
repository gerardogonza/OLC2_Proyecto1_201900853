package main

import (
	"fmt"
	"html/template"
	"net/http"
	"proyecto1/environment"
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

	for _, s := range result.ToArray() {

		s.(interfaces.Instruction).Ejecutar(globalEnv)
	}

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
	// if err := r.ParseForm(); err != nil {
	// 	fmt.Fprintf(w, "ParseForm() err: %v", err)
	// 	return
	// }
	// fmt.Fprintf(w, "Post from website! r.PostFrom = %v\n", r.PostForm)
	// name := r.FormValue("name")
	// CodigoEntrada.Entrada = name
	// fmt.Println(CodigoEntrada.Entrada)
	// fmt.Fprintf(w, "Name = %s\n", name)

	if err := r.ParseForm(); err != nil {
		fmt.Fprintf(w, "ParseForm() err: %v", err)
		return
	}
	instruction.CodigoEntrada.Entrada = r.FormValue("name")
	t, err := template.ParseFiles("frontend/index.html")
	if err != nil {

		fmt.Println("Hay un error en HTML")
		fmt.Println(err)
	}
	instruction.CodigoEntrada.Salida = ""
	EjecutarGramatica(instruction.CodigoEntrada.Entrada)

	// fmt.Print(CodigoEntrada.Entrada)
	t.Execute(w, instruction.CodigoEntrada)
}

func EjecutarGramatica(entrada string) {
	// is := antlr.NewInputStream(entrada)

	// // Create the Lexer
	// lexer := parser.NewAnalizadorLexer(is)

	// // Read all tokens
	// for {
	// 	t := lexer.NextToken()
	// 	if t.GetTokenType() == antlr.TokenEOF {
	// 		break
	// 	}
	// fmt.Printf("%s (%q)\n",
	// 	lexer.SymbolicNames[t.GetTokenType()], t.GetText())
	// }

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
