package com.jesus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesus.entity.Marca;
import com.jesus.repository.MarcaRepository;

@Service
public class MarcaService {

	@Autowired
	private MarcaRepository marRepo;
	
	public List<Marca> listarMarca(){
		return marRepo.findAll();
	}
}
