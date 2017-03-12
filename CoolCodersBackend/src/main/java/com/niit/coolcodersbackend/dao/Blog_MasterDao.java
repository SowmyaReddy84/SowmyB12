package com.niit.coolcodersbackend.dao;

import java.util.List;

import com.niit.coolcodersbackend.model.Blog_Master;



public interface Blog_MasterDao {
public  void SaveOrUpdate(Blog_Master blog);
	
	public List<Blog_Master> getAllList();
	
	public void deleteById(int id);
	
	public Blog_Master getBlogById(int id);

}
