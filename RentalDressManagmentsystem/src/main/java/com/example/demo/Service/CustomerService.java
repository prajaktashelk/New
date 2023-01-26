package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Dress;


public interface CustomerService {
    
//Customize Method create,get data,delete,Update,FindByid
	Customer createCustomer(Customer customer);
	List<Customer> findAllCustomer();
	void deleteCustomer(int id);
	Customer updateCustomer(Customer customer);
	//List<Customer>findByid(int id);

}
