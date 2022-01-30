package com.mouritech.queryexample;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mouritech.queryexample.model.Customer;



public class QueryExample {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		
		@SuppressWarnings("unchecked")
		Query<Customer> selectQuery = session.createQuery("from Customer");//here persistent class is Customer
		selectQuery.setFirstResult(1);
		selectQuery.setMaxResults(4);
		List<Customer> listOfCustomers = selectQuery.list();
		

		Iterator<Customer> itr = listOfCustomers.iterator();
		
		while(itr.hasNext()) {
			Customer p = itr.next();
			System.out.println("Customer Id = " + p.getCustId());
			System.out.println("Customer Id = " + p.getCustName());
			System.out.println("Customer Id = " + p.getCustMobileNo());
			System.out.println("Customer Id = " + p.getCustEmail());
			
			
			System.out.println("+++++++++++++++++++++++++++++++++++++");
		}
		
		
		
		
		
		sFactory.close();
		session.close();
		
	}

}
