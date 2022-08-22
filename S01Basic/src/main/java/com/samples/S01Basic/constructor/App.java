package com.samples.S01Basic.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01Basic/constructor/SpringConfig.xml");
         
         Employee emp1 = (Employee) springContainer.getBean("emp"); 
         System.out.println(emp1);
    	 
        
    	 

         
         
    }
}
