package com.ecz.model;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product(String id,String name, double price,int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Product Details : "+
                "id = " + id + "\t"+
                "name = " + name + "\t"+
                "price = " + price + "\t"+
                "quantity = " + quantity;
    }
}
