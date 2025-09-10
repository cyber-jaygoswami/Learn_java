package com.learnJava.HibernateAnotations;

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
    	Student s1 = new Student();
    	s1.setId(1);
    	s1.setName("Raj");
    	s1.setMarks(67);
    	s1.setPhone_number(5553434);
    	
    	Student s2 = null;
    	
        Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class);
        
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        // Insert operation
//        session.save(s1);
        
        // Select operation
        s2 = (Student)session.get(Student.class, 1);
        
        // Delete operation
        session.delete(s2);
        
        tx.commit();
        
        
        System.out.println(s2.toString());
    }
}
