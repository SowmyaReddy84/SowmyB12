package com.niit.coolcodersbackend.dao;

import java.util.List;

import com.niit.coolcodersbackend.model.Job_Comment;



public interface Job_CommentDao {
	
	public void SaveOrUpdate(Job_Comment cmnt);
	public List<Job_Comment> getCmtsById(int id);
	public List<Job_Comment> getAllCmnts();
}
