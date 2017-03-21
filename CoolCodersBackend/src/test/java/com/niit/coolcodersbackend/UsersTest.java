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
//		
		///for listing the records
		 List<Users> lstUsers = usersDao.getAllUsersList();
		 System.out.println(lstUsers.size());
		////to the fetch the data by id
//		users=usersDao.getById(1);
//			System.out.println(users.getLoginid()+" "+users.getName());
		///to delete data by id
//		usersDao.delUsersById(1);
//		System.out.println("deletedddddddddddddd");
//		boolean  ss =usersDao.getUsr("ss","ss");
//		if(ss)
//			System.out.println("found");
//		else
//			System.out.println("not found");
////		
		 users=usersDao.getUsr("ss", "ss");
		 System.out.println(users.getLoginid()+" "+users.getName());
		 
//		users.setId(3);
//		users.setLoginid("sweety@gmail.com");
//		users.setName("sweety");
//		users.setPassword("sweety");
//		usersDao.insertOrUpdate(users);
//		
	}
}
