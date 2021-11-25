package com.supermercadovilayara.estoque.controllers;

import java.util.List;

import javax.validation.Valid;

import com.supermercadovilayara.estoque.models.Usuarios;
import com.supermercadovilayara.estoque.repositories.UsuariosRepository;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.web.bind.annotation.*;


@RestController()

@RequestMapping(value = "/usuarios")
public class UsuariosController{

	private final UsuariosRepository usuariosRepository;
	private final PasswordEncoder encoder;

	public UsuariosController(UsuariosRepository usuariosRepository, PasswordEncoder encoder) {
		this.usuariosRepository = usuariosRepository;
		this.encoder = encoder;
	}

	@GetMapping("/Listar/usuarios")
	public ResponseEntity<List<Usuarios>> listarTodosUsuarios(){
	 List<Usuarios> users = usuariosRepository.findAll();
		return ResponseEntity.ok(users);
	}

	@PostMapping("/cadastrar/usuario")
	public ResponseEntity<Usuarios> salvarUsuarios(@RequestBody @Valid Usuarios usuario) {
		usuario.setSenha(encoder.encode(usuario.getSenha()));
  	return ResponseEntity.ok(usuariosRepository.save(usuario));
	}
	
	@GetMapping("/login")
	public ResponseEntity<Boolean> validarSenha(@RequestParam String nomeUsuario,
																							@RequestParam String senha) {

	 Usuarios optUsuario = usuariosRepository.findByNomeUsuario(nomeUsuario);
	 if (optUsuario == null) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
	 }
	 boolean valid = encoder.matches(senha, optUsuario.getPassword());

	 HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
	 return ResponseEntity.status(status).body(valid);

	}	

	@PutMapping("/usuarios/{id}")
	public ResponseEntity<Usuarios> atualizaUsuario(@RequestBody @Valid Usuarios usuario) {
		return ResponseEntity.ok(usuariosRepository.save(usuario));
	 
	}
	@DeleteMapping("/usuario")
	public void deletaUsuario(@RequestBody Usuarios usuario) {
		usuariosRepository.delete(usuario);
	}

}
