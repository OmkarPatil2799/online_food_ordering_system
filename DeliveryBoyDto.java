package com.app.dto;

import com.app.pojos.Gender;
import com.app.pojos.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
public class DeliveryBoyDto {

	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private String username;
	
	private Gender gender;
	
	private String mobileNo;
	
	private Status deliveryBoyStatus;
	
}
