package com.springjvm.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJvm {
    @GetMapping("/getMessage")
    public String getMessage(){
        return "welcome to the world of JVM";
    }
}
