package com.sgic.hrm.service;

import com.sgic.hrm.entity.LeaveStatus;

public interface LeaveStatusService {

	Iterable<LeaveStatus> viewAllStatus();
	boolean addStatus(LeaveStatus status);
	boolean updateStatus(LeaveStatus status);
	boolean dropStatus(Integer id);
	LeaveStatus viewStatusById(Integer id);
	
}
