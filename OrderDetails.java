package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orderdetailtable")
public class OrderDetails extends BaseEntity {
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "totalPrice")
	private double totalPrice;
	
	@OneToOne
	private Menu dish;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "orderId")
	private Orders order;
	
	
	

}
