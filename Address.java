package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Embeddable
public class Address{
	@Column(name = "adressLine1",length = 50)
	private String addressLine1;
	@Column(name = "addressLine2",length = 50)
	private String addressLine2;
	@Column(name = "country",length = 50)
	private String country;
	@Column(name = "state",length = 50)
	private String state;
	@Column(name = "city",length = 50)
	private String city;
	@Column(name = "pincode",length = 50)
	private String pincode;
	
	

}
