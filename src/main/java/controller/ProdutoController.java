package controller;

import model.Produto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import service.ProdutoService;

import java.util.List;

public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    public Produto criarProduto(Produto produto) {
        return service.salvar(produto);
    }

    public List<Produto> listarProdutos() {
        return service.listarTodos();
    }

    public Produto buscarProduto(@PathVariable String id) {
        return service.buscarPorId(id).orElse(null);
    }

    public Produto buscarPorCodigo(@PathVariable String codigo) {
        return service.buscarPorCodigo(codigo);
    }

    public List<Produto> buscarPorCategoria(@PathVariable String categoria) {
        return service.buscarPorCategoria(categoria);
    }

    public Produto atualizarProduto(@PathVariable String id, @RequestBody Produto produto) {
        produto.setId(id);
        return service.salvar(produto);
    }

    public void deletarProduto(@PathVariable String id) {
        service.deletar(id);
    }
}
