package com.niit.coolcodersbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.coolcodersbackend.dao.Blog_MasterDao;
import com.niit.coolcodersbackend.model.Blog_Master;


public class Blog_MasterTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.coolcodersbackend");
		ctx.refresh();
		System.out.println("DONE");
	
		Blog_MasterDao blog_masterDao = (Blog_MasterDao) ctx.getBean("blog_masterDao");
		Blog_Master blog_master = (Blog_Master) ctx.getBean("blog_master");
		blog_master.setBid(3);
	    blog_master.setBtitle("friends");
		blog_master.setBuser("chintu");
		blog_master.setBlike(4);
		blog_master.setBdesc("The greatest healing therapy is friendship and love." );
		blog_master.setBlog_image("bid.jpg");
		blog_master.setBdata("Nature, in the broadest sense, is the natural, physical, or material world or universe. Nature can refer to the phenomena of the physical world, and also to life in general. The study of nature is a large part of science. Although humans are part of nature, human activity is often understood as a separate category from other natural phenomena");

		
		blog_masterDao.SaveOrUpdate(blog_master);
		
		//blog_masterDao.deleteById(0);
		
		
	
		
//		List <Blog_Master> lst1 = blog_masterDao.list();
//		System.out.println(lst.size());
	}

}
