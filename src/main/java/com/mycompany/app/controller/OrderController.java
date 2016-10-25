package com.mycompany.app.controller;

import com.mycompany.app.domain.OrderDomain;
import com.mycompany.app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

  @Autowired
  private OrderService orderServiceImpl;

  @RequestMapping(value = "", method = RequestMethod.POST)
  public OrderDomain createOrders(){
    return orderServiceImpl.createOrder();
  }

  @RequestMapping(value="/{id}")
  public OrderDomain getById(@PathVariable("id") Long id) {
    return orderServiceImpl.getOrderById(id);

  }

}
