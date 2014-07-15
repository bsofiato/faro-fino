package br.com.farofino.domain.fetcher;

import br.com.farofino.domain.cotacao.Cotacao;
import java.util.Set;
import java.util.concurrent.Future;


public interface CotacaoService {
  Future <Set <Cotacao>> cotar();
}
