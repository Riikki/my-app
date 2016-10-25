package com.mycompany.app.service;

import com.mycompany.app.domain.OrderDomain;
import com.mycompany.app.mapper.OrderRowMapper;
import com.mycompany.app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicLong;

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

