package br.com.farofino.domain.produto;

import java.io.Serializable;

public class CaracteristicaProduto implements Serializable {
  private String nome;
  private boolean defining;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public boolean isDefining() {
    return defining;
  }

  public void setDefining(boolean defining) {
    this.defining = defining;
  }
}
