package com.example.ecommercespring.dto;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address{
	private String zipcode;
	private String number;
	private String city;
	private String street;
	private Geolocation geolocation;
}
