package com.skilledmonster.sakila.query;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.skilledmonster.sakila.model.HibernateUtil;

public class HibernateSelectUsingNativeSQLReturnObjectArray {

	public static void main(String[] args) {

		System.out.println("Hibernate Example - Get All Customer Records");
		Session session = HibernateUtil.getSessionFactory().openSession();

		Query query = session.createSQLQuery("select customer_id from customer c");

		List customerIdList = query.list();

		for (Object customerId : customerIdList) {
			System.out
					.println("-----------------------------------------------------------");
			System.out.println("customerId 	: " + customerId);
			System.out
					.println("-----------------------------------------------------------");
		}

		// session.getTransaction().commit();
	}

}
