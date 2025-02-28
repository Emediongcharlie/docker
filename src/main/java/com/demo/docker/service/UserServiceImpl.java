package com.demo.docker.service;

import com.demo.docker.data.Model.UsersLogin;
import com.demo.docker.data.Repository.UserLoginRepo;
import com.demo.docker.dtos.request.LoginRequest;
import com.demo.docker.dtos.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserLoginRepo repo;

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        UsersLogin usersLogin = new UsersLogin();
        usersLogin.setUsername(loginRequest.getUsername());
        usersLogin.setPassword(loginRequest.getPassword());
        repo.save(usersLogin);
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setMessage("Success");
        return loginResponse;
    }
}
