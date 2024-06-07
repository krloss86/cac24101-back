package ar.com.codo24101.log;

public class SMSLogImpl implements ILog{
    
    public void loguear(String msj) {
        //¿cuál es la lógica de este método?
        System.out.println("Enviando mensaje al:1132123231 " + msj);
        System.out.println(msj);
    }
}
