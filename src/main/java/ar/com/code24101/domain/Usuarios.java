package ar.com.code24101.domain;

import java.util.List;

public class Usuarios {

    private Long id;
    private String username;
    private String password;
    private List<String> roles;

    public Usuarios(Long id, String username, String password, List<String> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Usuarios [id=" + id + ", username=" + username + ", password=" + password + ", roles=" + roles + "]";
    }
    
    
}
