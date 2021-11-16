package com.supermercadovilayara.estoque.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Usuarios")
public class Usuarios{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(unique = true)
	@NotBlank(message = "{nomeusuario.not.blank}")
	@Size(min = 5)
	private String nomeUsuario;

	@NotBlank(message = "{senha.not.blank}")
	@Size(min = 5)
	private String senha;

	@NotBlank(message = "{email.not.blank}")
	@Email(message = "{email.not.valid}")
	private String email ;

	@NotBlank(message = "{dataadicionado.not.blank}")
	private String dataAdicionado;

	@NotBlank(message = "{nome.not.blank}")
	private String nome;

	@NotBlank(message = "{sobrenome.not.blank}")
	private String sobrenome;

	@NotBlank(message = "{nomeusuario.not.blank}")
	@Size(min = 5)
	private String funcao;


	
}
