package br.com.farofino.domain.produto;

import br.com.farofino.domain.categoria.TipoCaracteristica;
import br.com.farofino.domain.categoria.Categoria;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;



public class Produto implements Serializable {
  private String id;
  
  private String nome;
  
  private String descricao;
  
  private Categoria categoria;
  

  private Map <TipoCaracteristica, Serializable> caracteristicas = new HashMap <TipoCaracteristica, Serializable> ();

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
  
  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }

  public Map<TipoCaracteristica, Serializable> getCaracteristicas() {
    return caracteristicas;
  }

  public void setCaracteristicas(Map<TipoCaracteristica, Serializable> caracteristicas) {
    this.caracteristicas = caracteristicas;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}