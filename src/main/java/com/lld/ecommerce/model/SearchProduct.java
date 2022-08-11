package com.lld.ecommerce.model;

import java.util.List;

public interface SearchProduct {

    List<Product> searchProductsByName(String productName);
    List<Category> searchProductByCategory(String category);

}
