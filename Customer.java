package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "customertable")
public class Customer extends BaseEntity {
	@Column(name = "firstName",length = 50)
	private String firstName;
	@Column(name = "lastName",length = 50)
	private String lastName;
	@Column(name = "email",length = 50,unique = true)
	private String email;
	@Column(name = "password",length = 50)
	private String password;
	@Column(name = "username",length = 50)
	private String username;
	@Column(name = "gender",length = 50)
	private Gender gender;
	@Column(name = "photo",length = 50)
	private String photo;
	@Column(name = "mobileNo",length = 10)
	private String mobileNo;
	
//	@JsonIgnore
	@ElementCollection
	@CollectionTable(name = "customeraddress",joinColumns = @JoinColumn(name="customer_id"))
	private List<Address> addressList=new ArrayList<Address>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Cards> cardList=new ArrayList<>();
	
	@JsonIgnore
	@OneToOne(mappedBy = "customer" , cascade = CascadeType.ALL, orphanRemoval = true)
	private Cart cart;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Orders> ordersList = new ArrayList<Orders>();
	
	public void addCart(Cart c1) { 
		  // TODO Auto-generated method stub 
		  this.setCart(c1); 
		  c1.setCustomer(this); 
		   
		 } 
		 
		 public void removeCart(Cart c) { 
		  // TODO Auto-generated method stub 
		  this.setCart(null); 
		  c.setCustomer(null); 
		   
		 }	
	
	
	
	
	
	

}
