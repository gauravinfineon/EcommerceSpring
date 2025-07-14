package com.example.ecommercespring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class path {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot! Gaurav";
    }

}
