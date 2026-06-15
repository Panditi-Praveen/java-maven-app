package com.java.maven;

import com.java.maven.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("test");
        customer.setEmail("test@fmail.com");
        System.out.println(customer );


        Customer customer2 = new Customer(2,"customer2","customer2@gmail.com");
        System.out.println(customer2);
        System.out.println("Id:"+ customer2.getId());
        System.out.println("Name:"+customer2.getName());
        System.out.println("Email:"+customer2.getEmail());
    }

}
