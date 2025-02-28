package com.demo.docker.service;

import com.demo.docker.dtos.request.LoginRequest;
import com.demo.docker.dtos.response.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    LoginResponse login(LoginRequest loginRequest);
}
