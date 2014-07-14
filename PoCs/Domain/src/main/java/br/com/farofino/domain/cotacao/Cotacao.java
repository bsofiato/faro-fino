package br.com.farofino.domain.cotacao;

import br.com.farofino.domain.loja.Loja;
import br.com.farofino.domain.produto.Produto;
import org.joda.time.DateTime;
import org.joda.money.Money;

public class Cotacao {
  private String id;
  private Loja loja;
  private Produto produto;
  private DateTime timestamp;
  private Money valor;

  public String getID() {
    return id;
  }

  public void setID(String id) {
    this.id = id;
  }

  public Loja getLoja() {
    return loja;
  }

  public void setLoja(Loja loja) {
    this.loja = loja;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public Money getValor() {
    return valor;
  }

  public void setValor(Money valor) {
    this.valor = valor;
  }

  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    
    this.timestamp = timestamp;
  }
}
