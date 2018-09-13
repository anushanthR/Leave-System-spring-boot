package com.sgic.hrm.service;

import com.sgic.hrm.entity.LeaveRequest;

public interface LeaveRequestService {
	
	Iterable<LeaveRequest> viewAllRequest();
	boolean addRequest(LeaveRequest request);
	boolean updateRequest(LeaveRequest request);
	boolean dropRequest(Integer id);
	LeaveRequest viewRequestById(Integer id);
}
