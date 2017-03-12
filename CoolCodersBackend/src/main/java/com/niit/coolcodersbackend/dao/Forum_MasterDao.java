package com.niit.coolcodersbackend.dao;

import java.util.List;

import com.niit.coolcodersbackend.model.Forum_Master;



public interface Forum_MasterDao {

	public void SaveOrUpdate(Forum_Master forum);
	public List<Forum_Master> getAllList();//all view
	public void deleteById(int fid);
	public Forum_Master getFrmById(int fid);//singl view
	public int getLikesById(int fid);
}
