package com.lld.ecommerce.model;

import java.util.List;

public class Product  {

    private String productId;
    private String name;
    private String description;
    private double price;
    private Category category;
    private int availableItems;

    private Account productSeller;

    private ProductReview productReview;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(int availableItems) {
        this.availableItems = availableItems;
    }

    public Account getProductSeller() {
        return productSeller;
    }

    public void setProductSeller(Account productSeller) {
        this.productSeller = productSeller;
    }

}
