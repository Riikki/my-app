package com.mycompany.app;


import com.mycompany.app.model.Order;
import com.mycompany.app.model.SimpleOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class OrderController {

//  private ApplicationContext context;
//
//  @Autowired
//  public OrderController(ApplicationContext context) {
//    this.context =context;
//  }


  @RequestMapping(path = "/orders", method = RequestMethod.POST)
  public Order orders(){
    SimpleOrder orders = new SimpleOrder();
    return orders.createOrder();
  }


//  @RequestMapping(path = "/orders", method = RequestMethod.POST)
//  public Order orders(){
//    Order orders = (Order)context.getBean("simpleOrder");
//    return orders.createOrder();
//  }


  @RequestMapping(method=RequestMethod.GET, value="/orders/{id}")
  public Order orders(@PathVariable("id") Long id) {
  SimpleOrder orders = new SimpleOrder();
    return orders;

  }

//  @RequestMapping(path = "/orders/{id}", method = RequestMethod.GET)
//  public Order orders(@PathVariable("id") Long id){
//    Order orders = (Order)context.getBean("simpleOrder");
//    return orders.getOrderById(id);
//  }
}
