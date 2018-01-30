package com.hwua.jim.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

import com.hwua.jim.entity.User;

public class UserTest {
	
	@Test
	public void create() {
	//anylise
		Configuration cfg= new Configuration().configure();
	//factory
//		SessionFactory ssf= cfg.buildSessionFactory();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		SessionFactory ssf= cfg.buildSessionFactory(serviceRegistry);
	//session object
		Session session= ssf.openSession();
	
		User user= new User();
		user.setId(1);
		user.setAge(24);
		user.setName("BK201");
		user.setPass("1234");
		session.save(user);
		session.beginTransaction().commit();
		
		session.close();
}
}
