package com.ecz.ui;

import com.ecz.model.Product;
import com.ecz.service.ProductService;
import com.ecz.service.ProductServiceImpl;

import java.util.List;

public class MenuUI {

    ProductService productService = new ProductServiceImpl();

        void accessMenu() {
            System.out.println("Welcome to ECommerce App!");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
        }
        void addProduct() {
            Product product = new Product("1003", "Laptop", 999.99, 1);
            boolean isAdded = productService.addProduct(product);
            if (isAdded) {
                System.out.println("Product added successfully!");
            } else {
                System.out.println("Product not added");
            }
        }
        void getAllProducts() {
            List<Product> productList = productService.getAllProducts();
            for (Product product: productList) {
                System.out.println(product);
            }
        }
        void updateProduct() {
            Product product = new Product("1003", "Laptop", 1099.99, 2);
            boolean isUpdated = productService.updateProduct(product);
            if (isUpdated) {
                System.out.println("Product updated successfully!");
            } else {
                System.out.println("Product not updated");
            }
        }

}
