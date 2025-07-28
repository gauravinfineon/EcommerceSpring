package com.example.ecommercespring.dto;
import com.example.ecommercespring.dto.Address;
import com.example.ecommercespring.dto.Name;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserDTO{
	private String password;
	 private Address address;
	private String phone;
	private Name name;
	private int id;
	private String email;
	private String username;
}
