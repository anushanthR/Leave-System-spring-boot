/**
 * 
 */
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

import com.sgic.hrm.entity.Role;
import com.sgic.hrm.service.RoleService;

/**
 * @author Anushanth
 *
 */
@RestController
public class RoleController {

	@Autowired
	RoleService roleService;

	@GetMapping("/role")
	public ResponseEntity<Iterable<Role>> viewRole() {
		Iterable<Role> role = roleService.viewAllRole();
		return new ResponseEntity<>(role, HttpStatus.OK);
	}

	@PostMapping("/role")
	public ResponseEntity<String> addRole(@RequestBody Role role) {
		boolean success = roleService.addRole(role);
		String message = "Add action failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Added Successfully";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}

	@PutMapping("/role")
	public ResponseEntity<String> updateRole(@RequestBody Role role) {
		boolean success = roleService.updateRole(role);
		String message = "Update Failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Successfully Updated";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}

	@DeleteMapping("/role")
	public ResponseEntity<String> dropRole(@RequestBody Integer id) {
		boolean success = roleService.dropRole(id);
		String message = "Delete action failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Successfully Deleted";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}
}
