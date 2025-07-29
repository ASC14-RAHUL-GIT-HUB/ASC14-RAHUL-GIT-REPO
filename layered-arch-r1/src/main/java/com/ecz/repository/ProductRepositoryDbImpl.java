package com.ecz.repository;

import com.ecz.model.Product;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class ProductRepositoryDbImpl implements ProductRepository {
    @Override
    public boolean addProductToCart(Product product) {
        try {
            Connection connection = getConnection();
            System.out.println("Driver Loaded!");
            Statement statement = connection.createStatement();
            System.out.println("Statement created");

            String insertQuery = "INSERT INTO product (id, name, price, quantity) VALUES ('" + product.getId() + "' , ' " + product.getName() + "' , ' " + product.getPrice() + "' , ' " + product.getQuantity() + ");";

            int noOfRowsAffected = statement.executeUpdate(insertQuery);

            System.out.println("No. of rows affected: " + noOfRowsAffected);
            return noOfRowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    private Connection getConnection() {
        return DbConnectionSingleton.getInstance();
    }

    @Override
    public List<Product> getAllProducts() {
        return Collections.emptyList();
    }
}
