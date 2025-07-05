package com.library;

import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring configuration from XML
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            // Get the bookService bean
            BookService bookService = context.getBean("bookService", BookService.class);

            // Test DI: use the service
            bookService.addBook("Spring in Action");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}