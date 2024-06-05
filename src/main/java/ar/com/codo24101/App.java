package ar.com.codo24101;//paquete: contiene paquetes y codigo fuente.

/**
 * Hello world!
 *
 */
//public class: palabras reservadas del lenguaje
//App nombre de la clase = nombre del archivo
public class App {

    public static void main( String[] args ) {//la funcion principal de nuestro programa.    
        /*tipos de  datos primitivos en java */
        // numeros enteros
        byte bt = 127; 
        short s = -3276;
        int a = 10; // rango de representacion de la variable
        long b = 10;
        //---enteros

        // numeros decimales
        float f = 10.5f;
        double d = 10.5;//los decimales en java son double
        
        //byte < short < int < long < float < double

        char letra = 'a';
        String palabra = "soy carlos";

        //boolean
        boolean flag;//false

        //TIPOS - WRAPPER / Clases!!
        Byte bb = 10;
        Short sh = 10;
        Integer aa = 10; //Clases
        Long ll = 10l;

        Float ff = 10F;
        Double dd = 10d;

        Object cajaGrande = 10;//

        //HAY MUCHAS MAS TIPOS (CLASES)

        //O.O.P
        //INTERFACES
        //JDBC > MYSQL
        // Controller (mvc)
        // api rest (endpoint) alimentar nuestro (uds) 'frontend'
        // get/post/put/delete       

        System.out.println( "Hello World!" );
    }
}
