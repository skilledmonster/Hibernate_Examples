package com.skilledmonster.sakila.query;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.skilledmonster.sakila.model.Film;
import com.skilledmonster.sakila.model.HibernateUtil;

public class HibernateCriteriaAddRestrictionScenarios {

	public static void main(String[] args) {

		System.out.println("Hibernate Example - Get All Customer Records");
		Session session = HibernateUtil.getSessionFactory().openSession();

		Criteria cr = session.createCriteria(Film.class);
		cr.setProjection(Projections.avg("rentalDuration"));
		

		List results = cr.list();

		System.out.println("Average Rental Duration " + results.get(0));

	}

}
