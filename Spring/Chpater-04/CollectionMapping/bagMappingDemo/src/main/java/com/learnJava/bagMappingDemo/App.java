package com.learnJava.bagMappingDemo;

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
    	Employee emp1 = new Employee();
    	emp1.setId(1);
    	emp1.setName("Jay");
    	Employee emp2 = new Employee();
    	emp2.setId(2);
    	emp2.setName("Raj");
    	Employee emp3 = new Employee();
    	emp3.setId(3);
    	emp3.setName("Harsh");
    	
    	Department HR = new Department();
    	HR.setId(101);
    	HR.setName("HR_Department");
    	Department IT = new Department();
    	IT.setId(102);
    	IT.setName("IT_Department");
    	
    	HR.addEmployee(emp1);
    	HR.addEmployee(emp3);
    	IT.addEmployee(emp2);
    	
    	
        Configuration conf = new Configuration().configure();
        conf.addAnnotatedClass(Employee.class);
        conf.addAnnotatedClass(Department.class);
        
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        
        session.save(emp1);
        session.save(emp2);
        session.save(emp3);
        session.save(HR);
        session.save(IT);
        
        session.getTransaction().commit();
    }
}
