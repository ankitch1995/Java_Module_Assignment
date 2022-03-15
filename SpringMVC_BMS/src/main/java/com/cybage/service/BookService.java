package com.cybage.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.cybage.model.Book;




@Service
public class BookService {

	List<Book> bookList = new ArrayList<>();
	
	public BookService() {
		bookList.add(new Book(1, "Lion King", "Disney"));
		bookList.add(new Book(2, "Little Krishna", "Reliance"));
		bookList.add(new Book(3, "Spiderman", "UTV"));
		bookList.add(new Book(4, "Harry Potter", "Disney"));
		bookList.add(new Book(5, "Fairy Tale", "YRP"));
	}
	
public List<Book> getAllBooks() {
		
		return bookList;
	}

public void addBook(Book book) {
	
	bookList.add(book);
}

public void updateEmployee(Book book) {
	
	Book book1	= bookList.stream().filter(book2->book2.getId()==book.getId()).findFirst().get();
	int index = bookList.indexOf(book1);
	bookList.set(index, book);
}


public Book getBookById(int id)
{
	Book book1	= bookList.stream().filter(book->book.getId()==id).findFirst().get();
	return book1;
}

public void deleteBook(int id) {
	
	bookList.removeIf(book->book.getId()==id);
}
	
}

