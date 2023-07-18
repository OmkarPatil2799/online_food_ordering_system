package com.app.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class AddressDto {
	
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String country;
	
	private String state;
	
	private String city;
	
	private String pincode;
	
	
}
