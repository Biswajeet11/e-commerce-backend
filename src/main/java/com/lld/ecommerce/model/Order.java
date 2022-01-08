package com.lld.ecommerce.model;

import java.util.Date;
import java.util.List;

public class Order {
    List<Item> items;
    OrderStatus status;
    Date orderTime;
    Payment payment;
}
