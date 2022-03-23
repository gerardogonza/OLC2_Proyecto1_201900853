package interfaces

type TipoExpresion int

const (
	INTEGER TipoExpresion = iota
	FLOAT
	STRING
	BOOLEAN
	CHAR
	ARRAY
	TRUE
	FALSE
	NULL
	BREAK
	CONTINUE
	VECTOR
	PUSH
	INSERT
	REMOVE
	LEN
)
