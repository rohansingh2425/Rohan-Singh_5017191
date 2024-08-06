package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;


    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public BookRepository getBookRepository() {
        return bookRepository;
    }


    public void performAction() {
        System.out.println("Performing action...");

        try {
            Thread.sleep(500); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
