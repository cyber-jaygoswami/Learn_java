package com.learnJava.listMappingDemo;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**

 */
public class App 
{
    public static void main( String[] args )
    {
    	Employee emp1 = new Employee();
    	emp1.setId(1);
    	emp1.setName("Dharmesh");
    	
    	Employee emp2 = new Employee();
    	emp2.setId(2);
    	emp2.setName("Madhav");
    	
    	Employee emp3 = new Employee();
    	emp3.setId(3);
    	emp3.setName("Mansi");
    	
    	Employee emp4 = new Employee();
    	emp4.setId(4);
    	emp4.setName("Neha");
    	
    	Department HR = new Department();
    	HR.setId(101);
    	HR.setName("HR_Department");
    	
    	Department IT = new Department();
    	IT.setId(102);
    	IT.setName("IT_Department");
    	
    	IT.setEmployee(Arrays.asList(emp1,emp3));
    	HR.setEmployee(Arrays.asList(emp2,emp4));
    	
        Configuration conf = new Configuration().configure();
        conf.addAnnotatedClass(Department.class);
        conf.addAnnotatedClass(Employee.class);
        
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        
        session.beginTransaction();
        
        session.save(emp1);
        session.save(emp2);
        session.save(emp3);
        session.save(emp4);
        session.save(HR);
        session.save(IT);
        
        session.getTransaction().commit();
    }
}
