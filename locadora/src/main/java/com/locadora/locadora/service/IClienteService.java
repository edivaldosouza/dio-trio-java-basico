package com.locadora.locadora.service;


import com.locadora.locadora.model.Cliente;
import com.locadora.locadora.model.form.ClienteForm;
import com.locadora.locadora.model.form.ClienteUpdateForm;

import java.time.LocalDate;
import java.util.List;

public interface IClienteService {

	List<Cliente> getAll();

	Cliente get(Long id);

	Cliente create(ClienteForm form);



}
