package com.forhibernate.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.forhibernate.entities.CustomerEntity;

public class CustomerRepository {

	private SessionFactory sessionFactory;
	
	public void save(CustomerEntity customer) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(customer);
		session.getTransaction().commit();
		session.close();
	}
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
}
