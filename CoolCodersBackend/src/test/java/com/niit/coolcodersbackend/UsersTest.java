package com.niit.coolcodersbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.coolcodersbackend.dao.UsersDao;
import com.niit.coolcodersbackend.model.Users;

public class UsersTest {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.coolcodersbackend");
		context.refresh();
		System.out.println("Done");
		
		UsersDao usersDao = (UsersDao) context.getBean("usersDao");
		System.out.println("Doneeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		Users users =(Users) context.getBean("users");
		System.out.println("Done11111111111111111111111111111111111");
		///inserting the records******
//		users.setId(2);
//		users.setLoginid("sweety");
//		users.setUsrname("sweety");
//		users.setUsrpwd("sweety");
//		usersDao.insertOrUpdate(users);
//		System.out.println("insertedddddddddddddddddddd");
		///for listing the records
//		 List<Users> lstUsers = usersDao.getAllUsersList();
//		 System.out.println(lstUsers.size());
		////to the fetch the data by id
//		users=usersDao.getById(1);
//			System.out.println(users.getLoginid()+" "+users.getUsrname());
		///to delete data by id
		usersDao.delUsersById(1);
		System.out.println("deletedddddddddddddd");
		
//		
	}
}
