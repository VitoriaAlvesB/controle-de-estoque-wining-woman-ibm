package com.supermercadovilayara.estoque.models;


import java.util.List;
import javax.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role implements GrantedAuthority{

	@Id
	private String nomeRole;

	@ManyToMany(mappedBy = "roles")
    private List<Usuarios> usuario;

	@Override
	public String getAuthority() {
		return this.nomeRole;
	}
	
	
}
