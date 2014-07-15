package br.com.farofino.domain.produto;

import java.io.IOException;
import java.io.Serializable;
import org.codehaus.jackson.map.ObjectMapper;

public class TipoCaracteristica <Type> implements Serializable {
  
  private String id;
  private String nome;
  private Class <Type> type;
  
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

  public Class <Type> getType() {
    return type;
  }

  public void setType(Class <Type> type) {
    this.type = type;
  }
  
  public String marshall(Type object) throws IOException {
    if (object != null) {
      return TipoCaracteristicaMarshallerServiceLocator.getInstance().getMapper().writeValueAsString(object);
    }
    return null;
  }
  
  public Type unmarshall(String value) throws IOException {
    if (value != null) {
      return TipoCaracteristicaMarshallerServiceLocator.getInstance().getMapper().readValue(value, getType());
    }
    return null;
  }
}
