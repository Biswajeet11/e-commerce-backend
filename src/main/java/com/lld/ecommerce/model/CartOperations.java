package com.lld.ecommerce.model;

public interface CartOperations {

    void addToCart(Item item);
    void updateCart(Item item, int quantity);
    void removeCart(Item item);

    void clearCart();


}
