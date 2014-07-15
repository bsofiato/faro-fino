package br.com.farofino.domain.produto;

import br.com.farofino.domain.categoria.Categoria;
import br.com.farofino.domain.categoria.TipoCaracteristica;
import java.io.Serializable;
import java.util.Map;

public interface ProdutoRepositoryCustom {
  Produto findProduto(Categoria categoria, Map <TipoCaracteristica, Serializable> caracteristicas);
}
