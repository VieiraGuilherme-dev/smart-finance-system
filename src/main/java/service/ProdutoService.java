package service;

import model.Produto;
import repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

public class ProdutoService {
    private final ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo) {
        this.repo = repo;
    }

    public Produto salvar(Produto produto) {
        return repo.save(produto);
    }

    public List<Produto> listarTodos() {
        return repo.findAll();
    }

    public Optional<Produto> buscarPorId(String id) {
        return repo.findById(id);
    }

    public Produto buscarPorCodigo(String codigo) {
        return repo.findByCodigo(codigo);
    }

    public List<Produto> buscarPorCategoria(String categoria) {
        return repo.findByCategoria(categoria);
    }

    public void deletar(String id) {
        repo.deleteById(id);
    }
}

