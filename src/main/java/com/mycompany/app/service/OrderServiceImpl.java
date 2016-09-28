package com.mycompany.app.service;

import com.mycompany.app.domain.OrderDomain;
import com.mycompany.app.modelInterface.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class OrderServiceImpl implements OrderService {

  @Autowired
  private OrderDomain orderDomain;

  private final AtomicLong counter = new AtomicLong();

  public OrderService createOrder() {
    orderDomain.setId(counter.incrementAndGet());
    return this;
  }

  public OrderService getOrderById(Long id) {
    orderDomain.setId(1);
    orderDomain.setName("test");
    return this;
  }
}
