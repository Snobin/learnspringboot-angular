package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LearningController {

    @GetMapping("/hello")
    @CrossOrigin(origins="http://localhost:4200")
    public ResponseEntity<?> sayHello() {
        System.out.println("received");
        Map<String, String> jsonResponse = new HashMap<>();
        jsonResponse.put("message", "Hello");
        return new ResponseEntity<>(jsonResponse, HttpStatus.ACCEPTED);
    }
}
