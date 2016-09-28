package com.mycompany.app.controller;


import com.mycompany.app.model.Orderable;
import com.mycompany.app.model.SimpleOrderable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders/")

public class OrderController {

  private ApplicationContext context;

  @Autowired
  public OrderController(ApplicationContext context) {
    this.context =context;
  }


//  @RequestMapping(path = "/orders", method = RequestMethod.POST)
//  public Orderable orders(){
//    SimpleOrderable orders = new SimpleOrderable();
//    return orders.createOrder();
//  }
//
//
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public Orderable createOrders(){
    Orderable orders = (Orderable)context.getBean("simpleOrder");
    return orders.createOrder();
  }


  @RequestMapping(value="/{id}")
  public Orderable getById(@PathVariable("id") Long id) {
  SimpleOrderable orders = new SimpleOrderable();
    return orders;

  }

//  @RequestMapping(path = "/orders/{id}", method = RequestMethod.GET)
//  public Orderable orders(@PathVariable("id") Long id){
//    Orderable orders = (Orderable)context.getBean("simpleOrder");
//    return orders.getOrderById(id);
//  }
}
