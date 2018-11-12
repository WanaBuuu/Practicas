
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\020\000\002\002\004\000\002\002\003\000\002\003" +
    "\003\000\002\003\004\000\002\004\005\000\002\004\005" +
    "\000\002\004\010\000\002\004\004\000\002\004\003\000" +
    "\002\004\004\000\002\005\003\000\002\005\003\000\002" +
    "\006\003\000\002\006\003\000\002\006\003\000\002\006" +
    "\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\016\003\011\005\010\006\006\007\005\011" +
    "\012\013\013\001\002\000\004\002\037\001\002\000\004" +
    "\006\035\001\002\000\004\010\022\001\002\000\020\002" +
    "\uffff\003\011\005\010\006\006\007\005\011\012\013\013" +
    "\001\002\000\004\006\017\001\002\000\004\004\016\001" +
    "\002\000\004\012\015\001\002\000\020\002\ufff9\003\ufff9" +
    "\005\ufff9\006\ufff9\007\ufff9\011\ufff9\013\ufff9\001\002\000" +
    "\004\002\000\001\002\000\020\002\ufffa\003\ufffa\005\ufffa" +
    "\006\ufffa\007\ufffa\011\ufffa\013\ufffa\001\002\000\020\002" +
    "\ufff8\003\ufff8\005\ufff8\006\ufff8\007\ufff8\011\ufff8\013\ufff8" +
    "\001\002\000\004\004\020\001\002\000\020\002\ufffd\003" +
    "\ufffd\005\ufffd\006\ufffd\007\ufffd\011\ufffd\013\ufffd\001\002" +
    "\000\004\002\ufffe\001\002\000\006\006\025\014\023\001" +
    "\002\000\014\004\ufff6\015\ufff6\016\ufff6\017\ufff6\020\ufff6" +
    "\001\002\000\012\015\031\016\030\017\027\020\032\001" +
    "\002\000\014\004\ufff7\015\ufff7\016\ufff7\017\ufff7\020\ufff7" +
    "\001\002\000\006\006\025\014\023\001\002\000\006\006" +
    "\ufff2\014\ufff2\001\002\000\006\006\ufff4\014\ufff4\001\002" +
    "\000\006\006\ufff5\014\ufff5\001\002\000\006\006\ufff3\014" +
    "\ufff3\001\002\000\004\004\034\001\002\000\020\002\ufffb" +
    "\003\ufffb\005\ufffb\006\ufffb\007\ufffb\011\ufffb\013\ufffb\001" +
    "\002\000\004\004\036\001\002\000\020\002\ufffc\003\ufffc" +
    "\005\ufffc\006\ufffc\007\ufffc\011\ufffc\013\ufffc\001\002\000" +
    "\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\010\002\003\003\013\004\006\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\020\004\006\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\023\001\001" +
    "\000\002\001\001\000\004\006\025\001\001\000\002\001" +
    "\001\000\004\005\032\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    final int MAX = 15;
    int contador = 0;
    boolean error = false;
    Vector constantes = new Vector();
    Vector<String> variables = new Vector<String>();
    Hashtable <String,String> ht= new Hashtable<>();
    String s="",s2="";

    public static void main(String[] arg){
        if (arg.length!=1)
          System.out.println("Debe dar el nombre del fichero de entrada como parametro");
        else
        {
             String fileName=arg[0];
             AnalizadorLexico miAnalizadorLexico=null;
             parser parserObj=null;
             Symbol x=null;

             try{
               miAnalizadorLexico =
                 new AnalizadorLexico(new InputStreamReader(new FileInputStream(fileName)));

             } catch (IOException e){
               System.err.println("Fichero de entrada "+fileName+" no encontrado");
               System.exit(0);
             }
             try{
                parserObj = new parser(miAnalizadorLexico);
                parserObj.parse();
             } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
             } 
          } // end else
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {



  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= programa EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // programa ::= lista_instrucciones 
            {
              String RESULT =null;
		int lileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int liright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String li = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 for(Enumeration e = ht.keys(); e.hasMoreElements(); )
                                        s+="var_"+e.nextElement()+":     .word 0\n";
                                       for(int i = 0; i < constantes.size(); i++)
                                        s2+= "  .word "+constantes.get(i)+"\n";
                                        RESULT = li + " .data \n" + s +                                                
                                                "constants: \n" + s2;
                                        System.out.println(RESULT);
                                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // lista_instrucciones ::= instruccion 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = i; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("lista_instrucciones",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // lista_instrucciones ::= instruccion lista_instrucciones 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int lileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int liright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String li = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = i + li; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("lista_instrucciones",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruccion ::= LEER VARIABLE PTOYCOMA 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                    if(!ht.containsKey(v) && contador <= MAX){
                        ht.put(v,"M"+contador);
                        System.out.println("Variable "+v+" almacenada.");
                        contador++;
                        
                        RESULT ="li    $v0, " + ht.get(v)+
                                "\n syscall \n" +
                                "sw    $v0, var_" + v + "\n\n";
                    }
                    else 
                        System.out.println("Error!: En linea " + (vleft+1) + " columna " + (vright+1) + " La variable " + v + " ya existe" );
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruccion ::= MOSTRAR VARIABLE PTOYCOMA 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                    if(!ht.containsKey(v))
                        System.out.println("Error!: No se ha definido la variable " + v + " en linea " + (vleft+1) + " columna " + (vright+1));
                    else {
                        RESULT ="lw   &a0, var_" + v + "\n" +
                                "li   &v0, 1 \n" +
                                "syscall \n\n";
                    }
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instruccion ::= VARIABLE ASIGNACION operando operador operando PTOYCOMA 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int o1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int o1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String o1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String op = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int o2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int o2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String o2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                    if(!ht.containsKey(v)){
                        ht.put(v,"M"+contador);
                        contador++;}
                    
                    RESULT ="lw    $t1, " + o1 + "\n" +
                            "lw    $t2, " + o2 + "\n" +
                            op + "$t0, $t1, $t2 \n" +
                            "sw    $t0, var_" + v + "\n\n";
                
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // instruccion ::= ABROCOMENTARIO CIERROCOMENTARIO 
            {
              String RESULT =null;
		
                    System.out.println("ABRO COMENTARIO");
                    System.out.println("CIERRO COMENTARIO");
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // instruccion ::= COMENTARIOLINEA 
            {
              String RESULT =null;
		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // instruccion ::= error PTOYCOMA 
            {
              String RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object p = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        System.out.println("Error en linea: " + (pleft+1));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // operando ::= VARIABLE 
            {
              String RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String v = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                if(ht.containsKey(v))
                    RESULT = "var_" + v;
                else
                    System.out.println("Error!: No se ha definido la variable " + v + " en linea " + (vleft+1) + " columna " + (vright+1));
                    
            
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operando",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // operando ::= NUMERO 
            {
              String RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                constantes.add(n);
                RESULT = "constantes+" + (constantes.indexOf(n) * 4); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operando",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // operador ::= SUMA 
            {
              String RESULT =null;
		 RESULT = "ADD ";
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operador",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // operador ::= RESTA 
            {
              String RESULT =null;
		RESULT = "SUB "; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operador",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // operador ::= DIVISION 
            {
              String RESULT =null;
		 RESULT = "DIV "; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operador",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // operador ::= MULTIPLICACION 
            {
              String RESULT =null;
		 RESULT = "MUL "; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operador",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
