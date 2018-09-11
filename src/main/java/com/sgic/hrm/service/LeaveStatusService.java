package com.sgic.hrm.service;

import java.util.List;

import com.sgic.hrm.entity.LeaveStatus;

public interface LeaveStatusService {

	List<LeaveStatus> viewAllStatus();
	void addStatus(LeaveStatus status);
	void updateStatus(LeaveStatus status);
	void dropStatus(LeaveStatus status);
	
}
