package com.supermercadovilayara.estoque.repositories;

import java.util.Optional;

import com.supermercadovilayara.estoque.models.Produtos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer>{
  public Optional<Produtos> findByNome(String nome);
}