package com.locadora.locadora.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.locadora.locadora.model.*;
import com.locadora.locadora.model.form.FilmeForm;
import com.locadora.locadora.service.impl.FilmeServiceImpl;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

	@Autowired
	private FilmeServiceImpl service;
	
	@GetMapping
	public List<Filme> getAll(){
		return service.getAll();
	}
	
	
	@PostMapping
	public Filme create(@RequestBody FilmeForm form) {
		return service.create(form);
		
	}

	
}
