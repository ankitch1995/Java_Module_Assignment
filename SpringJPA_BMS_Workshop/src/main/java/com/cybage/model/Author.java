package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String contactNo;
	
	@OneToOne(mappedBy = "book")
	private Book book;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Author(String name, String email, String contactNo) {
		super();
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}



	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + "]";
	}
	
	
	
	
}
