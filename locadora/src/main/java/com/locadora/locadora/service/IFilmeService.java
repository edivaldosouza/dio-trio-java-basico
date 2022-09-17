package com.locadora.locadora.service;


import com.locadora.locadora.model.Filme;
import com.locadora.locadora.model.form.FilmeForm;
import com.locadora.locadora.model.form.ClienteUpdateForm;

import java.time.LocalDate;
import java.util.List;

public interface IFilmeService {

	List<Filme> getAll();

	Filme get(Long id);

	Filme create(FilmeForm form);



}
