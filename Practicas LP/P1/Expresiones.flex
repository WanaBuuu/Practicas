%%
%class Expresiones
%unicode
%standalone
%line
%column
%unicode
%state PARENTESIS, EXPRESION

%{
    int coment ;
	int coment1;
%}

%%
" " {}
'\n' {}
'\t' {}
'\b' {}
<YYINITIAL> "/*" {coment = 1; yybegin(COMENTARIO);}
<YYINITIAL> [a-zA-Z]+ {yybegin(EXPRESION);}
<YYINITIAL> [0-9]+ {yybegin(EXPRESION);}

<COMENTARIO> "(" {parent ++;}
<PARENTESIS> ")" {parent--; if (parent == 0) yybegin(YYINITIAL);}
<PARENTESIS> [a-zA-Z]+ {yybegin(EXPRESION);}
<PARENTESIS> [0-9]+ {yybegin(EXPRESION);}
<PARENTESIS> ['+''*''/'] {yybegin(YYINITIAL);}

<EXPRESION> [+*/] {yybegin(YYINITIAL);}
<EXPRESION> "-" {yybegin(YYINITIAL);}
<EXPRESION>  "(" {if(parent !=0) parent++; else parent = 1; yybegin(PARENTESIS);}
<EXPRESION> ")" {if(parent !=0) parent--; yybegin(PARENTESIS);}
. {System.out.println("Mejor pregunta a Nerea"+(yyline+1));}