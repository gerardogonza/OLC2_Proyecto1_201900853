package interfaces

type Symbol struct {
	Id       string
	Tipo     TipoExpresion
	Muteable bool
	Valor    interface{}
}

type Expresion interface {
	Ejecutar(env interface{}) Symbol
}

type Instruction interface {
	Ejecutar(env interface{}) interface{}
}
