package com.example.productlist.model;

public class Product {
    private String product_name;
    private String product_image;
    private int product_price;
    private String product_description; // เพิ่มตัวแปรสำหรับคำอธิบาย

    // Getter and setter for product_name
    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    // Getter and setter for product_image
    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    // Getter and setter for product_price
    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    // Getter and setter for product_description
    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
}