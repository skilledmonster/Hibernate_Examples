package com.skilledmonster.sakila.query;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.skilledmonster.sakila.model.Customer;
import com.skilledmonster.sakila.model.HibernateUtil;

public class HibernateSelectUsingNativeSQL {

	public static void main(String[] args) {

		System.out.println("Hibernate Example - Get All Customer Records");
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Query query = session.createSQLQuery("select * from customer c where c.customer_id = :customerId")
		.addEntity(Customer.class)
		.setParameter("customerId", 1) ;
		
		List<Customer> customerList = query.list();
		
		for (Customer cust : customerList) {
			System.out
					.println("-----------------------------------------------------------");
			System.out.println("customerId 	: " + cust.getCustomerId());
			System.out.println("firstName 	: " + cust.getFirstName());
			System.out.println("lastName 	: " + cust.getLastName());
			System.out
					.println("-----------------------------------------------------------");
		}

		//session.getTransaction().commit();
	}

}
