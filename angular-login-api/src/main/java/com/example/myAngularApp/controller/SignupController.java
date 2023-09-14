package com.example.myAngularApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myAngularApp.model.User;
import com.example.myAngularApp.repository.UserRepository;

@Service
public class SignupController {

  private final UserRepository userRepository;

  @Autowired
  public SignupController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User signUp(String username, String password, String email) {
    User user = new User();
    user.setUsername(username);
    user.setPassword(password);
    user.setEmail(email);

    return userRepository.save(user);
  }

}
