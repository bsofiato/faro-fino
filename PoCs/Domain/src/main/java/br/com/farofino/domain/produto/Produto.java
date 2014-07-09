package br.com.farofino.domain.produto;

import br.com.farofino.domain.Categoria;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Produto implements Serializable {
  @GraphId
  private String id;
  private String nome;
  private Categoria categoria;
  private Map <CaracteristicaProduto, Object> caracteristicas = new HashMap <CaracteristicaProduto, Object> ();

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

  public Map<CaracteristicaProduto, Object> getCaracteristicas() {
    return caracteristicas;
  }

  public void setCaracteristicas(Map<CaracteristicaProduto, Object> caracteristicas) {
    this.caracteristicas = caracteristicas;
  }
}