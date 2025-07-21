package com.example.ecommercespring.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter

@Setter

public class FakeStoreCategoryResponseDTO {
    private String status;
    private String message;
    private List<String> categories;
}
