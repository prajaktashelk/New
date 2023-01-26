package com.example.demo.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Dress;



public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	//Customize Method
	//List<Customer> findByid(int id);
	
}

