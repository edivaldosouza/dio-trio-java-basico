package com.locadora.locadora.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locadora.locadora.model.Filme;
import com.locadora.locadora.model.form.FilmeForm;
import com.locadora.locadora.repository.FilmeRepository;
import com.locadora.locadora.service.IFilmeService;

@Service
public class FilmeServiceImpl implements IFilmeService{

	@Autowired
	private FilmeRepository repository;
	
	 @Override
	  public Filme create(FilmeForm form) {
		 Filme filme = new Filme();
		 filme.setNome(form.getNome());
		 filme.setCategoria(form.getCategoria());
		 filme.setAno(form.getAno());
		 
		 return repository.save(filme);
	  }

	@Override
	public Filme get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Filme> getAll() {
		// TODO Auto-generated method stub
		
		return repository.findAll();
	}
	
	
	

}
