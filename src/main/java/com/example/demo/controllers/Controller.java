package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${url}")
    private String url;

    @RequestMapping(value = "/")
    public String hello() {
        return url;
    }

}
