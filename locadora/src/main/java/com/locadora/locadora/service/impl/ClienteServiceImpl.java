package com.locadora.locadora.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locadora.locadora.model.Cliente;
import com.locadora.locadora.model.Filme;
import com.locadora.locadora.model.form.ClienteForm;
import com.locadora.locadora.repository.ClienteRepository;
import com.locadora.locadora.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private ClienteRepository repository;
	
	 @Override
	  public Cliente create(ClienteForm form) {
		 Cliente cliente = new Cliente();
		 cliente.setNome(form.getNome());
		 cliente.setCpf(form.getCpf());
		 cliente.setEndereco(form.getEndereco());
		 cliente.setBairro(form.getBairro());
		 cliente.setDataDeNascimento(form.getDataDeNascimento());
		 
		 return repository.save(cliente);
	  }

	@Override
	public Cliente get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		
		return repository.findAll();
	}
	
	 @Transactional
    public void delete(Cliente cliente) {
		 repository.delete(cliente);
    }

		 
	 public Optional<Cliente> findById(Long id) {
	        return repository.findById(id);
	    }
	
	

}
