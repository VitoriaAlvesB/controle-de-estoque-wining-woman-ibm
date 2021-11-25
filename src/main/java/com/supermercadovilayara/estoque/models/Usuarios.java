package com.supermercadovilayara.estoque.models;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Usuarios")
public class Usuarios implements UserDetails{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true)
	@NotBlank
	private String nomeUsuario;

	@NotBlank(message = "senha.not.blank")
	@Size(min = 5)
	private String senha;

	@NotBlank(message = "email.not.blank")
	@Email(message = "email.not.valid")
	private String email;

	@NotBlank(message = "dataadicionado.not.blank")
	private String dataAdicionado;

	@NotBlank(message = "nome.not.blank")
	private String nome;

	@NotBlank(message = "sobrenome.not.blank")
	private String sobrenome;

	//@NotBlank
	//private String role;
		
	@ManyToMany(cascade=CascadeType.MERGE)
	@JoinTable( 
	   name = "usuarios_roles", 
	   joinColumns = @JoinColumn(
	   name = "usuario_id", referencedColumnName = "id"), 
	   inverseJoinColumns = @JoinColumn(
	   name = "role_id", referencedColumnName = "nomeRole")) 
		 private List<Role> roles;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return (Collection<? extends GrantedAuthority>) this.roles;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getPassword() {
		return this.senha;
	}	
	@Override
	public String getUsername() {
		return this.nomeUsuario;
	}

}
/** insert into usuarios_roles(usuario_id, role_id)
 * esse comando adiciona os conteudos na tabela roles
*/
