package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Dress;



import java.util.List;

import com.example.demo.Entity.Dress;

public interface DressService {
	
//Customize Method create,get data,delete,Update,FindByid
	Dress createDress(Dress dress);
	List<Dress> findAllDress();
	void deleteDress(int id);
	Dress updateDress(Dress dress);
	List<Dress>findByid(int id);
}


