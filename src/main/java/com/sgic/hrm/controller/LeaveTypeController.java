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

import com.sgic.hrm.entity.LeaveType;
import com.sgic.hrm.service.LeaveTypeService;

/**
 * @author Anushanth
 *
 */
public class LeaveTypeController {
	
	@Autowired
	LeaveTypeService typeService;
	
	@PostMapping("/type")
	public ResponseEntity<String> addUser(@RequestBody LeaveType type) {
		boolean success = typeService.addType(type);
		String message = "Add action failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Added Successfully";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}
	
	@GetMapping("/type")
	public ResponseEntity<Iterable<LeaveType>> viewAllUser() {
		return new ResponseEntity<>(typeService.viewAllType(), HttpStatus.OK);
	}
	
	@PutMapping("/type")
	public ResponseEntity<String> updateRole(@RequestBody LeaveType type) {
		boolean success = typeService.updateType(type);
		String message = "Update Failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Successfully Updated";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}
	
	@DeleteMapping("/type")
	public ResponseEntity<String> dropUser(@RequestBody Integer id) {
		boolean success = typeService.dropType(id);
		String message = "Delete action failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Successfully Deleted";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}
}
