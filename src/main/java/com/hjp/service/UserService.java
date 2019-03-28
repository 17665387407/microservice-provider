package com.hjp.service;

import java.util.List; 

import com.hjp.entity.User;
public interface UserService {
	
	public boolean addUser(User user);
	
	public User getUser(int id);
	
	public List<User> getUsers();
} 
