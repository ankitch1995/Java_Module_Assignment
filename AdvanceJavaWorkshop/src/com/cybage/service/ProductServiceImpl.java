package com.cybage.service;

import java.util.List;

import com.cybage.dao.ProductDao;
import com.cybage.dao.ProductDaoImpl;
import com.cybage.model.Product;

public class ProductServiceImpl implements ProductService {
	ProductDao productDao = new ProductDaoImpl();
	
	@Override
	public Product getProductById(int id) {
		return productDao.getProductById(id);
	}

	@Override
	public boolean addProduct(Product product) {
		return productDao.addProduct(product);
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
