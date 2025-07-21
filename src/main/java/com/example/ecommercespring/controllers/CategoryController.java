package com.example.ecommercespring.controllers;

import com.example.ecommercespring.dto.CategoryDTO;
import com.example.ecommercespring.services.ICategoryService;
import jdk.jfr.Category;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.util.List;


@RestController
@RequestMapping("api/categories")
public class CategoryController  {
    private final ICategoryService categoryService;
    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping()
    public List<CategoryDTO> getAllCategories() throws Exception {
        return this.categoryService.getAllCategories();
    }

}
