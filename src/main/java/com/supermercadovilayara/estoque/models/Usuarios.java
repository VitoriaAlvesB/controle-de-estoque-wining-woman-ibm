package com.supermercadovilayara.estoque.models;

import java.util.*;
import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Usuarios")
public class Usuarios implements UserDetails {

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
		
	@ManyToMany
	@JoinTable( 
	   name = "usuarios_roles", 
	   joinColumns = @JoinColumn(
	   name = "usuario_id", referencedColumnName = "id"), 
	   inverseJoinColumns = @JoinColumn(
	   name = "role_id", referencedColumnName = "nomeRole")) 
    private List<Role> roles;

	/*public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}*/

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

	public boolean isEmpty() {
		return true;
	}

  public Usuarios get() {
    return null;
  }

}
/** insert into usuarios_roles(usuario_id, role_id)
 * esse comando adiciona os conteudos na tabela roles
*/
