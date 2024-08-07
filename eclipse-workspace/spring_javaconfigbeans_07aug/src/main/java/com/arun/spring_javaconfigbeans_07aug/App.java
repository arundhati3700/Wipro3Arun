package com.arun.spring_javaconfigbeans_07aug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.arun.spring_javaconfigbeans_07aug.model.MyMessage;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyMessage.class);
        
        MyMessage myMessage = context.getBean(MyMessage.class);
        
        myMessage.setMessage("Welcome to the world of Spring Beans - java based configuration");
        
        myMessage.getMessage();
        
        ((AbstractApplicationContext) context).close();
    }
}
