package com.mouritech.manytomanyexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.manytomanyexample.entity.Orders;
import com.mouritech.manytomanyexample.util.HibernateUtil;

public class OrdersDao {
	public void saveOrders(Orders ord) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the ordloyee object in to database
			session.save(ord);
			// commit transaction
			//transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Orders getOrders(Long ordId) {
		Transaction transaction = null;
		Orders ordById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the ordloyee object in to database
			//session.saveOrUpdate(ord);
			
			//get entity from database
			ordById = session.get(Orders.class, ordId);
			if(ordById!=null) {
				
				System.out.println("Orders details are = " + ordById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return ordById;
		
	}
}
