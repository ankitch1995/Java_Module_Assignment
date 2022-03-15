package com.cybage.model;

import org.springframework.stereotype.Component;

@Component
public class Book {

	private int id;
	private String title;
	private String publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
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
