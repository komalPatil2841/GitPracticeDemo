package com.mouritech.manytomanyexample;

import java.time.LocalDate;

import com.mouritech.manytomanyexample.dao.ItemsDao;
import com.mouritech.manytomanyexample.dao.OrdersDao;
import com.mouritech.manytomanyexample.entity.Orders;
import com.mouritech.manytomanyexample.entity.Items;

public class ManyToManyOrderItemEg {
	public static void main(String[] args) {
		// create ordloyee
		Orders ord = new Orders();
		ord.setOrdId(5555L);
		
		ord.setCid("1051");
		ord.setAmount("1256");
		ord.setOrderdate(LocalDate.of(1991, 11, 29));
		
		//create itmect
		Items itm= new Items();
		itm.setItemId(201262L);
		
		itm.setItemName("Tickle Me Elmo2");
		itm.setItemDesc("It wants to be tickle2d");
		
		//create itmect
		Items itm1= new Items();
		itm1.setItemId(20126L);
		itm1.setItemName("Tickle Me Elmo");
		itm1.setItemDesc("It wants to be tickled");
		//allocation of itmects for ordloyee
		ord.getItems().add(itm);
		ord.getItems().add(itm1);
		
		//adding ordloyee reference in the itmects
		itm.getOrders().add(ord);
		itm1.getOrders().add(ord);
		
		OrdersDao edao = new OrdersDao();
		edao.saveOrders(ord);
		ItemsDao idao = new ItemsDao();
		idao.saveItems(itm);
		idao.saveItems(itm1);

	}
}
