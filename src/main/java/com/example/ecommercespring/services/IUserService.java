package com.example.ecommercespring.services;
import com.example.ecommercespring.dto.UserDTO;

public interface IUserService {
    UserDTO getUserById(Long id) throws Exception;
    
}
