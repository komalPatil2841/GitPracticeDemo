package com.mouritech.hibernateinheritanceexample;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.hibernateinheritanceexample.entity.BankAccount;

import com.mouritech.hibernateinheritanceexample.entity.CurrentAccount;


import com.mouritech.hibernateinheritanceexample.entity.SavingAccount;
import com.mouritech.hibernateinheritanceexample.util.HibernateUtil;

public class TestClassPerInheritance {

	public static void main(String[] args) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start the transaction
			transaction = session.beginTransaction();

			BankAccount bank1 = new BankAccount();
			
			bank1.setAccName("komal P");
			bank1.setBal(500);

			CurrentAccount cbank1 = new CurrentAccount();
			
			cbank1.setAccName("Shamal R");
			cbank1.setBal(500);
			cbank1.setServiceCharge(100);

			SavingAccount sbank1 = new SavingAccount();
			
			sbank1.setAccName("Rama R");
			sbank1.setBal(500);
			sbank1.setInterestRate(100);

			// save all the above employee objects in to database
			session.save(bank1);
			session.save(cbank1);
			session.save(sbank1);
			// commit transaction
			transaction.commit();
		  } catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}
	}

}
