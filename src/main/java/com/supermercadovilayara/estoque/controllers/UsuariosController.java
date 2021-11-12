package com.supermercadovilayara.estoque.controllers;
import java.util.List;
import java.util.Optional;

import com.supermercadovilayara.estoque.models.Usuarios;
import com.supermercadovilayara.estoque.repositories.UsuariosRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController()

@RequestMapping(value = "/estoque")
public class UsuariosController{
	UsuariosRepository usuariosRepository;
	private final PasswordEncoder encoder;

	public void UsuarioController(UsuariosRepository usuariosrepository, PasswordEncoder encoder) {
			this.usuariosRepository = usuariosrepository;
			this.encoder = encoder;
	}

	@PostMapping("/cadastrar/usuario")
	public ResponseEntity<Usuarios> salvarUsuarios(@RequestBody Usuarios usuario) {
		usuario.setPassword(encoder.encode(usuario.getPassword()));
  	return ResponseEntity.ok(usuariosRepository.save(usuario));
	}
	@GetMapping("/usuarios") 
	public ResponseEntity<List<Usuarios>> ListaTodosUsuarios() {
		return ResponseEntity.ok(usuariosRepository.findAll());

	}

	@PutMapping("/usuarios/{id}")
	public Usuarios atualizaUsuario(@RequestBody Usuarios usuario) {
		return usuariosRepository.save(usuario);
	 
	}
	@DeleteMapping("/usuario")
	public void deletaUsuario(@RequestBody Usuarios usuario) {
		usuariosRepository.delete(usuario);
	}
	@GetMapping("/validarSenha")
	public ResponseEntity<Boolean> validarSenha(@RequestParam String nomeUsuario,
																							@RequestParam String senha) {

			Optional<Usuarios> optUsuario = usuariosRepository.findByNomeUsuario(nomeUsuario);
			if (optUsuario.isEmpty()) {
					return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
			}

			Usuarios usuario = optUsuario.get();
			boolean valid = encoder.matches(password, usuario.getPassword());

			HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
			return ResponseEntity.status(status).body(valid);

	}

}
