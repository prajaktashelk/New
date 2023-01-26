package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dress {
	public Dress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dress(int id, String name, int price, int qty, int days) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.days = days;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull(message = "Name is Not Null")
	@NotBlank(message="name is not blank")
	private String name;
	private int price;
	private int qty;
	private int days;
//	@ManyToOne(cascade=CascadeType.ALL, fetch= FetchType.EAGER)
//	  @JoinColumn
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
}
	