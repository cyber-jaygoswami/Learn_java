package com.learnJava.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.aot.ApplicationContextAotGenerator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class App 
{
    public static void main( String[] args )
    {
    	// Tight coupling
//    	Car obj = new Car();
//    	obj.drive();
    	
//    	Bike obj = new Bike();
//    	obj.drive();
        
    	
    	
    	// Loose coupling
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Vehicle obj = (Vehicle)(context.getBean("vehicleName"));
    	obj.drive();
    }
}
