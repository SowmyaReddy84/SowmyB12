package com.niit.coolcodersbackend.dao;

import java.util.List;

import com.niit.coolcodersbackend.model.Profile;



public interface ProfileDao {

	public List<Profile> getAllList();
    Profile getProfileById(int id);
    public void insertORupdate(Profile profile);
    public void delProfileById(int id);
	
}
