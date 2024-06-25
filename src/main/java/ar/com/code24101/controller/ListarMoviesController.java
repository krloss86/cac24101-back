package ar.com.code24101.controller;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.code24101.domain.Movie;
import ar.com.code24101.service.MovieService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ListarMoviesController")
public class ListarMoviesController extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {        
        //1 crear el service
        MovieService service = new MovieService();

        //2 ejecuto el metodo
        ArrayList<Movie> listado = service.listarMovies();

        ObjectMapper mapper = new ObjectMapper();

        //convierto Objecto java a json string
		//ahora respondo al front: json, Convirtiendo el nuevo Clientes a json
		String clientesJSON = mapper.writeValueAsString(listado);
        
        //mostrar por consola|enviar al frontend
        resp.getWriter().println(clientesJSON);

    }
}
