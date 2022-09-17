package com.locadora.locadora.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_alocacao")
public class Alocacao {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  
  private LocalDateTime dataAlocacao = LocalDateTime.now();

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "cliente_id")
  private Cliente cliente;
  
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "filme_id")
  private Filme filme;
  
}