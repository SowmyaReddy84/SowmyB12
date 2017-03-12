package com.niit.coolcodersbackend.dao;
import java.util.List;

import com.niit.coolcodersbackend.model.Friend;


public interface FriendDao {

	public List<Friend> getAllFrndsList();
	public Friend getFrndById(int frndid);
	public void SaveOrUpdate(Friend frnd);
	public void deleteById(int frndid);
}
