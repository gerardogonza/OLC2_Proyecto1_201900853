package interfaces

type TipoExpresion int

const (
	INTEGER TipoExpresion = iota
	FLOAT
	STRING
	BOOLEAN
	ARRAY
	TRUE
	FALSE
	NULL
)
