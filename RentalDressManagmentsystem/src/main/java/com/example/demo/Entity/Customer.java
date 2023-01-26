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
public class Customer {
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cId, String cName, String cGender, String cEmail) {
		this.cId = cId;
		this.cName = cName;
		this.cGender = cGender;
		this.cEmail = cEmail;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	   private int cId;
	@NotNull(message = "Name is Not Null")
	@NotBlank(message="name is not blank")
	   private String cName;
	   private String cGender;
	   private String cEmail;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcGender() {
		return cGender;
	}
	public void setcGender(String cGender) {
		this.cGender = cGender;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
}
	  // @OneToMany(fetch = FetchType.EAGER, mappedBy="customer",cascade=CascadeType.ALL)
	   //@JsonIgnoreProperties("customer")
	   //private List<Dress> dressList = new ArrayList<>();
	