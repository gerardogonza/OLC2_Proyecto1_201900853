package main

import (
	"fmt"
	"html/template"
	"net/http"
)

type Codigo struct {
	Entrada string
	Salida  string
}

func main() {
	http.HandleFunc("/", Home)
	http.HandleFunc("/reportes", Reportes)
	http.HandleFunc("/ejecutar", Ejecutar)
	fmt.Println("Servidor Funcionando en el Puerto: 4200")
	http.ListenAndServe(":4200", nil)
}

func Home(w http.ResponseWriter, r *http.Request) {
	libro := Codigo{Entrada: " Go"}
	t, err := template.ParseFiles("frontend/index.html")
	if err != nil {

		fmt.Println("Hay un error en HTML")
		fmt.Println(err)
	}
	t.Execute(w, libro)
}
func Reportes(w http.ResponseWriter, r *http.Request) {
	libro := Codigo{Entrada: "Go"}
	t, err := template.ParseFiles("frontend/reportes.html")
	if err != nil {

		fmt.Println("Hay un error en HTML")
		fmt.Println(err)
	}
	t.Execute(w, libro)
}

var CodigoEntrada Codigo

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
	CodigoEntrada = Codigo{Entrada: r.FormValue("name")}
	t, err := template.ParseFiles("frontend/index.html")
	if err != nil {

		fmt.Println("Hay un error en HTML")
		fmt.Println(err)
	}
	// fmt.Println(CodigoEntrada.Entrada)
	CodigoEntrada.Salida = "Funciona"
	t.Execute(w, CodigoEntrada)
}
