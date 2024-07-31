package com.keerthana.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.keerthana.demo.model.User;

@Service
public interface UserService {

	public String addUser(User user);
	public User getUserByEmail(String email);
	public List<User> getAllUsers();
	
	
	
}
