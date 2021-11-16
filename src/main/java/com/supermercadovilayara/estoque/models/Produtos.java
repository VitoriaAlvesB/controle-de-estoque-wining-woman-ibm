package com.supermercadovilayara.estoque.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Produtos")
public class Produtos{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(unique = true)
	@NotBlank
	@NotNull
	private String nome;

	@NotBlank
	@NotNull
	private String categoria;

	@NotBlank
	@NotNull
	private String descricao ;


	private Integer quantidade;


	private float preco_unitario;

	
}
