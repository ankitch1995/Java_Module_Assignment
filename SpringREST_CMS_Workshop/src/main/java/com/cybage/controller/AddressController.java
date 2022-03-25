package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Address;
import com.cybage.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	
	@PostMapping("/addAddress")
	public ResponseEntity<String> addAddress(@RequestBody Address address)
	{
		addressService.addAddress(address);
		return new ResponseEntity<String>("Address Added Successfully......",HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllAddress")
	public ResponseEntity<List<Address>> getAllAddress()
	{
		List<Address> list = addressService.getAllAddress();
		return new ResponseEntity<>(list,HttpStatus.OK); 
	}
	
	
	
	
	
}
