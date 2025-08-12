package com.learnJava.demoInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle obj = (Vehicle)context.getBean("vehicleName");
//    	obj.drive();
    	
    	System.out.println(obj.toString());
        
    }
}
