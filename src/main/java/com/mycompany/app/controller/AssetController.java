package com.mycompany.app.controller;


import com.mycompany.app.domain.AssetDomain;
import com.mycompany.app.service.AssetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class AssetController {

    @Autowired
    private AssetServiceImpl assetServiceImpl;

    @RequestMapping(value = "orders/{id}/assets", method = RequestMethod.POST)
    public AssetDomain createAssets(Long id){
        return assetServiceImpl.createAsset(id);
    }

    @RequestMapping(value="/assets/{id}")
    public AssetDomain getById(@PathVariable("id") Long id) {
        return assetServiceImpl.getAssetById(id);

    }
}
