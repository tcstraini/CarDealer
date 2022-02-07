package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CustomerRepository;
import com.example.demo.entity.Customer;



@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

	public Iterable<Customer> getCustomers() {
		
		return customerRepository.findAll();
	}

	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
	
	}
	
}