package com.skilledmonster.sakila.query;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.skilledmonster.sakila.model.Film;
import com.skilledmonster.sakila.model.HibernateUtil;

public class HibernateCriteriaAddRestrictionScenarios {

	public static void main(String[] args) {

		System.out.println("Hibernate Example - Get All Customer Records");
		Session session = HibernateUtil.getSessionFactory().openSession();

		Criteria cr = session.createCriteria(Film.class);

		cr.add(Restrictions.or(Restrictions.gt("rentalDuration", 5), Restrictions.eq("rentalDuration", 5))) ;
		
		List<Film> results = cr.list();

		System.out.println("Films with Rental duration greater than 5");
		System.out.println("<!----------------------------------------------------------------------------------------------->");
		
		for (Film f: results) {
			
			System.out.println(" Duration " + f.getRentalDuration() +  " - Film Title # " + f.getTitle()  ) ;
			
		}

	}

}
