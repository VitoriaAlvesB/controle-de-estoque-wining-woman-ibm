package com.supermercadovilayara.estoque.controllers;
import java.util.List;

import com.supermercadovilayara.estoque.models.Produtos;
import com.supermercadovilayara.estoque.repositories.ProdutosRepository;

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
public class ProdutosController {
	@Autowired

	ProdutosRepository produtosRepository;

	@PostMapping("/produtos")
	public void salvarProdutos(@RequestBody Produtos produto) {
  	produtosRepository.save(produto);
	}
	@GetMapping("/produtos") 
	public List<Produtos> ListaTodosProdutos() {
		return produtosRepository.findAll();

	}
	@PutMapping("/produtos/{id}")
	public Produtos atualizaProduto(@RequestBody Produtos produto) {
		return produtosRepository.save(produto);
	 
	}
	@DeleteMapping("/produto")
	public void deletaProduto(@RequestBody Produtos produto) {
		produtosRepository.delete(produto);
	}
}
