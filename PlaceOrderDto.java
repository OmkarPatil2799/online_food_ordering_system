package com.app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PlaceOrderDto {

	private Long cartId;
	private double totalAmount ; 
	private Long hotelId; 
	
	
}
