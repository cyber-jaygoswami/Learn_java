package com.learnJava.selectDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
Select and Update operation
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration conf = new Configuration().configure("myHibernate.xml").addAnnotatedClass(Employee.class);
        
        SessionFactory sf = conf.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        //get values
        Employee emp1= (Employee)session.get(Employee.class, 2);
        
        // update values
        emp1.setName("Jay goswami");
        
        tx.commit();
        
        System.out.println(emp1.toString());
        
        
        
    }
}
