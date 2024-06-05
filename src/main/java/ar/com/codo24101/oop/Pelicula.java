package ar.com.codo24101.oop;

public class Pelicula extends Articulo{

    private String genero;

    public Pelicula(String titulo, String autor, Float precio, String img, String genero) {
        super(titulo, autor, precio, img);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() +  ", {Pelicula: {genero:" + genero + "}}";
    }

}
