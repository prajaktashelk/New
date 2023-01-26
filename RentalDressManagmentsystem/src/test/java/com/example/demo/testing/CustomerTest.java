package com.example.demo.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Service.CustomerService;

@SpringBootTest
public class CustomerTest {
	@MockBean
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerService customerService;

	// Test SaveCUSTOMER Method
	@Test
	void testSaveCUSTOMER() {
		Customer c = new Customer(1, "Prajakta", "Female", "Praju@gmail.com");
		Mockito.when(customerRepository.save(c)).thenReturn(c);
		assertEquals(c, customerService.createCustomer(c));
	}

	// Test GetAllCustomer Method
	@Test
	void testGetAllCustomer() {
		List<Customer> Customer = Stream.of(new Customer(1, "Prajakta", "Female", "Praju@gmail.com"),
				new Customer(1, "Prajakta", "Female", "Praju@gmail.com")).collect(Collectors.toList());
		Mockito.when(customerRepository.findAll()).thenReturn(Customer);
		assertEquals(2, customerService.findAllCustomer().size());

	}

	// Test DeleteCustomer Method
	@Test
	void testDeleteCustomer() {
		customerService.deleteCustomer(1);
		Mockito.verify(customerRepository).deleteById(1);
	}

}
