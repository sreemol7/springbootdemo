package com.coder.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        return "<h1> Home Page </h1>";
    }
}
