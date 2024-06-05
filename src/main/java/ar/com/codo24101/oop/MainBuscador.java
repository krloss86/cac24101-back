package ar.com.codo24101.oop;

public class MainBuscador {

    public static void main(String[] args) {
        String claveEnviadaPorElUsuarioEnElForm = "harry potter";

        //1 instancio el buscador
        Buscador b = new Buscador();

        //2 seteo la clave de busqueda
        b.setClave(claveEnviadaPorElUsuarioEnElForm);

        //3 busco
        b.buscar();

        //4 muestro los resultados
        b.mostrarResultados();
    }
}
