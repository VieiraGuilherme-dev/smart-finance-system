package com.guilherme.inventario.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("produtos")
public class Produto {

    @Id
    private String id;
    private String nome;
    private String codigo;
    private String categoria;
    private int quantidadeAtual;
    private double preco;
    private String fornecedor;

    public Produto() {
    }

    public Produto(String nome, String codigo, String categoria, int quantidadeAtual, double preco, String fornecedor) {
        this.nome = nome;
        this.codigo = codigo;
        this.categoria = categoria;
        this.quantidadeAtual = quantidadeAtual;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
