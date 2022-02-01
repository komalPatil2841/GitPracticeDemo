package com.mouritech.hibernateinheritanceexample.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SavingAcc1")
@AttributeOverrides({
	@AttributeOverride(name = "accno" ,column = @Column(name= "saccno")),
	@AttributeOverride(name = "aname" ,column = @Column(name= "saname")),
	@AttributeOverride(name = "balance" ,column = @Column(name= "sbalance")),
})
public class SavingAccount extends BankAccount {
	@Column(name = "interest_rate")
	private float interestRate;

	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public SavingAccount(float interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	
	
}