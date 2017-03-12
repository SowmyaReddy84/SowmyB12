package com.niit.coolcodersbackend.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.coolcodersbackend.dao.Blog_CommentDao;
import com.niit.coolcodersbackend.model.Blog_Comment;



public class Blog_CommentDaoImpl implements Blog_CommentDao{

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private Blog_Comment blog_comment;
	
	public Blog_CommentDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void SaveOrUpdate(Blog_Comment cmnt) {
	
		this.sessionFactory.getCurrentSession().saveOrUpdate(cmnt);
	}
	@Transactional
	public List<Blog_Comment> getCmtsById(int id) {
	
		String hql = "from BComment where bid="+id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Blog_Comment> lstCmnt = (List<Blog_Comment>) query.list();
		
		if (lstCmnt != null && !lstCmnt.isEmpty()) {
			return lstCmnt;
		}
		
		return null;
	
	}
	@Transactional
	public List<Blog_Comment> getAllCmnts() {
	
		@SuppressWarnings("unchecked")
		List<Blog_Comment> lstCmnts = (List<Blog_Comment>) sessionFactory.getCurrentSession()
				.createCriteria(Blog_Comment.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		        return lstCmnts;
	
	}

	

	

}
