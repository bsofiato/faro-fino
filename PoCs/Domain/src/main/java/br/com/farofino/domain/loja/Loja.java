package br.com.farofino.domain.loja;

import br.com.farofino.domain.categoria.Categoria;
import br.com.farofino.domain.fetcher.CotacaoServiceFactory;
import java.io.Serializable;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class Loja implements Serializable {
  private String id;
  private String nome;
  private URL homepage;
  
  private Set <Categoria> categorias = new HashSet <Categoria> ();
  private CotacaoServiceFactory cotacaoServiceFactory;

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

  public Set<Categoria> getCategorias() {
    return categorias;
  }

  public void setCategorias(Set<Categoria> categorias) {
    if (categorias == null) {
      getCategorias().clear();
    } else {
      this.categorias = categorias;
    }
  }

  public CotacaoServiceFactory getCotacaoServiceFactory() {
    return cotacaoServiceFactory;
  }

  public void setCotacaoServiceFactory(CotacaoServiceFactory cotacaoServiceFactory) {
    this.cotacaoServiceFactory = cotacaoServiceFactory;
  }
}
