package com.sgic.hrm.service;

import java.util.List;

import com.sgic.hrm.entity.LeaveType;

public interface LeaveTypeService {
	
	List<LeaveType> viewAllType();
	void addType(LeaveType type);
	void updateType(LeaveType type);
	void dropType(LeaveType type);
}
