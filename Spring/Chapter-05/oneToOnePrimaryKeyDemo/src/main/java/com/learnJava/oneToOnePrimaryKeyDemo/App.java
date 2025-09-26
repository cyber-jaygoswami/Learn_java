package com.learnJava.oneToOnePrimaryKeyDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s1 = new Student();
    	s1.setRoll_no(11);
    	s1.setName("Nidhi");
    	
    	Student s2 = new Student();
    	s2.setRoll_no(12);
    	s2.setName("Nishita");
    	
    	Laptop l1 = new Laptop();
    	l1.setName("Dell Alienware");
    	Laptop l2 = new Laptop();
    	l2.setName("Mac M3 Pro");
    	
    	s1.setLaptop(l1);
    	l1.setStudent(s1);
    	s2.setLaptop(l2);
    	l2.setStudent(s2);
    	
    	
        Configuration conf = new Configuration().configure();
        conf.addAnnotatedClass(Laptop.class);
        conf.addAnnotatedClass(Student.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        
        session.save(s1);
        session.save(s2);
        session.save(l1);
        session.save(l2);
        
        session.getTransaction().commit();
    }
}
