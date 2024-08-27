package com.bookstore.service;

import com.bookstore.entity.Book;
import java.util.List;

public interface BookService {
    Book saveBook(Book book);
    Book findById(Long id);
    List<Book> findAll();
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
}
