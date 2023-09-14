package com.example.myAngularApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myAngularApp.model.User;
import com.example.myAngularApp.repository.UserRepository;

@Service
public class AuthService {

  private final UserRepository userRepository;

  @Autowired
  public AuthService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }
  public User signup(User user) {
	    // Implement the logic to save the user in the database
	    // ...
	    // Return the saved user
	    return userRepository.save(user);
	}

  public User login(String username, String password) throws Exception {
    User user = userRepository.findByUsername(username);

    if (user == null) {
      throw new Exception("Invalid username or password");
    }

    if (!user.getPassword().equals(password)) {
      throw new Exception("Invalid username or password");
    }

    return user;
  }

}
