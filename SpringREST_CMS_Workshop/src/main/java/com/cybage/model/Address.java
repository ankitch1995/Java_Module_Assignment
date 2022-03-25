package com.cybage.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue
	private int addressId;
	private String state;
	private String pincode;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")	//dB name
	private Customer customer;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	
	public Address(int addressId, String state, String pincode, Customer customer) {
		super();
		this.addressId = addressId;
		this.state = state;
		this.pincode = pincode;
		this.customer = customer;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
	
}
