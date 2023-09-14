package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.models.Model;
import com.example.repositories.ModelRepository;

@RestController
public class HelloController {
	 @Autowired
	    private ModelRepository modelRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }
    @GetMapping("/hello")
    public String getAllModels() {
        List<Model> models = modelRepository.findAll();
        return "Hello from Spring Boot!";
    }
}
