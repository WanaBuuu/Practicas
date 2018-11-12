%%
%class Expresiones
%unicode
%standalone
%line
%column
%unicode
%state E,E2,R,ESPACIO,ASIGNACION,O,S,T,R2,A,R3,ESPACIO2,id

%{
    StringBuffer todo;
%}

%%



<YYINITIAL> " " {}
<YYINITIAL> '\t' {}
<YYINITIAL> '\n' {}
<YYINITIAL> '\b' {}
<YYINITIAL> [1-9][0-9]* {}
<YYINITIAL> ; {System.out.println("PUNTO Y COMA")}
<YYINITIAL> <= {System.out.println("SIMBOLO DE ASIGNACION");}
<YYINITIAL> / {System.out.println("OPERACIÓN DIVISIÓN");}
<YYINITIAL> * {System.out.println("OPERACIÓN MULTIPLICACIÓN");}
<YYINITIAL> + {System.out.println("OPERACIÓN SUMA");}
<YYINITIAL> "-" {System.out.println("OPERACIÓN RESTA");}
<YYINITIAL> l {cont = 1; yybegin(E);}
<YYINITIAL> m {cont = 1; yybegin(O);}
<YYINITIAL> [A-Za-z] {cont = 1; yybegin(ID);}

<E> e {cont ++; yybegin(E2);}
<E> [a-df-zA-DF-Z] {cont ++; yybegin(ID);}
<E2> e {cont ++; yybegin(r);}
<E2> [a-df-zA-DF-Z] {cont ++; yybegin(ID);}
<R> r {cont ++; yybegin(ESPACIO);}
<R> [a-qs-zA-QS-Z] {cont ++; yybegin(ID);}
<ESPACIO> \b {System.out.println("PALABRA CLAVE LEER"); yybegin(YYINITIAL);}
<ESPACIO> [A-Za-Z] {cont ++; yybegin(ID);}
<ESPACIO> < {yybegin(ASIGNACION)}
<ESPACIO> / {System.out.println("OPERACIÓN DIVISIÓN"); yybegin(YYINITIAL);}
<ESPACIO> * {System.out.println("OPERACIÓN MULTIPLICACIÓN"); yybegin(YYINITIAL);}
<ESPACIO> + {System.out.println("OPERACIÓN SUMA");yybegin(YYINITIAL);}
<ESPACIO> "-" {System.out.println("OPERACIÓN RESTA"); yybegin(YYINITIAL);}

<ASIGNACION> = {System.out.println("SIMBOLO DE ASIGNACION"); yybegin(YYINITIAL);}

<O> o {cont ++; yybegin(S);}
<O> [a-np-zA-NP-Z] {cont ++; yybegin(ID);}
<S> s {cont ++; yybegin(T);}
<S> [a-rt-zA-Rt-Z] {cont ++; yybegin(ID);}
<T> t {cont ++; yybegin(R2);}
<T> [a-su-zA-SU-Z] {cont ++; yybegin(ID);}
<R2> r {cont ++; yybegin(A);}
<R2> [a-qs-zA-QS-Z] {cont ++; yybegin(ID);
<A> a {cont ++; yybegin(R3);}
<A> [b-zB-Z] {cont ++; yybegin(ID);
<R3> r {cont ++; yybegin(ESPACIO2);}
<R3> [a-qs-zA-QS-Z] {cont ++; yybegin(ID);
<ESPACIO2> \b {System.out.println("PALABRA CLAVE MOSTRAR"); yybegin(YYINITIAL);}
<ESPACIO2> [A-Za-Z] {cont ++; yybegin(ID);}
<ESPACIO2> < {yybegin(ASIGNACION)}
<ESPACIO2> / {System.out.println("OPERACIÓN DIVISIÓN"); yybegin(YYINITIAL);}
<ESPACIO2> * {System.out.println("OPERACIÓN MULTIPLICACIÓN"); yybegin(YYINITIAL);}
<ESPACIO2> + {System.out.println("OPERACIÓN SUMA");yybegin(YYINITIAL);}
<ESPACIO2> "-" {System.out.println("OPERACIÓN RESTA"); yybegin(YYINITIAL);}

<id> [A-Za-Z] {cont ++;}
<id> [^A-Za-Z] {if(cont >0 && cont <= 8) {System.out.println("IDENTIFICADOR"); yybegin(YYINITIAL);}

. {System.out.println("Mejor pregunta a Nerea"+(yyline+1));}










