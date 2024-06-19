package ar.com.code24101.controller;

import ar.com.code24101.domain.Movie;
import ar.com.code24101.dto.MovieDTO;
import ar.com.code24101.service.MovieService;

public class ActualizarMovieController {

    public static void main(String[] args) {
        MovieService service = new MovieService();

        Movie movie  = service.listarMovies().get(0);

        System.out.println("Original:");
        System.out.println(movie);

        //le cambio los datos
        movie.setApellido("nuevo apellido");
        movie.setApellido("nuevo nombre");

        MovieDTO movieToUpdateDTO = new MovieDTO(
            movie.getId(),
            movie.getNombre(), 
            movie.getApellido(),
            movie.getImagen(),
            movie.getEmail(),
            movie.getTipoClienteId());

        service.actualizar(movieToUpdateDTO);

        Movie actualizado = service.obtener(movie.getId());
        System.out.println(actualizado);
    }
}
