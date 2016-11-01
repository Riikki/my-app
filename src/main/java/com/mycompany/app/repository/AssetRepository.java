package com.mycompany.app.repository;

import com.mycompany.app.domain.AssetDomain;
import com.mycompany.app.mapper.AssetRowMapper;
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

@Component
public class AssetRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public AssetDomain createAsset(Long orderId) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String SQL = "INSERT INTO `Asset` (`Order_Id`) VALUES (?)";
        jdbcTemplate.update(new PreparedStatementCreator() {

            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
                ps.setLong(1, orderId);
                return ps;
            }
        }, keyHolder);

        return getAssetById(keyHolder.getKey().longValue());
    }

    public AssetDomain getAssetById(Long id) {
        String sql = "SELECT * FROM `Asset` WHERE `id` = ?";
        return (AssetDomain) jdbcTemplate.queryForObject(sql, new Object[] { id }, new AssetRowMapper());
    }



}
