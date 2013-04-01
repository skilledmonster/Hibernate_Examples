package com.skilledmonster.sakila.query;

import org.hibernate.Session;
import org.hibernate.stat.Statistics;

import com.skilledmonster.db.common.HibernateUtil;

public class CheckMySQLDatabaseConnectionGetStatistics {

	public static void main(String[] args) {

		System.out
		.println("-------- MySQL Hibernate Connection Testing ------------");

		Session session = HibernateUtil.getSessionFactory().openSession();
		
		
		if (session.isConnected()) {
			System.out.println("Connection Successful!! You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		System.out.println("Now Gathering Hibernate Statistics");
		
		Statistics stats = HibernateUtil.getSessionFactory().getStatistics();
		stats.setStatisticsEnabled(true);
		
		// Number of connection requests. Note that this number represents 
		// the number of times Hibernate asked for a connection, and 
		// NOT the number of connections (which is determined by your 
		// pooling mechanism).
		System.out.println("Number of Connections # "+stats.getConnectCount());
		// Number of flushes done on the session (either by client code or 
		// by hibernate).
		System.out.println("Flush Count # "+stats.getFlushCount());
		// The number of completed transactions (failed and successful).
		System.out.println("The number of completed transactions (failed and successful) # "+stats.getTransactionCount());
		// The number of transactions completed without failure
		System.out.println("The number of transactions completed without failure# "+stats.getSuccessfulTransactionCount());
		// The number of sessions your code has opened.
		System.out.println("The number of sessions your code has opened # "+stats.getSessionOpenCount());
		// The number of sessions your code has closed.
		System.out.println("The number of sessions your code has closed # "+stats.getSessionCloseCount());
		// All of the queries that have executed.
		System.out.println("All of the queries that have executed # "+stats.getQueries());
		// Total number of queries executed.
		System.out.println("Total number of queries executed # "+stats.getQueryExecutionCount());
		// Time of the slowest query executed.
		System.out.println("Time of the slowest query executed # "+stats.getQueryExecutionMaxTime());
		
		System.out.println("---------------------------------------------------");
		stats.logSummary();
		
	}

}
