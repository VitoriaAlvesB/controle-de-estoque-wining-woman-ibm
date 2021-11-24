package com.supermercadovilayara.estoque.controllers;
import java.util.List;

import javax.validation.Valid;

import com.supermercadovilayara.estoque.models.Produtos;
import com.supermercadovilayara.estoque.repositories.ProdutosRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping(value = "/estoque")
public class ProdutosController{

	private final	ProdutosRepository produtosRepository;

	public ProdutosController(ProdutosRepository produtosRepository) {
		this.produtosRepository = produtosRepository;
	}


	@PostMapping("/cadastrar/produtos")
	public ResponseEntity<Produtos> salvarProdutos(@RequestBody  @Valid Produtos produto) {
  	 return ResponseEntity.ok(produtosRepository.save(produto));
	}
	@GetMapping("/produtos") 
	public ResponseEntity<List<Produtos>> ListarTodosProdutos() {
		return ResponseEntity.ok(produtosRepository.findAll());

	}
	@PutMapping("/produtos/{id}")
	public ResponseEntity<Produtos> atualizarProduto(@RequestBody @Valid Produtos produto){
		return ResponseEntity.ok(produtosRepository.save(produto));
	 
	}
	@DeleteMapping("/produto")
	public void deletaProduto(@RequestBody Produtos produto){
		produtosRepository.delete(produto);
	}
}
