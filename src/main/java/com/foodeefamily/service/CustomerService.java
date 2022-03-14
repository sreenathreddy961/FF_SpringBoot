package com.foodeefamily.service;

import com.foodeefamily.model.Customer;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public List<Customer>getAllCustomers();
}
