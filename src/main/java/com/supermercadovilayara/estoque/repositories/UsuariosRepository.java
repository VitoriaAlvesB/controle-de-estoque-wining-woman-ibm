package com.supermercadovilayara.estoque.repositories;

import java.util.Optional;

import com.supermercadovilayara.estoque.models.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
  public Optional<Usuarios> findByNomeUsuario(String nomeUsuario);
}
