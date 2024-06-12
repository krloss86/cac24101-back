package ar.com.code24101.dao;

import ar.com.code24101.domain.Movie;
import ar.com.code24101.dto.MovieDTO;

public interface MovieDAO {

    public Movie getById(Long id);
    public void create(MovieDTO movieDto);
}
