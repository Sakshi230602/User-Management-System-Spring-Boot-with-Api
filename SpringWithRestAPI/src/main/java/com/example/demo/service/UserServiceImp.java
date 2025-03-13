package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImp   implements UserService{
	@Autowired
	private UserRepository userep;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
	return 	userep.save(user);
		
	}

	//@Override
//	public List<User> getAllUser() {
//		// TODO Auto-generated method stub
//		return userep.findAll();
//	}

	@Override
	public Optional<User> findId(int id) {
		// TODO Auto-generated method stub
		return userep.findById(id);
	}

	@Override
	public Optional<User> updategetUser(int id, User user) {
		// TODO Auto-generated method stub
		return userep.findById(id);
	}

	@Override
	public void deleteUserData(int id) {
		// TODO Auto-generated method stub
		 userep.deleteById(id);
		
	}

	

	
	

	

}
