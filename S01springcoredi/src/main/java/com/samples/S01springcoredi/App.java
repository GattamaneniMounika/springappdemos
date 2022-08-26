package com.samples.S01springcoredi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S01springcoredi/SpringConfig.xml");

//		CarDealer dealer = (CarDealer) springContainer.getBean("cardealer");
//		System.out.println(dealer);
		
//		Customer customer = (Customer) springContainer.getBean("customer");
//        System.out.println(customer);
        
 //      Hospital hospital = (Hospital) springContainer.getBean("hospital");
 //       System.out.println(hospital);
		
		CountriesAndLanguages countries = (CountriesAndLanguages) springContainer.getBean("countries");
    	System.out.println(countries);
	}
}