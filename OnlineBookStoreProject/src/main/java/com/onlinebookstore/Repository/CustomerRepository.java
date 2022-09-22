package com.onlinebookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinebookstore.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
