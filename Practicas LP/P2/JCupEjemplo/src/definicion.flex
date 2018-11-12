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
[a-zA-Z]+ { return new Symbol(sym.PALABRA,yyline,yycolumn,yytext()); }
{LineTerminator} { }
" " { }
. { return new Symbol(sym.OTRA_COSA,yyline,yycolumn,yytext()); }


