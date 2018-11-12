%%
%class ContarPalabrasYCaracteres
%unicode
%standalone
%line
%column
%unicode

%{
	int numpalabras=0,numnumeros=0,numcaracteresex=0, numcaracteres = 0;
        boolean espacio = false;
%}

%eofval{
	System.out.println("El numero de lineas que contiene el fichero es " + (yyline+1));
	System.out.println("El numero de palabras que contiene el fichero es " + numpalabras);
	System.out.println("El numero de numeros que contiene el fichero es " + numnumeros);
	System.out.println("El numero de caracteres que contiene el fichero es " + numcaracteres);
	System.out.println("El numero de caracteres alfanumericos que contiene el fichero es " + (numcaracteres-numnumeros));
	
	return 0;
%eofval}

%%
[\b\r] { }
[(" ")] {
    if(!espacio){
        numpalabras++;numcaracteres++;}
    espacio = true;
}
[a-zA-z] {numcaracteres++;espacio = false;}
[0-9] {
    numnumeros++;
    numcaracteres++;
    espacio = false;
}
. {System.out.println("Caracter desconocido detectado"); }