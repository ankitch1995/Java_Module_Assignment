package com.cybage.service;

import java.util.ArrayList;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.cybage.model.Book;

import com.cybage.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	
//	// for findBy method
//	@Autowired
//	BookRepository bookRepo;
	
	public List<Book> getBook() {
		
		return bookRepository.findAll();
	}

	public void addBook(Book book) {
		
	bookRepository.save(book);
		
	}
	
	public void deleteBook(int id) {
		
		bookRepository.deleteById(id);
		}
	
	public Book getBookById(int id)
	{
		Book book = bookRepository.getById(id);
		return book;
	}
	

	public void updateBook(Book book) {
		bookRepository.save(book);   // save() for insertion and updation.
		
	}
}
