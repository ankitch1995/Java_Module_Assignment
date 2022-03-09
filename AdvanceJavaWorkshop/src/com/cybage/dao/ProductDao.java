package com.cybage.dao;

import java.util.List;

import com.cybage.model.Product;

public interface ProductDao {
	Product getProductById(int id);

	boolean addProduct(Product product);

	List<Product> getAllProducts();

	void deleteProduct(int id);
}
