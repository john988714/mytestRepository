package com.silksoftware.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.silksoftware.dao.BaseDao;

@Repository
/*public class UserDao extends HibernateDaoSupport implements BaseDao{
	public void saveObject(Object object) {
		getHibernateTemplate().save(object); 
	}
}*/
public class UserDao implements BaseDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveObject(Object object) {
		sessionFactory.getCurrentSession().save(object); 
	}
}
