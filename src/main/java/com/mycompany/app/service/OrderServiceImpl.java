package com.mycompany.app.service;

import com.mycompany.app.domain.OrderDomain;
import com.mycompany.app.modelInterface.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class OrderServiceImpl implements OrderService {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  private final AtomicLong counter = new AtomicLong();

  public OrderDomain createOrder() {
    long id = 1;
    String SQL = "INSERT INTO `Order` (`User_id`) VALUES (?)";
    int update = jdbcTemplate.update(SQL, id);

    OrderDomain orderDomain = new OrderDomain();
    orderDomain.setId(counter.incrementAndGet());
    return orderDomain;
  }

  public OrderDomain getOrderById(Long id) {
    OrderDomain orderDomain = new OrderDomain();
    orderDomain.setId(1);
    orderDomain.setName("test");
    return orderDomain;
  }

}

