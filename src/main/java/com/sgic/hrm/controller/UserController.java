package com.sgic.hrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("/user")
	public ResponseEntity<Iterable<User>> viewAllUser() {
		return new ResponseEntity<>(userService.viewAllUser(), HttpStatus.OK);
	}

	@PutMapping("/user")
	public ResponseEntity<String> updateRole(@RequestBody User user) {
		boolean success = userService.updateUser(user);
		String message = "Update Failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Successfully Updated";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}

	@DeleteMapping("/user")
	public ResponseEntity<String> dropUser(@RequestBody Integer id) {
		boolean success = userService.dropUser(id);
		String message = "Delete action failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Successfully Deleted";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}
}
