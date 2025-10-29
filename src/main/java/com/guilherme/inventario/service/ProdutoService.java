package com.guilherme.inventario.service;

import com.guilherme.inventario.model.Produto;
import com.guilherme.inventario.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Produto> buscarPorId(String id) {
        return repository.findById(id);
    }

    public Produto buscarPorCodigo(String codigo) {
        return repository.findByCodigo(codigo);
    }

    public List<Produto> buscarPorCategoria(String categoria) {
        return repository.findByCategoria(categoria);
    }

    public void deletar(String id) {
        repository.deleteById(id);
    }
}
