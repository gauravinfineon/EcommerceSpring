package com.example.ecommercespring.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ecommercespring.services.IUserService;
import com.example.ecommercespring.dto.UserDTO;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final IUserService userService;
    public UserController(IUserService userService){
        this.userService=userService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) throws Exception {
        UserDTO result = this.userService.getUserById(id);

        return ResponseEntity.ok(result);

    }

     
}
