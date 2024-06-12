package ar.com.code24101.controller;

import ar.com.code24101.domain.Movie;
import ar.com.code24101.service.MovieService;

public class ObtenerMovieController {

    public static void main(String[] args) {

        Long idMovie = 1l;

        MovieService service = new MovieService();

        Movie movie = service.obtener(idMovie);

        //mapper > Movie > MovieDTO: TPH
        System.out.println(movie);
    }
}
