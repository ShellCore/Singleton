package com.shellcore.android.singleton;

/**
 * Created by Shell on 18/11/2017.
 */

public class User {

    private String name;
    private String email;
    private String password;

    private static User user = new User();

    private User() {
        name = "Shell";
        email = "shell.one.core@gmail.com";
        password = "1234";
    }

    public static User getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Nombre: " + name
                + "\nEmail: " + email
                + "\nPass: " + password;
    }
}
