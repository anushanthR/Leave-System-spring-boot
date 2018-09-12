/**
 * 
 */
package com.sgic.hrm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.LeaveType;
import com.sgic.hrm.entity.LeaveTypeRepository;

/**
 * @author Anushanth
 *
 */
@Service
public class LeaveTypeServiceImpl implements LeaveTypeService {

	@Autowired
	LeaveTypeRepository typeRepo;

	@Override
	public Iterable<LeaveType> viewAllType() {
		return typeRepo.findAll();
	}

	@Override
	public boolean addType(LeaveType type) {
		typeRepo.save(type);
		return true;
	}

	@Override
	public boolean updateType(LeaveType type) {
		boolean success = false;
		LeaveType rolefromDB = viewTypeById(type.getId());
		if (null != rolefromDB) {
			typeRepo.save(type);
			success = true;
		}
		return success;
	}

	@Override
	public boolean dropType(Integer id) {
		Boolean success = false;
		if (null != viewTypeById(id)) {
			typeRepo.deleteById(id);
			success = true;
		}
		return success;
	}

	@Override
	public LeaveType viewTypeById(Integer id) {
		Optional<LeaveType> opt = typeRepo.findById(id);
		LeaveType type = null;
		if (opt.isPresent()) {
			type = opt.get();
		}
		return type;
	}

}
