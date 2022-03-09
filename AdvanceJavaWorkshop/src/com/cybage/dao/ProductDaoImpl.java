package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.cybage.model.Product;
import com.cybage.utility.JDBCUtility;

public class ProductDaoImpl implements ProductDao {

	Connection connection = JDBCUtility.getConnection();
	Statement statement = JDBCUtility.getStatement();

	@Override
	public Product getProductById(int id) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from product where id = ?;");
			pstmt.setInt(1, id);
			ResultSet result = pstmt.executeQuery();
			while (result.next()) {
//				System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getFloat(3));
				Product product = new Product();
				product.setId(result.getInt(1));
				product.setName(result.getString(2));
				product.setPrice(result.getFloat(3));
				return product;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addProduct(Product product) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into product(name, price) values(?,?)");
			pstmt.setString(1, product.getName());
			pstmt.setFloat(2, product.getPrice());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> productList = new ArrayList<Product>();
		try {
			ResultSet resultSet = statement.executeQuery("select * from product;");
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				float price = resultSet.getFloat(3);
				productList.add(new Product(id, name, price));
			}
			return productList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteProduct(int id) {
		try {
			PreparedStatement pstmt = connection.prepareStatement("delete from product where id = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
