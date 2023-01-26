package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Dress;


public interface DressRepository extends JpaRepository<Dress,Integer>{
	//Customize Method
		List<Dress> findByid(int id);
}

