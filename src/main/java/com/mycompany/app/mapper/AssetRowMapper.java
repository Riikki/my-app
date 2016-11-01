package com.mycompany.app.mapper;

import com.mycompany.app.domain.AssetDomain;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AssetRowMapper implements RowMapper {
    @Override
    public AssetDomain mapRow(ResultSet resultSet, int i) throws SQLException {
        AssetDomain assetDomain = new AssetDomain();
        assetDomain.setId(resultSet.getLong("Id"));
        assetDomain.setOrderId(resultSet.getLong("Order_Id"));
        assetDomain.setSize(resultSet.getString("Size"));
        assetDomain.setAssetURL(resultSet.getString("Asset_URL"));
        assetDomain.setClickURL(resultSet.getString("Click_URL"));
        assetDomain.setCreatedDate(resultSet.getDate("Created_Date"));
        assetDomain.setModifiedDate(resultSet.getDate("Modified_Date"));
        return assetDomain;
    }
}