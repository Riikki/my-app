package com.mycompany.app.model;

public interface Order {

  Order createOrder();

  Order getOrderById(Long id);
}
