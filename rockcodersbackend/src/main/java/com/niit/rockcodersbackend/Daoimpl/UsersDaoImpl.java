package com.niit.rockcodersbackend.Daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.rockcodersbackend.Dao.UsersDao;
import com.niit.rockcodersbackend.Model.Users;

public class UsersDaoImpl implements UsersDao{
	
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
		sessionFactory.getCurrentSession().saveOrUpdate(users);;
		
	}
@Transactional
	public List<Users> getAllUsersList() {
		@SuppressWarnings("unchecked")
		List<Users> lstUsers = (List<Users>) sessionFactory.getCurrentSession()
				.createCriteria(Users.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		        return lstUsers;
	}

	public Users getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

}
