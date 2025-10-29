package repository;

import model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface ProdutoRepository extends MongoRepository<Produto, String> {

    List<Produto> findByCategoria(String categoria);
    Produto findByCodigo(String codigo);
}
