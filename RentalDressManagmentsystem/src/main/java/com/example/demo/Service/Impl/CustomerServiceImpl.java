package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Dress;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	public CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer _customer = customerRepository.findById(customer.getcId()).get();
		_customer.setcName(customer.getcName());
		_customer.setcGender(customer.getcGender());
		_customer.setcEmail(customer.getcEmail());
		return customerRepository.save(_customer);
		
	}

	/*@Override
	public List<Customer> findByid(int id) {
		// TODO Auto-generated method stub
		return customerRepository.findByid(id);
	}*/
}
	

