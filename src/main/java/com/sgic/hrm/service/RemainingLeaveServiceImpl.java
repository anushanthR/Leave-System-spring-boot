package com.sgic.hrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.RemainingLeave;
import com.sgic.hrm.entity.RemainingLeaveId;
import com.sgic.hrm.entity.RemainingLeaveRepository;

@Service
public class RemainingLeaveServiceImpl implements RemainingLeaveService {
	
	@Autowired
	RemainingLeaveRepository remainingLeaveRepo;

	@Override
	public Iterable<RemainingLeave> viewAll() {
		
		return remainingLeaveRepo.findAll();
	}

	@Override
	public boolean add(RemainingLeave remainingLeave) {
		remainingLeaveRepo.save(remainingLeave);
		return true;
	}

	@Override
	public boolean update(RemainingLeave remainingLeave) {
		boolean success = false;
		if(null != remainingLeaveRepo.getOne(remainingLeave.getId())) {
			remainingLeaveRepo.save(remainingLeave);
			success = true;
		}
		return success;
	}

	@Override
	public boolean drop(RemainingLeaveId id) {
		boolean success = false;
		if(null != remainingLeaveRepo.getOne(id)) {
			remainingLeaveRepo.deleteById(id);
			success = true;
		}
		return success;
	}

	
}
