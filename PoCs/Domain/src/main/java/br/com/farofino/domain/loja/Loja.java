package br.com.farofino.domain;

import java.io.Serializable;
import java.net.URL;

public class Loja implements Serializable {
  private String id;
  private String nome;
  private URL homepage;

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

  public URL getHomepage() {
    return homepage;
  }

  public void setHomepage(URL homepage) {
    this.homepage = homepage;
  }
  
  
}
