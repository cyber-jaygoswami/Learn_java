package com.learnjava.HibernateInsertDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Employee emp1 = new Employee();
    	emp1.setId(1);
    	emp1.setName("Heath");
    	
    	Employee emp2 = new Employee();
    	emp2.setId(2);
    	emp2.setName("Jay");
    	
    	Configuration conf = new Configuration();
    	conf.configure("hibernate.cfg.xml");
    	conf.addAnnotatedClass(Employee.class);
    	
    	SessionFactory sf = conf.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(emp1);
    	session.save(emp2);
    	
    	tx.commit();
    }
}
