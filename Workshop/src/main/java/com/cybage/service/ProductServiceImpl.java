package com.cybage.service;

import java.util.List;

import com.cybage.dao.ProductDaoImpl;
import com.cybage.model.Product;

public class ProductServiceImpl implements ProductService {
	ProductDaoImpl productDao = new ProductDaoImpl();
	
	@Override
	public Product getProductById(int id) {
		return productDao.getProductById(id);
	}

	@Override
	public void addProduct(Product product) {
		productDao.addProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	@Override
	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
	}

}
