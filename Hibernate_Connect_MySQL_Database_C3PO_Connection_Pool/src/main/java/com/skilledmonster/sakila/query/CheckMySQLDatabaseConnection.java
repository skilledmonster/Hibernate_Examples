package com.skilledmonster.sakila.query;

import org.hibernate.Session;

import com.skilledmonster.db.common.HibernateUtil;

public class CheckMySQLDatabaseConnection {

	public static void main(String[] args) {

		System.out
		.println("-------- MySQL Hibernate Connection Testing ------------");

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		
		if (session.isConnected()) {
			System.out.println("Connection Successful!! You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
	}

}
