package com.learnJava.iheritance4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
Table per subclass using annotations
 */
public class App 
{
    public static void main( String[] args )
    {
    	Regular_Employee re= new Regular_Employee();
    	re.setId(1);
    	re.setName("Jay");
    	re.setSalary(500033);
    	re.setBonus(34233);
    	
    	Contract_Employee ce = new Contract_Employee();
    	ce.setId(2);
    	ce.setName("Raj");
    	ce.setContract_period("11 Months");
    	ce.setPay_per_hour(200);
    	Configuration conf= new Configuration().configure();
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
