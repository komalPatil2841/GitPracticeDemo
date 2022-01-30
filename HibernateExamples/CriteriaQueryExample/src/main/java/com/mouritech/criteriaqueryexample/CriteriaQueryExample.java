package com.mouritech.criteriaqueryexample;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.mouritech.criteriaqueryexample.model.Customer;




public class CriteriaQueryExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		employeeSave();
		betweenCriteria();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
		

		Criteria crit = session.createCriteria(Customer.class);
		Criterion cn = Restrictions.ge("customerAge", new Float(25));

		//select * from customer where customerage > 25
		//crit.add(cn);
		//crit.add(Restrictions.between("customerAge", new Float(25), new Float(55));
		crit.add(Restrictions.like("customerName","S%",MatchMode.START));
		
//		List customerList = crit.list();
//		System.out.println("List of total size......"+customerList.size());
//		Iterator<Customer> itr = customerList.iterator();
//		
//		while(itr.hasNext()) {
//			Customer p = itr.next();
//			System.out.println("Customer Id = " + p.getCustomerId());
//			System.out.println("Customer Id = " + p.getCustomerName());
//			System.out.println("Customer Id = " + p.getCustomerAge());
//			System.out.println("+++++++++++++++++++++++++++++++++++++");
//		}
		
		sFactory.close();
		session.close();
		
		

	}
	public static void employeeSave() {
		Transaction transaction = null;
		Customer p = new Customer(12L, "Shradhha", 44);
		Customer p1 = new Customer(21L, "Rajat", 20);
		Customer p2 = new Customer(31L, "Shamal", 49);
		Customer p3 = new Customer(41L, "Sudha", 10);
		Customer p4 = new Customer(51L, "Sunil", 14);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cfg.buildSessionFactory();
		Session session = sFactory.openSession();
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(p);
			session.save(p2);
			session.save(p1);
			session.save(p3);
			session.save(p4);
			// commit transaction
			transaction.commit();
		
	}
	
	@SuppressWarnings("deprecation")
	public static void betweenCriteria() {
		//employeeSave();
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				SessionFactory sFactory = cfg.buildSessionFactory();
				Session session = sFactory.openSession();
				Criteria crit = session.createCriteria(Customer.class);
				Criterion cn = Restrictions.between("customerAge", new Float(25), new Float(55));
				//select * from customer where customerage between 25 and 45
				crit.add(cn);
				List customerList = crit.list();
				System.out.println("List of total size......"+customerList.size());
				Iterator<Customer> itr = customerList.iterator();
				
				while(itr.hasNext()) {
					Customer p = itr.next();
					System.out.println("Customer Id = " + p.getCustomerId());
					System.out.println("Customer Name = " + p.getCustomerName());
					System.out.println("Customer Age = " + p.getCustomerAge());
					System.out.println("+++++++++++++++++++++++++++++++++++++");
				}
				
				sFactory.close();
				session.close();
	}
}
