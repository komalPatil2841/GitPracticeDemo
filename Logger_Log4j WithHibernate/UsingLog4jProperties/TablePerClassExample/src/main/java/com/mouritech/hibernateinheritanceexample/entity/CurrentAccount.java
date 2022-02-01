package com.mouritech.hibernateinheritanceexample.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CurrentAcc")
@AttributeOverrides({
	@AttributeOverride(name = "accno" ,column = @Column(name= "caccno")),
	@AttributeOverride(name = "aname" ,column = @Column(name= "caname")),
	@AttributeOverride(name = "balance" ,column = @Column(name= "cbalance")),
})

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
