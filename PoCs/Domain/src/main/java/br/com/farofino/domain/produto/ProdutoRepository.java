package br.com.farofino.domain.produto;

import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, String>, ProdutoRepositoryCustom {
}
