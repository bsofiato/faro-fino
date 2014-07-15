package br.com.farofino.domain.categoria;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Categoria implements Serializable {
  private String id;

  private String nome;

  private Categoria parent;
  
  private Set <Categoria> children = new HashSet <Categoria> ();
  
  private Set <TipoCaracteristica> caracteristicas = new HashSet <TipoCaracteristica> ();
  
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

  public Categoria getParent() {
    return parent;
  }

  public void setParent(Categoria parent) {
    this.parent = parent;
  }

  public Set<Categoria> getChildren() {
    return children;
  }

  public void setChildren(Set<Categoria> children) {
    this.children = children;
  }

  public Set<TipoCaracteristica> getCaracteristicas() {
    return caracteristicas;
  }

  public void setCaracteristicas(Set<TipoCaracteristica> caracteristicas) {
    if (caracteristicas == null) {
      getCaracteristicas().clear();
    } else {
      this.caracteristicas = caracteristicas;
    }
  }
  
  public Categoria createChild() {
    Categoria categoria = new Categoria();
    categoria.setParent(this);
    getChildren().add(categoria);
    return categoria;
  }
  
  /*public Set <CaracteristicaProduto> getInhreritedCaracteristicas() {
    Set <CaracteristicaProduto> caracteristicas = new HashSet <CaracteristicaProduto> (getCaracteristicas());
    if (getParent() != null) {
      caracteristicas.addAll(getParent().getInhreritedCaracteristicas());
    }
    return caracteristicas;
  }
  
  public Set <CaracteristicaProduto> getDefiningCaracteristicas() {
    Set <CaracteristicaProduto> inheritedCaracteristicas = getInhreritedCaracteristicas();
    inheritedCaracteristicas.removeIf(caracteristica -> !caracteristica.isDefining());
    return inheritedCaracteristicas;
  }*/
}
