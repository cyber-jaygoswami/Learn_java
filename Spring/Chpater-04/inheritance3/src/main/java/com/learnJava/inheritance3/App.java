package com.learnJava.inheritance3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Regular_Employee re = new Regular_Employee();
    	re.setId(1);
    	re.setName("Jay");
    	re.setSalary(50000);
    	re.setBonus(10000);
    	
    	Contract_Employee ce = new Contract_Employee();
    	ce.setId(2);
    	ce.setName("Ajay");
    	ce.setPay_per_hour(200);
    	ce.setContract_period("6 Months");
    	
    	Configuration conf = new Configuration().configure();
    	conf.addAnnotatedClass(Employee.class);
    	conf.addAnnotatedClass(Regular_Employee.class);
    	conf.addAnnotatedClass(Contract_Employee.class);
    	
    	SessionFactory sf = conf.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	session.beginTransaction();
    	
    	session.save(re);
    	session.save(ce);
    	
    	
    	session.getTransaction().commit();
    }
}
