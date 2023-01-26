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

import com.example.demo.Entity.Dress;
import com.example.demo.Service.DressService;

  

@RestController

public class DressController {
 
	@Autowired
	DressService dressservices;

	//Create Method
	@PostMapping("/Dress")
	public ResponseEntity<Dress> craeteDress(@Valid @RequestBody Dress dress) {
		return new ResponseEntity<Dress>(dressservices.createDress(dress), HttpStatus.CREATED);
	}
	//Get Dress Method
	@GetMapping(value = "/Dress")
	public List<Dress> findAllDress() {
		return dressservices.findAllDress();
	}
	// Delete By Id
	@DeleteMapping(value = "/Dress/{id}")
	public String deleteDress(@PathVariable int id) {
		dressservices.deleteDress(id);
		return "Dress is deleted";
	}
	//Update By Id
	@PutMapping(value = "/Dress")
	public Dress updateDress(@RequestBody Dress dress) {
		return dressservices.updateDress(dress);
	}
	
	//find By Id
	@GetMapping(value = "/Dress/id/{id}")
	public List<Dress> findByid(@PathVariable int id) {
		return dressservices.findByid(id);
	}
}