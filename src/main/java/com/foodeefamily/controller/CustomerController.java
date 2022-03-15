package com.foodeefamily.controller;

import com.foodeefamily.model.Customer;
import com.foodeefamily.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public String add(@RequestBody Customer customer){
        customerService.saveCustomer(customer);

        return "New customer is added successfully";
    }

    @GetMapping("/getAll")
    public List<Customer> getAll(@RequestBody Customer customer){
        return customerService.getAllCustomers();
    }

    @GetMapping("/getById/{id}")
    public Optional<Customer> getById(@PathVariable int id){ return customerService.findCustomerById(id); }

}
