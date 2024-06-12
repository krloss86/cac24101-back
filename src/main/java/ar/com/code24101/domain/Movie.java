package ar.com.code24101.domain;

public class Movie {
    private Long id;
    private String nombre;
    private String apellido;
    private String imagen;
    private String email;
    private Long tipoClienteId;
    
    public Movie(Long id, String nombre, String apellido, String imagen, String email, Long tipoClienteId) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagen = imagen;
        this.email = email;
        this.tipoClienteId = tipoClienteId;
    }

    public Movie(String nombre, String apellido, String imagen, String email, Long tipoClienteId) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagen = imagen;
        this.email = email;
        this.tipoClienteId = tipoClienteId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTipoClienteId() {
        return tipoClienteId;
    }

    public void setTipoClienteId(Long tipoClienteId) {
        this.tipoClienteId = tipoClienteId;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", imagen=" + imagen + ", email="
                + email + ", tipoClienteId=" + tipoClienteId + "]";
    }
        
}
