package com.learnJava.objectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        B obj = (B)context.getBean("class_b");
        
        System.out.println(obj.toString());
        
        A obj2 = (A)context.getBean("class_a");
        System.out.println(obj2.toString());
    }
}
