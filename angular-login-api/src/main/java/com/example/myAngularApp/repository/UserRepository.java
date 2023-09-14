package com.example.myAngularApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myAngularApp.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	User findByUsername(String username);

  // Custom methods if needed

}
