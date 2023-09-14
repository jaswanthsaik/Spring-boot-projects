package com.ensar.payload.response;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



public class UserResponse {

  private Long id;
  private String displayName;
  private String email;
  private String role;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDisplayName() {
	return displayName;
}
public void setDisplayName(String displayName) {
	this.displayName = displayName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
  
  

  
}
