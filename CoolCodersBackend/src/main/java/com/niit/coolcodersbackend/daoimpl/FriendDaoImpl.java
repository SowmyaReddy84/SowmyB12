package com.niit.coolcodersbackend.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.coolcodersbackend.dao.FriendDao;
import com.niit.coolcodersbackend.model.Friend;


public class FriendDaoImpl implements FriendDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	Friend friend;
	
    public FriendDaoImpl(SessionFactory sessionFactory)
    {
		this.sessionFactory = sessionFactory;
	}
	
  @Transactional
	public List<Friend> getAllFrndsList() {
	  @SuppressWarnings("unchecked")
	List<Friend> lstFrnds = (List<Friend>) sessionFactory.getCurrentSession()
				.createCriteria(Friend.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		        return lstFrnds;
	}
@Transactional
	public Friend getFrndById(int frndid) {
	String hql = "from ForumMaster where frndid=" + frndid;
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<Friend> lstFrnds = (List<Friend>) query.list();
	
	if (lstFrnds != null && !lstFrnds.isEmpty()) {
		return lstFrnds.get(0);
	}
	
	return null;
}
@Transactional
	public void SaveOrUpdate(Friend frnd) {
	this.sessionFactory.getCurrentSession().saveOrUpdate(frnd);
		
	}
@Transactional
	public void deleteById(int frndid) {
	Friend frnd = new Friend();
	frnd.setFrndid(frndid);
	sessionFactory.getCurrentSession().delete(friend);
		
	}




}
