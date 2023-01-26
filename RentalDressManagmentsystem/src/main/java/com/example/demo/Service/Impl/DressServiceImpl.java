package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Dress;
import com.example.demo.Repository.DressRepository;
import com.example.demo.Service.DressService;

@Service
public class DressServiceImpl implements DressService{
	@Autowired
	public DressRepository dressRepository;

	@Override
	public Dress createDress(Dress dress) {
		// TODO Auto-generated method stub
		return dressRepository.save(dress);
	}

	@Override
	public List<Dress> findAllDress() {
		// TODO Auto-generated method stub
		return dressRepository.findAll();
	}

	@Override
	public void deleteDress(int id) {
		// TODO Auto-generated method stub
		dressRepository.deleteById(id);
	}

	@Override
	public Dress updateDress(Dress dress) {
		// TODO Auto-generated method stub
		Dress _dress = dressRepository.findById(dress.getId()).get();
		_dress.setName(dress.getName());
		_dress.setPrice(dress.getPrice());
		_dress.setQty(dress.getQty());
		_dress.setDays(dress.getDays());;
		return dressRepository.save(_dress);
	}

	@Override
	public List<Dress> findByid(int id) {
		// TODO Auto-generated method stub
		return dressRepository.findByid(id);
	}

}
	

	
	

	






