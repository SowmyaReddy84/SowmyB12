package com.niit.coolcodersbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.coolcodersbackend.dao.Blog_CommentDao;
import com.niit.coolcodersbackend.model.Blog_Comment;






public class Blog_CommentTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.coolcodersbackend");
	ctx.refresh();
	System.out.println("DONE");
	
	Blog_CommentDao blog_commentDao = (Blog_CommentDao) ctx.getBean("blog_commentDao");
	System.out.println("doneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
	Blog_Comment blog_comment=(Blog_Comment) ctx.getBean("blog_comment");
	System.out.println("22222222222222222222222222222222222222222");

	blog_comment.setBid(1);
	blog_comment.setBusr("sweety");
blog_comment.setCdat("03-12-17");
blog_comment.setCmt("nice");
blog_commentDao.SaveOrUpdate(blog_comment);
//	List <Blog_Comment> lst = bc.getAll();
//	System.out.println(lst.size());
}
}
