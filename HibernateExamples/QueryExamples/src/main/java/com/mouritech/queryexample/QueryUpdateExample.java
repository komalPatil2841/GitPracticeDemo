package com.mouritech.queryexample;

import java.util.Iterator;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mouritech.queryexample.model.Customer;



//@SuppressWarnings("deprecation")
public class QueryUpdateExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Customer> updateQuery = session.createQuery
				("update Customer set custMobileNo =:mob where custName = :cname");//here persistent class is Customer

		updateQuery.setParameter("mob", new String("5505565100"));
		updateQuery.setParameter("cname", "Komal");

		int updateStatus = updateQuery.executeUpdate();
		System.out.println(updateStatus);
		
		tx.commit();
		
		
		sFactory.close();
		session.close();
		
	}
}
