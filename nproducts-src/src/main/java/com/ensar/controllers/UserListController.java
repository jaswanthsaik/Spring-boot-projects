package com.ensar.controllers;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ensar.models.UserList;
import com.ensar.service.UserListService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1/UsersList")
public class UserListController {

	private UserListService userListService;

	@Autowired
	public UserListController(UserListService userListService) {
		this.userListService = userListService;
	}
	@GetMapping("/")
//	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN')")
	public ResponseEntity<?> allAccess() {
		return ResponseEntity.ok(userListService.getAll());
	}


	@PostMapping("/")
	public @ResponseBody ResponseEntity<UserList> create(@RequestBody UserList userList) {


		return ResponseEntity.ok(userListService.create(userList));
	}
	
	@DeleteMapping("/")
	  public ResponseEntity<Boolean> deleteUser(@PathVariable("id") String id) {
		  return ResponseEntity.ok(userListService.delete(id));
	  }
	
	@PutMapping("/{id}")
	public ResponseEntity<UserList> updateUserList(@PathVariable(value = "id") String userListId,
	                                       @Valid @RequestBody UserList userListDetails) {
	    UserList updatedUserList = userListService.updateUserList(userListId, userListDetails);
	    return ResponseEntity.ok(updatedUserList);
	}

	
	
	
//		try {
//			System.out.println("Checking....");
//		    userListService.createUserList(userList);
//		}catch(Exception e) {
//			System.out.println("Error while inserting values into database" + e);
//		}
}
