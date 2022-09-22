package com.onlinebookstore.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebookstore.Repository.BookRepository;
import com.onlinebookstore.entity.Book;

@Service
@Transactional
public class BookService {
@Autowired
private BookRepository bookrepository;

public List<Book> getAllBook(){
	return bookrepository.findAll(); 
}
public Book addBook(Book book)
{
	return bookrepository.save(book);
}
public Optional<Book> searchById(int bookId)
{
	return bookrepository.findById(bookId);
}
public void deleteBook(int bookId)
{
	bookrepository.deleteById(bookId);
}
}
