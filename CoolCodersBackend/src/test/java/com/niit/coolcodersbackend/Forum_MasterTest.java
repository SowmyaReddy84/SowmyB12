package com.niit.coolcodersbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.coolcodersbackend.dao.Forum_MasterDao;
import com.niit.coolcodersbackend.model.Forum_Master;



public class Forum_MasterTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.coolcodersbackend");
	ctx.refresh();
	System.out.println("DONE");
	
	Forum_MasterDao forum_masterDao = (Forum_MasterDao) ctx.getBean("forum_masterDao");
	System.out.println("doneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
	Forum_Master forum_master=(Forum_Master) ctx.getBean("forum_master");
	System.out.println("22222222222222222222222222222222222222222");
	forum_master.setFid(10);
	forum_master.setFcmnt(10);
	forum_master.setFdy("bdvhjdkjbjk jvkdhbj bhdf");
	forum_master.setFliket(5);
	forum_master.setFpstdate(null);
	forum_master.setFsec("Education");
	forum_master.setFtitle("HTML");
	forum_master.setFuser("sweety");
forum_masterDao.SaveOrUpdate(forum_master);
	// to insert
	//forum_masterDao.delForum_Master(10);// to delete
//	forum_master = forum_masterDao.getFrm(1);
//	System.out.println(forum_master.getFdy());
	
//	List <Forum_Master> lst = forum_masterDao.list();
//	System.out.println(lst.size());
//	
}
}
