package com.api.estoque.repositores;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.estoque.models.EstoqueModel;

@Repository
public interface EstoqueRepository extends JpaRepository<EstoqueModel, UUID>{
	boolean existsByEmail(String email);
}
