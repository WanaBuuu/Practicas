/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2ej1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nere1
 */
public class P2EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Analizar("leer x ; y <- 2 * x ; mostrar y ;");
        
    }
    
    public static void Analizar(String y){
	String[] partes = y.split(" ");
	Pattern patron = Pattern.compile("[^A-Za-z ]");
        
        
        for (String parte : partes) {
            
            //puede ser identificador
            if ("<-".equals(parte) || "*".equals(parte) || "/".equals(parte) || "-".equals(parte) || "+".equals(parte) || ";".equals(parte) || "leer".equals(parte) || "mostrar".equals(parte)){
                switch(parte){
                    case "leer":                
                    case "mostrar":
                        System.out.println("PALABRA CLAVE: " + parte.toUpperCase());
                        break;
                    case ";":
                        System.out.println("PUNTO Y COMA");
                        break;
                    case "<-":
                        System.out.println("SÍMBOLO DE ASIGNACIÓN");
                        break;
                    case "+":
                        System.out.println("OPERADOR DE SUMA");
                        break;
                    case "-":
                        System.out.println("OPERADOR DE RESTA");
                        break;
                    case "/":
                        System.out.println("OPERADOR DE DIVISIÓN");
                        break;
                    case "*":
                        System.out.println("OPERADOR DE MULTIPLICACIÓN");
                        break;
                    default:

                        break;
                }
            }
            else {
                if (parte.length() < 8 ){ 
                    Matcher encaja = patron.matcher(parte);
                       if(!encaja.find()){ 
                           System.out.println("IDENTIFICADOR: " + parte);
                       }
                      // else 
                          //System.out.println("nono");
                   }  
            }
            
            
        }
        System.out.println("--FIN DE CADENA--");
    }
}
