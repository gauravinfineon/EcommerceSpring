package com.example.ecommercespring.services;

import org.springframework.stereotype.Service;

import com.example.ecommercespring.dto.ProductDTO;
import com.example.ecommercespring.gateway.IProductGateway;

@Service
public class FakeStoreProductService implements IProductService {

    private final IProductGateway productGateway;

    public FakeStoreProductService(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public ProductDTO getProductById(Long id) throws Exception {
        return this.productGateway.getProductById(id);
    }
}