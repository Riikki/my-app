package com.mycompany.app.mapper;

import com.mycompany.app.domain.OrderDomain;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRowMapper implements RowMapper {
    @Override
    public OrderDomain mapRow(ResultSet resultSet, int i) throws SQLException {
        OrderDomain orderDomain = new OrderDomain();
        orderDomain.setId(resultSet.getLong("Id"));
        orderDomain.setPaymentId(resultSet.getInt("Payment_Id"));
        orderDomain.setUserId(resultSet.getInt("User_Id"));
        orderDomain.setStartDate(resultSet.getDate("Start_Date"));
        orderDomain.setEndDate(resultSet.getDate("End_Date"));
        orderDomain.setPricePaid(resultSet.getInt("Price_Paid"));
        orderDomain.setState(resultSet.getString("State"));
        orderDomain.setCreatedDate(resultSet.getDate("Created_Date"));
        orderDomain.setModifiedDate(resultSet.getDate("Modified_Date"));
        return orderDomain;
    }
}
