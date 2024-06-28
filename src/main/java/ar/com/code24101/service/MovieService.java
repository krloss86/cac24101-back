package ar.com.code24101.service;

import java.util.ArrayList;

import ar.com.code24101.dao.MovieDAO;
import ar.com.code24101.dao.MovieJDBCMysqlImpl;
import ar.com.code24101.domain.Movie;
import ar.com.code24101.dto.MovieDTO;

public class MovieService {

    private MovieDAO dao;//???

    public MovieService() {
        //Interface i = new ClaseQueImplementaLaInterface();
        this.dao = new MovieJDBCMysqlImpl();
    }

    public Movie obtener(Long id) {
        return this.dao.getById(id);
    }

    public void crear(MovieDTO dto) {

        Movie movie = new Movie(dto.getNombre(), 
            dto.getApellido(),
            dto.getImagen(),
            dto.getEmail(),
            dto.getTipoClienteId());

        this.dao.create(movie);//ctrl+click
    }

    public ArrayList<Movie> listarMovies() {
        return this.dao.findAll();
    }

    public void actualizar(MovieDTO dto) {
        Movie movie = new Movie(
            dto.getId(),
            dto.getNombre(), 
            dto.getApellido(),
            dto.getImagen(),
            dto.getEmail(),
            dto.getTipoClienteId());
        this.dao.update(movie);
    }

    public void eliminar(Long id) {
       this.dao.delete(id);
    }
}
 