package com.sgic.hrm.service;

import com.sgic.hrm.entity.LeaveType;

public interface LeaveTypeService {
	
	Iterable<LeaveType> viewAllType();
	boolean addType(LeaveType type);
	boolean updateType(LeaveType type);
	boolean dropType(Integer id);
	LeaveType viewTypeById(Integer id);
}
