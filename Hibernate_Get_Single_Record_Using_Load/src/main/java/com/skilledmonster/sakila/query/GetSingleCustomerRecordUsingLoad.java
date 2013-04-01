package com.skilledmonster.sakila.query;

import org.hibernate.Session;
import org.hibernate.stat.Statistics;

import com.skilledmonster.sakila.model.Customer;
import com.skilledmonster.sakila.model.HibernateUtil;

public class GetSingleCustomerRecordUsingLoad {

	public static void main(String[] args) {

		System.out.println("Hibernate Example - Get All Customer Records");
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		// enable statistics
		Statistics stats = HibernateUtil.getSessionFactory().getStatistics();
		stats.setStatisticsEnabled(true);
		
		int customerId = 111111;

		Customer cust = (Customer) session.load(Customer.class, customerId);

		if (cust != null) {
			System.out
					.println("-----------------------------------------------------------");
			System.out.println("customerId 	: " + cust.getCustomerId());
			System.out.println("firstName 	: " + cust.getFirstName());
			System.out.println("lastName 	: " + cust.getLastName());
			System.out
					.println("-----------------------------------------------------------");

		}
		stats.logSummary();
		HibernateUtil.shutdown(); 
	}

}
