package ar.com.codo24101.oop;

public class Articulo {

    /*atributos */
    private String titulo;
    private String autor;
    private Float precio;
    private String img;
   
    /* constructor/es */
    public Articulo(String titulo, String autor, Float precio, String img) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.img = img;
    }

    /*metodos: setters/getters */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "{Articulo: {img:" + img + ", titulo:" + titulo + ", autor:" + autor + ", precio:" + precio + "}}";
    }  
 
    
}
