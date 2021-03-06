package com.mouritech.manytomanyexample.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Iterms_data")
public class Items {
	@Id
	@GeneratedValue
	@Column(name = "item_id")
	private Long itemId;
	
	@Column(name="item_Name")
	private String itemName;
	
	@Column(name="item_desc")
	private String itemDesc;
	
	



	public Items(String itemName, String itemDesc, Set<Orders> orders) {
		super();
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.orders = orders;
	}


	public Items(Long itemId, String itemName, String itemDesc, Set<Orders> orders) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.orders = orders;
	}


	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", itemDesc=" + itemDesc + ", orders=" + orders
				+ "]";
	}


	public Long getItemId() {
		return itemId;
	}


	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemDesc() {
		return itemDesc;
	}


	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}


	public Set<Orders> getOrders() {
		return orders;
	}


	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}


	


	@ManyToMany(mappedBy = "items",cascade = {CascadeType.ALL})
	private Set<Orders> orders = new HashSet<Orders>();
}
