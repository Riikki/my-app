package com.mycompany.app.service;

import com.mycompany.app.domain.AssetDomain;
import com.mycompany.app.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AssetServiceImpl {

    @Autowired
    private AssetRepository assetRepository;

    public AssetDomain getAssetById(Long id) {
        return assetRepository.getAssetById(id);
    }

    public AssetDomain createAsset(Long id) {
        return assetRepository.createAsset(id);
    }


}
