package com.niit.coolcodersbackend.dao;

import java.util.List;


import com.niit.coolcodersbackend.model.Forum_Response;



public interface Forum_ResponseDao {

	public void SaveOrUpdate(Forum_Response rpl);
	public List<Forum_Response> getAllList();
	public Forum_Response getFrmById(int fid);
	public List<Forum_Response> getRpls(int id);
}
