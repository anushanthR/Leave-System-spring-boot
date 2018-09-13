/**
 * 
 */
package com.sgic.hrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.LeaveRequest;
import com.sgic.hrm.entity.LeaveRequestRepository;

/**
 * @author Anushanth
 *
 */
@Service
public class LeaveRequestServiceImpl implements LeaveRequestService{
	
	@Autowired
	LeaveRequestRepository requestRepo;

	@Override
	public Iterable<LeaveRequest> viewAllRequest() {		
		return requestRepo.findAll();
	}

	@Override
	public boolean addRequest(LeaveRequest request) {
		requestRepo.save(request);
		return true;
	}

	@Override
	public boolean updateRequest(LeaveRequest request) {
		boolean success = false;
		if(null != requestRepo.getOne(request.getId())){
			requestRepo.save(request);
			success = true;
		}
		return success;
	}

	@Override
	public boolean dropRequest(Integer id) {
		boolean success = false;
		if(null != requestRepo.getOne(id)){
			requestRepo.deleteById(id);
			success = true;
		}
		return success;
	}

	@Override
	public LeaveRequest viewRequestById(Integer id) {		
		return requestRepo.getOne(id);
	}

}
