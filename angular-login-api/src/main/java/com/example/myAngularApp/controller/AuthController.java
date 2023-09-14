package com.example.myAngularApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myAngularApp.model.LoginRequest;
import com.example.myAngularApp.model.SignupRequest;
import com.example.myAngularApp.model.User;
import com.example.myAngularApp.service.AuthService;

@RestController
public class AuthController {

  private final AuthService authService;

  @Autowired
  public AuthController(AuthService authService) {
    this.authService = authService;
  }
  @PostMapping("/api/signup")
  public ResponseEntity<?> signup(@RequestBody SignupRequest signupRequest) {
    try {
      // Create a new user with the provided username and password
      User newUser = new User(signupRequest.getUsername(), signupRequest.getPassword(), signupRequest.getEmail());

      // Save the user in the database
      User savedUser = authService.signup(newUser);

      // Return the saved user with a success response
      return ResponseEntity.ok(savedUser);
    } catch (Exception e) {
      // Handle signup error
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
  }


  @PostMapping("/api/login")
  public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
    try {
      User user = authService.login(loginRequest.getUsername(), loginRequest.getPassword());
      // Successful login
      return ResponseEntity.ok(user);
    } catch (Exception e) {
      // Invalid login credentials
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
    }
  }
}
