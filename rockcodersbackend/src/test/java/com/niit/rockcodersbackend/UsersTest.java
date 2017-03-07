package com.niit.rockcodersbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.rockcodersbackend.Dao.UsersDao;
import com.niit.rockcodersbackend.Model.Users;



//import com.niit.rockcodersbackend.Dao.UsersDao;
//import com.niit.rockcodersbackend.Model.Users;

public class UsersTest {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		context.scan("com.niit.rockcodersbackend.*");
		context.refresh();
		System.out.println("done");
		
//		UsersDao usersDao = (UsersDao) context.getBean("usersDao");
//		System.out.println("done22222222222222222222222222");
//		Users users = (Users) context.getBean("users");
//		System.out.println("done33333333333333333333333333");
//		users.setId(1);
//		users.setLoginId(1);
//		users.setUserName("sowmya");
//		users.setUserPwd("sweety84");
//		usersDao.insertOrUpdate(users);
//		System.out.println("inserted");
//		List <Users> lst = usersDao.getAllUsersList();
//		System.out.println(lst.size());
	}

}
