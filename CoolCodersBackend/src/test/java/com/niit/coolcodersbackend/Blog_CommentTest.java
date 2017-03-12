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
	System.out.println("DONEEEEEEEEEEEEEEEEEEEEE");
	
	Blog_CommentDao blogCommentDao= (Blog_CommentDao) ctx.getBean("blog_commentDao");
	System.out.println("doneeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
	Blog_Comment blog_comment=(Blog_Comment) ctx.getBean("blog_comment");
	System.out.println("22222222222222222222222222222222222222222");
blog_comment.setBid(2);
blog_comment.setBuser("abc");
blog_comment.setCid(2);
blog_comment.setCdate( new java.util.Date().getTime());
blog_comment.setCmnt("good");
blogCommentDao.SaveOrUpdate(blog_comment);
System.out.println("inserteddddddddddddddd");
	//for listing the records
//List<Blog_Comment> lstcmnts =blogCommentDao.getAllCmnts();
//System.out.println(lstcmnts.size());
////to the fetch the data by id
	//blog_comment=blogCommentDao.getCmtsById(1);
//	System.out.println(blog_comment.getBuser());



}
}
