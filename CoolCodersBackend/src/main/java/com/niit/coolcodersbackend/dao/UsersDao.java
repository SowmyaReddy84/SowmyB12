package com.niit.coolcodersbackend.dao;

import java.util.List;

import com.niit.coolcodersbackend.model.Users;

public interface UsersDao {
	
	public void insertOrUpdate(Users users);
	public List<Users> getAllUsersList();
	public Users getById(int id);
	public void delUsersById(int id);
}
