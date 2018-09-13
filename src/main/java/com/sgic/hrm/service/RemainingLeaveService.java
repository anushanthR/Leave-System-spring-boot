package com.sgic.hrm.service;

import com.sgic.hrm.entity.RemainingLeave;
import com.sgic.hrm.entity.RemainingLeaveId;

public interface RemainingLeaveService {

	Iterable<RemainingLeave> viewAll();
	boolean add(RemainingLeave days);
	boolean update(RemainingLeave days);
	boolean drop(RemainingLeaveId id);
	
}
