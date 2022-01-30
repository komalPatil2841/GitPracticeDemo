package com.mouritech.queryexample;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mouritech.queryexample.model.Customer;



public class QueryDeleteExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Customer> deleteQuery = session.createQuery
				("delete from Customer where custEmail= :email");//here persistent class is Customer

		
		deleteQuery.setParameter("email", "komal123");

		int deleteStatus = deleteQuery.executeUpdate();
		System.out.println(deleteStatus);
		
		tx.commit();
		
		
		sFactory.close();
		session.close();
		
	}
}
