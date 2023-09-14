package com.example.myAngularApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myAngularApp.model.User;
import com.example.myAngularApp.repository.UserRepository;

@Service
public class LoginController {

  private final UserRepository userRepository;

  @Autowired
  public LoginController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User login(String username, String password) throws Exception {
    User user = userRepository.findByUsername(username);

    if (user == null || !user.getPassword().equals(password)) {
      throw new Exception("Invalid username or password");
    }

    return user;
  }

}
