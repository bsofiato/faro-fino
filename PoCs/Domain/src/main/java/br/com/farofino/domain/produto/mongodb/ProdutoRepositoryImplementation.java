package br.com.farofino.domain.produto.mongodb;

import br.com.farofino.domain.categoria.Categoria;
import br.com.farofino.domain.categoria.TipoCaracteristica;
import br.com.farofino.domain.produto.Produto;
import br.com.farofino.domain.produto.ProdutoRepositoryCustom;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import static org.springframework.data.mongodb.core.query.Query.*;

public class ProdutoRepositoryImplementation implements ProdutoRepositoryCustom {
  private final MongoTemplate template;

  private MongoTemplate getTemplate() {
    return template;
  }
  
  public ProdutoRepositoryImplementation(MongoTemplate template) {
    this.template = template;
  }

  @Override
  public Produto findProduto(Categoria categoria, Map<TipoCaracteristica, Serializable> caracteristicas) {
    Criteria c = Criteria.where("categoria").is(categoria.getID());
    caracteristicas.forEach((k, v) -> c.and("caracteristicas." + k.getNome()).is(v));
    return getTemplate().findOne(query(c), Produto.class);
  }
}
