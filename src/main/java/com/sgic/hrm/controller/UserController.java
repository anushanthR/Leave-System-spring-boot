package com.sgic.hrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.entity.User;
import com.sgic.hrm.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		boolean success = userService.addUser(user);
		String message = "Add action failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Added Successfully";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}
}
