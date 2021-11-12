package com.supermercadovilayara.estoque.repositories;

import com.supermercadovilayara.estoque.models.Produtos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

}