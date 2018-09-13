package com.sgic.hrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.LeaveStatus;
import com.sgic.hrm.entity.LeaveStatusRepository;

/**
 * @author Anushanth
 *
 */
@Service
public class LeaveStatusServiceImpl implements LeaveStatusService {

	@Autowired
	LeaveStatusRepository statusRepo;

	@Override
	public Iterable<LeaveStatus> viewAllStatus() {
		return statusRepo.findAll();
	}

	@Override
	public boolean addStatus(LeaveStatus status) {
		statusRepo.save(status);
		return true;
	}

	@Override
	public boolean updateStatus(LeaveStatus status) {
		boolean success = false;		
		if (null != statusRepo.getOne(status.getId())) {
			statusRepo.save(status);
			success = true;
		}
		return success;
	}

	@Override
	public boolean dropStatus(Integer id) {
		Boolean success = false;
		if(null != statusRepo.getOne(id)) {
			statusRepo.deleteById(id);
			success = true;			
		}		
		return success;
	}

	@Override
	public LeaveStatus viewStatusById(Integer id) {
		return statusRepo.getOne(id);
	}

}
