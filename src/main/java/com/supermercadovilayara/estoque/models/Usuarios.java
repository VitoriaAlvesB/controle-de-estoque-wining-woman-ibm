package com.supermercadovilayara.estoque.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Usuario")
public class Usuarios{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(unique = true)
	private String nomeUsuario;
	private String senha;
	private String email ;
	private String dataAdicionado;
	private String nome;
	private String sobrenome;
	private String funcao;


	
}
