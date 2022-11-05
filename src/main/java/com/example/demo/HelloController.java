package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final String greeting;

    HelloController(@Value("${greeting:Hi}") String greeting){
        this.greeting=greeting;
    }

    @GetMapping("/hello")
    public String hello(String name) {
        return greeting + " " + name;
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(String username, String password) {
        if("admin".equalsIgnoreCase(username) && "admin123".equalsIgnoreCase(password)){
            return ResponseEntity.ok("Success");
        } else {
            return ResponseEntity.badRequest().build();
        }

    }

    @GetMapping("alive")
    String alive() {
        return "ok";
    }
}
