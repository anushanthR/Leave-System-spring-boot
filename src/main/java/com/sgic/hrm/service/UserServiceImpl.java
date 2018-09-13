package com.sgic.hrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.User;
import com.sgic.hrm.entity.UserRepository;


/**
 * @author Anushanth
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	@Override
	public boolean addUser(User user) {
		userRepo.save(user);
		return true;
	}

	@Override
	public Iterable<User> viewAllUser() {
		return userRepo.findAll();
	}

	@Override
	public boolean updateUser(User user) {
		boolean success = false;
		if (null != userRepo.getOne(user.getId())) {
			userRepo.save(user);
			success = true;
		}
		return success;
	}

	@Override
	public boolean dropUser(Integer id) {
		Boolean success = false;
		if (null != userRepo.getOne(id)) {
			userRepo.deleteById(id);
			success = true;
		}
		return success;
	}

	@Override
	public User viewUserById(Integer id) {
		return userRepo.getOne(id);
	}

}
