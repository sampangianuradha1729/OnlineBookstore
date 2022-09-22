package com.onlinebookstore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int bookId;
private String bookName;
private String authorName;
private int bookprice;
private int bookquantity;

@ManyToOne
@JoinColumn(name="CustomerId")
private Customer customer;
 

public Book(int bookId, String bookName, String authorName, int bookprice, int bookquantity, Customer customer) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.authorName = authorName;
	this.bookprice = bookprice;
	this.bookquantity = bookquantity;
	this.customer = customer;
}

public String getAuthorname() {
	return authorName;
}

public void setAuthorname(String authorname) {
	authorName = authorname;
}

public int getBookprice() {
	return bookprice;
}

public void setBookprice(int bookprice) {
	this.bookprice = bookprice;
}

public int getBookquantity() {
	return bookquantity;
}

public void setBookquantity(int bookquantity) {
	this.bookquantity = bookquantity;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

}
