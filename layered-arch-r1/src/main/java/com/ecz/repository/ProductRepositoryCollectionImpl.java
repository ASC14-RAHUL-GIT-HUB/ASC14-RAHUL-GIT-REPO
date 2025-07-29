package com.ecz.repository;

import com.ecz.model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryCollectionImpl implements ProductRepository{
    Map<String, Product> cart = new HashMap<>();

    public boolean addProductToCart(Product product) {
        cart.put(product.getId(), product);
        System.out.println("Updated cart is " + cart);
        return true;
    }

    @Override
    public List<Product> getAllProducts() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
