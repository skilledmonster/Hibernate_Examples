package com.skilledmonster.sakila.query;

import org.hibernate.Query;
import org.hibernate.Session;

import com.skilledmonster.sakila.model.HibernateUtil;

public class HQLUpdateRecord {

	public static void main(String[] args) {

		System.out.println("Hibernate Example - Get All Customer Records");
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Query query = session.createQuery("update Customer set firstName = :firstName where customerId = :id");
		query.setParameter("id", 1);
		query.setParameter("firstName", "Shiva");
		
		int result = query.executeUpdate() ; 
	
		session.getTransaction().commit();
		
		session.flush();

	}

}
