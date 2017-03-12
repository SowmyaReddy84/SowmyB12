package com.niit.coolcodersbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.coolcodersbackend.dao.FriendDao;
import com.niit.coolcodersbackend.model.Friend;



public class FriendTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.coolcodersbackend");
	ctx.refresh();
	System.out.println("Doneeeeeeeeeeeeeeeeeeeeeeee");
	
	FriendDao friendDao = (FriendDao) ctx.getBean("friendDao");
	Friend friend = (Friend) ctx.getBean("friend");
	friend.setFrndid(2);
	friend.setUsrid(2);
	friend.setStatus("online");
	friend.setIsOnline('y');
	friendDao.SaveOrUpdate(friend);
	//friendDao.deleteById(1);
	
}
}
