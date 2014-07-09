package br.com.farofino.domain;

import br.com.farofino.domain.produto.CaracteristicaProduto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Categoria implements Serializable {
  private Categoria parent;
  private String nome;
  private List <Categoria> children = new ArrayList <Categoria> ();
  private Set <CaracteristicaProduto> caracteristicas = new HashSet <CaracteristicaProduto> ();

  public Categoria getParent() {
    return parent;
  }

  public void setParent(Categoria parent) {
    this.parent = parent;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Categoria> getChildren() {
    return children;
  }

  public void setChildren(List<Categoria> children) {
    this.children = children;
  }

  public Set<CaracteristicaProduto> getCaracteristicas() {
    return caracteristicas;
  }

  public void setCaracteristicas(Set<CaracteristicaProduto> caracteristicas) {
    if (caracteristicas == null) {
      getCaracteristicas().clear();
    } else {
      this.caracteristicas = caracteristicas;
    }
  }
  
  public Set <CaracteristicaProduto> getInhreritedCaracteristicas() {
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
  }
}
