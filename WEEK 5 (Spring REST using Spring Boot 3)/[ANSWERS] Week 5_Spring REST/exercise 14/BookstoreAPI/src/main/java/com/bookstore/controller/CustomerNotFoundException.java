package com.bookstore.controller;

public class CustomerNotFoundException extends RuntimeException
{

    public CustomerNotFoundException(String message)
    {
        super(message);
    }

    public CustomerNotFoundException(Long id)
    {
        super("Customer not found with ID: " + id);
    }
}
