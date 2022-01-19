package programmer_zaman_now.data;

import programmer_zaman_now.annotation.NotBlanck;

public class CreateUserRequest {
    @NotBlanck
    private String username;
    
    @NotBlanck
    private String pass;

    @NotBlanck
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
