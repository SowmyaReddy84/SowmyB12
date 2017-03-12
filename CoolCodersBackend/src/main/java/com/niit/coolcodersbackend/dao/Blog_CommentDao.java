package com.niit.coolcodersbackend.dao;

import java.util.List;

import com.niit.coolcodersbackend.model.Blog_Comment;




public interface Blog_CommentDao {

	public void SaveOrUpdate(Blog_Comment cmnt);
	public List<Blog_Comment> getCmtsById(int id);
	public List<Blog_Comment> getAllCmnts();
}
