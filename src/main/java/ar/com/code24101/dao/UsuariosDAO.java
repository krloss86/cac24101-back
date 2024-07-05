package ar.com.code24101.dao;

import ar.com.code24101.domain.Usuarios;

public interface UsuariosDAO {

    public Usuarios findByUsername(String username);
}
