package com.niit.coolcodersbackend.dao;

import java.util.List;

import com.niit.coolcodersbackend.model.Job;


public interface JobDao {
	
	
public List<Job> getAllJobList();
public void SaveOrUpdate (Job job);
public void deleteJobById (int jid);
public Job getJobById(int jid);

}

