/**
 * 
 */
package com.sgic.hrm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.LeaveStatus;

/**
 * @author Anushanth
 *
 */
@Service
public class LeaveStatusServiceImpl implements LeaveStatusService {
	
	

	@Override
	public List<LeaveStatus> viewAllStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addStatus(LeaveStatus status) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStatus(LeaveStatus status) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean dropStatus(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LeaveStatus viewById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
