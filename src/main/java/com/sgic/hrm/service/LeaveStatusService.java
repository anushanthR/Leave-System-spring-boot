package com.sgic.hrm.service;

import java.util.List;

import com.sgic.hrm.entity.LeaveStatus;

public interface LeaveStatusService {

	List<LeaveStatus> viewAllStatus();
	boolean addStatus(LeaveStatus status);
	boolean updateStatus(LeaveStatus status);
	boolean dropStatus(Integer id);
	LeaveStatus viewById(Integer id);
	
}
