package com.mouritech.criteriaqueryexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private Long customerId;
	private String customerName;
	private float customerAge;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Long customerId, String customerName, float  customerAge) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAge = customerAge;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public float getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(float customerAge) {
		this.customerAge = customerAge;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
				+ "]";
	}
	
	

}
