package com.niit.rockcodersbackend.Dao;

import java.util.List;

import com.niit.rockcodersbackend.Model.Users;

public interface UsersDao {
	public void insertOrUpdate(Users users);
	public List<Users> getAllUsersList();
	public Users getById(int id);
	public void deleteById(int id);
	
	

}
