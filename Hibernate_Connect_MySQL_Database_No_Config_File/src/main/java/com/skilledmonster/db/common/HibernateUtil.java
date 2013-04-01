package com.skilledmonster.db.common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	 
	private static SessionFactory buildSessionFactory() {
		try {
			
			Configuration cfg = new Configuration() 
			.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
			.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
			.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/sakila")
			.setProperty("hibernate.connection.username", "root")
			.setProperty("hibernate.connection.password", "passw0rd");
			SessionFactory factory = cfg.buildSessionFactory();
			
			
			return factory ; 
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
 
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}

}
