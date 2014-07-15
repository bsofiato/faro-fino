package br.com.farofino.domain.produto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

public interface ProdutoRepository extends CrudRepository<Produto, String>, ProdutoRepositoryCustom {
}
