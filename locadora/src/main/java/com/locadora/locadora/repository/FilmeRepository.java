package com.locadora.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locadora.locadora.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
