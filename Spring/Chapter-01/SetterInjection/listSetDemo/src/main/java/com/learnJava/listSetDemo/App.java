package com.learnJava.listSetDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Emp obj = (Emp)context.getBean("emp");
    	
    	System.out.println(obj.toString());
        
    }
}
