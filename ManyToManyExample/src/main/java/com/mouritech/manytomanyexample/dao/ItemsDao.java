package com.mouritech.manytomanyexample.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.manytomanyexample.entity.Items;
import com.mouritech.manytomanyexample.util.HibernateUtil;

public class ItemsDao {
	public void saveItems(Items item) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			session.save(item);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public Items getItems(Long itemId) {
		Transaction transaction = null;
		Items itamById = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the employee object in to database
			//session.saveOrUpdate(emp);
			
			//get entity from database
			itamById = session.get(Items.class,itemId);
			if(itamById!=null) {
				
				System.out.println("Items details are = " + itamById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		return itamById;
		
	}}
