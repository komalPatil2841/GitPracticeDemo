package com.mouritech.hibernateinheritanceexample;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mouritech.hibernateinheritanceexample.entity.SavingAccount;
import com.mouritech.hibernateinheritanceexample.entity.BankAccount;
import com.mouritech.hibernateinheritanceexample.entity.CurrentAccount;
import com.mouritech.hibernateinheritanceexample.util.HibernateUtil;

public class TestClassPerInheritance {

	public static void main(String[] args) {
		Transaction transaction = null;
		BankAccount bank1 = null;
		Session session = null;
		try {
	      session = HibernateUtil.getSessionFactory().openSession(); 

			// start the transaction
			transaction = session.beginTransaction();

			bank1 = new BankAccount();
			
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

			// save all the above bank1loyee objects in to database
			session.persist(bank1);
			session.saveOrUpdate(sbank1);
			session.merge(cbank1);
			// commit transaction
			transaction.commit();
		  } catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

			e.printStackTrace();
		}finally {
			session.detach(bank1);
			session.clear();
			session.close();
			//session.evict(bank1);
		}
	}

}
