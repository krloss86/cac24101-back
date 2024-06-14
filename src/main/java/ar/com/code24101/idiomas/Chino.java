package ar.com.code24101.idiomas;

public class Chino extends IdiomaBase implements IIdioma {
    
    public Chino() {
        super("Chino");
    }

    @Override
    public void decir(String palabra) {
        System.out.println("dicienod en chino: " + palabra);        
    }
}
