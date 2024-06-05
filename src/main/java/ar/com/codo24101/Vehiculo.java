package ar.com.codo24101;
import java.time.LocalDate;

public class Vehiculo {
    /*atributos */
    private String marca;//null
    private String modelo;
    private Integer anio;
    private String chasis;
    private Integer velocidad;
    private Integer vmax;
    private Boolean encendido;
    private LocalDate fechaCreacion; //tph: ver los diferentes tipos de fechas

    //java me da un constructor por defecto
    /* contructor */
    public Vehiculo(String marca,String modelo,Integer anio,String chasis,Integer vmax) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.chasis = chasis;
        this.vmax = vmax; 
        this.encendido = false;//nace apagado
        this.velocidad = 0;
        this.fechaCreacion = LocalDate.now();        
    }

    /* metodos */
    public void encender() {//firma del metodo
        if(!this.encendido) {
            this.encendido = true;
        }else {
            System.out.println("el auto ya esta encendido");
        }
    }

    public void apagar() {
        if(this.encendido) {
            this.encendido = false;
        }else {
            System.out.println("auto apagado");
        }
    }

    public void acelerar() {
        if(this.encendido) {
            if(this.velocidad < this.vmax) {
                this.velocidad ++;
            }else {
                System.out.println("llegamos a la velocidad maxima");
            }
        }else {
            System.out.println("auto apagado, no puede acelerar");
        }
    }

    public void frenar() {
        if(this.encendido && this.velocidad > 0) {
            this.velocidad--;
        }
    }

    public Integer obtenerVelocidad() {
        return this.velocidad;
    }

    public LocalDate obtenerFechaCreacion() {
        return this.fechaCreacion;
    }
   
    public void mostrarDatos() {
        System.out.println("{Vehiculo : {marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", chasis=" + chasis
                + ", velocidad=" + velocidad + ", vmax=" + vmax + ", encendido=" + encendido + ", fechaCreacion="
                + fechaCreacion + "}}");
    }
    
    public void detener() {
        if(this.encendido) {
            System.out.println(this.velocidad);
            for(int i=this.velocidad; i >=0; i--) {
                this.velocidad--;
                System.out.println(this.velocidad);
            } 
            System.out.println("Se ha detenido al auto");
        }
    }

}
