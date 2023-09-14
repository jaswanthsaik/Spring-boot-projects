package com.ensar.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.applicationdiscovery.model.ResourceNotFoundException;
import com.ensar.models.Customer;
import com.ensar.models.UserList;
import com.ensar.repository.UserListRepository;

@Service
public class UserListService {

	@Autowired
	private UserListRepository userListRepository;

	@Autowired
	public UserListService(UserListRepository userListRepository) {
		this.userListRepository = userListRepository;

	}

	public UserList create(UserList userList) {

		return userListRepository.save(userList);

	}

	 public List<UserList> getAll() {
	        
	    	List<UserList> list = userListRepository.findAll();
	    	
	    	return list;

	        
	    }
	 public boolean delete(String id) {
	    	UserList userlist = userListRepository.findById(id)
	          .orElseThrow(() -> new IllegalArgumentException("UserList Id:" + id));
	        userListRepository.delete(userlist);
	        return true;
	    }
	 
	 public UserList updateUserList(String userListId, UserList userListDetails) {
		    UserList userList = userListRepository.findById(userListId)
		            .orElseThrow(() -> new ResourceNotFoundException("UserList"));
		    userList.setFirstName(userListDetails.getFirstName());
		    userList.setLastName(userListDetails.getLastName());
		    userList.setEmail(userListDetails.getEmail());
		    userList.setPhoneNumber(userListDetails.getPhoneNumber());
		    userList.setRole(userListDetails.getRole());
		    userList.setJoinDate(userListDetails.getJoinDate());
		    UserList updatedUserList = userListRepository.save(userList);
		    return updatedUserList;
		}


}
