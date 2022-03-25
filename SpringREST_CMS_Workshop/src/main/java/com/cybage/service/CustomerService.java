package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.cybage.dao.CustomerRepository;
import com.cybage.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CustomerRepository custRepo;

	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
		
	}

	public List<Customer> getAllCustomer() {
		
		return customerRepository.findAll();
	}

	public Customer getAllCustomer(int customerId) {
		Customer customer = customerRepository.findById(customerId).orElse(null);
		return customer;
	}

	public void deleteCustomerById(int customerId) {
		customerRepository.deleteById(customerId);		
	}

	public void updateCustomerById(int customerId, Customer customer) {
		customerRepository.save(customer);
		
	}
//
//	public List<Customer> findByEmail(String emailId) {
//		List<Customer> list = custRepo.findByEmail(emailId);
//		return list;
//	}

	
	

	
	
	
	
	
	
	
	
	
}
