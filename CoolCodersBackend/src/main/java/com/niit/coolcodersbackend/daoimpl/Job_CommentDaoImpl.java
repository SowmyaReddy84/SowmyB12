package com.niit.coolcodersbackend.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.coolcodersbackend.dao.Job_CommentDao;
import com.niit.coolcodersbackend.model.Job_Comment;



public class Job_CommentDaoImpl implements Job_CommentDao {

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	Job_Comment job_comment;
	
	public Job_CommentDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public void SaveOrUpdate(Job_Comment cmnt) {
	this.sessionFactory.getCurrentSession().saveOrUpdate(cmnt);
		
	}
@Transactional
	public List<Job_Comment> getCmtsById(int id) {
		String hql = "from Job_Comment where jid="+id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Job_Comment> listCmt = (List<Job_Comment>) query.list();
		
		if (listCmt != null && !listCmt.isEmpty()) {
			return listCmt;
		}
		return null;
	}
@Transactional
	public List<Job_Comment> getAllCmnts() {
String hql = "from JobComment";
         @SuppressWarnings("unchecked")
		List<Job_Comment> list = (List<Job_Comment>) sessionFactory.getCurrentSession().createCriteria(Job_Comment.class).list();
		return list;
	}


}
