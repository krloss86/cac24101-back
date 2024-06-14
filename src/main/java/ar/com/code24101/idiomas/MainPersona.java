package ar.com.code24101.idiomas;

public class MainPersona {

    public static void main(String[] args) {
        Persona alejo = new Persona("Alejo", new Espaniol());
        //alejo.decirEnTodosLosIdiomas("bla bla bla");

        alejo.aprender(new Ingles());
        alejo.aprender(new Chino());
        alejo.decirEnTodosLosIdiomas("bla bla bla");

        // alejo.olvidar(new Chino());
    }
}
