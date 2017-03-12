package com.niit.coolcodersbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.coolcodersbackend.dao.JobDao;
import com.niit.coolcodersbackend.model.Job;


public class JobTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.coolcodersbackend");
	ctx.refresh();
	System.out.println("done");
	
	JobDao jobDao = (JobDao) ctx.getBean("jobDao");
	Job job = (Job) ctx.getBean("job");
	job.setJid(2);
	job.setTitle("manager");
	job.setDescription("requires min 2 years experience");
	job.setQualification("pg");
	jobDao.SaveOrUpdate(job);
	System.out.println("inserted");
//	
	
}
}
