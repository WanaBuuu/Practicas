
import java_cup.runtime.Symbol;
%%
%unicode
%standalone
%line
%column
%unicode
%cup
 

LineTerminator = \r|\n|\r\n	 

%%

leer {return new Symbol(sym.LEER, yyline, yycolumn, yytext());}
mostrar {return new Symbol(sym.MOSTRAR, yyline, yycolumn, yytext());}
<"-" {return new Symbol(sym.ASIGNACION, yyline, yycolumn, yytext());}
; {return new Symbol(sym.PUNTOYCOMA, yyline, yycolumn, yytext());}
[1-9][0-9]* {return new Symbol(sym.NUMERO, yyline, yycolumn, new Integer(yytext()));}
[/*+]|"-" return new Symbol(sym.OPERADOR, yyline, yycolumn, yytext());}
[a-zA-Z]+ {if(yytext().length() > 8) System.out.println("Identificador se excede del tamaño"); return new Symbol(sym.ID, yyline, yycolumn, yytext());}
"\r"|"\n"|"\n\r"|" " {}

. { return new Symbol(sym.OTRA_COSA,yyline,yycolumn,yytext()); }
