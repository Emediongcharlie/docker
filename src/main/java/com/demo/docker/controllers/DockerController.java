package com.demo.docker.controllers;

import com.demo.docker.dtos.request.LoginRequest;
import com.demo.docker.dtos.response.LoginResponse;
import com.demo.docker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class DockerController {

    @Autowired
    private UserService userService;

    @GetMapping("hello/")
    public String Hello() {
        return "Hello Docker";
    }

    @PostMapping("login")
    public ResponseEntity<?> USerLogin(LoginRequest loginRequest) {
        try{
            LoginResponse response = userService.login(loginRequest);
            return ResponseEntity.ok(response);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
