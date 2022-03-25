package com.cybage.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Customer;
import com.cybage.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	
	@PostMapping("/addCustomer")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer)
	{
		customerService.addCustomer(customer);
		return new ResponseEntity<String>("Customer Added Successfully........",HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllCustomer")
	public ResponseEntity<List<Customer>> getAllCustomer()
	{
		List<Customer> list = customerService.getAllCustomer();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping("/getCustomerById/{customerId}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable int customerId)
	{
		Customer customer = customerService.getAllCustomer(customerId);
		return new ResponseEntity<Customer>(customer,HttpStatus.FOUND);
	}
	
	
	@DeleteMapping("/deleteCustomerById/{customerId}")
	public ResponseEntity<String> deleteCustomerById(@PathVariable int customerId)
	{
		customerService.deleteCustomerById(customerId);
		return new ResponseEntity<String>("Customer Deleted Succesfully.....",HttpStatus.OK);
	}
	
	@PutMapping("/updateCustomerById/{customerId}")
	public ResponseEntity<String> updateCustomerById(@PathVariable int customerId,@RequestBody Customer customer)
	{
		customerService.updateCustomerById(customerId,customer);
		return new ResponseEntity<String>("Customer Details Updated Successfully....",HttpStatus.OK);
		
		// write customerId also in json format other-wise it will create new one.
	}
	
//	@GetMapping("/findByEmail/{emailId}")
//	public ResponseEntity<List<Customer>> findByEmail(@PathVariable String emailId)
//	{
//		List<Customer> list = new ArrayList<Customer>();
//		list = customerService.findByEmail(emailId);
//		return new ResponseEntity<>(list,HttpStatus.ACCEPTED);
//	}
	
	
}
