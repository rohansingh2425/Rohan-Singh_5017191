package com.library;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public BookService() {}


    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        System.out.println("Performing service with both constructor and setter injection");
    }

}
