package com.skilledmonster.db.common;

import java.io.FileInputStream;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
    static {
        try {
        	
        	Properties props = new Properties();
        	props.load(new FileInputStream("src/main/resources/hibernate.properties")) ;
        	
        	Configuration cfg = new Configuration() ;
        	cfg.addProperties(props) ;
        	
            sessionFactory = cfg.buildSessionFactory();
            
            
            
        } catch (Throwable ex) {
            // Log exception!
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession()
            throws HibernateException {
        return sessionFactory.openSession();
    }

	public static void shutdown() {
		// Close caches and connection pools
		getSession().close();
	}
}
