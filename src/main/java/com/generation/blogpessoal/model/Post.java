package com.generation.blogpessoal.model;

import java.time.LocalDateTime;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Post{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Título é OBRIGATÓRIO!")
	@Size(min = 5, max = 100, message = "O Título deve obter de 5 - 10 caracteres")
	private String titulo;
	
	@NotBlank(message = "O atributo Texto é OBRIGATÓRIO!")
	@Size(min = 10, max = 1000, message = "O Texto deve obter de 10 - 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
}

