package com.demo.docker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("hello/")
    public String Hello() {
        return "Hello Docker";
    }
}
