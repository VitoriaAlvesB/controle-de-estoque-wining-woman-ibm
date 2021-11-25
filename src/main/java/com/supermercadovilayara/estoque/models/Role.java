package com.supermercadovilayara.estoque.models;
//import java.util.List;
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

	/*@ManyToMany(mappedBy = "roles")
    private List<Usuarios> usuario;

	
	public List<Usuarios> getUsuarios() {
		return usuario;
	}
	
	public void setUsuarios(List<Usuarios> usuario) {
		this.usuario = usuario;
	}*/

	@Override
	public String getAuthority() {
		return this.nomeRole;
	}
	
	
}
/**POST PASSANDO O ATRIBUTTO ROLE E FAZER A LIGAÇÃO PARA UM NOVO REPOSITORIO(USUARIOS_ROLES) 
 * PRIMEIRO SALVAR NA BASE O USUARIO 
 * E PEGAR O ID DO USER SALVO (SAVE RETORNA)
 * PEGAR O CAMPO ROLE QUE VAI SER ENVIADO PELO FRONT 
 * E PAGR O ID QUE FOI SALVO NA BASE 
 * CADASTRAR ESSSAS INFOS NA USUARIOS_ROLES
*/