package ar.com.code24101.service;

import ar.com.code24101.dao.UsuariosDAO;
import ar.com.code24101.dao.UsuariosJDBCMysqlmpl;
import ar.com.code24101.domain.Usuarios;

public class UsuariosService {

    private UsuariosDAO dao;//

    public UsuariosService() {
        this.dao = new UsuariosJDBCMysqlmpl();
    }

    public Usuarios buscarPorUsername(String username) {
        return this.dao.findByUsername(username);
    }
}
