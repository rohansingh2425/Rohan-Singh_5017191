package com.bookstore.service;

import com.bookstore.entity.Customer;
import java.util.List;

public interface CustomerService
{
    Customer saveCustomer(Customer customer);
    Customer findById(Long id);
    List<Customer> findAll();
    Customer updateCustomer(Long id, Customer customer);
    void deleteCustomer(Long id);
}
