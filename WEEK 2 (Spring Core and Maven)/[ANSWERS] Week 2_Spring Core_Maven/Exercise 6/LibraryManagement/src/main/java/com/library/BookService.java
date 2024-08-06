package com.library;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        System.out.println("BookService is working!");
    }
}
