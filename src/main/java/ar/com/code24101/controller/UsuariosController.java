package ar.com.code24101.controller;

import java.io.IOException;

import org.mindrot.jbcrypt.BCrypt;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.code24101.domain.Usuarios;
import ar.com.code24101.dto.LoginRequestDTO;
import ar.com.code24101.dto.MovieDTO;
import ar.com.code24101.service.UsuariosService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/login")
public class UsuariosController extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ObjectMapper mapper = new ObjectMapper();

        LoginRequestDTO loginDto = mapper.readValue(req.getReader(), LoginRequestDTO.class);
        
        UsuariosService service = new UsuariosService();
        
        Usuarios usuario = service.buscarPorUsername(loginDto.getUsername());
                    // test1234             //$2a$12$zk6C/XUGzacIatO7bNsRKOo.ZUirzmRMYVXyIz1P2PvUFJnF4opJO
        boolean isLoggedOK = BCrypt.checkpw(loginDto.getPassword(),usuario.getPassword());

        if(isLoggedOK) {
            resp.setStatus(HttpServletResponse.SC_CREATED);
            //aca magia de 
            //https://medium.com/somos-pragma/gu%C3%ADa-de-implementaci%C3%B3n-jwt-para-la-autenticaci%C3%B3n-en-java-db47b04eda54
        }else{
            resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);//
        }
    }
}
