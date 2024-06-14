package ar.com.code24101.idiomas;

public class Espaniol extends IdiomaBase implements IIdioma{
    
    public Espaniol() {
        super("Español");
    }

    public void decir(String palabra) {
        System.out.println("Diciendo " + palabra);
    }
}
