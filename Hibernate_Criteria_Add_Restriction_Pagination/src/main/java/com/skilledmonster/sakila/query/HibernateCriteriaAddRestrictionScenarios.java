package com.skilledmonster.sakila.query;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.skilledmonster.sakila.model.Film;
import com.skilledmonster.sakila.model.HibernateUtil;

public class HibernateCriteriaAddRestrictionScenarios {

	public static void main(String[] args) {

		System.out.println("Hibernate Example - Get All Customer Records");
		Session session = HibernateUtil.getSessionFactory().openSession();

		Criteria cr = session.createCriteria(Film.class);
		cr.setFirstResult(1) ; // this method takes an integer that represents the first row in your result set, starting with row 0.
		cr.setMaxResults(5) ; // This method tells Hibernate to retrieve a fixed number maxResults of objects.
		
		List<Film> results = cr.list();

		System.out.println("Displaying the first 5 films");
		System.out.println("<!----------------------------------------------------------------------------------------------->");
		
		for (Film f: results) {
			
			System.out.println(" Film Title # " + f.getTitle()  ) ;
			
		}
		
		
		cr.setFirstResult(6) ;
		cr.setMaxResults(5) ;
		
		results = cr.list();

		System.out.println("\n Displaying the next 5 films");
		System.out.println("<!----------------------------------------------------------------------------------------------->");
		
		for (Film f: results) {
			
			System.out.println(" Film Title # " + f.getTitle()  ) ;
			
		}
		
		
		

	}

}
