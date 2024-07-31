package com.keerthana.demo.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthana.demo.model.User;
import com.keerthana.demo.repoisatory.UserRepo;
import com.keerthana.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	UserRepo repo;

	public String addUser(User user) {
		if(user!=null) {
		repo.save(user);
		return "User added";
		}else {
			return "not added";
		}
	}

	public User getUserByEmail(String email) {
		return repo.findByEmail(email);
	}

	public List<User> getAllUsers() {
		return repo.findAll();
	}
	
	
	
}
