package com.niit.coolcodersbackend.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.coolcodersbackend.dao.JobDao;
import com.niit.coolcodersbackend.model.Job;



public class JobDaoImpl implements JobDao {

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	JobDao jobDao;
	@Autowired
	Job job;
	
	public JobDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Job> getAllJobList() {
		String hql = "from Job";
		@SuppressWarnings("unchecked")
		List<Job> joblst = (List<Job>) sessionFactory.getCurrentSession().createCriteria(Job.class).list();
		return joblst;
	}
    @Transactional
	public void SaveOrUpdate(Job job) {
    	sessionFactory.getCurrentSession().saveOrUpdate(job);	
	}
    @Transactional
	public void deleteJobById(int jid) {
    	job.setJid(jid);	
		sessionFactory.getCurrentSession().delete(job);
		
	}
    @Transactional
	public Job getJobById(int jid) {
    	String hql = "from Job where id=" + jid;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Job> lstJob = (List<Job>) query.list();
		
		if (lstJob != null && !lstJob.isEmpty()) {
			return lstJob.get(0);
		}
		return null;
	}


}
