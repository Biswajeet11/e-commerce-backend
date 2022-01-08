package com.lld.ecommerce.model;

import java.util.Date;
import java.util.List;

public class Order {

    String orderId;
    List<Item> items;
    OrderStatus status;
    Date orderTime;
    Payment payment;

}
