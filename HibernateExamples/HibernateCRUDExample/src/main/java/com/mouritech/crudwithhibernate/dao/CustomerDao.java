package com.mouritech.crudwithhibernate.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.crudwithhibernate.entity.Customer;
import com.mouritech.crudwithhibernate.service.CustomerService;
import com.mouritech.crudwithhibernate.util.HibernateUtil;




public class CustomerDao{

	
	public void customerSave(Customer cust) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the customer object in to database
			session.save(cust);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

	public void getAllCustomers() {
		// retrieve the data from database to java program using hibernate
		//Transaction transaction = null;
				try (Session session = HibernateUtil.getSessionFactory().openSession()) {

					List<Customer> customerList = session.createQuery("from Customer", Customer.class).list();
					customerList.forEach(stud -> System.out.println(stud));

				} catch (Exception e) {
					e.printStackTrace();
				}
				
		
	}

	public void deleteCustomer(Class<?> type,Serializable custid) {
		Transaction transaction1 = null;
		try (Session session1 = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction1 = session1.beginTransaction();
			Customer cust = session1.get(Customer.class, custid);
			if(cust!=null) {
				session1.remove(cust);
				System.out.println("Customer deleted successfully");
			}
			
			/*
			 * Customer cust2 = new Customer(); cust2.setCustId(custid); session1.delete(cust2);
			 * System.out.println("Customer deleted"); transaction1.commit();
			 */
			
		}catch (Exception e) {
			if (transaction1 != null) {
				transaction1.rollback();
			}

			e.printStackTrace();
		}
		
	}

	public void updateCustomer(Long custid,String mobNo) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the customer object in to database
			//session.saveOrUpdate(cust);
			
			//get entity from database
			Customer updatingCust = session.get(Customer.class, custid);
			System.out.println(updatingCust);
			//do changes
			updatingCust.setCustMobileNo(mobNo);
			//update the Customer object
			session.saveOrUpdate(updatingCust);
			// commit transaction
			transaction.commit();
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		
	}

	public void getCustomerById(Long custid) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			// start the transaction
			transaction = session.beginTransaction();
			// save the customer object in to database
			//session.saveOrUpdate(cust);
			
			//get entity from database
			Customer custById = session.get(Customer.class, custid);
			if(custById!=null) {
				
				System.out.println("Customer details are = " + custById);
			}
		}catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
		
	}

}
