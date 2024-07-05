package ar.com.code24101.controller;

import java.io.IOException;
import java.util.stream.Collectors;

import ar.com.code24101.dto.MovieDTO;
import ar.com.code24101.service.MovieService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
@WebServlet("/CrearMovieController")
public class CrearMovieController extends HttpServlet {

    protected void doPost(
        HttpServletRequest req,//aca viene todo desde el front
        HttpServletResponse resp//aca respondemos al front
    ) throws ServletException, IOException {

        //el json que viene, se atrapa así:
        /*String json = req.getReader()
				.lines()
				.collect(Collectors.joining(System.lineSeparator()));*/
            
        //System.out.println(json);

        //en java manejo objetos
        //usando jackson: pasamos de texto a objetos
        ObjectMapper mapper = new ObjectMapper();

        MovieDTO movieDto = mapper.readValue(req.getReader(), MovieDTO.class);

        MovieService service = new MovieService();

        System.out.println(movieDto);

        service.crear(movieDto);

        resp.setStatus(HttpServletResponse.SC_CREATED);
    }

}
