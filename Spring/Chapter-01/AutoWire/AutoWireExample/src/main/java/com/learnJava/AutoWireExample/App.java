package com.learnJava.AutoWireExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Emp emp1 = (Emp)context.getBean("emp1");
        
        System.out.println(emp1.toString());
    }
}
