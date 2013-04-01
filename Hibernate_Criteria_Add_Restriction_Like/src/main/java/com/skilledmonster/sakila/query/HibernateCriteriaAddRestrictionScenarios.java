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
		cr.add(Restrictions.like("title", "AR%"));

		List<Film> results = cr.list();

		System.out.println("Films with Rental Title that begin with AR");
		System.out.println("<!----------------------------------------------------------------------------------------------->");
		
		for (Film f: results) {
			
			System.out.println(" Film Title # " + f.getTitle()  ) ;
			
		}

	}

}
