package com.onlinebookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlinebookstore.Service.BookService;
import com.onlinebookstore.Service.CustomerService;
import com.onlinebookstore.entity.Book;
import com.onlinebookstore.entity.Customer;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/booklist")
	public List<Book> getBook(){
		return this.bookService.getAllBook();
	}
	@PostMapping("/addbook")
	public String addBook(@RequestBody Book book,@RequestParam ("customerId")int customerId)
	{
		Customer cs=this.customerService.searchById(customerId);
		book.setCustomer(cs);
		
		this.bookService.addBook(book);
		return "Book has been added successfully";
	}
	@PostMapping("/addbook1/{customerId}")
	
	public String addbook1(@RequestBody Book book,@PathVariable int customerId) 
	{
	Customer cs = this.customerService.searchById(customerId);
	book.setCustomer(cs);
	
	this.bookService.addBook(book);
	return "Book has been added successfully";
	}
	@DeleteMapping("/delbook/{id}")
	public String delBook(@PathVariable int id)
	{
		this.bookService.deleteBook(id);
		return "Book has been deleted";
	}
}
