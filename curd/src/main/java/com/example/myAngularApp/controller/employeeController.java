package com.example.myAngularApp.controller;

import com.example.myAngularApp.model.employee;
import com.example.myAngularApp.model.employee;
import com.example.myAngularApp.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class employeeController {
	
    @Autowired
    private employeeRepository employeeRepository;

    // get all employees
    @GetMapping("/employees")
    public List<employee> getAllEmployees() {
        return employeeRepository.findAll(); 
    }
}
