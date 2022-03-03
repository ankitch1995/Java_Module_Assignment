package com.cybage.pms;

import java.util.List;
import java.util.Scanner;
import com.cybage.model.Product;
import com.cybage.service.ProductServiceImpl;

public class App {
	static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Get Product by ID");
		System.out.println("2. Add New Product");
		System.out.println("3. Get All Products");
		System.out.println("4. Delete Product");
		System.out.println("Enter your choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		ProductServiceImpl productService = new ProductServiceImpl();

		while ((choice = App.menuList()) != 0) {
			switch (choice) {

			case 1:
				System.out.println("Enter Product id :");
				productService.getProductById(sc.nextInt());
				break;

			case 2:
				System.out.println("Enter name of product : ");
				String name = sc.next();
				System.out.println("Enter price : ");
				float price = sc.nextFloat();
				Product product = new Product(name, price);
				productService.addProduct(product);
				break;

			case 3:
				List<Product> productList = productService.getAllProducts();
				for (Product prod : productList) {
					System.out.println(prod);
				}
				break;

			case 4:
				System.out.println("Enter Product id :");
				productService.deleteProduct(sc.nextInt());
				break;

			}
		}

	}
}
