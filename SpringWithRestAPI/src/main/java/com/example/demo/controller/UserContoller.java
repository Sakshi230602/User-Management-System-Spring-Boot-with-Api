package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;


@RestController
public class UserContoller {
	
	@Autowired
	UserService userservice;
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user)
	{
		
		return  userservice.createUser(user);
	}
	
//	@GetMapping("/user")
//	public List<User> getAllData()
//	{
//		return userservice.getAllUser();
//	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity getDataUser(@PathVariable int id)
	{
		 User user= userservice.findId(id).orElse(null);
		 if(user != null)	 
		 {
			 
		return	 ResponseEntity.ok().body(user);
		 }
		 else
		 {
			return ResponseEntity.notFound().build();
		 }
		
	}
	
	@PutMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable int  id, @RequestBody User user)
	{
		
		 User user1= userservice.findId(id).orElse(null);
		
		 if(user1 != null)	 
		 {
			 userservice.createUser(user);
			 
		return	 ResponseEntity.ok().body(user);
		 }
		 else
		 {
			return ResponseEntity.notFound().build();
		 }
		
	}
	
	@DeleteMapping("/user/{id}")
	public void  deleteUser(@PathVariable int id)
	
	{
		 userservice.deleteUserData(id);
		
	}
	

}

