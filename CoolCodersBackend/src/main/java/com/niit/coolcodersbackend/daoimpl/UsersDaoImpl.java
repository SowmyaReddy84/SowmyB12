package com.niit.coolcodersbackend.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.coolcodersbackend.dao.UsersDao;
import com.niit.coolcodersbackend.model.Users;

public class UsersDaoImpl implements UsersDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired 
	private Users users;
	
	@Autowired 
	private UsersDao usersDao;
	
	public UsersDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertOrUpdate(Users users) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(users);
	}
	@Transactional
	public List<Users> getAllUsersList() {
		String hql="from Users";
		List<Users> lst =(List<Users>)sessionFactory.getCurrentSession().createCriteria(Users.class).list();
		return lst;
	}
@Transactional
	public Users getById(int id) {
	String hql = "from Users where id=" + id;
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<Users> lstUsers = (List<Users>) query.list();
	
	if (lstUsers != null && !lstUsers.isEmpty()) {
		return lstUsers.get(0);
	}
	return null;
	}
@Transactional
	public void delUsersById(int id) {
	users.setId(id);	
	sessionFactory.getCurrentSession().delete(users);
		
	}

}
