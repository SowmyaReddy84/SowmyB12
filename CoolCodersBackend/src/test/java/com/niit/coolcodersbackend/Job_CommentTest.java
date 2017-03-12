package com.niit.coolcodersbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.coolcodersbackend.dao.Job_CommentDao;
import com.niit.coolcodersbackend.model.Job_Comment;


public class Job_CommentTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.coolcodersbackend");
	ctx.refresh();
	System.out.println("done");
	Job_CommentDao job_commentDao = (Job_CommentDao) ctx.getBean("job_commentDao");
	Job_Comment job_comment = (Job_Comment)ctx.getBean("job_comment");
	job_comment.setCid(1);
	job_comment.setJid(2);
    job_comment.setJuser("abc");
    job_commentDao.SaveOrUpdate(job_comment);
//	List <Job_Comment> lst = job_commentDao.getAll();
//	System.out.println(lst.size());
}
}
