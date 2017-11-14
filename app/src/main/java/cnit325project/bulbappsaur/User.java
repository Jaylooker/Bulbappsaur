package cnit325project.bulbappsaur;

import java.io.Serializable;

/**
 * Created by jackb on 11/13/2017.
 */
//Can be used to store username and password in LoginActivity
    //Using interface as Serializable is interface to sent objects
public class User implements Serializable {
    private String username;
    private String password;

    //getters and setters
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

    //login may take input
    public void login()
    {

    }

}
