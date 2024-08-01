package com.keerthana.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthana.demo.model.User;
import com.keerthana.demo.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserServiceImpl service;

	@PostMapping
	public String insertUser(@RequestBody User user) {
		String msg = "";
		try {
			
			service.addUser(user);
			msg = "Success user";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failure user";
		}
		return msg;
	}

	@GetMapping("/getEmail/{email}")
	public User viewUserByEmail(@PathVariable("email") String email) {
		
		return service.getUserByEmail(email);
	}

	@GetMapping("/all")
	public List<User> getUsers() {
		return service.getAllUsers();
	}
}
