package com.example.hello_co.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello " + name;
    }
}
