package br.com.farofino.domain.produto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

public class TipoCaracteristica implements Serializable {
  private String id;

  private String nome;
  
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
}
