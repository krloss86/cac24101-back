package ar.com.code24101.dto;

public class LoginRequestDTO {

    private String username;
    private String password;
    
    public LoginRequestDTO() {
        
    }

    public LoginRequestDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }    
}
