package com.example.demo.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Dress;
import com.example.demo.Service.CustomerService;

@RestController

public class CustomerController {

	@Autowired
	public CustomerService customerService;

	// add a customer
	@PostMapping("/Customer")
	public ResponseEntity<Customer> craeteCustomer(@Valid @RequestBody Customer customer) {
		return new ResponseEntity<Customer>(customerService.createCustomer(customer), HttpStatus.CREATED);
	}

	// Get Customer Method
	@GetMapping(value = "/Customer")
	public List<Customer> findAllCustomer() {
		return customerService.findAllCustomer();
	}

	// Delete By Id
	@DeleteMapping(value = "/Customer/{id}")
	public String deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
		return "Customer is deleted";
	}

	// Update By Id
	@PutMapping(value = "/Customer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
/*
	// find By Id
	@GetMapping(value = "/Customer/id/{id}")
	public List<Customer> findByid(@PathVariable int id) {
		return customerService.findByid(id);
	}*/
}
