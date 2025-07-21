package com.example.ecommercespring.gateway;

import com.example.ecommercespring.dto.CategoryDTO;

import java.io.IOException;
import java.util.*;
public interface ICategoryGateway {
    List<CategoryDTO> getAllCategories() throws IOException;
}
