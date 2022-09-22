package com.onlinebookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebookstore.Service.CustomerService;
import com.onlinebookstore.entity.Customer;

@RestController
public class CustomerController {
@Autowired
private CustomerService customerService;

@GetMapping("/customerlist")
public List<Customer> getCustomer()
{
	return this.customerService.getAllCustomer();
}
@PostMapping("/addcustomer")
public Customer addCustomer(@RequestBody Customer customer) 
{ 
	return customerService.addCustomer(customer);
}
@DeleteMapping("/delete/{id}")
public String delCustomer(@PathVariable int id)
{
	this.customerService.deleteCustomer(id);
	return "Customer has been deleted";
}
}
