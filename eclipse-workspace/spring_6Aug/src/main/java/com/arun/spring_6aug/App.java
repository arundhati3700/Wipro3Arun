package com.arun.spring_6aug;

import com.arun.spring_6aug.model.Employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext
        
    	@SuppressWarnings("resource")
		BeanFactory factory = new ClassPathXmlApplicationContext("Beans.xml");
    	
        Employee e1 = (Employee) factory.getBean("empbean");
        
        Employee e2 = (Employee) factory.getBean("emp2");
        
        Employee e3 = (Employee) factory.getBean("emp3");
        
        System.out.println(e1 + " " + e2 + " " + e3);
        
        
    }
}
