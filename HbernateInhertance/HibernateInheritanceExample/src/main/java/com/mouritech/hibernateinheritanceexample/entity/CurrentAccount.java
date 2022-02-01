package com.mouritech.hibernateinheritanceexample.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("CurrentAccount")


public class CurrentAccount extends BankAccount {
	@Column(name = "Service_charge")
	private float serviceCharge;

	@Override
	public String toString() {
		return "CurrentAccount [serviceCharge=" + serviceCharge + "]";
	}

	public float getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(float serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(float serviceCharge) {
		super();
		this.serviceCharge = serviceCharge;
	}
	
}
