package appdelivery.demo.security.usuario;

public class User {
    private String id;
    private String username;
    private String email;
    private String password;
    private Role role;

    //Getters e setters sao métodos que controlam o acesso aos atributos de uma classe:
    //getter le o valor e setter altera

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
