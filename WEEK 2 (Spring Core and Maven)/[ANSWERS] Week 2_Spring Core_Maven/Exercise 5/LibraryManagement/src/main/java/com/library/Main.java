package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       BookService bookService = (BookService) context.getBean("bookService");




        System.out.println("BookService bean successfully retrieved: true");
    }
}
