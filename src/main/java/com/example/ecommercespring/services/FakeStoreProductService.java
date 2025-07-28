package com.example.ecommercespring.services;

import com.example.ecommercespring.dto.ProductDTO;

public class FakeStoreProductService implements IProductService {

    @Override
    public ProductDTO getProductById(Long id) throws Exception {
        // Simulate fetching product by ID from a fake store
        // In a real application, this would interact with a database or external API
        // if (id == null || id <= 0) {
        //     throw new IllegalArgumentException("Invalid product ID");
        // }
        // return ProductDTO.builder()
        //         .id(id)
        //         .name("Sample Product")
        //         .description("This is a sample product description.")
        //         .price(19.99)
        //         .build();
        
        // For demonstration, returning a dummy product
     }
    
}
