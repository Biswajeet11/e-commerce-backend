package com.lld.ecommerce.model;

import java.util.List;

public class ShoppingCart implements CartOperations {

    private List<Item> itemsList;

    public List<Item> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public int getItemIndex (Item item) {
        int i;
      for(i=0;i< itemsList.size();i++){
          if(itemsList.contains(item)){
              break;
          }
      }
      return i;
    }

    @Override
    public void addToCart(Item item) {
        itemsList.add(item);
    }

    @Override
    public void updateCart(Item item, int quantity) {
        int itemIndex = getItemIndex(item);
        itemsList.set(itemIndex,item);
        item.setQuantity(quantity);
    }

    @Override
    public void removeCart(Item item) {
        itemsList.remove(item);
    }

    @Override
    public void clearCart() {
        itemsList.clear();
    }

}
