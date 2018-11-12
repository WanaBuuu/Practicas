import java.io.*;
import java.io.IOException;
%%

%class Comentarios
%unicode
%line
%char
%column
%standalone
%debug
%{
    FileWriter cod;
    FileWriter com;
    StringBuffer codigo = new StringBuffer();
    StringBuffer comentario = new StringBuffer();
%}

%init{
    try{
	cod = new FileWriter("salida.cod");
	com = new FileWriter("salida.com");}
    catch (IOException ex)
    {
        System.out.println("ERROR");}
%init}

%eofval{
        com.write(comentario.toString());
        cod.write(codigo.toString());
        System.out.println("Comentario: " + '\n' +comentario.toString());
	System.out.println("Codigo: " + '\n' +codigo);
        System.out.println("Los ficheros se han generado correctamente.");
        com.close();
        cod.close();
	return 0;
%eofval}

%%

"//"+[a-zA-Z" "]+ { 
    comentario.append(yytext());
    comentario.append('\n');
}

"/**""*"*[^"*/"]+"*/" {
    comentario.append(yytext());
    comentario.append('\n');
}

. {codigo.append(yytext());}
	
	
