package com.mycompany.app.controller;

import com.mycompany.app.service.OrderServiceImpl;
import com.mycompany.app.modelInterface.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

  @Autowired
  private OrderServiceImpl orderService;

  @RequestMapping(value = "/", method = RequestMethod.POST)
  public OrderService createOrders(){
    return orderService.createOrder();
  }

  @RequestMapping(value="/{id}")
  public OrderService getById(@PathVariable("id") Long id) {
    return orderService.getOrderById(id);

  }

}
