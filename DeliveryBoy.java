package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Entity
@Table(name = "deliveryboytable")
public class DeliveryBoy extends BaseEntity {
	@Column(name = "firstName",length = 50)
	private String firstName;
	@Column(name = "lastName",length = 50)
	private String lastName;
	@Column(name = "email",length = 50)
	private String email;
	@Column(name = "password",length = 50)
	private String password;
	@Column(name = "username",length = 50)
	private String username;
	@Column(name = "gender",length = 50)
	private Gender gender;
	@Column(name = "photo",length = 50)
	private String photo;
	@Column(name = "mobileNo",length = 50)
	private String mobileNo;
	@Column(name = "deliveryBoyStatus")
	private Status deliveryBoyStatus;
	
	@Embedded
	private Address address;
	
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private Orders order;
	
	
	
	
    	
	
	
	
	
	
	

}
