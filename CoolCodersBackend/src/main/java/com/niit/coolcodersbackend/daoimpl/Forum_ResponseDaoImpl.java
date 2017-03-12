package com.niit.coolcodersbackend.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.coolcodersbackend.dao.Forum_ResponseDao;
import com.niit.coolcodersbackend.model.Forum_Response;


public class Forum_ResponseDaoImpl implements Forum_ResponseDao {

	
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	Forum_Response forum_response;
	
	public Forum_ResponseDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}


@Transactional
public List<Forum_Response> getAllList() {
	
		@SuppressWarnings("unchecked")
		
		String hql = "from Users";
//		List<Users> list = (List<Users>) sessionFactory.getCurrentSession().createQuery(hql);
		
		
		
		List<Forum_Response> lstrspnse = (List<Forum_Response>) sessionFactory.getCurrentSession().createCriteria(Forum_Response.class).list();
		return lstrspnse;
	}


@Transactional
public void SaveOrUpdate(Forum_Response rpl) {
	this.sessionFactory.getCurrentSession().saveOrUpdate(rpl);
	
}


public Forum_Response getFrmById(int rid) {
	String hql = "from Forum_Response where rid=" + rid;
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<Forum_Response> lstFrm = (List<Forum_Response>) query.list();
	
	if (lstFrm != null && !lstFrm.isEmpty()) {
		return lstFrm.get(0);
	}
	
	return null;
}



	
}
