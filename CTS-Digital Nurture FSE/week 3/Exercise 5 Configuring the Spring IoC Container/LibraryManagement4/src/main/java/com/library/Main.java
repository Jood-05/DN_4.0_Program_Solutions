package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.*;

public class Main {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService bs = context.getBean("bs", BookService.class);

        // Use the service
        bs.displayBooks();
	}

}
