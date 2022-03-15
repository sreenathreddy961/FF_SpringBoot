package com.foodeefamily.service;

import com.foodeefamily.model.Customer;
import com.foodeefamily.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl  implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) { return customerRepository.save(customer); }

    @Override
    public List<Customer> getAllCustomers() { return customerRepository.findAll(); }

    @Override
    public Optional<Customer> findCustomerById(int id) { return customerRepository.findById(id);   }
}
