package com.guilherme.inventario.controller;

import com.guilherme.inventario.model.Produto;
import com.guilherme.inventario.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

    @GetMapping
    public List<Produto> listarProdutos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Produto buscarProduto(@PathVariable String id) {
        return service.buscarPorId(id).orElse(null);
    }

    @GetMapping("/codigo/{codigo}")
    public Produto buscarPorCodigo(@PathVariable String codigo) {
        return service.buscarPorCodigo(codigo);
    }

    @GetMapping("/categoria/{categoria}")
    public List<Produto> buscarPorCategoria(@PathVariable String categoria) {
        return service.buscarPorCategoria(categoria);
    }

    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable String id, @RequestBody Produto produto) {
        produto.setId(id);
        return service.salvar(produto);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable String id) {
        service.deletar(id);
    }
}
