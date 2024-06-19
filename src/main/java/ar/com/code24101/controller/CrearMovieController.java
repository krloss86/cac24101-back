package ar.com.code24101.controller;

import ar.com.code24101.dto.MovieDTO;
import ar.com.code24101.service.MovieService;

public class CrearMovieController {

    public static void main(String[] args) {            
        String nombre = "carlos";
        String apellido = "lopez";
        String email = "email@bla.com";
        String imString = "HTTP://asdassd.-cpomar";
        Long tipoClienteId = 1L;
        Long id = 1L;
        
        MovieDTO movieDto = new MovieDTO(id,nombre, apellido, imString, email, tipoClienteId);
    
        MovieService service = new MovieService();

        service.actualizar(movieDto);
    }
}
