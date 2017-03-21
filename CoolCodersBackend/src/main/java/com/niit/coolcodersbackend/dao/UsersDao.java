package com.niit.coolcodersbackend.dao;

import java.util.List;

import com.niit.coolcodersbackend.model.Users;

public interface UsersDao {
	
	public void insertOrUpdate(Users users);
	public List<Users> getAllUsersList();
	public Users getById(int id);
	public Users getuserByName(String name);
	public void delUsersById(int id);
	public Users getUsr(String name,String password);

}
