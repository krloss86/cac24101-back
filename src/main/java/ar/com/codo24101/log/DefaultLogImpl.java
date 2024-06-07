package ar.com.codo24101.log;

public class DefaultLogImpl implements ILog{

    public void loguear(String msj) {
        System.out.println("Escribienod en FS:" + msj);
    }
    
}
