package ar.com.codo24101.oop;

import java.util.ArrayList;

public class Buscador {

    private String claveDeBusqueda;//null
    private ArrayList<Articulo> resultados;//null

    public Buscador() {
        //cuando nace????
        this.resultados = new ArrayList<>();
    }

    public int getCantidad() {
        return this.resultados.size();
    } 

    public void setClave(String clave){
        if(clave == null) {
            this.claveDeBusqueda = "";
        }else {
            this.claveDeBusqueda = clave;
        }
    }

    public void buscar() {
        //"harcodear" los datos
        
        Libro art = new Libro(claveDeBusqueda,"sin autor",8800f, "http://bla.com.ar/img/bla.jpg","1234654");
        //agrego al array de resultados
        resultados.add(art);

        Pelicula p = new Pelicula(claveDeBusqueda, "autor1", 6600f, "http://ble.com/img/ble.jpg", "TERROR");
        resultados.add(p);
    }

    public void mostrarResultados() {
        System.out.println("Hemos Encontrado "+ getCantidad() + " Resultados Para 'Iron Man'");

        for(Articulo art : resultados) {
            //polimorfismo
            System.out.println(art.toString());
        }
    }
}
