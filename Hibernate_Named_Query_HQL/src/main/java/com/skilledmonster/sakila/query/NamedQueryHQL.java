package com.skilledmonster.sakila.query;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.skilledmonster.sakila.model.Customer;
import com.skilledmonster.sakila.model.HibernateUtil;

public class NamedQueryHQL {

	public static void main(String[] args) {

		System.out.println("Hibernate Example - Named Query HQL");
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		//session.beginTransaction();

		Query query = session.getNamedQuery("findCustomerByCustomerId").setInteger("customerId", 1) ;
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
