package com.rest.websevices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.Iterator;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 3;
	static {
		users.add(new User(1,  "jessu" ,  new Date()));
		users.add(new User(2,  "sai" ,  new Date()));
		users.add(new User(3,  "nikki" ,  new Date()));
		
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User save(User user) {
		if(user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	public User deleteById(int id) {
		Iterator <User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}
