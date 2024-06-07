package ar.com.codo24101.log.main;

import ar.com.codo24101.log.service.LogService;

public class MainLog {

    public static void main(String[] args) {
        //1 mensaje
        String mensajeAEnviar = "Plan 10 gb a $25k";

        int servicioActivo = 3;
        //medio > SERVICE
        LogService service = new LogService(servicioActivo);
        
        service.enviar(mensajeAEnviar);
    }
}
