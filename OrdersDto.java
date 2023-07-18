package com.app.dto;


import com.app.pojos.DeliveryStatus;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OrdersDto {
	
	private Long id;
	
	private double price;
	
	private String deliveryStatus;
	
	private String destination;
	
	private String source;

}
