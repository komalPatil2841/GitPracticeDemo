package com.mouritech.manytomanyexample.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "order_data")
public class Orders {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "order_id")
		private Long ordId;
		
		@Column(name = "customer_Id")
		private String cid;
		
		@Column(name = "order_date")
		private LocalDate orderdate;
		
		@Column(name = "amount")
		private String amount;
	
		
		public Long getOrdId() {
			return ordId;
		}


		public void setOrdId(Long ordId) {
			this.ordId = ordId;
		}


		public String getCid() {
			return cid;
		}


		public void setCid(String cid) {
			this.cid = cid;
		}


		public LocalDate getOrderdate() {
			return orderdate;
		}


		public void setOrderdate(LocalDate orderdate) {
			this.orderdate = orderdate;
		}


		public String getAmount() {
			return amount;
		}


		public void setAmount(String amount) {
			this.amount = amount;
		}


		public Set<Items> getItems() {
			return items;
		}


		public void setItems(Set<Items> items) {
			this.items = items;
		}


	


		public Orders(Long ordId, String cid, LocalDate orderdate, String amount, Set<Items> items) {
			super();
			this.ordId = ordId;
			this.cid = cid;
			this.orderdate = orderdate;
			this.amount = amount;
			this.items = items;
		}


	


		public Orders(String cid, LocalDate orderdate, String amount, Set<Items> items) {
			super();
			this.cid = cid;
			this.orderdate = orderdate;
			this.amount = amount;
			this.items = items;
		}


		public Orders() {
			super();
			// TODO Auto-generated constructor stub
		}


		@Override
		public String toString() {
			return "Orders [ordId=" + ordId + ", cid=" + cid + ", orderdate=" + orderdate + ", amount=" + amount
					+ ", items=" + items + "]";
		}


		
		
		@ManyToMany(cascade = CascadeType.ALL)
		@JoinTable(name = "orders_items", joinColumns = { @JoinColumn(name = "order_id") }, inverseJoinColumns = {
				@JoinColumn(name = "item_id") })
		Set<Items> items = new HashSet<Items>();
	
}
