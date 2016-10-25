package com.mycompany.app.service;

import com.mycompany.app.domain.OrderDomain;

public interface OrderService {

  OrderDomain createOrder();

  OrderDomain getOrderById(Long id);


}
