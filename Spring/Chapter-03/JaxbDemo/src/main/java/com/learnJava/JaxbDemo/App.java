package com.learnJava.JaxbDemo;

import java.io.File;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Jaxb2Marshaller marshaller = (Jaxb2Marshaller)context.getBean("marshaller");
        
        Employee emp1 = new Employee(1,"Jay");
        
        //Marshaling (Java Object -> XML)
        File f1 = new File("employee.xml");
        marshaller.marshal(emp1, new StreamResult(f1));
        System.out.println("File Converted to xml");
        
        //Unmarshaling (XML -> Java Object)
        Employee objFromXML = (Employee)marshaller.unmarshal(new StreamSource(f1));
        System.out.println(objFromXML.toString());
        
        
        
        
    }
}
