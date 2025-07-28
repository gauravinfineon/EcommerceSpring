
package com.example.ecommercespring.gateway;

import com.example.ecommercespring.dto.ProductDTO;

public interface IProductGateway {

    ProductDTO getProductById(Long id) throws Exception;
}