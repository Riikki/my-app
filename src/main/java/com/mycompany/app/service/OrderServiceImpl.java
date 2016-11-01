package com.mycompany.app.service;

import com.mycompany.app.domain.OrderDomain;
import com.mycompany.app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

  @Autowired
  private OrderRepository orderRepository;

  public OrderDomain createOrder() {
    Long id = new Long(1);
    return orderRepository.createOrder(id);
  }

  public OrderDomain getOrderById(Long id) {
  return orderRepository.getOrderById(id);
  }

}

