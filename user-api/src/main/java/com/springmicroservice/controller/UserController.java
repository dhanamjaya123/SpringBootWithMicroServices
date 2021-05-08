package com.springmicroservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmicroservice.model.User;

@RestController
public class UserController {
	@PostMapping("/user")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		return ResponseEntity.ok().body("Successfully saved :" + user.getUsername());
	}

}
