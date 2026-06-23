package com.java.maven;

import com.java.maven.model.Customer;
import com.java.maven.model.Product;

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

        Customer customer3 = Customer.builder()
                        .id(3)
                        .name("customer3")
                        .email("customer@gmail.com").

                        build();
        System.out.println(customer3);


        Product product = new Product();
        product.setName("iphone");
        product.setCategory("mobile");
        product.setCompany("apple");
        product.setRatings(5);
        System.out.println(product);


        Product product1 = new Product("iqoo","mobile","vivo",5);
        System.out.println(product1);
        System.out.println("Name:"+product1.getName());
        System.out.println("Category:" +product1.getCategory());
        System.out.println("Company:"+ product1.getCompany());
        System.out.println("Ratings:"+ product1.getRatings());

        Product product2 = Product.builder()
                       .name("Samsung")
                       .category("mobile")
                       .company("samsung").


                build();
        System.out.println(product2);

    }

}
