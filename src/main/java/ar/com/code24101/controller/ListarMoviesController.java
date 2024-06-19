package ar.com.code24101.controller;

import java.util.ArrayList;

import ar.com.code24101.domain.Movie;
import ar.com.code24101.service.MovieService;

public class ListarMoviesController {

    public static void main(String[] args) {
        //1 crear el service
        MovieService service = new MovieService();

        //2 ejecuto el metodo
        ArrayList<Movie> listado = service.listarMovies();

        System.out.println(listado);
    }
}
