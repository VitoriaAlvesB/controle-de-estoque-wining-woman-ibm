package com.supermercadovilayara.estoque.controllers;
import java.util.List;

import com.supermercadovilayara.estoque.models.Usuarios;
import com.supermercadovilayara.estoque.repositories.UsuariosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()

@RequestMapping(value = "/estoque")
public class UsuariosController {
	@Autowired

	UsuariosRepository usuariosRepository;

	@PostMapping("/cadastrar/usuario")
	public void salvarUsuarios(@RequestBody Usuarios usuario) {
  	usuariosRepository.save(usuario);
	}
	@GetMapping("/usuarios") 
	public List<Usuarios> ListaTodosUsuarios() {
		return usuariosRepository.findAll();

	}
	@PutMapping("/usuarios/{id}")
	public Usuarios atualizaUsuario(@RequestBody Usuarios usuario) {
		return usuariosRepository.save(usuario);
	 
	}
	@DeleteMapping("/usuario")
	public void deletaProduto(@RequestBody Usuarios usuario) {
		usuariosRepository.delete(usuario);
	}
}
