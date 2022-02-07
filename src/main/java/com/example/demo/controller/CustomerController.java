package com.example.demo.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@GetMapping("/customer")
	Iterable<Customer> getCustomers() {
	      return customerService.getCustomers();
	 }
  
	@PostMapping("/customer") // create
	void createStart (@RequestBody Customer customer) {
	customerService.saveCustomer(customer);
	}
	
}