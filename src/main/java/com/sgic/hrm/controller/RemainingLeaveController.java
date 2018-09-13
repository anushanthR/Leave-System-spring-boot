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

import com.sgic.hrm.entity.RemainingLeave;
import com.sgic.hrm.entity.RemainingLeaveId;
import com.sgic.hrm.service.RemainingLeaveService;

/**
 * @author Anushanth
 *
 */
@RestController
public class RemainingLeaveController {

	@Autowired
	RemainingLeaveService remainingLeaveService;
	
	@PostMapping("/remain")
	public ResponseEntity<String> add(@RequestBody RemainingLeave remainingLeave) {
		boolean success = remainingLeaveService.add(remainingLeave);
		String message = "Add action failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Added Successfully";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}

	@GetMapping("/remain")
	public ResponseEntity<Iterable<RemainingLeave>> viewAll() {
		return new ResponseEntity<>(remainingLeaveService.viewAll(), HttpStatus.OK);
	}

	@PutMapping("/remain")
	public ResponseEntity<String> update(@RequestBody RemainingLeave remainingLeave) {
		boolean success = remainingLeaveService.update(remainingLeave);
		String message = "Update Failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Successfully Updated";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}

	@DeleteMapping("/remain")
	public ResponseEntity<String> drop(@RequestBody RemainingLeaveId id) {
		boolean success = remainingLeaveService.drop(id);
		String message = "Delete action failed";
		ResponseEntity<String> status = new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
		if (success) {
			message = "Successfully Deleted";
			status = new ResponseEntity<>(message, HttpStatus.OK);
		}
		return status;
	}
}
