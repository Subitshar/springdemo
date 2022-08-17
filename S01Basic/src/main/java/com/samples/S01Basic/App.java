package com.samples.S01Basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01Basic/SpringConfig.xml");
         
//         Employee emp = (Employee) springContainer.getBean("emp"); 
//         System.out.println(emp);
    	 
//    	 Hospital Hospital = (Hospital) springContainer.getBean("Hospital"); 
//         System.out.println(Hospital);
//    	 
//    	 Carservice carser =(Carservice) springContainer.getBean("carser"); 
//         System.out.println(carser);
//         
//
//    	 Customer customer =(Customer) springContainer.getBean("customer"); 
//         System.out.println(customer);
    	 
    	 Shoppingcart shoppingcart=(Shoppingcart) springContainer.getBean("shoppingcart");
    	 System.out.println(shoppingcart);
         
         
    }
}
