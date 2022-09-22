package com.onlinebookstore.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int customerId;
private String customerName;
private String customerPhoneNumber;
private String customerAddress;

@OneToMany(cascade=CascadeType.ALL)
private Set<Book> book;

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getCustomerPhoneNumber() {
	return customerPhoneNumber;
}

public void setCustomerPhoneNumber(String customerPhoneNumber) {
	this.customerPhoneNumber = customerPhoneNumber;
}

public String getCustomerAddress() {
	return customerAddress;
}

public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}

public Set<Book> getBook() {
	return book;
}

public void setBook(Set<Book> book) {
	this.book = book;
}

}
