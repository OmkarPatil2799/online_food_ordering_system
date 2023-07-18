package com.app.dto;



import com.app.pojos.Documents;

import com.app.pojos.hotelType;

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
public class HotelManagerDto {
	
	private String hotelName;
	
	private hotelType hotelType;
	
  	private String hotelphoto;
	
	private int rating;
	
	private String description;	
	
	private Long id;
	
	
	
}
