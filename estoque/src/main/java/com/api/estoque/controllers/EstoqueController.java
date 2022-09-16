package com.api.estoque.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.estoque.dtos.EstoqueDto;
import com.api.estoque.models.EstoqueModel;
import com.api.estoque.services.EstoqueService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class EstoqueController {
	
	final EstoqueService estoqueService;
	public EstoqueController(EstoqueService estoqueService){
		this.estoqueService = estoqueService;
	}
	
	@PostMapping
	public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid EstoqueDto estoqueDto){
		
		if(estoqueService.existsByEmail(estoqueDto.getEmail())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Erro: Email já cadastrado!");
        }

        
		var estoqueModel = new EstoqueModel();
		BeanUtils.copyProperties(estoqueDto, estoqueModel);
		estoqueModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
		return ResponseEntity.status(HttpStatus.CREATED).body(estoqueService.save(estoqueModel));
		
	}
	
	
	@GetMapping
	public ResponseEntity<List<EstoqueModel>> getAllEstoque(){
		
		return ResponseEntity.status(HttpStatus.OK).body(estoqueService.findAll());
	}
	
	 @GetMapping("/{id}")
	    public ResponseEntity<Object> getOneEstoque(@PathVariable(value = "id") UUID id){
		 
	        Optional<EstoqueModel> estoqueModelOptional = estoqueService.findById(id);
	        if (!estoqueModelOptional.isPresent()) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Este usuario não existe.");
	        }
	        return ResponseEntity.status(HttpStatus.OK).body(estoqueModelOptional.get());
	    }
	
	 @DeleteMapping("/{id}")
	    public ResponseEntity<Object>deleteEstoque(@PathVariable(value = "id") UUID id){
		 
	        Optional<EstoqueModel> estoqueModelOptional = estoqueService.findById(id);
	        if (!estoqueModelOptional.isPresent()) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Este usuario não existe.");
	        }
	        estoqueService.delete(estoqueModelOptional.get());
	        return ResponseEntity.status(HttpStatus.OK).body("Usuario deletado com sucesso!");
	    }
	 
	 @PutMapping("/{id}")
	    public ResponseEntity<Object> updateEstoque(@PathVariable(value = "id") UUID id,
	                                                    @RequestBody @Valid EstoqueDto estoqueDto){
	        Optional<EstoqueModel>estoqueModelOptional = estoqueService.findById(id);
	        if (!estoqueModelOptional.isPresent()) {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado!");
	        }
	        var estoquetModel = new EstoqueModel();
	        BeanUtils.copyProperties(estoqueDto, estoquetModel);
	        estoquetModel.setId(estoqueModelOptional.get().getId());
	        estoquetModel.setRegistrationDate(estoqueModelOptional.get().getRegistrationDate());
	        return ResponseEntity.status(HttpStatus.OK).body(estoqueService.save(estoquetModel));
	    }
}
