package com.example.dagger2_example.bean;

import javax.inject.Inject;

public class User {

    private String username;
    private String password;


    @Inject
    public User() {
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
}
