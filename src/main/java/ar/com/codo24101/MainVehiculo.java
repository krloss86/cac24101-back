package ar.com.codo24101;

public class MainVehiculo {

    public static void main(String[] args) {
        
        //1 - crear el auto
        //instanciando un objeto de la clase vehiculo
        Vehiculo clio = new Vehiculo("renault","clio",2018,"12345678",5);
        
        //el clio esta vivo!!!

        clio.encender();

        clio.acelerar();
        clio.acelerar();
        clio.acelerar();
        clio.acelerar();
        clio.acelerar();
        
        clio.acelerar();

        clio.detener();
        
        clio.mostrarDatos();        
    }

    
}
