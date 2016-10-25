package com.mycompany.app.repository;

import com.mycompany.app.domain.OrderDomain;
import com.mycompany.app.mapper.OrderRowMapper;
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
public class OrderRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public OrderDomain createOrder(Long userId) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String SQL = "INSERT INTO `Order` (`User_id`) VALUES (?)";
        jdbcTemplate.update(new PreparedStatementCreator() {

            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                ps.setLong(1, userId);
                return ps;
            }
        }, keyHolder);

        return getOrderById(keyHolder.getKey().longValue());
    }


    public OrderDomain getOrderById(Long id) {
        String sql = "SELECT * FROM `Order` WHERE `id` = ?";

        return (OrderDomain) jdbcTemplate.queryForObject(
                sql, new Object[] { id }, new OrderRowMapper());
    }

}
