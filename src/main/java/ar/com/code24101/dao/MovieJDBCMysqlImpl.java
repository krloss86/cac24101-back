package ar.com.code24101.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ar.com.code24101.domain.Movie;
import ar.com.code24101.dto.MovieDTO;

public class MovieJDBCMysqlImpl implements MovieDAO{

    @Override
    public Movie getById(Long id) {
        String sql = "SELECT * FROM clientes WHERE id = "+id;

        Movie movie = null;
        Connection connection = null;
        try{
            //aca va la logica
            connection = AdministradorDeConexiones.conectar();

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultset = statement.executeQuery();

            if(resultset.next()) {
                Long movieId = resultset.getLong(1);
                String nombre = resultset.getString(2);
                String apellido = resultset.getString(3);
                String email = resultset.getString(4);
                String imagen = resultset.getString(5);
                Long tipoClienteID = resultset.getLong(6);

                movie = new Movie(movieId, nombre, apellido, imagen, email, tipoClienteID);
            }
        }catch(Exception e) {
            System.err.println(e);
        } finally {
            //siempre: cierro conexion
            AdministradorDeConexiones.desconectar(connection);
        }

        return movie;
    }

    @Override
    public void create(MovieDTO movieDto) {
        //TPH: 
        //INSER INTO....
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

}
