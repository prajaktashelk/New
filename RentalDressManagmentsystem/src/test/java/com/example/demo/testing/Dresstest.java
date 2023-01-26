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
import com.example.demo.Entity.Dress;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Repository.DressRepository;
import com.example.demo.Service.CustomerService;
import com.example.demo.Service.DressService;

@SpringBootTest
public class Dresstest {
	@MockBean
	private DressRepository dressRepository;
	@Autowired
	private DressService dressService;

	// Test SaveDress Method
	@Test
	void testSaveCUSTOMER() {
		Dress d = new Dress(1, "Prajakta", 200, 2, 7);
		Mockito.when(dressRepository.save(d)).thenReturn(d);
		assertEquals(d, dressService.createDress(d));
	}

	// Test GetAllDress Method
	@Test
	void testGetAllDoctor() {
		List<Dress> Dress = Stream.of(new Dress(1, "Prajakta", 200, 2, 7), new Dress(1, "Prajakta", 200, 2, 7))
				.collect(Collectors.toList());
		Mockito.when(dressRepository.findAll()).thenReturn(Dress);
		assertEquals(2, dressService.findAllDress().size());

	}

	// Test DeleteDress Method
	@Test
	void testDeleteDress() {
		dressService.deleteDress(1);
		Mockito.verify(dressRepository).deleteById(1);
	}

}
