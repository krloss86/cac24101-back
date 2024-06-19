package ar.com.code24101.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

    public void create(Movie movieDto) {
        String sql = "INSERT INTO clientes (nombre, apellido, email, imagen,tipos_clientes_id) values(?,?,?,?,?)";
        Connection connection = AdministradorDeConexiones.conectar();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, movieDto.getNombre());
            pst.setString(2, movieDto.getApellido());
            pst.setString(3, movieDto.getEmail());
            pst.setString(4, movieDto.getImagen());
            pst.setLong(5, movieDto.getTipoClienteId());
            pst.executeUpdate();
            if(pst.getUpdateCount() > 0) {
                System.out.println("Insert ok");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            AdministradorDeConexiones.desconectar(connection);
        }        
    }

    @Override
    public ArrayList<Movie> findAll() {
        String sql = "SELECT * FROM clientes"; //ver LIMIT y Offset

        ArrayList<Movie> listaDePeliculas = new ArrayList<>();
        Connection connection = null;
        try{
            //aca va la logica
            connection = AdministradorDeConexiones.conectar();

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultset = statement.executeQuery();

            while(resultset.next()) {
                Long movieId = resultset.getLong(1);
                String nombre = resultset.getString(2);
                String apellido = resultset.getString(3);
                String email = resultset.getString(4);
                String imagen = resultset.getString(5);
                Long tipoClienteID = resultset.getLong(6);

                Movie unaPelicula = new Movie(movieId, nombre, apellido, imagen, email, tipoClienteID);
                listaDePeliculas.add(unaPelicula);
            }
        }catch(Exception e) {
            System.err.println(e);
        } finally {
            //siempre: cierro conexion
            AdministradorDeConexiones.desconectar(connection);
        }

        return listaDePeliculas;
    }

    @Override
    public void update(Movie movie) {           

        //tph: ver como quitar esa , del final!

        String sql = "UPDATE clientes set (nombre, apellido,email, imagen, tipos_clientes_id) values(?,?,?,?,?) where id = ?";

        Connection connection = AdministradorDeConexiones.conectar();
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, movie.getNombre());
            pst.setString(2, movie.getApellido());
            pst.setString(3, movie.getEmail());
            pst.setString(4, movie.getImagen());
            pst.setLong(5, movie.getTipoClienteId());

            pst.setLong(6, movie.getId());

            pst.executeUpdate();
            if(pst.getUpdateCount() > 0) {
                System.out.println("update ok");
            }
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            AdministradorDeConexiones.desconectar(connection);
        }    
    }
}
