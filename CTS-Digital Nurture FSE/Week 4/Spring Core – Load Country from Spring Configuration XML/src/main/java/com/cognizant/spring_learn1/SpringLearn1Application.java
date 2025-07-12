package com.cognizant.spring_learn1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearn1Application {

    public static void main(String[] args) {
        System.out.println("START");
        displayCountry();
        System.out.println("END");
    }

    public static void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country");
        System.out.println("Country : " + country.toString());
    }
}
