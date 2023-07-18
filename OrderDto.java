package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class OrderDto  {
	
	private Long Id;
	private double price;
	
//	@Column(name = "orderDate")
	private LocalDate orderDate;
	
//	@Column(name = "orderStatus")
	private OrderStatus orderStatus;
	
//	@Column(name = "cookingStatus")
	private CookingStatus cookingStatus;
	
//	@Column(name = "deliveryStatus")
	private DeliveryStatus deliveryStatus;
	
//	Map<Long,String> map=new LinkedHashMap<Long, String>();
//	List<List<String>> itemList=new ArrayList<>();

	
	
	
//	List<Menu> dishlist=new ArrayList<Menu>();
	List<String> itemlist=new ArrayList<String>();
	List<Integer> itemquantity=new ArrayList<Integer>();

}
