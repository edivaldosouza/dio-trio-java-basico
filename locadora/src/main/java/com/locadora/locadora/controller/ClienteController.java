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
import com.locadora.locadora.model.form.ClienteForm;
import com.locadora.locadora.service.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteServiceImpl service;
	
	@GetMapping
	public List<Cliente> getAll(){
		return service.getAll();
	}
	
	
	@PostMapping
	public Cliente create(@RequestBody ClienteForm form) {
		return service.create(form);
		
	}
}
