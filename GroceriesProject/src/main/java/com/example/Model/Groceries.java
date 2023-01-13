package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//This annotation indicate this is table
@Entity
public class Groceries {
	
	//All are private variable
			//primary key annotation
			@Id
			//id generate automaticly
			@GeneratedValue(strategy=GenerationType.AUTO)
			private int id;
			private String name;
			private int price;
			private int quantity;
			
	//argument constructor
		public Groceries(int id, String name, int price, int quantity) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		//No-agr constructor
		public Groceries() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		//Getter and setter method of Groceries class variable
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		
}
