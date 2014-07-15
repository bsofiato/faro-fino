package br.com.farofino.domain.categoria;

import java.io.Serializable;

public class TipoCaracteristica <Type> implements Serializable {
  
  private String nome;
  private Class <Type> type;
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

  public Class <Type> getType() {
    return type;
  }

  public void setType(Class <Type> type) {
    this.type = type;
  }
}
