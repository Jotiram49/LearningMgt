package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.userModel;
import com.example.service.userService;
import com.fasterxml.jackson.databind.node.ObjectNode;


@RestController
@RequestMapping("userController")
@CrossOrigin
public class userController {
	
	@Autowired
	private userService service;
	
	@PostMapping("registration")
	public userModel saveUser(@RequestBody userModel user) {
		return service.addUser(user);
	}
	
	@PostMapping("login")
	public userModel LoginUser(@RequestBody ObjectNode json) {
		String email = json.get("str1").asText();
		String pass = json.get("str2").asText();
		return service.checkUser(email,pass);
	}
	
	
	

}
