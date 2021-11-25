package com.supermercadovilayara.estoque.repositories;

import com.supermercadovilayara.estoque.models.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository <Usuarios, Integer>{
  Usuarios findByNomeUsuario(String nomeUsuario);
}
