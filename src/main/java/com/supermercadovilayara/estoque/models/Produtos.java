package com.supermercadovilayara.estoque.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Produtos")
public class Produtos{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(unique = true)
	private String nome;
	private String categoria;
	private String descricao ;
	private Integer quantidade;
	private float preco_unitario;

	
}
