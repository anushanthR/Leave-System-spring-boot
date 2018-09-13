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

import com.sgic.hrm.entity.LeaveStatus;
import com.sgic.hrm.service.LeaveStatusService;

/**
 * @author Anushanth
 *
 */
public class LeaveStatusController {

	@Autowired
	LeaveStatusService statusService;

	@PostMapping("/status")
	public ResponseEntity<String> addStatus(@RequestBody LeaveStatus status) {
		boolean success = statusService.addStatus(status);
		String message = "Add action failed";
		ResponseEntity<String> responce = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Added Successfully";
			responce = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return responce;
	}

	@GetMapping("/status")
	public ResponseEntity<Iterable<LeaveStatus>> viewAllUser() {
		return new ResponseEntity<>(statusService.viewAllStatus(), HttpStatus.OK);
	}

	@PutMapping("/status")
	public ResponseEntity<String> updateRole(@RequestBody LeaveStatus status) {
		boolean success = statusService.updateStatus(status);
		String message = "Update Failed";
		ResponseEntity<String> responce = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Successfully Updated";
			responce = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return responce;
	}
	
	@DeleteMapping("/status")
	public ResponseEntity<String> dropUser(@RequestBody Integer id) {
		boolean success = statusService.dropStatus(id);
		String message = "Delete action failed";
		ResponseEntity<String> responce = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Successfully Deleted";
			responce = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return responce;
	}
}
