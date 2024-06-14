package ar.com.code24101.idiomas;

import java.util.LinkedList;
import java.util.List;

//java collection framework
public class Persona {

    private String nombre;
    private IIdioma idiomaNativo;
    //private IIdioma[] otrosIdiomas = new IIdioma[0];
    private List<IIdioma> otrosIdiomas = new LinkedList<>();

    public Persona(String nombre, IIdioma nativo) {
        this.nombre = nombre;
        this.idiomaNativo = nativo;
    }

    public void aprender(IIdioma nuevoIdioma) {
        //verifico si ya habla el nuevoIdioma que viene por parametro
        //API: reflection
        //Guards
        if(this.hablaEsteIdioma(this.idiomaNativo, nuevoIdioma)) {
            return;
        }
        
        if(this.otrosIdiomas.isEmpty()) {            
            this.otrosIdiomas.add(nuevoIdioma);
            return;
        }

        for(IIdioma i : this.otrosIdiomas) {            
            if(!this.hablaEsteIdioma(i, nuevoIdioma)) {
                this.otrosIdiomas.add(nuevoIdioma);
                break;
            }
        }        
    }

    public boolean hablaEsteIdioma(IIdioma origen,IIdioma destino) {
        //return origen.getClass().isAssignableFrom(destino.getClass());
        return origen.getNombre().equals(destino.getNombre());
    }

    public void decirEnTodosLosIdiomas(String palabra) {
        System.out.println(this.nombre);
        this.idiomaNativo.decir(palabra);
        for(IIdioma idioma : this.otrosIdiomas) {
            idioma.decir(palabra);
        }
    }

    public boolean isPoliglota() {
        return this.otrosIdiomas.size() > 0;
    }

    public int getCantidadIdiomas() {
        return this.otrosIdiomas.size() + 1;
    }

    public boolean sabeDecirEn(IIdioma idioma, String palabra)  {
        //tph
        return false;
    }
}
