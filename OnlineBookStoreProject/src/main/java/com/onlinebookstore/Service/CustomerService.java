package com.onlinebookstore.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebookstore.Repository.CustomerRepository;
import com.onlinebookstore.entity.Customer;



@Service
@Transactional
public class CustomerService {
@Autowired
private CustomerRepository customerRepository;
public List<Customer> getAllCustomer() {
	return customerRepository.findAll();
}
public Customer addCustomer(Customer customer)
{
	return customerRepository.save(customer);
}
public Customer searchById(int customerId)
{
	return customerRepository.findById(customerId).get();
}
public void deleteCustomer(int customerId) {
	
	customerRepository.deleteById(customerId);
}
}
