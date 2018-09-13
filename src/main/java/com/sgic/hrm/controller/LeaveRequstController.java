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

import com.sgic.hrm.entity.LeaveRequest;
import com.sgic.hrm.service.LeaveRequestService;

@RestController
public class LeaveRequstController {

	@Autowired
	LeaveRequestService requestService;
	
	@PostMapping("/request")
	public ResponseEntity<String> addUser(@RequestBody LeaveRequest request) {
		boolean success = requestService.addRequest(request);
		String message = "Add action failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Added Successfully";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}

	@GetMapping("/request")
	public ResponseEntity<Iterable<LeaveRequest>> viewAllRequest() {
		return new ResponseEntity<>(requestService.viewAllRequest(), HttpStatus.OK);
	}

	@PutMapping("/request")
	public ResponseEntity<String> updateRequest(@RequestBody LeaveRequest request) {
		boolean success = requestService.updateRequest(request);
		String message = "Update Failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Successfully Updated";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}

	@DeleteMapping("/request")
	public ResponseEntity<String> dropRequest(@RequestBody Integer id) {
		boolean success = requestService.dropRequest(id);
		String message = "Delete action failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Successfully Deleted";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}
}
