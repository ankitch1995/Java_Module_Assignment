package com.cybage.service;

import java.util.List;

import com.cybage.model.Product;

public interface ProductService {
	Product getProductById(int id);

	boolean addProduct(Product product);

	List<Product> getAllProducts();

	void deleteProduct(int id);
}
