package com.learnJava.hibernateGenerator;

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
    	Student s1 = new Student("Jay");
    	Student s2 = new Student("Ajay");
    	Student s3 = new Student("Raj");
    	Student s4 = new Student(111,"Krunal");
    	Student s5 = new Student("Hitesh");
    	Student s6 = new Student(5,"Mehul");

        Configuration conf = new Configuration().configure();
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        
        
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(s4);
        session.save(s5);
        session.save(s6); 	
        session.getTransaction().commit();
        
    }
}
