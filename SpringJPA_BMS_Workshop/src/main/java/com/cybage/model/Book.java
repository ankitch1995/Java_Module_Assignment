package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="book_details")
public class Book {

	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String publisher;
	
	@OneToOne
	@JoinColumn(name="id")	// publisher--> id.
	private Author author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Book(int id, String title, String publisher, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}



	public Author getAuthor() {
		return author;
	}



	public void setAuthor(Author author) {
		this.author = author;
	}



	public Book(int id, String title, String publisher) {
		super();
		this.id = id;
		this.title = title;
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", publisher=" + publisher + "]";
	}
	
}
