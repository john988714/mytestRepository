package com.silksoftware.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	
    private static Configuration cfg = new Configuration().configure("/hibernate.cfg.xml");
    private static SessionFactory sessionFactory = cfg.buildSessionFactory(); 
    private static Session session;
    public static Session getSession(){
    	if(sessionFactory != null){
    		session = sessionFactory.openSession();
    	}
		return session;
    }
    
    public static void closeSession(){
    	if(session !=null){
    		session.close();
    	}
    }
}  