package com.example.ecommercespring.dto;
import lombok.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreUserResponseDTO{
    private UserDTO user;
    private String message;
    private String status;
    
    public UserDTO getUser() {
        return user; 
    }
}