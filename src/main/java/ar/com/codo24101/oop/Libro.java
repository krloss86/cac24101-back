package ar.com.codo24101.oop;

public class Libro extends Articulo {

    /*atributos */
    private String isbn;

    /*contructores */
    public Libro(
        String titulo, String autor, Float precio, String img,//es un articulo
        String isbn
    ) {
        //nace el padre
        super(titulo, autor, precio, img);

        //nace el hijo
        this.isbn = isbn;
    }

    /*metodos */
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        //mostra lo del padre + lo del hijo
        return super.toString()      + ", {Libro: {isbn=" + isbn + "}}";
    } 
    
    
}
