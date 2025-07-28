package com.example.ecommercespring.gateway;

import com.example.ecommercespring.dto.UserDTO;
import java.io.IOException;
public interface IUserGateway {
    UserDTO getUserById(Long id) throws Exception;

}
