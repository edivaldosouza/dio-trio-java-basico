package com.api.estoque.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.estoque.models.EstoqueModel;
import com.api.estoque.repositores.EstoqueRepository;

@Service
public class EstoqueService {
	
	final EstoqueRepository estoqueRepository;
	
	public EstoqueService(EstoqueRepository estoqueRepository) {
		
		this.estoqueRepository = estoqueRepository;
	}

	@Transactional
	public Object save(EstoqueModel estoqueModel) {
		// TODO Auto-generated method stub
		
		return estoqueRepository.save(estoqueModel);
	}

	public boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return estoqueRepository.existsByEmail(email);
	}

	public List<EstoqueModel> findAll() {
		// TODO Auto-generated method stub
		return estoqueRepository.findAll();
	}

	public Optional<EstoqueModel> findById(UUID id) {
		// TODO Auto-generated method stub
		return estoqueRepository.findById(id);
	}

	@Transactional
	public void delete(EstoqueModel estoqueModel) {
		estoqueRepository.delete(estoqueModel);
	}
	
	
}
