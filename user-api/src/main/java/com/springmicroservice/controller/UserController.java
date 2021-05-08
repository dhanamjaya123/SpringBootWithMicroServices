package com.springmicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmicroservice.model.User;

@RestController
public class UserController {
	
	@Autowired
	private Environment env;
	
	@PostMapping("/user")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		return ResponseEntity.ok().body("Successfully saved :" + env.getProperty("token.name"));
	}

}
