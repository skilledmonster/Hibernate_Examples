package com.skilledmonster.sakila.query;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.skilledmonster.sakila.model.Customer;
import com.skilledmonster.sakila.model.HibernateUtil;

public class NamedQueryNativeSQLAnnotation {

	public static void main(String[] args) {

		System.out.println("Hibernate Example - Get All Customer Records - Using Annotation");

		// get session
		Session session = HibernateUtil.getSession();
		
		Query query = session.getNamedQuery("findCustomerByCustomerIdUsingNativeSQL")
				.setInteger("customerId", 1) ;
		List<Customer> customerList = query.list();


		// iterate and display the records
		for (Customer cust : customerList) {
			System.out
					.println("-----------------------------------------------------------");
			System.out.println("customerId 	: " + cust.getCustomerId());
			System.out.println("firstName 	: " + cust.getFirstName());
			System.out.println("lastName 	: " + cust.getLastName());
			System.out
					.println("-----------------------------------------------------------");
		}
		
	}

}
