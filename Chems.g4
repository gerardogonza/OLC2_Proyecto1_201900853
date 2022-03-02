parser grammar Chems;



options {
  tokenVocab = ChemsLexer;
}

@header {
    import "proyecto1/interfaces"
    import "proyecto1/expresion"
    import "proyecto1/instruction"
    import arrayList "github.com/colegno/arraylist"

}

start returns [*arrayList.List lista]
  : instrucciones {$lista = $instrucciones.l}
;

instrucciones returns [*arrayList.List l]
  @init{
    $l =  arrayList.New()
  }
  : e +=instruccion*  {
      listInt := localctx.(*InstruccionesContext).GetE()
      		for _, e := range listInt {
            $l.Add(e.GetInstr())
          }
    }
;


instruccion returns [interfaces.Instruction instr]
  :PRINTLN DIFERENTE PARIZQ  expression PARDER ';' {$instr = instruction.NewImprimir($expression.p)}
  | P_LET muteable=mut isArray=array_st id=ID DOSPUNTOS isTipo=tipo IGUAL expression ';'{$instr = instruction.NewDeclaration($id.text,$isTipo.p,$expression.p, $isArray.arr,$muteable.arr)	}
  | P_LET muteable=mut isArray=array_st id=ID IGUAL expression ';'{$instr = instruction.NewDeclaration($id.text,interfaces.NULL,$expression.p, $isArray.arr,$muteable.arr)	}
  | id=ID '=' expression ';'{$instr = instruction.NewAssignment($id.text,$expression.p)}
  | P_IF expression LLAVEIZQ instrucciones LLAVEDER  {$instr = instruction.NewIf($expression.p, $instrucciones.l,false,nil)}
  | P_IF expression LLAVEIZQ i1=instrucciones LLAVEDER P_ELSE LLAVEIZQ i2=instrucciones LLAVEDER {$instr = instruction.NewIf($expression.p, $i1.l,true,$i2.l)}
  | P_WHILE expression LLAVEIZQ instrucciones LLAVEDER  {$instr = instruction.NewWhile($expression.p, $instrucciones.l)}                                                            
; 

tipo returns[interfaces.TipoExpresion p]
:P_F64{$p=interfaces.FLOAT}
|P_I64{$p=interfaces.INTEGER}
|P_STRING{$p=interfaces.STRING}
;
mut returns [bool arr]
:P_MUT { $arr = true }
|
;

array_st returns [bool arr]
   : CORIZQ CORDER { $arr = true }
   |
;

expression returns[interfaces.Expresion p]
    : expr_arit    {$p = $expr_arit.p}
;

expr_arit returns[interfaces.Expresion p]
    : opIz = expr_arit op=('*'|'/') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false)}
    | opIz = expr_arit op=('+'|'-') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false)}     
    | reservada=(P_F64|P_I64) DOSPUNTOS DOSPUNTOS op=(P_POW|P_POWF) PARIZQ opIz = expr_arit COMA opDe = expr_arit PARDER{$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false)}     
    | opIz = expr_arit op=('<'|'<='|'>='|'>'|IGUALIGUA|DIFERENTEDE|MODULO|OR|AND) opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false)}   
    | CORIZQ listValues CORDER { $p = expresion.NewArray($listValues.l) }
    | primitivo {$p = $primitivo.p} 
    | PARIZQ expression PARDER {$p = $expression.p}
   
;

listValues returns[*arrayList.List l]
    : list=listValues ',' expression { 
                                        $list.l.Add($expression.p)
                                        $l = $list.l
                                    }
    | expression { 
                    $l = arrayList.New()
                    $l.Add($expression.p)
                }
;

primitivo returns[interfaces.Expresion p]
    :NUMBER {
            	num,err := strconv.Atoi($NUMBER.text)
                if err!= nil{
                    fmt.Println(err)
                }
                
            $p = expresion.NewPrimitivo (num,interfaces.INTEGER)
       } 
    | STRING { 
              
      str:= $STRING.text[1:len($STRING.text)-1]
     
      $p = expresion.NewPrimitivo(str,interfaces.STRING)}
    |DECIMAL {
            	num,err := strconv.ParseFloat($DECIMAL.text,64)
                if err!= nil{
                    fmt.Println(err)
                }
            $p = expresion.NewPrimitivo (num,interfaces.FLOAT)
       } 
    | DECIMAL P_AS P_I64{
            	num,err := strconv.ParseFloat($DECIMAL.text,64)
                if err!= nil{
                    fmt.Println(err)
                }
            a := int(num)
            $p = expresion.NewPrimitivo (a,interfaces.INTEGER)
       } 
    | NUMBER P_AS P_F64{
           num,err := strconv.Atoi($NUMBER.text)
                if err!= nil{
                    fmt.Println(err)
                }
            a := float64(num)  
            $p = expresion.NewPrimitivo (a,interfaces.FLOAT)
       }  
    |list=listArray { $p = $list.p}
     | P_TRUE {      
      $p = expresion.NewPrimitivo("true",interfaces.TRUE)}
       | P_FALSE {      
      $p = expresion.NewPrimitivo("false",interfaces.FALSE)}
;

listArray returns[interfaces.Expresion p]
    : list = listArray CORIZQ expression CORDER { $p = expresion.NewArrayAccess($list.p, $expression.p) }
    | ID { $p = expresion.NewCallVariable($ID.text)}
    ;