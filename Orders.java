package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "orderstable")

public class Orders extends BaseEntity{
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "orderDate")
	private LocalDate orderDate;
	
	@Column(name = "orderStatus")
	private OrderStatus orderStatus;
	
	@Column(name = "cookingStatus")
	private CookingStatus cookingStatus;
	
	@Column(name = "deliveryStatus")
	private DeliveryStatus deliveryStatus;
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY)
	private DeliveryBoy deliveryboy;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hotelId")
	private HotelManager hotelManager;
	
	@OneToMany(mappedBy = "order")
	List<OrderDetails> itemList=new ArrayList<>();
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CustomerId")
	private Customer customer;
	
	public Orders(double price, LocalDate orderDate, OrderStatus orderStatus, CookingStatus cookingStatus,
			   DeliveryStatus deliveryStatus, DeliveryBoy deliveryboy, HotelManager hotelManager,
			    Customer orderCustomer) {
			  super();
			  this.price = price;
			  this.orderDate = orderDate;
			  this.orderStatus = orderStatus;
			  this.cookingStatus = cookingStatus;
			  this.deliveryStatus = deliveryStatus;
			  this.deliveryboy = deliveryboy;
			  this.hotelManager = hotelManager;
			  this.customer = orderCustomer;
			 }
			 
			 public void saveOrderDetatils(OrderDetails order) {
			  itemList.add(order);
			  order.setOrder(this);
			 }
	
	
	
	

}
