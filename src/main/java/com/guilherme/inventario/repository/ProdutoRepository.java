package com.guilherme.inventario.repository;

import com.guilherme.inventario.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
    Produto findByCodigo(String codigo);
    List<Produto> findByCategoria(String categoria);
}