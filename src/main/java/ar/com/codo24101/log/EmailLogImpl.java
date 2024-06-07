package ar.com.codo24101.log;

public class EmailLogImpl implements ILog{

    //como
    @Override
    public void loguear(String msj) {
        System.out.println("Enviando email a pepito");
        System.out.println(msj);
    }
}
