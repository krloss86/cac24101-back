package ar.com.code24101.idiomas;

public class Ingles extends IdiomaBase implements IIdioma{
    
    public Ingles() {
        super("Ingles");
    }

    public void decir(String palabra) {
        System.out.println("Saying " + palabra);
    }

    
}
