package com.skilledmonster.sakila.query;

import org.hibernate.Session;

import com.skilledmonster.sakila.model.Customer;
import com.skilledmonster.sakila.model.CustomerAdditionalDetail;
import com.skilledmonster.sakila.model.HibernateUtil;
import com.skilledmonster.sakila.model.Store;

public class OneToOneMapping {

	public static void main(String[] args) {
		Session session = null ;
		
		try {
			System.out.println("Hibernate Example - Get All Customer Records");
			session = HibernateUtil.getSessionFactory().openSession();
			
			session.beginTransaction();

			Customer c = new Customer() ;
			c.setFirstName("Jagadeesh") ;
			c.setLastName("Motamarri") ;
			
			c.setStore(new Store(1)) ;
			
			
			CustomerAdditionalDetail cad = new CustomerAdditionalDetail() ;
			cad.setEmailAddress("jagadeesh.motamarri@hotmail.com");
			cad.setTermsAndConditions("Y") ;
			cad.setCustomer(c) ;
			
			c.setCustomerAdditionalDetail(cad) ;
			
			
			session.save(c) ;
			
			
			session.getTransaction().commit();
			
			session.flush() ;
		}catch(Exception e) {
			
			e.printStackTrace() ;
		}finally{
			
			HibernateUtil.shutdown();
		}

			
	}
}
