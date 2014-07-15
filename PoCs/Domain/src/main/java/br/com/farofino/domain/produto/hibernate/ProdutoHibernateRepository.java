package br.com.farofino.domain.produto.hibernate;

import br.com.farofino.domain.categoria.Categoria;
import br.com.farofino.domain.categoria.TipoCaracteristica;
import br.com.farofino.domain.produto.Produto;
import br.com.farofino.domain.produto.ProdutoRepository;
import org.springframework.orm.hibernate4.HibernateTemplate;
import java.util.Map;

public class ProdutoHibernateRepository implements ProdutoRepository {
  private final HibernateTemplate template;

  private HibernateTemplate getTemplate() {
    return template;
  }
  
  public ProdutoHibernateRepository(HibernateTemplate template) {
    this.template = template;
  }
  
  @Override
  public String save(Produto produto) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Produto findProduto(Categoria categoria, Map<TipoCaracteristica, Object> caracteristicas) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}
