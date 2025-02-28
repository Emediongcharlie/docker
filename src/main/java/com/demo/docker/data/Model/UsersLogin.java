package com.demo.docker.data.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UsersLogin {

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

    @Id
    private String username;
    private String password;
}
