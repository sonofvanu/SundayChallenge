package com.sundayback.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sundayback.model.User;

@Service
public interface UserDao {
	public User insert(User user);
	public User getUserById(int id);
	public List<User> getAllUsers();
	public User login(User user);
}

