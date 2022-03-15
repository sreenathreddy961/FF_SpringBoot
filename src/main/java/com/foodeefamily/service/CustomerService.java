package com.foodeefamily.service;

import com.foodeefamily.model.Customer;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public List<Customer>getAllCustomers();
    public Optional<Customer> findCustomerById(int id);
}
