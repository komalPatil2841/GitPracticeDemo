package com.mouritech.crudwithhibernate.service;

import java.util.Scanner;

import com.mouritech.crudwithhibernate.dao.CustomerDao;
import com.mouritech.crudwithhibernate.entity.Customer;

public class CustomerService {
	static Scanner sc = new Scanner(System.in);
	CustomerDao custdao = new CustomerDao();

	public void customerSave() {
		Customer cust = new Customer();
		System.out.println("Enter the details of the customer");
		//sc.nextLine()
		System.out.println("Enter the customer....");
		cust.setCustName(sc.nextLine());
		System.out.println("Enter the customer email....");
		cust.setCustEmail(sc.nextLine());
		System.out.println("Enter the customer mobile number....");
		cust.setCustMobileNo(sc.nextLine());
		custdao.customerSave(cust);	
	}

	public void getAllCustomers() {
		
		custdao.getAllCustomers();
	}
	
	public void deleteCustomer() {

		System.out.println("Enter the customer id to delete....");
		Long custid = sc.nextLong();
		custdao.deleteCustomer(Customer.class,new Long(custid));
	}

	public void updateCustomer() {
		Customer cust = new Customer();
		System.out.println("Enter the details of the customer");
		//sc.nextLine()
		System.out.println("Enter the customer....");
		cust.setCustName(sc.nextLine());
		System.out.println("Enter the customer email....");
		cust.setCustEmail(sc.nextLine());
		System.out.println("Enter the customer mobile number....");
		cust.setCustMobileNo(sc.nextLine());
		//custdao.customerSave(cust);	
		//custdao.updateCustomer(cust);
	}
	
	public  void getDetailsToUpdate() {
		System.out.println("Enter the customer id....");
		Long custid = sc.nextLong();
		System.out.println("Enter the mobile no");
		String mobNo = sc.next();
		//return mobNo;
		custdao.updateCustomer(custid,mobNo);
	}

	public void getCustomereById() {
		System.out.println("Enter the customer id....");
		Long custid = sc.nextLong();
		custdao.getCustomerById(custid);
	}

}
