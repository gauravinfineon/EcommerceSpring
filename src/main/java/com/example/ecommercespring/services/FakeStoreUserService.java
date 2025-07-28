package com.example.ecommercespring.services;

import org.springframework.stereotype.Service;
import com.example.ecommercespring.gateway.IUserGateway;
import com.example.ecommercespring.dto.UserDTO;

@Service
public class FakeStoreUserService implements IUserService {
    private final IUserGateway userGateway;
    public FakeStoreUserService(IUserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public UserDTO getUserById(Long id) throws Exception {
        return this.userGateway.getUserById(id);
    }

 
    
}
