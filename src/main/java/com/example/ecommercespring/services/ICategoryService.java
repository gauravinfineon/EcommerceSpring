package com.example.ecommercespring.services;

import com.example.ecommercespring.dto.CategoryDTO;

import java.util.List;

public interface ICategoryService {
     List<CategoryDTO> getAllCategories() throws Exception;

}
