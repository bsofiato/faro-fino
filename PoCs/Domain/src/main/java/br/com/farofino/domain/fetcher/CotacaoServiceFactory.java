package br.com.farofino.domain.fetcher;

import br.com.farofino.domain.categoria.Categoria;

public interface CotacaoServiceFactory {
  CotacaoService create(Categoria categoria);
}
