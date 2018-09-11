package com.sgic.hrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.entity.User;
import com.sgic.hrm.entity.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;

	@Override
	public boolean addUser(User user) {
		userRepo.save(user);
		return true;
	}

	

	
}
