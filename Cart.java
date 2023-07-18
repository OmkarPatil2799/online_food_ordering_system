package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name = "cartstable")
public class Cart extends BaseEntity {
	
	@Column(name = "totalAmount")
	private double totalAmount;
	
	@Column(name = "quantity")
	private int quantity;
	
	@OneToOne
	Customer customer;
	
	@OneToMany(mappedBy = "cart",  orphanRemoval = true)
	List<CartItem> itemList=new ArrayList<>();
	
	public void addtoItemTables(CartItem cart) {
		  System.out.println("inside cart list"+itemList.size());
		  itemList.add(cart);
		  cart.setCart(this);
		 }

		 public Cart(double totalAmount, int quantity, Customer customer) {
		  super();
		  this.totalAmount = totalAmount;
		  this.quantity = quantity;
		  this.customer = customer;
		  
		 }
	
	
	

}
