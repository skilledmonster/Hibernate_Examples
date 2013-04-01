package com.skilledmonster.sakila.query;

import org.hibernate.Session;

import com.skilledmonster.sakila.model.Customer;
import com.skilledmonster.sakila.model.HibernateUtil;

public class GetSingleCustomerRecordUsingGet {

	public static void main(String[] args) {

		System.out.println("Hibernate Example - Get All Customer Records");
		Session session = HibernateUtil.getSessionFactory().openSession();

		int customerId = 1111111;

		Customer cust = (Customer) session.get(Customer.class, customerId);

		if (cust != null) {
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
