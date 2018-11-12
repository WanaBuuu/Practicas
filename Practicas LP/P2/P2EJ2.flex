%%
%class Expresiones
%unicode
%standalone
%line
%column
%unicode
%state PARENTESIS, EXPRESION

%{
    int cont, cont1, cont2, cont3 ;
	StringBuffer id, poperador;
%}

%%
" " {}
'\t' {}
'\b' {}
//[^\n]'\n' {}

<YYINITIAL> "/*" {coment = 1; yybegin(COMENTATIO); System.out.println("COMENTARIO ABIERTO");}
<YYINITIAL> [A-Za-z] {cont1 = 1; id.append(yytext()); yybegin(VARIABLEFINAL);}
<YYINITIAL> "leer" {cont2 = 1; yybegin(ID); System.out.println("PALABRA CLAVE LEER");}
<YYINITIAL> "mostrar" {cont2 = 1; yybegin(ID);  System.out.println("PALABRA CLAVE MOSTRAR");}

<COMENTATIO> "/*" {cont ++;}
<COMENTATIO> "*/" {cont --; if(cont == 0) yybegin(YYINITIAL);  System.out.println("COMENTARIO CERRADO");}
<COMENTATIO> [^\n] {}

<ID> [A-zA-Z] {cont2 ++;}
<ID> ";" {if(cont2 < 9){id.append(yytext()); yybegin(YYINITIAL);}  System.out.println("IDENTIFICADOR: ");}

<VARIABLEFINAL> [A-Za-z] {cont1 ++; }
<VARIABLEFINAL> "<-" {if(cont1 < 9){id.append(yytext()); yybegin(EXPRESION);}  System.out.println("SÍMBOLO DE ASIGNACIÓ");}

<EXPRESION> [1-9][0-9]*[+*/][1-9][0-9]*";" {yybegin(YYINITIAL);  System.out.println("OPERADOR DE " +  +);}
<EXPRESION> [1-9][0-9]*[+*/][A-zA-Z] {cont2 ++; id.append(yytext()); yybegin(ID); System.out.println("OPERADOR DE " +  +);}
<EXPRESION> [A-zA-Z] {cont3 = 1; id.append(yytext()); yybegin(VARIABLEINICIAL);}

<VARIABLEINICIAL> [A-Za-z] {cont3 ++;}
<VARIABLEINICIAL> [+/*][1-9][0-9]* {if(cont3 < 9){id.append(yytext()); yybegin(YYINITIAL);} System.out.println("IDENTIFICADOR: " + + "OPERADOR DE " +  +);}
<VARIABLEINICIAL> [+/*][A-Za-z] {if(cont3 < 9){cont2 = 1; id.append(yytext()); yybegin(ID);} System.out.println("OPERADOR DE " +  + " ");}

. {System.out.println("Mejor pregunta a Nerea" +(yyline+1));}