package com.onlinebookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
	

}
