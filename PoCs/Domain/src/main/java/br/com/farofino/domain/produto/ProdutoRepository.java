package br.com.farofino.domain.produto;

import br.com.farofino.domain.Categoria;
import java.util.Map;

public interface ProdutoRepository {
  String save(Produto produto);
  Produto findProduto(Categoria categoria, Map <CaracteristicaProduto, Object> caracteristicas);
}
