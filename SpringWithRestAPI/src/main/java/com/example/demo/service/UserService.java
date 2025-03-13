package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.User;

public interface UserService {
	public User createUser( User user);
	//public List<User> getAllUser();
	public  Optional<User>  findId(int id);
	public Optional<User> updategetUser(int id, User user);
	public   void deleteUserData(int id);
	
}
