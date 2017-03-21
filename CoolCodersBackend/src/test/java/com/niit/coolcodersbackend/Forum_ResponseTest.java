package com.niit.coolcodersbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.coolcodersbackend.dao.Forum_ResponseDao;
import com.niit.coolcodersbackend.model.Forum_Response;



public class Forum_ResponseTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.coolcodersbackend");
	ctx.refresh();
	System.out.println("DONEEEEEEEEEEEEEEEEEEEEEEEEEE");
	
	Forum_ResponseDao forum_reponseDao = (Forum_ResponseDao) ctx.getBean("forum_responseDao");
	System.out.println("doneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
	Forum_Response forum_response=(Forum_Response) ctx.getBean("forum_response");
	System.out.println("22222222222222222222222222222222222222222");
forum_response.setFloginid("ssss");
forum_response.setRdate(null);
forum_response.setFid(1);
forum_response.setRpl("jehdj hebdsnd");
forum_response.setFuser("sssssss");
	forum_reponseDao.SaveOrUpdate(forum_response);// to insert
////	forum_reponseDao.delForum_Respone(100);// to delete
////	forum_response=forum_reponseDao.getFrm(1);
//////	System.out.println(forum_response.getFusr());
//	List <Forum_Response> lst = forum_reponseDao.list();
	//System.out.println(lst.size());
}
}
