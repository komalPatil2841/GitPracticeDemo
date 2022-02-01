package com.mouritech.hibernateinheritanceexample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "BankAcc")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BankAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "accno")
	private int acc_no;
	@Column(name= "aname")
	private String accname;
	@Column(name= "balance")
	private int bal;
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getAccName() {
		return accname;
	}
	public void setAccName(String accname) {
		this.accname = accname;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BankAccount [acc_no=" + acc_no + ", accname=" + accname + ", bal=" + bal + "]";
	}
	public BankAccount(int acc_no, String accname, int bal) {
		super();
		this.acc_no = acc_no;
		this.accname = accname;
		this.bal = bal;
	}
	
	public void deposite() {
		System.out.println("Deposited 500Rs");
	}
	public void withdraw() {
		System.out.println("withdraw 500Rs");
	}
	
	

}
