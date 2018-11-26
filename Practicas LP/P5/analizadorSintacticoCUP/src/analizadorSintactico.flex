import java.io.*;
import java_cup.runtime.*;

%%
%class AnalizadorLexico
%unicode
%char
%line
%column
%cup


%state variable, asignacion, ptoycoma, operador, comentario

%{
    int contador, parentesis;
%}

%init{
    contador = 0;
    parentesis = 0;
%init}



%%
    <YYINITIAL> {
        "//" { return new Symbol(sym.COMENTARIOLINEA, yyline, yycolumn, yytext()); }
        "(" { return new Symbol(sym.PA, yyline, yycolumn, yytext()); }
        ")" { return new Symbol(sym.PC, yyline, yycolumn, yytext()); }
        "leer" { return new Symbol(sym.LEER, yyline, yycolumn, yytext()); }
        "mostrar" { return new Symbol(sym.MOSTRAR, yyline, yycolumn, yytext()); }
        [:letter:] { return new Symbol(sym.VARIABLE, yyline, yycolumn, yytext()); }
        [:digit:]  { return new Symbol(sym.NUMERO, yyline, yycolumn, yytext()); }
        "/*" {contador = 1; yybegin(comentario); return new Symbol(sym.ABROCOMENTARIO, yyline, yycolumn, yytext()); }
        "<""-" {  return new Symbol(sym.ASIGNACION, yyline, yycolumn, yytext()); }
        "+"|"-"|"*"|"/" { 
                
            if(yytext().contains("+")){

                return new Symbol(sym.SUMA, yyline, yycolumn, yytext());
            }
            if(yytext().contains("-")){

                return new Symbol(sym.RESTA, yyline, yycolumn, yytext());
            }
            if(yytext().contains("*")){

                return new Symbol(sym.MULTIPLICACION, yyline, yycolumn, yytext());
            }
            if(yytext().contains("/")){

                return new Symbol(sym.DIVISION, yyline, yycolumn, yytext());
            }
        }

        ";" { return new Symbol(sym.PTOYCOMA, yyline, yycolumn, yytext());  }
    }
    <comentario> "/*"   {contador++; }
    <comentario> "*/"   {contador--;  yybegin(YYINITIAL); if(contador == 0){ return new Symbol(sym.CIERROCOMENTARIO, yyline, yycolumn, yytext());}}
    " " | "\n" | "\r\n" { }
    . { }

    