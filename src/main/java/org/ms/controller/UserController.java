package org.ms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.ms.entites.User;
import org.ms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	
	@PostMapping("/user/add")
	public User addUser(@RequestBody User user)
	{
		return userRepository.save(user);
	}
	
	@GetMapping("/user/all")
	public List<User> getUsers(){
		Iterator<User> iterator=userRepository.findAll().iterator();
		List<User> users=new ArrayList<>();
		
		while(iterator.hasNext()) {
			users.add(iterator.next());
		}
		return users;
	}
}
