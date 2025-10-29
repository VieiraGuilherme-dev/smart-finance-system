package com.guilherme.inventario.repository;

import com.guilherme.inventario.model.Fornecedor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FornecedorRepository extends MongoRepository<Fornecedor, String> {
    Fornecedor findByNome(String nome);
}
