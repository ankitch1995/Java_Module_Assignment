package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.AddressRepository;
import com.cybage.model.Address;

@Service
public class AddressService{

	@Autowired
	AddressRepository addressRepository;

	public void addAddress(Address address) {
		addressRepository.save(address);
		
	}

	public List<Address> getAllAddress() {
		
		return addressRepository.findAll();
	}
}
