package br.com.farofino.domain.produto.neo4j;

import br.com.farofino.domain.Categoria;
import br.com.farofino.domain.produto.CaracteristicaProduto;
import br.com.farofino.domain.produto.Produto;
import br.com.farofino.domain.produto.ProdutoRepository;
import java.util.Map;

public class ProdutoNeo4JRepository implements ProdutoRepository {
  @Override
  public String save(Produto produto) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Produto findProduto(Categoria categoria, Map<CaracteristicaProduto, Object> caracteristicas) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
}
