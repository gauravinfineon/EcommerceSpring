package com.example.ecommercespring.gateway;

import com.example.ecommercespring.gateway.api.FakeStoreProductApi;

public class FakeStoreProductGateway implements IProductGateway{
    private final FakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public ProductDTO getProductById(Long id) throws Exception {
        // Implementation to fetch product by ID from the FakeStore API
        return null; // Placeholder return statement
    }
    
}
