package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // to retrieve values from the application-local.properties
    // the ${variable name same as the application-local.properties}
    @Value("${url}")
    private String url;

    // the request mapping value is the path of the url
    @RequestMapping(value = "/")
    public String hello() {
        return url;
    }

}
