package br.com.farofino.domain.produto;

import java.io.Serializable;

public class TipoCaracteristica implements Serializable {
  private String id;
  private String nome;
  private Class type;
  
  private boolean defining;

  public String getID() {
    return id;
  }

  public void setID(String id) {
    this.id = id;
  }
  
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

  public Class getType() {
    return type;
  }

  public void setType(Class type) {
    this.type = type;
  }
}
