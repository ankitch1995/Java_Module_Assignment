package com.cybage.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue
	private int customerId;
	private String name;
	private String address;
	private String emailId;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Address> add;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(int customerId, String name, String address, String emailId) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.emailId = emailId;
	}


	public List<Address> getAdd() {
		return add;
	}


	public void setAdd(List<Address> add) {
		this.add = add;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", emailId=" + emailId
				+ "]";
	}
	
	
	
}
