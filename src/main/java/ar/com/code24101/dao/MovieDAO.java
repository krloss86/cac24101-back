package ar.com.code24101.dao;

import java.util.ArrayList;

import ar.com.code24101.domain.Movie;
public interface MovieDAO {

    public Movie getById(Long id);
    public void create(Movie movieDto);
    public ArrayList<Movie> findAll();/*ver como agregar LIMIT Y OFFSET */
	public void update(Movie movie);
}
