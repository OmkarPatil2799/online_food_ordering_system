package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
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
@Table(name = "hotelmanagertable")
public class HotelManager extends BaseEntity {
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
	@Column(name = "hotelname",length = 50)
	private String hotelName;
	@Column(name = "mobileNo",length = 50)
	private String mobileNo;
	@Column(name = "hotelType")
	private hotelType hotelType;
	
	
	
	@Embedded
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
  	private Documents documents;
	
	
	@OneToMany(mappedBy = "hotelManager",cascade = CascadeType.ALL,orphanRemoval = true)
	List<Menu> menuList=new ArrayList<>();
	
	@OneToMany(mappedBy = "hotelManager",cascade = CascadeType.ALL,orphanRemoval = true)
	@JsonIgnore
	List<Orders> orderList=new ArrayList<>();
	
	
	@Column(name="rating")
	private int rating;
	
	@Column(name="description", length=100)
	private String description;	
	
	@Column(name="hotelStatus")
	  private hotelStatus hotelstatus;
	
	
	public void adddocuments(Documents document) { 
		   
		  this.documents=document; 
		   
		   
		 } 
		public void addMenu(Menu menu) { 
		   
		  this.menuList.add(menu); 
		  menu.setHotelManager(this); 
		   
		   
		 }
	
	
	

}
