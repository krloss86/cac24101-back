package ar.com.code24101.controller;

import java.io.IOException;

import ar.com.code24101.service.MovieService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EliminarMovieController")
public class EliminarMovieController extends HttpServlet{

    //get
    //post
    //put
    //delete
    @Override
    protected void doDelete(
        HttpServletRequest req,//aca viene lo del front
        HttpServletResponse resp//aca se manda al front
    ) throws ServletException, IOException {

        //capturo el id que viene desde el front
        String id = req.getParameter("id");

        MovieService service = new MovieService();

        Long idLong = Long.parseLong(id);

        service.eliminar(idLong);

        resp.setStatus(HttpServletResponse.SC_OK);
    }   
}
