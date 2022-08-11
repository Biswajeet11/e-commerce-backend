package com.lld.ecommerce.model;

import java.util.HashMap;
import java.util.List;

public class Catalog implements SearchProduct {

    private HashMap<String, List<Product>> productHashMap;
    private HashMap<String,List<Category>> productCategories;

    public HashMap<String, List<Product>> getProductHashMap() {
        return productHashMap;
    }

    public void setProductHashMap(HashMap<String, List<Product>> productHashMap) {
        this.productHashMap = productHashMap;
    }

    public HashMap<String, List<Category>> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(HashMap<String, List<Category>> productCategories) {
        this.productCategories = productCategories;
    }


    @Override
    public List<Product> searchProductsByName(String productName) {
        return productHashMap.get(productName);
    }

    @Override
    public List<Category> searchProductByCategory(String category) {
        return productCategories.get(category);
    }

}
